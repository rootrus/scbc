package p040o;

/* renamed from: o.ThemeSlipLayout */
abstract class ThemeSlipLayout<E> extends setEllipsizeText<E> {
    private volatile long read;

    public ThemeSlipLayout(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    public final long IconCompatParcelizer() {
        return this.read;
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$CustomActionResultReceiver(long j) {
        this.read = j;
    }
}
