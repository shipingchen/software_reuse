@echo off
set CLASSPATH=.
set PATH=.
rem ---------------------
rem .NET
rem
rem set NET_HOME1=C:\WINDOWS\Microsoft.NET\Framework\v2.0.50727
set NET_HOME1=C:\Windows\Microsoft.NET\Framework\v4.0.30319
rem for tibexp.exe
rem set NET_HOME2=C:\Program Files\Microsoft Visual Studio .NET 2003\SDK\v1.1\Bin
set NET_HOME2=C:\Program Files (x86)\Microsoft Visual Studio\2017\Professional\SDK\ScopeCppSDK\SDK\bin
rem for regtlib.exe
rem set NET_HOME3=C:\WINNT\system32\URTTemp
set NET_HOME3=C:\Program Files (x86)\Microsoft SDKs\Windows\v10.0A\bin\NETFX 4.6.1 Tools\x64
set PATH=%PATH%;%NET_HOME1%
set PATH=%PATH%;%NET_HOME2%
set PATH=%PATH%;%NET_HOME3%
set path=.;%path%
rem ---------------------
