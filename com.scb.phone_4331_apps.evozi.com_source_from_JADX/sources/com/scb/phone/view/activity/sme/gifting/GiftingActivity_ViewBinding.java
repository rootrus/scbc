package com.scb.phone.view.activity.sme.gifting;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.CustomTabLayout;
import p040o.onCreateDialog;
import p040o.onStart;

public class GiftingActivity_ViewBinding extends BaseActivity_ViewBinding {
    private GiftingActivity MediaBrowserCompat$ItemReceiver;
    private View write;

    public GiftingActivity_ViewBinding(final GiftingActivity giftingActivity, View view) {
        super(giftingActivity, view);
        this.MediaBrowserCompat$ItemReceiver = giftingActivity;
        giftingActivity.giftsTabLayout = (CustomTabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gifts_tablayout, "field 'giftsTabLayout'", CustomTabLayout.class);
        giftingActivity.giftsViewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gifts_viewpager, "field 'giftsViewPager'", ViewPager.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.gifts_send_button, "method 'onGiftsSendButtonClick'");
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                GiftingActivity.this.onGiftsSendButtonClick(view);
            }
        });
    }

    public final void read() {
        GiftingActivity giftingActivity = this.MediaBrowserCompat$ItemReceiver;
        if (giftingActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            giftingActivity.giftsTabLayout = null;
            giftingActivity.giftsViewPager = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
