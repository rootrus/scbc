package com.kofax.mobile.sdk.capture.p017id;

import com.kofax.mobile.sdk._internal.extraction.IExceptionResponseDeserializer;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdExtractor_Factory */
public final class IdExtractor_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<IdExtractor> {

    /* renamed from: ZG */
    private final HmlReviewDocumentActivity<String> f4766ZG;

    /* renamed from: ZH */
    private final HmlReviewDocumentActivity<IIdExtractionServer> f4767ZH;

    /* renamed from: ZI */
    private final HmlReviewDocumentActivity<IIdDeserializer> f4768ZI;

    /* renamed from: ZJ */
    private final HmlReviewDocumentActivity<IExceptionResponseDeserializer> f4769ZJ;

    /* renamed from: ZK */
    private final HmlReviewDocumentActivity<String> f4770ZK;

    /* renamed from: ZL */
    private final HmlReviewDocumentActivity<IIdExtractionServer> f4771ZL;

    /* renamed from: ZM */
    private final HmlReviewDocumentActivity<IIdDeserializer> f4772ZM;

    /* renamed from: ZN */
    private final HmlReviewDocumentActivity<IExceptionResponseDeserializer> f4773ZN;
    private final HmlReviewDocumentActivity<IIdExtractionServer> acL;
    private final HmlReviewDocumentActivity<IIdDeserializer> acM;
    private final HmlReviewDocumentActivity<IExceptionResponseDeserializer> acN;

    public IdExtractor_Factory(HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IIdExtractionServer> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<IIdDeserializer> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<IIdExtractionServer> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<IIdDeserializer> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<IIdExtractionServer> hmlReviewDocumentActivity9, HmlReviewDocumentActivity<IIdDeserializer> hmlReviewDocumentActivity10, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity11) {
        this.f4766ZG = hmlReviewDocumentActivity;
        this.f4767ZH = hmlReviewDocumentActivity2;
        this.f4768ZI = hmlReviewDocumentActivity3;
        this.f4769ZJ = hmlReviewDocumentActivity4;
        this.f4770ZK = hmlReviewDocumentActivity5;
        this.f4771ZL = hmlReviewDocumentActivity6;
        this.f4772ZM = hmlReviewDocumentActivity7;
        this.f4773ZN = hmlReviewDocumentActivity8;
        this.acL = hmlReviewDocumentActivity9;
        this.acM = hmlReviewDocumentActivity10;
        this.acN = hmlReviewDocumentActivity11;
    }

    public final IdExtractor get() {
        IdExtractor idExtractor = new IdExtractor();
        IdExtractor_MembersInjector.injectRttiExtractionServerUrl(idExtractor, this.f4766ZG.get());
        IdExtractor_MembersInjector.injectRttiExtractionServer(idExtractor, this.f4767ZH.get());
        IdExtractor_MembersInjector.injectRttiDeserializer(idExtractor, this.f4768ZI.get());
        IdExtractor_MembersInjector.injectRttiExceptionResponseDeserializer(idExtractor, this.f4769ZJ.get());
        IdExtractor_MembersInjector.injectKtaExtractionServerUrl(idExtractor, this.f4770ZK.get());
        IdExtractor_MembersInjector.injectKtaExtractionServer(idExtractor, this.f4771ZL.get());
        IdExtractor_MembersInjector.injectKtaDeserializer(idExtractor, this.f4772ZM.get());
        IdExtractor_MembersInjector.injectKtaExceptionResponseDeserializer(idExtractor, this.f4773ZN.get());
        IdExtractor_MembersInjector.injectOnDeviceExtractionServer(idExtractor, this.acL.get());
        IdExtractor_MembersInjector.injectOnDeviceDeserializer(idExtractor, this.acM.get());
        IdExtractor_MembersInjector.injectOnDeviceExceptionDeserializer(idExtractor, this.acN.get());
        return idExtractor;
    }

    public static IdExtractor_Factory create(HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IIdExtractionServer> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<IIdDeserializer> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<IIdExtractionServer> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<IIdDeserializer> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<IIdExtractionServer> hmlReviewDocumentActivity9, HmlReviewDocumentActivity<IIdDeserializer> hmlReviewDocumentActivity10, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity11) {
        return new IdExtractor_Factory(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8, hmlReviewDocumentActivity9, hmlReviewDocumentActivity10, hmlReviewDocumentActivity11);
    }

    public static IdExtractor newIdExtractor() {
        return new IdExtractor();
    }
}
