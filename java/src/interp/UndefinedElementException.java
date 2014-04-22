package interp;

public class UndefinedElementException extends Exception {
    
    private int lineNumber;    
    private String variable;
    
    public int getLineNumber() { return lineNumber; }
    
    public String getVariable() { return variable; }
    
    public UndefinedElementException(String var, int line) {
        variable = var;
        lineNumber = line;
    }
}
