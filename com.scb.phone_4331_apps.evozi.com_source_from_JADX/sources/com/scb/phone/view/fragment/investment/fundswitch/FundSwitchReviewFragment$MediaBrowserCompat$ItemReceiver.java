package com.scb.phone.view.fragment.investment.fundswitch;

import android.widget.Button;
import android.widget.CompoundButton;
import p040o.onGetStartedClick;

final class FundSwitchReviewFragment$MediaBrowserCompat$ItemReceiver implements CompoundButton.OnCheckedChangeListener {
    private /* synthetic */ FundSwitchReviewFragment read;

    FundSwitchReviewFragment$MediaBrowserCompat$ItemReceiver(FundSwitchReviewFragment fundSwitchReviewFragment) {
        this.read = fundSwitchReviewFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Button button = this.read.btConfirm;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btConfirm");
        }
        button.setEnabled(z);
    }
}
