package com.scb.phone.view.activity.transferandpay.cardlessatm;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public final class CardlessATMCoachMarkActivity_ViewBinding extends BaseActivity_ViewBinding {
    private CardlessATMCoachMarkActivity MediaBrowserCompat$CustomActionResultReceiver;

    public CardlessATMCoachMarkActivity_ViewBinding(CardlessATMCoachMarkActivity cardlessATMCoachMarkActivity, View view) {
        super(cardlessATMCoachMarkActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = cardlessATMCoachMarkActivity;
        cardlessATMCoachMarkActivity.viewpage = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.vp_mw_coach_mark, "field 'viewpage'", ViewPager.class);
    }

    public final void read() {
        CardlessATMCoachMarkActivity cardlessATMCoachMarkActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (cardlessATMCoachMarkActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            cardlessATMCoachMarkActivity.viewpage = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
