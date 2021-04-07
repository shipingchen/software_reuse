README

Copyright © 2021 by Dr Shiping Chen
==============================================================

Description
-----------
This is Example 6 for Dr. Shiping Chen's book "Software Resue".
The example is going to simulate 2 concurrent clients to test something.

Prerequisite
----------------
1.	Java 1.7.x or up
2.	Apache ant 1.9 or up

Steps on Windows
----------------
1.	Set your java and ant in setenv.bat
2.	Open a cmd window
3.	To setup running environment: setenv
4.	(Optional) To clean everything: ant clean
5.	To build/compile: ant (or use: javac)
6.	To run the example: ant run (or use: java)


If everything goes well, the example will print out the following:
--
C:\Test\MyBook\Example-6-iTester-Reuse\iTester\Java>ant run
Buildfile: C:\Test\MyBook\Example-6-iTester-Reuse\iTester\Java\build.xml

run:
     [java] test config fileName = C:\Test\MyBook\Example-6-iTester-Reuse\iTester\Java/prop/helloworld.prop
     [java] Tester.init(C:\Test\MyBook\Example-6-iTester-Reuse\iTester\Java/prop/helloworld.prop) called
     [java] -- listing properties --
     [java] testName=Hello
     [java] testWarmup=5
     [java] testCooldown=5
     [java] testClassName=HelloTester
     [java] testThreadNmuber=2
     [java] testRuntime=10000
     [java] Tester.run() called
     [java] testThreadNmuber = 2
     [java] To instance a test driver
     [java] TestDriver.TestDriver() called
     [java] testName     = Hello
     [java] testClassName= HelloTester
     [java] testRuntime  = 10000 msec
     [java] testWarmup   = 5 %
     [java] testCooldown = 5 %
     [java] Thread-0 started !
     [java] Thread-1 started !
     [java] To instance a test class with name = HelloTester
     [java] To instance a test class with name = HelloTester
     [java] warm-up......
     [java] warm-up......
     [java] Thread-1: Test() called: testTime = 500 isLog = false
     [java] Thread-0: Test() called: testTime = 500 isLog = false
     [java]  Hello Thread-1 to sleep for 8000 ms
     [java]  Hello Thread-0 to sleep for 6000 ms
     [java] Thread-0: Latency = 6013
     [java] testing......