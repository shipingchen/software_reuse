@echo off
set MY_LIB_0=%WORK_HOME%\lib
set MY_LIB_1=%MVC_HOME%\SDK\ScopeCppSDK\VC\lib
set MY_LIB_2="C:\Program Files (x86)\Windows Kits\10\Lib\10.0.17763.0\um\x64"
set MY_LIB_3="C:\Program Files (x86)\Windows Kits\10\Lib\10.0.17763.0\ucrt\x64"
@echo on

cl /EHsc /I %MVC_INCLUDE1% /I %MVC_INCLUDE2% src\Tester.cpp src\Quicksort.cpp /link /LIBPATH:%MY_LIB_0% /LIBPATH:%MY_LIB_1% /LIBPATH:%MY_LIB_2% /LIBPATH:%MY_LIB_3% 







