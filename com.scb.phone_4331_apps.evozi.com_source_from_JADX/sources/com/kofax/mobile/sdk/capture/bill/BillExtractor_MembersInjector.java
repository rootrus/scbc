package com.kofax.mobile.sdk.capture.bill;

import com.kofax.mobile.sdk._internal.extraction.IExceptionResponseDeserializer;
import com.kofax.mobile.sdk._internal.extraction.IExtractionServer;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class BillExtractor_MembersInjector implements MileageQuantitySelectionActivity<BillExtractor> {

    /* renamed from: ZG */
    private final HmlReviewDocumentActivity<String> f4611ZG;

    /* renamed from: ZH */
    private final HmlReviewDocumentActivity<IExtractionServer> f4612ZH;

    /* renamed from: ZI */
    private final HmlReviewDocumentActivity<IBillDeserializer> f4613ZI;

    /* renamed from: ZJ */
    private final HmlReviewDocumentActivity<IExceptionResponseDeserializer> f4614ZJ;

    /* renamed from: ZK */
    private final HmlReviewDocumentActivity<String> f4615ZK;

    /* renamed from: ZL */
    private final HmlReviewDocumentActivity<IExtractionServer> f4616ZL;

    /* renamed from: ZM */
    private final HmlReviewDocumentActivity<IBillDeserializer> f4617ZM;

    /* renamed from: ZN */
    private final HmlReviewDocumentActivity<IExceptionResponseDeserializer> f4618ZN;

    public BillExtractor_MembersInjector(HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IExtractionServer> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<IBillDeserializer> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<IExtractionServer> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<IBillDeserializer> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity8) {
        this.f4611ZG = hmlReviewDocumentActivity;
        this.f4612ZH = hmlReviewDocumentActivity2;
        this.f4613ZI = hmlReviewDocumentActivity3;
        this.f4614ZJ = hmlReviewDocumentActivity4;
        this.f4615ZK = hmlReviewDocumentActivity5;
        this.f4616ZL = hmlReviewDocumentActivity6;
        this.f4617ZM = hmlReviewDocumentActivity7;
        this.f4618ZN = hmlReviewDocumentActivity8;
    }

    public static MileageQuantitySelectionActivity<BillExtractor> create(HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IExtractionServer> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<IBillDeserializer> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<IExtractionServer> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<IBillDeserializer> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity8) {
        return new BillExtractor_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8);
    }

    public final void injectMembers(BillExtractor billExtractor) {
        injectRttiExtractionServerUrl(billExtractor, this.f4611ZG.get());
        injectRttiExtractionServer(billExtractor, this.f4612ZH.get());
        injectRttiDeserializer(billExtractor, this.f4613ZI.get());
        injectRttiExceptionResponseDeserializer(billExtractor, this.f4614ZJ.get());
        injectKtaExtractionServerUrl(billExtractor, this.f4615ZK.get());
        injectKtaExtractionServer(billExtractor, this.f4616ZL.get());
        injectKtaDeserializer(billExtractor, this.f4617ZM.get());
        injectKtaExceptionResponseDeserializer(billExtractor, this.f4618ZN.get());
    }

    public static void injectRttiExtractionServerUrl(BillExtractor billExtractor, String str) {
        billExtractor.f4601Zy = str;
    }

    public static void injectRttiExtractionServer(BillExtractor billExtractor, IExtractionServer iExtractionServer) {
        billExtractor.f4602Zz = iExtractionServer;
    }

    public static void injectRttiDeserializer(BillExtractor billExtractor, IBillDeserializer iBillDeserializer) {
        billExtractor.f4595ZA = iBillDeserializer;
    }

    public static void injectRttiExceptionResponseDeserializer(BillExtractor billExtractor, IExceptionResponseDeserializer iExceptionResponseDeserializer) {
        billExtractor.f4596ZB = iExceptionResponseDeserializer;
    }

    public static void injectKtaExtractionServerUrl(BillExtractor billExtractor, String str) {
        billExtractor.f4597ZC = str;
    }

    public static void injectKtaExtractionServer(BillExtractor billExtractor, IExtractionServer iExtractionServer) {
        billExtractor.f4598ZD = iExtractionServer;
    }

    public static void injectKtaDeserializer(BillExtractor billExtractor, IBillDeserializer iBillDeserializer) {
        billExtractor.f4599ZE = iBillDeserializer;
    }

    public static void injectKtaExceptionResponseDeserializer(BillExtractor billExtractor, IExceptionResponseDeserializer iExceptionResponseDeserializer) {
        billExtractor.f4600ZF = iExceptionResponseDeserializer;
    }
}
