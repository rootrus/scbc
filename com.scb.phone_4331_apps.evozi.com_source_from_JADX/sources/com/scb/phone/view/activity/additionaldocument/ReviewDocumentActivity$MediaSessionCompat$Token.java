package com.scb.phone.view.activity.additionaldocument;

import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;

final class ReviewDocumentActivity$MediaSessionCompat$Token extends CheckEligibilityActivity implements FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ FundActionsSuccessActivity IconCompatParcelizer;
    private /* synthetic */ ReviewDocumentActivity read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ReviewDocumentActivity$MediaSessionCompat$Token(ReviewDocumentActivity reviewDocumentActivity, FundActionsSuccessActivity fundActionsSuccessActivity) {
        super(0);
        this.read = reviewDocumentActivity;
        this.IconCompatParcelizer = fundActionsSuccessActivity;
    }

    public final /* synthetic */ Object invoke() {
        this.IconCompatParcelizer.invoke();
        this.read.onBackPressed();
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
