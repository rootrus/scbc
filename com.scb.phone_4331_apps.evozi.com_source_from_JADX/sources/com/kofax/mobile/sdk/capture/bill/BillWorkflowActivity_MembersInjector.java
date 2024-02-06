package com.kofax.mobile.sdk.capture.bill;

import com.kofax.mobile.sdk.capture.parameter.IParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class BillWorkflowActivity_MembersInjector implements MileageQuantitySelectionActivity<BillWorkflowActivity> {

    /* renamed from: ZU */
    private final HmlReviewDocumentActivity<IParameters> f4629ZU;

    public BillWorkflowActivity_MembersInjector(HmlReviewDocumentActivity<IParameters> hmlReviewDocumentActivity) {
        this.f4629ZU = hmlReviewDocumentActivity;
    }

    public static MileageQuantitySelectionActivity<BillWorkflowActivity> create(HmlReviewDocumentActivity<IParameters> hmlReviewDocumentActivity) {
        return new BillWorkflowActivity_MembersInjector(hmlReviewDocumentActivity);
    }

    public final void injectMembers(BillWorkflowActivity billWorkflowActivity) {
        inject_parameters(billWorkflowActivity, this.f4629ZU.get());
    }

    public static void inject_parameters(BillWorkflowActivity billWorkflowActivity, IParameters iParameters) {
        billWorkflowActivity.f4628YA = iParameters;
    }
}
