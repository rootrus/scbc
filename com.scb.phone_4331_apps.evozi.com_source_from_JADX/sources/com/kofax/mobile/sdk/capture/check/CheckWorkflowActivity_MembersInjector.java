package com.kofax.mobile.sdk.capture.check;

import com.kofax.mobile.sdk.capture.IImageStorage;
import com.kofax.mobile.sdk.capture.parameter.IParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class CheckWorkflowActivity_MembersInjector implements MileageQuantitySelectionActivity<CheckWorkflowActivity> {

    /* renamed from: YN */
    private final HmlReviewDocumentActivity<IImageStorage> f4698YN;

    /* renamed from: ZU */
    private final HmlReviewDocumentActivity<IParameters> f4699ZU;

    public CheckWorkflowActivity_MembersInjector(HmlReviewDocumentActivity<IParameters> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IImageStorage> hmlReviewDocumentActivity2) {
        this.f4699ZU = hmlReviewDocumentActivity;
        this.f4698YN = hmlReviewDocumentActivity2;
    }

    public static MileageQuantitySelectionActivity<CheckWorkflowActivity> create(HmlReviewDocumentActivity<IParameters> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IImageStorage> hmlReviewDocumentActivity2) {
        return new CheckWorkflowActivity_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final void injectMembers(CheckWorkflowActivity checkWorkflowActivity) {
        inject_parameters(checkWorkflowActivity, this.f4699ZU.get());
        inject_imageStore(checkWorkflowActivity, this.f4698YN.get());
    }

    public static void inject_parameters(CheckWorkflowActivity checkWorkflowActivity, IParameters iParameters) {
        checkWorkflowActivity.f4696YA = iParameters;
    }

    public static void inject_imageStore(CheckWorkflowActivity checkWorkflowActivity, IImageStorage iImageStorage) {
        checkWorkflowActivity.f4697YK = iImageStorage;
    }
}
