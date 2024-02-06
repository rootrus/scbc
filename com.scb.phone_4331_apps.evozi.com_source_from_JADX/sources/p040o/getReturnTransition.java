package p040o;

import java.util.Iterator;
import p040o.getHost;

/* renamed from: o.getReturnTransition */
public final class getReturnTransition<T> extends getHost.read {
    private final getAnimatingAway<? super T> MediaBrowserCompat$CustomActionResultReceiver;
    private final Iterator<? extends T> write;

    public getReturnTransition(Iterator<? extends T> it, getAnimatingAway<? super T> getanimatingaway) {
        this.write = it;
        this.MediaBrowserCompat$CustomActionResultReceiver = getanimatingaway;
    }

    public final boolean hasNext() {
        return this.write.hasNext();
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.write.next());
    }
}
