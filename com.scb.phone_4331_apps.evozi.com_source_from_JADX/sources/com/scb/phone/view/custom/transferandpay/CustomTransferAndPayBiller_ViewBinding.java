package com.scb.phone.view.custom.transferandpay;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomTransferAndPayBiller_ViewBinding implements Unbinder {
    private CustomTransferAndPayBiller IconCompatParcelizer;

    public CustomTransferAndPayBiller_ViewBinding(CustomTransferAndPayBiller customTransferAndPayBiller, View view) {
        this.IconCompatParcelizer = customTransferAndPayBiller;
        customTransferAndPayBiller.mIconImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.item_icon_image_view, "field 'mIconImageView'", ImageView.class);
        customTransferAndPayBiller.mTitleTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.item_title_text_view, "field 'mTitleTextView'", TextView.class);
        customTransferAndPayBiller.mDescriptionTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.item_description_text_view, "field 'mDescriptionTextView'", TextView.class);
        customTransferAndPayBiller.mDescription2TextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.item_description_2_text_view, "field 'mDescription2TextView'", TextView.class);
        customTransferAndPayBiller.mDescription3TextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.item_description_3_text_view, "field 'mDescription3TextView'", TextView.class);
        customTransferAndPayBiller.mBackButton = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.item_back_icon_relative_layout, "field 'mBackButton'", RelativeLayout.class);
        customTransferAndPayBiller.mBackButtonImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.back_icon_image_view, "field 'mBackButtonImage'", ImageView.class);
    }

    public final void read() {
        CustomTransferAndPayBiller customTransferAndPayBiller = this.IconCompatParcelizer;
        if (customTransferAndPayBiller != null) {
            this.IconCompatParcelizer = null;
            customTransferAndPayBiller.mIconImageView = null;
            customTransferAndPayBiller.mTitleTextView = null;
            customTransferAndPayBiller.mDescriptionTextView = null;
            customTransferAndPayBiller.mDescription2TextView = null;
            customTransferAndPayBiller.mDescription3TextView = null;
            customTransferAndPayBiller.mBackButton = null;
            customTransferAndPayBiller.mBackButtonImage = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
