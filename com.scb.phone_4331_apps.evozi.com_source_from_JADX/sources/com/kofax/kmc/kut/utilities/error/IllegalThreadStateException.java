package com.kofax.kmc.kut.utilities.error;

public class IllegalThreadStateException extends IllegalThreadStateException {
    private static final long serialVersionUID = 8909271268127255656L;

    public IllegalThreadStateException(String str) {
        super(str);
        ErrorInfo errorInfo = ErrorInfo.KMC_GN_ILLEGAL_THREAD_STATE_EXCEPTION;
        errorInfo.setErrCause(str);
        ErrorEventDelegate.postErrorInfoBusEvent(errorInfo, (String) null);
    }
}
