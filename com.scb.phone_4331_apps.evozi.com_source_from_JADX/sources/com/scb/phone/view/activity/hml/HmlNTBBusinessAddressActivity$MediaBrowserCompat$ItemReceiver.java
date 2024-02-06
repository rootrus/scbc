package com.scb.phone.view.activity.hml;

import com.scb.phone.data.network.service.RewardRedemptionService;
import p040o.HmlPinActivity;
import p040o.onGetStartedClick;

public final class HmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver {
    public final RewardRedemptionService read;

    private HmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver() {
    }

    @HmlPinActivity
    public HmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver(RewardRedemptionService rewardRedemptionService) {
        onGetStartedClick.write((Object) rewardRedemptionService, "service");
        this.read = rewardRedemptionService;
    }
}
