cd java
echo "Compiling java..."
make -s
cd ..
echo "Translating rgl -> c++ ..."
java -jar java/bin/RGL.jar $1
