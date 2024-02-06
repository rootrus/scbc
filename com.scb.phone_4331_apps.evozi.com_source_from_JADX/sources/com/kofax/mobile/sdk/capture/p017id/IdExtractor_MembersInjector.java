package com.kofax.mobile.sdk.capture.p017id;

import com.kofax.mobile.sdk._internal.extraction.IExceptionResponseDeserializer;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdExtractor_MembersInjector */
public final class IdExtractor_MembersInjector implements MileageQuantitySelectionActivity<IdExtractor> {

    /* renamed from: ZG */
    private final HmlReviewDocumentActivity<String> f4774ZG;

    /* renamed from: ZH */
    private final HmlReviewDocumentActivity<IIdExtractionServer> f4775ZH;

    /* renamed from: ZI */
    private final HmlReviewDocumentActivity<IIdDeserializer> f4776ZI;

    /* renamed from: ZJ */
    private final HmlReviewDocumentActivity<IExceptionResponseDeserializer> f4777ZJ;

    /* renamed from: ZK */
    private final HmlReviewDocumentActivity<String> f4778ZK;

    /* renamed from: ZL */
    private final HmlReviewDocumentActivity<IIdExtractionServer> f4779ZL;

    /* renamed from: ZM */
    private final HmlReviewDocumentActivity<IIdDeserializer> f4780ZM;

    /* renamed from: ZN */
    private final HmlReviewDocumentActivity<IExceptionResponseDeserializer> f4781ZN;
    private final HmlReviewDocumentActivity<IIdExtractionServer> acL;
    private final HmlReviewDocumentActivity<IIdDeserializer> acM;
    private final HmlReviewDocumentActivity<IExceptionResponseDeserializer> acN;

    public IdExtractor_MembersInjector(HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IIdExtractionServer> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<IIdDeserializer> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<IIdExtractionServer> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<IIdDeserializer> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<IIdExtractionServer> hmlReviewDocumentActivity9, HmlReviewDocumentActivity<IIdDeserializer> hmlReviewDocumentActivity10, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity11) {
        this.f4774ZG = hmlReviewDocumentActivity;
        this.f4775ZH = hmlReviewDocumentActivity2;
        this.f4776ZI = hmlReviewDocumentActivity3;
        this.f4777ZJ = hmlReviewDocumentActivity4;
        this.f4778ZK = hmlReviewDocumentActivity5;
        this.f4779ZL = hmlReviewDocumentActivity6;
        this.f4780ZM = hmlReviewDocumentActivity7;
        this.f4781ZN = hmlReviewDocumentActivity8;
        this.acL = hmlReviewDocumentActivity9;
        this.acM = hmlReviewDocumentActivity10;
        this.acN = hmlReviewDocumentActivity11;
    }

    public static MileageQuantitySelectionActivity<IdExtractor> create(HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IIdExtractionServer> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<IIdDeserializer> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<IIdExtractionServer> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<IIdDeserializer> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<IIdExtractionServer> hmlReviewDocumentActivity9, HmlReviewDocumentActivity<IIdDeserializer> hmlReviewDocumentActivity10, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity11) {
        return new IdExtractor_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8, hmlReviewDocumentActivity9, hmlReviewDocumentActivity10, hmlReviewDocumentActivity11);
    }

    public final void injectMembers(IdExtractor idExtractor) {
        injectRttiExtractionServerUrl(idExtractor, this.f4774ZG.get());
        injectRttiExtractionServer(idExtractor, this.f4775ZH.get());
        injectRttiDeserializer(idExtractor, this.f4776ZI.get());
        injectRttiExceptionResponseDeserializer(idExtractor, this.f4777ZJ.get());
        injectKtaExtractionServerUrl(idExtractor, this.f4778ZK.get());
        injectKtaExtractionServer(idExtractor, this.f4779ZL.get());
        injectKtaDeserializer(idExtractor, this.f4780ZM.get());
        injectKtaExceptionResponseDeserializer(idExtractor, this.f4781ZN.get());
        injectOnDeviceExtractionServer(idExtractor, this.acL.get());
        injectOnDeviceDeserializer(idExtractor, this.acM.get());
        injectOnDeviceExceptionDeserializer(idExtractor, this.acN.get());
    }

    public static void injectRttiExtractionServerUrl(IdExtractor idExtractor, String str) {
        idExtractor.f4764Zy = str;
    }

    public static void injectRttiExtractionServer(IdExtractor idExtractor, IIdExtractionServer iIdExtractionServer) {
        idExtractor.acD = iIdExtractionServer;
    }

    public static void injectRttiDeserializer(IdExtractor idExtractor, IIdDeserializer iIdDeserializer) {
        idExtractor.acE = iIdDeserializer;
    }

    public static void injectRttiExceptionResponseDeserializer(IdExtractor idExtractor, IExceptionResponseDeserializer iExceptionResponseDeserializer) {
        idExtractor.f4761ZB = iExceptionResponseDeserializer;
    }

    public static void injectKtaExtractionServerUrl(IdExtractor idExtractor, String str) {
        idExtractor.f4762ZC = str;
    }

    public static void injectKtaExtractionServer(IdExtractor idExtractor, IIdExtractionServer iIdExtractionServer) {
        idExtractor.acF = iIdExtractionServer;
    }

    public static void injectKtaDeserializer(IdExtractor idExtractor, IIdDeserializer iIdDeserializer) {
        idExtractor.acG = iIdDeserializer;
    }

    public static void injectKtaExceptionResponseDeserializer(IdExtractor idExtractor, IExceptionResponseDeserializer iExceptionResponseDeserializer) {
        idExtractor.f4763ZF = iExceptionResponseDeserializer;
    }

    public static void injectOnDeviceExtractionServer(IdExtractor idExtractor, IIdExtractionServer iIdExtractionServer) {
        idExtractor.acI = iIdExtractionServer;
    }

    public static void injectOnDeviceDeserializer(IdExtractor idExtractor, IIdDeserializer iIdDeserializer) {
        idExtractor.acJ = iIdDeserializer;
    }

    public static void injectOnDeviceExceptionDeserializer(IdExtractor idExtractor, IExceptionResponseDeserializer iExceptionResponseDeserializer) {
        idExtractor.acK = iExceptionResponseDeserializer;
    }
}
