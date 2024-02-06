package com.scb.phone.view.activity.investment.discover;

import com.scb.phone.view.adapter.investment.discover.DiscoverSearchResultAdapter;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;

/* renamed from: com.scb.phone.view.activity.investment.discover.BaseDiscoverSearchActivity$MediaSessionCompat$ResultReceiverWrapper */
final class C5647xd8cb8f2a extends CheckEligibilityActivity implements FundActionsSuccessActivity<DiscoverSearchResultAdapter> {
    private /* synthetic */ BaseDiscoverSearchActivity write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5647xd8cb8f2a(BaseDiscoverSearchActivity baseDiscoverSearchActivity) {
        super(0);
        this.write = baseDiscoverSearchActivity;
    }

    public final /* synthetic */ Object invoke() {
        DiscoverSearchResultAdapter discoverSearchResultAdapter = new DiscoverSearchResultAdapter();
        discoverSearchResultAdapter.read = this.write;
        return discoverSearchResultAdapter;
    }
}
