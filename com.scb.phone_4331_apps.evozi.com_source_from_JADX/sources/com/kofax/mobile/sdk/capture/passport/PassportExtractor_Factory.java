package com.kofax.mobile.sdk.capture.passport;

import com.kofax.mobile.sdk._internal.extraction.IExceptionResponseDeserializer;
import com.kofax.mobile.sdk._internal.extraction.IExtractionServer;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class PassportExtractor_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<PassportExtractor> {

    /* renamed from: ZG */
    private final HmlReviewDocumentActivity<String> f4843ZG;

    /* renamed from: ZH */
    private final HmlReviewDocumentActivity<IExtractionServer> f4844ZH;

    /* renamed from: ZI */
    private final HmlReviewDocumentActivity<IPassportDeserializer> f4845ZI;

    /* renamed from: ZJ */
    private final HmlReviewDocumentActivity<IExceptionResponseDeserializer> f4846ZJ;

    /* renamed from: ZK */
    private final HmlReviewDocumentActivity<String> f4847ZK;

    /* renamed from: ZL */
    private final HmlReviewDocumentActivity<IExtractionServer> f4848ZL;

    /* renamed from: ZM */
    private final HmlReviewDocumentActivity<IPassportDeserializer> f4849ZM;

    /* renamed from: ZN */
    private final HmlReviewDocumentActivity<IExceptionResponseDeserializer> f4850ZN;
    private final HmlReviewDocumentActivity<IExtractionServer> acL;
    private final HmlReviewDocumentActivity<IPassportDeserializer> acM;
    private final HmlReviewDocumentActivity<IExceptionResponseDeserializer> acN;

    public PassportExtractor_Factory(HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IExtractionServer> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<IPassportDeserializer> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<IExtractionServer> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<IPassportDeserializer> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<IExtractionServer> hmlReviewDocumentActivity9, HmlReviewDocumentActivity<IPassportDeserializer> hmlReviewDocumentActivity10, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity11) {
        this.f4843ZG = hmlReviewDocumentActivity;
        this.f4844ZH = hmlReviewDocumentActivity2;
        this.f4845ZI = hmlReviewDocumentActivity3;
        this.f4846ZJ = hmlReviewDocumentActivity4;
        this.f4847ZK = hmlReviewDocumentActivity5;
        this.f4848ZL = hmlReviewDocumentActivity6;
        this.f4849ZM = hmlReviewDocumentActivity7;
        this.f4850ZN = hmlReviewDocumentActivity8;
        this.acL = hmlReviewDocumentActivity9;
        this.acM = hmlReviewDocumentActivity10;
        this.acN = hmlReviewDocumentActivity11;
    }

    public final PassportExtractor get() {
        PassportExtractor passportExtractor = new PassportExtractor();
        PassportExtractor_MembersInjector.injectRttiExtractionServerUrl(passportExtractor, this.f4843ZG.get());
        PassportExtractor_MembersInjector.injectRttiExtractionServer(passportExtractor, this.f4844ZH.get());
        PassportExtractor_MembersInjector.injectRttiDeserializer(passportExtractor, this.f4845ZI.get());
        PassportExtractor_MembersInjector.injectRttiExceptionResponseDeserializer(passportExtractor, this.f4846ZJ.get());
        PassportExtractor_MembersInjector.injectKtaExtractionServerUrl(passportExtractor, this.f4847ZK.get());
        PassportExtractor_MembersInjector.injectKtaExtractionServer(passportExtractor, this.f4848ZL.get());
        PassportExtractor_MembersInjector.injectKtaDeserializer(passportExtractor, this.f4849ZM.get());
        PassportExtractor_MembersInjector.injectKtaExceptionResponseDeserializer(passportExtractor, this.f4850ZN.get());
        PassportExtractor_MembersInjector.injectOnDeviceExtractionServer(passportExtractor, this.acL.get());
        PassportExtractor_MembersInjector.injectOnDeviceDeserializer(passportExtractor, this.acM.get());
        PassportExtractor_MembersInjector.injectOnDeviceExceptionDeserializer(passportExtractor, this.acN.get());
        return passportExtractor;
    }

    public static PassportExtractor_Factory create(HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IExtractionServer> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<IPassportDeserializer> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<IExtractionServer> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<IPassportDeserializer> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<IExtractionServer> hmlReviewDocumentActivity9, HmlReviewDocumentActivity<IPassportDeserializer> hmlReviewDocumentActivity10, HmlReviewDocumentActivity<IExceptionResponseDeserializer> hmlReviewDocumentActivity11) {
        return new PassportExtractor_Factory(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8, hmlReviewDocumentActivity9, hmlReviewDocumentActivity10, hmlReviewDocumentActivity11);
    }

    public static PassportExtractor newPassportExtractor() {
        return new PassportExtractor();
    }
}
