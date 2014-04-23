java -jar ./java/bin/RGL.jar $1 -ast $2
dot -Tpdf -o $2.pdf $2.dot
#evince $2.pdf &
