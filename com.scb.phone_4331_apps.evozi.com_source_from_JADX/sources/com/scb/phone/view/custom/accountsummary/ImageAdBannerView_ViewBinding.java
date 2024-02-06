package com.scb.phone.view.custom.accountsummary;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class ImageAdBannerView_ViewBinding implements Unbinder {
    private ImageAdBannerView MediaBrowserCompat$CustomActionResultReceiver;

    public ImageAdBannerView_ViewBinding(ImageAdBannerView imageAdBannerView, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = imageAdBannerView;
        imageAdBannerView.backgroundImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.background_image, "field 'backgroundImage'", ImageView.class);
        imageAdBannerView.closeButton = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.close_button, "field 'closeButton'", ImageView.class);
    }

    public final void read() {
        ImageAdBannerView imageAdBannerView = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (imageAdBannerView != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            imageAdBannerView.backgroundImage = null;
            imageAdBannerView.closeButton = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
