package com.scb.phone.view.custom.accountsummary;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class ImageAndTextAdBannerView_ViewBinding implements Unbinder {
    private ImageAndTextAdBannerView write;

    public ImageAndTextAdBannerView_ViewBinding(ImageAndTextAdBannerView imageAndTextAdBannerView, View view) {
        this.write = imageAndTextAdBannerView;
        imageAndTextAdBannerView.bannerImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.banner_image, "field 'bannerImage'", ImageView.class);
        imageAndTextAdBannerView.closeButton = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.close_button, "field 'closeButton'", ImageView.class);
        imageAndTextAdBannerView.linkText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.link_text, "field 'linkText'", TextView.class);
        imageAndTextAdBannerView.titleText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_text, "field 'titleText'", TextView.class);
        imageAndTextAdBannerView.descriptionText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.description_text, "field 'descriptionText'", TextView.class);
    }

    public final void read() {
        ImageAndTextAdBannerView imageAndTextAdBannerView = this.write;
        if (imageAndTextAdBannerView != null) {
            this.write = null;
            imageAndTextAdBannerView.bannerImage = null;
            imageAndTextAdBannerView.closeButton = null;
            imageAndTextAdBannerView.linkText = null;
            imageAndTextAdBannerView.titleText = null;
            imageAndTextAdBannerView.descriptionText = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
