package com.scb.phone.view.activity.sme.gifting;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class GiftingStatusBaseActivity_ViewBinding extends BaseActivity_ViewBinding {
    private GiftingStatusBaseActivity write;

    public GiftingStatusBaseActivity_ViewBinding(GiftingStatusBaseActivity giftingStatusBaseActivity, View view) {
        super(giftingStatusBaseActivity, view);
        this.write = giftingStatusBaseActivity;
        giftingStatusBaseActivity.giftAnimation = (LottieAnimationView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_animation, "field 'giftAnimation'", LottieAnimationView.class);
    }

    public void read() {
        GiftingStatusBaseActivity giftingStatusBaseActivity = this.write;
        if (giftingStatusBaseActivity != null) {
            this.write = null;
            giftingStatusBaseActivity.giftAnimation = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
