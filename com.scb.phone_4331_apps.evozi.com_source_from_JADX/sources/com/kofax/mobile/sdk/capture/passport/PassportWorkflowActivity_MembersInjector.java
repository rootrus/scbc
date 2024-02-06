package com.kofax.mobile.sdk.capture.passport;

import com.kofax.mobile.sdk.capture.parameter.IParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class PassportWorkflowActivity_MembersInjector implements MileageQuantitySelectionActivity<PassportWorkflowActivity> {

    /* renamed from: ZU */
    private final HmlReviewDocumentActivity<IParameters> f4869ZU;

    public PassportWorkflowActivity_MembersInjector(HmlReviewDocumentActivity<IParameters> hmlReviewDocumentActivity) {
        this.f4869ZU = hmlReviewDocumentActivity;
    }

    public static MileageQuantitySelectionActivity<PassportWorkflowActivity> create(HmlReviewDocumentActivity<IParameters> hmlReviewDocumentActivity) {
        return new PassportWorkflowActivity_MembersInjector(hmlReviewDocumentActivity);
    }

    public final void injectMembers(PassportWorkflowActivity passportWorkflowActivity) {
        inject_parameters(passportWorkflowActivity, this.f4869ZU.get());
    }

    public static void inject_parameters(PassportWorkflowActivity passportWorkflowActivity, IParameters iParameters) {
        passportWorkflowActivity.f4868YA = iParameters;
    }
}
