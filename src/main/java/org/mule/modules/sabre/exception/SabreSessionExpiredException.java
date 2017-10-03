package org.mule.modules.sabre.exception;


public class SabreSessionExpiredException extends SabreException {
   
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public SabreSessionExpiredException(String message, Throwable cause) {
        super(message, cause);        
    }

    public SabreSessionExpiredException(String message) {
        super(message);        
    }

    public SabreSessionExpiredException(Throwable cause) {
        super(cause);        
    }
    
}
