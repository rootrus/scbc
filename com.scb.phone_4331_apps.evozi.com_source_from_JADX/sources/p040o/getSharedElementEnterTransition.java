package p040o;

import java.util.Iterator;

/* renamed from: o.getSharedElementEnterTransition */
public final class getSharedElementEnterTransition<T, R> extends C10825getId<R> {
    private final Iterator<? extends T> IconCompatParcelizer;
    private final findFragmentByWho<? super T, ? extends R> MediaBrowserCompat$CustomActionResultReceiver;

    public getSharedElementEnterTransition(Iterator<? extends T> it, findFragmentByWho<? super T, ? extends R> findfragmentbywho) {
        this.IconCompatParcelizer = it;
        this.MediaBrowserCompat$CustomActionResultReceiver = findfragmentbywho;
    }

    public final boolean hasNext() {
        return this.IconCompatParcelizer.hasNext();
    }

    public final R read() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this.IconCompatParcelizer.next());
    }
}
