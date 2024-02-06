package com.kofax.mobile.sdk.capture.check;

import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import com.kofax.mobile.sdk.capture.parameter.LookAndFeelParameters;
import com.kofax.mobile.sdk.capture.parameter.ProcessingParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class CheckParameters_MembersInjector implements MileageQuantitySelectionActivity<CheckParameters> {

    /* renamed from: ZR */
    private final HmlReviewDocumentActivity<ExtractionParameters> f4693ZR;

    /* renamed from: ZS */
    private final HmlReviewDocumentActivity<LookAndFeelParameters> f4694ZS;

    /* renamed from: ZT */
    private final HmlReviewDocumentActivity<ProcessingParameters> f4695ZT;

    public CheckParameters_MembersInjector(HmlReviewDocumentActivity<ExtractionParameters> hmlReviewDocumentActivity, HmlReviewDocumentActivity<LookAndFeelParameters> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ProcessingParameters> hmlReviewDocumentActivity3) {
        this.f4693ZR = hmlReviewDocumentActivity;
        this.f4694ZS = hmlReviewDocumentActivity2;
        this.f4695ZT = hmlReviewDocumentActivity3;
    }

    public static MileageQuantitySelectionActivity<CheckParameters> create(HmlReviewDocumentActivity<ExtractionParameters> hmlReviewDocumentActivity, HmlReviewDocumentActivity<LookAndFeelParameters> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ProcessingParameters> hmlReviewDocumentActivity3) {
        return new CheckParameters_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final void injectMembers(CheckParameters checkParameters) {
        injectExtractionParameters(checkParameters, this.f4693ZR.get());
        injectLookAndFeelParameters(checkParameters, this.f4694ZS.get());
        injectProcessingParameters(checkParameters, this.f4695ZT.get());
    }

    public static void injectExtractionParameters(CheckParameters checkParameters, ExtractionParameters extractionParameters) {
        checkParameters.f4687ZO = extractionParameters;
    }

    public static void injectLookAndFeelParameters(CheckParameters checkParameters, LookAndFeelParameters lookAndFeelParameters) {
        checkParameters.f4688ZP = lookAndFeelParameters;
    }

    public static void injectProcessingParameters(CheckParameters checkParameters, ProcessingParameters processingParameters) {
        checkParameters.f4689ZQ = processingParameters;
    }
}
