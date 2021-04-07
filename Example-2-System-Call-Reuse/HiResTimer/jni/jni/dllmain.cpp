// dllmain.cpp : Defines the entry point for the DLL application.
#include "pch.h"

BOOL APIENTRY DllMain( HMODULE hModule,
                       DWORD  ul_reason_for_call,
                       LPVOID lpReserved
                     )
{
    switch (ul_reason_for_call)
    {
    case DLL_PROCESS_ATTACH:
    case DLL_THREAD_ATTACH:
    case DLL_THREAD_DETACH:
    case DLL_PROCESS_DETACH:
        break;
    }
    return TRUE;
}

#include "com_shiping_util_HiResTimer.h"

// ----------------------------
// HiResCounter
// ----------------------------
class _HiResCounter {
public:
	_HiResCounter()
	{
		m_bExists = QueryPerformanceFrequency(
			&m_Freq);
	}

	BOOL Exists()
	{
		return m_bExists;
	}

	double Freq()
	{
		return (double)(m_Freq.QuadPart);
	}

protected:
	BOOL m_bExists;
	LARGE_INTEGER m_Freq;
};

static _HiResCounter HiResCounter;

// -------------------------------------------
// Class:     HiResTimer
// Method:    isHighResTimerAvailable
// Signature: ()Z
// -------------------------------------------
JNIEXPORT jboolean JNICALL
Java_com_shiping_util_HiResTimer_isHighResTimerAvailable
(JNIEnv *, jobject)
{
	return HiResCounter.Exists();
}

// -------------------------------------------
// Class:     HiResTimer
// Method:    getResolution
// Signature: ()Z
// -------------------------------------------
JNIEXPORT jdouble JNICALL
Java_com_shiping_util_HiResTimer_getResolution
(JNIEnv *, jobject)
{
	return 1000000.0 / HiResCounter.Freq();
}


// -------------------------------------------
// Class:     HiResTimer
// Method:    startTiming
// Signature: ()D
// -------------------------------------------
JNIEXPORT jdouble JNICALL Java_com_shiping_util_HiResTimer_startTiming
(JNIEnv *, jobject)
{
	LARGE_INTEGER li;
	if (HiResCounter.Exists()) {
		QueryPerformanceCounter(&li);
		return (double)(li.QuadPart);
	}
	else {
		return (double)GetTickCount();
	} // else

}

// -------------------------------------------
// Class:     HiResTimer
// Method:    endTiming
// Signature: (D)D
// -------------------------------------------
JNIEXPORT jdouble JNICALL Java_com_shiping_util_HiResTimer_endTiming
(JNIEnv *, jobject, jdouble dStart)
{
	LARGE_INTEGER li;
	if (HiResCounter.Exists()) {
		QueryPerformanceCounter(&li);
		return ((li.QuadPart - dStart) * 1000.0 /
			HiResCounter.Freq());
	}
	else {
		return (GetTickCount() - (DWORD)dStart);
	} // else
}
