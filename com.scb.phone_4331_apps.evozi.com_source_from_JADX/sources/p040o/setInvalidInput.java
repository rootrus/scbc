package p040o;

/* renamed from: o.setInvalidInput */
public final class setInvalidInput<E> extends setOnPasteListener<E> {
    public setInvalidInput(int i) {
        super(i);
    }

    public final boolean offer(E e) {
        if (e != null) {
            E[] eArr = this.MediaBrowserCompat$ItemReceiver;
            long j = this.IconCompatParcelizer;
            long write = write();
            long IconCompatParcelizer = IconCompatParcelizer(write);
            if (setCloseButton.IconCompatParcelizer.getObjectVolatile(eArr, IconCompatParcelizer) == null) {
                setCloseButton.IconCompatParcelizer.putObject(eArr, IconCompatParcelizer, e);
                MediaBrowserCompat$ItemReceiver(write + 1);
            } else if (write - MediaBrowserCompat$CustomActionResultReceiver() > j) {
                return false;
            } else {
                do {
                } while (setCloseButton.IconCompatParcelizer.getObjectVolatile(eArr, IconCompatParcelizer) != null);
            }
            setCloseButton.IconCompatParcelizer.putObject(eArr, IconCompatParcelizer, e);
            MediaBrowserCompat$ItemReceiver(write + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public final E poll() {
        long MediaBrowserCompat$CustomActionResultReceiver;
        long IconCompatParcelizer = IconCompatParcelizer();
        do {
            MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver();
            if (MediaBrowserCompat$CustomActionResultReceiver >= IconCompatParcelizer) {
                long write = write();
                if (MediaBrowserCompat$CustomActionResultReceiver >= write) {
                    return null;
                }
                MediaBrowserCompat$CustomActionResultReceiver(write);
            }
        } while (!write(MediaBrowserCompat$CustomActionResultReceiver, 1 + MediaBrowserCompat$CustomActionResultReceiver));
        long IconCompatParcelizer2 = IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver);
        E[] eArr = this.MediaBrowserCompat$ItemReceiver;
        E object = setCloseButton.IconCompatParcelizer.getObject(eArr, IconCompatParcelizer2);
        setCloseButton.IconCompatParcelizer.putOrderedObject(eArr, IconCompatParcelizer2, (Object) null);
        return object;
    }

    public final E peek() {
        E read;
        long IconCompatParcelizer = IconCompatParcelizer();
        do {
            long MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver();
            if (MediaBrowserCompat$CustomActionResultReceiver >= IconCompatParcelizer) {
                long write = write();
                if (MediaBrowserCompat$CustomActionResultReceiver >= write) {
                    return null;
                }
                MediaBrowserCompat$CustomActionResultReceiver(write);
            }
            read = read(IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver));
        } while (read == null);
        return read;
    }

    public final int size() {
        long MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver();
        while (true) {
            long write = write();
            long MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
            if (MediaBrowserCompat$CustomActionResultReceiver == MediaBrowserCompat$CustomActionResultReceiver2) {
                return (int) (write - MediaBrowserCompat$CustomActionResultReceiver2);
            }
            MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver2;
        }
    }

    public final boolean isEmpty() {
        return MediaBrowserCompat$CustomActionResultReceiver() == write();
    }
}
