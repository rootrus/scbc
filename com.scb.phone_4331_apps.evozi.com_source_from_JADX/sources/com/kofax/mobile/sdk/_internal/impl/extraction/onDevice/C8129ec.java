package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import bolts.CancellationTokenSource;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.IllegalArgumentException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk.extract.p018id.IIdExtractor;
import com.kofax.mobile.sdk.extract.p018id.IdExtractionParameters;
import com.kofax.mobile.sdk.p075e.C8341b;
import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p081u.C8479c;
import com.kofax.mobile.sdk.p081u.C8481d;
import com.kofax.mobile.sdk.p083w.C8546j;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.ec */
public class C8129ec implements IIdExtractor {

    /* renamed from: MP */
    static final String f4108MP = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.SetImageHolderStage";

    /* renamed from: MQ */
    static final String f4109MQ = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.ProcessImageStage";

    /* renamed from: MR */
    static final String f4110MR = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.ClassifyImageStage";

    /* renamed from: MS */
    static final String f4111MS = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.ReProcessFrontImageStage";

    /* renamed from: MT */
    static final String f4112MT = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.ReProcessBackImageStage";

    /* renamed from: MU */
    static final String f4113MU = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.ProcessFrontImageCallBackStage";

    /* renamed from: MV */
    static final String f4114MV = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.ProcessBackImageCallBackStage";

    /* renamed from: MW */
    static final String f4115MW = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.OcrBarcodeImageStage";

    /* renamed from: MX */
    static final String f4116MX = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.ClearImagesStage";

    /* renamed from: MY */
    static final String f4117MY = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.ExtendPhlDl2001FullNameFieldStage";

    /* renamed from: MZ */
    static final String f4118MZ = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.DocumentConfidenceStage";

    /* renamed from: Na */
    static final String f4119Na = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.MergeFieldsStage";

    /* renamed from: Nb */
    static final String f4120Nb = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.FilterFieldsStage";

    /* renamed from: MA */
    private final C8342c f4121MA;

    /* renamed from: MB */
    private final C8342c f4122MB;

    /* renamed from: MC */
    private final C8342c f4123MC;

    /* renamed from: MD */
    private final C8342c f4124MD;

    /* renamed from: ME */
    private final C8342c f4125ME;

    /* renamed from: MF */
    private final C8342c f4126MF;

    /* renamed from: MG */
    private final C8342c f4127MG;

    /* renamed from: MH */
    private final C8342c f4128MH;

    /* renamed from: MI */
    private final C8342c f4129MI;

    /* renamed from: MJ */
    private final C8342c f4130MJ;

    /* renamed from: MK */
    private final C8342c f4131MK;

    /* renamed from: ML */
    private final C8342c f4132ML;

    /* renamed from: MM */
    private final C8342c f4133MM;

    /* renamed from: MN */
    private CancellationTokenSource f4134MN = null;

    /* renamed from: MO */
    private final C8341b f4135MO;

    @HmlPinActivity
    public C8129ec(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.SetImageHolderStage") C8342c cVar, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.ProcessImageStage") C8342c cVar2, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.ClassifyImageStage") C8342c cVar3, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.ReProcessFrontImageStage") C8342c cVar4, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.ReProcessBackImageStage") C8342c cVar5, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.ProcessFrontImageCallBackStage") C8342c cVar6, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.ProcessBackImageCallBackStage") C8342c cVar7, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.OcrBarcodeImageStage") C8342c cVar8, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.ClearImagesStage") C8342c cVar9, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.ExtendPhlDl2001FullNameFieldStage") C8342c cVar10, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.DocumentConfidenceStage") C8342c cVar11, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.MergeFieldsStage") C8342c cVar12, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.FilterFieldsStage") C8342c cVar13) {
        this.f4121MA = cVar;
        this.f4122MB = cVar2;
        this.f4123MC = cVar3;
        this.f4124MD = cVar4;
        this.f4125ME = cVar5;
        this.f4126MF = cVar6;
        this.f4127MG = cVar7;
        this.f4128MH = cVar8;
        this.f4129MI = cVar9;
        this.f4130MJ = cVar10;
        this.f4131MK = cVar11;
        this.f4132ML = cVar12;
        this.f4133MM = cVar13;
        this.f4135MO = m4311oh();
    }

    public void extractFields(IdExtractionParameters idExtractionParameters) {
        synchronized (this) {
            if (idExtractionParameters.getListener() != null) {
                String projectName = idExtractionParameters.getProjectName();
                if (projectName == null || projectName.length() == 0) {
                    throw new KmcRuntimeException(ErrorInfo.KMC_GN_ILLEGAL_ARGUMENT_EXCEPTION, new IllegalArgumentException("region cannot be null"));
                } else if (idExtractionParameters.getIdType() != null) {
                    this.f4134MN = new CancellationTokenSource();
                    this.f4135MO.mo55143a(new C8481d(idExtractionParameters), this.f4134MN.getToken());
                } else {
                    throw new KmcRuntimeException(ErrorInfo.KMC_GN_ILLEGAL_ARGUMENT_EXCEPTION, new IllegalArgumentException("idType cannot be null"));
                }
            } else {
                throw new KmcRuntimeException(ErrorInfo.KMC_GN_ILLEGAL_ARGUMENT_EXCEPTION, new IllegalArgumentException("listener cannot be null"));
            }
        }
    }

    public void cancel() {
        synchronized (this) {
            if (this.f4134MN != null) {
                this.f4134MN.cancel();
            } else {
                throw new KmcRuntimeException(ErrorInfo.KMC_EV_CANCEL_OPERATION_SUCCESS);
            }
        }
    }

    /* renamed from: oh */
    private C8341b m4311oh() {
        C8479c cVar = new C8479c(new C8546j());
        cVar.mo55142a(this.f4121MA);
        cVar.mo55142a(this.f4122MB);
        cVar.mo55142a(this.f4123MC);
        cVar.mo55142a(this.f4124MD);
        cVar.mo55142a(this.f4125ME);
        cVar.mo55142a(this.f4126MF);
        cVar.mo55142a(this.f4127MG);
        cVar.mo55142a(this.f4128MH);
        cVar.mo55142a(this.f4129MI);
        cVar.mo55142a(this.f4130MJ);
        cVar.mo55142a(this.f4131MK);
        cVar.mo55142a(this.f4132ML);
        cVar.mo55142a(this.f4133MM);
        return cVar;
    }
}
