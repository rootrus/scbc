package p040o;

/* renamed from: o.FragmentActivity */
public class FragmentActivity<T> implements performOptionsMenuClosed<T> {
    private T MediaBrowserCompat$ItemReceiver;

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final int read() {
        return 1;
    }

    public FragmentActivity(T t) {
        if (t != null) {
            this.MediaBrowserCompat$ItemReceiver = t;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final Class<T> IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.getClass();
    }

    public final T write() {
        return this.MediaBrowserCompat$ItemReceiver;
    }
}
