package p040o;

/* renamed from: o.setScrollingTouchSlop */
public final class setScrollingTouchSlop<T> {
    public int read;
    public final C1535x28237973<T> write = new C1535x28237973<>();

    public final void MediaBrowserCompat$ItemReceiver(T t, byte[]... bArr) {
        C1535x28237973<T> setscrollingtouchslop_mediabrowsercompat_customactionresultreceiver = this.write;
        int i = 0;
        for (byte[] bArr2 : bArr) {
            for (byte b : bArr[r3]) {
                C1535x28237973<T> setscrollingtouchslop_mediabrowsercompat_customactionresultreceiver2 = setscrollingtouchslop_mediabrowsercompat_customactionresultreceiver.read.get(Byte.valueOf(b));
                if (setscrollingtouchslop_mediabrowsercompat_customactionresultreceiver2 == null) {
                    setscrollingtouchslop_mediabrowsercompat_customactionresultreceiver2 = new C1535x28237973<>();
                    setscrollingtouchslop_mediabrowsercompat_customactionresultreceiver.read.put(Byte.valueOf(b), setscrollingtouchslop_mediabrowsercompat_customactionresultreceiver2);
                }
                setscrollingtouchslop_mediabrowsercompat_customactionresultreceiver = setscrollingtouchslop_mediabrowsercompat_customactionresultreceiver2;
                i++;
            }
        }
        if (setscrollingtouchslop_mediabrowsercompat_customactionresultreceiver.write == null) {
            setscrollingtouchslop_mediabrowsercompat_customactionresultreceiver.write = t;
            this.read = Math.max(this.read, i);
            return;
        }
        throw new RuntimeException("Value already set for this trie node");
    }
}
