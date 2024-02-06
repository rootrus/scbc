package p040o;

/* renamed from: o.ThemeSlipLayout_ViewBinding */
abstract class ThemeSlipLayout_ViewBinding<E> extends RegenerateThemeSlipLayout<E> {
    private static long read = setCloseButton.write(ThemeSlipLayout_ViewBinding.class, "producerIndex");
    private volatile long producerIndex;

    /* access modifiers changed from: protected */
    public final long write() {
        return this.producerIndex;
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver(long j) {
        setCloseButton.IconCompatParcelizer.putOrderedLong(this, read, j);
    }

    public ThemeSlipLayout_ViewBinding(int i) {
        super(i);
    }
}
