package com.scb.phone.view.activity.additionaldocument;

import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;

final class ReviewDocumentActivity$MediaSessionCompat$ResultReceiverWrapper extends CheckEligibilityActivity implements FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ ReviewDocumentActivity IconCompatParcelizer;
    private /* synthetic */ FundActionsSuccessActivity MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ReviewDocumentActivity$MediaSessionCompat$ResultReceiverWrapper(ReviewDocumentActivity reviewDocumentActivity, FundActionsSuccessActivity fundActionsSuccessActivity) {
        super(0);
        this.IconCompatParcelizer = reviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = fundActionsSuccessActivity;
    }

    public final /* synthetic */ Object invoke() {
        this.MediaBrowserCompat$ItemReceiver.invoke();
        this.IconCompatParcelizer.onBackPressed();
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
