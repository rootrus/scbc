package com.kofax.mobile.sdk.capture.bill;

import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import com.kofax.mobile.sdk.capture.parameter.LookAndFeelParameters;
import com.kofax.mobile.sdk.capture.parameter.ProcessingParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class BillParameters_MembersInjector implements MileageQuantitySelectionActivity<BillParameters> {

    /* renamed from: ZR */
    private final HmlReviewDocumentActivity<ExtractionParameters> f4625ZR;

    /* renamed from: ZS */
    private final HmlReviewDocumentActivity<LookAndFeelParameters> f4626ZS;

    /* renamed from: ZT */
    private final HmlReviewDocumentActivity<ProcessingParameters> f4627ZT;

    public BillParameters_MembersInjector(HmlReviewDocumentActivity<ExtractionParameters> hmlReviewDocumentActivity, HmlReviewDocumentActivity<LookAndFeelParameters> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ProcessingParameters> hmlReviewDocumentActivity3) {
        this.f4625ZR = hmlReviewDocumentActivity;
        this.f4626ZS = hmlReviewDocumentActivity2;
        this.f4627ZT = hmlReviewDocumentActivity3;
    }

    public static MileageQuantitySelectionActivity<BillParameters> create(HmlReviewDocumentActivity<ExtractionParameters> hmlReviewDocumentActivity, HmlReviewDocumentActivity<LookAndFeelParameters> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ProcessingParameters> hmlReviewDocumentActivity3) {
        return new BillParameters_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final void injectMembers(BillParameters billParameters) {
        injectExtractionParameters(billParameters, this.f4625ZR.get());
        injectLookAndFeelParameters(billParameters, this.f4626ZS.get());
        injectProcessingParameters(billParameters, this.f4627ZT.get());
    }

    public static void injectExtractionParameters(BillParameters billParameters, ExtractionParameters extractionParameters) {
        billParameters.f4619ZO = extractionParameters;
    }

    public static void injectLookAndFeelParameters(BillParameters billParameters, LookAndFeelParameters lookAndFeelParameters) {
        billParameters.f4620ZP = lookAndFeelParameters;
    }

    public static void injectProcessingParameters(BillParameters billParameters, ProcessingParameters processingParameters) {
        billParameters.f4621ZQ = processingParameters;
    }
}
