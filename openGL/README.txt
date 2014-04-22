Els ordinadors de la FIB ja tenen totes les llibreries necessàries.

En altres ordinadors calen les següents llibreries estàndard:

    GLEW (OpenGL Extension Wrangler Library)

        $ sudo apt-get install libglew-dev
    
    SOIL (Simple OpenGL Image Library)

        $ sudo apt-get install libsoil-dev
        
    Drivers i targeta gràfica compatibles amb OpenGL 2.0
    
Compilar:
    
    $ make
    
Executar:

    $ ./robotGL
    
Interaccions:

    c C                         : Canviar de càmera
    ESC                         : Sortir
    Arrosegar amb el ratolí     : Zoom