./make+run.sh $1

cp translation.txt openGL/src/ops.txt
cd openGL/src
cat main_default.txt > main.cpp
cat ops.txt >> main.cpp
cd ..

echo "Compilant el codi c++..."
make all > output.txt

echo "Executant..." 
./robotGL           

cd ..