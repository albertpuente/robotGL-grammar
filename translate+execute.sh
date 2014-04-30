if [[ -f translation.txt ]]; then
    rm translation.txt
fi

echo "Translating..."
./make+run.sh $1

if [[ -f translation.txt ]]; then
    
    echo "Merging code..."
    cp translation.txt openGL/src/ops.txt
    cd openGL/src
    cat main_default.txt > main.cpp
    cat ops.txt >> main.cpp
    cd ../../splash/  
    
    if [[ -f openGL/robotGL ]]; then
        rm openGL/robotGL
    fi
    
    qmake -project > out.txt
    qmake > out.txt
    make > out.txt
    echo "Compiling..."
    ./splash &
    cd ../openGL
    make all > output.txt    
    
    if [[ -f robotGL ]]; then
        echo "Executing..." 
        ./robotGL       
    fi

    cd ..

fi