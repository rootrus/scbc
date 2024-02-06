package com.kofax.mobile.sdk._internal.dagger;

import android.content.Context;
import android.net.ConnectivityManager;
import android.view.SurfaceView;
import com.kofax.kmc.ken.engines.CheckDetector;
import com.kofax.kmc.ken.engines.DetectionModule;
import com.kofax.kmc.ken.engines.DetectionModule_GetFaceDetectorFactory;
import com.kofax.kmc.ken.engines.DetectionModule_GetForcedDocumentDetectorFactory;
import com.kofax.kmc.ken.engines.DocumentDetector;
import com.kofax.kmc.ken.engines.ForcedGpuDocumentDetector_Factory;
import com.kofax.kmc.ken.engines.ForcedIsgDocumentDetector_Factory;
import com.kofax.kmc.ken.engines.GpuDetectionModule;
import com.kofax.kmc.ken.engines.GpuDetectionModule_GetCombinedDocumentDetectionFactory;
import com.kofax.kmc.ken.engines.GpuDetectionModule_GetDocumentDetectorFactory;
import com.kofax.kmc.ken.engines.GpuDetectionModule_GetForcedDocumentDetectionFactory;
import com.kofax.kmc.ken.engines.GpuDetectionModule_GetForcedDocumentDetectorFactory;
import com.kofax.kmc.ken.engines.GpuDetectionModule_GetIGPUImageHolderFactory;
import com.kofax.kmc.ken.engines.GpuDocumentDetector;
import com.kofax.kmc.ken.engines.ICheckDetector;
import com.kofax.kmc.ken.engines.IDocumentDetector;
import com.kofax.kmc.ken.engines.IPassportDetector;
import com.kofax.kmc.ken.engines.ImageProcessor;
import com.kofax.kmc.ken.engines.IsgDetectionModule;
import com.kofax.kmc.ken.engines.IsgDetectionModule_GetDocumentDetectorFactory;
import com.kofax.kmc.ken.engines.IsgDetectionModule_GetForcedDocumentDetectorFactory;
import com.kofax.kmc.ken.engines.IsgDocumentDetector_Factory;
import com.kofax.kmc.ken.engines.PassportDetector;
import com.kofax.kmc.ken.engines.data.DocumentDetectionResult;
import com.kofax.kmc.ken.engines.data.DocumentDetectionSettings;
import com.kofax.kmc.ken.engines.gpu.GPUImageHolderImpl_Factory;
import com.kofax.kmc.ken.engines.gpu.GPUStrategyCombinedEdgeDetection;
import com.kofax.kmc.ken.engines.gpu.GPUStrategyCombinedEdgeDetection_Factory;
import com.kofax.kmc.ken.engines.gpu.GPUStrategyEdgeDetection;
import com.kofax.kmc.ken.engines.gpu.GPUStrategyFocusFactorDetection_Factory;
import com.kofax.kmc.ken.engines.gpu.GPUStrategyForcedEdgeDetection_Factory;
import com.kofax.kmc.ken.engines.gpu.IGPUImageHolder;
import com.kofax.kmc.kui.uicontrols.BarCodeCaptureView;
import com.kofax.kmc.kui.uicontrols.BarCodeCaptureView_Factory;
import com.kofax.kmc.kui.uicontrols.BarCodeCaptureView_MembersInjector;
import com.kofax.kmc.kui.uicontrols.ImageCaptureView;
import com.kofax.kmc.kui.uicontrols.ImageCaptureView_Factory;
import com.kofax.kmc.kui.uicontrols.ImageCaptureView_MembersInjector;
import com.kofax.kmc.kui.uicontrols.LicenseCaptureView;
import com.kofax.kmc.kui.uicontrols.LicenseCaptureView_MembersInjector;
import com.kofax.kmc.kui.uicontrols.captureanimations.CaptureAnimationsModule;
import com.kofax.kmc.kui.uicontrols.captureanimations.CaptureAnimationsModule_ProvideIDocumentBaseOverlayViewFactory;
import com.kofax.kmc.kui.uicontrols.captureanimations.CaptureAnimationsModule_ProvideIISelfieOverlayViewFactory;
import com.kofax.kmc.kui.uicontrols.captureanimations.CheckCaptureExperience;
import com.kofax.kmc.kui.uicontrols.captureanimations.CheckCaptureExperience_MembersInjector;
import com.kofax.kmc.kui.uicontrols.captureanimations.DocumentBaseCaptureExperience_MembersInjector;
import com.kofax.kmc.kui.uicontrols.captureanimations.DocumentBaseOverlayView_Factory;
import com.kofax.kmc.kui.uicontrols.captureanimations.DocumentCaptureExperience;
import com.kofax.kmc.kui.uicontrols.captureanimations.DocumentCaptureExperience_MembersInjector;
import com.kofax.kmc.kui.uicontrols.captureanimations.FixedAspectRatioCaptureExperience;
import com.kofax.kmc.kui.uicontrols.captureanimations.FixedAspectRatioCaptureExperience_MembersInjector;
import com.kofax.kmc.kui.uicontrols.captureanimations.IDocumentBaseOverlayView;
import com.kofax.kmc.kui.uicontrols.captureanimations.ILicenseOverlayView;
import com.kofax.kmc.kui.uicontrols.captureanimations.LicenseOverlayView;
import com.kofax.kmc.kui.uicontrols.captureanimations.LicenseOverlayView_Factory;
import com.kofax.kmc.kui.uicontrols.captureanimations.PassportCaptureExperience;
import com.kofax.kmc.kui.uicontrols.captureanimations.PassportCaptureExperience_MembersInjector;
import com.kofax.kmc.kui.uicontrols.captureanimations.SelfieBaseCaptureExperience_MembersInjector;
import com.kofax.kmc.kui.uicontrols.captureanimations.SelfieCaptureExperience;
import com.kofax.kmc.kui.uicontrols.captureanimations.SelfieCaptureExperience_MembersInjector;
import com.kofax.mobile.sdk._internal.C0495c;
import com.kofax.mobile.sdk._internal.C7888b;
import com.kofax.mobile.sdk._internal.C7898e;
import com.kofax.mobile.sdk._internal.C7918f;
import com.kofax.mobile.sdk._internal.C7919g;
import com.kofax.mobile.sdk._internal.C7921h;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.IImageToByteArray;
import com.kofax.mobile.sdk._internal.camera.C0500f;
import com.kofax.mobile.sdk._internal.camera.C0503i;
import com.kofax.mobile.sdk._internal.camera.C0509q;
import com.kofax.mobile.sdk._internal.camera.C0511t;
import com.kofax.mobile.sdk._internal.camera.C0512u;
import com.kofax.mobile.sdk._internal.camera.C7890l;
import com.kofax.mobile.sdk._internal.camera.C7891m;
import com.kofax.mobile.sdk._internal.camera.C7893v;
import com.kofax.mobile.sdk._internal.camera.IVideoResourceProvider;
import com.kofax.mobile.sdk._internal.capture.C0513a;
import com.kofax.mobile.sdk._internal.capture.C0516e;
import com.kofax.mobile.sdk._internal.capture.C0517g;
import com.kofax.mobile.sdk._internal.capture.C7895f;
import com.kofax.mobile.sdk._internal.detection.IFaceDetector;
import com.kofax.mobile.sdk._internal.extraction.C7900b;
import com.kofax.mobile.sdk._internal.extraction.C7901c;
import com.kofax.mobile.sdk._internal.extraction.C7904g;
import com.kofax.mobile.sdk._internal.extraction.IExceptionResponseDeserializer;
import com.kofax.mobile.sdk._internal.extraction.IExtractionServer;
import com.kofax.mobile.sdk._internal.extraction.IJsonExactionHelper;
import com.kofax.mobile.sdk._internal.extraction.p004id.C0529g;
import com.kofax.mobile.sdk._internal.extraction.p004id.C0531n;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7906a;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7907b;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7908c;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7909d;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7910e;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7911f;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7913j;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7914k;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7915l;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7916m;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7917o;
import com.kofax.mobile.sdk._internal.extraction.p004id.IIdFieldNameConvention;
import com.kofax.mobile.sdk._internal.impl.C0533aa;
import com.kofax.mobile.sdk._internal.impl.C0726i;
import com.kofax.mobile.sdk._internal.impl.C0727j;
import com.kofax.mobile.sdk._internal.impl.C0728k;
import com.kofax.mobile.sdk._internal.impl.C0730m;
import com.kofax.mobile.sdk._internal.impl.C0731n;
import com.kofax.mobile.sdk._internal.impl.C0732o;
import com.kofax.mobile.sdk._internal.impl.C0764y;
import com.kofax.mobile.sdk._internal.impl.C7924ac;
import com.kofax.mobile.sdk._internal.impl.C7926b;
import com.kofax.mobile.sdk._internal.impl.C7942d;
import com.kofax.mobile.sdk._internal.impl.C8190q;
import com.kofax.mobile.sdk._internal.impl.C8194s;
import com.kofax.mobile.sdk._internal.impl.C8196u;
import com.kofax.mobile.sdk._internal.impl.C8231w;
import com.kofax.mobile.sdk._internal.impl.ComponentsInitAndBusRegister;
import com.kofax.mobile.sdk._internal.impl.IBase64ImageDecoder;
import com.kofax.mobile.sdk._internal.impl.camera.C0542a;
import com.kofax.mobile.sdk._internal.impl.camera.C0543aa;
import com.kofax.mobile.sdk._internal.impl.camera.C0547ab;
import com.kofax.mobile.sdk._internal.impl.camera.C0548ad;
import com.kofax.mobile.sdk._internal.impl.camera.C0556ag;
import com.kofax.mobile.sdk._internal.impl.camera.C0558ah;
import com.kofax.mobile.sdk._internal.impl.camera.C0562ak;
import com.kofax.mobile.sdk._internal.impl.camera.C0563al;
import com.kofax.mobile.sdk._internal.impl.camera.C0564am;
import com.kofax.mobile.sdk._internal.impl.camera.C0569an;
import com.kofax.mobile.sdk._internal.impl.camera.C0570ao;
import com.kofax.mobile.sdk._internal.impl.camera.C0571aq;
import com.kofax.mobile.sdk._internal.impl.camera.C0573ar;
import com.kofax.mobile.sdk._internal.impl.camera.C0574b;
import com.kofax.mobile.sdk._internal.impl.camera.C0576d;
import com.kofax.mobile.sdk._internal.impl.camera.C0607g;
import com.kofax.mobile.sdk._internal.impl.camera.C0608h;
import com.kofax.mobile.sdk._internal.impl.camera.C0618i;
import com.kofax.mobile.sdk._internal.impl.camera.C0619j;
import com.kofax.mobile.sdk._internal.impl.camera.C0620k;
import com.kofax.mobile.sdk._internal.impl.camera.C0621l;
import com.kofax.mobile.sdk._internal.impl.camera.C0622m;
import com.kofax.mobile.sdk._internal.impl.camera.C0623n;
import com.kofax.mobile.sdk._internal.impl.camera.C0624o;
import com.kofax.mobile.sdk._internal.impl.camera.C0625p;
import com.kofax.mobile.sdk._internal.impl.camera.C0636r;
import com.kofax.mobile.sdk._internal.impl.camera.C7931as;
import com.kofax.mobile.sdk._internal.impl.camera.C7935s;
import com.kofax.mobile.sdk._internal.impl.camera.C7937u;
import com.kofax.mobile.sdk._internal.impl.camera.VideoPlayerCameraPlayer;
import com.kofax.mobile.sdk._internal.impl.camera.focus.C0579a;
import com.kofax.mobile.sdk._internal.impl.camera.focus.C0582b;
import com.kofax.mobile.sdk._internal.impl.camera.focus.C0585e;
import com.kofax.mobile.sdk._internal.impl.camera.focus.C0590g;
import com.kofax.mobile.sdk._internal.impl.camera.focus.C0592i;
import com.kofax.mobile.sdk._internal.impl.camera.focus.C0596j;
import com.kofax.mobile.sdk._internal.impl.camera.focus.C0600n;
import com.kofax.mobile.sdk._internal.impl.camera.focus.C0605q;
import com.kofax.mobile.sdk._internal.impl.camera.focus.FocusStatistics;
import com.kofax.mobile.sdk._internal.impl.detection.C0669c;
import com.kofax.mobile.sdk._internal.impl.detection.C0671d;
import com.kofax.mobile.sdk._internal.impl.detection.C7944e;
import com.kofax.mobile.sdk._internal.impl.detection.FixedAspectRatioDetector;
import com.kofax.mobile.sdk._internal.impl.event.C0675a;
import com.kofax.mobile.sdk._internal.impl.event.C0689b;
import com.kofax.mobile.sdk._internal.impl.extraction.C0703g;
import com.kofax.mobile.sdk._internal.impl.extraction.C7986b;
import com.kofax.mobile.sdk._internal.impl.extraction.C7988d;
import com.kofax.mobile.sdk._internal.impl.extraction.C7990h;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.C7995a;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.C7997c;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.C8010j;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.IKtaSessionIdProviderFactory;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaServiceCaller;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C0704a;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C0705ah;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C0707ai;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C0708ak;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C0709bj;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C0710br;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C0711bt;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C0712bv;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C0713cf;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C0714ci;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C0715cl;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C0716dr;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C0717dt;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C0718dy;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C0720f;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C0721l;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C0722m;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C0724z;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8028aa;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8030ac;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8035af;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8038ag;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8039aj;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8040al;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8041am;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8042an;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8043ao;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8044ap;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8046ar;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8047as;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8048at;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8049au;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8050av;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8051aw;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8052ax;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8053ay;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8054az;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8056ba;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8057bb;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8058bc;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8059bd;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8060be;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8061bf;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8062bg;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8063bh;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8064bi;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8065bk;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8066bl;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8067bm;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8068bn;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8069bo;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8070bp;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8071bq;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8073bu;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8074bw;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8075bx;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8076by;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8077bz;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8078c;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8080ca;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8081cb;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8082cc;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8083cd;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8084ce;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8085cg;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8086ch;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8087cj;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8088ck;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8089cm;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8090cn;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8091co;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8092cp;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8093cq;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8094cr;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8095cs;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8096ct;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8097cu;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8098cv;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8099cw;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8100cx;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8101cy;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8102cz;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8104da;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8105db;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8106dc;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8107dd;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8108de;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8109df;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8110dg;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8111dh;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8112di;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8113dj;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8114dk;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8115dl;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8116dm;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8117dn;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8118do;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8119dp;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8121ds;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8122du;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8123dv;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8124dw;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8125dx;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8126dz;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8127ea;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8128eb;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8129ec;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8133ef;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8135eh;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8137ej;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8138ek;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8140em;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8144h;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8146j;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8150o;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8151p;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8165r;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8166s;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8168u;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8172x;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceExtractionServer;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8174a;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8175b;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8184g;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.RttiExtractor;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.RttiJsonExactionHelper;
import com.kofax.mobile.sdk._internal.impl.view.C0734a;
import com.kofax.mobile.sdk._internal.impl.view.C0735aa;
import com.kofax.mobile.sdk._internal.impl.view.C0738ac;
import com.kofax.mobile.sdk._internal.impl.view.C0739ag;
import com.kofax.mobile.sdk._internal.impl.view.C0740ap;
import com.kofax.mobile.sdk._internal.impl.view.C0741aq;
import com.kofax.mobile.sdk._internal.impl.view.C0742ar;
import com.kofax.mobile.sdk._internal.impl.view.C0743b;
import com.kofax.mobile.sdk._internal.impl.view.C0744e;
import com.kofax.mobile.sdk._internal.impl.view.C0745f;
import com.kofax.mobile.sdk._internal.impl.view.C0746g;
import com.kofax.mobile.sdk._internal.impl.view.C0749i;
import com.kofax.mobile.sdk._internal.impl.view.C0751l;
import com.kofax.mobile.sdk._internal.impl.view.C0753m;
import com.kofax.mobile.sdk._internal.impl.view.C0754n;
import com.kofax.mobile.sdk._internal.impl.view.C0755o;
import com.kofax.mobile.sdk._internal.impl.view.C0757q;
import com.kofax.mobile.sdk._internal.impl.view.C0759r;
import com.kofax.mobile.sdk._internal.impl.view.C0760s;
import com.kofax.mobile.sdk._internal.impl.view.C0763y;
import com.kofax.mobile.sdk._internal.impl.view.C8200ab;
import com.kofax.mobile.sdk._internal.impl.view.C8207ai;
import com.kofax.mobile.sdk._internal.impl.view.C8211ak;
import com.kofax.mobile.sdk._internal.impl.view.C8212al;
import com.kofax.mobile.sdk._internal.impl.view.C8213am;
import com.kofax.mobile.sdk._internal.impl.view.C8214an;
import com.kofax.mobile.sdk._internal.impl.view.C8215ao;
import com.kofax.mobile.sdk._internal.impl.view.C8217c;
import com.kofax.mobile.sdk._internal.impl.view.C8228v;
import com.kofax.mobile.sdk._internal.impl.view.SelfieOverlayView;
import com.kofax.mobile.sdk._internal.view.C0769a;
import com.kofax.mobile.sdk._internal.view.C0770c;
import com.kofax.mobile.sdk._internal.view.C0771d;
import com.kofax.mobile.sdk._internal.view.C0772e;
import com.kofax.mobile.sdk._internal.view.C0773f;
import com.kofax.mobile.sdk._internal.view.C0774g;
import com.kofax.mobile.sdk._internal.view.C0775i;
import com.kofax.mobile.sdk._internal.view.C0776j;
import com.kofax.mobile.sdk._internal.view.C0777k;
import com.kofax.mobile.sdk._internal.view.C0778o;
import com.kofax.mobile.sdk._internal.view.C8234b;
import com.kofax.mobile.sdk._internal.view.C8236l;
import com.kofax.mobile.sdk._internal.view.C8237m;
import com.kofax.mobile.sdk._internal.view.C8238n;
import com.kofax.mobile.sdk._internal.view.IOverlayView;
import com.kofax.mobile.sdk.capture.CaptureActivity_MembersInjector;
import com.kofax.mobile.sdk.capture.ExtractActivity_MembersInjector;
import com.kofax.mobile.sdk.capture.IImageStorage;
import com.kofax.mobile.sdk.capture.ImageReviewActivity;
import com.kofax.mobile.sdk.capture.ImageReviewActivity_MembersInjector;
import com.kofax.mobile.sdk.capture.ProcessActivity;
import com.kofax.mobile.sdk.capture.ProcessActivity_MembersInjector;
import com.kofax.mobile.sdk.capture.bill.BillCaptureActivity;
import com.kofax.mobile.sdk.capture.bill.BillCaptureActivity_MembersInjector;
import com.kofax.mobile.sdk.capture.bill.BillCaptureModule;
import com.kofax.mobile.sdk.capture.bill.BillCaptureModule_GetExtractionParametersFactory;
import com.kofax.mobile.sdk.capture.bill.BillCaptureModule_GetIBillDeserializerKtaFactory;
import com.kofax.mobile.sdk.capture.bill.BillCaptureModule_GetIBillDeserializerRttiFactory;
import com.kofax.mobile.sdk.capture.bill.BillCaptureModule_GetIExceptionResponseDeserializerKtaFactory;
import com.kofax.mobile.sdk.capture.bill.BillCaptureModule_GetIExceptionResponseDeserializerRttiFactory;
import com.kofax.mobile.sdk.capture.bill.BillCaptureModule_GetIExtractionServerKtaFactory;
import com.kofax.mobile.sdk.capture.bill.BillCaptureModule_GetIExtractionServerRttiFactory;
import com.kofax.mobile.sdk.capture.bill.BillCaptureModule_GetIJsonExactionHelperKtaFactory;
import com.kofax.mobile.sdk.capture.bill.BillCaptureModule_GetIJsonExactionHelperRttiFactory;
import com.kofax.mobile.sdk.capture.bill.BillCaptureModule_GetIParametersFactory;
import com.kofax.mobile.sdk.capture.bill.BillCaptureModule_GetLookAndFeelParametersFactory;
import com.kofax.mobile.sdk.capture.bill.BillCaptureModule_GetProcessingParametersFactory;
import com.kofax.mobile.sdk.capture.bill.BillCaptureModule_GetUriKtaFactory;
import com.kofax.mobile.sdk.capture.bill.BillCaptureModule_GetUriRttiFactory;
import com.kofax.mobile.sdk.capture.bill.BillCaptureModule_KtaExceptionResponseDeserializer_Factory;
import com.kofax.mobile.sdk.capture.bill.BillCaptureModule_RttiExceptionResponseDeserializer_Factory;
import com.kofax.mobile.sdk.capture.bill.BillExtractActivity;
import com.kofax.mobile.sdk.capture.bill.BillExtractActivity_MembersInjector;
import com.kofax.mobile.sdk.capture.bill.BillExtractor;
import com.kofax.mobile.sdk.capture.bill.BillExtractor_Factory;
import com.kofax.mobile.sdk.capture.bill.BillExtractor_MembersInjector;
import com.kofax.mobile.sdk.capture.bill.BillParameters;
import com.kofax.mobile.sdk.capture.bill.BillParameters_Factory;
import com.kofax.mobile.sdk.capture.bill.BillParameters_MembersInjector;
import com.kofax.mobile.sdk.capture.bill.BillWorkflowActivity;
import com.kofax.mobile.sdk.capture.bill.BillWorkflowActivity_MembersInjector;
import com.kofax.mobile.sdk.capture.bill.IBillDeserializer;
import com.kofax.mobile.sdk.capture.bill.KtaBillExtractor;
import com.kofax.mobile.sdk.capture.bill.KtaJsonBill;
import com.kofax.mobile.sdk.capture.bill.KtaJsonBill_MembersInjector;
import com.kofax.mobile.sdk.capture.bill.RttiBillExtractor;
import com.kofax.mobile.sdk.capture.bill.RttiJsonBill;
import com.kofax.mobile.sdk.capture.bill.RttiJsonBill_MembersInjector;
import com.kofax.mobile.sdk.capture.check.CheckCaptureActivity;
import com.kofax.mobile.sdk.capture.check.CheckCaptureActivity_MembersInjector;
import com.kofax.mobile.sdk.capture.check.CheckCaptureModule;
import com.kofax.mobile.sdk.capture.check.CheckCaptureModule_GetExtractionParametersFactory;
import com.kofax.mobile.sdk.capture.check.CheckCaptureModule_GetICheckDeserializerKtaFactory;
import com.kofax.mobile.sdk.capture.check.CheckCaptureModule_GetICheckDeserializerRttiFactory;
import com.kofax.mobile.sdk.capture.check.CheckCaptureModule_GetICheckDetectorFactory;
import com.kofax.mobile.sdk.capture.check.CheckCaptureModule_GetIExceptionResponseDeserializerKtaFactory;
import com.kofax.mobile.sdk.capture.check.CheckCaptureModule_GetIExceptionResponseDeserializerRttiFactory;
import com.kofax.mobile.sdk.capture.check.CheckCaptureModule_GetIExtractionServerKtaFactory;
import com.kofax.mobile.sdk.capture.check.CheckCaptureModule_GetIExtractionServerRttiFactory;
import com.kofax.mobile.sdk.capture.check.CheckCaptureModule_GetIJsonExactionHelperKtaFactory;
import com.kofax.mobile.sdk.capture.check.CheckCaptureModule_GetIJsonExactionHelperRttiFactory;
import com.kofax.mobile.sdk.capture.check.CheckCaptureModule_GetIParametersFactory;
import com.kofax.mobile.sdk.capture.check.CheckCaptureModule_GetLookAndFeelParametersFactory;
import com.kofax.mobile.sdk.capture.check.CheckCaptureModule_GetProcessingParametersFactory;
import com.kofax.mobile.sdk.capture.check.CheckCaptureModule_GetUriKtaFactory;
import com.kofax.mobile.sdk.capture.check.CheckCaptureModule_GetUriRttiFactory;
import com.kofax.mobile.sdk.capture.check.CheckCaptureModule_KtaExceptionResponseDeserializer_Factory;
import com.kofax.mobile.sdk.capture.check.CheckCaptureModule_RttiExceptionResponseDeserializer_Factory;
import com.kofax.mobile.sdk.capture.check.CheckExtractActivity;
import com.kofax.mobile.sdk.capture.check.CheckExtractActivity_MembersInjector;
import com.kofax.mobile.sdk.capture.check.CheckExtractor;
import com.kofax.mobile.sdk.capture.check.CheckExtractor_Factory;
import com.kofax.mobile.sdk.capture.check.CheckExtractor_MembersInjector;
import com.kofax.mobile.sdk.capture.check.CheckParameters;
import com.kofax.mobile.sdk.capture.check.CheckParameters_Factory;
import com.kofax.mobile.sdk.capture.check.CheckParameters_MembersInjector;
import com.kofax.mobile.sdk.capture.check.CheckWorkflowActivity;
import com.kofax.mobile.sdk.capture.check.CheckWorkflowActivity_MembersInjector;
import com.kofax.mobile.sdk.capture.check.ICheckDeserializer;
import com.kofax.mobile.sdk.capture.check.ICheckExtractionServer;
import com.kofax.mobile.sdk.capture.check.KtaCheckExtractor;
import com.kofax.mobile.sdk.capture.check.KtaJsonCheck;
import com.kofax.mobile.sdk.capture.check.KtaJsonCheck_MembersInjector;
import com.kofax.mobile.sdk.capture.check.RttiCheckExtractor;
import com.kofax.mobile.sdk.capture.check.RttiJsonCheck;
import com.kofax.mobile.sdk.capture.check.RttiJsonCheck_MembersInjector;
import com.kofax.mobile.sdk.capture.creditcard.CardIoWrapperActivity;
import com.kofax.mobile.sdk.capture.creditcard.CreditCardCaptureModule;
import com.kofax.mobile.sdk.capture.creditcard.CreditCardCaptureModule_GetExtractionParametersFactory;
import com.kofax.mobile.sdk.capture.creditcard.CreditCardCaptureModule_GetLookAndFeelParametersFactory;
import com.kofax.mobile.sdk.capture.creditcard.CreditCardCaptureModule_GetProcessingParametersFactory;
import com.kofax.mobile.sdk.capture.creditcard.CreditCardParameters;
import com.kofax.mobile.sdk.capture.creditcard.CreditCardParameters_Factory;
import com.kofax.mobile.sdk.capture.creditcard.CreditCardParameters_MembersInjector;
import com.kofax.mobile.sdk.capture.creditcard.CreditCardWorkflowActivity;
import com.kofax.mobile.sdk.capture.p017id.IIdDeserializer;
import com.kofax.mobile.sdk.capture.p017id.IIdExtractionServer;
import com.kofax.mobile.sdk.capture.p017id.IdCaptureActivity;
import com.kofax.mobile.sdk.capture.p017id.IdCaptureActivity_MembersInjector;
import com.kofax.mobile.sdk.capture.p017id.IdCaptureBackActivity;
import com.kofax.mobile.sdk.capture.p017id.IdCaptureBackActivity_MembersInjector;
import com.kofax.mobile.sdk.capture.p017id.IdCaptureModule;
import com.kofax.mobile.sdk.capture.p017id.IdCaptureModule_GetExtractionParametersFactory;
import com.kofax.mobile.sdk.capture.p017id.IdCaptureModule_GetIExceptionResponseDeserializerKtaFactory;
import com.kofax.mobile.sdk.capture.p017id.IdCaptureModule_GetIExceptionResponseDeserializerOnDeviceFactory;
import com.kofax.mobile.sdk.capture.p017id.IdCaptureModule_GetIExceptionResponseDeserializerRttiFactory;
import com.kofax.mobile.sdk.capture.p017id.IdCaptureModule_GetIIdDeserializerKtaFactory;
import com.kofax.mobile.sdk.capture.p017id.IdCaptureModule_GetIIdDeserializerOnDeviceFactory;
import com.kofax.mobile.sdk.capture.p017id.IdCaptureModule_GetIIdDeserializerRttiFactory;
import com.kofax.mobile.sdk.capture.p017id.IdCaptureModule_GetIIdExtractionServerKtaFactory;
import com.kofax.mobile.sdk.capture.p017id.IdCaptureModule_GetIIdExtractionServerOnDeviceFactory;
import com.kofax.mobile.sdk.capture.p017id.IdCaptureModule_GetIIdExtractionServerRttiFactory;
import com.kofax.mobile.sdk.capture.p017id.IdCaptureModule_GetLookAndFeelParametersFactory;
import com.kofax.mobile.sdk.capture.p017id.IdCaptureModule_GetProcessingParametersFactory;
import com.kofax.mobile.sdk.capture.p017id.IdCaptureModule_GetUriKtaFactory;
import com.kofax.mobile.sdk.capture.p017id.IdCaptureModule_GetUriRttiFactory;
import com.kofax.mobile.sdk.capture.p017id.IdCaptureModule_KtaExceptionResponseDeserializer_Factory;
import com.kofax.mobile.sdk.capture.p017id.IdCaptureModule_RttiExceptionResponseDeserializer_Factory;
import com.kofax.mobile.sdk.capture.p017id.IdExtractActivity;
import com.kofax.mobile.sdk.capture.p017id.IdExtractActivity_MembersInjector;
import com.kofax.mobile.sdk.capture.p017id.IdExtractor;
import com.kofax.mobile.sdk.capture.p017id.IdExtractor_Factory;
import com.kofax.mobile.sdk.capture.p017id.IdExtractor_MembersInjector;
import com.kofax.mobile.sdk.capture.p017id.IdParameters;
import com.kofax.mobile.sdk.capture.p017id.IdParameters_Factory;
import com.kofax.mobile.sdk.capture.p017id.IdParameters_MembersInjector;
import com.kofax.mobile.sdk.capture.p017id.IdWorkflowActivity;
import com.kofax.mobile.sdk.capture.p017id.IdWorkflowActivity_MembersInjector;
import com.kofax.mobile.sdk.capture.p017id.KtaIdExtractor;
import com.kofax.mobile.sdk.capture.p017id.RttiIdExtractor;
import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import com.kofax.mobile.sdk.capture.parameter.IParameters;
import com.kofax.mobile.sdk.capture.parameter.LookAndFeelParameters;
import com.kofax.mobile.sdk.capture.parameter.ProcessingParameters;
import com.kofax.mobile.sdk.capture.passport.C8329x206b8e03;
import com.kofax.mobile.sdk.capture.passport.C8330x9b852ec2;
import com.kofax.mobile.sdk.capture.passport.C8331x2ace65f3;
import com.kofax.mobile.sdk.capture.passport.IPassportDeserializer;
import com.kofax.mobile.sdk.capture.passport.KtaJsonPassport;
import com.kofax.mobile.sdk.capture.passport.KtaJsonPassport_MembersInjector;
import com.kofax.mobile.sdk.capture.passport.KtaPassportExtractor;
import com.kofax.mobile.sdk.capture.passport.PassportCaptureActivity;
import com.kofax.mobile.sdk.capture.passport.PassportCaptureActivity_MembersInjector;
import com.kofax.mobile.sdk.capture.passport.PassportCaptureModule;
import com.kofax.mobile.sdk.capture.passport.PassportCaptureModule_GetExtractionParametersFactory;
import com.kofax.mobile.sdk.capture.passport.PassportCaptureModule_GetIExtractionServerKtaFactory;
import com.kofax.mobile.sdk.capture.passport.PassportCaptureModule_GetIExtractionServerRttiFactory;
import com.kofax.mobile.sdk.capture.passport.PassportCaptureModule_GetIJsonExactionHelperKtaFactory;
import com.kofax.mobile.sdk.capture.passport.PassportCaptureModule_GetIJsonExactionHelperRttiFactory;
import com.kofax.mobile.sdk.capture.passport.PassportCaptureModule_GetIParametersFactory;
import com.kofax.mobile.sdk.capture.passport.PassportCaptureModule_GetIPassportDeserializerKtaFactory;
import com.kofax.mobile.sdk.capture.passport.PassportCaptureModule_GetIPassportDeserializerRttiFactory;
import com.kofax.mobile.sdk.capture.passport.PassportCaptureModule_GetIPassportDetectorFactory;
import com.kofax.mobile.sdk.capture.passport.PassportCaptureModule_GetLookAndFeelParametersFactory;
import com.kofax.mobile.sdk.capture.passport.PassportCaptureModule_GetOnDeviceExtractionServerFactory;
import com.kofax.mobile.sdk.capture.passport.PassportCaptureModule_GetOnDevicePassportDeserializerFactory;
import com.kofax.mobile.sdk.capture.passport.PassportCaptureModule_GetProcessingParametersFactory;
import com.kofax.mobile.sdk.capture.passport.PassportCaptureModule_GetUriKtaFactory;
import com.kofax.mobile.sdk.capture.passport.PassportCaptureModule_GetUriRttiFactory;
import com.kofax.mobile.sdk.capture.passport.PassportCaptureModule_KtaExceptionResponseDeserializer_Factory;
import com.kofax.mobile.sdk.capture.passport.PassportCaptureModule_OnDevicePassportDeserializer_Factory;
import com.kofax.mobile.sdk.capture.passport.PassportCaptureModule_PassportOnDeviceExtractionServer_Factory;
import com.kofax.mobile.sdk.capture.passport.PassportCaptureModule_RttiExceptionResponseDeserializer_Factory;
import com.kofax.mobile.sdk.capture.passport.PassportExtractActivity;
import com.kofax.mobile.sdk.capture.passport.PassportExtractActivity_MembersInjector;
import com.kofax.mobile.sdk.capture.passport.PassportExtractor;
import com.kofax.mobile.sdk.capture.passport.PassportExtractor_Factory;
import com.kofax.mobile.sdk.capture.passport.PassportExtractor_MembersInjector;
import com.kofax.mobile.sdk.capture.passport.PassportParameters;
import com.kofax.mobile.sdk.capture.passport.PassportParameters_Factory;
import com.kofax.mobile.sdk.capture.passport.PassportParameters_MembersInjector;
import com.kofax.mobile.sdk.capture.passport.PassportWorkflowActivity;
import com.kofax.mobile.sdk.capture.passport.PassportWorkflowActivity_MembersInjector;
import com.kofax.mobile.sdk.capture.passport.RttiJsonPassport;
import com.kofax.mobile.sdk.capture.passport.RttiJsonPassport_MembersInjector;
import com.kofax.mobile.sdk.capture.passport.RttiPassportExtractor;
import com.kofax.mobile.sdk.capture.processing.IImageProcessor;
import com.kofax.mobile.sdk.extract.p018id.IIdExtractor;
import com.kofax.mobile.sdk.extract.p018id.IProjectProvider;
import com.kofax.mobile.sdk.extract.p018id.LocalProjectProvider;
import com.kofax.mobile.sdk.extract.p018id.LocalProjectProvider_MembersInjector;
import com.kofax.mobile.sdk.extract.p018id.OnDeviceIdExtractor;
import com.kofax.mobile.sdk.extract.p018id.OnDeviceIdExtractor_Factory;
import com.kofax.mobile.sdk.extract.p018id.OnDeviceIdExtractor_MembersInjector;
import com.kofax.mobile.sdk.extract.p018id.ServerProjectProvider;
import com.kofax.mobile.sdk.extract.p018id.ServerProjectProvider_MembersInjector;
import com.kofax.mobile.sdk.extract.p018id.bundle.BundleCacheProvider;
import com.kofax.mobile.sdk.extract.p018id.bundle.IBundleCacheProvider;
import com.kofax.mobile.sdk.p006ab.C0786a;
import com.kofax.mobile.sdk.p006ab.C0787b;
import com.kofax.mobile.sdk.p007ac.C0788a;
import com.kofax.mobile.sdk.p007ac.C0789b;
import com.kofax.mobile.sdk.p008ad.C0790a;
import com.kofax.mobile.sdk.p008ad.C0791b;
import com.kofax.mobile.sdk.p009ae.C8247b;
import com.kofax.mobile.sdk.p010af.C0799b;
import com.kofax.mobile.sdk.p010af.C0801d;
import com.kofax.mobile.sdk.p010af.C0804e;
import com.kofax.mobile.sdk.p010af.C0805f;
import com.kofax.mobile.sdk.p010af.C0806g;
import com.kofax.mobile.sdk.p010af.C0807j;
import com.kofax.mobile.sdk.p011ag.C0808a;
import com.kofax.mobile.sdk.p012ah.C0810a;
import com.kofax.mobile.sdk.p012ah.C0811aa;
import com.kofax.mobile.sdk.p012ah.C0812ab;
import com.kofax.mobile.sdk.p012ah.C0813ac;
import com.kofax.mobile.sdk.p012ah.C0814ae;
import com.kofax.mobile.sdk.p012ah.C0815ah;
import com.kofax.mobile.sdk.p012ah.C0816ao;
import com.kofax.mobile.sdk.p012ah.C0817as;
import com.kofax.mobile.sdk.p012ah.C0818at;
import com.kofax.mobile.sdk.p012ah.C0819au;
import com.kofax.mobile.sdk.p012ah.C0820aw;
import com.kofax.mobile.sdk.p012ah.C0821ax;
import com.kofax.mobile.sdk.p012ah.C0822ay;
import com.kofax.mobile.sdk.p012ah.C0823b;
import com.kofax.mobile.sdk.p012ah.C0824ba;
import com.kofax.mobile.sdk.p012ah.C0825bf;
import com.kofax.mobile.sdk.p012ah.C0826bg;
import com.kofax.mobile.sdk.p012ah.C0827bk;
import com.kofax.mobile.sdk.p012ah.C0828bl;
import com.kofax.mobile.sdk.p012ah.C0829bm;
import com.kofax.mobile.sdk.p012ah.C0830bn;
import com.kofax.mobile.sdk.p012ah.C0831bq;
import com.kofax.mobile.sdk.p012ah.C0832br;
import com.kofax.mobile.sdk.p012ah.C0833bs;
import com.kofax.mobile.sdk.p012ah.C0834d;
import com.kofax.mobile.sdk.p012ah.C0835e;
import com.kofax.mobile.sdk.p012ah.C0836f;
import com.kofax.mobile.sdk.p012ah.C0837g;
import com.kofax.mobile.sdk.p012ah.C0838h;
import com.kofax.mobile.sdk.p012ah.C0839i;
import com.kofax.mobile.sdk.p012ah.C0840j;
import com.kofax.mobile.sdk.p012ah.C0841k;
import com.kofax.mobile.sdk.p012ah.C0842l;
import com.kofax.mobile.sdk.p012ah.C0843n;
import com.kofax.mobile.sdk.p012ah.C0844o;
import com.kofax.mobile.sdk.p012ah.C0847p;
import com.kofax.mobile.sdk.p012ah.C0848s;
import com.kofax.mobile.sdk.p012ah.C0849u;
import com.kofax.mobile.sdk.p012ah.C0850w;
import com.kofax.mobile.sdk.p012ah.C0851y;
import com.kofax.mobile.sdk.p012ah.C0852z;
import com.kofax.mobile.sdk.p012ah.C8257ai;
import com.kofax.mobile.sdk.p012ah.C8258aj;
import com.kofax.mobile.sdk.p012ah.C8259ak;
import com.kofax.mobile.sdk.p012ah.C8260al;
import com.kofax.mobile.sdk.p012ah.C8261am;
import com.kofax.mobile.sdk.p012ah.C8262an;
import com.kofax.mobile.sdk.p012ah.C8263ap;
import com.kofax.mobile.sdk.p012ah.C8264aq;
import com.kofax.mobile.sdk.p012ah.C8265ar;
import com.kofax.mobile.sdk.p012ah.C8266av;
import com.kofax.mobile.sdk.p012ah.C8268bb;
import com.kofax.mobile.sdk.p012ah.C8269bc;
import com.kofax.mobile.sdk.p012ah.C8270bd;
import com.kofax.mobile.sdk.p012ah.C8271be;
import com.kofax.mobile.sdk.p012ah.C8272bh;
import com.kofax.mobile.sdk.p012ah.C8273bi;
import com.kofax.mobile.sdk.p012ah.C8274bj;
import com.kofax.mobile.sdk.p012ah.C8277c;
import com.kofax.mobile.sdk.p012ah.C8279q;
import com.kofax.mobile.sdk.p012ah.C8280r;
import com.kofax.mobile.sdk.p012ah.C8282v;
import com.kofax.mobile.sdk.p012ah.C8283x;
import com.kofax.mobile.sdk.p013ai.C0854b;
import com.kofax.mobile.sdk.p014aj.C0856b;
import com.kofax.mobile.sdk.p015ak.C0858b;
import com.kofax.mobile.sdk.p016b.C0862c;
import com.kofax.mobile.sdk.p016b.C0863d;
import com.kofax.mobile.sdk.p016b.C8295a;
import com.kofax.mobile.sdk.p016b.C8296b;
import com.kofax.mobile.sdk.p019f.C0884a;
import com.kofax.mobile.sdk.p019f.C0885b;
import com.kofax.mobile.sdk.p019f.C0886c;
import com.kofax.mobile.sdk.p019f.C0887d;
import com.kofax.mobile.sdk.p019f.C0888f;
import com.kofax.mobile.sdk.p019f.C0889h;
import com.kofax.mobile.sdk.p019f.C0890j;
import com.kofax.mobile.sdk.p019f.C0891l;
import com.kofax.mobile.sdk.p021i.C0919c;
import com.kofax.mobile.sdk.p021i.C0920d;
import com.kofax.mobile.sdk.p021i.C0924h;
import com.kofax.mobile.sdk.p021i.C8404a;
import com.kofax.mobile.sdk.p021i.C8406e;
import com.kofax.mobile.sdk.p022j.C0929a;
import com.kofax.mobile.sdk.p022j.C0930b;
import com.kofax.mobile.sdk.p022j.C0931c;
import com.kofax.mobile.sdk.p022j.C0932d;
import com.kofax.mobile.sdk.p022j.C0935e;
import com.kofax.mobile.sdk.p022j.C0938g;
import com.kofax.mobile.sdk.p023k.C0939b;
import com.kofax.mobile.sdk.p023k.C0952c;
import com.kofax.mobile.sdk.p023k.C0953d;
import com.kofax.mobile.sdk.p023k.C0954e;
import com.kofax.mobile.sdk.p023k.C0959m;
import com.kofax.mobile.sdk.p023k.C0961n;
import com.kofax.mobile.sdk.p023k.C8410h;
import com.kofax.mobile.sdk.p024l.C0967f;
import com.kofax.mobile.sdk.p024l.C8424a;
import com.kofax.mobile.sdk.p024l.C8426d;
import com.kofax.mobile.sdk.p024l.C8430i;
import com.kofax.mobile.sdk.p025n.C0968a;
import com.kofax.mobile.sdk.p025n.C0970b;
import com.kofax.mobile.sdk.p025n.C0974e;
import com.kofax.mobile.sdk.p025n.C0975f;
import com.kofax.mobile.sdk.p025n.C0976g;
import com.kofax.mobile.sdk.p025n.C0977h;
import com.kofax.mobile.sdk.p025n.C0978i;
import com.kofax.mobile.sdk.p025n.C0979j;
import com.kofax.mobile.sdk.p025n.C0980k;
import com.kofax.mobile.sdk.p026o.C0981a;
import com.kofax.mobile.sdk.p026o.C0983c;
import com.kofax.mobile.sdk.p026o.C0986g;
import com.kofax.mobile.sdk.p026o.C0987h;
import com.kofax.mobile.sdk.p026o.C0988i;
import com.kofax.mobile.sdk.p026o.C0989j;
import com.kofax.mobile.sdk.p029y.C0998c;
import com.kofax.mobile.sdk.p029y.C1001k;
import com.kofax.mobile.sdk.p029y.C1002n;
import com.kofax.mobile.sdk.p029y.C1011o;
import com.kofax.mobile.sdk.p029y.C8637d;
import com.kofax.mobile.sdk.p029y.C8640f;
import com.kofax.mobile.sdk.p029y.C8647l;
import com.kofax.mobile.sdk.p029y.C8650p;
import com.kofax.mobile.sdk.p029y.C8653r;
import com.kofax.mobile.sdk.p029y.C8656t;
import com.kofax.mobile.sdk.p070a.C8239a;
import com.kofax.mobile.sdk.p070a.C8240b;
import com.kofax.mobile.sdk.p073c.C8298b;
import com.kofax.mobile.sdk.p073c.C8299c;
import com.kofax.mobile.sdk.p073c.C8300d;
import com.kofax.mobile.sdk.p074d.C8336a;
import com.kofax.mobile.sdk.p074d.C8337b;
import com.kofax.mobile.sdk.p074d.C8339c;
import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p076h.C8394a;
import com.kofax.mobile.sdk.p076h.C8397b;
import com.kofax.mobile.sdk.p076h.C8398c;
import com.kofax.mobile.sdk.p076h.C8400d;
import com.kofax.mobile.sdk.p076h.C8401e;
import com.kofax.mobile.sdk.p076h.C8403f;
import com.kofax.mobile.sdk.p077m.C8453a;
import com.kofax.mobile.sdk.p077m.C8455c;
import com.kofax.mobile.sdk.p077m.C8456d;
import com.kofax.mobile.sdk.p077m.C8457e;
import com.kofax.mobile.sdk.p077m.C8459f;
import com.kofax.mobile.sdk.p082v.C8483a;
import com.kofax.mobile.sdk.p082v.C8486d;
import com.kofax.mobile.sdk.p082v.C8488f;
import com.kofax.mobile.sdk.p083w.C8490a;
import com.kofax.mobile.sdk.p083w.C8510ak;
import com.kofax.mobile.sdk.p083w.C8513am;
import com.kofax.mobile.sdk.p083w.C8518aq;
import com.kofax.mobile.sdk.p083w.C8520as;
import com.kofax.mobile.sdk.p083w.C8522au;
import com.kofax.mobile.sdk.p083w.C8524aw;
import com.kofax.mobile.sdk.p083w.C8526ay;
import com.kofax.mobile.sdk.p083w.C8529ba;
import com.kofax.mobile.sdk.p083w.C8531c;
import com.kofax.mobile.sdk.p083w.C8535e;
import com.kofax.mobile.sdk.p083w.C8549l;
import com.kofax.mobile.sdk.p083w.C8551n;
import com.kofax.mobile.sdk.p083w.C8554p;
import com.kofax.mobile.sdk.p083w.C8562v;
import com.kofax.mobile.sdk.p083w.C8564x;
import com.kofax.mobile.sdk.p083w.C8566z;
import com.kofax.mobile.sdk.p084x.C8569a;
import com.kofax.mobile.sdk.p084x.C8570aa;
import com.kofax.mobile.sdk.p084x.C8572ac;
import com.kofax.mobile.sdk.p084x.C8575ae;
import com.kofax.mobile.sdk.p084x.C8577ag;
import com.kofax.mobile.sdk.p084x.C8579ai;
import com.kofax.mobile.sdk.p084x.C8581ak;
import com.kofax.mobile.sdk.p084x.C8584am;
import com.kofax.mobile.sdk.p084x.C8586ao;
import com.kofax.mobile.sdk.p084x.C8588aq;
import com.kofax.mobile.sdk.p084x.C8590as;
import com.kofax.mobile.sdk.p084x.C8592au;
import com.kofax.mobile.sdk.p084x.C8596ay;
import com.kofax.mobile.sdk.p084x.C8599ba;
import com.kofax.mobile.sdk.p084x.C8601bc;
import com.kofax.mobile.sdk.p084x.C8603be;
import com.kofax.mobile.sdk.p084x.C8606bh;
import com.kofax.mobile.sdk.p084x.C8608bj;
import com.kofax.mobile.sdk.p084x.C8611c;
import com.kofax.mobile.sdk.p084x.C8613e;
import com.kofax.mobile.sdk.p084x.C8615g;
import com.kofax.mobile.sdk.p084x.C8617i;
import com.kofax.mobile.sdk.p084x.C8620k;
import com.kofax.mobile.sdk.p084x.C8622m;
import com.kofax.mobile.sdk.p084x.C8624o;
import com.kofax.mobile.sdk.p084x.C8626q;
import com.kofax.mobile.sdk.p084x.C8630u;
import com.kofax.mobile.sdk.p084x.C8632w;
import com.kofax.mobile.sdk.p084x.C8634y;
import java.io.File;
import p040o.FragmentBuilder_BindEasycashReferralSendDfwFragment;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRRegistrationLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.dagger.b */
public final class C0520b implements C0524c {
    /* access modifiers changed from: private */

    /* renamed from: tH */
    public C0525e f1070tH;
    /* access modifiers changed from: private */

    /* renamed from: tI */
    public HmlReviewDocumentActivity<C0727j> f1071tI;
    /* access modifiers changed from: private */

    /* renamed from: tJ */
    public C0526f f1072tJ;

    private C0520b(C0522a aVar) {
        m672a(aVar);
    }

    /* renamed from: bB */
    public static C0522a m674bB() {
        return new C0522a();
    }

    /* renamed from: bC */
    public static C0524c m675bC() {
        return new C0522a().mo11403bE();
    }

    /* access modifiers changed from: private */
    public IBus getIBus() {
        return C0526f.m1036a(this.f1070tH, this.f1071tI.get());
    }

    /* renamed from: a */
    private void m672a(C0522a aVar) {
        this.f1070tH = aVar.f1073tH;
        this.f1071tI = OPRRegistrationLandingActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(C0728k.m1651hP());
        this.f1072tJ = C0526f.m1037a(aVar.f1073tH, this.f1071tI);
    }

    /* renamed from: bD */
    public final C0858b mo11401bD() {
        return C0527h.m1039a(this.f1070tH, new C0808a());
    }

    /* renamed from: a */
    public final ISdkDaggerPerContextComponent mo11400a(C0844o oVar) {
        return new C0523b(oVar);
    }

    /* renamed from: com.kofax.mobile.sdk._internal.dagger.b$a */
    public static final class C0522a {
        /* access modifiers changed from: private */

        /* renamed from: tH */
        public C0525e f1073tH;

        private C0522a() {
        }

        /* renamed from: bE */
        public final C0524c mo11403bE() {
            if (this.f1073tH == null) {
                this.f1073tH = new C0525e();
            }
            return new C0520b(this);
        }

        /* renamed from: a */
        public final C0522a mo11402a(C0525e eVar) {
            if (eVar != null) {
                this.f1073tH = eVar;
                return this;
            }
            throw null;
        }
    }

    /* renamed from: com.kofax.mobile.sdk._internal.dagger.b$b */
    final class C0523b implements ISdkDaggerPerContextComponent {

        /* renamed from: tK */
        private C0705ah f1074tK;

        /* renamed from: tL */
        private C0844o f1075tL;

        /* renamed from: tM */
        private C0810a f1076tM;

        /* renamed from: tN */
        private C0830bn f1077tN;

        /* renamed from: tO */
        private C0837g f1078tO;

        /* renamed from: tP */
        private GpuDetectionModule f1079tP;

        /* renamed from: tQ */
        private CaptureAnimationsModule f1080tQ;

        /* renamed from: tR */
        private IdCaptureModule f1081tR;

        /* renamed from: tS */
        private BillCaptureModule f1082tS;

        /* renamed from: tT */
        private CheckCaptureModule f1083tT;

        /* renamed from: tU */
        private CreditCardCaptureModule f1084tU;

        /* renamed from: tV */
        private PassportCaptureModule f1085tV;

        /* renamed from: tW */
        private IsgDetectionModule f1086tW;

        /* renamed from: tX */
        private C0975f f1087tX;

        /* renamed from: tY */
        private C0986g f1088tY;

        /* renamed from: tZ */
        private DetectionModule f1089tZ;

        /* renamed from: uA */
        private C0596j f1090uA;

        /* renamed from: uB */
        private C0839i f1091uB;

        /* renamed from: uC */
        private C0582b f1092uC;

        /* renamed from: uD */
        private C0605q f1093uD;

        /* renamed from: uE */
        private C0843n f1094uE;

        /* renamed from: uF */
        private C0840j f1095uF;

        /* renamed from: uG */
        private C0590g f1096uG;

        /* renamed from: uH */
        private C0842l f1097uH;

        /* renamed from: uI */
        private C0585e f1098uI;

        /* renamed from: uJ */
        private C0841k f1099uJ;

        /* renamed from: uK */
        private C0600n f1100uK;

        /* renamed from: uL */
        private HmlReviewDocumentActivity<C0608h> f1101uL;

        /* renamed from: uM */
        private HmlReviewDocumentActivity<C0543aa> f1102uM;

        /* renamed from: uN */
        private HmlReviewDocumentActivity<C0562ak> f1103uN;

        /* renamed from: uO */
        private HmlReviewDocumentActivity<C0734a> f1104uO;

        /* renamed from: uP */
        private HmlReviewDocumentActivity<C0959m> f1105uP;

        /* renamed from: uQ */
        private HmlReviewDocumentActivity<C0625p> f1106uQ;

        /* renamed from: uR */
        private HmlReviewDocumentActivity<C0863d> f1107uR;

        /* renamed from: uS */
        private C0707ai f1108uS;

        /* renamed from: uT */
        private C0708ak f1109uT;

        /* renamed from: uU */
        private C0920d f1110uU;

        /* renamed from: uV */
        private C0717dt f1111uV;

        /* renamed from: uW */
        private C1011o f1112uW;

        /* renamed from: uX */
        private C0712bv f1113uX;

        /* renamed from: uY */
        private C0713cf f1114uY;

        /* renamed from: uZ */
        private C0722m f1115uZ;

        /* renamed from: ua */
        private C0929a f1116ua;

        /* renamed from: ub */
        private C0828bl f1117ub;

        /* renamed from: uc */
        private C0836f f1118uc;

        /* renamed from: ud */
        private HmlReviewDocumentActivity<C0730m> f1119ud;

        /* renamed from: ue */
        private C0835e f1120ue;

        /* renamed from: uf */
        private HmlReviewDocumentActivity<C0801d> f1121uf;

        /* renamed from: ug */
        private HmlReviewDocumentActivity<C0790a> f1122ug;

        /* renamed from: uh */
        private HmlReviewDocumentActivity<C0788a> f1123uh;

        /* renamed from: ui */
        private C0820aw f1124ui;

        /* renamed from: uj */
        private HmlReviewDocumentActivity<C0786a> f1125uj;

        /* renamed from: uk */
        private C0821ax f1126uk;

        /* renamed from: ul */
        private C0834d f1127ul;

        /* renamed from: um */
        private C0799b f1128um;

        /* renamed from: un */
        private C0815ah f1129un;

        /* renamed from: uo */
        private HmlReviewDocumentActivity<C0805f> f1130uo;

        /* renamed from: up */
        private HmlReviewDocumentActivity<C0619j> f1131up;

        /* renamed from: uq */
        private HmlReviewDocumentActivity<C0556ag> f1132uq;

        /* renamed from: ur */
        private HmlReviewDocumentActivity<C0571aq> f1133ur;

        /* renamed from: us */
        private C0833bs f1134us;

        /* renamed from: ut */
        private C0849u f1135ut;

        /* renamed from: uu */
        private C0607g f1136uu;

        /* renamed from: uv */
        private C0819au f1137uv;

        /* renamed from: uw */
        private C0838h f1138uw;

        /* renamed from: ux */
        private GPUImageHolderImpl_Factory f1139ux;

        /* renamed from: uy */
        private HmlReviewDocumentActivity<IGPUImageHolder> f1140uy;

        /* renamed from: uz */
        private GPUStrategyFocusFactorDetection_Factory f1141uz;

        /* renamed from: vA */
        private ForcedGpuDocumentDetector_Factory f1142vA;

        /* renamed from: vB */
        private GpuDetectionModule_GetForcedDocumentDetectorFactory f1143vB;

        /* renamed from: vC */
        private DetectionModule_GetForcedDocumentDetectorFactory f1144vC;

        /* renamed from: vD */
        private HmlReviewDocumentActivity<C0495c> f1145vD;

        /* renamed from: vE */
        private C0935e f1146vE;

        /* renamed from: vF */
        private HmlReviewDocumentActivity<C0495c> f1147vF;

        /* renamed from: va */
        private C0710br f1149va;

        /* renamed from: vb */
        private C0724z f1150vb;

        /* renamed from: vc */
        private C0716dr f1151vc;

        /* renamed from: vd */
        private C1001k f1152vd;

        /* renamed from: ve */
        private C0711bt f1153ve;

        /* renamed from: vf */
        private C0720f f1154vf;

        /* renamed from: vg */
        private C0998c f1155vg;

        /* renamed from: vh */
        private HmlReviewDocumentActivity<C0623n> f1156vh;

        /* renamed from: vi */
        private C0823b f1157vi;

        /* renamed from: vj */
        private HmlReviewDocumentActivity<C0542a> f1158vj;

        /* renamed from: vk */
        private C0847p f1159vk;

        /* renamed from: vl */
        private C0689b f1160vl;

        /* renamed from: vm */
        private C0822ay f1161vm;

        /* renamed from: vn */
        private C0622m f1162vn;

        /* renamed from: vo */
        private C0827bk f1163vo;

        /* renamed from: vp */
        private HmlReviewDocumentActivity<ImageCaptureView> f1164vp;

        /* renamed from: vq */
        private HmlReviewDocumentActivity<C0564am> f1165vq;

        /* renamed from: vr */
        private C0987h f1166vr;

        /* renamed from: vs */
        private C0980k f1167vs;

        /* renamed from: vt */
        private C0976g f1168vt;

        /* renamed from: vu */
        private C0974e f1169vu;

        /* renamed from: vv */
        private C0977h f1170vv;

        /* renamed from: vw */
        private ForcedIsgDocumentDetector_Factory f1171vw;

        /* renamed from: vx */
        private IsgDetectionModule_GetForcedDocumentDetectorFactory f1172vx;

        /* renamed from: vy */
        private GPUStrategyForcedEdgeDetection_Factory f1173vy;

        /* renamed from: vz */
        private GpuDetectionModule_GetForcedDocumentDetectionFactory f1174vz;

        public final void inject(CardIoWrapperActivity cardIoWrapperActivity) {
        }

        public final void inject(CreditCardWorkflowActivity creditCardWorkflowActivity) {
        }

        public final void injectMembers(C8129ec ecVar) {
        }

        private C0523b(C0844o oVar) {
            m737b(oVar);
        }

        /* renamed from: bF */
        private File m738bF() {
            return C0718dy.m1620c(this.f1074tK, C0828bl.m2064d(this.f1075tL));
        }

        /* renamed from: bG */
        private BundleCacheProvider m739bG() {
            return new BundleCacheProvider(m738bF());
        }

        /* renamed from: bH */
        private IBundleCacheProvider m740bH() {
            return C0709bj.m1593a(this.f1074tK, m739bG());
        }

        /* renamed from: bI */
        private ConnectivityManager m741bI() {
            return C8277c.m4639b(this.f1076tM, C0828bl.m2064d(this.f1075tL));
        }

        /* renamed from: bJ */
        private C0890j m742bJ() {
            return new C0890j(C0520b.this.getIBus());
        }

        /* renamed from: bK */
        private C0891l m743bK() {
            return new C0891l(C0520b.this.getIBus());
        }

        /* renamed from: bL */
        private C0889h m744bL() {
            return new C0889h(C0520b.this.getIBus());
        }

        /* renamed from: bM */
        private C0887d m745bM() {
            return new C0887d(C0520b.this.getIBus());
        }

        /* renamed from: bN */
        private C0888f m746bN() {
            return new C0888f(C0520b.this.getIBus());
        }

        /* renamed from: bO */
        private C0732o m747bO() {
            return new C0732o(C0520b.this.getIBus());
        }

        /* renamed from: bP */
        private C0533aa m748bP() {
            return new C0533aa(C0520b.this.getIBus());
        }

        /* renamed from: bQ */
        private C0884a m749bQ() {
            return m733a(C0885b.m2284in());
        }

        /* renamed from: bR */
        private C0856b m750bR() {
            return C0818at.m2034a(this.f1075tL, new C0807j());
        }

        /* renamed from: bS */
        private C0576d m751bS() {
            return new C0576d(C0520b.this.getIBus(), m750bR());
        }

        /* renamed from: bT */
        private FocusStatistics m752bT() {
            return new FocusStatistics(C0520b.this.getIBus());
        }

        /* renamed from: bU */
        private FragmentBuilder_BindEasycashReferralSendDfwFragment m753bU() {
            return C0847p.m2167a(this.f1075tL, (C0727j) C0520b.this.f1071tI.get());
        }

        /* renamed from: bV */
        private C0675a m754bV() {
            return new C0675a(m753bU());
        }

        /* renamed from: bW */
        private C0509q m755bW() {
            return C0822ay.m2045a(this.f1075tL, this.f1102uM.get(), this.f1103uN.get());
        }

        /* renamed from: bX */
        private C8410h m756bX() {
            return new C8410h(C0828bl.m2064d(this.f1075tL), C0520b.this.getIBus());
        }

        /* renamed from: bY */
        private C7895f m757bY() {
            return C8269bc.m4616a(this.f1075tL, m756bX());
        }

        /* renamed from: bZ */
        private C0769a m758bZ() {
            return C0848s.m2169a(this.f1075tL, this.f1104uO.get());
        }

        /* renamed from: ca */
        private C8211ak m785ca() {
            return m695a(C8212al.m4500n(C0828bl.m2064d(this.f1075tL)));
        }

        /* renamed from: cb */
        private C8237m m786cb() {
            return C8270bd.m4619a(this.f1075tL, m785ca());
        }

        /* renamed from: cc */
        private C0776j m787cc() {
            return C0817as.m2031a(this.f1075tL, new C0763y());
        }

        /* renamed from: cd */
        private C0740ap m788cd() {
            return m696a(C0741aq.m1698p(C0828bl.m2064d(this.f1075tL)));
        }

        /* renamed from: ce */
        private C0778o m789ce() {
            return C0826bg.m2058a(this.f1075tL, m788cd());
        }

        /* renamed from: cf */
        private C0744e m790cf() {
            return m697a(C0745f.m1706a(C0828bl.m2064d(this.f1075tL), m789ce()));
        }

        /* renamed from: cg */
        private C0770c m791cg() {
            return C0851y.m2178a(this.f1075tL, m790cf());
        }

        /* renamed from: ch */
        private C0775i m792ch() {
            return C0816ao.m2027a(this.f1075tL, new C0764y());
        }

        /* renamed from: ci */
        private C0517g m793ci() {
            return C0825bf.m2055a(this.f1075tL, this.f1105uP.get());
        }

        /* renamed from: cj */
        private C0751l m794cj() {
            return m698a(C0753m.m1728k(C0828bl.m2064d(this.f1075tL)));
        }

        /* renamed from: ck */
        private C0772e m795ck() {
            return C0811aa.m2012a(this.f1075tL, m794cj());
        }

        /* renamed from: cl */
        private SelfieOverlayView m796cl() {
            return m693a(C8214an.m4505o(C0828bl.m2064d(this.f1075tL)));
        }

        /* renamed from: cm */
        private C8238n m797cm() {
            return CaptureAnimationsModule_ProvideIISelfieOverlayViewFactory.proxyProvideIISelfieOverlayView(this.f1080tQ, m796cl());
        }

        /* renamed from: cn */
        private C7893v m798cn() {
            return C8272bh.m4625a(this.f1075tL, new C7931as());
        }

        /* renamed from: co */
        private C7891m m799co() {
            return C8263ap.m4597a(this.f1075tL, new C7937u());
        }

        /* renamed from: cp */
        private C7935s m800cp() {
            return new C7935s(m798cn(), m799co());
        }

        /* renamed from: cq */
        private C7890l m801cq() {
            return C8257ai.m4579a(this.f1075tL, m800cp());
        }

        /* renamed from: cr */
        private C0757q m802cr() {
            return m699a(C0759r.m1763b(C0828bl.m2064d(this.f1075tL), m789ce()));
        }

        /* renamed from: cs */
        private C0774g m803cs() {
            return C0814ae.m2021a(this.f1075tL, m802cr());
        }

        /* renamed from: ct */
        private C0749i m804ct() {
            return new C0749i(C0828bl.m2064d(this.f1075tL));
        }

        /* renamed from: cu */
        private C0771d m805cu() {
            return C0852z.m2181a(this.f1075tL, m804ct());
        }

        /* renamed from: cv */
        private C0739ag m806cv() {
            return new C0739ag(C0828bl.m2064d(this.f1075tL));
        }

        /* renamed from: cw */
        private C0777k m807cw() {
            return C0824ba.m2052a(this.f1075tL, m806cv());
        }

        /* renamed from: cx */
        private C0755o m808cx() {
            return new C0755o(C0828bl.m2064d(this.f1075tL));
        }

        /* renamed from: cy */
        private C0773f m809cy() {
            return C0812ab.m2015a(this.f1075tL, m808cx());
        }

        /* renamed from: cz */
        private LicenseOverlayView m810cz() {
            return m688a(LicenseOverlayView_Factory.newLicenseOverlayView(C0828bl.m2064d(this.f1075tL)));
        }

        /* renamed from: cA */
        private ILicenseOverlayView m759cA() {
            return C8265ar.m4604a(this.f1075tL, m810cz());
        }

        /* renamed from: cB */
        private ExtractionParameters m760cB() {
            return IdCaptureModule_GetExtractionParametersFactory.proxyGetExtractionParameters(this.f1081tR, new ExtractionParameters());
        }

        /* renamed from: cC */
        private LookAndFeelParameters m761cC() {
            return IdCaptureModule_GetLookAndFeelParametersFactory.proxyGetLookAndFeelParameters(this.f1081tR, new LookAndFeelParameters());
        }

        /* renamed from: cD */
        private ProcessingParameters m762cD() {
            return IdCaptureModule_GetProcessingParametersFactory.proxyGetProcessingParameters(this.f1081tR, new ProcessingParameters());
        }

        /* renamed from: cE */
        private C8207ai m763cE() {
            return new C8207ai(C0828bl.m2064d(this.f1075tL));
        }

        /* renamed from: cF */
        private C8236l m764cF() {
            return C8268bb.m4613a(this.f1075tL, m763cE());
        }

        /* renamed from: cG */
        private C8247b m765cG() {
            return new C8247b(new ImageProcessor());
        }

        /* renamed from: cH */
        private IImageProcessor m766cH() {
            return C8259ak.m4585a(this.f1075tL, m765cG());
        }

        /* renamed from: cI */
        private C7921h m767cI() {
            return C8271be.m4622a(this.f1075tL, new C7924ac());
        }

        /* renamed from: cJ */
        private ExtractionParameters m768cJ() {
            return BillCaptureModule_GetExtractionParametersFactory.proxyGetExtractionParameters(this.f1082tS, new ExtractionParameters());
        }

        /* renamed from: cK */
        private LookAndFeelParameters m769cK() {
            return BillCaptureModule_GetLookAndFeelParametersFactory.proxyGetLookAndFeelParameters(this.f1082tS, new LookAndFeelParameters());
        }

        /* renamed from: cL */
        private ProcessingParameters m770cL() {
            return BillCaptureModule_GetProcessingParametersFactory.proxyGetProcessingParameters(this.f1082tS, new ProcessingParameters());
        }

        /* renamed from: cM */
        private IJsonExactionHelper m771cM() {
            return BillCaptureModule_GetIJsonExactionHelperKtaFactory.proxyGetIJsonExactionHelperKta(this.f1082tS, new KtaJsonExactionHelper());
        }

        /* renamed from: cN */
        private IJsonExactionHelper m772cN() {
            return BillCaptureModule_GetIJsonExactionHelperRttiFactory.proxyGetIJsonExactionHelperRtti(this.f1082tS, new RttiJsonExactionHelper());
        }

        /* renamed from: cO */
        private ExtractionParameters m773cO() {
            return CheckCaptureModule_GetExtractionParametersFactory.proxyGetExtractionParameters(this.f1083tT, new ExtractionParameters());
        }

        /* renamed from: cP */
        private LookAndFeelParameters m774cP() {
            return CheckCaptureModule_GetLookAndFeelParametersFactory.proxyGetLookAndFeelParameters(this.f1083tT, new LookAndFeelParameters());
        }

        /* renamed from: cQ */
        private ProcessingParameters m775cQ() {
            return CheckCaptureModule_GetProcessingParametersFactory.proxyGetProcessingParameters(this.f1083tT, new ProcessingParameters());
        }

        /* renamed from: cR */
        private IJsonExactionHelper m776cR() {
            return CheckCaptureModule_GetIJsonExactionHelperKtaFactory.proxyGetIJsonExactionHelperKta(this.f1083tT, new KtaJsonExactionHelper());
        }

        /* renamed from: cS */
        private IJsonExactionHelper m777cS() {
            return CheckCaptureModule_GetIJsonExactionHelperRttiFactory.proxyGetIJsonExactionHelperRtti(this.f1083tT, new RttiJsonExactionHelper());
        }

        /* renamed from: cT */
        private ExtractionParameters m778cT() {
            return CreditCardCaptureModule_GetExtractionParametersFactory.proxyGetExtractionParameters(this.f1084tU, new ExtractionParameters());
        }

        /* renamed from: cU */
        private LookAndFeelParameters m779cU() {
            return CreditCardCaptureModule_GetLookAndFeelParametersFactory.proxyGetLookAndFeelParameters(this.f1084tU, new LookAndFeelParameters());
        }

        /* renamed from: cV */
        private ProcessingParameters m780cV() {
            return CreditCardCaptureModule_GetProcessingParametersFactory.proxyGetProcessingParameters(this.f1084tU, new ProcessingParameters());
        }

        /* renamed from: cW */
        private IJsonExactionHelper m781cW() {
            return PassportCaptureModule_GetIJsonExactionHelperKtaFactory.proxyGetIJsonExactionHelperKta(this.f1085tV, new KtaJsonExactionHelper());
        }

        /* renamed from: cX */
        private C7919g m782cX() {
            return C8261am.m4591a(this.f1075tL, new C8196u());
        }

        /* renamed from: cY */
        private C8231w m783cY() {
            return new C8231w(m782cX());
        }

        /* renamed from: cZ */
        private IImageToByteArray m784cZ() {
            return C8262an.m4594a(this.f1075tL, m783cY());
        }

        /* renamed from: da */
        private RttiBillExtractor m837da() {
            return new RttiBillExtractor(m784cZ());
        }

        /* renamed from: db */
        private IExtractionServer m838db() {
            return BillCaptureModule_GetIExtractionServerRttiFactory.proxyGetIExtractionServerRtti(this.f1082tS, m837da());
        }

        /* renamed from: dc */
        private IBillDeserializer m839dc() {
            return BillCaptureModule_GetIBillDeserializerRttiFactory.proxyGetIBillDeserializerRtti(this.f1082tS, C0828bl.m2064d(this.f1075tL), m837da());
        }

        /* renamed from: dd */
        private IExceptionResponseDeserializer m840dd() {
            return BillCaptureModule_GetIExceptionResponseDeserializerRttiFactory.proxyGetIExceptionResponseDeserializerRtti(this.f1082tS, BillCaptureModule_RttiExceptionResponseDeserializer_Factory.newRttiExceptionResponseDeserializer());
        }

        /* renamed from: de */
        private IKtaSessionIdProviderFactory m841de() {
            return C8264aq.m4601a(this.f1075tL, new C8010j());
        }

        /* renamed from: df */
        private KtaBillExtractor m842df() {
            return new KtaBillExtractor(m841de(), m784cZ());
        }

        /* renamed from: dg */
        private IExtractionServer m843dg() {
            return BillCaptureModule_GetIExtractionServerKtaFactory.proxyGetIExtractionServerKta(this.f1082tS, m842df());
        }

        /* renamed from: dh */
        private IBillDeserializer m844dh() {
            return BillCaptureModule_GetIBillDeserializerKtaFactory.proxyGetIBillDeserializerKta(this.f1082tS, C0828bl.m2064d(this.f1075tL), m837da());
        }

        /* renamed from: di */
        private IExceptionResponseDeserializer m845di() {
            return BillCaptureModule_GetIExceptionResponseDeserializerKtaFactory.proxyGetIExceptionResponseDeserializerKta(this.f1082tS, BillCaptureModule_KtaExceptionResponseDeserializer_Factory.newKtaExceptionResponseDeserializer());
        }

        /* renamed from: dj */
        private BillExtractor m846dj() {
            return m704a(BillExtractor_Factory.newBillExtractor());
        }

        /* renamed from: dk */
        private RttiCheckExtractor m847dk() {
            return new RttiCheckExtractor(m784cZ());
        }

        /* renamed from: dl */
        private ICheckExtractionServer m848dl() {
            return CheckCaptureModule_GetIExtractionServerRttiFactory.proxyGetIExtractionServerRtti(this.f1083tT, m847dk());
        }

        /* renamed from: dm */
        private ICheckDeserializer m849dm() {
            return CheckCaptureModule_GetICheckDeserializerRttiFactory.proxyGetICheckDeserializerRtti(this.f1083tT, C0828bl.m2064d(this.f1075tL), m847dk());
        }

        /* renamed from: dn */
        private IExceptionResponseDeserializer m850dn() {
            return CheckCaptureModule_GetIExceptionResponseDeserializerRttiFactory.proxyGetIExceptionResponseDeserializerRtti(this.f1083tT, CheckCaptureModule_RttiExceptionResponseDeserializer_Factory.newRttiExceptionResponseDeserializer());
        }

        /* renamed from: do */
        private KtaCheckExtractor m851do() {
            return new KtaCheckExtractor(m841de(), m784cZ());
        }

        /* renamed from: dp */
        private ICheckExtractionServer m852dp() {
            return CheckCaptureModule_GetIExtractionServerKtaFactory.proxyGetIExtractionServerKta(this.f1083tT, m851do());
        }

        /* renamed from: dq */
        private ICheckDeserializer m853dq() {
            return CheckCaptureModule_GetICheckDeserializerKtaFactory.proxyGetICheckDeserializerKta(this.f1083tT, C0828bl.m2064d(this.f1075tL), m847dk());
        }

        /* renamed from: dr */
        private IExceptionResponseDeserializer m854dr() {
            return CheckCaptureModule_GetIExceptionResponseDeserializerKtaFactory.proxyGetIExceptionResponseDeserializerKta(this.f1083tT, CheckCaptureModule_KtaExceptionResponseDeserializer_Factory.newKtaExceptionResponseDeserializer());
        }

        /* renamed from: ds */
        private CheckExtractor m855ds() {
            return m711a(CheckExtractor_Factory.newCheckExtractor());
        }

        /* renamed from: dt */
        private RttiIdExtractor m856dt() {
            return new RttiIdExtractor(m784cZ());
        }

        /* renamed from: du */
        private IIdExtractionServer m857du() {
            return IdCaptureModule_GetIIdExtractionServerRttiFactory.proxyGetIIdExtractionServerRtti(this.f1081tR, m856dt());
        }

        /* renamed from: dv */
        private IIdDeserializer m858dv() {
            return IdCaptureModule_GetIIdDeserializerRttiFactory.proxyGetIIdDeserializerRtti(this.f1081tR, C0828bl.m2064d(this.f1075tL));
        }

        /* renamed from: dw */
        private IExceptionResponseDeserializer m859dw() {
            return IdCaptureModule_GetIExceptionResponseDeserializerRttiFactory.proxyGetIExceptionResponseDeserializerRtti(this.f1081tR, IdCaptureModule_RttiExceptionResponseDeserializer_Factory.newRttiExceptionResponseDeserializer());
        }

        /* renamed from: dx */
        private KtaIdExtractor m860dx() {
            return new KtaIdExtractor(m841de(), m784cZ());
        }

        /* renamed from: dy */
        private IIdExtractionServer m861dy() {
            return IdCaptureModule_GetIIdExtractionServerKtaFactory.proxyGetIIdExtractionServerKta(this.f1081tR, m860dx());
        }

        /* renamed from: dz */
        private IIdDeserializer m862dz() {
            return IdCaptureModule_GetIIdDeserializerKtaFactory.proxyGetIIdDeserializerKta(this.f1081tR, C0828bl.m2064d(this.f1075tL));
        }

        /* renamed from: dA */
        private IExceptionResponseDeserializer m811dA() {
            return IdCaptureModule_GetIExceptionResponseDeserializerKtaFactory.proxyGetIExceptionResponseDeserializerKta(this.f1081tR, IdCaptureModule_KtaExceptionResponseDeserializer_Factory.newKtaExceptionResponseDeserializer());
        }

        /* renamed from: dB */
        private IIdExtractionServer m812dB() {
            return IdCaptureModule_GetIIdExtractionServerOnDeviceFactory.proxyGetIIdExtractionServerOnDevice(this.f1081tR, getOnDeviceExtractionServer());
        }

        /* renamed from: dC */
        private IIdDeserializer m813dC() {
            return IdCaptureModule_GetIIdDeserializerOnDeviceFactory.proxyGetIIdDeserializerOnDevice(this.f1081tR, C0828bl.m2064d(this.f1075tL));
        }

        /* renamed from: dD */
        private IExceptionResponseDeserializer m814dD() {
            return IdCaptureModule_GetIExceptionResponseDeserializerOnDeviceFactory.proxyGetIExceptionResponseDeserializerOnDevice(this.f1081tR, new IdCaptureModule.OnDeviceExceptionResponseDeserializer());
        }

        /* renamed from: dE */
        private IdExtractor m815dE() {
            return m720a(IdExtractor_Factory.newIdExtractor());
        }

        /* renamed from: dF */
        private RttiPassportExtractor m816dF() {
            return new RttiPassportExtractor(m784cZ());
        }

        /* renamed from: dG */
        private IExtractionServer m817dG() {
            return PassportCaptureModule_GetIExtractionServerRttiFactory.proxyGetIExtractionServerRtti(this.f1085tV, m816dF());
        }

        /* renamed from: dH */
        private IPassportDeserializer m818dH() {
            return PassportCaptureModule_GetIPassportDeserializerRttiFactory.proxyGetIPassportDeserializerRtti(this.f1085tV, C0828bl.m2064d(this.f1075tL), m816dF());
        }

        /* renamed from: dI */
        private IExceptionResponseDeserializer m819dI() {
            return C8330x9b852ec2.proxyGetIExceptionResponseDeserializerRtti(this.f1085tV, PassportCaptureModule_RttiExceptionResponseDeserializer_Factory.newRttiExceptionResponseDeserializer());
        }

        /* renamed from: dJ */
        private KtaPassportExtractor m820dJ() {
            return new KtaPassportExtractor(m841de(), m784cZ());
        }

        /* renamed from: dK */
        private IExtractionServer m821dK() {
            return PassportCaptureModule_GetIExtractionServerKtaFactory.proxyGetIExtractionServerKta(this.f1085tV, m820dJ());
        }

        /* renamed from: dL */
        private IPassportDeserializer m822dL() {
            return PassportCaptureModule_GetIPassportDeserializerKtaFactory.proxyGetIPassportDeserializerKta(this.f1085tV, C0828bl.m2064d(this.f1075tL), m816dF());
        }

        /* renamed from: dM */
        private IExceptionResponseDeserializer m823dM() {
            return C8329x206b8e03.proxyGetIExceptionResponseDeserializerKta(this.f1085tV, PassportCaptureModule_KtaExceptionResponseDeserializer_Factory.newKtaExceptionResponseDeserializer());
        }

        /* renamed from: dN */
        private C0704a m824dN() {
            return C0708ak.m1590a(this.f1074tK, C0828bl.m2064d(this.f1075tL));
        }

        /* renamed from: dO */
        private IProjectProvider m825dO() {
            return C8106dc.m4244a(this.f1074tK, m824dN());
        }

        /* renamed from: dP */
        private OnDeviceIdExtractor m826dP() {
            return m731a(OnDeviceIdExtractor_Factory.newOnDeviceIdExtractor(C0828bl.m2064d(this.f1075tL), m825dO()));
        }

        /* renamed from: dQ */
        private IIdExtractor m827dQ() {
            return C8122du.m4291a(this.f1074tK, m826dP());
        }

        /* renamed from: dR */
        private C8650p m828dR() {
            return new C8650p(m827dQ());
        }

        /* renamed from: dS */
        private IIdExtractor m829dS() {
            return C8074bw.m4147a(this.f1074tK, m828dR(), m827dQ());
        }

        /* renamed from: dT */
        private Object m830dT() {
            return m735a((Object) PassportCaptureModule_PassportOnDeviceExtractionServer_Factory.newPassportOnDeviceExtractionServer(C0828bl.m2064d(this.f1075tL)));
        }

        /* renamed from: dU */
        private IExtractionServer m831dU() {
            return PassportCaptureModule_GetOnDeviceExtractionServerFactory.proxyGetOnDeviceExtractionServer(this.f1085tV, m830dT());
        }

        /* renamed from: dV */
        private Object m832dV() {
            return PassportCaptureModule_OnDevicePassportDeserializer_Factory.newOnDevicePassportDeserializer(C0828bl.m2064d(this.f1075tL));
        }

        /* renamed from: dW */
        private IPassportDeserializer m833dW() {
            return PassportCaptureModule_GetOnDevicePassportDeserializerFactory.proxyGetOnDevicePassportDeserializer(this.f1085tV, m832dV());
        }

        /* renamed from: dX */
        private PassportExtractor m834dX() {
            return m726a(PassportExtractor_Factory.newPassportExtractor());
        }

        /* renamed from: dY */
        private IParameters m835dY() {
            return BillCaptureModule_GetIParametersFactory.proxyGetIParameters(this.f1082tS, getBillParameters());
        }

        /* renamed from: dZ */
        private IParameters m836dZ() {
            return CheckCaptureModule_GetIParametersFactory.proxyGetIParameters(this.f1083tT, getCheckParameters());
        }

        /* renamed from: ea */
        private IParameters m889ea() {
            return PassportCaptureModule_GetIParametersFactory.proxyGetIParameters(this.f1085tV, getPassportParameters());
        }

        /* renamed from: eb */
        private C0621l m890eb() {
            return new C0621l(C0828bl.m2064d(this.f1075tL));
        }

        /* renamed from: ec */
        private C8174a m891ec() {
            return C8274bj.m4631a(this.f1075tL, new C8184g());
        }

        /* renamed from: ed */
        private C7995a m892ed() {
            return C8273bi.m4628a(this.f1075tL, new KtaServiceCaller());
        }

        /* renamed from: ee */
        private C8342c m893ee() {
            return C8112di.m4262a(this.f1074tK, new C8518aq());
        }

        /* renamed from: ef */
        private C7900b m894ef() {
            return C8082cc.m4173a(this.f1074tK, new C7986b());
        }

        /* renamed from: eg */
        private C8603be m895eg() {
            return new C8603be(m894ef(), this.f1107uR.get());
        }

        /* renamed from: eh */
        private C7988d m896eh() {
            return new C7988d(m894ef());
        }

        /* renamed from: ei */
        private C7901c m897ei() {
            return C8084ce.m4179a(this.f1074tK, m896eh());
        }

        /* renamed from: ej */
        private Object m898ej() {
            return C8150o.m4352a(m897ei());
        }

        /* renamed from: ek */
        private C7916m m899ek() {
            return C8124dw.m4298d(this.f1074tK, m898ej());
        }

        /* renamed from: el */
        private C8656t m900el() {
            return new C8656t(m899ek());
        }

        /* renamed from: em */
        private C7916m m901em() {
            return C8083cd.m4175a(this.f1074tK, m900el(), m899ek());
        }

        /* renamed from: en */
        private C8510ak m902en() {
            return C8104da.m4237a(this.f1074tK, m895eg(), m901em(), m782cX());
        }

        /* renamed from: eo */
        private C8599ba m903eo() {
            return new C8599ba(m894ef(), this.f1107uR.get());
        }

        /* renamed from: ep */
        private C8510ak m904ep() {
            return C8101cy.m4230a(this.f1074tK, m903eo(), m901em(), m782cX());
        }

        /* renamed from: eq */
        private C8601bc m905eq() {
            return new C8601bc(m902en(), m904ep());
        }

        /* renamed from: er */
        private C8342c m906er() {
            return C8105db.m4241a(this.f1074tK, m905eq());
        }

        /* renamed from: es */
        private C8404a m907es() {
            return new C8404a(m824dN());
        }

        /* renamed from: et */
        private C8296b m908et() {
            return C8119dp.m4282a(this.f1074tK, m907es());
        }

        /* renamed from: eu */
        private C8640f m909eu() {
            return new C8640f(m908et());
        }

        /* renamed from: ev */
        private C8296b m910ev() {
            return C8071bq.m4138a(this.f1074tK, m909eu(), m907es());
        }

        /* renamed from: ew */
        private C8453a m911ew() {
            return new C8453a(m910ev(), this.f1108uS);
        }

        /* renamed from: ex */
        private C8300d m912ex() {
            return C8081cb.m4170a(this.f1074tK, m911ew());
        }

        /* renamed from: ey */
        private C8455c m913ey() {
            return C8456d.m5076a(m912ex());
        }

        /* renamed from: ez */
        private C8298b m914ez() {
            return C8118do.m4279a(this.f1074tK, m913ey());
        }

        /* renamed from: eA */
        private C8637d m863eA() {
            return new C8637d(m914ez());
        }

        /* renamed from: eB */
        private C8298b m864eB() {
            return C8070bp.m4135a(this.f1074tK, m863eA(), m914ez());
        }

        /* renamed from: eC */
        private C8457e m865eC() {
            return C8459f.m5082a(m864eB(), m782cX());
        }

        /* renamed from: eD */
        private C8299c m866eD() {
            return C8123dv.m4294a(this.f1074tK, m865eC());
        }

        /* renamed from: eE */
        private C8653r m867eE() {
            return new C8653r(m866eD());
        }

        /* renamed from: eF */
        private C8299c m868eF() {
            return C8080ca.m4166a(this.f1074tK, m867eE(), m866eD());
        }

        /* renamed from: eG */
        private C8490a.C8492a m869eG() {
            return C8039aj.m4044a(this.f1074tK, new C8569a());
        }

        /* renamed from: eH */
        private C8490a m870eH() {
            return new C8490a(m869eG());
        }

        /* renamed from: eI */
        private C8531c.C8533a m871eI() {
            return C8062bg.m4111a(this.f1074tK, new C8611c());
        }

        /* renamed from: eJ */
        private C8531c m872eJ() {
            return new C8531c(m871eI());
        }

        /* renamed from: eK */
        private C8342c m873eK() {
            return C8046ar.m4065a(this.f1074tK, m868eF(), new C8572ac(), new C8617i(), m870eH(), m872eJ());
        }

        /* renamed from: eL */
        private C8608bj m874eL() {
            return new C8608bj(m894ef(), this.f1107uR.get());
        }

        /* renamed from: eM */
        private C8342c m875eM() {
            return C8109df.m4252a(this.f1074tK, m874eL(), m901em(), m782cX());
        }

        /* renamed from: eN */
        private C8606bh m876eN() {
            return new C8606bh(m894ef(), this.f1107uR.get());
        }

        /* renamed from: eO */
        private C8342c m877eO() {
            return C8108de.m4249a(this.f1074tK, m876eN(), m901em(), m782cX());
        }

        /* renamed from: eP */
        private C8342c m878eP() {
            return C8102cz.m4233a(this.f1074tK, new C8579ai());
        }

        /* renamed from: eQ */
        private C8342c m879eQ() {
            return C8100cx.m4227a(this.f1074tK, new C8624o());
        }

        /* renamed from: eR */
        private C0919c m880eR() {
            return new C0919c(m824dN());
        }

        /* renamed from: eS */
        private C0862c m881eS() {
            return C0717dt.m1616a(this.f1074tK, m880eR());
        }

        /* renamed from: eT */
        private C1002n m882eT() {
            return new C1002n(m881eS());
        }

        /* renamed from: eU */
        private C0862c m883eU() {
            return C0712bv.m1602a(this.f1074tK, m882eT(), m881eS());
        }

        /* renamed from: eV */
        private C0531n m884eV() {
            return C8097cu.m4217a(this.f1074tK, OPRRegistrationLandingActivity_ViewBinding.IconCompatParcelizer(this.f1154vf), OPRRegistrationLandingActivity_ViewBinding.IconCompatParcelizer(this.f1155vg));
        }

        /* renamed from: eW */
        private C7904g m885eW() {
            return C8085cg.m4182a(this.f1074tK, new C7990h());
        }

        /* renamed from: eX */
        private C0721l m886eX() {
            return C0722m.m1633a(m883eU());
        }

        /* renamed from: eY */
        private C0529g m887eY() {
            return C0710br.m1596a(this.f1074tK, m886eX());
        }

        /* renamed from: eZ */
        private C8028aa m888eZ() {
            return new C8028aa(m885eW(), m887eY());
        }

        /* renamed from: fa */
        private C7913j m941fa() {
            return C8121ds.m4288a(this.f1074tK, m888eZ());
        }

        /* renamed from: fb */
        private C8647l m942fb() {
            return new C8647l(m941fa());
        }

        /* renamed from: fc */
        private C7913j m943fc() {
            return C8073bu.m4144a(this.f1074tK, m942fb(), m941fa());
        }

        /* renamed from: fd */
        private C8078c m944fd() {
            return new C8078c(m883eU(), m884eV(), m943fc());
        }

        /* renamed from: fe */
        private C7907b m945fe() {
            return C8064bi.m4117a(this.f1074tK, m944fd());
        }

        /* renamed from: ff */
        private C8342c m946ff() {
            return C8060be.m4105a(this.f1074tK, m945fe(), new C8577ag());
        }

        /* renamed from: fg */
        private C8342c m947fg() {
            return C8044ap.m4058a(this.f1074tK, m945fe(), new C8622m());
        }

        /* renamed from: fh */
        private C7908c m948fh() {
            return C8065bk.m4120a(this.f1074tK, new C8144h());
        }

        /* renamed from: fi */
        private C8626q m949fi() {
            return new C8626q(m948fh());
        }

        /* renamed from: fj */
        private C8342c m950fj() {
            return C8125dx.m4301a(this.f1074tK, m945fe(), m949fi());
        }

        /* renamed from: fk */
        private C7917o m951fk() {
            return C8086ch.m4185a(this.f1074tK, new C8030ac());
        }

        /* renamed from: fl */
        private C7910e m952fl() {
            return C8068bn.m4129a(this.f1074tK, new C8146j());
        }

        /* renamed from: fm */
        private C8581ak m953fm() {
            return new C8581ak(m952fl());
        }

        /* renamed from: fn */
        private C8566z.C8567a m954fn() {
            return C8088ck.m4191a(this.f1074tK, m953fm());
        }

        /* renamed from: fo */
        private C8342c m955fo() {
            return C8087cj.m4187a(this.f1074tK, m951fk(), m954fn());
        }

        /* renamed from: fp */
        private C8342c m956fp() {
            return C8110dg.m4255a(this.f1074tK, new C8620k(), m952fl());
        }

        /* renamed from: fq */
        private C8342c m957fq() {
            return C8111dh.m4258a(this.f1074tK, new C8575ae(), m952fl());
        }

        /* renamed from: fr */
        private C7908c m958fr() {
            return C8096ct.m4215c(this.f1074tK, C8172x.m4423nh());
        }

        /* renamed from: fs */
        private C8342c m959fs() {
            return C8094cr.m4208a(this.f1074tK, m958fr(), new C8592au());
        }

        /* renamed from: ft */
        private C8165r m960ft() {
            return C8166s.m4404a(m952fl());
        }

        /* renamed from: fu */
        private C8337b m961fu() {
            return C8053ay.m4085a(this.f1074tK, m960ft());
        }

        /* renamed from: fv */
        private C8339c m962fv() {
            return C8061bf.m4108a(this.f1074tK, C8140em.m4332op());
        }

        /* renamed from: fw */
        private C8551n m963fw() {
            return new C8551n(m961fu(), m962fv());
        }

        /* renamed from: fx */
        private C8342c m964fx() {
            return C8057bb.m4096a(this.f1074tK, m963fw());
        }

        /* renamed from: fy */
        private C8596ay m965fy() {
            return new C8596ay(m952fl());
        }

        /* renamed from: fz */
        private C8342c m966fz() {
            return C8099cw.m4224a(this.f1074tK, m965fy());
        }

        /* renamed from: fA */
        private C8488f m915fA() {
            return new C8488f(m946ff(), m947fg(), m950fj(), m955fo(), m956fp(), m957fq(), m959fs(), m964fx(), m966fz());
        }

        /* renamed from: fB */
        private C7888b m916fB() {
            return C8279q.m4645a(this.f1075tL, new C7926b());
        }

        /* renamed from: fC */
        private C8394a m917fC() {
            return C8397b.m4885a(m916fB(), m782cX());
        }

        /* renamed from: fD */
        private C8239a m918fD() {
            return C8040al.m4046a(this.f1074tK, m917fC());
        }

        /* renamed from: fE */
        private C7918f m919fE() {
            return C8260al.m4588a(this.f1075tL, new C8194s());
        }

        /* renamed from: fF */
        private C8401e m920fF() {
            return C8403f.m4902a(m919fE());
        }

        /* renamed from: fG */
        private C8239a m921fG() {
            return C8089cm.m4194a(this.f1074tK, m920fF());
        }

        /* renamed from: fH */
        private C8398c m922fH() {
            return C8400d.m4891a(m918fD(), m921fG());
        }

        /* renamed from: fI */
        private C8240b m923fI() {
            return C8098cv.m4221a(this.f1074tK, m922fH());
        }

        /* renamed from: fJ */
        private C7911f m924fJ() {
            return C8069bo.m4132a(this.f1074tK, C8168u.m4413ne());
        }

        /* renamed from: fK */
        private C8035af m925fK() {
            return C8038ag.m4040a(m923fI(), m924fJ(), m916fB());
        }

        /* renamed from: fL */
        private C7906a m926fL() {
            return C8063bh.m4114a(this.f1074tK, m925fK());
        }

        /* renamed from: fM */
        private C8342c m927fM() {
            return C8058bc.m4099a(this.f1074tK, m926fL(), new C8634y());
        }

        /* renamed from: fN */
        private C8342c m928fN() {
            return C8059bd.m4102a(this.f1074tK, m926fL(), new C8570aa());
        }

        /* renamed from: fO */
        private C8342c m929fO() {
            return C8042an.m4053a(this.f1074tK, m926fL(), new C8613e());
        }

        /* renamed from: fP */
        private C8342c m930fP() {
            return C8043ao.m4055a(this.f1074tK, m926fL(), new C8615g());
        }

        /* renamed from: fQ */
        private C8342c m931fQ() {
            return C8092cp.m4202a(this.f1074tK, m948fh(), new C8588aq());
        }

        /* renamed from: fR */
        private C8342c m932fR() {
            return C8090cn.m4196a(this.f1074tK, m948fh(), new C8584am());
        }

        /* renamed from: fS */
        private C8342c m933fS() {
            return C8091co.m4199a(this.f1074tK, m948fh(), new C8586ao());
        }

        /* renamed from: fT */
        private C8483a m934fT() {
            return new C8483a(m927fM(), m928fN(), m929fO(), m930fP(), m931fQ(), m932fR(), m933fS());
        }

        /* renamed from: fU */
        private C8342c m935fU() {
            return C8095cs.m4211a(this.f1074tK, m915fA(), m934fT());
        }

        /* renamed from: fV */
        private C8342c m936fV() {
            return C8047as.m4067a(this.f1074tK, new C8549l());
        }

        /* renamed from: fW */
        private C8562v m937fW() {
            return new C8562v(m952fl());
        }

        /* renamed from: fX */
        private C8342c m938fX() {
            return C8051aw.m4079a(this.f1074tK, m937fW());
        }

        /* renamed from: fY */
        private C8137ej m939fY() {
            return C8138ek.m4327a(m952fl(), m951fk());
        }

        /* renamed from: fZ */
        private C7909d m940fZ() {
            return C8066bl.m4123a(this.f1074tK, m939fY());
        }

        /* renamed from: ga */
        private C8342c m993ga() {
            return C8050av.m4076a(this.f1074tK, m940fZ(), new C8632w());
        }

        /* renamed from: gb */
        private C8342c m994gb() {
            return C8093cq.m4205a(this.f1074tK, m948fh(), new C8590as());
        }

        /* renamed from: gc */
        private C8513am m995gc() {
            return new C8513am(m952fl());
        }

        /* renamed from: gd */
        private C8342c m996gd() {
            return C8107dd.m4247a(this.f1074tK, m995gc());
        }

        /* renamed from: ge */
        private C8406e m997ge() {
            return new C8406e(m824dN());
        }

        /* renamed from: gf */
        private C8295a m998gf() {
            return C8067bm.m4126a(this.f1074tK, m997ge());
        }

        /* renamed from: gg */
        private C8133ef m999gg() {
            return new C8133ef(m998gf());
        }

        /* renamed from: gh */
        private C7915l m1000gh() {
            return C8076by.m4154a(this.f1074tK, m999gg());
        }

        /* renamed from: gi */
        private C8564x m1001gi() {
            return new C8564x(m1000gh());
        }

        /* renamed from: gj */
        private C8342c m1002gj() {
            return C8054az.m4088a(this.f1074tK, m1001gi());
        }

        /* renamed from: gk */
        private C8151p m1003gk() {
            return new C8151p(m952fl());
        }

        /* renamed from: gl */
        private C8336a m1004gl() {
            return C8052ax.m4082a(this.f1074tK, m1003gk());
        }

        /* renamed from: gm */
        private C8524aw m1005gm() {
            return new C8524aw(m1004gl());
        }

        /* renamed from: gn */
        private C8342c m1006gn() {
            return C8115dl.m4271a(this.f1074tK, m1005gm());
        }

        /* renamed from: go */
        private C8526ay m1007go() {
            return new C8526ay(m1004gl());
        }

        /* renamed from: gp */
        private C8342c m1008gp() {
            return C8116dm.m4274a(this.f1074tK, m1007go());
        }

        /* renamed from: gq */
        private C8522au m1009gq() {
            return new C8522au(m1004gl());
        }

        /* renamed from: gr */
        private C8342c m1010gr() {
            return C8114dk.m4268a(this.f1074tK, m1009gq());
        }

        /* renamed from: gs */
        private C8529ba m1011gs() {
            return new C8529ba(m1004gl());
        }

        /* renamed from: gt */
        private C8342c m1012gt() {
            return C8117dn.m4277a(this.f1074tK, m1011gs());
        }

        /* renamed from: gu */
        private C8630u m1013gu() {
            return new C8630u(m952fl());
        }

        /* renamed from: gv */
        private C8342c m1014gv() {
            return C8049au.m4073a(this.f1074tK, m1013gu());
        }

        /* renamed from: gw */
        private C8554p m1015gw() {
            return new C8554p(m952fl());
        }

        /* renamed from: gx */
        private C8342c m1016gx() {
            return C8048at.m4070a(this.f1074tK, m1015gw());
        }

        /* renamed from: gy */
        private C8535e m1017gy() {
            return new C8535e(m952fl());
        }

        /* renamed from: gz */
        private C8342c m1018gz() {
            return C8041am.m4049a(this.f1074tK, m1017gy());
        }

        /* renamed from: gA */
        private C8520as m967gA() {
            return new C8520as(m952fl());
        }

        /* renamed from: gB */
        private C8342c m968gB() {
            return C8113dj.m4265a(this.f1074tK, m967gA());
        }

        /* renamed from: gC */
        private C8486d m969gC() {
            return new C8486d(m996gd(), m1002gj(), m1006gn(), m1008gp(), m1010gr(), m1012gt(), m1014gv(), m1016gx(), m1018gz(), m968gB());
        }

        /* renamed from: gD */
        private C8342c m970gD() {
            return C8056ba.m4093a(this.f1074tK, m969gC());
        }

        /* renamed from: gE */
        private Object m971gE() {
            return C8126dz.m4304g(C0828bl.m2064d(this.f1075tL));
        }

        /* renamed from: gF */
        private ExtractionParameters m972gF() {
            return PassportCaptureModule_GetExtractionParametersFactory.proxyGetExtractionParameters(this.f1085tV, new ExtractionParameters());
        }

        /* renamed from: gG */
        private LookAndFeelParameters m973gG() {
            return PassportCaptureModule_GetLookAndFeelParametersFactory.proxyGetLookAndFeelParameters(this.f1085tV, new LookAndFeelParameters());
        }

        /* renamed from: gH */
        private ProcessingParameters m974gH() {
            return PassportCaptureModule_GetProcessingParametersFactory.proxyGetProcessingParameters(this.f1085tV, new ProcessingParameters());
        }

        /* renamed from: gI */
        private C8217c m975gI() {
            return new C8217c(C0828bl.m2064d(this.f1075tL));
        }

        /* renamed from: gJ */
        private IJsonExactionHelper m976gJ() {
            return PassportCaptureModule_GetIJsonExactionHelperRttiFactory.proxyGetIJsonExactionHelperRtti(this.f1085tV, new RttiJsonExactionHelper());
        }

        /* renamed from: gK */
        private C0854b m977gK() {
            return C0821ax.m2043a(this.f1075tL, this.f1125uj.get());
        }

        /* renamed from: gL */
        private C0516e m978gL() {
            return C0813ac.m2018a(this.f1075tL, new C0954e());
        }

        /* renamed from: gM */
        private C0939b m979gM() {
            return m734a(C0952c.m2473a(C0828bl.m2064d(this.f1075tL), C0520b.this.getIBus()));
        }

        /* renamed from: gN */
        private C0513a m980gN() {
            return C0850w.m2175a(this.f1075tL, m979gM());
        }

        /* renamed from: gO */
        private IPassportDetector m981gO() {
            return PassportCaptureModule_GetIPassportDetectorFactory.proxyGetIPassportDetector(this.f1085tV, new PassportDetector());
        }

        /* renamed from: gP */
        private C8430i m982gP() {
            return new C8430i(m981gO());
        }

        /* renamed from: gQ */
        private C0735aa m983gQ() {
            return m694a(C8200ab.m4479m(C0828bl.m2064d(this.f1075tL)));
        }

        /* renamed from: gR */
        private IOverlayView m984gR() {
            return C8266av.m4607a(this.f1075tL, m983gQ());
        }

        /* renamed from: gS */
        private DocumentDetector m985gS() {
            return new DocumentDetector(C0828bl.m2064d(this.f1075tL));
        }

        /* renamed from: gT */
        private C0967f m986gT() {
            return new C0967f(m985gS());
        }

        /* renamed from: gU */
        private ICheckDetector m987gU() {
            return CheckCaptureModule_GetICheckDetectorFactory.proxyGetICheckDetector(this.f1083tT, new CheckDetector());
        }

        /* renamed from: gV */
        private C8424a m988gV() {
            return new C8424a(m987gU());
        }

        /* renamed from: gW */
        private C8426d m989gW() {
            return new C8426d(new FixedAspectRatioDetector());
        }

        /* renamed from: gX */
        private Object m990gX() {
            return m736b((Object) DocumentBaseOverlayView_Factory.newDocumentBaseOverlayView(C0828bl.m2064d(this.f1075tL)));
        }

        /* renamed from: gY */
        private IDocumentBaseOverlayView m991gY() {
            return CaptureAnimationsModule_ProvideIDocumentBaseOverlayViewFactory.proxyProvideIDocumentBaseOverlayView(this.f1080tQ, m990gX());
        }

        /* renamed from: gZ */
        private C0511t m992gZ() {
            return C0831bq.m2073a(this.f1077tN, this.f1165vq.get());
        }

        /* renamed from: ha */
        private C0570ao m1019ha() {
            return new C0570ao(C0520b.this.getIBus(), getIVideoResourceProvider());
        }

        /* renamed from: hb */
        private C0512u m1020hb() {
            return C0832br.m2076a(this.f1077tN, m1019ha());
        }

        /* renamed from: hc */
        private C0981a m1021hc() {
            return C0987h.m2564a(this.f1088tY, C0989j.m2572ml());
        }

        /* renamed from: hd */
        private C0979j m1022hd() {
            return C0980k.m2555c(m1021hc());
        }

        /* renamed from: he */
        private C0981a m1023he() {
            return C0976g.m2544a(this.f1087tX, m1022hd());
        }

        /* renamed from: hf */
        private C0968a m1024hf() {
            return C0970b.m2526a(m1023he());
        }

        /* renamed from: hg */
        private C0983c m1025hg() {
            return C0978i.m2549a(this.f1087tX, m1024hf());
        }

        /* renamed from: hh */
        private Object m1026hh() {
            return IsgDocumentDetector_Factory.newIsgDocumentDetector(m1025hg());
        }

        /* renamed from: hi */
        private GPUStrategyCombinedEdgeDetection m1027hi() {
            return GPUStrategyCombinedEdgeDetection_Factory.newGPUStrategyCombinedEdgeDetection(this.f1140uy.get());
        }

        /* renamed from: hj */
        private GPUStrategyEdgeDetection m1028hj() {
            return GpuDetectionModule_GetCombinedDocumentDetectionFactory.proxyGetCombinedDocumentDetection(this.f1079tP, m1027hi());
        }

        /* renamed from: hk */
        private GpuDocumentDetector m1029hk() {
            return new GpuDocumentDetector(C0828bl.m2064d(this.f1075tL), m1028hj());
        }

        /* renamed from: hl */
        private C7944e m1030hl() {
            return new C7944e(C0828bl.m2064d(this.f1075tL));
        }

        /* renamed from: b */
        private void m737b(C0844o oVar) {
            this.f1074tK = new C0705ah();
            if (oVar != null) {
                this.f1075tL = oVar;
                this.f1076tM = new C0810a();
                C0828bl c = C0828bl.m2063c(oVar);
                this.f1117ub = c;
                C0836f e = C0836f.m2089e(this.f1076tM, (HmlReviewDocumentActivity<Context>) c);
                this.f1118uc = e;
                this.f1119ud = OPRRegistrationLandingActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(C0731n.m1655a(this.f1117ub, e, C0520b.this.f1072tJ));
                this.f1120ue = C0835e.m2086d(this.f1076tM, (HmlReviewDocumentActivity<Context>) this.f1117ub);
                this.f1121uf = OPRRegistrationLandingActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(C0804e.m1940E(C0520b.this.f1072tJ, this.f1120ue));
                this.f1122ug = OPRRegistrationLandingActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(C0791b.m1868aB(this.f1117ub));
                HmlReviewDocumentActivity<C0788a> MediaBrowserCompat$ItemReceiver = OPRRegistrationLandingActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(C0789b.m1865aA(this.f1117ub));
                this.f1123uh = MediaBrowserCompat$ItemReceiver;
                C0820aw a = C0820aw.m2039a(oVar, this.f1122ug, MediaBrowserCompat$ItemReceiver);
                this.f1124ui = a;
                HmlReviewDocumentActivity<C0786a> MediaBrowserCompat$ItemReceiver2 = OPRRegistrationLandingActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(C0787b.m1862az(a));
                this.f1125uj = MediaBrowserCompat$ItemReceiver2;
                this.f1126uk = C0821ax.m2042G(oVar, MediaBrowserCompat$ItemReceiver2);
                C0834d c2 = C0834d.m2083c(this.f1076tM, (HmlReviewDocumentActivity<Context>) this.f1117ub);
                this.f1127ul = c2;
                C0799b h = C0799b.m1891h(this.f1117ub, this.f1126uk, c2);
                this.f1128um = h;
                C0815ah r = C0815ah.m2025r(oVar, h);
                this.f1129un = r;
                this.f1130uo = OPRRegistrationLandingActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(C0806g.m1948F(r, C0520b.this.f1072tJ));
                this.f1131up = OPRRegistrationLandingActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(C0620k.m1381q(this.f1117ub));
                this.f1132uq = OPRRegistrationLandingActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(C0558ah.m1124t(this.f1117ub));
                this.f1077tN = new C0830bn();
                HmlReviewDocumentActivity<C0571aq> MediaBrowserCompat$ItemReceiver3 = OPRRegistrationLandingActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(C0573ar.m1170v(this.f1117ub));
                this.f1133ur = MediaBrowserCompat$ItemReceiver3;
                C0833bs e2 = C0833bs.m2080e(this.f1077tN, MediaBrowserCompat$ItemReceiver3);
                this.f1134us = e2;
                this.f1135ut = C0849u.m2173a(oVar, this.f1131up, this.f1132uq, (HmlReviewDocumentActivity<IVideoResourceProvider>) e2);
                this.f1136uu = C0607g.m1323p(this.f1117ub);
                this.f1137uv = C0819au.m2036E(oVar, C0829bm.m2066tv());
                C0837g gVar = new C0837g();
                this.f1078tO = gVar;
                this.f1138uw = C0838h.m2098a(gVar);
                this.f1079tP = new GpuDetectionModule();
                GPUImageHolderImpl_Factory create = GPUImageHolderImpl_Factory.create(this.f1117ub);
                this.f1139ux = create;
                HmlReviewDocumentActivity<IGPUImageHolder> MediaBrowserCompat$ItemReceiver4 = OPRRegistrationLandingActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(GpuDetectionModule_GetIGPUImageHolderFactory.create(this.f1079tP, create));
                this.f1140uy = MediaBrowserCompat$ItemReceiver4;
                this.f1141uz = GPUStrategyFocusFactorDetection_Factory.create(MediaBrowserCompat$ItemReceiver4);
                C0596j b = C0596j.m1294b(C0520b.this.f1072tJ, this.f1138uw, this.f1141uz);
                this.f1090uA = b;
                this.f1091uB = C0839i.m2102a(this.f1078tO, (HmlReviewDocumentActivity<C0592i>) b);
                this.f1092uC = C0582b.m1242j(C0520b.this.f1072tJ, this.f1091uB);
                C0605q y = C0605q.m1319y(C0520b.this.f1072tJ);
                this.f1093uD = y;
                C0843n d = C0843n.m2114d(this.f1078tO, y);
                this.f1094uE = d;
                this.f1095uF = C0840j.m2105a(this.f1078tO, (HmlReviewDocumentActivity<C0579a>) this.f1092uC, (HmlReviewDocumentActivity<C0503i>) d);
                C0590g k = C0590g.m1272k(C0520b.this.f1072tJ, this.f1091uB);
                this.f1096uG = k;
                this.f1097uH = C0842l.m2111c(this.f1078tO, k);
                C0585e w = C0585e.m1249w(C0520b.this.f1072tJ);
                this.f1098uI = w;
                this.f1099uJ = C0841k.m2108b(this.f1078tO, w);
                this.f1100uK = C0600n.m1302a(C0520b.this.f1072tJ, this.f1138uw, this.f1095uF, this.f1097uH, this.f1099uJ, this.f1135ut);
                this.f1101uL = OPRRegistrationLandingActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(C0618i.m1378b(this.f1135ut, this.f1136uu, C0520b.this.f1072tJ, this.f1137uv, this.f1100uK));
                this.f1102uM = OPRRegistrationLandingActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(C0547ab.m1096s(C0520b.this.f1072tJ));
                this.f1103uN = OPRRegistrationLandingActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(C0563al.m1150u(C0520b.this.f1072tJ));
                this.f1080tQ = new CaptureAnimationsModule();
                this.f1104uO = OPRRegistrationLandingActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(C0743b.m1703rG());
                this.f1105uP = OPRRegistrationLandingActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(C0961n.m2502z(this.f1117ub));
                this.f1081tR = new IdCaptureModule();
                this.f1082tS = new BillCaptureModule();
                this.f1083tT = new CheckCaptureModule();
                this.f1084tU = new CreditCardCaptureModule();
                this.f1085tV = new PassportCaptureModule();
                this.f1106uQ = OPRRegistrationLandingActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(C0636r.m1429jU());
                this.f1107uR = OPRRegistrationLandingActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(C0714ci.m1608I(this.f1074tK, C0924h.m2395iX()));
                this.f1108uS = C0707ai.m1587a(this.f1074tK);
                C0708ak b2 = C0708ak.m1591b(this.f1074tK, this.f1117ub);
                this.f1109uT = b2;
                C0920d l = C0920d.m2386l(b2);
                this.f1110uU = l;
                C0717dt af = C0717dt.m1617af(this.f1074tK, l);
                this.f1111uV = af;
                C1011o au = C1011o.m2605au(af);
                this.f1112uW = au;
                this.f1113uX = C0712bv.m1603m(this.f1074tK, au, this.f1111uV);
                this.f1114uY = C0713cf.m1605F(this.f1074tK, C0703g.m1487mv());
                C0722m O = C0722m.m1632O(this.f1113uX);
                this.f1115uZ = O;
                C0710br y2 = C0710br.m1597y(this.f1074tK, O);
                this.f1149va = y2;
                C0724z p = C0724z.m1636p(this.f1114uY, y2);
                this.f1150vb = p;
                C0716dr ad = C0716dr.m1614ad(this.f1074tK, p);
                this.f1151vc = ad;
                C1001k as = C1001k.m2586as(ad);
                this.f1152vd = as;
                C0711bt k2 = C0711bt.m1600k(this.f1074tK, as, this.f1151vc);
                this.f1153ve = k2;
                this.f1154vf = C0720f.m1628d(this.f1117ub, this.f1113uX, k2);
                this.f1155vg = C0998c.m2581g(this.f1117ub, this.f1113uX, this.f1153ve);
                this.f1156vh = OPRRegistrationLandingActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(C0624o.m1388jQ());
                C0823b a2 = C0823b.m2049a(this.f1076tM, (HmlReviewDocumentActivity<Context>) this.f1117ub);
                this.f1157vi = a2;
                this.f1158vj = OPRRegistrationLandingActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(C0574b.m1173o(a2));
                C0847p a3 = C0847p.m2166a(oVar, (HmlReviewDocumentActivity<C0727j>) C0520b.this.f1071tI);
                this.f1159vk = a3;
                this.f1160vl = C0689b.m1480L(a3);
                this.f1161vm = C0822ay.m2046b(oVar, this.f1102uM, this.f1103uN);
                C0622m r2 = C0622m.m1383r(this.f1117ub);
                this.f1162vn = r2;
                this.f1163vo = C0827bk.m2060S(oVar, r2);
                this.f1164vp = OPRRegistrationLandingActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(ImageCaptureView_Factory.create(this.f1117ub, C0520b.this.f1072tJ, this.f1160vl, this.f1101uL, this.f1161vm, this.f1163vo));
                this.f1165vq = OPRRegistrationLandingActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(C0569an.m1161h(C0520b.this.f1072tJ, this.f1134us));
                this.f1086tW = new IsgDetectionModule();
                this.f1087tX = new C0975f();
                this.f1088tY = new C0986g();
                this.f1089tZ = new DetectionModule();
                C0987h a4 = C0987h.m2565a(this.f1088tY, (HmlReviewDocumentActivity<C0988i>) C0989j.m2571mk());
                this.f1166vr = a4;
                C0980k K = C0980k.m2554K(a4);
                this.f1167vs = K;
                C0976g a5 = C0976g.m2543a(this.f1087tX, (HmlReviewDocumentActivity<C0979j>) K);
                this.f1168vt = a5;
                C0974e J = C0974e.m2537J(a5);
                this.f1169vu = J;
                C0977h b3 = C0977h.m2547b(this.f1087tX, J);
                this.f1170vv = b3;
                ForcedIsgDocumentDetector_Factory create2 = ForcedIsgDocumentDetector_Factory.create(b3);
                this.f1171vw = create2;
                this.f1172vx = IsgDetectionModule_GetForcedDocumentDetectorFactory.create(this.f1086tW, create2);
                GPUStrategyForcedEdgeDetection_Factory create3 = GPUStrategyForcedEdgeDetection_Factory.create(this.f1140uy);
                this.f1173vy = create3;
                GpuDetectionModule_GetForcedDocumentDetectionFactory create4 = GpuDetectionModule_GetForcedDocumentDetectionFactory.create(this.f1079tP, create3);
                this.f1174vz = create4;
                ForcedGpuDocumentDetector_Factory create5 = ForcedGpuDocumentDetector_Factory.create(this.f1117ub, create4);
                this.f1142vA = create5;
                GpuDetectionModule_GetForcedDocumentDetectorFactory create6 = GpuDetectionModule_GetForcedDocumentDetectorFactory.create(this.f1079tP, create5);
                this.f1143vB = create6;
                this.f1144vC = DetectionModule_GetForcedDocumentDetectorFactory.create(this.f1089tZ, this.f1172vx, create6);
                C0929a aVar = new C0929a();
                this.f1116ua = aVar;
                this.f1145vD = OPRRegistrationLandingActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(C0931c.m2408b(aVar, C0938g.m2423jd()));
                C0935e n = C0935e.m2417n(this.f1117ub);
                this.f1146vE = n;
                this.f1147vF = OPRRegistrationLandingActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(C0930b.m2405a(this.f1116ua, (HmlReviewDocumentActivity<C0932d>) n));
                return;
            }
            throw null;
        }

        public final void inject(LocalProjectProvider localProjectProvider) {
            m730a(localProjectProvider);
        }

        public final void inject(ServerProjectProvider serverProjectProvider) {
            m732a(serverProjectProvider);
        }

        public final void inject(C0884a aVar) {
            m733a(aVar);
        }

        public final void inject(ComponentsInitAndBusRegister componentsInitAndBusRegister) {
            m691a(componentsInitAndBusRegister);
        }

        public final void injectMembers(ImageCaptureView imageCaptureView) {
            m1031n(imageCaptureView);
        }

        public final void injectMembers(SelfieCaptureExperience selfieCaptureExperience) {
            m690a(selfieCaptureExperience);
        }

        public final void injectMembers(BarCodeCaptureView barCodeCaptureView) {
            m683a(barCodeCaptureView);
        }

        public final void injectMembers(LicenseCaptureView licenseCaptureView) {
            m684a(licenseCaptureView);
        }

        public final void injectMembers(IdParameters idParameters) {
            m721a(idParameters);
        }

        public final void inject(ImageReviewActivity imageReviewActivity) {
            m700a(imageReviewActivity);
        }

        public final void inject(ProcessActivity processActivity) {
            m701a(processActivity);
        }

        public final void injectMembers(BillParameters billParameters) {
            m705a(billParameters);
        }

        public final void injectMembers(KtaJsonBill ktaJsonBill) {
            m707a(ktaJsonBill);
        }

        public final void injectMembers(RttiJsonBill rttiJsonBill) {
            m708a(rttiJsonBill);
        }

        public final void injectMembers(CheckParameters checkParameters) {
            m712a(checkParameters);
        }

        public final void injectMembers(KtaJsonCheck ktaJsonCheck) {
            m714a(ktaJsonCheck);
        }

        public final void injectMembers(RttiJsonCheck rttiJsonCheck) {
            m715a(rttiJsonCheck);
        }

        public final void injectMembers(CreditCardParameters creditCardParameters) {
            m716a(creditCardParameters);
        }

        public final void injectMembers(KtaJsonPassport ktaJsonPassport) {
            m723a(ktaJsonPassport);
        }

        public final void inject(BillExtractActivity billExtractActivity) {
            m703a(billExtractActivity);
        }

        public final void inject(CheckExtractActivity checkExtractActivity) {
            m710a(checkExtractActivity);
        }

        public final void inject(IdExtractActivity idExtractActivity) {
            m719a(idExtractActivity);
        }

        public final void inject(PassportExtractActivity passportExtractActivity) {
            m725a(passportExtractActivity);
        }

        public final void inject(BillWorkflowActivity billWorkflowActivity) {
            m706a(billWorkflowActivity);
        }

        public final void inject(CheckWorkflowActivity checkWorkflowActivity) {
            m713a(checkWorkflowActivity);
        }

        public final void inject(IdWorkflowActivity idWorkflowActivity) {
            m722a(idWorkflowActivity);
        }

        public final void inject(PassportWorkflowActivity passportWorkflowActivity) {
            m728a(passportWorkflowActivity);
        }

        public final SurfaceView getSurfaceView() {
            return C0827bk.m2061a(this.f1075tL, m890eb());
        }

        public final IBus getIBus() {
            return C0520b.this.getIBus();
        }

        public final C0625p getDeviceCamera() {
            return this.f1106uQ.get();
        }

        public final ExtractionParameters getExtractionParameters() {
            return new ExtractionParameters();
        }

        public final RttiExtractor getRttiExtractor() {
            return new RttiExtractor(m784cZ());
        }

        public final C8175b getRttiExtraction() {
            return new C8175b(m784cZ(), m891ec());
        }

        public final C7997c getKtaExtraction() {
            return new C7997c(m784cZ(), m892ed());
        }

        public final OnDeviceExtractionServer getOnDeviceExtractionServer() {
            return m692a(C8127ea.m4307og());
        }

        public final BarCodeCaptureView getBarCodeCaptureView() {
            return m683a(BarCodeCaptureView_Factory.newBarCodeCaptureView(C0828bl.m2064d(this.f1075tL), getGuideLineRenderer()));
        }

        public final IBase64ImageDecoder getIBase64ImageDecoder() {
            return C8280r.m4648a(this.f1075tL, new C7942d());
        }

        public final IIdFieldNameConvention getIIdFieldNameConvention() {
            return C8077bz.m4157a(this.f1074tK, new C8135eh());
        }

        public final C8129ec getOnDeviceIdExtractor() {
            return new C8129ec(m893ee(), m906er(), m873eK(), m875eM(), m877eO(), m878eP(), m879eQ(), m935fU(), m936fV(), m938fX(), m993ga(), m994gb(), m970gD());
        }

        public final C0623n getFileProvider() {
            return this.f1156vh.get();
        }

        public final C0542a getAssetProvider() {
            return this.f1158vj.get();
        }

        public final C7914k getIIdExtractorProvider() {
            return C8075bx.m4150b(this.f1074tK, m971gE());
        }

        public final C0500f getICameraView() {
            return C8282v.m4654a(this.f1075tL, this.f1164vp.get());
        }

        public final C8228v getGuideLineRenderer() {
            return new C8228v(C0828bl.m2064d(this.f1075tL));
        }

        public final BillParameters getBillParameters() {
            return m705a(BillParameters_Factory.newBillParameters());
        }

        public final CheckParameters getCheckParameters() {
            return m712a(CheckParameters_Factory.newCheckParameters());
        }

        public final CreditCardParameters getCreditCardParameters() {
            return m716a(CreditCardParameters_Factory.newCreditCardParameters());
        }

        public final IdParameters getIdParameters() {
            return m721a(IdParameters_Factory.newIdParameters());
        }

        public final PassportParameters getPassportParameters() {
            return m727a(PassportParameters_Factory.newPassportParameters());
        }

        public final IImageStorage getIImageStorage() {
            return C7897g.m3834c(C0520b.this.f1070tH);
        }

        public final C8234b getICaptureMenuView() {
            return C8283x.m4657a(this.f1075tL, m975gI());
        }

        public final C7898e getIImageParamsStore() {
            return C8258aj.m4582a(this.f1075tL, new C8190q());
        }

        public final LocalProjectProvider getLocalProjectProvider() {
            return C0715cl.m1612b(this.f1074tK, C0828bl.m2064d(this.f1075tL));
        }

        public final void injectMembers(RttiJsonPassport rttiJsonPassport) {
            m729a(rttiJsonPassport);
        }

        public final void injectMembers(PassportParameters passportParameters) {
            m727a(passportParameters);
        }

        public final void inject(IdCaptureBackActivity idCaptureBackActivity) {
            m718a(idCaptureBackActivity);
        }

        public final void inject(PassportCaptureActivity passportCaptureActivity) {
            m724a(passportCaptureActivity);
        }

        public final void inject(BillCaptureActivity billCaptureActivity) {
            m702a(billCaptureActivity);
        }

        public final void inject(CheckCaptureActivity checkCaptureActivity) {
            m709a(checkCaptureActivity);
        }

        public final void inject(IdCaptureActivity idCaptureActivity) {
            m717a(idCaptureActivity);
        }

        public final void injectMembers(DocumentCaptureExperience documentCaptureExperience) {
            m686a(documentCaptureExperience);
        }

        public final void injectMembers(CheckCaptureExperience checkCaptureExperience) {
            m685a(checkCaptureExperience);
        }

        public final void injectMembers(PassportCaptureExperience passportCaptureExperience) {
            m689a(passportCaptureExperience);
        }

        public final VideoPlayerCameraPlayer getVideoPlayerCameraPlayer() {
            return new VideoPlayerCameraPlayer(getIVideoResourceProvider(), m992gZ());
        }

        public final C0548ad getVideoPlayerCameraRecorder() {
            return new C0548ad(m1020hb(), getIVideoResourceProvider());
        }

        public final IVideoResourceProvider getIVideoResourceProvider() {
            return C0833bs.m2079a(this.f1077tN, this.f1133ur.get());
        }

        public final IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> getIsgDocumentDetector() {
            return IsgDetectionModule_GetDocumentDetectorFactory.proxyGetDocumentDetector(this.f1086tW, m1026hh());
        }

        public final IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> getGpuDocumentDetector() {
            return GpuDetectionModule_GetDocumentDetectorFactory.proxyGetDocumentDetector(this.f1079tP, m1029hk());
        }

        public final IFaceDetector getFaceDetector() {
            return DetectionModule_GetFaceDetectorFactory.proxyGetFaceDetector(this.f1089tZ, m1030hl());
        }

        public final C0669c getDetectorBasedCropper() {
            return C0671d.m1459G(this.f1144vC);
        }

        public final C0495c getMemoryBitmapCache() {
            return this.f1145vD.get();
        }

        public final C0495c getDiskBitmapCache() {
            return this.f1147vF.get();
        }

        public final void injectMembers(FixedAspectRatioCaptureExperience fixedAspectRatioCaptureExperience) {
            m687a(fixedAspectRatioCaptureExperience);
        }

        /* renamed from: a */
        private LocalProjectProvider m730a(LocalProjectProvider localProjectProvider) {
            LocalProjectProvider_MembersInjector.inject_cacheProvider(localProjectProvider, m740bH());
            return localProjectProvider;
        }

        /* renamed from: a */
        private ServerProjectProvider m732a(ServerProjectProvider serverProjectProvider) {
            ServerProjectProvider_MembersInjector.inject_connectivityManager(serverProjectProvider, m741bI());
            ServerProjectProvider_MembersInjector.inject_cacheProvider(serverProjectProvider, m740bH());
            return serverProjectProvider;
        }

        /* renamed from: a */
        private C0884a m733a(C0884a aVar) {
            C0886c.m2289a(aVar, m742bJ());
            C0886c.m2290a(aVar, m743bK());
            C0886c.m2288a(aVar, m744bL());
            C0886c.m2286a(aVar, m745bM());
            C0886c.m2287a(aVar, m746bN());
            return aVar;
        }

        /* renamed from: a */
        private ComponentsInitAndBusRegister m691a(ComponentsInitAndBusRegister componentsInitAndBusRegister) {
            C0726i.m1643a(componentsInitAndBusRegister, m747bO());
            C0726i.m1639a(componentsInitAndBusRegister, m748bP());
            C0726i.m1642a(componentsInitAndBusRegister, this.f1119ud.get());
            C0726i.m1646a(componentsInitAndBusRegister, m749bQ());
            C0726i.m1644a(componentsInitAndBusRegister, this.f1121uf.get());
            C0726i.m1645a(componentsInitAndBusRegister, this.f1130uo.get());
            C0726i.m1640a(componentsInitAndBusRegister, m751bS());
            C0726i.m1641a(componentsInitAndBusRegister, m752bT());
            return componentsInitAndBusRegister;
        }

        /* renamed from: n */
        private ImageCaptureView m1031n(ImageCaptureView imageCaptureView) {
            ImageCaptureView_MembersInjector.inject_bus(imageCaptureView, C0520b.this.getIBus());
            ImageCaptureView_MembersInjector.inject_apiEventManager(imageCaptureView, m754bV());
            ImageCaptureView_MembersInjector.inject_camera(imageCaptureView, this.f1101uL.get());
            ImageCaptureView_MembersInjector.inject_previewFrameHandler(imageCaptureView, m755bW());
            ImageCaptureView_MembersInjector.inject_surface(imageCaptureView, getSurfaceView());
            return imageCaptureView;
        }

        /* renamed from: a */
        private C8211ak m695a(C8211ak akVar) {
            C8213am.m4502a(akVar, m758bZ());
            return akVar;
        }

        /* renamed from: a */
        private C0740ap m696a(C0740ap apVar) {
            C0742ar.m1700a(apVar, m758bZ());
            C0742ar.m1701a(apVar, m787cc());
            return apVar;
        }

        /* renamed from: a */
        private C0744e m697a(C0744e eVar) {
            C0746g.m1709a(eVar, m758bZ());
            return eVar;
        }

        /* renamed from: a */
        private C0751l m698a(C0751l lVar) {
            C0754n.m1732a(lVar, m792ch());
            C0754n.m1731a(lVar, m758bZ());
            C0754n.m1730a(lVar, m793ci());
            C0754n.m1733a(lVar, m787cc());
            return lVar;
        }

        /* renamed from: a */
        private SelfieOverlayView m693a(SelfieOverlayView selfieOverlayView) {
            C8215ao.m4509a(selfieOverlayView, m786cb());
            C8215ao.m4507a(selfieOverlayView, m791cg());
            C8215ao.m4508a(selfieOverlayView, m795ck());
            return selfieOverlayView;
        }

        /* renamed from: a */
        private SelfieCaptureExperience m690a(SelfieCaptureExperience selfieCaptureExperience) {
            SelfieBaseCaptureExperience_MembersInjector.inject_captureController(selfieCaptureExperience, m757bY());
            SelfieBaseCaptureExperience_MembersInjector.inject_overlayViewInternal(selfieCaptureExperience, m797cm());
            SelfieCaptureExperience_MembersInjector.inject_detector(selfieCaptureExperience, getFaceDetector());
            return selfieCaptureExperience;
        }

        /* renamed from: a */
        private BarCodeCaptureView m683a(BarCodeCaptureView barCodeCaptureView) {
            ImageCaptureView_MembersInjector.inject_bus(barCodeCaptureView, C0520b.this.getIBus());
            ImageCaptureView_MembersInjector.inject_apiEventManager(barCodeCaptureView, m754bV());
            ImageCaptureView_MembersInjector.inject_camera(barCodeCaptureView, this.f1101uL.get());
            ImageCaptureView_MembersInjector.inject_previewFrameHandler(barCodeCaptureView, m755bW());
            ImageCaptureView_MembersInjector.inject_surface(barCodeCaptureView, getSurfaceView());
            BarCodeCaptureView_MembersInjector.inject_imageDataToBitmap(barCodeCaptureView, m801cq());
            return barCodeCaptureView;
        }

        /* renamed from: a */
        private C0757q m699a(C0757q qVar) {
            C0760s.m1766a(qVar, m793ci());
            C0760s.m1767a(qVar, m758bZ());
            C0760s.m1768a(qVar, m787cc());
            return qVar;
        }

        /* renamed from: a */
        private LicenseOverlayView m688a(LicenseOverlayView licenseOverlayView) {
            C0738ac.m1684a((C0735aa) licenseOverlayView, m803cs());
            C0738ac.m1680a((C0735aa) licenseOverlayView, m791cg());
            C0738ac.m1681a((C0735aa) licenseOverlayView, m805cu());
            C0738ac.m1682a((C0735aa) licenseOverlayView, m795ck());
            C0738ac.m1679a((C0735aa) licenseOverlayView, m793ci());
            C0738ac.m1685a((C0735aa) licenseOverlayView, m807cw());
            C0738ac.m1683a((C0735aa) licenseOverlayView, m809cy());
            return licenseOverlayView;
        }

        /* renamed from: a */
        private LicenseCaptureView m684a(LicenseCaptureView licenseCaptureView) {
            ImageCaptureView_MembersInjector.inject_bus(licenseCaptureView, C0520b.this.getIBus());
            ImageCaptureView_MembersInjector.inject_apiEventManager(licenseCaptureView, m754bV());
            ImageCaptureView_MembersInjector.inject_camera(licenseCaptureView, this.f1101uL.get());
            ImageCaptureView_MembersInjector.inject_previewFrameHandler(licenseCaptureView, m755bW());
            ImageCaptureView_MembersInjector.inject_surface(licenseCaptureView, getSurfaceView());
            LicenseCaptureView_MembersInjector.inject_licenseOverlay(licenseCaptureView, m759cA());
            return licenseCaptureView;
        }

        /* renamed from: a */
        private IdParameters m721a(IdParameters idParameters) {
            IdParameters_MembersInjector.injectExtractionParameters(idParameters, m760cB());
            IdParameters_MembersInjector.injectLookAndFeelParameters(idParameters, m761cC());
            IdParameters_MembersInjector.injectProcessingParameters(idParameters, m762cD());
            return idParameters;
        }

        /* renamed from: a */
        private ImageReviewActivity m700a(ImageReviewActivity imageReviewActivity) {
            ImageReviewActivity_MembersInjector.inject_store(imageReviewActivity, C7897g.m3834c(C0520b.this.f1070tH));
            ImageReviewActivity_MembersInjector.inject_buttonsBarView(imageReviewActivity, m764cF());
            return imageReviewActivity;
        }

        /* renamed from: a */
        private ProcessActivity m701a(ProcessActivity processActivity) {
            ProcessActivity_MembersInjector.inject_imageStorage(processActivity, C7897g.m3834c(C0520b.this.f1070tH));
            ProcessActivity_MembersInjector.inject_processor(processActivity, m766cH());
            ProcessActivity_MembersInjector.inject_buttonsBarView(processActivity, getICaptureMenuView());
            ProcessActivity_MembersInjector.inject_stringIdGenerator(processActivity, m767cI());
            ProcessActivity_MembersInjector.inject_imageParamsStore(processActivity, getIImageParamsStore());
            return processActivity;
        }

        /* renamed from: a */
        private BillParameters m705a(BillParameters billParameters) {
            BillParameters_MembersInjector.injectExtractionParameters(billParameters, m768cJ());
            BillParameters_MembersInjector.injectLookAndFeelParameters(billParameters, m769cK());
            BillParameters_MembersInjector.injectProcessingParameters(billParameters, m770cL());
            return billParameters;
        }

        /* renamed from: a */
        private KtaJsonBill m707a(KtaJsonBill ktaJsonBill) {
            KtaJsonBill_MembersInjector.inject_jsonExactionHelper(ktaJsonBill, m771cM());
            return ktaJsonBill;
        }

        /* renamed from: a */
        private RttiJsonBill m708a(RttiJsonBill rttiJsonBill) {
            RttiJsonBill_MembersInjector.inject_jsonExactionHelper(rttiJsonBill, m772cN());
            return rttiJsonBill;
        }

        /* renamed from: a */
        private CheckParameters m712a(CheckParameters checkParameters) {
            CheckParameters_MembersInjector.injectExtractionParameters(checkParameters, m773cO());
            CheckParameters_MembersInjector.injectLookAndFeelParameters(checkParameters, m774cP());
            CheckParameters_MembersInjector.injectProcessingParameters(checkParameters, m775cQ());
            return checkParameters;
        }

        /* renamed from: a */
        private KtaJsonCheck m714a(KtaJsonCheck ktaJsonCheck) {
            KtaJsonCheck_MembersInjector.inject_jsonExactionHelper(ktaJsonCheck, m776cR());
            return ktaJsonCheck;
        }

        /* renamed from: a */
        private RttiJsonCheck m715a(RttiJsonCheck rttiJsonCheck) {
            RttiJsonCheck_MembersInjector.inject_jsonExactionHelper(rttiJsonCheck, m777cS());
            return rttiJsonCheck;
        }

        /* renamed from: a */
        private CreditCardParameters m716a(CreditCardParameters creditCardParameters) {
            CreditCardParameters_MembersInjector.injectExtractionParameters(creditCardParameters, m778cT());
            CreditCardParameters_MembersInjector.injectLookAndFeelParameters(creditCardParameters, m779cU());
            CreditCardParameters_MembersInjector.injectProcessingParameters(creditCardParameters, m780cV());
            return creditCardParameters;
        }

        /* renamed from: a */
        private KtaJsonPassport m723a(KtaJsonPassport ktaJsonPassport) {
            KtaJsonPassport_MembersInjector.inject_jsonExactionHelper(ktaJsonPassport, m781cW());
            return ktaJsonPassport;
        }

        /* renamed from: a */
        private BillExtractor m704a(BillExtractor billExtractor) {
            BillExtractor_MembersInjector.injectRttiExtractionServerUrl(billExtractor, BillCaptureModule_GetUriRttiFactory.proxyGetUriRtti(this.f1082tS));
            BillExtractor_MembersInjector.injectRttiExtractionServer(billExtractor, m838db());
            BillExtractor_MembersInjector.injectRttiDeserializer(billExtractor, m839dc());
            BillExtractor_MembersInjector.injectRttiExceptionResponseDeserializer(billExtractor, m840dd());
            BillExtractor_MembersInjector.injectKtaExtractionServerUrl(billExtractor, BillCaptureModule_GetUriKtaFactory.proxyGetUriKta(this.f1082tS));
            BillExtractor_MembersInjector.injectKtaExtractionServer(billExtractor, m843dg());
            BillExtractor_MembersInjector.injectKtaDeserializer(billExtractor, m844dh());
            BillExtractor_MembersInjector.injectKtaExceptionResponseDeserializer(billExtractor, m845di());
            return billExtractor;
        }

        /* renamed from: a */
        private BillExtractActivity m703a(BillExtractActivity billExtractActivity) {
            ExtractActivity_MembersInjector.inject_imageStore(billExtractActivity, C7897g.m3834c(C0520b.this.f1070tH));
            ExtractActivity_MembersInjector.inject_buttonsBarView(billExtractActivity, getICaptureMenuView());
            ExtractActivity_MembersInjector.inject_imageParamsStore(billExtractActivity, getIImageParamsStore());
            BillExtractActivity_MembersInjector.inject_extractor(billExtractActivity, m846dj());
            return billExtractActivity;
        }

        /* renamed from: a */
        private CheckExtractor m711a(CheckExtractor checkExtractor) {
            CheckExtractor_MembersInjector.injectRttiExtractionServerUrl(checkExtractor, CheckCaptureModule_GetUriRttiFactory.proxyGetUriRtti(this.f1083tT));
            CheckExtractor_MembersInjector.injectRttiExtractionServer(checkExtractor, m848dl());
            CheckExtractor_MembersInjector.injectRttiCheckDeserializer(checkExtractor, m849dm());
            CheckExtractor_MembersInjector.injectRttiExceptionResponseDeserializer(checkExtractor, m850dn());
            CheckExtractor_MembersInjector.injectKtaExtractionServerUrl(checkExtractor, CheckCaptureModule_GetUriKtaFactory.proxyGetUriKta(this.f1083tT));
            CheckExtractor_MembersInjector.injectKtaExtractionServer(checkExtractor, m852dp());
            CheckExtractor_MembersInjector.injectKtaCheckDeserializer(checkExtractor, m853dq());
            CheckExtractor_MembersInjector.injectKtaExceptionResponseDeserializer(checkExtractor, m854dr());
            return checkExtractor;
        }

        /* renamed from: a */
        private CheckExtractActivity m710a(CheckExtractActivity checkExtractActivity) {
            ExtractActivity_MembersInjector.inject_imageStore(checkExtractActivity, C7897g.m3834c(C0520b.this.f1070tH));
            ExtractActivity_MembersInjector.inject_buttonsBarView(checkExtractActivity, getICaptureMenuView());
            ExtractActivity_MembersInjector.inject_imageParamsStore(checkExtractActivity, getIImageParamsStore());
            CheckExtractActivity_MembersInjector.inject_extractor(checkExtractActivity, m855ds());
            return checkExtractActivity;
        }

        /* renamed from: a */
        private IdExtractor m720a(IdExtractor idExtractor) {
            IdExtractor_MembersInjector.injectRttiExtractionServerUrl(idExtractor, IdCaptureModule_GetUriRttiFactory.proxyGetUriRtti(this.f1081tR));
            IdExtractor_MembersInjector.injectRttiExtractionServer(idExtractor, m857du());
            IdExtractor_MembersInjector.injectRttiDeserializer(idExtractor, m858dv());
            IdExtractor_MembersInjector.injectRttiExceptionResponseDeserializer(idExtractor, m859dw());
            IdExtractor_MembersInjector.injectKtaExtractionServerUrl(idExtractor, IdCaptureModule_GetUriKtaFactory.proxyGetUriKta(this.f1081tR));
            IdExtractor_MembersInjector.injectKtaExtractionServer(idExtractor, m861dy());
            IdExtractor_MembersInjector.injectKtaDeserializer(idExtractor, m862dz());
            IdExtractor_MembersInjector.injectKtaExceptionResponseDeserializer(idExtractor, m811dA());
            IdExtractor_MembersInjector.injectOnDeviceExtractionServer(idExtractor, m812dB());
            IdExtractor_MembersInjector.injectOnDeviceDeserializer(idExtractor, m813dC());
            IdExtractor_MembersInjector.injectOnDeviceExceptionDeserializer(idExtractor, m814dD());
            return idExtractor;
        }

        /* renamed from: a */
        private IdExtractActivity m719a(IdExtractActivity idExtractActivity) {
            ExtractActivity_MembersInjector.inject_imageStore(idExtractActivity, C7897g.m3834c(C0520b.this.f1070tH));
            ExtractActivity_MembersInjector.inject_buttonsBarView(idExtractActivity, getICaptureMenuView());
            ExtractActivity_MembersInjector.inject_imageParamsStore(idExtractActivity, getIImageParamsStore());
            IdExtractActivity_MembersInjector.inject_extractor(idExtractActivity, m815dE());
            return idExtractActivity;
        }

        /* renamed from: a */
        private OnDeviceIdExtractor m731a(OnDeviceIdExtractor onDeviceIdExtractor) {
            OnDeviceIdExtractor_MembersInjector.inject_extractorProvider(onDeviceIdExtractor, getIIdExtractorProvider());
            return onDeviceIdExtractor;
        }

        /* renamed from: a */
        private Object m735a(Object obj) {
            C8128eb.m4309a((OnDeviceExtractionServer) obj, m829dS());
            return obj;
        }

        /* renamed from: a */
        private PassportExtractor m726a(PassportExtractor passportExtractor) {
            PassportExtractor_MembersInjector.injectRttiExtractionServerUrl(passportExtractor, PassportCaptureModule_GetUriRttiFactory.proxyGetUriRtti(this.f1085tV));
            PassportExtractor_MembersInjector.injectRttiExtractionServer(passportExtractor, m817dG());
            PassportExtractor_MembersInjector.injectRttiDeserializer(passportExtractor, m818dH());
            PassportExtractor_MembersInjector.injectRttiExceptionResponseDeserializer(passportExtractor, m819dI());
            PassportExtractor_MembersInjector.injectKtaExtractionServerUrl(passportExtractor, PassportCaptureModule_GetUriKtaFactory.proxyGetUriKta(this.f1085tV));
            PassportExtractor_MembersInjector.injectKtaExtractionServer(passportExtractor, m821dK());
            PassportExtractor_MembersInjector.injectKtaDeserializer(passportExtractor, m822dL());
            PassportExtractor_MembersInjector.injectKtaExceptionResponseDeserializer(passportExtractor, m823dM());
            PassportExtractor_MembersInjector.injectOnDeviceExtractionServer(passportExtractor, m831dU());
            PassportExtractor_MembersInjector.injectOnDeviceDeserializer(passportExtractor, m833dW());
            PassportExtractor_MembersInjector.injectOnDeviceExceptionDeserializer(passportExtractor, C8331x2ace65f3.proxyGetOnDeviceExceptionResponseDeserializer(this.f1085tV));
            return passportExtractor;
        }

        /* renamed from: a */
        private PassportExtractActivity m725a(PassportExtractActivity passportExtractActivity) {
            ExtractActivity_MembersInjector.inject_imageStore(passportExtractActivity, C7897g.m3834c(C0520b.this.f1070tH));
            ExtractActivity_MembersInjector.inject_buttonsBarView(passportExtractActivity, getICaptureMenuView());
            ExtractActivity_MembersInjector.inject_imageParamsStore(passportExtractActivity, getIImageParamsStore());
            PassportExtractActivity_MembersInjector.inject_extractor(passportExtractActivity, m834dX());
            return passportExtractActivity;
        }

        /* renamed from: a */
        private BillWorkflowActivity m706a(BillWorkflowActivity billWorkflowActivity) {
            BillWorkflowActivity_MembersInjector.inject_parameters(billWorkflowActivity, m835dY());
            return billWorkflowActivity;
        }

        /* renamed from: a */
        private CheckWorkflowActivity m713a(CheckWorkflowActivity checkWorkflowActivity) {
            CheckWorkflowActivity_MembersInjector.inject_parameters(checkWorkflowActivity, m836dZ());
            CheckWorkflowActivity_MembersInjector.inject_imageStore(checkWorkflowActivity, C7897g.m3834c(C0520b.this.f1070tH));
            return checkWorkflowActivity;
        }

        /* renamed from: a */
        private IdWorkflowActivity m722a(IdWorkflowActivity idWorkflowActivity) {
            IdWorkflowActivity_MembersInjector.inject_base64Decoder(idWorkflowActivity, new C7926b());
            return idWorkflowActivity;
        }

        /* renamed from: a */
        private PassportWorkflowActivity m728a(PassportWorkflowActivity passportWorkflowActivity) {
            PassportWorkflowActivity_MembersInjector.inject_parameters(passportWorkflowActivity, m889ea());
            return passportWorkflowActivity;
        }

        /* renamed from: a */
        private OnDeviceExtractionServer m692a(OnDeviceExtractionServer onDeviceExtractionServer) {
            C8128eb.m4309a(onDeviceExtractionServer, m829dS());
            return onDeviceExtractionServer;
        }

        /* renamed from: a */
        private PassportParameters m727a(PassportParameters passportParameters) {
            PassportParameters_MembersInjector.injectExtractionParameters(passportParameters, m972gF());
            PassportParameters_MembersInjector.injectLookAndFeelParameters(passportParameters, m973gG());
            PassportParameters_MembersInjector.injectProcessingParameters(passportParameters, m974gH());
            return passportParameters;
        }

        /* renamed from: a */
        private RttiJsonPassport m729a(RttiJsonPassport rttiJsonPassport) {
            RttiJsonPassport_MembersInjector.inject_jsonExactionHelper(rttiJsonPassport, m976gJ());
            return rttiJsonPassport;
        }

        /* renamed from: a */
        private C0939b m734a(C0939b bVar) {
            C0953d.m2477a(bVar, this.f1104uO.get());
            C0953d.m2476a(bVar, m978gL());
            return bVar;
        }

        /* renamed from: a */
        private IdCaptureBackActivity m718a(IdCaptureBackActivity idCaptureBackActivity) {
            CaptureActivity_MembersInjector.inject_permissionChecker(idCaptureBackActivity, m977gK());
            CaptureActivity_MembersInjector.inject_imageStorage(idCaptureBackActivity, C7897g.m3834c(C0520b.this.f1070tH));
            CaptureActivity_MembersInjector.inject_imageParamsStore(idCaptureBackActivity, getIImageParamsStore());
            CaptureActivity_MembersInjector.inject_captureController(idCaptureBackActivity, m980gN());
            CaptureActivity_MembersInjector.inject_buttonsBarView(idCaptureBackActivity, getICaptureMenuView());
            CaptureActivity_MembersInjector.inject_stringIdGenerator(idCaptureBackActivity, m767cI());
            IdCaptureBackActivity_MembersInjector.inject_stringIdGenerator(idCaptureBackActivity, m767cI());
            IdCaptureBackActivity_MembersInjector.inject_imageStorage(idCaptureBackActivity, C7897g.m3834c(C0520b.this.f1070tH));
            IdCaptureBackActivity_MembersInjector.inject_imageParamsStore(idCaptureBackActivity, getIImageParamsStore());
            return idCaptureBackActivity;
        }

        /* renamed from: a */
        private C0735aa m694a(C0735aa aaVar) {
            C0738ac.m1684a(aaVar, m803cs());
            C0738ac.m1680a(aaVar, m791cg());
            C0738ac.m1681a(aaVar, m805cu());
            C0738ac.m1682a(aaVar, m795ck());
            C0738ac.m1679a(aaVar, m793ci());
            C0738ac.m1685a(aaVar, m807cw());
            C0738ac.m1683a(aaVar, m809cy());
            return aaVar;
        }

        /* renamed from: a */
        private PassportCaptureActivity m724a(PassportCaptureActivity passportCaptureActivity) {
            CaptureActivity_MembersInjector.inject_permissionChecker(passportCaptureActivity, m977gK());
            CaptureActivity_MembersInjector.inject_imageStorage(passportCaptureActivity, C7897g.m3834c(C0520b.this.f1070tH));
            CaptureActivity_MembersInjector.inject_imageParamsStore(passportCaptureActivity, getIImageParamsStore());
            CaptureActivity_MembersInjector.inject_captureController(passportCaptureActivity, m980gN());
            CaptureActivity_MembersInjector.inject_buttonsBarView(passportCaptureActivity, getICaptureMenuView());
            CaptureActivity_MembersInjector.inject_stringIdGenerator(passportCaptureActivity, m767cI());
            PassportCaptureActivity_MembersInjector.inject_adapter(passportCaptureActivity, m982gP());
            PassportCaptureActivity_MembersInjector.inject_frameView(passportCaptureActivity, m984gR());
            return passportCaptureActivity;
        }

        /* renamed from: a */
        private BillCaptureActivity m702a(BillCaptureActivity billCaptureActivity) {
            CaptureActivity_MembersInjector.inject_permissionChecker(billCaptureActivity, m977gK());
            CaptureActivity_MembersInjector.inject_imageStorage(billCaptureActivity, C7897g.m3834c(C0520b.this.f1070tH));
            CaptureActivity_MembersInjector.inject_imageParamsStore(billCaptureActivity, getIImageParamsStore());
            CaptureActivity_MembersInjector.inject_captureController(billCaptureActivity, m980gN());
            CaptureActivity_MembersInjector.inject_buttonsBarView(billCaptureActivity, getICaptureMenuView());
            CaptureActivity_MembersInjector.inject_stringIdGenerator(billCaptureActivity, m767cI());
            BillCaptureActivity_MembersInjector.inject_adapter(billCaptureActivity, m986gT());
            BillCaptureActivity_MembersInjector.inject_frameView(billCaptureActivity, m984gR());
            return billCaptureActivity;
        }

        /* renamed from: a */
        private CheckCaptureActivity m709a(CheckCaptureActivity checkCaptureActivity) {
            CaptureActivity_MembersInjector.inject_permissionChecker(checkCaptureActivity, m977gK());
            CaptureActivity_MembersInjector.inject_imageStorage(checkCaptureActivity, C7897g.m3834c(C0520b.this.f1070tH));
            CaptureActivity_MembersInjector.inject_imageParamsStore(checkCaptureActivity, getIImageParamsStore());
            CaptureActivity_MembersInjector.inject_captureController(checkCaptureActivity, m980gN());
            CaptureActivity_MembersInjector.inject_buttonsBarView(checkCaptureActivity, getICaptureMenuView());
            CaptureActivity_MembersInjector.inject_stringIdGenerator(checkCaptureActivity, m767cI());
            CheckCaptureActivity_MembersInjector.inject_adapter(checkCaptureActivity, m988gV());
            CheckCaptureActivity_MembersInjector.inject_frameView(checkCaptureActivity, m984gR());
            CheckCaptureActivity_MembersInjector.inject_imageStorage(checkCaptureActivity, C7897g.m3834c(C0520b.this.f1070tH));
            return checkCaptureActivity;
        }

        /* renamed from: a */
        private IdCaptureActivity m717a(IdCaptureActivity idCaptureActivity) {
            CaptureActivity_MembersInjector.inject_permissionChecker(idCaptureActivity, m977gK());
            CaptureActivity_MembersInjector.inject_imageStorage(idCaptureActivity, C7897g.m3834c(C0520b.this.f1070tH));
            CaptureActivity_MembersInjector.inject_imageParamsStore(idCaptureActivity, getIImageParamsStore());
            CaptureActivity_MembersInjector.inject_captureController(idCaptureActivity, m980gN());
            CaptureActivity_MembersInjector.inject_buttonsBarView(idCaptureActivity, getICaptureMenuView());
            CaptureActivity_MembersInjector.inject_stringIdGenerator(idCaptureActivity, m767cI());
            IdCaptureActivity_MembersInjector.inject_adapter(idCaptureActivity, m989gW());
            IdCaptureActivity_MembersInjector.inject_frameView(idCaptureActivity, m984gR());
            return idCaptureActivity;
        }

        /* renamed from: b */
        private Object m736b(Object obj) {
            C0735aa aaVar = (C0735aa) obj;
            C0738ac.m1684a(aaVar, m803cs());
            C0738ac.m1680a(aaVar, m791cg());
            C0738ac.m1681a(aaVar, m805cu());
            C0738ac.m1682a(aaVar, m795ck());
            C0738ac.m1679a(aaVar, m793ci());
            C0738ac.m1685a(aaVar, m807cw());
            C0738ac.m1683a(aaVar, m809cy());
            return obj;
        }

        /* renamed from: a */
        private DocumentCaptureExperience m686a(DocumentCaptureExperience documentCaptureExperience) {
            DocumentBaseCaptureExperience_MembersInjector.inject_captureController(documentCaptureExperience, m980gN());
            DocumentBaseCaptureExperience_MembersInjector.inject_overlayViewInternal(documentCaptureExperience, m991gY());
            DocumentCaptureExperience_MembersInjector.inject_adapter(documentCaptureExperience, m986gT());
            return documentCaptureExperience;
        }

        /* renamed from: a */
        private CheckCaptureExperience m685a(CheckCaptureExperience checkCaptureExperience) {
            DocumentBaseCaptureExperience_MembersInjector.inject_captureController(checkCaptureExperience, m980gN());
            DocumentBaseCaptureExperience_MembersInjector.inject_overlayViewInternal(checkCaptureExperience, m991gY());
            CheckCaptureExperience_MembersInjector.inject_adapter(checkCaptureExperience, m988gV());
            return checkCaptureExperience;
        }

        /* renamed from: a */
        private PassportCaptureExperience m689a(PassportCaptureExperience passportCaptureExperience) {
            DocumentBaseCaptureExperience_MembersInjector.inject_captureController(passportCaptureExperience, m980gN());
            DocumentBaseCaptureExperience_MembersInjector.inject_overlayViewInternal(passportCaptureExperience, m991gY());
            PassportCaptureExperience_MembersInjector.inject_adapter(passportCaptureExperience, m982gP());
            return passportCaptureExperience;
        }

        /* renamed from: a */
        private FixedAspectRatioCaptureExperience m687a(FixedAspectRatioCaptureExperience fixedAspectRatioCaptureExperience) {
            DocumentBaseCaptureExperience_MembersInjector.inject_captureController(fixedAspectRatioCaptureExperience, m980gN());
            DocumentBaseCaptureExperience_MembersInjector.inject_overlayViewInternal(fixedAspectRatioCaptureExperience, m991gY());
            FixedAspectRatioCaptureExperience_MembersInjector.inject_adapter(fixedAspectRatioCaptureExperience, m989gW());
            return fixedAspectRatioCaptureExperience;
        }
    }
}
