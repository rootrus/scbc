package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.setSupportImageTintMode */
public final class setSupportImageTintMode extends AppCompatAutoCompleteTextView$MediaBrowserCompat$ItemReceiver {
    float MediaBrowserCompat$ItemReceiver = BitmapDescriptorFactory.HUE_RED;

    public final void MediaBrowserCompat$ItemReceiver() {
        super.MediaBrowserCompat$ItemReceiver();
        this.MediaBrowserCompat$ItemReceiver = BitmapDescriptorFactory.HUE_RED;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (this.IconCompatParcelizer == 0 || this.MediaBrowserCompat$ItemReceiver != ((float) i)) {
            this.MediaBrowserCompat$ItemReceiver = (float) i;
            if (this.IconCompatParcelizer == 1) {
                read();
            }
            write();
        }
    }
}
