package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomImageWithText_ViewBinding implements Unbinder {
    private CustomImageWithText write;

    public CustomImageWithText_ViewBinding(CustomImageWithText customImageWithText, View view) {
        this.write = customImageWithText;
        customImageWithText.ivLeftImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivLeftImage, "field 'ivLeftImage'", ImageView.class);
        customImageWithText.tvRightText = (ThaiTextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvRightText, "field 'tvRightText'", ThaiTextView.class);
    }

    public final void read() {
        CustomImageWithText customImageWithText = this.write;
        if (customImageWithText != null) {
            this.write = null;
            customImageWithText.ivLeftImage = null;
            customImageWithText.tvRightText = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
