package p040o;

import java.util.Iterator;

/* renamed from: o.getResources */
public final class getResources<T> extends C10825getId<T> {
    private final long IconCompatParcelizer;
    private final Iterator<? extends T> MediaBrowserCompat$ItemReceiver;
    private long read = 0;

    public getResources(Iterator<? extends T> it, long j) {
        this.MediaBrowserCompat$ItemReceiver = it;
        this.IconCompatParcelizer = j;
    }

    public final boolean hasNext() {
        return this.read < this.IconCompatParcelizer && this.MediaBrowserCompat$ItemReceiver.hasNext();
    }

    public final T read() {
        this.read++;
        return this.MediaBrowserCompat$ItemReceiver.next();
    }
}
