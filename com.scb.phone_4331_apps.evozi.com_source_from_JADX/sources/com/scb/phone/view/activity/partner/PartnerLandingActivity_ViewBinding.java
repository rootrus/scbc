package com.scb.phone.view.activity.partner;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public final class PartnerLandingActivity_ViewBinding extends BaseActivity_ViewBinding {
    private PartnerLandingActivity IconCompatParcelizer;

    public PartnerLandingActivity_ViewBinding(PartnerLandingActivity partnerLandingActivity, View view) {
        super(partnerLandingActivity, view);
        this.IconCompatParcelizer = partnerLandingActivity;
        partnerLandingActivity.rvSubTile = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_sub_tile, "field 'rvSubTile'", RecyclerView.class);
        partnerLandingActivity.tvDisclaimer = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_disclaimer, "field 'tvDisclaimer'", TextView.class);
        partnerLandingActivity.tvDisclaimerSticky = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_disclaimer_sticky, "field 'tvDisclaimerSticky'", TextView.class);
    }

    public final void read() {
        PartnerLandingActivity partnerLandingActivity = this.IconCompatParcelizer;
        if (partnerLandingActivity != null) {
            this.IconCompatParcelizer = null;
            partnerLandingActivity.rvSubTile = null;
            partnerLandingActivity.tvDisclaimer = null;
            partnerLandingActivity.tvDisclaimerSticky = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
