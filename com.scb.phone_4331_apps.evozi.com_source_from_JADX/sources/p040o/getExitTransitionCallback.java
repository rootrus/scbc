package p040o;

import p040o.getHost;

/* renamed from: o.getExitTransitionCallback */
public final class getExitTransitionCallback<R> extends C10825getId<R> {
    private final getHost.read MediaBrowserCompat$CustomActionResultReceiver;
    private final getAllowEnterTransitionOverlap<? extends R> MediaBrowserCompat$ItemReceiver;

    public getExitTransitionCallback(getHost.read read, getAllowEnterTransitionOverlap<? extends R> getallowentertransitionoverlap) {
        this.MediaBrowserCompat$CustomActionResultReceiver = read;
        this.MediaBrowserCompat$ItemReceiver = getallowentertransitionoverlap;
    }

    public final boolean hasNext() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.hasNext();
    }

    public final R read() {
        return this.MediaBrowserCompat$ItemReceiver.read(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver());
    }
}
