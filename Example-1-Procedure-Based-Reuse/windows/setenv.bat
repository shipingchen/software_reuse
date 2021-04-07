@echo off
rem 
rem C/C++
rem
set MVC_HOME="C:\Program Files (x86)\Microsoft Visual Studio\2017\Professional"
set MVC_INCLUDE1=%MVC_HOME%\SDK\ScopeCppSDK\VC\include
set MVC_INCLUDE2="C:\Program Files (x86)\Windows Kits\10\Include\10.0.17763.0\ucrt"
set PATH=%PATH%;%MVC_HOME%\SDK\ScopeCppSDK\VC\bin

rem ----------------------
rem current
rem
set WORK_HOME=C:\Test\MyBook\Example-1-Procedure-Based-Reuse\windows
set PATH=%PATH%;%WORK_HOME%\bin