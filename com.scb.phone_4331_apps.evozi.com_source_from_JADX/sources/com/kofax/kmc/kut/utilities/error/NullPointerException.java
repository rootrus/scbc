package com.kofax.kmc.kut.utilities.error;

public class NullPointerException extends NullPointerException {
    private static final long serialVersionUID = -1470659987073665908L;

    public NullPointerException(String str) {
        super(str);
        ErrorInfo errorInfo = ErrorInfo.KMC_GN_NULL_POINTER_EXCEPTION;
        errorInfo.setErrCause(str);
        ErrorEventDelegate.postErrorInfoBusEvent(errorInfo, (String) null);
    }
}
