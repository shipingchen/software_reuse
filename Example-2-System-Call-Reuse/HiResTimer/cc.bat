@echo off
setlocal

cd tmp


cl /I ../tmp /I %JAVA_HOME%/include /I %JAVA_HOME%/include/win32 /I %VC_INCLUDE0% /I %VC_INCLUDE1% /I %VC_INCLUDE2% /I %VC_INCLUDE3% /I %VC_INCLUDE4% /I %VC_INCLUDE5% /I %VC_INCLUDE5% -MD -LD ..\src\HiResTimer.cpp -Fecom_shiping_util_HiResTimer.dll

cd ..

copy tmp\*.dll bin

endlocal





