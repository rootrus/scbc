package net.sourceforge.zbar;

public class Symbol {
    private long peer;

    static {
        System.loadLibrary("zbarjni");
        init();
    }

    public Symbol(long j) {
        this.peer = j;
    }

    private native void destroy(long j);

    private static native void init();

    public native String getData();

    public native byte[] getDataBytes();

    public native long next();

    /* access modifiers changed from: protected */
    public void finalize() {
        synchronized (this) {
            if (this.peer != 0) {
                destroy(this.peer);
                this.peer = 0;
            }
        }
    }
}
