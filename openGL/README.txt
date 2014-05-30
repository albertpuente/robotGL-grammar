The computers on our campus (FIB) are prepared for the execution of this project.
Other computers may get dependency errors. The following standard libraries are needed:

    GLEW (OpenGL Extension Wrangler Library)
    
        $ sudo apt-get install libglew-dev
    
    SOIL (Simple OpenGL Image Library)
    
        $ sudo apt-get install libsoil-dev
        
    Also, openGL2.0-compatible drivers and graphics cards are needed.
    
Compiling:

    $ make
    
Executing:

    $ ./robotGL
    
Interactions:

    c, C                    : Change camera type
    ESC                     : Exit
    Drag the mouse          : Zoom (LMB) / Pan (RMB) [pan not funcional in some camera types]
