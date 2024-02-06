package com.scb.phone.view.custom.transferandpay;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomPhotoLeftDetails_ViewBinding implements Unbinder {
    private CustomPhotoLeftDetails MediaBrowserCompat$CustomActionResultReceiver;

    public CustomPhotoLeftDetails_ViewBinding(CustomPhotoLeftDetails customPhotoLeftDetails, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customPhotoLeftDetails;
        customPhotoLeftDetails.header = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.photo_left_header_text_view, "field 'header'", TextView.class);
        customPhotoLeftDetails.imageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.photo_left_image_view, "field 'imageView'", ImageView.class);
        customPhotoLeftDetails.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.photo_left_title_text_view, "field 'title'", TextView.class);
        customPhotoLeftDetails.secondText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.second_text_view, "field 'secondText'", TextView.class);
        customPhotoLeftDetails.thirdText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.third_text_view, "field 'thirdText'", TextView.class);
        customPhotoLeftDetails.fourthText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fourth_text_view, "field 'fourthText'", TextView.class);
        customPhotoLeftDetails.dividirView = onStart.IconCompatParcelizer(view, R.id.photo_left_item_divider, "field 'dividirView'");
        customPhotoLeftDetails.dividirFullView = onStart.IconCompatParcelizer(view, R.id.photo_left_item_divider_full, "field 'dividirFullView'");
    }

    public final void read() {
        CustomPhotoLeftDetails customPhotoLeftDetails = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customPhotoLeftDetails != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customPhotoLeftDetails.header = null;
            customPhotoLeftDetails.imageView = null;
            customPhotoLeftDetails.title = null;
            customPhotoLeftDetails.secondText = null;
            customPhotoLeftDetails.thirdText = null;
            customPhotoLeftDetails.fourthText = null;
            customPhotoLeftDetails.dividirView = null;
            customPhotoLeftDetails.dividirFullView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
