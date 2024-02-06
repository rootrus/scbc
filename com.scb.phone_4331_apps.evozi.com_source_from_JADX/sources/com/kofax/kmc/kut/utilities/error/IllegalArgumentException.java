package com.kofax.kmc.kut.utilities.error;

public class IllegalArgumentException extends IllegalArgumentException {
    private static final long serialVersionUID = 4883984542421554391L;

    public IllegalArgumentException(String str) {
        super(str);
        ErrorInfo errorInfo = ErrorInfo.KMC_GN_ILLEGAL_ARGUMENT_EXCEPTION;
        errorInfo.setErrCause(str);
        ErrorEventDelegate.postErrorInfoBusEvent(errorInfo, (String) null);
    }
}
