package p040o;

import java.util.Iterator;

/* renamed from: o.getString */
public final class getString<T> extends C10825getId<T> {
    private final Iterator<? extends T> IconCompatParcelizer;
    private final dump<? super T> read;

    public getString(Iterator<? extends T> it, dump<? super T> dump) {
        this.IconCompatParcelizer = it;
        this.read = dump;
    }

    public final boolean hasNext() {
        return this.IconCompatParcelizer.hasNext();
    }

    public final T read() {
        T next = this.IconCompatParcelizer.next();
        this.read.MediaBrowserCompat$ItemReceiver(next);
        return next;
    }
}
