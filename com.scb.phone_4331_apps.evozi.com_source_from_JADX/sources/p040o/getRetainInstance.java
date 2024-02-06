package p040o;

/* renamed from: o.getRetainInstance */
public final class getRetainInstance<T, R> extends C10825getId<R> {
    private final equals<? super T, ? extends R> IconCompatParcelizer;
    private final getExitTransition<? extends T> MediaBrowserCompat$ItemReceiver;

    public getRetainInstance(getExitTransition<? extends T> getexittransition, equals<? super T, ? extends R> equals) {
        this.MediaBrowserCompat$ItemReceiver = getexittransition;
        this.IconCompatParcelizer = equals;
    }

    public final boolean hasNext() {
        return this.MediaBrowserCompat$ItemReceiver.hasNext();
    }

    public final R read() {
        return this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$ItemReceiver.next());
    }
}
