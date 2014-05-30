#translation will be outputted to the file 'translation.txt'
cd java
echo "Compiling java source code..."
make -s
cd ..
echo "Translating rgl -> C++ ..."
java -jar java/bin/RGL.jar $1
