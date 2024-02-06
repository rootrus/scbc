package com.scb.phone.view.activity.additionaldocument;

import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;

/* renamed from: com.scb.phone.view.activity.additionaldocument.ReviewDocumentActivity$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
final class C8707xf859f288 extends CheckEligibilityActivity implements FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ FundActionsSuccessActivity MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ ReviewDocumentActivity write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C8707xf859f288(ReviewDocumentActivity reviewDocumentActivity, FundActionsSuccessActivity fundActionsSuccessActivity) {
        super(0);
        this.write = reviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = fundActionsSuccessActivity;
    }

    public final /* synthetic */ Object invoke() {
        this.MediaBrowserCompat$CustomActionResultReceiver.invoke();
        this.write.read(true);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
