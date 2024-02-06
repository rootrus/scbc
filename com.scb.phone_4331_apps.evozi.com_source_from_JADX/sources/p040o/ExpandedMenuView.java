package p040o;

/* renamed from: o.ExpandedMenuView */
public class ExpandedMenuView<T> {
    public final T MediaBrowserCompat$ItemReceiver;

    public ExpandedMenuView(T t) {
        if (t != null) {
            this.MediaBrowserCompat$ItemReceiver = t;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }
}
