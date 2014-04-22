java -jar ./java/bin/RGL.jar -ast $1
dot -Tpdf -o $1.pdf $1.dot
evince $1.pdf &
