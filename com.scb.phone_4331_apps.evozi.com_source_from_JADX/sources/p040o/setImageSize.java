package p040o;

import java.util.Iterator;

/* renamed from: o.setImageSize */
public abstract class setImageSize<E> extends InfiniteRecyclerView<E> {
    protected static final int MediaBrowserCompat$CustomActionResultReceiver = Integer.getInteger("sparse.shift", 0).intValue();
    private static final int read;
    private static final long write = ((long) (setCloseButton.IconCompatParcelizer.arrayBaseOffset(Object[].class) + (32 << (read - MediaBrowserCompat$CustomActionResultReceiver))));
    protected final long IconCompatParcelizer;
    protected final E[] MediaBrowserCompat$ItemReceiver;

    static {
        int arrayIndexScale = setCloseButton.IconCompatParcelizer.arrayIndexScale(Object[].class);
        if (4 == arrayIndexScale) {
            read = MediaBrowserCompat$CustomActionResultReceiver + 2;
        } else if (8 == arrayIndexScale) {
            read = MediaBrowserCompat$CustomActionResultReceiver + 3;
        } else {
            throw new IllegalStateException("Unknown pointer size");
        }
    }

    public setImageSize(int i) {
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
        this.IconCompatParcelizer = (long) (numberOfLeadingZeros - 1);
        this.MediaBrowserCompat$ItemReceiver = (Object[]) new Object[((numberOfLeadingZeros << MediaBrowserCompat$CustomActionResultReceiver) + 64)];
    }

    /* access modifiers changed from: protected */
    public final long IconCompatParcelizer(long j) {
        return write + ((j & this.IconCompatParcelizer) << read);
    }

    /* access modifiers changed from: protected */
    public final void read(long j, E e) {
        setCloseButton.IconCompatParcelizer.putObject(this.MediaBrowserCompat$ItemReceiver, j, e);
    }

    /* access modifiers changed from: protected */
    public final E write(long j) {
        return setCloseButton.IconCompatParcelizer.getObject(this.MediaBrowserCompat$ItemReceiver, j);
    }

    /* access modifiers changed from: protected */
    public final E read(long j) {
        return setCloseButton.IconCompatParcelizer.getObjectVolatile(this.MediaBrowserCompat$ItemReceiver, j);
    }

    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }
}
