package com.kofax.mobile.sdk.capture.bill;

import com.kofax.mobile.sdk._internal.extraction.IExceptionResponseDeserializer;
import com.kofax.mobile.sdk._internal.extraction.IExtractionServer;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class BillExtractor_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<BillExtractor> {

    /* renamed from: ZG */
    private final HmlReviewDocumentActivity<String> f4603ZG;

    /* renamed from: ZH */
    private final HmlReviewDocumentActivity<IExtractionServer> f4604ZH;

    /* renamed from: ZI */
    private final HmlReviewDocumentActivity<IBillDeserializer> f4605ZI;

    /* renamed from: ZJ */
    private final HmlReviewDocumentActivity<IExceptionResponseDeserializer> f4606ZJ;

    /* renamed from: ZK */
    private final HmlReviewDocumentActivity<String> f4607ZK;

    /* renamed from: ZL */
    private final HmlReviewDocumentActivity<IExtractionServer> f4608ZL;

    /* renamed from: ZM */
    private final HmlReviewDocumentActivity<IBillDeserializer> f4609ZM;

    /* renamed from: ZN */
    private final HmlReviewDocumentActivity<IExceptionResponseDeserializer> f4610ZN;

    public BillExtractor_Factory(HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IExtractionServer> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<IBillDeserializer> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<IExtractionServer> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<IBillDeserializer> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity8) {
        this.f4603ZG = hmlReviewDocumentActivity;
        this.f4604ZH = hmlReviewDocumentActivity2;
        this.f4605ZI = hmlReviewDocumentActivity3;
        this.f4606ZJ = hmlReviewDocumentActivity4;
        this.f4607ZK = hmlReviewDocumentActivity5;
        this.f4608ZL = hmlReviewDocumentActivity6;
        this.f4609ZM = hmlReviewDocumentActivity7;
        this.f4610ZN = hmlReviewDocumentActivity8;
    }

    public final BillExtractor get() {
        BillExtractor billExtractor = new BillExtractor();
        BillExtractor_MembersInjector.injectRttiExtractionServerUrl(billExtractor, this.f4603ZG.get());
        BillExtractor_MembersInjector.injectRttiExtractionServer(billExtractor, this.f4604ZH.get());
        BillExtractor_MembersInjector.injectRttiDeserializer(billExtractor, this.f4605ZI.get());
        BillExtractor_MembersInjector.injectRttiExceptionResponseDeserializer(billExtractor, this.f4606ZJ.get());
        BillExtractor_MembersInjector.injectKtaExtractionServerUrl(billExtractor, this.f4607ZK.get());
        BillExtractor_MembersInjector.injectKtaExtractionServer(billExtractor, this.f4608ZL.get());
        BillExtractor_MembersInjector.injectKtaDeserializer(billExtractor, this.f4609ZM.get());
        BillExtractor_MembersInjector.injectKtaExceptionResponseDeserializer(billExtractor, this.f4610ZN.get());
        return billExtractor;
    }

    public static BillExtractor_Factory create(HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IExtractionServer> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<IBillDeserializer> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<IExtractionServer> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<IBillDeserializer> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity8) {
        return new BillExtractor_Factory(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8);
    }

    public static BillExtractor newBillExtractor() {
        return new BillExtractor();
    }
}
