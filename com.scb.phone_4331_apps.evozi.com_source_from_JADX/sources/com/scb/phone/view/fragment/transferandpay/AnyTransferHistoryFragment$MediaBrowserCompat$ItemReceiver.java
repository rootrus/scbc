package com.scb.phone.view.fragment.transferandpay;

import p040o.CheckEligibilityActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.onGetStartedClick;
import p040o.setFrames;

final class AnyTransferHistoryFragment$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<setFrames, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ AnyTransferHistoryFragment MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnyTransferHistoryFragment$MediaBrowserCompat$ItemReceiver(AnyTransferHistoryFragment anyTransferHistoryFragment) {
        super(1);
        this.MediaBrowserCompat$CustomActionResultReceiver = anyTransferHistoryFragment;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        setFrames setframes = (setFrames) obj;
        onGetStartedClick.write((Object) setframes, "it");
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setframes);
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat().IconCompatParcelizer(setframes);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
