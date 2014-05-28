package interp;

public class RGLTranslation {
        
    /** number of tabulations to be written before a statement at the current translation state */
    private int tabLevel = 0;    
    /** tabulation size */
    private int tabSize = 4;    
    /** c++ code resulting of the translation */
    private String translation = "";
    
    /** Default constructor */
    public RGLTranslation() {}
    
    /** Constructor. Specify tabulation size */
    public RGLTranslation(int tabSize) { this.tabSize = tabSize; }
    
    /** Copy constructor */
    public RGLTranslation(RGLTranslation T) {
        this.translation = T.translation;
        this.tabLevel = T.tabLevel;
        this.tabSize = T.tabSize;
    }
    
    /** Adds the corresponding amount of spaces to the current state of the translation */
    public void indent() {
        indent(tabLevel*tabSize);
    }
            
    /** Adds as many spaces to the current state of the translation as specified with nspaces */
    public void indent(int nspaces) {
        for (int i = 0; i < nspaces; ++i) translation += " ";
    }
    
    /** Adds a blank line */
    public void addLine() {
        translation += "\n";
    }    
    
    /** Writes the 'statement' of code, indented correctly */
    public void addLine(String statement) {
        indent();
        translation += statement + "\n";
    }
    
    public void tab() { ++tabLevel; }
    
    public void untab() { --tabLevel; }
    
    public void setTabSize(int tabSize) { this.tabSize = tabSize; }
    public void setTabLevel(int tabLevel) { this.tabLevel = tabLevel; }
    
    public int getTabSize() { return tabSize; }
    public int getTabLevel() { return tabLevel; }
    
    @Override
    public String toString() { return translation; }

}
