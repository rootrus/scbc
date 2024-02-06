package com.kofax.mobile.sdk.capture.p017id;

import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import com.kofax.mobile.sdk.capture.parameter.LookAndFeelParameters;
import com.kofax.mobile.sdk.capture.parameter.ProcessingParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdParameters_MembersInjector */
public final class IdParameters_MembersInjector implements MileageQuantitySelectionActivity<IdParameters> {

    /* renamed from: ZR */
    private final HmlReviewDocumentActivity<ExtractionParameters> f4788ZR;

    /* renamed from: ZS */
    private final HmlReviewDocumentActivity<LookAndFeelParameters> f4789ZS;

    /* renamed from: ZT */
    private final HmlReviewDocumentActivity<ProcessingParameters> f4790ZT;

    public IdParameters_MembersInjector(HmlReviewDocumentActivity<ExtractionParameters> hmlReviewDocumentActivity, HmlReviewDocumentActivity<LookAndFeelParameters> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ProcessingParameters> hmlReviewDocumentActivity3) {
        this.f4788ZR = hmlReviewDocumentActivity;
        this.f4789ZS = hmlReviewDocumentActivity2;
        this.f4790ZT = hmlReviewDocumentActivity3;
    }

    public static MileageQuantitySelectionActivity<IdParameters> create(HmlReviewDocumentActivity<ExtractionParameters> hmlReviewDocumentActivity, HmlReviewDocumentActivity<LookAndFeelParameters> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ProcessingParameters> hmlReviewDocumentActivity3) {
        return new IdParameters_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final void injectMembers(IdParameters idParameters) {
        injectExtractionParameters(idParameters, this.f4788ZR.get());
        injectLookAndFeelParameters(idParameters, this.f4789ZS.get());
        injectProcessingParameters(idParameters, this.f4790ZT.get());
    }

    public static void injectExtractionParameters(IdParameters idParameters, ExtractionParameters extractionParameters) {
        idParameters.f4782ZO = extractionParameters;
    }

    public static void injectLookAndFeelParameters(IdParameters idParameters, LookAndFeelParameters lookAndFeelParameters) {
        idParameters.f4783ZP = lookAndFeelParameters;
    }

    public static void injectProcessingParameters(IdParameters idParameters, ProcessingParameters processingParameters) {
        idParameters.f4784ZQ = processingParameters;
    }
}
