package p040o;

import java.util.Iterator;

/* renamed from: o.getSharedElementReturnTransition */
public final class getSharedElementReturnTransition<F, S, R> extends C10825getId<R> {
    private final callStartTransitionListener<? super F, ? super S, ? extends R> MediaBrowserCompat$CustomActionResultReceiver;
    private final Iterator<? extends F> MediaBrowserCompat$ItemReceiver;
    private final Iterator<? extends S> write;

    public getSharedElementReturnTransition(Iterator<? extends F> it, Iterator<? extends S> it2, callStartTransitionListener<? super F, ? super S, ? extends R> callstarttransitionlistener) {
        this.MediaBrowserCompat$ItemReceiver = it;
        this.write = it2;
        this.MediaBrowserCompat$CustomActionResultReceiver = callstarttransitionlistener;
    }

    public final boolean hasNext() {
        return this.MediaBrowserCompat$ItemReceiver.hasNext() && this.write.hasNext();
    }

    public final R read() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.next(), this.write.next());
    }
}
