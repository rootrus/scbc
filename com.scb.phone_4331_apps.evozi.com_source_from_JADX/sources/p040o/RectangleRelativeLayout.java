package p040o;

/* renamed from: o.RectangleRelativeLayout */
abstract class RectangleRelativeLayout<E> extends setSpanSize<E> {
    private static final long write = setCloseButton.write(RectangleRelativeLayout.class, "producerIndex");
    private volatile long producerIndex;

    public RectangleRelativeLayout(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    public final long MediaBrowserCompat$CustomActionResultReceiver() {
        return this.producerIndex;
    }

    /* access modifiers changed from: protected */
    public final boolean write(long j, long j2) {
        return setCloseButton.IconCompatParcelizer.compareAndSwapLong(this, write, j, j2);
    }
}
