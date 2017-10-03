package org.mule.modules.sabre.exception;


public class SabreInvalidInputException extends SabreException {
   
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public SabreInvalidInputException(String message, Throwable cause) {
        super(message, cause);        
    }

    public SabreInvalidInputException(String message) {
        super(message);       
    }

    public SabreInvalidInputException(Throwable cause) {
        super(cause);        
    }
    
}
