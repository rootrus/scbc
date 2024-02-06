package com.scb.phone.view.activity.sme.gifting;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import p040o.onStart;

public class GiftPreviewActivity_ViewBinding extends GiftingStatusBaseActivity_ViewBinding {
    private GiftPreviewActivity MediaBrowserCompat$ItemReceiver;

    public GiftPreviewActivity_ViewBinding(GiftPreviewActivity giftPreviewActivity, View view) {
        super(giftPreviewActivity, view);
        this.MediaBrowserCompat$ItemReceiver = giftPreviewActivity;
        giftPreviewActivity.layout = onStart.IconCompatParcelizer(view, R.id.preview_layout, "field 'layout'");
        giftPreviewActivity.giftSenderName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_sender_name, "field 'giftSenderName'", TextView.class);
        giftPreviewActivity.giftName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_name, "field 'giftName'", TextView.class);
        giftPreviewActivity.giftMsg = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_msg, "field 'giftMsg'", TextView.class);
        giftPreviewActivity.openButton = (DefaultButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gif_open_button, "field 'openButton'", DefaultButton.class);
    }

    public final void read() {
        GiftPreviewActivity giftPreviewActivity = this.MediaBrowserCompat$ItemReceiver;
        if (giftPreviewActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            giftPreviewActivity.layout = null;
            giftPreviewActivity.giftSenderName = null;
            giftPreviewActivity.giftName = null;
            giftPreviewActivity.giftMsg = null;
            giftPreviewActivity.openButton = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
