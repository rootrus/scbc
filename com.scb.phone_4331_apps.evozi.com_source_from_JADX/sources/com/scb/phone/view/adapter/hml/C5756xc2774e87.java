package com.scb.phone.view.adapter.hml;

import com.scb.phone.view.activity.hml.C5609x5fc43574;
import p040o.CheckEligibilityActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;

/* renamed from: com.scb.phone.view.adapter.hml.HmlBusinessInfoAdapter$MediaBrowserCompat$CustomActionResultReceiver */
final class C5756xc2774e87 extends CheckEligibilityActivity implements FundFactSheetActivity<Integer, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ HmlBusinessInfoAdapter MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5756xc2774e87(HmlBusinessInfoAdapter hmlBusinessInfoAdapter) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = hmlBusinessInfoAdapter;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        this.MediaBrowserCompat$ItemReceiver.write = ((Number) obj).intValue();
        this.MediaBrowserCompat$ItemReceiver.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(C5609x5fc43574.ADD, null);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
