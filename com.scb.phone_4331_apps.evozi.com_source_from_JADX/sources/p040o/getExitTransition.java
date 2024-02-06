package p040o;

import java.util.Iterator;

/* renamed from: o.getExitTransition */
public final class getExitTransition<T> implements Iterator<T> {
    private final int MediaBrowserCompat$CustomActionResultReceiver = 1;
    public int MediaBrowserCompat$ItemReceiver = 0;
    private final Iterator<? extends T> read;

    public getExitTransition(int i, int i2, Iterator<? extends T> it) {
        this.read = it;
    }

    public final boolean hasNext() {
        return this.read.hasNext();
    }

    public final T next() {
        T next = this.read.next();
        this.MediaBrowserCompat$ItemReceiver += this.MediaBrowserCompat$CustomActionResultReceiver;
        return next;
    }

    public final void remove() {
        this.read.remove();
    }
}
