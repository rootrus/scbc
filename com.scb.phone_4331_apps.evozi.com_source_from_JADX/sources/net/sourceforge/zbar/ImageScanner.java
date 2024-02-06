package net.sourceforge.zbar;

public class ImageScanner {
    public long peer = create();

    static {
        System.loadLibrary("zbarjni");
        init();
    }

    private native long create();

    private native void destroy(long j);

    private static native void init();

    public native long getResults(long j);

    public native int scanImage(Image image);

    public native void setConfig(int i, int i2, int i3) throws IllegalArgumentException;

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
