package net.sourceforge.zbar;

public class Image {
    private Object data;
    public long peer;

    static {
        System.loadLibrary("zbarjni");
        init();
    }

    public Image() {
        this.peer = create();
    }

    public Image(int i, int i2, String str) {
        this();
        setSize(i, i2);
        setFormat(str);
    }

    public Image(long j) {
        this.peer = j;
    }

    private native long create();

    private native void destroy(long j);

    private static native void init();

    public native long convert(long j, String str);

    public native void setData(byte[] bArr);

    public native void setData(int[] iArr);

    public native void setFormat(String str);

    public native void setSize(int i, int i2);

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
