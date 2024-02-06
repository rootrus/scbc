package com.kofax.mobile.sdk.p012ah;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.os.Build;
import android.view.SurfaceView;
import com.kofax.kmc.ken.engines.DocumentDetector;
import com.kofax.kmc.ken.engines.IDocumentDetector;
import com.kofax.kmc.kui.uicontrols.ImageCaptureView;
import com.kofax.kmc.kui.uicontrols.captureanimations.ILicenseOverlayView;
import com.kofax.kmc.kui.uicontrols.captureanimations.LicenseOverlayView;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.C7888b;
import com.kofax.mobile.sdk._internal.C7898e;
import com.kofax.mobile.sdk._internal.C7918f;
import com.kofax.mobile.sdk._internal.C7919g;
import com.kofax.mobile.sdk._internal.C7921h;
import com.kofax.mobile.sdk._internal.IImageToByteArray;
import com.kofax.mobile.sdk._internal.camera.C0498d;
import com.kofax.mobile.sdk._internal.camera.C0499e;
import com.kofax.mobile.sdk._internal.camera.C0500f;
import com.kofax.mobile.sdk._internal.camera.C0506n;
import com.kofax.mobile.sdk._internal.camera.C0509q;
import com.kofax.mobile.sdk._internal.camera.C7890l;
import com.kofax.mobile.sdk._internal.camera.C7891m;
import com.kofax.mobile.sdk._internal.camera.C7892r;
import com.kofax.mobile.sdk._internal.camera.C7893v;
import com.kofax.mobile.sdk._internal.camera.CameraSourceParametersHolder;
import com.kofax.mobile.sdk._internal.camera.IVideoResourceProvider;
import com.kofax.mobile.sdk._internal.capture.C0513a;
import com.kofax.mobile.sdk._internal.capture.C0516e;
import com.kofax.mobile.sdk._internal.capture.C0517g;
import com.kofax.mobile.sdk._internal.capture.C7895f;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk._internal.extraction.IExtractionServer;
import com.kofax.mobile.sdk._internal.impl.C0727j;
import com.kofax.mobile.sdk._internal.impl.C0764y;
import com.kofax.mobile.sdk._internal.impl.C7924ac;
import com.kofax.mobile.sdk._internal.impl.C7926b;
import com.kofax.mobile.sdk._internal.impl.C7942d;
import com.kofax.mobile.sdk._internal.impl.C8190q;
import com.kofax.mobile.sdk._internal.impl.C8194s;
import com.kofax.mobile.sdk._internal.impl.C8196u;
import com.kofax.mobile.sdk._internal.impl.C8231w;
import com.kofax.mobile.sdk._internal.impl.IBase64ImageDecoder;
import com.kofax.mobile.sdk._internal.impl.camera.C0543aa;
import com.kofax.mobile.sdk._internal.impl.camera.C0556ag;
import com.kofax.mobile.sdk._internal.impl.camera.C0562ak;
import com.kofax.mobile.sdk._internal.impl.camera.C0619j;
import com.kofax.mobile.sdk._internal.impl.camera.C0621l;
import com.kofax.mobile.sdk._internal.impl.camera.C7931as;
import com.kofax.mobile.sdk._internal.impl.camera.C7935s;
import com.kofax.mobile.sdk._internal.impl.camera.C7937u;
import com.kofax.mobile.sdk._internal.impl.camera.C7939w;
import com.kofax.mobile.sdk._internal.impl.camera.VideoPlayerCameraSourceType;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.C7995a;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.C8010j;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.IKtaSessionIdProviderFactory;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaServiceCaller;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8174a;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8184g;
import com.kofax.mobile.sdk._internal.impl.view.C0734a;
import com.kofax.mobile.sdk._internal.impl.view.C0735aa;
import com.kofax.mobile.sdk._internal.impl.view.C0739ag;
import com.kofax.mobile.sdk._internal.impl.view.C0740ap;
import com.kofax.mobile.sdk._internal.impl.view.C0744e;
import com.kofax.mobile.sdk._internal.impl.view.C0749i;
import com.kofax.mobile.sdk._internal.impl.view.C0751l;
import com.kofax.mobile.sdk._internal.impl.view.C0755o;
import com.kofax.mobile.sdk._internal.impl.view.C0757q;
import com.kofax.mobile.sdk._internal.impl.view.C0763y;
import com.kofax.mobile.sdk._internal.impl.view.C8207ai;
import com.kofax.mobile.sdk._internal.impl.view.C8211ak;
import com.kofax.mobile.sdk._internal.impl.view.C8217c;
import com.kofax.mobile.sdk._internal.impl.view.C8226t;
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
import com.kofax.mobile.sdk._internal.view.C8235h;
import com.kofax.mobile.sdk._internal.view.C8236l;
import com.kofax.mobile.sdk._internal.view.C8237m;
import com.kofax.mobile.sdk._internal.view.IOverlayView;
import com.kofax.mobile.sdk.capture.processing.IImageProcessor;
import com.kofax.mobile.sdk.p006ab.C0786a;
import com.kofax.mobile.sdk.p007ac.C0788a;
import com.kofax.mobile.sdk.p008ad.C0790a;
import com.kofax.mobile.sdk.p009ae.C8247b;
import com.kofax.mobile.sdk.p010af.C0798a;
import com.kofax.mobile.sdk.p010af.C0807j;
import com.kofax.mobile.sdk.p013ai.C0853a;
import com.kofax.mobile.sdk.p013ai.C0854b;
import com.kofax.mobile.sdk.p014aj.C0855a;
import com.kofax.mobile.sdk.p014aj.C0856b;
import com.kofax.mobile.sdk.p023k.C0939b;
import com.kofax.mobile.sdk.p023k.C0954e;
import com.kofax.mobile.sdk.p023k.C0959m;
import com.kofax.mobile.sdk.p023k.C8410h;
import p040o.FragmentBuilder_BindEasycashReferralSendDfwFragment;

/* renamed from: com.kofax.mobile.sdk.ah.o */
public class C0844o {

    /* renamed from: V */
    private final Context f2047V;

    /* renamed from: a */
    public SurfaceView mo12066a(C0621l lVar) {
        return lVar;
    }

    /* renamed from: a */
    public IDocumentDetector mo12067a(DocumentDetector documentDetector) {
        return documentDetector;
    }

    /* renamed from: a */
    public IImageToByteArray mo12068a(C8231w wVar) {
        return wVar;
    }

    /* renamed from: a */
    public C7888b mo12069a(C7926b bVar) {
        return bVar;
    }

    /* renamed from: a */
    public C7890l mo12071a(C7935s sVar) {
        return sVar;
    }

    /* renamed from: a */
    public C7891m mo12072a(C7937u uVar) {
        return uVar;
    }

    /* renamed from: a */
    public C0506n mo12073a(C0845a aVar) {
        return aVar;
    }

    /* renamed from: a */
    public C7892r mo12075a(C7939w wVar) {
        return wVar;
    }

    /* renamed from: a */
    public C7893v mo12076a(C7931as asVar) {
        return asVar;
    }

    /* renamed from: a */
    public C0516e mo12077a(C0954e eVar) {
        return eVar;
    }

    /* renamed from: a */
    public C7898e mo12078a(C8190q qVar) {
        return qVar;
    }

    /* renamed from: a */
    public C7918f mo12079a(C8194s sVar) {
        return sVar;
    }

    /* renamed from: a */
    public C7919g mo12080a(C8196u uVar) {
        return uVar;
    }

    /* renamed from: a */
    public C7921h mo12081a(C7924ac acVar) {
        return acVar;
    }

    /* renamed from: a */
    public IBase64ImageDecoder mo12082a(C7942d dVar) {
        return dVar;
    }

    /* renamed from: a */
    public IKtaSessionIdProviderFactory mo12083a(C8010j jVar) {
        return jVar;
    }

    /* renamed from: a */
    public C7995a mo12084a(KtaServiceCaller ktaServiceCaller) {
        return ktaServiceCaller;
    }

    /* renamed from: a */
    public C8174a mo12085a(C8184g gVar) {
        return gVar;
    }

    /* renamed from: a */
    public C0769a mo12086a(C0734a aVar) {
        return aVar;
    }

    /* renamed from: a */
    public C0771d mo12087a(C0749i iVar) {
        return iVar;
    }

    /* renamed from: a */
    public C8235h mo12088a(C8226t tVar) {
        return tVar;
    }

    /* renamed from: a */
    public C0776j mo12089a(C0763y yVar) {
        return yVar;
    }

    /* renamed from: a */
    public C0777k mo12090a(C0739ag agVar) {
        return agVar;
    }

    /* renamed from: a */
    public C0854b mo12092a(C0786a aVar) {
        return aVar;
    }

    /* renamed from: a */
    public C0856b mo12093a(C0807j jVar) {
        return jVar;
    }

    /* renamed from: a */
    public IImageProcessor mo12094a(C8247b bVar) {
        return bVar;
    }

    /* renamed from: b */
    public ILicenseOverlayView mo12095b(LicenseOverlayView licenseOverlayView) {
        return licenseOverlayView;
    }

    /* renamed from: b */
    public C0517g mo12096b(C0959m mVar) {
        return mVar;
    }

    /* renamed from: b */
    public C8234b mo12097b(C8217c cVar) {
        return cVar;
    }

    /* renamed from: b */
    public C0773f mo12098b(C0755o oVar) {
        return oVar;
    }

    /* renamed from: b */
    public C8236l mo12099b(C8207ai aiVar) {
        return aiVar;
    }

    /* renamed from: b */
    public C0855a mo12100b(C0798a aVar) {
        return aVar;
    }

    /* renamed from: b */
    public FragmentBuilder_BindEasycashReferralSendDfwFragment mo12101b(C0727j jVar) {
        return jVar;
    }

    /* renamed from: c */
    public C0770c mo12102c(C0744e eVar) {
        return eVar;
    }

    /* renamed from: c */
    public C0772e mo12103c(C0751l lVar) {
        return lVar;
    }

    /* renamed from: c */
    public C0774g mo12104c(C0757q qVar) {
        return qVar;
    }

    /* renamed from: c */
    public C8237m mo12105c(C8211ak akVar) {
        return akVar;
    }

    /* renamed from: c */
    public C0778o mo12106c(C0740ap apVar) {
        return apVar;
    }

    /* renamed from: d */
    public C0498d mo12107d(C0499e eVar) {
        return eVar;
    }

    /* renamed from: e */
    public IOverlayView mo12108e(C0735aa aaVar) {
        return aaVar;
    }

    /* renamed from: e */
    public C0775i mo12109e(C0764y yVar) {
        return yVar;
    }

    /* renamed from: j */
    public C7895f mo12110j(C8410h hVar) {
        return hVar;
    }

    /* renamed from: m */
    public C0513a mo12111m(C0939b bVar) {
        return bVar;
    }

    /* renamed from: o */
    public C0500f mo12112o(ImageCaptureView imageCaptureView) {
        return imageCaptureView;
    }

    public C0844o(Context context) {
        this.f2047V = context;
    }

    /* renamed from: sz */
    public Context mo12113sz() {
        return this.f2047V;
    }

    /* renamed from: a */
    public C0509q mo12074a(C0543aa aaVar, C0562ak akVar) {
        return (!CameraSourceParametersHolder.isVideoPlayerCameraSourceProvider() || !VideoPlayerCameraSourceType.VIDEO_PLAYER.equals(CameraSourceParametersHolder.getCameraSourceType())) ? aaVar : akVar;
    }

    /* renamed from: a */
    public C0853a mo12091a(C0790a aVar, C0788a aVar2) {
        return Build.VERSION.SDK_INT >= 23 ? aVar : aVar2;
    }

    /* renamed from: com.kofax.mobile.sdk.ah.o$a */
    public static class C0845a implements C0506n {
        /* renamed from: e */
        public Camera.Size mo11198e(Point point) {
            try {
                return (Camera.Size) Camera.Size.class.getConstructors()[0].newInstance(new Object[]{null, Integer.valueOf(point.x), Integer.valueOf(point.y)});
            } catch (Exception e) {
                e.printStackTrace();
                throw new KmcRuntimeException(ErrorInfo.KMC_GN_UNKNOWN_ERROR, e);
            }
        }
    }

    /* renamed from: a */
    public C0499e mo12070a(C0619j jVar, C0556ag agVar, IVideoResourceProvider iVideoResourceProvider) {
        if (!CameraSourceParametersHolder.isVideoPlayerCameraSourceProvider()) {
            return jVar.get();
        }
        iVideoResourceProvider.setFileParameters(CameraSourceParametersHolder.getFilename(), CameraSourceParametersHolder.getStorageType());
        agVar.mo11435a(CameraSourceParametersHolder.getCameraSourceType());
        return agVar.get();
    }

    /* renamed from: v */
    public IExtractionServer mo12114v(Context context) {
        int i = C08461.f2048Yh[Injector.getInjector(context).getExtractionParameters().getExtractionType().ordinal()];
        if (i == 2) {
            throw new UnsupportedOperationException("KTA server not implemented");
        } else if (i != 3) {
            return Injector.getInjector(context).getRttiExtractor();
        } else {
            return Injector.getInjector(context).getOnDeviceExtractionServer();
        }
    }

    /* renamed from: com.kofax.mobile.sdk.ah.o$1 */
    static /* synthetic */ class C08461 {

        /* renamed from: Yh */
        static final /* synthetic */ int[] f2048Yh;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.kofax.mobile.sdk.capture.parameter.ExtractionParameters$ExtractionType[] r0 = com.kofax.mobile.sdk.capture.parameter.ExtractionParameters.ExtractionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2048Yh = r0
                com.kofax.mobile.sdk.capture.parameter.ExtractionParameters$ExtractionType r1 = com.kofax.mobile.sdk.capture.parameter.ExtractionParameters.ExtractionType.RTTI     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2048Yh     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.mobile.sdk.capture.parameter.ExtractionParameters$ExtractionType r1 = com.kofax.mobile.sdk.capture.parameter.ExtractionParameters.ExtractionType.KTA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2048Yh     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.kofax.mobile.sdk.capture.parameter.ExtractionParameters$ExtractionType r1 = com.kofax.mobile.sdk.capture.parameter.ExtractionParameters.ExtractionType.ON_DEVICE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk.p012ah.C0844o.C08461.<clinit>():void");
        }
    }
}
