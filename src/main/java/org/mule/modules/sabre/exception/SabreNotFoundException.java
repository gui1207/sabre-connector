package org.mule.modules.sabre.exception;


public class SabreNotFoundException extends SabreException {
   
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public SabreNotFoundException(String message, Throwable cause) {
        super(message, cause);        
    }

    public SabreNotFoundException(String message) {
        super(message);        
    }

    public SabreNotFoundException(Throwable cause) {
        super(cause);        
    }

}
