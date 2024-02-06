package p040o;

import android.util.Log;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import p040o.C1430reset;

/* renamed from: o.reset$read$MediaBrowserCompat$CustomActionResultReceiver */
final class reset$read$MediaBrowserCompat$CustomActionResultReceiver implements ViewTreeObserver.OnPreDrawListener {
    private final WeakReference<C1430reset.read> MediaBrowserCompat$ItemReceiver;

    reset$read$MediaBrowserCompat$CustomActionResultReceiver(C1430reset.read read) {
        this.MediaBrowserCompat$ItemReceiver = new WeakReference<>(read);
    }

    public final boolean onPreDraw() {
        if (Log.isLoggable("ViewTarget", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("OnGlobalLayoutListener called attachStateListener=");
            sb.append(this);
            Log.v("ViewTarget", sb.toString());
        }
        C1430reset.read read = this.MediaBrowserCompat$ItemReceiver.get();
        if (read == null) {
            return true;
        }
        read.MediaBrowserCompat$CustomActionResultReceiver();
        return true;
    }
}
