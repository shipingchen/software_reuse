README
for Example-3-OO-Based-Reuse in book <<Software Reuse>>
Copyright © 2021 by Dr Shiping Chen
==============================================================

Description
-----------
This is a simple example to show how to reuse code via Object inherence.
The example is programmed in Java.

Prerequisite
----------------
1.	Java 1.7.x or up
2.	(Optional) Apache ant 1.9 or up

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
C:\Test\MyBook\Example-3-OO-Based-Reuse>ant run
Buildfile: C:\Test\MyBook\Example-3-OO-Based-Reuse\build.xml

compile:
     [echo] The classpath for compilation is C:\Test\MyBook\Example-3-OO-Based-Reuse\classes

run:
     [java] To draw a 10x5 rectangle:
     [java] XXXXXXXXXX
     [java] XXXXXXXXXX
     [java] XXXXXXXXXX
     [java] XXXXXXXXXX
     [java] XXXXXXXXXX
     [java] To draw a 5x5 square:
     [java] XXXXX
     [java] XXXXX
     [java] XXXXX
     [java] XXXXX
     [java] XXXXX

BUILD SUCCESSFUL
