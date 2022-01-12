rmdir /Q/S build
rmdir /Q/S dist

echo Old Dir's deleted!
pause

mkdir build
mkdir dist

echo New Dir's created!
pause

javac -d ./build ./src/ArraysTest.java

echo Java compilation complete!
pause

cd build 
jar cvf ../dist/Executable.jar ../MANIFEST.MF *
cd ..

echo Build success!
pause