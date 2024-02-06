package org.spongycastle.jce.provider;

public class AnnotatedException extends Exception {
    private Throwable read;

    public AnnotatedException(String str, Throwable th) {
        super(str);
        this.read = th;
    }

    public AnnotatedException(String str) {
        this(str, (Throwable) null);
    }

    public Throwable getCause() {
        return this.read;
    }
}
