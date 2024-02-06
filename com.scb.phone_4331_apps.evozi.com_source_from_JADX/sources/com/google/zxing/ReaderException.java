package com.google.zxing;

public abstract class ReaderException extends Exception {
    protected static final boolean IconCompatParcelizer = (System.getProperty("surefire.test.class.path") != null);
    protected static final StackTraceElement[] write = new StackTraceElement[0];

    ReaderException() {
    }

    ReaderException(Throwable th) {
        super(th);
    }

    public final Throwable fillInStackTrace() {
        synchronized (this) {
        }
        return null;
    }
}
