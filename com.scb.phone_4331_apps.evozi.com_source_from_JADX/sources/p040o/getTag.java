package p040o;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.getTag */
public final class getTag<T> extends getContext<T> {
    private final Comparator<? super T> MediaBrowserCompat$ItemReceiver;
    private Iterator<T> MediaMetadataCompat;
    private final Iterator<? extends T> write;

    public getTag(Iterator<? extends T> it, Comparator<? super T> comparator) {
        this.write = it;
        this.MediaBrowserCompat$ItemReceiver = comparator;
    }

    public final void write() {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            List<T> MediaBrowserCompat$ItemReceiver2 = AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(this.write);
            Collections.sort(MediaBrowserCompat$ItemReceiver2, this.MediaBrowserCompat$ItemReceiver);
            this.MediaMetadataCompat = MediaBrowserCompat$ItemReceiver2.iterator();
        }
        this.IconCompatParcelizer = this.MediaMetadataCompat.hasNext();
        if (this.IconCompatParcelizer) {
            this.read = this.MediaMetadataCompat.next();
        }
    }
}
