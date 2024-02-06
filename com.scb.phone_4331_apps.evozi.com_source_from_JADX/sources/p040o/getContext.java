package p040o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.getContext */
public abstract class getContext<T> implements Iterator<T> {
    public boolean IconCompatParcelizer;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    public T read;

    /* access modifiers changed from: protected */
    public abstract void write();

    public boolean hasNext() {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            write();
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
        }
        return this.IconCompatParcelizer;
    }

    public T next() {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            hasNext();
        }
        if (this.IconCompatParcelizer) {
            T t = this.read;
            write();
            if (!this.IconCompatParcelizer) {
                this.read = null;
            }
            return t;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("remove not supported");
    }
}
