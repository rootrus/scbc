package com.kofax.kmc.kut.utilities.error;

public class IOException extends java.io.IOException {
    private static final long serialVersionUID = 3648767488252493339L;

    public IOException(String str) {
        super(str);
        ErrorEventDelegate.postErrorInfoBusEvent(ErrorInfo.KMC_GN_IO_EXCEPTION, str);
    }

    public IOException(java.io.IOException iOException) {
        super(iOException);
        ErrorEventDelegate.postErrorInfoBusEvent(ErrorInfo.KMC_GN_IO_EXCEPTION, iOException.getMessage());
    }
}
