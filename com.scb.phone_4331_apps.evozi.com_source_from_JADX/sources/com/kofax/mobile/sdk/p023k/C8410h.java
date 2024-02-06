package com.kofax.mobile.sdk.p023k;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.kofax.kmc.ken.engines.data.SelfieDetectionSettings;
import com.kofax.kmc.kui.uicontrols.AutoFocusResultEvent;
import com.kofax.kmc.kui.uicontrols.AutoFocusResultListener;
import com.kofax.kmc.kui.uicontrols.ImageCapturedEvent;
import com.kofax.kmc.kui.uicontrols.ImageCapturedListener;
import com.kofax.kmc.kui.uicontrols.PreviewCallbackListener;
import com.kofax.kmc.kui.uicontrols.PreviewFrameEvent;
import com.kofax.kmc.kui.uicontrols.captureanimations.SelfieCaptureExperienceCriteriaHolder;
import com.kofax.kmc.kut.utilities.RectUtil;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.camera.C0500f;
import com.kofax.mobile.sdk._internal.capture.C7895f;
import com.kofax.mobile.sdk._internal.detection.IFaceDetectionResult;
import com.kofax.mobile.sdk._internal.detection.IFaceDetector;
import com.kofax.mobile.sdk._internal.impl.event.C0676aa;
import com.kofax.mobile.sdk._internal.view.C8238n;
import java.util.LinkedHashSet;
import java.util.Set;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.k.h */
public class C8410h implements AutoFocusResultListener, ImageCapturedListener, PreviewCallbackListener, C7895f {
    private static final String TAG = C8410h.class.getSimpleName();

    /* renamed from: Ee */
    private int f4946Ee = CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE;
    /* access modifiers changed from: private */

    /* renamed from: FX */
    public C8238n f4947FX;
    /* access modifiers changed from: private */

    /* renamed from: FY */
    public C8416a f4948FY;
    /* access modifiers changed from: private */

    /* renamed from: FZ */
    public boolean f4949FZ;
    /* access modifiers changed from: private */

    /* renamed from: Fl */
    public C0500f f4950Fl;

    /* renamed from: Fn */
    private final C0957l f4951Fn = new C0957l(this);
    /* access modifiers changed from: private */

    /* renamed from: Ga */
    public boolean f4952Ga;
    /* access modifiers changed from: private */

    /* renamed from: Gb */
    public C8417b f4953Gb = C8417b.NONE;

    /* renamed from: Gc */
    private int f4954Gc;
    /* access modifiers changed from: private */

    /* renamed from: Gd */
    public boolean f4955Gd;
    /* access modifiers changed from: private */

    /* renamed from: Ge */
    public boolean f4956Ge;

    /* renamed from: Gf */
    private boolean f4957Gf;

    /* renamed from: Gg */
    final Runnable f4958Gg = new Runnable() {
        public void run() {
            if (!C8410h.this.m4939kN() || C8410h.this.f4948FY == null || !C8410h.this.f4948FY.mo55311li() || !C8410h.this.f4948FY.mo55312lj() || !C8410h.this.f4948FY.mo55313lk()) {
                boolean unused = C8410h.this._sdkCaptureRequested = false;
                boolean unused2 = C8410h.this.f4961ml = true;
                return;
            }
            C8410h.this.f4950Fl.takePictureForCaptureExperience("com.kofax.kmc.kui.uicontrols.");
        }
    };
    private IBus _bus = null;
    private Set<ImageCapturedListener> _imageCapturedListeners = new LinkedHashSet();
    /* access modifiers changed from: private */
    public final Object _lock = new Object();
    /* access modifiers changed from: private */
    public boolean _sdkCaptureRequested;
    private final Handler _uiHandler = new Handler(Looper.getMainLooper());
    private boolean _vibrationEnabled = true;
    private Vibrator _vibrator;

    /* renamed from: mB */
    private boolean f4959mB;
    /* access modifiers changed from: private */

    /* renamed from: mL */
    public ImageCapturedEvent f4960mL;
    /* access modifiers changed from: private */

    /* renamed from: ml */
    public boolean f4961ml;

    /* renamed from: nm */
    private SelfieCaptureExperienceCriteriaHolder f4962nm;

    /* renamed from: np */
    private IFaceDetector f4963np;

    /* renamed from: nq */
    private SelfieDetectionSettings f4964nq;

    /* renamed from: com.kofax.mobile.sdk.k.h$b */
    enum C8417b {
        NONE,
        FIT_FACE,
        BLINK
    }

    @HmlPinActivity
    public C8410h(Context context, IBus iBus) {
        this._vibrator = (Vibrator) context.getSystemService("vibrator");
        this._bus = iBus;
    }

    public void addOnImageCapturedListener(ImageCapturedListener imageCapturedListener) {
        if (imageCapturedListener != null) {
            this._imageCapturedListeners.add(imageCapturedListener);
        }
    }

    public void removeOnImageCapturedListener(ImageCapturedListener imageCapturedListener) {
        this._imageCapturedListeners.remove(imageCapturedListener);
    }

    /* renamed from: d */
    public void mo54232d(boolean z) {
        mo55303kZ();
        this._sdkCaptureRequested = false;
        synchronized (this._lock) {
            this.f4961ml = true;
        }
    }

    public void stopCapture() {
        this.f4961ml = false;
    }

    /* access modifiers changed from: private */
    public void invokeImageCapturedListeners(ImageCapturedEvent imageCapturedEvent) {
        for (ImageCapturedListener onImageCaptured : this._imageCapturedListeners) {
            onImageCaptured.onImageCaptured(imageCapturedEvent);
        }
    }

    public void destroy() {
        removeCameraEventListeners();
        IFaceDetector iFaceDetector = this.f4963np;
        if (iFaceDetector != null) {
            iFaceDetector.destroy();
            this.f4963np = null;
        }
        removeAllViews();
        mo55303kZ();
    }

    /* access modifiers changed from: protected */
    public void removeAllViews() {
        C0500f fVar = this.f4950Fl;
        if (fVar != null) {
            fVar.getViewGroup().removeView(this.f4947FX.getView());
        }
    }

    public void setOuterOverlayFrameColor(int i) {
        this.f4947FX.setOuterOverlayFrameColor(i);
    }

    public int getOuterOverlayFrameColor() {
        return this.f4947FX.getOuterOverlayFrameColor();
    }

    public void setVibrationEnabled(boolean z) {
        this._vibrationEnabled = z;
    }

    public boolean isVibrationEnabled() {
        return this._vibrationEnabled;
    }

    /* renamed from: a */
    public void mo54228a(IFaceDetector iFaceDetector) {
        this.f4963np = new C8419j(iFaceDetector);
    }

    /* renamed from: b */
    public void mo54231b(SelfieCaptureExperienceCriteriaHolder selfieCaptureExperienceCriteriaHolder) {
        this.f4962nm = selfieCaptureExperienceCriteriaHolder;
        SelfieDetectionSettings detectionSettings = selfieCaptureExperienceCriteriaHolder.getDetectionSettings();
        this.f4964nq = detectionSettings;
        C8238n nVar = this.f4947FX;
        if (nVar != null) {
            nVar.setOverlayAspectRatio(detectionSettings.getTargetFrameAspectRatio());
            this.f4947FX.setCenter(this.f4964nq.getCenterPoint());
            this.f4947FX.setPaddingPercent(this.f4964nq.getTargetFramePaddingPercent());
        }
    }

    /* renamed from: a */
    public void mo54227a(C0500f fVar) {
        this.f4950Fl = fVar;
        fVar.getViewGroup().addView(this.f4947FX.getView());
        addCameraEventListeners();
    }

    /* access modifiers changed from: protected */
    public void addCameraEventListeners() {
        if (this.f4963np != null) {
            this.f4950Fl.addOnAutoFocusResultListener(this);
            this.f4950Fl.addOnImageCapturedListener(this);
            this.f4951Fn.mo12358b(this.f4950Fl);
            this._bus.post(new C0676aa(true));
            return;
        }
        throw new IllegalStateException("detector is not set");
    }

    /* access modifiers changed from: protected */
    public void removeCameraEventListeners() {
        C0500f fVar = this.f4950Fl;
        if (fVar != null) {
            fVar.removeOnAutoFocusResultListener(this);
            this.f4950Fl.removeOnImageCapturedListener(this);
            this.f4951Fn.stopListening();
        }
    }

    /* renamed from: a */
    public void mo54229a(C8238n nVar) {
        this.f4947FX = nVar;
        this.f4954Gc = nVar.getGuidanceFrameColor();
    }

    public int getFrameColor() {
        return this.f4947FX.getGuidanceFrameColor();
    }

    public void setFrameColor(int i) {
        this.f4947FX.setGuidanceFrameColor(i);
        this.f4954Gc = i;
    }

    public void onAutoFocus(AutoFocusResultEvent autoFocusResultEvent) {
        this.f4959mB = autoFocusResultEvent.getSuccess();
    }

    /* access modifiers changed from: private */
    /* renamed from: kN */
    public boolean m4939kN() {
        if (this.f4962nm.isFocusEnabled()) {
            return this.f4959mB;
        }
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:2|3|(2:5|6)|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onImageCaptured(com.kofax.kmc.kui.uicontrols.ImageCapturedEvent r5) {
        /*
            r4 = this;
            r4.mo55303kZ()
            java.lang.Object r0 = r4._lock
            monitor-enter(r0)
            boolean r1 = r4._vibrationEnabled     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0011
            android.os.Vibrator r1 = r4._vibrator     // Catch:{ Exception -> 0x0011 }
            r2 = 500(0x1f4, double:2.47E-321)
            r1.vibrate(r2)     // Catch:{ Exception -> 0x0011 }
        L_0x0011:
            r4.f4960mL = r5     // Catch:{ all -> 0x0024 }
            r4.m4943lh()     // Catch:{ all -> 0x0024 }
            android.os.Handler r5 = r4._uiHandler     // Catch:{ all -> 0x0024 }
            com.kofax.mobile.sdk.k.h$1 r1 = new com.kofax.mobile.sdk.k.h$1     // Catch:{ all -> 0x0024 }
            r1.<init>()     // Catch:{ all -> 0x0024 }
            r2 = 1000(0x3e8, double:4.94E-321)
            r5.postDelayed(r1, r2)     // Catch:{ all -> 0x0024 }
            monitor-exit(r0)
            return
        L_0x0024:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk.p023k.C8410h.onImageCaptured(com.kofax.kmc.kui.uicontrols.ImageCapturedEvent):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: kZ */
    public void mo55303kZ() {
        synchronized (this._lock) {
            this.f4960mL = null;
            this.f4948FY = null;
            this.f4953Gb = C8417b.NONE;
        }
    }

    /* renamed from: c */
    private IFaceDetectionResult m4928c(byte[] bArr, int i, int i2, int i3) {
        try {
            return this.f4963np.detect(this.f4964nq, bArr, i, i2, i3);
        } catch (IllegalArgumentException e) {
            C0767k.m1821e(TAG, "Detection failed", (Throwable) new RuntimeException(e));
            return null;
        }
    }

    public void onPreviewFrame(PreviewFrameEvent previewFrameEvent) {
        this.f4948FY = new C8416a(m4928c(previewFrameEvent.getData(), previewFrameEvent.getWidth(), previewFrameEvent.getHeight(), previewFrameEvent.getRotation()), previewFrameEvent, this.f4964nq, this.f4947FX.getView().getWidth(), this.f4947FX.getView().getHeight());
        mo55302kS();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: kS */
    public void mo55302kS() {
        this._uiHandler.post(new Runnable() {
            public void run() {
                synchronized (C8410h.this._lock) {
                    C8410h.this.mo55301kQ();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: kQ */
    public void mo55301kQ() {
        C8416a aVar;
        C8416a aVar2;
        if (this.f4947FX != null && !this._sdkCaptureRequested) {
            if (!this.f4957Gf) {
                boolean isOperational = this.f4963np.isOperational();
                this.f4957Gf = isOperational;
                this.f4947FX.setDetectorOperationState(isOperational);
            }
            if (this.f4957Gf && !this._sdkCaptureRequested && ((aVar2 = this.f4948FY) == null || !aVar2.mo55311li() || !this.f4948FY.mo55312lj() || !this.f4948FY.mo55313lk())) {
                m4940le();
            } else if (!this._sdkCaptureRequested && this.f4957Gf && m4939kN() && (aVar = this.f4948FY) != null && aVar.mo55311li() && this.f4948FY.mo55312lj() && this.f4948FY.mo55313lk()) {
                m4941lf();
                if (this.f4961ml && this.f4956Ge && this.f4948FY.mo55314ll()) {
                    this._sdkCaptureRequested = true;
                    this.f4961ml = false;
                    this.f4947FX.startSteadyMessage();
                    this._uiHandler.postDelayed(this.f4958Gg, (long) this.f4946Ee);
                }
            }
        }
    }

    /* renamed from: le */
    private void m4940le() {
        this.f4956Ge = false;
        if (!this.f4955Gd) {
            this.f4955Gd = true;
            this.f4947FX.setGuidanceFrameColor(this.f4954Gc);
            if (this.f4953Gb != C8417b.FIT_FACE) {
                this.f4947FX.showFitWithinFrameMessage();
                this.f4953Gb = C8417b.FIT_FACE;
            } else {
                this.f4947FX.stopMessages();
                this.f4953Gb = C8417b.NONE;
            }
            m4942lg();
        }
    }

    /* renamed from: lf */
    private void m4941lf() {
        if (!this.f4955Gd) {
            this.f4955Gd = true;
            this.f4947FX.setGuidanceFrameColor(-16711936);
            if (this.f4953Gb != C8417b.BLINK) {
                this.f4947FX.startBlink();
                this.f4953Gb = C8417b.BLINK;
            } else {
                this.f4947FX.stopMessages();
                this.f4953Gb = C8417b.NONE;
            }
            m4942lg();
            this.f4956Ge = true;
        }
    }

    /* renamed from: lg */
    private void m4942lg() {
        this._uiHandler.postDelayed(new Runnable() {
            public void run() {
                boolean unused = C8410h.this.f4955Gd = false;
            }
        }, (long) this.f4946Ee);
    }

    /* renamed from: lh */
    private void m4943lh() {
        this._uiHandler.post(new Runnable() {
            public void run() {
                C8417b unused = C8410h.this.f4953Gb = C8417b.NONE;
                C8410h.this.f4947FX.startCapturedMessage();
            }
        });
    }

    /* renamed from: com.kofax.mobile.sdk.k.h$a */
    class C8416a {

        /* renamed from: FL */
        private int f4970FL;

        /* renamed from: FM */
        private int f4971FM;

        /* renamed from: Gi */
        private float f4973Gi = 0.7f;

        /* renamed from: Gj */
        private float f4974Gj = 0.4f;

        /* renamed from: Gk */
        private IFaceDetectionResult f4975Gk;

        /* renamed from: Gl */
        private float f4976Gl;

        /* renamed from: Gm */
        private float f4977Gm;

        /* renamed from: Gn */
        private Rect f4978Gn;

        /* renamed from: Go */
        private Rect f4979Go = new Rect();

        /* renamed from: Gp */
        private boolean f4980Gp;

        /* renamed from: Gq */
        private boolean f4981Gq;

        /* renamed from: Gr */
        private boolean f4982Gr;

        /* renamed from: Gs */
        private boolean f4983Gs;

        /* renamed from: nq */
        private SelfieDetectionSettings f4984nq;

        C8416a(IFaceDetectionResult iFaceDetectionResult, PreviewFrameEvent previewFrameEvent, SelfieDetectionSettings selfieDetectionSettings, int i, int i2) {
            this.f4975Gk = iFaceDetectionResult;
            this.f4984nq = selfieDetectionSettings;
            this.f4970FL = i;
            this.f4971FM = i2;
            this.f4976Gl = ((float) i) / ((float) previewFrameEvent.getHeight());
            this.f4977Gm = ((float) i2) / ((float) previewFrameEvent.getWidth());
            if (this.f4975Gk != null) {
                this.f4980Gp = true;
                if (!m4957ln() || !m4960lq()) {
                    m4961lr();
                    return;
                }
                this.f4981Gq = true;
                this.f4982Gr = true;
                this.f4983Gs = C8410h.this.f4956Ge ? m4956lm() : false;
                return;
            }
            m4961lr();
        }

        /* renamed from: li */
        public boolean mo55311li() {
            return this.f4980Gp;
        }

        /* renamed from: lj */
        public boolean mo55312lj() {
            return this.f4981Gq;
        }

        /* renamed from: lk */
        public boolean mo55313lk() {
            return this.f4982Gr;
        }

        /* renamed from: ll */
        public boolean mo55314ll() {
            return this.f4983Gs;
        }

        /* renamed from: lm */
        private boolean m4956lm() {
            float isLeftEyeOpenProbability = this.f4975Gk.getIsLeftEyeOpenProbability();
            float isRightEyeOpenProbability = this.f4975Gk.getIsRightEyeOpenProbability();
            C0767k.m1801b("Left  eye open probability", String.valueOf(isLeftEyeOpenProbability));
            C0767k.m1801b("Right eye open probability", String.valueOf(isRightEyeOpenProbability));
            if (isLeftEyeOpenProbability == -1.0f || isRightEyeOpenProbability == -1.0f) {
                m4961lr();
                return false;
            }
            float f = this.f4974Gj;
            if (isLeftEyeOpenProbability < f && isRightEyeOpenProbability < f) {
                C0767k.m1801b("are eyes closed", "true");
                boolean unused = C8410h.this.f4949FZ = true;
            }
            float f2 = this.f4973Gi;
            boolean z = isLeftEyeOpenProbability > f2 && isRightEyeOpenProbability > f2;
            if (C8410h.this.f4949FZ && z) {
                C0767k.m1801b("are eyes opened", "true");
                boolean unused2 = C8410h.this.f4952Ga = true;
            }
            if (!C8410h.this.f4949FZ || !C8410h.this.f4952Ga) {
                return false;
            }
            m4961lr();
            return true;
        }

        /* renamed from: ln */
        private boolean m4957ln() {
            double eulerY = (double) this.f4975Gk.getEulerY();
            return eulerY <= this.f4984nq.getFaceAngleTolerance() && eulerY >= (-this.f4984nq.getFaceAngleTolerance());
        }

        /* renamed from: lo */
        private Rect m4958lo() {
            if (this.f4978Gn == null) {
                this.f4978Gn = RectUtil.createTargetRect(this.f4984nq.getTargetFramePaddingPercent(), this.f4984nq.getTargetFrameAspectRatio(), this.f4984nq.getCenterPoint(), this.f4970FL, this.f4971FM);
            }
            return this.f4978Gn;
        }

        /* renamed from: lp */
        private Rect m4959lp() {
            float f = m4953f(this.f4975Gk.getPosition().x + (this.f4975Gk.getWidth() / 2.0f));
            float e = m4952e(this.f4975Gk.getPosition().y + (this.f4975Gk.getHeight() / 2.0f));
            float h = m4955h(this.f4975Gk.getWidth() / 2.5f);
            float g = m4954g(this.f4975Gk.getHeight() / 2.5f);
            this.f4979Go.set((int) (f - h), (int) (e - g), (int) (f + h), (int) (e + g));
            return this.f4979Go;
        }

        /* renamed from: lq */
        private boolean m4960lq() {
            Rect lp = m4959lp();
            if (lp.isEmpty() || !m4958lo().contains(lp) || ((double) (lp.width() * lp.height())) < ((double) (this.f4978Gn.width() * this.f4978Gn.height())) * this.f4984nq.getMinimumFaceSize()) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        private float m4952e(float f) {
            return m4954g(f);
        }

        /* renamed from: f */
        private float m4953f(float f) {
            return ((float) this.f4970FL) - m4955h(f);
        }

        /* renamed from: g */
        private float m4954g(float f) {
            return f * this.f4977Gm;
        }

        /* renamed from: h */
        private float m4955h(float f) {
            return f * this.f4976Gl;
        }

        /* renamed from: lr */
        private void m4961lr() {
            boolean unused = C8410h.this.f4949FZ = false;
            boolean unused2 = C8410h.this.f4952Ga = false;
        }
    }
}
