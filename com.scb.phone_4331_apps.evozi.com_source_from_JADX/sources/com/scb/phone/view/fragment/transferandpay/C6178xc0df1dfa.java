package com.scb.phone.view.fragment.transferandpay;

import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;

/* renamed from: com.scb.phone.view.fragment.transferandpay.AnyTransferHistoryFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C6178xc0df1dfa extends CheckEligibilityActivity implements FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ AnyTransferHistoryFragment read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6178xc0df1dfa(AnyTransferHistoryFragment anyTransferHistoryFragment) {
        super(0);
        this.read = anyTransferHistoryFragment;
    }

    public final /* synthetic */ Object invoke() {
        this.read.MediaDescriptionCompat().write();
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
