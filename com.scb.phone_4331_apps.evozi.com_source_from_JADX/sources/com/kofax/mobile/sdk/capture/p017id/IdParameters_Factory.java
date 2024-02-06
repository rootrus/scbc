package com.kofax.mobile.sdk.capture.p017id;

import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import com.kofax.mobile.sdk.capture.parameter.LookAndFeelParameters;
import com.kofax.mobile.sdk.capture.parameter.ProcessingParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdParameters_Factory */
public final class IdParameters_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<IdParameters> {

    /* renamed from: ZR */
    private final HmlReviewDocumentActivity<ExtractionParameters> f4785ZR;

    /* renamed from: ZS */
    private final HmlReviewDocumentActivity<LookAndFeelParameters> f4786ZS;

    /* renamed from: ZT */
    private final HmlReviewDocumentActivity<ProcessingParameters> f4787ZT;

    public IdParameters_Factory(HmlReviewDocumentActivity<ExtractionParameters> hmlReviewDocumentActivity, HmlReviewDocumentActivity<LookAndFeelParameters> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ProcessingParameters> hmlReviewDocumentActivity3) {
        this.f4785ZR = hmlReviewDocumentActivity;
        this.f4786ZS = hmlReviewDocumentActivity2;
        this.f4787ZT = hmlReviewDocumentActivity3;
    }

    public final IdParameters get() {
        IdParameters idParameters = new IdParameters();
        IdParameters_MembersInjector.injectExtractionParameters(idParameters, this.f4785ZR.get());
        IdParameters_MembersInjector.injectLookAndFeelParameters(idParameters, this.f4786ZS.get());
        IdParameters_MembersInjector.injectProcessingParameters(idParameters, this.f4787ZT.get());
        return idParameters;
    }

    public static IdParameters_Factory create(HmlReviewDocumentActivity<ExtractionParameters> hmlReviewDocumentActivity, HmlReviewDocumentActivity<LookAndFeelParameters> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ProcessingParameters> hmlReviewDocumentActivity3) {
        return new IdParameters_Factory(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public static IdParameters newIdParameters() {
        return new IdParameters();
    }
}
