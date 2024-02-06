package com.kofax.mobile.sdk.capture.check;

import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import com.kofax.mobile.sdk.capture.parameter.LookAndFeelParameters;
import com.kofax.mobile.sdk.capture.parameter.ProcessingParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class CheckParameters_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<CheckParameters> {

    /* renamed from: ZR */
    private final HmlReviewDocumentActivity<ExtractionParameters> f4690ZR;

    /* renamed from: ZS */
    private final HmlReviewDocumentActivity<LookAndFeelParameters> f4691ZS;

    /* renamed from: ZT */
    private final HmlReviewDocumentActivity<ProcessingParameters> f4692ZT;

    public CheckParameters_Factory(HmlReviewDocumentActivity<ExtractionParameters> hmlReviewDocumentActivity, HmlReviewDocumentActivity<LookAndFeelParameters> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ProcessingParameters> hmlReviewDocumentActivity3) {
        this.f4690ZR = hmlReviewDocumentActivity;
        this.f4691ZS = hmlReviewDocumentActivity2;
        this.f4692ZT = hmlReviewDocumentActivity3;
    }

    public final CheckParameters get() {
        CheckParameters checkParameters = new CheckParameters();
        CheckParameters_MembersInjector.injectExtractionParameters(checkParameters, this.f4690ZR.get());
        CheckParameters_MembersInjector.injectLookAndFeelParameters(checkParameters, this.f4691ZS.get());
        CheckParameters_MembersInjector.injectProcessingParameters(checkParameters, this.f4692ZT.get());
        return checkParameters;
    }

    public static CheckParameters_Factory create(HmlReviewDocumentActivity<ExtractionParameters> hmlReviewDocumentActivity, HmlReviewDocumentActivity<LookAndFeelParameters> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ProcessingParameters> hmlReviewDocumentActivity3) {
        return new CheckParameters_Factory(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public static CheckParameters newCheckParameters() {
        return new CheckParameters();
    }
}
