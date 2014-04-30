if [[ -f translation.txt ]]; then
    rm translation.txt
fi

echo "Traduint..."
./make+run.sh $1

if [[ -f translation.txt ]]; then
    
    echo "Combinant el codi..."
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

fi