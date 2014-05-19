package interp;

import java.util.Queue;
import java.util.ArrayList;

public class RGLErrorStack {
    
    private static enum ErrType { WARNING, ERROR }
    
    private class RGLError {
        
        private int linenumber;
        private String comment;
        private ErrType type;
        
        private RGLError(ErrType type, int linenumber, String comment) {
            this.linenumber = linenumber;
            this.comment = comment;
            this.type = type;
        }
        
        @Override
        public String toString() {
            String ret = "";
            if (type == WARNING) ret += "Warning";
            else ret += "Error";
            ret += " (line " + linenumber + ")";
            ret += ": " + comment;
            return ret;
        }
    }
    
    private ArrayList<String> errors;
    private ArrayList<String> warnings;
    private String filename;
    
    public RGLErrorStack () {
        errors = new ArrayList<String>();
        warnings = new ArrayList<String>();
    }    
    
    public ArrayList<String> getErrors() { return errors; }    
    public ArrayList<String> getWarnings() { return warnings; }
    
    public void addError (int linenumber, String comment) {
        errors.add(new RGLError(ERROR, linenumber, comment);
    }
    
    public void addWarning (int linenumber, String comment) {
        warnings.add(new RGLError(WARNING, linenumber, comment);
    }
}
