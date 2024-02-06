package p040o;

import java.lang.ref.WeakReference;

/* renamed from: o.onButtonClicked$MediaBrowserCompat$CustomActionResultReceiver */
public abstract class onButtonClicked$MediaBrowserCompat$CustomActionResultReceiver<T, S> {
    protected final S IconCompatParcelizer;
    public final WeakReference<T> MediaBrowserCompat$ItemReceiver;

    public onButtonClicked$MediaBrowserCompat$CustomActionResultReceiver(T t, S s) {
        this.IconCompatParcelizer = s;
        this.MediaBrowserCompat$ItemReceiver = new WeakReference<>(t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onButtonClicked$MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        onButtonClicked$MediaBrowserCompat$CustomActionResultReceiver onbuttonclicked_mediabrowsercompat_customactionresultreceiver = (onButtonClicked$MediaBrowserCompat$CustomActionResultReceiver) obj;
        if (!this.IconCompatParcelizer.equals(onbuttonclicked_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer) || this.MediaBrowserCompat$ItemReceiver.get() != onbuttonclicked_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver.get()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        T t = this.MediaBrowserCompat$ItemReceiver.get();
        int i = 0;
        int hashCode = t != null ? t.hashCode() : 0;
        S s = this.IconCompatParcelizer;
        if (s != null) {
            i = s.hashCode();
        }
        return ((hashCode + 527) * 31) + i;
    }
}
