package p040o;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.snackbar.Snackbar;

/* renamed from: o.ZGERU$MediaBrowserCompat$ItemReceiver */
class ZGERU$MediaBrowserCompat$ItemReceiver implements ZGERU$MediaBrowserCompat$CustomActionResultReceiver {
    private /* synthetic */ ZGERU read;

    private ZGERU$MediaBrowserCompat$ItemReceiver(ZGERU zgeru) {
        this.read = zgeru;
    }

    /* synthetic */ ZGERU$MediaBrowserCompat$ItemReceiver(ZGERU zgeru, byte b) {
        this(zgeru);
    }

    public final void MediaBrowserCompat$ItemReceiver(View view, View view2) {
        if (!ZGERU.read(this.read) && (view instanceof Snackbar.SnackbarLayout)) {
            if (this.read.MediaBrowserCompat$MediaItem == -1) {
                int unused = this.read.MediaBrowserCompat$MediaItem = view.getHeight();
            }
            if (SwitchCompat.PlaybackStateCompat$CustomAction(view2) == BitmapDescriptorFactory.HUE_RED) {
                int MediaBrowserCompat$CustomActionResultReceiver = this.read.MediaBrowserCompat$CustomActionResultReceiver;
                int IconCompatParcelizer = this.read.MediaBrowserCompat$MediaItem;
                ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin = (MediaBrowserCompat$CustomActionResultReceiver + IconCompatParcelizer) - ZGERU.MediaBrowserCompat$ItemReceiver(this.read);
                view2.bringToFront();
                view2.getParent().requestLayout();
                if (Build.VERSION.SDK_INT < 19) {
                    ((View) view2.getParent()).invalidate();
                }
            }
        }
    }
}
