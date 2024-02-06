package p040o;

/* renamed from: o.rsnScriptGroupExecute */
final class rsnScriptGroupExecute extends rsnScriptIntrinsicBLAS_Double {
    private final short MediaBrowserCompat$ItemReceiver;
    private final short read;

    rsnScriptGroupExecute(rsnScriptIntrinsicBLAS_Double rsnscriptintrinsicblas_double, int i, int i2) {
        super(rsnscriptintrinsicblas_double);
        this.read = (short) i;
        this.MediaBrowserCompat$ItemReceiver = (short) i2;
    }

    /* access modifiers changed from: package-private */
    public final void write(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, byte[] bArr) {
        rsnscriptintrinsiccreate.write(this.read, this.MediaBrowserCompat$ItemReceiver);
    }

    public final String toString() {
        short s = this.read;
        short s2 = this.MediaBrowserCompat$ItemReceiver;
        StringBuilder sb = new StringBuilder("<");
        int i = 1 << s2;
        sb.append(Integer.toBinaryString((s & (i - 1)) | i | (1 << this.MediaBrowserCompat$ItemReceiver)).substring(1));
        sb.append('>');
        return sb.toString();
    }
}
