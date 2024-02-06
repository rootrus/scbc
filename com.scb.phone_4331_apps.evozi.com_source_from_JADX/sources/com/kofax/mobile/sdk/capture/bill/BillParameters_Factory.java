package com.kofax.mobile.sdk.capture.bill;

import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import com.kofax.mobile.sdk.capture.parameter.LookAndFeelParameters;
import com.kofax.mobile.sdk.capture.parameter.ProcessingParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class BillParameters_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<BillParameters> {

    /* renamed from: ZR */
    private final HmlReviewDocumentActivity<ExtractionParameters> f4622ZR;

    /* renamed from: ZS */
    private final HmlReviewDocumentActivity<LookAndFeelParameters> f4623ZS;

    /* renamed from: ZT */
    private final HmlReviewDocumentActivity<ProcessingParameters> f4624ZT;

    public BillParameters_Factory(HmlReviewDocumentActivity<ExtractionParameters> hmlReviewDocumentActivity, HmlReviewDocumentActivity<LookAndFeelParameters> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ProcessingParameters> hmlReviewDocumentActivity3) {
        this.f4622ZR = hmlReviewDocumentActivity;
        this.f4623ZS = hmlReviewDocumentActivity2;
        this.f4624ZT = hmlReviewDocumentActivity3;
    }

    public final BillParameters get() {
        BillParameters billParameters = new BillParameters();
        BillParameters_MembersInjector.injectExtractionParameters(billParameters, this.f4622ZR.get());
        BillParameters_MembersInjector.injectLookAndFeelParameters(billParameters, this.f4623ZS.get());
        BillParameters_MembersInjector.injectProcessingParameters(billParameters, this.f4624ZT.get());
        return billParameters;
    }

    public static BillParameters_Factory create(HmlReviewDocumentActivity<ExtractionParameters> hmlReviewDocumentActivity, HmlReviewDocumentActivity<LookAndFeelParameters> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ProcessingParameters> hmlReviewDocumentActivity3) {
        return new BillParameters_Factory(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public static BillParameters newBillParameters() {
        return new BillParameters();
    }
}
