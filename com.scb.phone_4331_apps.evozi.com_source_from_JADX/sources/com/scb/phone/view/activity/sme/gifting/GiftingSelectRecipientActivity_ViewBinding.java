package com.scb.phone.view.activity.sme.gifting;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.CustomTabLayout;
import p040o.onStart;

public class GiftingSelectRecipientActivity_ViewBinding extends BaseActivity_ViewBinding {
    private GiftingSelectRecipientActivity IconCompatParcelizer;

    public GiftingSelectRecipientActivity_ViewBinding(GiftingSelectRecipientActivity giftingSelectRecipientActivity, View view) {
        super(giftingSelectRecipientActivity, view);
        this.IconCompatParcelizer = giftingSelectRecipientActivity;
        giftingSelectRecipientActivity.tabLayout = (CustomTabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gifts_select_recipient_tabs, "field 'tabLayout'", CustomTabLayout.class);
        giftingSelectRecipientActivity.viewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gifts_select_recipient_viewpager, "field 'viewPager'", ViewPager.class);
    }

    public final void read() {
        GiftingSelectRecipientActivity giftingSelectRecipientActivity = this.IconCompatParcelizer;
        if (giftingSelectRecipientActivity != null) {
            this.IconCompatParcelizer = null;
            giftingSelectRecipientActivity.tabLayout = null;
            giftingSelectRecipientActivity.viewPager = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
