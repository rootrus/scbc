package org.kobjects.repackaged.util;

public class ChainedRuntimeException extends RuntimeException {
    ChainedRuntimeException() {
    }

    public void printStackTrace() {
        super.printStackTrace();
    }
}
