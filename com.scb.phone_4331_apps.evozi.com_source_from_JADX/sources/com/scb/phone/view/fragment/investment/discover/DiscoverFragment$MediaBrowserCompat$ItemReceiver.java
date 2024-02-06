package com.scb.phone.view.fragment.investment.discover;

import com.scb.phone.R;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;

final class DiscoverFragment$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundActionsSuccessActivity<Integer> {
    private /* synthetic */ DiscoverFragment read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DiscoverFragment$MediaBrowserCompat$ItemReceiver(DiscoverFragment discoverFragment) {
        super(0);
        this.read = discoverFragment;
    }

    public final /* synthetic */ Object invoke() {
        return Integer.valueOf(this.read.getResources().getDimensionPixelOffset(R.dimen.f73072131165533));
    }
}
