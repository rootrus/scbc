package com.kofax.mobile.sdk.capture.creditcard;

import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import com.kofax.mobile.sdk.capture.parameter.LookAndFeelParameters;
import com.kofax.mobile.sdk.capture.parameter.ProcessingParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class CreditCardParameters_MembersInjector implements MileageQuantitySelectionActivity<CreditCardParameters> {

    /* renamed from: ZR */
    private final HmlReviewDocumentActivity<ExtractionParameters> f4717ZR;

    /* renamed from: ZS */
    private final HmlReviewDocumentActivity<LookAndFeelParameters> f4718ZS;

    /* renamed from: ZT */
    private final HmlReviewDocumentActivity<ProcessingParameters> f4719ZT;

    public CreditCardParameters_MembersInjector(HmlReviewDocumentActivity<ExtractionParameters> hmlReviewDocumentActivity, HmlReviewDocumentActivity<LookAndFeelParameters> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ProcessingParameters> hmlReviewDocumentActivity3) {
        this.f4717ZR = hmlReviewDocumentActivity;
        this.f4718ZS = hmlReviewDocumentActivity2;
        this.f4719ZT = hmlReviewDocumentActivity3;
    }

    public static MileageQuantitySelectionActivity<CreditCardParameters> create(HmlReviewDocumentActivity<ExtractionParameters> hmlReviewDocumentActivity, HmlReviewDocumentActivity<LookAndFeelParameters> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ProcessingParameters> hmlReviewDocumentActivity3) {
        return new CreditCardParameters_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final void injectMembers(CreditCardParameters creditCardParameters) {
        injectExtractionParameters(creditCardParameters, this.f4717ZR.get());
        injectLookAndFeelParameters(creditCardParameters, this.f4718ZS.get());
        injectProcessingParameters(creditCardParameters, this.f4719ZT.get());
    }

    public static void injectExtractionParameters(CreditCardParameters creditCardParameters, ExtractionParameters extractionParameters) {
        creditCardParameters.f4711ZO = extractionParameters;
    }

    public static void injectLookAndFeelParameters(CreditCardParameters creditCardParameters, LookAndFeelParameters lookAndFeelParameters) {
        creditCardParameters.f4712ZP = lookAndFeelParameters;
    }

    public static void injectProcessingParameters(CreditCardParameters creditCardParameters, ProcessingParameters processingParameters) {
        creditCardParameters.f4713ZQ = processingParameters;
    }
}
