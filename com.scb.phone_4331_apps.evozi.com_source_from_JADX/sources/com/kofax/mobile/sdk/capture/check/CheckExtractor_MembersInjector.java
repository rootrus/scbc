package com.kofax.mobile.sdk.capture.check;

import com.kofax.mobile.sdk._internal.extraction.IExceptionResponseDeserializer;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class CheckExtractor_MembersInjector implements MileageQuantitySelectionActivity<CheckExtractor> {

    /* renamed from: ZG */
    private final HmlReviewDocumentActivity<String> f4681ZG;

    /* renamed from: ZH */
    private final HmlReviewDocumentActivity<ICheckExtractionServer> f4682ZH;

    /* renamed from: ZJ */
    private final HmlReviewDocumentActivity<IExceptionResponseDeserializer> f4683ZJ;

    /* renamed from: ZK */
    private final HmlReviewDocumentActivity<String> f4684ZK;

    /* renamed from: ZL */
    private final HmlReviewDocumentActivity<ICheckExtractionServer> f4685ZL;

    /* renamed from: ZN */
    private final HmlReviewDocumentActivity<IExceptionResponseDeserializer> f4686ZN;
    private final HmlReviewDocumentActivity<ICheckDeserializer> aav;
    private final HmlReviewDocumentActivity<ICheckDeserializer> aaw;

    public CheckExtractor_MembersInjector(HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<ICheckExtractionServer> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ICheckDeserializer> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<ICheckExtractionServer> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<ICheckDeserializer> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity8) {
        this.f4681ZG = hmlReviewDocumentActivity;
        this.f4682ZH = hmlReviewDocumentActivity2;
        this.aav = hmlReviewDocumentActivity3;
        this.f4683ZJ = hmlReviewDocumentActivity4;
        this.f4684ZK = hmlReviewDocumentActivity5;
        this.f4685ZL = hmlReviewDocumentActivity6;
        this.aaw = hmlReviewDocumentActivity7;
        this.f4686ZN = hmlReviewDocumentActivity8;
    }

    public static MileageQuantitySelectionActivity<CheckExtractor> create(HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<ICheckExtractionServer> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ICheckDeserializer> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<ICheckExtractionServer> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<ICheckDeserializer> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity8) {
        return new CheckExtractor_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8);
    }

    public final void injectMembers(CheckExtractor checkExtractor) {
        injectRttiExtractionServerUrl(checkExtractor, this.f4681ZG.get());
        injectRttiExtractionServer(checkExtractor, this.f4682ZH.get());
        injectRttiCheckDeserializer(checkExtractor, this.aav.get());
        injectRttiExceptionResponseDeserializer(checkExtractor, this.f4683ZJ.get());
        injectKtaExtractionServerUrl(checkExtractor, this.f4684ZK.get());
        injectKtaExtractionServer(checkExtractor, this.f4685ZL.get());
        injectKtaCheckDeserializer(checkExtractor, this.aaw.get());
        injectKtaExceptionResponseDeserializer(checkExtractor, this.f4686ZN.get());
    }

    public static void injectRttiExtractionServerUrl(CheckExtractor checkExtractor, String str) {
        checkExtractor.f4674Zy = str;
    }

    public static void injectRttiExtractionServer(CheckExtractor checkExtractor, ICheckExtractionServer iCheckExtractionServer) {
        checkExtractor.aar = iCheckExtractionServer;
    }

    public static void injectRttiCheckDeserializer(CheckExtractor checkExtractor, ICheckDeserializer iCheckDeserializer) {
        checkExtractor.aas = iCheckDeserializer;
    }

    public static void injectRttiExceptionResponseDeserializer(CheckExtractor checkExtractor, IExceptionResponseDeserializer iExceptionResponseDeserializer) {
        checkExtractor.f4671ZB = iExceptionResponseDeserializer;
    }

    public static void injectKtaExtractionServerUrl(CheckExtractor checkExtractor, String str) {
        checkExtractor.f4672ZC = str;
    }

    public static void injectKtaExtractionServer(CheckExtractor checkExtractor, ICheckExtractionServer iCheckExtractionServer) {
        checkExtractor.aat = iCheckExtractionServer;
    }

    public static void injectKtaCheckDeserializer(CheckExtractor checkExtractor, ICheckDeserializer iCheckDeserializer) {
        checkExtractor.aau = iCheckDeserializer;
    }

    public static void injectKtaExceptionResponseDeserializer(CheckExtractor checkExtractor, IExceptionResponseDeserializer iExceptionResponseDeserializer) {
        checkExtractor.f4673ZF = iExceptionResponseDeserializer;
    }
}
