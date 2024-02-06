package com.scb.phone.view.activity.sme.gifting;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import p040o.onCreateDialog;
import p040o.onStart;

public class GiftingOpenedActivity_ViewBinding extends GiftingStatusBaseActivity_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private GiftingOpenedActivity write;

    public GiftingOpenedActivity_ViewBinding(final GiftingOpenedActivity giftingOpenedActivity, View view) {
        super(giftingOpenedActivity, view);
        this.write = giftingOpenedActivity;
        giftingOpenedActivity.giftSenderName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_sender_name, "field 'giftSenderName'", TextView.class);
        giftingOpenedActivity.giftName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_name, "field 'giftName'", TextView.class);
        giftingOpenedActivity.giftItemDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_item_description, "field 'giftItemDescription'", TextView.class);
        giftingOpenedActivity.giftSenderMsg = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_msg_description, "field 'giftSenderMsg'", TextView.class);
        giftingOpenedActivity.giftExtraInfo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_extra_info, "field 'giftExtraInfo'", TextView.class);
        giftingOpenedActivity.grayButton = (DefaultButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gif_button_2, "field 'grayButton'", DefaultButton.class);
        giftingOpenedActivity.purpleButton = (DefaultButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gif_button_1, "field 'purpleButton'", DefaultButton.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.gift_go_to_home, "method 'goToHome'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                GiftingOpenedActivity.this.goToHome(view);
            }
        });
    }

    public final void read() {
        GiftingOpenedActivity giftingOpenedActivity = this.write;
        if (giftingOpenedActivity != null) {
            this.write = null;
            giftingOpenedActivity.giftSenderName = null;
            giftingOpenedActivity.giftName = null;
            giftingOpenedActivity.giftItemDescription = null;
            giftingOpenedActivity.giftSenderMsg = null;
            giftingOpenedActivity.giftExtraInfo = null;
            giftingOpenedActivity.grayButton = null;
            giftingOpenedActivity.purpleButton = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
