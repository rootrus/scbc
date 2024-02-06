package p040o;

import java.util.Iterator;

/* renamed from: o.getStateAfterAnimating */
public final class getStateAfterAnimating<T> extends C10825getId<T> {
    private final Iterator<? extends T> IconCompatParcelizer;
    private long MediaBrowserCompat$CustomActionResultReceiver = 0;
    private final long read = 1;

    public getStateAfterAnimating(Iterator<? extends T> it, long j) {
        this.IconCompatParcelizer = it;
    }

    public final boolean hasNext() {
        while (this.MediaBrowserCompat$CustomActionResultReceiver < this.read) {
            if (!this.IconCompatParcelizer.hasNext()) {
                return false;
            }
            this.IconCompatParcelizer.next();
            this.MediaBrowserCompat$CustomActionResultReceiver++;
        }
        return this.IconCompatParcelizer.hasNext();
    }

    public final T read() {
        return this.IconCompatParcelizer.next();
    }
}
