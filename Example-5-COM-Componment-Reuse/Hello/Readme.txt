Readme

Copyright (C) 2021 by Dr. Shiping Chen. 
=======================================

Description
-----------

This is a simple example used in Dr. Shiping Chen book <<Software Reuse>> to demo Microsoft componment technology (i.e. COM).


Prerequisites
-------------
   • Microsoft Windows OS
   • Microsoft Visual Studio 2017 or up
   • Admininatrator account with your computer


Steps
-----
   0. (Optional) to rebuild the COM+ server with your IDE
   1. Reset/customize setenv.bat with your machine settings
   2. Open an adminatrator command Prompt from the Start memnu
   3. To deploy the COM+ componenent with the following command:
         gacutil /nologo /i bin\debug\HelloCS.dll
         regsvcs /nologo bin\debug\HelloCS.dll
      (if you cannot, get an adminatrator right with 'MakeMeAdmi' tool and retry)
   4. (Optional) to rebuild the client either with IDE or mk_clinet.bat
   5. To test the COM+ componment: Tester

If everything go well, you can see the following with a small popup window saying "Hello COM+"
---------------------------------------------------------------------------------------------

C:\Test\MyBook\Example-5-COM-Componment-Reuse\Hello\Client>Tester

name = COM+

To create an instance of HelloImp

To call obj.HelloWorld() with arg = COM+
the reply = Hello COM+ !

To create an instance of IHello

To call obj.HelloWorld() with arg = COM+
the reply = Hello COM+ !




