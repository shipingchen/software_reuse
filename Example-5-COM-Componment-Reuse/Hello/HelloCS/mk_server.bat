echo off

rem
rem  
rem

rem
rem To remove/register the assembly/component with GAC - Global Assembly Cache
rem
rem gacutil /nologo /u bin\debug\HelloCS.dll
gacutil /nologo /i bin\debug\HelloCS.dll

rem
rem To remove/register the assembly/component to COM+ Application service: MyApp
rem
rem regsvcs /nologo /u bin\debug\HelloCS.dll
regsvcs /nologo    bin\debug\HelloCS.dll