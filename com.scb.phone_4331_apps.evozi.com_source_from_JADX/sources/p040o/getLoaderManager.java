package p040o;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: o.getLoaderManager */
public final class getLoaderManager<T> extends getContext<T> {
    private final Iterator<? extends T> MediaBrowserCompat$ItemReceiver;
    private final Set<T> write = new HashSet();

    public getLoaderManager(Iterator<? extends T> it) {
        this.MediaBrowserCompat$ItemReceiver = it;
    }

    public final void write() {
        do {
            boolean hasNext = this.MediaBrowserCompat$ItemReceiver.hasNext();
            this.IconCompatParcelizer = hasNext;
            if (hasNext) {
                this.read = this.MediaBrowserCompat$ItemReceiver.next();
            } else {
                return;
            }
        } while (!this.write.add(this.read));
    }
}
