package com.kofax.kmc.kui.uicontrols;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.kofax.C7861R;
import com.kofax.kmc.kui.uicontrols.data.CameraType;
import com.kofax.kmc.kui.uicontrols.data.Flash;
import com.kofax.kmc.kui.uicontrols.data.GpsUsageLimits;
import com.kofax.kmc.kut.utilities.Licensing;
import com.kofax.kmc.kut.utilities.Size;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.IllegalArgumentException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.camera.C0498d;
import com.kofax.mobile.sdk._internal.camera.C0500f;
import com.kofax.mobile.sdk._internal.camera.C0509q;
import com.kofax.mobile.sdk._internal.camera.ICameraDelegate;
import com.kofax.mobile.sdk._internal.dagger.C0519a;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk._internal.impl.camera.C0608h;
import com.kofax.mobile.sdk._internal.impl.event.C0675a;
import com.kofax.mobile.sdk._internal.impl.event.C0677ad;
import com.kofax.mobile.sdk._internal.impl.event.C0680ah;
import com.kofax.mobile.sdk._internal.impl.event.C0681ai;
import com.kofax.mobile.sdk._internal.impl.event.C0682aj;
import com.kofax.mobile.sdk._internal.impl.event.C0684aq;
import com.kofax.mobile.sdk._internal.impl.event.C0685as;
import com.kofax.mobile.sdk._internal.impl.event.C0688az;
import com.kofax.mobile.sdk._internal.impl.event.C0691c;
import com.kofax.mobile.sdk._internal.impl.event.C0692e;
import com.kofax.mobile.sdk._internal.impl.event.C0693f;
import com.kofax.mobile.sdk._internal.impl.event.C0697r;
import com.kofax.mobile.sdk._internal.impl.event.C0699v;
import com.kofax.mobile.sdk._internal.impl.event.C7953af;
import com.kofax.mobile.sdk._internal.impl.event.C7954ak;
import com.kofax.mobile.sdk._internal.impl.event.C7955al;
import com.kofax.mobile.sdk._internal.impl.event.C7962av;
import com.kofax.mobile.sdk._internal.impl.event.C7963aw;
import com.kofax.mobile.sdk._internal.impl.event.C7965bb;
import com.kofax.mobile.sdk._internal.impl.event.C7966bc;
import com.kofax.mobile.sdk._internal.impl.event.C7970h;
import com.kofax.mobile.sdk._internal.impl.event.C7974m;
import com.kofax.mobile.sdk._internal.impl.event.C7978s;
import com.kofax.mobile.sdk._internal.impl.event.C7979t;
import com.kofax.mobile.sdk._internal.impl.event.C7980y;
import com.kofax.mobile.sdk._internal.impl.event.SetFocusAreasRequestBusEvent;
import com.kofax.mobile.sdk._internal.impl.event.SurfaceChangedEvent;
import com.kofax.mobile.sdk._internal.impl.event.UseVideoChangedEvent;
import java.util.ArrayList;
import java.util.List;
import p040o.FragmentBuilder_BindEasycashReviewFragment;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;
import p040o.HmlPinActivity;

@C0519a
public class ImageCaptureView extends RelativeLayout implements SurfaceHolder.Callback, C0500f {
    public static final int DEFAULT_LUMINANCE_THRESHOLD = 100;
    public static final int DEFAULT_TORCH_DELAY = 3;
    private static final String TAG = ImageCaptureView.class.getSimpleName();
    @HmlPinActivity
    protected IBus _bus;
    private Context _ctx;

    /* renamed from: kA */
    private CameraType f556kA;

    /* renamed from: kB */
    private Flash f557kB;
    /* access modifiers changed from: private */

    /* renamed from: kC */
    public ICameraDelegate f558kC;

    /* renamed from: kD */
    private List<Rect> f559kD;
    /* access modifiers changed from: private */

    /* renamed from: kE */
    public GpsUsageLimits f560kE;
    /* access modifiers changed from: private */

    /* renamed from: kF */
    public boolean f561kF;
    /* access modifiers changed from: private */

    /* renamed from: kG */
    public boolean f562kG;

    /* renamed from: kH */
    private boolean f563kH;

    /* renamed from: kI */
    private final ViewTreeObserver.OnGlobalLayoutListener f564kI;

    /* renamed from: kl */
    private final List<View> f565kl;

    /* renamed from: km */
    private final C0470a f566km;
    @HmlPinActivity

    /* renamed from: kn */
    C0675a f567kn;
    @HmlPinActivity

    /* renamed from: ko */
    C0608h f568ko;
    @HmlPinActivity

    /* renamed from: kp */
    C0509q f569kp;
    @HmlPinActivity

    /* renamed from: kq */
    SurfaceView f570kq;
    /* access modifiers changed from: private */

    /* renamed from: kr */
    public C0498d f571kr;
    /* access modifiers changed from: private */

    /* renamed from: ks */
    public int f572ks;
    /* access modifiers changed from: private */

    /* renamed from: kt */
    public int f573kt;
    /* access modifiers changed from: private */

    /* renamed from: ku */
    public int f574ku;
    /* access modifiers changed from: private */

    /* renamed from: kv */
    public int f575kv;
    /* access modifiers changed from: private */

    /* renamed from: kw */
    public int f576kw;
    /* access modifiers changed from: private */

    /* renamed from: kx */
    public int f577kx;
    /* access modifiers changed from: private */

    /* renamed from: ky */
    public int f578ky;
    /* access modifiers changed from: private */

    /* renamed from: kz */
    public int f579kz;

    public ViewGroup getViewGroup() {
        return this;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @HmlPinActivity
    public ImageCaptureView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public ImageCaptureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ImageCaptureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f565kl = new ArrayList();
        this.f566km = new C0470a();
        this.f571kr = null;
        this.f572ks = 0;
        this.f573kt = 0;
        this.f578ky = 100;
        this.f579kz = 3;
        this.f556kA = CameraType.BACK_CAMERA;
        this.f557kB = Flash.OFF;
        this.f558kC = null;
        this.f560kE = GpsUsageLimits.ALWAYS_USE_IF_ENABLED;
        this.f564kI = new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                boolean isShown = ImageCaptureView.this.isShown();
                if (isShown) {
                    if (!ImageCaptureView.this.f562kG) {
                        boolean unused = ImageCaptureView.this.f562kG = isShown;
                        ImageCaptureView imageCaptureView = ImageCaptureView.this;
                        imageCaptureView.m428a(imageCaptureView.f570kq.getHolder());
                    }
                } else if (ImageCaptureView.this.f562kG) {
                    ImageCaptureView.this.m433an();
                }
                boolean unused2 = ImageCaptureView.this.f562kG = isShown;
            }
        };
        this._ctx = context;
        if (isInEditMode()) {
            this.f567kn = null;
            this.f568ko = null;
            this.f570kq = null;
            return;
        }
        mo10553ai();
        checkLicense();
        this.f568ko.mo11546r(false);
        setBackgroundColor(-16777216);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ai */
    public void mo10553ai() {
        Injector.getInjector(getContext()).injectMembers(this);
    }

    public final int getImagePreviewWidth() {
        Point jA = this.f568ko.mo11539jA();
        if (jA == null) {
            return 0;
        }
        return jA.x;
    }

    public final int getImagePreviewHeight() {
        Point jA = this.f568ko.mo11539jA();
        if (jA == null) {
            return 0;
        }
        return jA.y;
    }

    public final Flash getFlash() {
        return this.f557kB;
    }

    public final void setFlash(Flash flash) {
        if (flash != null) {
            this.f557kB = flash;
            if (isFlashSupported(flash)) {
                this.f568ko.setFlash(flash);
                this._bus.post(new C7980y(this.f557kB));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("setFlash(Flash flash) method: 'flash' parameter is null.");
    }

    public final boolean isFlashSupported(Flash flash) {
        if (flash != null) {
            return this.f568ko.isFlashSupported(flash);
        }
        throw new IllegalArgumentException("flash is null");
    }

    public final GpsUsageLimits getGpsUsage() {
        return this.f560kE;
    }

    public final void setGpsUsage(GpsUsageLimits gpsUsageLimits) {
        this.f560kE = gpsUsageLimits;
        this._bus.post(new C7953af(gpsUsageLimits));
    }

    public final void setCameraType(CameraType cameraType) {
        this.f556kA = cameraType;
    }

    public final void setImageResolution(Size size) {
        setImageResolutionInternal(size);
    }

    private void setImageResolutionInternal(Size size) {
        if (this.f568ko.mo11528a(size)) {
            requestLayout();
            if (this.f561kF) {
                invalidate();
            }
        }
    }

    public final List<Size> getAllowableImageResolutions() {
        return this.f568ko.mo11544jz();
    }

    public final List<Rect> getFocusAreas() {
        return this.f559kD;
    }

    public final void setFocusAreas(List<Rect> list) throws KmcRuntimeException {
        this.f559kD = list;
        this.f568ko.mo11532c(list, getWidth(), getHeight());
        this.f568ko.mo11541jC();
    }

    public final int getMaxFocusAreas() {
        C0498d dVar = this.f571kr;
        if (dVar == null) {
            return 0;
        }
        try {
            return dVar.getMaxNumFocusAreas();
        } catch (Exception unused) {
            return 0;
        }
    }

    public final boolean getUseVideoFrame() {
        return this.f568ko.mo11540jB();
    }

    public final void setUseVideoFrame(boolean z) {
        if (this.f568ko.mo11546r(z)) {
            this._bus.post(new UseVideoChangedEvent(z));
        }
    }

    public final int getDeviceDeclinationPitch() {
        return this.f572ks;
    }

    public final void setDeviceDeclinationPitch(int i) {
        if (-180 <= i && i <= 180) {
            this.f572ks = i;
        }
        this._bus.post(new C7978s(i));
    }

    public final int getDeviceDeclinationRoll() {
        return this.f573kt;
    }

    public final void setDeviceDeclinationRoll(int i) {
        if (-180 <= i && i <= 180) {
            this.f573kt = i;
        }
        this._bus.post(new C7979t(i));
    }

    public final int getLuminanceThreshold() {
        return this.f578ky;
    }

    public final void setLuminanceThreshold(int i) {
        if (i > 0) {
            this.f578ky = i;
            this._bus.post(new C7954ak(i));
            return;
        }
        throw new IllegalArgumentException(this._ctx.getString(C7861R.string.ICV_InvalidLuminanceThresholdParameter));
    }

    public final int getTorchDelay() {
        return this.f579kz;
    }

    public final void setTorchDelay(int i) {
        if (i > 0) {
            this.f579kz = i;
            this._bus.post(new C7965bb(i));
            return;
        }
        throw new IllegalArgumentException(this._ctx.getString(C7861R.string.ICV_InvalidTorchDelayParameter));
    }

    public final void muteAutoTorch() {
        this._bus.post(new C7955al(true));
    }

    public final void unmuteAutoTorch() {
        this._bus.post(new C7955al(false));
    }

    public final void forceTakePicture() {
        forceTakePicture(false);
    }

    public final void forceTakePicture(boolean z) {
        ICameraDelegate iCameraDelegate = this.f558kC;
        if (iCameraDelegate != null) {
            iCameraDelegate.forceTakePicture(z);
        } else {
            this._bus.post(new C0677ad(false, z));
        }
    }

    public final void sessionCreate() {
        synchronized (this) {
            this._bus.post(new C7962av());
        }
    }

    public final void sessionDismiss() {
        synchronized (this) {
            this._bus.post(new C7963aw());
        }
    }

    public final void takePictureForCaptureExperience(String str) {
        takePictureForCaptureExperience(str, false);
    }

    public final void takePictureForCaptureExperience(String str, boolean z) {
        m445l(str);
        this._bus.post(new C0677ad(true, z));
    }

    public void forceTakePictureForCaptureExperience(String str, boolean z) {
        m445l(str);
        this._bus.post(new C0677ad(false, z));
    }

    /* renamed from: l */
    private void m445l(String str) {
        if (!str.startsWith("com.kofax.kmc.kui.uicontrols.")) {
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_UNSUPPORTED_OPERATION);
        }
    }

    public void setCameraDelegate(ICameraDelegate iCameraDelegate) {
        this.f558kC = iCameraDelegate;
    }

    public final void addOnAutoFocusResultListener(AutoFocusResultListener autoFocusResultListener) {
        this.f567kn.mo11614a(new C0692e(autoFocusResultListener));
    }

    public final void removeOnAutoFocusResultListener(AutoFocusResultListener autoFocusResultListener) {
        this.f567kn.mo11615a(autoFocusResultListener, AutoFocusResultListener.class);
    }

    public final void addOnImageCapturedListener(ImageCapturedListener imageCapturedListener) {
        this.f567kn.mo11614a(new C0680ah(imageCapturedListener));
    }

    public final void removeOnImageCapturedListener(ImageCapturedListener imageCapturedListener) {
        this.f567kn.mo11615a(imageCapturedListener, ImageCapturedListener.class);
    }

    public final void addStabilityDelayListener(StabilityDelayListener stabilityDelayListener) {
        this.f567kn.mo11614a(new C0688az(stabilityDelayListener));
    }

    public final void removeStabilityDelayListener(StabilityDelayListener stabilityDelayListener) {
        this.f567kn.mo11615a(stabilityDelayListener, StabilityDelayListener.class);
    }

    public final void addLevelnessListener(LevelnessListener levelnessListener) {
        this.f567kn.mo11614a(new C0681ai(levelnessListener));
    }

    public final void removeLevelnessListener(LevelnessListener levelnessListener) {
        this.f567kn.mo11615a(levelnessListener, LevelnessListener.class);
    }

    public final void addCameraInitializationListener(CameraInitializationListener cameraInitializationListener) {
        this.f567kn.mo11614a(new C0693f(cameraInitializationListener));
    }

    public final void removeCameraInitializationListener(CameraInitializationListener cameraInitializationListener) {
        this.f567kn.mo11615a(cameraInitializationListener, CameraInitializationListener.class);
    }

    public final void addCameraInitializationFailedListener(CameraInitializationFailedListener cameraInitializationFailedListener) {
        this.f567kn.mo11614a(new C7970h(cameraInitializationFailedListener));
    }

    public final void removeCameraInitializationFailedListener(CameraInitializationFailedListener cameraInitializationFailedListener) {
        this.f567kn.mo11615a(cameraInitializationFailedListener, CameraInitializationFailedListener.class);
    }

    public final void addPreviewCallbackListener(PreviewCallbackListener previewCallbackListener) {
        this.f567kn.mo11614a(new C0685as(previewCallbackListener));
    }

    public final void removePreviewCallbackListener(PreviewCallbackListener previewCallbackListener) {
        this.f567kn.mo11615a(previewCallbackListener, PreviewCallbackListener.class);
    }

    public final void addTorchLuminanceListener(TorchLuminanceListener torchLuminanceListener) {
        this.f567kn.mo11614a(new C7966bc(torchLuminanceListener));
    }

    public final void removeTorchLuminanceListener(TorchLuminanceListener torchLuminanceListener) {
        this.f567kn.mo11615a(torchLuminanceListener, TorchLuminanceListener.class);
    }

    /* access modifiers changed from: protected */
    public void checkLicense() {
        if (!m432am() && !Licensing.isSdkLicensed(Licensing.LicenseType.IMAGE_CAPTURE)) {
            throw new KmcRuntimeException(ErrorInfo.KMC_UT_LICENSE_IMAGE_CAPTURE);
        }
    }

    /* renamed from: am */
    private boolean m432am() {
        String property = System.getProperty("os.name");
        return property.equalsIgnoreCase("Mac OS X") || property.contains("Windows");
    }

    public void removeAllViews() {
        this.f565kl.clear();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            this.f565kl.add(getChildAt(i));
        }
        for (View next : this.f565kl) {
            if (next != this.f570kq) {
                removeView(next);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f574ku = i;
        this.f575kv = i2;
        this.f576kw = i3;
        this.f577kx = i4;
        if (!this.f561kF) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        try {
            int childCount = getChildCount();
            int abs = Math.abs(i3 - i);
            int abs2 = Math.abs(i4 - i2);
            int suggestedMinimumWidth = getSuggestedMinimumWidth();
            int suggestedMinimumHeight = getSuggestedMinimumHeight();
            Point h = this.f568ko.mo11537h(abs, abs2);
            h.set(Math.max(h.x, suggestedMinimumWidth), Math.max(h.y, suggestedMinimumHeight));
            int i5 = h.x;
            int i6 = h.y;
            int i7 = (abs - i5) / 2;
            int i8 = (abs2 - i6) / 2;
            this.f565kl.clear();
            for (int i9 = 0; i9 < childCount; i9++) {
                this.f565kl.add(getChildAt(i9));
            }
            for (View layout : this.f565kl) {
                layout.layout(i7, i8, i5 + i7, i6 + i8);
            }
        } catch (Exception unused) {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (!isInEditMode()) {
            super.onDetachedFromWindow();
            if (Build.VERSION.SDK_INT > 15) {
                getViewTreeObserver().removeOnGlobalLayoutListener(this.f564kI);
            } else {
                getViewTreeObserver().removeGlobalOnLayoutListener(this.f564kI);
            }
            removeView(this.f570kq);
            this.f570kq = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        if (!isInEditMode()) {
            super.onAttachedToWindow();
            SurfaceView surfaceView = Injector.getInjector(getContext().getApplicationContext()).getSurfaceView();
            this.f570kq = surfaceView;
            addView(surfaceView, 0);
            SurfaceHolder holder = this.f570kq.getHolder();
            holder.addCallback(this);
            setHolderPushBuffers(holder);
            getViewTreeObserver().addOnGlobalLayoutListener(this.f564kI);
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f561kF = true;
        m428a(surfaceHolder);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m428a(SurfaceHolder surfaceHolder) {
        if (this.f561kF && !this.f563kH && this.f562kG) {
            try {
                this.f568ko.setCameraType(this.f556kA);
                this.f568ko.open();
                this.f568ko.mo11522a(surfaceHolder, getWidth(), getHeight());
                this.f568ko.startPreview();
                this.f568ko.mo11523a(this.f569kp);
                requestLayout();
                this._bus.register(this.f566km);
                this._bus.post(new C0691c());
                this._bus.post(new SurfaceChangedEvent(true, this.f570kq));
                this.f563kH = true;
            } catch (RuntimeException e) {
                C0767k.m1823e(e);
                IBus iBus = this._bus;
                String str = TAG;
                C0682aj.C0683a aVar = C0682aj.C0683a.ERROR;
                StringBuilder sb = new StringBuilder();
                sb.append("Error starting camera preview: ");
                sb.append(e.getMessage());
                iBus.post(new C0682aj(str, aVar, sb.toString(), e));
            }
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f561kF = false;
        m433an();
    }

    /* access modifiers changed from: private */
    /* renamed from: an */
    public void m433an() {
        if (this.f563kH) {
            try {
                this.f568ko.close();
                this._bus.post(new SurfaceChangedEvent(false, (SurfaceView) null));
                this._bus.post(new C0697r());
                this._bus.unregister(this.f566km);
                if (this.f558kC != null) {
                    this.f558kC.onDetachFromWindow();
                }
                this.f563kH = false;
            } catch (Exception e) {
                C0767k.m1821e("Error", "exception", (Throwable) e);
            }
        }
    }

    private void setHolderPushBuffers(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null && Build.VERSION.SDK_INT < 11) {
            surfaceHolder.setType(3);
        }
    }

    /* renamed from: com.kofax.kmc.kui.uicontrols.ImageCaptureView$a */
    class C0470a {
        private C0470a() {
        }

        @FragmentBuilder_BindEasycashSalesheetIndexFragment
        /* renamed from: a */
        public void mo10606a(C0684aq aqVar) {
            if (ImageCaptureView.this.f558kC != null) {
                ImageCaptureView.this.f558kC.onPictureTaken();
            }
        }

        @FragmentBuilder_BindEasycashSalesheetIndexFragment
        /* renamed from: a */
        public void mo10605a(SetFocusAreasRequestBusEvent setFocusAreasRequestBusEvent) {
            if (ImageCaptureView.this.f558kC != null) {
                ImageCaptureView.this.f558kC.onFocusAreasRequest(setFocusAreasRequestBusEvent.areas, setFocusAreasRequestBusEvent.width, setFocusAreasRequestBusEvent.height);
            }
        }

        @FragmentBuilder_BindEasycashSalesheetIndexFragment
        public void onCameraParametersProduced(C7974m mVar) {
            C0498d unused = ImageCaptureView.this.f571kr = mVar.f3725Iv;
        }

        @FragmentBuilder_BindEasycashSalesheetIndexFragment
        /* renamed from: a */
        public void mo10607a(C0699v vVar) {
            ImageCaptureView imageCaptureView = ImageCaptureView.this;
            imageCaptureView.onLayout(true, imageCaptureView.f574ku, ImageCaptureView.this.f575kv, ImageCaptureView.this.f576kw, ImageCaptureView.this.f577kx);
        }

        @FragmentBuilder_BindEasycashReviewFragment
        /* renamed from: ao */
        public SurfaceChangedEvent mo10608ao() {
            return new SurfaceChangedEvent(ImageCaptureView.this.f561kF, ImageCaptureView.this.f570kq);
        }

        @FragmentBuilder_BindEasycashReviewFragment
        /* renamed from: ap */
        public C7978s mo10609ap() {
            return new C7978s(ImageCaptureView.this.f572ks);
        }

        @FragmentBuilder_BindEasycashReviewFragment
        /* renamed from: aq */
        public C7979t mo10610aq() {
            return new C7979t(ImageCaptureView.this.f573kt);
        }

        @FragmentBuilder_BindEasycashReviewFragment
        /* renamed from: ar */
        public C7953af mo10611ar() {
            return new C7953af(ImageCaptureView.this.f560kE);
        }

        @FragmentBuilder_BindEasycashReviewFragment
        /* renamed from: as */
        public UseVideoChangedEvent mo10612as() {
            return new UseVideoChangedEvent(ImageCaptureView.this.f568ko.mo11540jB());
        }

        @FragmentBuilder_BindEasycashReviewFragment
        /* renamed from: at */
        public C7954ak mo10613at() {
            return new C7954ak(ImageCaptureView.this.f578ky);
        }

        @FragmentBuilder_BindEasycashReviewFragment
        /* renamed from: au */
        public C7965bb mo10614au() {
            return new C7965bb(ImageCaptureView.this.f579kz);
        }
    }
}
