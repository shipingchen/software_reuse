/*
 * @(#) HiResTimer.java 03/04/2021
 *
 * Copyright (c) Dr. Shiping Chen. 
 * All rights reserved.
 * 
 * A high resolution java timer by reusing windows system calls via JNI
 *
 */

package com.shiping.util;


class HiResTimer
{
	public native boolean	isHighResTimerAvailable();
	public native double    getResolution();
   	public native double	startTiming();
   	public native double	endTiming(double dStart );

   	static {
                System.out.println("To load jni.dll");
      		System.loadLibrary("jni");  // No jni.dll, which doesn't work! 
   	}

   	public static void main(String[] args)
      		throws Exception
   	{
      		HiResTimer timer = new HiResTimer();
		// Test timer = new Test();
      		double dStart=0.0, dEnd=0.0;
      
		if( timer.isHighResTimerAvailable() ) {
         		System.out.println("high res timer is available" );
			System.out.println("Its resolution = " + timer.getResolution() + " usec/microsecond (10^-6 sec)");
		} else {
			System.out.println("high res timer is not available" );
			System.exit(1);
  		}
		

		for(int i=0; i<3; i++) {
      			dStart = timer.startTiming();
      			dEnd = timer.endTiming(dStart);
      			System.out.println("The Granularity of hi-res timer is " + (dEnd*1000) + " microseconds");

      			dStart = timer.startTiming();
			Thread.sleep(10);
      			System.out.println( "timer test=" +  timer.endTiming(dStart) + " milliseconds (should be around 10)");

      			dStart = timer.startTiming();
      			Thread.sleep(100);
      			System.out.println( "timer test=" + timer.endTiming(dStart) + " milliseconds (should be around 100)");
		}
      }
}

