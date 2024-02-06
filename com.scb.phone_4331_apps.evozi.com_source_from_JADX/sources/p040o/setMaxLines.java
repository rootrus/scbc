package p040o;

/* renamed from: o.setMaxLines */
public final class setMaxLines<E> extends setContextualBannerListener<E> {
    public setMaxLines(int i) {
        super(i);
    }

    public final boolean offer(E e) {
        if (e != null) {
            E[] eArr = this.MediaBrowserCompat$ItemReceiver;
            long j = this.producerIndex;
            long IconCompatParcelizer = IconCompatParcelizer(j);
            if (setCloseButton.IconCompatParcelizer.getObjectVolatile(eArr, IconCompatParcelizer) != null) {
                return false;
            }
            setCloseButton.IconCompatParcelizer.putOrderedObject(eArr, IconCompatParcelizer, e);
            setCloseButton.IconCompatParcelizer.putOrderedLong(this, read, j + 1);
            return true;
        }
        throw new NullPointerException("null elements not allowed");
    }

    public final E poll() {
        long j = this.consumerIndex;
        long IconCompatParcelizer = IconCompatParcelizer(j);
        E[] eArr = this.MediaBrowserCompat$ItemReceiver;
        E objectVolatile = setCloseButton.IconCompatParcelizer.getObjectVolatile(eArr, IconCompatParcelizer);
        if (objectVolatile == null) {
            return null;
        }
        setCloseButton.IconCompatParcelizer.putOrderedObject(eArr, IconCompatParcelizer, (Object) null);
        setCloseButton.IconCompatParcelizer.putOrderedLong(this, write, j + 1);
        return objectVolatile;
    }

    public final E peek() {
        return read(IconCompatParcelizer(this.consumerIndex));
    }

    public final boolean isEmpty() {
        return setCloseButton.IconCompatParcelizer.getLongVolatile(this, read) == setCloseButton.IconCompatParcelizer.getLongVolatile(this, write);
    }

    public final int size() {
        long longVolatile = setCloseButton.IconCompatParcelizer.getLongVolatile(this, write);
        while (true) {
            long longVolatile2 = setCloseButton.IconCompatParcelizer.getLongVolatile(this, read);
            long longVolatile3 = setCloseButton.IconCompatParcelizer.getLongVolatile(this, write);
            if (longVolatile == longVolatile3) {
                return (int) (longVolatile2 - longVolatile3);
            }
            longVolatile = longVolatile3;
        }
    }
}
