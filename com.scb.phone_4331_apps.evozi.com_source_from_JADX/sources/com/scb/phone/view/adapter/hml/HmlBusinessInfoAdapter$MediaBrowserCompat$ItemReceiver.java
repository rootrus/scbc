package com.scb.phone.view.adapter.hml;

import com.scb.phone.view.activity.hml.C5609x5fc43574;
import p040o.CheckEligibilityActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;

final class HmlBusinessInfoAdapter$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Integer, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ HmlBusinessInfoAdapter read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HmlBusinessInfoAdapter$MediaBrowserCompat$ItemReceiver(HmlBusinessInfoAdapter hmlBusinessInfoAdapter) {
        super(1);
        this.read = hmlBusinessInfoAdapter;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        this.read.write = ((Number) obj).intValue();
        this.read.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(C5609x5fc43574.EDIT, this.read.MediaBrowserCompat$ItemReceiver.get(this.read.write));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
