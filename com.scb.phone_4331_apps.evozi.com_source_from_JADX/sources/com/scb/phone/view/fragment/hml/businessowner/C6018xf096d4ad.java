package com.scb.phone.view.fragment.hml.businessowner;

import android.os.Bundle;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.onUncaughtException;

/* renamed from: com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOwnerSubmissionReviewStepTwoFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C6018xf096d4ad extends CheckEligibilityActivity implements FundActionsSuccessActivity<onUncaughtException> {
    private /* synthetic */ HmlBusinessOwnerSubmissionReviewStepTwoFragment MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6018xf096d4ad(HmlBusinessOwnerSubmissionReviewStepTwoFragment hmlBusinessOwnerSubmissionReviewStepTwoFragment) {
        super(0);
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlBusinessOwnerSubmissionReviewStepTwoFragment;
    }

    public final /* synthetic */ Object invoke() {
        Bundle arguments = this.MediaBrowserCompat$CustomActionResultReceiver.getArguments();
        if (arguments != null) {
            return (onUncaughtException) arguments.getParcelable("EXTRA_DISPLAY");
        }
        return null;
    }
}
