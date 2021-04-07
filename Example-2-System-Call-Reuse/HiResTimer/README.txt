Readme

Copyright (C) 2021 Dr. Shiping
===============================

Description
-----------
This is a high resolution timer in java by reusing windows system calls via jni.

Prerequisites
-------------
   • Microsoft Windows OS
   • Microsoft Visual Studio 2017 or up
   • Java JDK 1.7.x or up

Steps to run
------------
   1. Reset/customize setenv.bat and cc.bat with your machine settings
   2. To set up running environment: setenv
   3. To comppile the java code by: ant
   4. To generate the jni head file (com_shiping_util_HiResTimer.h) from the java JNI API with: j2c.bat
   5. Copy the generated com_shiping_util_HiResTimer.h to .\jni\jni
   6. To generate jni.dll with the visual stido IDE
   7. To check and ensure that jni.dll in on "java.library.path" in the build.xml
   8. To run by: ant run 

If everything goes well, the program will print out something like:

C:\Test\MyBook\Example-2-System-Call-Reuse\HiResTimer>ant run
................
run:
     [java] To load jni.dll
     [java] high res timer is available
     [java] Its resolution = 0.1 usec/microsecond (10^-6 sec)
     [java] The Granularity of hi-res timer is 15.8 microseconds
     [java] timer test=19.1358 milliseconds (should be around 10)
     [java] timer test=110.2144 milliseconds (should be around 100)
     [java] The Granularity of hi-res timer is 1.3 microseconds
     [java] timer test=11.4485 milliseconds (should be around 10)
     [java] timer test=110.3008 milliseconds (should be around 100)
     [java] The Granularity of hi-res timer is 1.5 microseconds
     [java] timer test=15.427 milliseconds (should be around 10)
     [java] timer test=109.5162 milliseconds (should be around 100)

