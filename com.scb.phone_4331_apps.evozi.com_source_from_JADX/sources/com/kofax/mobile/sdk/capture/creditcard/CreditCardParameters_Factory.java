package com.kofax.mobile.sdk.capture.creditcard;

import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import com.kofax.mobile.sdk.capture.parameter.LookAndFeelParameters;
import com.kofax.mobile.sdk.capture.parameter.ProcessingParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class CreditCardParameters_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<CreditCardParameters> {

    /* renamed from: ZR */
    private final HmlReviewDocumentActivity<ExtractionParameters> f4714ZR;

    /* renamed from: ZS */
    private final HmlReviewDocumentActivity<LookAndFeelParameters> f4715ZS;

    /* renamed from: ZT */
    private final HmlReviewDocumentActivity<ProcessingParameters> f4716ZT;

    public CreditCardParameters_Factory(HmlReviewDocumentActivity<ExtractionParameters> hmlReviewDocumentActivity, HmlReviewDocumentActivity<LookAndFeelParameters> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ProcessingParameters> hmlReviewDocumentActivity3) {
        this.f4714ZR = hmlReviewDocumentActivity;
        this.f4715ZS = hmlReviewDocumentActivity2;
        this.f4716ZT = hmlReviewDocumentActivity3;
    }

    public final CreditCardParameters get() {
        CreditCardParameters creditCardParameters = new CreditCardParameters();
        CreditCardParameters_MembersInjector.injectExtractionParameters(creditCardParameters, this.f4714ZR.get());
        CreditCardParameters_MembersInjector.injectLookAndFeelParameters(creditCardParameters, this.f4715ZS.get());
        CreditCardParameters_MembersInjector.injectProcessingParameters(creditCardParameters, this.f4716ZT.get());
        return creditCardParameters;
    }

    public static CreditCardParameters_Factory create(HmlReviewDocumentActivity<ExtractionParameters> hmlReviewDocumentActivity, HmlReviewDocumentActivity<LookAndFeelParameters> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ProcessingParameters> hmlReviewDocumentActivity3) {
        return new CreditCardParameters_Factory(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public static CreditCardParameters newCreditCardParameters() {
        return new CreditCardParameters();
    }
}
