package com.scb.phone.view.activity.ccrredemption.search;

import com.scb.phone.R;
import p040o.C7199kX;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;

final class RewardSearchActivity$MediaBrowserCompat$MediaItem extends CheckEligibilityActivity implements FundActionsSuccessActivity<C7199kX> {
    private /* synthetic */ RewardSearchActivity MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RewardSearchActivity$MediaBrowserCompat$MediaItem(RewardSearchActivity rewardSearchActivity) {
        super(0);
        this.MediaBrowserCompat$CustomActionResultReceiver = rewardSearchActivity;
    }

    public final /* synthetic */ Object invoke() {
        C7199kX kXVar = new C7199kX(this.MediaBrowserCompat$CustomActionResultReceiver);
        kXVar.setDropDownViewResource(R.layout.f84812131493708);
        return kXVar;
    }
}
