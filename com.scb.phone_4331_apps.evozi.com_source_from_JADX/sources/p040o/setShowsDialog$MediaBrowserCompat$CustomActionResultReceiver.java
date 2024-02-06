package p040o;

import java.lang.ref.WeakReference;
import p040o.setShowsDialog;

/* renamed from: o.setShowsDialog$MediaBrowserCompat$CustomActionResultReceiver */
public class setShowsDialog$MediaBrowserCompat$CustomActionResultReceiver {
    int MediaBrowserCompat$ItemReceiver;
    public final WeakReference<setShowsDialog.write> read;

    setShowsDialog$MediaBrowserCompat$CustomActionResultReceiver(int i, setShowsDialog.write write) {
        this.read = new WeakReference<>(write);
        this.MediaBrowserCompat$ItemReceiver = i;
    }
}
