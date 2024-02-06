package p040o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.getNextTransition */
public final class getNextTransition<T> implements Iterator<T> {
    private T IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;
    private final getAllowReturnTransitionOverlap<? super T> read;
    private final Iterator<? extends T> write;

    public getNextTransition(Iterator<? extends T> it, getAllowReturnTransitionOverlap<? super T> getallowreturntransitionoverlap) {
        this.write = it;
        this.read = getallowreturntransitionoverlap;
    }

    public final boolean hasNext() {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            while (true) {
                if (!this.write.hasNext()) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = false;
                    break;
                }
                T next = this.write.next();
                this.IconCompatParcelizer = next;
                if (this.read.write(next)) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = true;
                    break;
                }
            }
            this.MediaBrowserCompat$ItemReceiver = true;
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final T next() {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = hasNext();
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$ItemReceiver = false;
            return this.IconCompatParcelizer;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("remove not supported");
    }
}
