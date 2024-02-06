package com.kofax.mobile.sdk._internal.dagger;

import android.view.SurfaceView;
import com.kofax.kmc.ken.engines.IDocumentDetector;
import com.kofax.kmc.ken.engines.data.DocumentDetectionResult;
import com.kofax.kmc.ken.engines.data.DocumentDetectionSettings;
import com.kofax.kmc.kui.uicontrols.BarCodeCaptureView;
import com.kofax.kmc.kui.uicontrols.ImageCaptureView;
import com.kofax.kmc.kui.uicontrols.LicenseCaptureView;
import com.kofax.kmc.kui.uicontrols.captureanimations.CheckCaptureExperience;
import com.kofax.kmc.kui.uicontrols.captureanimations.DocumentCaptureExperience;
import com.kofax.kmc.kui.uicontrols.captureanimations.FixedAspectRatioCaptureExperience;
import com.kofax.kmc.kui.uicontrols.captureanimations.PassportCaptureExperience;
import com.kofax.kmc.kui.uicontrols.captureanimations.SelfieCaptureExperience;
import com.kofax.mobile.sdk._internal.C0495c;
import com.kofax.mobile.sdk._internal.C7898e;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.camera.C0500f;
import com.kofax.mobile.sdk._internal.camera.IVideoResourceProvider;
import com.kofax.mobile.sdk._internal.detection.IFaceDetector;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7914k;
import com.kofax.mobile.sdk._internal.extraction.p004id.IIdFieldNameConvention;
import com.kofax.mobile.sdk._internal.impl.ComponentsInitAndBusRegister;
import com.kofax.mobile.sdk._internal.impl.IBase64ImageDecoder;
import com.kofax.mobile.sdk._internal.impl.camera.C0542a;
import com.kofax.mobile.sdk._internal.impl.camera.C0548ad;
import com.kofax.mobile.sdk._internal.impl.camera.C0623n;
import com.kofax.mobile.sdk._internal.impl.camera.C0625p;
import com.kofax.mobile.sdk._internal.impl.camera.VideoPlayerCameraPlayer;
import com.kofax.mobile.sdk._internal.impl.detection.C0669c;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.C7997c;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8129ec;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceExtractionServer;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8175b;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.RttiExtractor;
import com.kofax.mobile.sdk._internal.impl.view.C8228v;
import com.kofax.mobile.sdk._internal.view.C8234b;
import com.kofax.mobile.sdk.capture.IImageStorage;
import com.kofax.mobile.sdk.capture.ImageReviewActivity;
import com.kofax.mobile.sdk.capture.ProcessActivity;
import com.kofax.mobile.sdk.capture.bill.BillCaptureActivity;
import com.kofax.mobile.sdk.capture.bill.BillExtractActivity;
import com.kofax.mobile.sdk.capture.bill.BillParameters;
import com.kofax.mobile.sdk.capture.bill.BillWorkflowActivity;
import com.kofax.mobile.sdk.capture.bill.KtaJsonBill;
import com.kofax.mobile.sdk.capture.bill.RttiJsonBill;
import com.kofax.mobile.sdk.capture.check.CheckCaptureActivity;
import com.kofax.mobile.sdk.capture.check.CheckExtractActivity;
import com.kofax.mobile.sdk.capture.check.CheckParameters;
import com.kofax.mobile.sdk.capture.check.CheckWorkflowActivity;
import com.kofax.mobile.sdk.capture.check.KtaJsonCheck;
import com.kofax.mobile.sdk.capture.check.RttiJsonCheck;
import com.kofax.mobile.sdk.capture.creditcard.CardIoWrapperActivity;
import com.kofax.mobile.sdk.capture.creditcard.CreditCardParameters;
import com.kofax.mobile.sdk.capture.creditcard.CreditCardWorkflowActivity;
import com.kofax.mobile.sdk.capture.p017id.IdCaptureActivity;
import com.kofax.mobile.sdk.capture.p017id.IdCaptureBackActivity;
import com.kofax.mobile.sdk.capture.p017id.IdExtractActivity;
import com.kofax.mobile.sdk.capture.p017id.IdParameters;
import com.kofax.mobile.sdk.capture.p017id.IdWorkflowActivity;
import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import com.kofax.mobile.sdk.capture.passport.KtaJsonPassport;
import com.kofax.mobile.sdk.capture.passport.PassportCaptureActivity;
import com.kofax.mobile.sdk.capture.passport.PassportExtractActivity;
import com.kofax.mobile.sdk.capture.passport.PassportParameters;
import com.kofax.mobile.sdk.capture.passport.PassportWorkflowActivity;
import com.kofax.mobile.sdk.capture.passport.RttiJsonPassport;
import com.kofax.mobile.sdk.extract.p018id.LocalProjectProvider;
import com.kofax.mobile.sdk.extract.p018id.ServerProjectProvider;
import com.kofax.mobile.sdk.p019f.C0884a;
import p040o.HmlRepaymentMethodAboutActivity;

@C0519a
public interface ISdkDaggerPerContextComponent {
    C0542a getAssetProvider();

    BarCodeCaptureView getBarCodeCaptureView();

    BillParameters getBillParameters();

    CheckParameters getCheckParameters();

    CreditCardParameters getCreditCardParameters();

    C0669c getDetectorBasedCropper();

    C0625p getDeviceCamera();

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "IMAGE_CACHE_TYPE_DISK")
    C0495c getDiskBitmapCache();

    ExtractionParameters getExtractionParameters();

    IFaceDetector getFaceDetector();

    C0623n getFileProvider();

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "GPU_DOCUMENT")
    IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> getGpuDocumentDetector();

    C8228v getGuideLineRenderer();

    IBase64ImageDecoder getIBase64ImageDecoder();

    IBus getIBus();

    C0500f getICameraView();

    C8234b getICaptureMenuView();

    C7914k getIIdExtractorProvider();

    IIdFieldNameConvention getIIdFieldNameConvention();

    C7898e getIImageParamsStore();

    IImageStorage getIImageStorage();

    IVideoResourceProvider getIVideoResourceProvider();

    IdParameters getIdParameters();

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "ISG_DOCUMENT")
    IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> getIsgDocumentDetector();

    C7997c getKtaExtraction();

    LocalProjectProvider getLocalProjectProvider();

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "IMAGE_CACHE_TYPE_MEMORY")
    C0495c getMemoryBitmapCache();

    OnDeviceExtractionServer getOnDeviceExtractionServer();

    C8129ec getOnDeviceIdExtractor();

    PassportParameters getPassportParameters();

    C8175b getRttiExtraction();

    RttiExtractor getRttiExtractor();

    SurfaceView getSurfaceView();

    VideoPlayerCameraPlayer getVideoPlayerCameraPlayer();

    C0548ad getVideoPlayerCameraRecorder();

    void inject(ComponentsInitAndBusRegister componentsInitAndBusRegister);

    void inject(ImageReviewActivity imageReviewActivity);

    void inject(ProcessActivity processActivity);

    void inject(BillCaptureActivity billCaptureActivity);

    void inject(BillExtractActivity billExtractActivity);

    void inject(BillWorkflowActivity billWorkflowActivity);

    void inject(CheckCaptureActivity checkCaptureActivity);

    void inject(CheckExtractActivity checkExtractActivity);

    void inject(CheckWorkflowActivity checkWorkflowActivity);

    void inject(CardIoWrapperActivity cardIoWrapperActivity);

    void inject(CreditCardWorkflowActivity creditCardWorkflowActivity);

    void inject(IdCaptureActivity idCaptureActivity);

    void inject(IdCaptureBackActivity idCaptureBackActivity);

    void inject(IdExtractActivity idExtractActivity);

    void inject(IdWorkflowActivity idWorkflowActivity);

    void inject(PassportCaptureActivity passportCaptureActivity);

    void inject(PassportExtractActivity passportExtractActivity);

    void inject(PassportWorkflowActivity passportWorkflowActivity);

    void inject(LocalProjectProvider localProjectProvider);

    void inject(ServerProjectProvider serverProjectProvider);

    void inject(C0884a aVar);

    void injectMembers(BarCodeCaptureView barCodeCaptureView);

    void injectMembers(ImageCaptureView imageCaptureView);

    void injectMembers(LicenseCaptureView licenseCaptureView);

    void injectMembers(CheckCaptureExperience checkCaptureExperience);

    void injectMembers(DocumentCaptureExperience documentCaptureExperience);

    void injectMembers(FixedAspectRatioCaptureExperience fixedAspectRatioCaptureExperience);

    void injectMembers(PassportCaptureExperience passportCaptureExperience);

    void injectMembers(SelfieCaptureExperience selfieCaptureExperience);

    void injectMembers(C8129ec ecVar);

    void injectMembers(BillParameters billParameters);

    void injectMembers(KtaJsonBill ktaJsonBill);

    void injectMembers(RttiJsonBill rttiJsonBill);

    void injectMembers(CheckParameters checkParameters);

    void injectMembers(KtaJsonCheck ktaJsonCheck);

    void injectMembers(RttiJsonCheck rttiJsonCheck);

    void injectMembers(CreditCardParameters creditCardParameters);

    void injectMembers(IdParameters idParameters);

    void injectMembers(KtaJsonPassport ktaJsonPassport);

    void injectMembers(PassportParameters passportParameters);

    void injectMembers(RttiJsonPassport rttiJsonPassport);
}
