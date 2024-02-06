package com.kofax.mobile.sdk.capture.passport;

import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import com.kofax.mobile.sdk.capture.parameter.LookAndFeelParameters;
import com.kofax.mobile.sdk.capture.parameter.ProcessingParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class PassportParameters_MembersInjector implements MileageQuantitySelectionActivity<PassportParameters> {

    /* renamed from: ZR */
    private final HmlReviewDocumentActivity<ExtractionParameters> f4865ZR;

    /* renamed from: ZS */
    private final HmlReviewDocumentActivity<LookAndFeelParameters> f4866ZS;

    /* renamed from: ZT */
    private final HmlReviewDocumentActivity<ProcessingParameters> f4867ZT;

    public PassportParameters_MembersInjector(HmlReviewDocumentActivity<ExtractionParameters> hmlReviewDocumentActivity, HmlReviewDocumentActivity<LookAndFeelParameters> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ProcessingParameters> hmlReviewDocumentActivity3) {
        this.f4865ZR = hmlReviewDocumentActivity;
        this.f4866ZS = hmlReviewDocumentActivity2;
        this.f4867ZT = hmlReviewDocumentActivity3;
    }

    public static MileageQuantitySelectionActivity<PassportParameters> create(HmlReviewDocumentActivity<ExtractionParameters> hmlReviewDocumentActivity, HmlReviewDocumentActivity<LookAndFeelParameters> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ProcessingParameters> hmlReviewDocumentActivity3) {
        return new PassportParameters_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final void injectMembers(PassportParameters passportParameters) {
        injectExtractionParameters(passportParameters, this.f4865ZR.get());
        injectLookAndFeelParameters(passportParameters, this.f4866ZS.get());
        injectProcessingParameters(passportParameters, this.f4867ZT.get());
    }

    public static void injectExtractionParameters(PassportParameters passportParameters, ExtractionParameters extractionParameters) {
        passportParameters.f4859ZO = extractionParameters;
    }

    public static void injectLookAndFeelParameters(PassportParameters passportParameters, LookAndFeelParameters lookAndFeelParameters) {
        passportParameters.f4860ZP = lookAndFeelParameters;
    }

    public static void injectProcessingParameters(PassportParameters passportParameters, ProcessingParameters processingParameters) {
        passportParameters.f4861ZQ = processingParameters;
    }
}
