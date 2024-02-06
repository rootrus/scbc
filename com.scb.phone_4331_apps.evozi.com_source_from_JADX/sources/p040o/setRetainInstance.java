package p040o;

/* renamed from: o.setRetainInstance */
public final class setRetainInstance<A, B> {
    public final AudioAttributesCompat<setRetainInstance$MediaBrowserCompat$ItemReceiver<A>, B> MediaBrowserCompat$ItemReceiver;

    public setRetainInstance() {
        this(250);
    }

    public setRetainInstance(long j) {
        this.MediaBrowserCompat$ItemReceiver = new AudioAttributesCompat<setRetainInstance$MediaBrowserCompat$ItemReceiver<A>, B>(j) {
            public final /* synthetic */ void write(Object obj, Object obj2) {
                setRetainInstance$MediaBrowserCompat$ItemReceiver setretaininstance_mediabrowsercompat_itemreceiver = (setRetainInstance$MediaBrowserCompat$ItemReceiver) obj;
                synchronized (setRetainInstance$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver) {
                    setRetainInstance$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.offer(setretaininstance_mediabrowsercompat_itemreceiver);
                }
            }
        };
    }

    public final B MediaBrowserCompat$ItemReceiver(A a) {
        setRetainInstance$MediaBrowserCompat$ItemReceiver write = setRetainInstance$MediaBrowserCompat$ItemReceiver.write(a, 0, 0);
        B IconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(write);
        synchronized (setRetainInstance$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver) {
            setRetainInstance$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.offer(write);
        }
        return IconCompatParcelizer;
    }
}
