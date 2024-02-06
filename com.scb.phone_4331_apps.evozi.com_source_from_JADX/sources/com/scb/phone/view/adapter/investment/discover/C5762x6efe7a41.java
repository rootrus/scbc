package com.scb.phone.view.adapter.investment.discover;

import com.scb.phone.view.adapter.investment.discover.DiscoverTopListRecyclerAdapter;
import p040o.CheckEligibilityActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.onGetStartedClick;
import p040o.setCrashlyticsDataCollectionEnabled;

/* renamed from: com.scb.phone.view.adapter.investment.discover.DiscoverTopListRecyclerAdapter$GroupItemViewHolder$MediaBrowserCompat$ItemReceiver */
final class C5762x6efe7a41 extends CheckEligibilityActivity implements FundFactSheetActivity<setCrashlyticsDataCollectionEnabled, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ DiscoverTopListRecyclerAdapter.GroupItemViewHolder MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5762x6efe7a41(DiscoverTopListRecyclerAdapter.GroupItemViewHolder groupItemViewHolder) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = groupItemViewHolder;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        setCrashlyticsDataCollectionEnabled setcrashlyticsdatacollectionenabled = (setCrashlyticsDataCollectionEnabled) obj;
        onGetStartedClick.write((Object) setcrashlyticsdatacollectionenabled, "it");
        this.MediaBrowserCompat$ItemReceiver.setHasDecor.MediaBrowserCompat$ItemReceiver.invoke(setcrashlyticsdatacollectionenabled);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
