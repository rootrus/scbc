package com.scb.phone.view.activity.hml.businessowner;

import android.content.Intent;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;

/* renamed from: com.scb.phone.view.activity.hml.businessowner.HmlBusinessOwnerSubmissionReviewStepTwoActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C5626x39066f2c extends CheckEligibilityActivity implements FundActionsSuccessActivity<String> {
    private /* synthetic */ HmlBusinessOwnerSubmissionReviewStepTwoActivity MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5626x39066f2c(HmlBusinessOwnerSubmissionReviewStepTwoActivity hmlBusinessOwnerSubmissionReviewStepTwoActivity) {
        super(0);
        this.MediaBrowserCompat$ItemReceiver = hmlBusinessOwnerSubmissionReviewStepTwoActivity;
    }

    public final /* synthetic */ Object invoke() {
        Intent intent = this.MediaBrowserCompat$ItemReceiver.getIntent();
        if (intent != null) {
            return intent.getStringExtra("INTENT_VALUE");
        }
        return null;
    }
}
