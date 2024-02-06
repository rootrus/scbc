package com.scb.phone.view.activity.transferandpay.cardlessatm;

import android.view.View;
import android.webkit.WebView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class CardlessAtmInfoActivity_ViewBinding extends BaseActivity_ViewBinding {
    private CardlessAtmInfoActivity MediaBrowserCompat$CustomActionResultReceiver;

    public CardlessAtmInfoActivity_ViewBinding(CardlessAtmInfoActivity cardlessAtmInfoActivity, View view) {
        super(cardlessAtmInfoActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = cardlessAtmInfoActivity;
        cardlessAtmInfoActivity.mBenefitsParagraph = (WebView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.web_view_base, "field 'mBenefitsParagraph'", WebView.class);
    }

    public final void read() {
        CardlessAtmInfoActivity cardlessAtmInfoActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (cardlessAtmInfoActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            cardlessAtmInfoActivity.mBenefitsParagraph = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
