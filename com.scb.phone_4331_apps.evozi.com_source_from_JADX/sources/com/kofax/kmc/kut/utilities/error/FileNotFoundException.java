package com.kofax.kmc.kut.utilities.error;

import java.io.IOException;

public class FileNotFoundException extends IOException {
    private static final long serialVersionUID = 3648767488252493339L;

    public FileNotFoundException(String str) {
        super(str);
        ErrorEventDelegate.postErrorInfoBusEvent(ErrorInfo.KMC_GN_FILE_NOT_FOUND_EXCEPTION, str);
    }

    public FileNotFoundException(java.io.FileNotFoundException fileNotFoundException) {
        super((IOException) fileNotFoundException);
        ErrorEventDelegate.postErrorInfoBusEvent(ErrorInfo.KMC_GN_FILE_NOT_FOUND_EXCEPTION, fileNotFoundException.getMessage());
    }
}
