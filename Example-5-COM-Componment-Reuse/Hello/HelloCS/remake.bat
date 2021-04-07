rem
rem regtlib.exe  on c:\WINNT\system\URTTemp
rem set path=%path%;c:\WINNT\system\URTTemp
rem

echo compiling Hello Interface
csc /nologo /target:library IHello.cs AssemblyInfo.cs


echo compiling Its implementation
csc /nologo /target:library /r:IHello.dll HelloImp.cs


echo uninstalling old assemblies and installing newer versions
gacutil /nologo /u IHello
gacutil /nologo /u HelloImp
gacutil /nologo /i IHello.dll
gacutil /nologo /i HelloImp.dll


echo generating the type libraries
del *.tlb
tlbexp /nologo HelloImp.dll
regtlib HelloImpl.tlb

echo unregistering the old component and registering the new one
regsvcs /nologo /u HelloImp.dll
regsvcs /nologo HelloImp.dll

