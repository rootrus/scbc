package p040o;

/* renamed from: o.KnockKnockView */
public abstract class KnockKnockView<E> extends setImageSize<E> {
    private static final int RatingCompat = (MediaBrowserCompat$CustomActionResultReceiver + 3);
    private static final long write;
    protected final long[] read;

    static {
        Class<long[]> cls = long[].class;
        if (8 == setCloseButton.IconCompatParcelizer.arrayIndexScale(cls)) {
            write = (long) (setCloseButton.IconCompatParcelizer.arrayBaseOffset(cls) + (32 << (RatingCompat - MediaBrowserCompat$CustomActionResultReceiver)));
            return;
        }
        throw new IllegalStateException("Unexpected long[] element size");
    }

    public KnockKnockView(int i) {
        super(i);
        int i2 = (int) (this.IconCompatParcelizer + 1);
        this.read = new long[((i2 << MediaBrowserCompat$CustomActionResultReceiver) + 64)];
        for (long j = 0; j < ((long) i2); j++) {
            setCloseButton.IconCompatParcelizer.putOrderedLong(this.read, write + ((this.IconCompatParcelizer & j) << RatingCompat), j);
        }
    }

    /* access modifiers changed from: protected */
    public final long MediaBrowserCompat$ItemReceiver(long j) {
        return write + ((j & this.IconCompatParcelizer) << RatingCompat);
    }
}
