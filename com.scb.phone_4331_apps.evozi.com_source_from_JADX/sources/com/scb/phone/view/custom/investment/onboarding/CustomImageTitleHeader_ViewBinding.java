package com.scb.phone.view.custom.investment.onboarding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomImageTitleHeader_ViewBinding implements Unbinder {
    private CustomImageTitleHeader MediaBrowserCompat$CustomActionResultReceiver;

    public CustomImageTitleHeader_ViewBinding(CustomImageTitleHeader customImageTitleHeader, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customImageTitleHeader;
        customImageTitleHeader.imageViewTitle = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_view_title, "field 'imageViewTitle'", ImageView.class);
        customImageTitleHeader.textViewDesc = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_view_description, "field 'textViewDesc'", TextView.class);
    }

    public final void read() {
        CustomImageTitleHeader customImageTitleHeader = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customImageTitleHeader != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customImageTitleHeader.imageViewTitle = null;
            customImageTitleHeader.textViewDesc = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
