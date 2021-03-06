/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.sabre.exception;

public class SabreException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;   

    public SabreException(String message, Throwable cause) {
        super(message, cause);
    }

    public SabreException(String message) {
        super(message);
    }  

    public SabreException(Throwable cause) {
        super(cause);
    }
    
}
