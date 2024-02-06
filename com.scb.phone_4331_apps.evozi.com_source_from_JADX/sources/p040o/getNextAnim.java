package p040o;

import java.util.Iterator;

/* renamed from: o.getNextAnim */
public final class getNextAnim<T> extends getContext<T> {
    private final Iterator<? extends T> MediaBrowserCompat$ItemReceiver;
    private final Iterator<? extends T> MediaDescriptionCompat;
    private boolean write = true;

    public getNextAnim(Iterator<? extends T> it, Iterator<? extends T> it2) {
        this.MediaBrowserCompat$ItemReceiver = it;
        this.MediaDescriptionCompat = it2;
    }

    public final void write() {
        if (this.write) {
            if (this.MediaBrowserCompat$ItemReceiver.hasNext()) {
                this.read = this.MediaBrowserCompat$ItemReceiver.next();
                this.IconCompatParcelizer = true;
                return;
            }
            this.write = false;
        }
        if (this.MediaDescriptionCompat.hasNext()) {
            this.read = this.MediaDescriptionCompat.next();
            this.IconCompatParcelizer = true;
            return;
        }
        this.IconCompatParcelizer = false;
    }
}
