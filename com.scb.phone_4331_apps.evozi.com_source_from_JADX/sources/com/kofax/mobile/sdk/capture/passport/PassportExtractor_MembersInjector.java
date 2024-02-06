package com.kofax.mobile.sdk.capture.passport;

import com.kofax.mobile.sdk._internal.extraction.IExceptionResponseDeserializer;
import com.kofax.mobile.sdk._internal.extraction.IExtractionServer;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class PassportExtractor_MembersInjector implements MileageQuantitySelectionActivity<PassportExtractor> {

    /* renamed from: ZG */
    private final HmlReviewDocumentActivity<String> f4851ZG;

    /* renamed from: ZH */
    private final HmlReviewDocumentActivity<IExtractionServer> f4852ZH;

    /* renamed from: ZI */
    private final HmlReviewDocumentActivity<IPassportDeserializer> f4853ZI;

    /* renamed from: ZJ */
    private final HmlReviewDocumentActivity<IExceptionResponseDeserializer> f4854ZJ;

    /* renamed from: ZK */
    private final HmlReviewDocumentActivity<String> f4855ZK;

    /* renamed from: ZL */
    private final HmlReviewDocumentActivity<IExtractionServer> f4856ZL;

    /* renamed from: ZM */
    private final HmlReviewDocumentActivity<IPassportDeserializer> f4857ZM;

    /* renamed from: ZN */
    private final HmlReviewDocumentActivity<IExceptionResponseDeserializer> f4858ZN;
    private final HmlReviewDocumentActivity<IExtractionServer> acL;
    private final HmlReviewDocumentActivity<IPassportDeserializer> acM;
    private final HmlReviewDocumentActivity<IExceptionResponseDeserializer> acN;

    public PassportExtractor_MembersInjector(HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IExtractionServer> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<IPassportDeserializer> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<IExtractionServer> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<IPassportDeserializer> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<IExtractionServer> hmlReviewDocumentActivity9, HmlReviewDocumentActivity<IPassportDeserializer> hmlReviewDocumentActivity10, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity11) {
        this.f4851ZG = hmlReviewDocumentActivity;
        this.f4852ZH = hmlReviewDocumentActivity2;
        this.f4853ZI = hmlReviewDocumentActivity3;
        this.f4854ZJ = hmlReviewDocumentActivity4;
        this.f4855ZK = hmlReviewDocumentActivity5;
        this.f4856ZL = hmlReviewDocumentActivity6;
        this.f4857ZM = hmlReviewDocumentActivity7;
        this.f4858ZN = hmlReviewDocumentActivity8;
        this.acL = hmlReviewDocumentActivity9;
        this.acM = hmlReviewDocumentActivity10;
        this.acN = hmlReviewDocumentActivity11;
    }

    public static MileageQuantitySelectionActivity<PassportExtractor> create(HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IExtractionServer> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<IPassportDeserializer> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<IExtractionServer> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<IPassportDeserializer> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<IExtractionServer> hmlReviewDocumentActivity9, HmlReviewDocumentActivity<IPassportDeserializer> hmlReviewDocumentActivity10, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity11) {
        return new PassportExtractor_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8, hmlReviewDocumentActivity9, hmlReviewDocumentActivity10, hmlReviewDocumentActivity11);
    }

    public final void injectMembers(PassportExtractor passportExtractor) {
        injectRttiExtractionServerUrl(passportExtractor, this.f4851ZG.get());
        injectRttiExtractionServer(passportExtractor, this.f4852ZH.get());
        injectRttiDeserializer(passportExtractor, this.f4853ZI.get());
        injectRttiExceptionResponseDeserializer(passportExtractor, this.f4854ZJ.get());
        injectKtaExtractionServerUrl(passportExtractor, this.f4855ZK.get());
        injectKtaExtractionServer(passportExtractor, this.f4856ZL.get());
        injectKtaDeserializer(passportExtractor, this.f4857ZM.get());
        injectKtaExceptionResponseDeserializer(passportExtractor, this.f4858ZN.get());
        injectOnDeviceExtractionServer(passportExtractor, this.acL.get());
        injectOnDeviceDeserializer(passportExtractor, this.acM.get());
        injectOnDeviceExceptionDeserializer(passportExtractor, this.acN.get());
    }

    public static void injectRttiExtractionServerUrl(PassportExtractor passportExtractor, String str) {
        passportExtractor.f4841Zy = str;
    }

    public static void injectRttiExtractionServer(PassportExtractor passportExtractor, IExtractionServer iExtractionServer) {
        passportExtractor.f4842Zz = iExtractionServer;
    }

    public static void injectRttiDeserializer(PassportExtractor passportExtractor, IPassportDeserializer iPassportDeserializer) {
        passportExtractor.adA = iPassportDeserializer;
    }

    public static void injectRttiExceptionResponseDeserializer(PassportExtractor passportExtractor, IExceptionResponseDeserializer iExceptionResponseDeserializer) {
        passportExtractor.f4837ZB = iExceptionResponseDeserializer;
    }

    public static void injectKtaExtractionServerUrl(PassportExtractor passportExtractor, String str) {
        passportExtractor.f4838ZC = str;
    }

    public static void injectKtaExtractionServer(PassportExtractor passportExtractor, IExtractionServer iExtractionServer) {
        passportExtractor.f4839ZD = iExtractionServer;
    }

    public static void injectKtaDeserializer(PassportExtractor passportExtractor, IPassportDeserializer iPassportDeserializer) {
        passportExtractor.adB = iPassportDeserializer;
    }

    public static void injectKtaExceptionResponseDeserializer(PassportExtractor passportExtractor, IExceptionResponseDeserializer iExceptionResponseDeserializer) {
        passportExtractor.f4840ZF = iExceptionResponseDeserializer;
    }

    public static void injectOnDeviceExtractionServer(PassportExtractor passportExtractor, IExtractionServer iExtractionServer) {
        passportExtractor.adC = iExtractionServer;
    }

    public static void injectOnDeviceDeserializer(PassportExtractor passportExtractor, IPassportDeserializer iPassportDeserializer) {
        passportExtractor.adD = iPassportDeserializer;
    }

    public static void injectOnDeviceExceptionDeserializer(PassportExtractor passportExtractor, IExceptionResponseDeserializer iExceptionResponseDeserializer) {
        passportExtractor.acK = iExceptionResponseDeserializer;
    }
}
