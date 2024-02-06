package p040o;

/* renamed from: o.rsnScriptGroupSetInput */
final class rsnScriptGroupSetInput extends rsnScriptIntrinsicBLAS_Double {
    private final short MediaBrowserCompat$ItemReceiver;
    private final short write;

    rsnScriptGroupSetInput(rsnScriptIntrinsicBLAS_Double rsnscriptintrinsicblas_double, int i, int i2) {
        super(rsnscriptintrinsicblas_double);
        this.MediaBrowserCompat$ItemReceiver = (short) i;
        this.write = (short) i2;
    }

    public final void write(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.write;
            if (i < s) {
                if (i == 0 || (i == 31 && s <= 62)) {
                    rsnscriptintrinsiccreate.write(31, 5);
                    short s2 = this.write;
                    if (s2 > 62) {
                        rsnscriptintrinsiccreate.write(s2 - 31, 16);
                    } else if (i == 0) {
                        rsnscriptintrinsiccreate.write(Math.min(s2, 31), 5);
                    } else {
                        rsnscriptintrinsiccreate.write(s2 - 31, 5);
                    }
                }
                rsnscriptintrinsiccreate.write(bArr[this.MediaBrowserCompat$ItemReceiver + i], 8);
                i++;
            } else {
                return;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append("::");
        sb.append((this.MediaBrowserCompat$ItemReceiver + this.write) - 1);
        sb.append('>');
        return sb.toString();
    }
}
