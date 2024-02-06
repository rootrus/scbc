package p040o;

/* renamed from: o.ScbEllipsizeTextView */
abstract class ScbEllipsizeTextView<E> extends ScbEditText<E> {
    private static long write = setCloseButton.write(ScbEllipsizeTextView.class, "consumerIndex");
    private volatile long consumerIndex;

    public ScbEllipsizeTextView(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    public final long MediaBrowserCompat$CustomActionResultReceiver() {
        return this.consumerIndex;
    }

    /* access modifiers changed from: protected */
    public final boolean write(long j, long j2) {
        return setCloseButton.IconCompatParcelizer.compareAndSwapLong(this, write, j, j2);
    }
}
