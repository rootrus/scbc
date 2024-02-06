package com.kofax.mobile.sdk.capture.check;

import com.kofax.mobile.sdk._internal.extraction.IExceptionResponseDeserializer;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class CheckExtractor_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<CheckExtractor> {

    /* renamed from: ZG */
    private final HmlReviewDocumentActivity<String> f4675ZG;

    /* renamed from: ZH */
    private final HmlReviewDocumentActivity<ICheckExtractionServer> f4676ZH;

    /* renamed from: ZJ */
    private final HmlReviewDocumentActivity<IExceptionResponseDeserializer> f4677ZJ;

    /* renamed from: ZK */
    private final HmlReviewDocumentActivity<String> f4678ZK;

    /* renamed from: ZL */
    private final HmlReviewDocumentActivity<ICheckExtractionServer> f4679ZL;

    /* renamed from: ZN */
    private final HmlReviewDocumentActivity<IExceptionResponseDeserializer> f4680ZN;
    private final HmlReviewDocumentActivity<ICheckDeserializer> aav;
    private final HmlReviewDocumentActivity<ICheckDeserializer> aaw;

    public CheckExtractor_Factory(HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<ICheckExtractionServer> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ICheckDeserializer> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<ICheckExtractionServer> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<ICheckDeserializer> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity8) {
        this.f4675ZG = hmlReviewDocumentActivity;
        this.f4676ZH = hmlReviewDocumentActivity2;
        this.aav = hmlReviewDocumentActivity3;
        this.f4677ZJ = hmlReviewDocumentActivity4;
        this.f4678ZK = hmlReviewDocumentActivity5;
        this.f4679ZL = hmlReviewDocumentActivity6;
        this.aaw = hmlReviewDocumentActivity7;
        this.f4680ZN = hmlReviewDocumentActivity8;
    }

    public final CheckExtractor get() {
        CheckExtractor checkExtractor = new CheckExtractor();
        CheckExtractor_MembersInjector.injectRttiExtractionServerUrl(checkExtractor, this.f4675ZG.get());
        CheckExtractor_MembersInjector.injectRttiExtractionServer(checkExtractor, this.f4676ZH.get());
        CheckExtractor_MembersInjector.injectRttiCheckDeserializer(checkExtractor, this.aav.get());
        CheckExtractor_MembersInjector.injectRttiExceptionResponseDeserializer(checkExtractor, this.f4677ZJ.get());
        CheckExtractor_MembersInjector.injectKtaExtractionServerUrl(checkExtractor, this.f4678ZK.get());
        CheckExtractor_MembersInjector.injectKtaExtractionServer(checkExtractor, this.f4679ZL.get());
        CheckExtractor_MembersInjector.injectKtaCheckDeserializer(checkExtractor, this.aaw.get());
        CheckExtractor_MembersInjector.injectKtaExceptionResponseDeserializer(checkExtractor, this.f4680ZN.get());
        return checkExtractor;
    }

    public static CheckExtractor_Factory create(HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<ICheckExtractionServer> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ICheckDeserializer> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<ICheckExtractionServer> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<ICheckDeserializer> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity8) {
        return new CheckExtractor_Factory(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8);
    }

    public static CheckExtractor newCheckExtractor() {
        return new CheckExtractor();
    }
}
