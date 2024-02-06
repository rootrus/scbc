package p040o;

import java.util.Iterator;

/* renamed from: o.getReenterTransition */
public final class getReenterTransition<T, R> extends getContext<R> {
    private show<? extends R> MediaBrowserCompat$ItemReceiver;
    private final Iterator<? extends T> MediaBrowserCompat$MediaItem;
    private final findFragmentByWho<? super T, ? extends show<? extends R>> MediaBrowserCompat$SearchResultReceiver;
    private Iterator<? extends R> write;

    public getReenterTransition(Iterator<? extends T> it, findFragmentByWho<? super T, ? extends show<? extends R>> findfragmentbywho) {
        this.MediaBrowserCompat$MediaItem = it;
        this.MediaBrowserCompat$SearchResultReceiver = findfragmentbywho;
    }

    public final void write() {
        Iterator<? extends R> it = this.write;
        if (it == null || !it.hasNext()) {
            while (this.MediaBrowserCompat$MediaItem.hasNext()) {
                Iterator<? extends R> it2 = this.write;
                if (it2 == null || !it2.hasNext()) {
                    show<? extends R> show = this.MediaBrowserCompat$ItemReceiver;
                    if (show != null) {
                        show.close();
                        this.MediaBrowserCompat$ItemReceiver = null;
                    }
                    show<? extends R> show2 = (show) this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(this.MediaBrowserCompat$MediaItem.next());
                    if (show2 != null) {
                        this.write = show2.IconCompatParcelizer;
                        this.MediaBrowserCompat$ItemReceiver = show2;
                    }
                }
                Iterator<? extends R> it3 = this.write;
                if (it3 != null && it3.hasNext()) {
                    this.read = this.write.next();
                    this.IconCompatParcelizer = true;
                    return;
                }
            }
            this.IconCompatParcelizer = false;
            show<? extends R> show3 = this.MediaBrowserCompat$ItemReceiver;
            if (show3 != null) {
                show3.close();
                this.MediaBrowserCompat$ItemReceiver = null;
                return;
            }
            return;
        }
        this.read = this.write.next();
        this.IconCompatParcelizer = true;
    }
}
