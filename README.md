# Instructions
    ./generate-ast.sh input output

Takes the 'input' file and generates an 'output'.pdf file.

    ./translate input          
  
Compiles the java src and translates (only) the 'input' file. A translation.txt file will be generated.

    ./translate+link input
 
Translates (by using the above script) and links it to the C++/openGL code, then runs it.

java/        contains the translator code, binaries, etc.
openGL/      contains the C++/openGL code which the translation will be linked to.
map editor/  contains a tiny Qt app that eases the process of map design (inside the folder, compile, then execute ./rglME)
