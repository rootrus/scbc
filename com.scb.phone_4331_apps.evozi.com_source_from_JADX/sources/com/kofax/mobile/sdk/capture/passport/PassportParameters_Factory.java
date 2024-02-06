package com.kofax.mobile.sdk.capture.passport;

import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import com.kofax.mobile.sdk.capture.parameter.LookAndFeelParameters;
import com.kofax.mobile.sdk.capture.parameter.ProcessingParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class PassportParameters_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<PassportParameters> {

    /* renamed from: ZR */
    private final HmlReviewDocumentActivity<ExtractionParameters> f4862ZR;

    /* renamed from: ZS */
    private final HmlReviewDocumentActivity<LookAndFeelParameters> f4863ZS;

    /* renamed from: ZT */
    private final HmlReviewDocumentActivity<ProcessingParameters> f4864ZT;

    public PassportParameters_Factory(HmlReviewDocumentActivity<ExtractionParameters> hmlReviewDocumentActivity, HmlReviewDocumentActivity<LookAndFeelParameters> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ProcessingParameters> hmlReviewDocumentActivity3) {
        this.f4862ZR = hmlReviewDocumentActivity;
        this.f4863ZS = hmlReviewDocumentActivity2;
        this.f4864ZT = hmlReviewDocumentActivity3;
    }

    public final PassportParameters get() {
        PassportParameters passportParameters = new PassportParameters();
        PassportParameters_MembersInjector.injectExtractionParameters(passportParameters, this.f4862ZR.get());
        PassportParameters_MembersInjector.injectLookAndFeelParameters(passportParameters, this.f4863ZS.get());
        PassportParameters_MembersInjector.injectProcessingParameters(passportParameters, this.f4864ZT.get());
        return passportParameters;
    }

    public static PassportParameters_Factory create(HmlReviewDocumentActivity<ExtractionParameters> hmlReviewDocumentActivity, HmlReviewDocumentActivity<LookAndFeelParameters> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ProcessingParameters> hmlReviewDocumentActivity3) {
        return new PassportParameters_Factory(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public static PassportParameters newPassportParameters() {
        return new PassportParameters();
    }
}
