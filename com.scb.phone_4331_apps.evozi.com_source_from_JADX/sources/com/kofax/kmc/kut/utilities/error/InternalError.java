package com.kofax.kmc.kut.utilities.error;

public class InternalError extends InternalError {
    private static final long serialVersionUID = -1132010512147865607L;

    public InternalError(String str) {
        super(str);
        ErrorInfo errorInfo = ErrorInfo.KMC_GN_INTERNAL_ERROR;
        errorInfo.setErrCause(str);
        ErrorEventDelegate.postErrorInfoBusEvent(errorInfo, (String) null);
    }
}
