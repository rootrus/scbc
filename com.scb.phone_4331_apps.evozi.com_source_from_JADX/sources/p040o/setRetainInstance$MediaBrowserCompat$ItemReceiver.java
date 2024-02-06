package p040o;

import java.util.Queue;

/* renamed from: o.setRetainInstance$MediaBrowserCompat$ItemReceiver */
public final class setRetainInstance$MediaBrowserCompat$ItemReceiver<A> {
    static final Queue<setRetainInstance$MediaBrowserCompat$ItemReceiver<?>> MediaBrowserCompat$CustomActionResultReceiver = LinearLayoutManager.IconCompatParcelizer(0);
    private int IconCompatParcelizer;
    private int MediaBrowserCompat$ItemReceiver;
    private A write;

    public static <A> setRetainInstance$MediaBrowserCompat$ItemReceiver<A> write(A a, int i, int i2) {
        setRetainInstance$MediaBrowserCompat$ItemReceiver<A> poll;
        synchronized (MediaBrowserCompat$CustomActionResultReceiver) {
            poll = MediaBrowserCompat$CustomActionResultReceiver.poll();
        }
        if (poll == null) {
            poll = new setRetainInstance$MediaBrowserCompat$ItemReceiver<>();
        }
        poll.write = a;
        poll.IconCompatParcelizer = 0;
        poll.MediaBrowserCompat$ItemReceiver = 0;
        return poll;
    }

    private setRetainInstance$MediaBrowserCompat$ItemReceiver() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof setRetainInstance$MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        setRetainInstance$MediaBrowserCompat$ItemReceiver setretaininstance_mediabrowsercompat_itemreceiver = (setRetainInstance$MediaBrowserCompat$ItemReceiver) obj;
        if (this.IconCompatParcelizer == setretaininstance_mediabrowsercompat_itemreceiver.IconCompatParcelizer && this.MediaBrowserCompat$ItemReceiver == setretaininstance_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver && this.write.equals(setretaininstance_mediabrowsercompat_itemreceiver.write)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.MediaBrowserCompat$ItemReceiver * 31) + this.IconCompatParcelizer) * 31) + this.write.hashCode();
    }
}
