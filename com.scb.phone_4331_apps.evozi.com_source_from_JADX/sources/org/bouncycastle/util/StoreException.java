package org.bouncycastle.util;

public class StoreException extends RuntimeException {

    /* renamed from: _e */
    private Throwable f3220_e;

    public StoreException(String str, Throwable th) {
        super(str);
        this.f3220_e = th;
    }

    public Throwable getCause() {
        return this.f3220_e;
    }
}
