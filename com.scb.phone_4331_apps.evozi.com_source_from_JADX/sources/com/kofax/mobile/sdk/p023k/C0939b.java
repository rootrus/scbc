package com.kofax.mobile.sdk.p023k;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Vibrator;
import android.view.View;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kui.uicontrols.AboutToCaptureListener;
import com.kofax.kmc.kui.uicontrols.AutoFocusResultEvent;
import com.kofax.kmc.kui.uicontrols.AutoFocusResultListener;
import com.kofax.kmc.kui.uicontrols.ImageCapturedEvent;
import com.kofax.kmc.kui.uicontrols.ImageCapturedListener;
import com.kofax.kmc.kui.uicontrols.JustCapturedListener;
import com.kofax.kmc.kui.uicontrols.LevelnessEvent;
import com.kofax.kmc.kui.uicontrols.LevelnessListener;
import com.kofax.kmc.kui.uicontrols.PageDetectionEvent;
import com.kofax.kmc.kui.uicontrols.PageDetectionListener;
import com.kofax.kmc.kui.uicontrols.PreviewCallbackListener;
import com.kofax.kmc.kui.uicontrols.PreviewFrameEvent;
import com.kofax.kmc.kui.uicontrols.StabilityDelayEvent;
import com.kofax.kmc.kui.uicontrols.StabilityDelayListener;
import com.kofax.kmc.kui.uicontrols.Utility;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.camera.C0500f;
import com.kofax.mobile.sdk._internal.camera.C0505k;
import com.kofax.mobile.sdk._internal.camera.ICameraDelegate;
import com.kofax.mobile.sdk._internal.capture.C0513a;
import com.kofax.mobile.sdk._internal.capture.C0514c;
import com.kofax.mobile.sdk._internal.capture.C0515d;
import com.kofax.mobile.sdk._internal.capture.C0516e;
import com.kofax.mobile.sdk._internal.capture.CaptureCriteria;
import com.kofax.mobile.sdk._internal.impl.event.C0676aa;
import com.kofax.mobile.sdk._internal.impl.event.C0678ae;
import com.kofax.mobile.sdk._internal.impl.event.C7959ap;
import com.kofax.mobile.sdk._internal.impl.event.C7976p;
import com.kofax.mobile.sdk._internal.impl.view.C0734a;
import com.kofax.mobile.sdk._internal.view.IMessageListener;
import com.kofax.mobile.sdk._internal.view.IOverlayView;
import com.kofax.mobile.sdk.p024l.C8434m;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import p040o.HmlPinActivity;
import p040o.HmlReviewDocumentActivity;

/* renamed from: com.kofax.mobile.sdk.k.b */
public class C0939b implements View.OnClickListener, AutoFocusResultListener, ImageCapturedListener, LevelnessListener, PreviewCallbackListener, StabilityDelayListener, ICameraDelegate, C0513a {

    /* renamed from: EZ */
    private static final int f2252EZ = 3;

    /* renamed from: Fr */
    private static final int f2253Fr = 50;

    /* renamed from: Fa */
    private CaptureCriteria f2254Fa = new CaptureCriteria();
    /* access modifiers changed from: private */

    /* renamed from: Fb */
    public boolean f2255Fb;

    /* renamed from: Fc */
    private Timer f2256Fc;

    /* renamed from: Fd */
    private int f2257Fd;

    /* renamed from: Fe */
    private boolean f2258Fe;
    /* access modifiers changed from: private */

    /* renamed from: Ff */
    public boolean f2259Ff;

    /* renamed from: Fg */
    private Set<AboutToCaptureListener> f2260Fg = new LinkedHashSet();

    /* renamed from: Fh */
    private Set<JustCapturedListener> f2261Fh = new LinkedHashSet();

    /* renamed from: Fi */
    private final Set<PageDetectionListener> f2262Fi = new LinkedHashSet();

    /* renamed from: Fj */
    private boolean f2263Fj = false;

    /* renamed from: Fk */
    private C0514c f2264Fk;
    /* access modifiers changed from: private */

    /* renamed from: Fl */
    public C0500f f2265Fl;
    /* access modifiers changed from: private */

    /* renamed from: Fm */
    public IOverlayView f2266Fm;

    /* renamed from: Fn */
    private final C0957l f2267Fn = new C0957l(this);

    /* renamed from: Fo */
    private C0515d f2268Fo;

    /* renamed from: Fp */
    private C0956k f2269Fp = new C0956k();

    /* renamed from: Fq */
    private C0955g f2270Fq = new C0955g();

    /* renamed from: Fs */
    private final C0947a f2271Fs = new C0947a();
    @HmlPinActivity

    /* renamed from: Ft */
    protected C0734a f2272Ft;
    @HmlPinActivity

    /* renamed from: Fu */
    protected C0516e f2273Fu;
    /* access modifiers changed from: private */
    public IBus _bus = null;
    private boolean _continuousCapture;
    private Set<ImageCapturedListener> _imageCapturedListeners = new LinkedHashSet();
    /* access modifiers changed from: private */
    public final Object _lock = new Object();
    private boolean _sdkCaptureRequested;
    /* access modifiers changed from: private */
    public final Handler _uiHandler = new Handler(Looper.getMainLooper());
    private boolean _vibrationEnabled = true;
    private Vibrator _vibrator;

    /* renamed from: lU */
    private int f2274lU = -1;

    /* renamed from: lV */
    private int f2275lV = -1;

    /* renamed from: mB */
    private boolean f2276mB;

    /* renamed from: mL */
    private ImageCapturedEvent f2277mL;

    /* renamed from: ml */
    private boolean f2278ml;

    @HmlPinActivity
    public C0939b(Context context, IBus iBus) {
        this._vibrator = (Vibrator) context.getSystemService("vibrator");
        this._bus = iBus;
    }

    /* renamed from: a */
    public void mo11267a(C0514c cVar, C0500f fVar, IOverlayView iOverlayView) {
        C0963p pVar = new C0963p(cVar);
        this.f2264Fk = pVar;
        pVar.mo11301a((C0513a) this);
        this.f2266Fm = iOverlayView;
        this.f2265Fl = fVar;
        fVar.getViewGroup().addView(this.f2266Fm.getView());
        this.f2265Fl.setCameraDelegate(this);
        addCameraEventListeners();
        mo11272br();
    }

    /* renamed from: br */
    public void mo11272br() {
        C0962o bt = this.f2264Fk.mo11302bt();
        IOverlayView iOverlayView = this.f2266Fm;
        if (iOverlayView != null) {
            iOverlayView.setOverlayAspectRatio(bt.mo12365lB());
            this.f2266Fm.setCenter(bt.getCenterPoint());
            this.f2266Fm.setPaddingPercent(bt.mo12366lC());
        }
    }

    private void addCameraEventListeners() {
        this.f2265Fl.addStabilityDelayListener(this);
        this.f2265Fl.addLevelnessListener(this);
        this.f2265Fl.addOnAutoFocusResultListener(this);
        this.f2265Fl.addOnImageCapturedListener(this);
        this.f2267Fn.mo12358b(this.f2265Fl);
    }

    private void removeCameraEventListeners() {
        C0500f fVar = this.f2265Fl;
        if (fVar != null) {
            fVar.removeStabilityDelayListener(this);
            this.f2265Fl.removeLevelnessListener(this);
            this.f2265Fl.removeOnAutoFocusResultListener(this);
            this.f2265Fl.removeOnImageCapturedListener(this);
            this.f2267Fn.stopListening();
        }
    }

    public void onPreviewFrame(PreviewFrameEvent previewFrameEvent) {
        C0515d dVar;
        this.f2273Fu.mo11320d(previewFrameEvent.getWidth(), previewFrameEvent.getHeight());
        if (this._sdkCaptureRequested) {
            m2455kS();
            return;
        }
        if (this.f2255Fb && this.f2256Fc == null) {
            mo12332kX();
        }
        if (isPageDetectionEnabled()) {
            dVar = this.f2264Fk.mo11300a(previewFrameEvent);
        } else {
            dVar = C8434m.m5011e(previewFrameEvent);
        }
        this.f2268Fo = dVar;
        m2431b(previewFrameEvent);
        this.f2270Fq.mo12352a(this.f2268Fo.getEdgesGuidance());
        this.f2273Fu.mo11315a(this.f2268Fo.mo11305bA().mo54224bs(), this.f2268Fo.mo11305bA().getWidth(), this.f2268Fo.mo11305bA().getHeight());
        m2455kS();
    }

    /* renamed from: b */
    private void m2431b(PreviewFrameEvent previewFrameEvent) {
        C0515d dVar = this.f2268Fo;
        if (dVar == null || (!dVar.mo11311bz() && isPageDetectionEnabled())) {
            int i = this.f2257Fd + 1;
            this.f2257Fd = i;
            if (i >= 3) {
                this._bus.post(new C7959ap());
                return;
            }
            return;
        }
        this.f2257Fd = 0;
        m2427a(previewFrameEvent, this.f2268Fo.mo11305bA().mo54224bs());
        this._bus.post(new C7959ap((Bitmap) null, this.f2268Fo.mo11305bA().mo54224bs()));
    }

    public final void addOnImageCapturedListener(ImageCapturedListener imageCapturedListener) {
        if (imageCapturedListener != null) {
            this._imageCapturedListeners.add(imageCapturedListener);
        }
    }

    public final void removeOnImageCapturedListener(ImageCapturedListener imageCapturedListener) {
        this._imageCapturedListeners.remove(imageCapturedListener);
    }

    public void addPageDetectionListener(PageDetectionListener pageDetectionListener) {
        if (pageDetectionListener != null) {
            this.f2262Fi.add(pageDetectionListener);
        }
    }

    public void removePageDetectionListener(PageDetectionListener pageDetectionListener) {
        this.f2262Fi.remove(pageDetectionListener);
    }

    public void addAboutToCaptureListener(AboutToCaptureListener aboutToCaptureListener) {
        if (aboutToCaptureListener != null) {
            this.f2260Fg.add(aboutToCaptureListener);
        }
    }

    public void removeAboutToCaptureListener(AboutToCaptureListener aboutToCaptureListener) {
        this.f2260Fg.remove(aboutToCaptureListener);
    }

    public void addJustCapturedListener(JustCapturedListener justCapturedListener) {
        if (justCapturedListener != null) {
            this.f2261Fh.add(justCapturedListener);
        }
    }

    public void removeJustCapturedListener(JustCapturedListener justCapturedListener) {
        this.f2261Fh.remove(justCapturedListener);
    }

    /* renamed from: a */
    private void m2427a(PreviewFrameEvent previewFrameEvent, BoundingTetragon boundingTetragon) {
        if (!this.f2262Fi.isEmpty() && boundingTetragon != null) {
            m2429a((Collection<PageDetectionListener>) this.f2262Fi, new PageDetectionEvent((Object) this, (HmlReviewDocumentActivity<Bitmap>) new C0951b(previewFrameEvent), boundingTetragon));
        }
    }

    /* renamed from: a */
    private static void m2429a(Collection<PageDetectionListener> collection, PageDetectionEvent pageDetectionEvent) {
        for (PageDetectionListener pageDetected : collection) {
            pageDetected.pageDetected(pageDetectionEvent);
        }
    }

    public void onAutoFocus(AutoFocusResultEvent autoFocusResultEvent) {
        this.f2276mB = autoFocusResultEvent.getSuccess();
        this.f2273Fu.mo11321m(m2450kN());
        m2455kS();
    }

    public void onLevelness(LevelnessEvent levelnessEvent) {
        this.f2274lU = Math.abs(levelnessEvent.getPitch());
        this.f2275lV = Math.abs(levelnessEvent.getRoll());
        this.f2273Fu.mo11318a(m2447kK(), this.f2274lU, this.f2275lV, this.f2254Fa.getRollThreshold(), this.f2254Fa.getPitchThreshold());
        m2455kS();
    }

    public void onStabilityDelay(StabilityDelayEvent stabilityDelayEvent) {
        synchronized (this._lock) {
            this.f2269Fp.mo12355l(this.f2254Fa.getStabilityThreshold(), stabilityDelayEvent.getStability());
        }
        boolean kJ = m2446kJ();
        this._bus.post(new C7976p(kJ));
        this.f2273Fu.mo11317a(kJ, this.f2269Fp.mo12356lw(), this.f2254Fa.getStabilityThreshold());
        m2455kS();
    }

    /* renamed from: kJ */
    private boolean m2446kJ() {
        if (!this.f2254Fa.isStabilityThresholdEnabled()) {
            return true;
        }
        return this.f2269Fp.mo12354kJ();
    }

    /* renamed from: kK */
    private boolean m2447kK() {
        return m2448kL() && m2449kM();
    }

    /* renamed from: kL */
    private boolean m2448kL() {
        if (!this.f2254Fa.isPitchThresholdEnabled() || this.f2254Fa.getPitchThreshold() == 45 || this.f2254Fa.getPitchThreshold() >= this.f2274lU) {
            return true;
        }
        return false;
    }

    /* renamed from: kM */
    private boolean m2449kM() {
        if (!this.f2254Fa.isRollThresholdEnabled() || this.f2254Fa.getRollThreshold() == 45 || this.f2254Fa.getRollThreshold() >= this.f2275lV) {
            return true;
        }
        return false;
    }

    /* renamed from: kN */
    private boolean m2450kN() {
        if (this.f2254Fa.isFocusEnabled()) {
            return this.f2276mB;
        }
        return true;
    }

    /* renamed from: kO */
    private boolean m2451kO() {
        C0515d dVar = this.f2268Fo;
        return dVar != null && (dVar.mo11313l(isOrientationEnabled()) || !isPageDetectionEnabled());
    }

    private boolean isPageDetectionEnabled() {
        return this.f2254Fa.isPageDetectionEnabled();
    }

    private boolean isOrientationEnabled() {
        return this.f2254Fa.isOrientationEnabled();
    }

    /* renamed from: kP */
    private boolean m2452kP() {
        return this.f2254Fa.isOrientationEnabled() && this.f2268Fo.mo11310by();
    }

    public void setCaptureCriteria(CaptureCriteria captureCriteria) {
        if (captureCriteria != null) {
            this.f2254Fa = captureCriteria;
            return;
        }
        throw new IllegalArgumentException("criteria is null");
    }

    /* renamed from: d */
    public void mo11273d(boolean z) {
        mo12334kZ();
        this.f2259Ff = false;
        this._sdkCaptureRequested = false;
        m2459kW();
        synchronized (this._lock) {
            this._continuousCapture = z;
            this.f2278ml = true;
        }
    }

    public void forceTakePicture(boolean z) {
        synchronized (this._lock) {
            if (!this._sdkCaptureRequested && this.f2277mL == null) {
                this._sdkCaptureRequested = true;
                this.f2265Fl.forceTakePictureForCaptureExperience("com.kofax.kmc.kui.uicontrols.", z);
            }
        }
        m2455kS();
    }

    /* access modifiers changed from: private */
    /* renamed from: kQ */
    public void m2453kQ() {
        if (this.f2266Fm != null) {
            synchronized (this._lock) {
                this.f2266Fm.showFitWithinFrameMessage((this.f2268Fo == null || !this.f2268Fo.mo11311bz()) && !this.f2255Fb && this.f2277mL == null && !this.f2266Fm.isMessageDisplayed() && !this._sdkCaptureRequested);
                this.f2266Fm.showEdgesGuidance(this.f2270Fq.getEdgesGuidance());
                if (this.f2277mL != null) {
                    this.f2266Fm.startCapturedMessage(new C0948c(this.f2277mL));
                } else if (!this._sdkCaptureRequested || this.f2255Fb) {
                    if (this.f2268Fo == null || this.f2255Fb) {
                        this.f2266Fm.stopMessages();
                    } else if (!m2447kK()) {
                        this.f2266Fm.startHoldParallelMessage();
                    } else if (this.f2268Fo.mo11309bx()) {
                        this.f2266Fm.startRotateMessage();
                    } else if (m2452kP()) {
                        this.f2266Fm.startRotateMessage();
                    } else if (this.f2268Fo.mo11308bw()) {
                        this.f2266Fm.startZoomOutMessage();
                    } else if (this.f2268Fo.mo11306bu()) {
                        this.f2266Fm.startCenterMessage();
                    } else if (this.f2268Fo.mo11307bv()) {
                        this.f2266Fm.startZoomInMessage();
                    } else if (!this.f2278ml || !m2451kO() || ((!m2446kJ() && !m2450kN()) || this.f2259Ff)) {
                        this.f2266Fm.stopMessages();
                    } else {
                        this.f2266Fm.startSteadyMessage(this.f2271Fs);
                    }
                } else if (!this.f2258Fe || (!Build.MODEL.equalsIgnoreCase(Utility.NEXUS_5X) && !Utility.IS_SAMSUNG_S5_MINI)) {
                    this.f2266Fm.startSteadyMessage(this.f2271Fs);
                } else if (this.f2266Fm.isMessageDisplayed()) {
                    this.f2266Fm.stopMessages();
                } else {
                    this.f2266Fm.showProgressBar();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: kR */
    public void m2454kR() {
        if (this.f2266Fm != null) {
            synchronized (this._lock) {
                this.f2273Fu.mo11314a(m2444k(this.f2266Fm.getView().getWidth(), this.f2266Fm.getView().getHeight()));
                this.f2273Fu.mo11316a(this.f2266Fm, isDiagnosticsViewEnabled() && !isAnimationTutorEnable());
            }
        }
    }

    /* renamed from: kS */
    private void m2455kS() {
        m2459kW();
        synchronized (this._lock) {
            if (this.f2278ml && !this._sdkCaptureRequested && !this.f2259Ff && !this.f2255Fb && m2450kN() && m2446kJ() && m2447kK() && m2451kO() && this.f2271Fs.isStarted()) {
                this._sdkCaptureRequested = true;
                this.f2259Ff = true;
                this.f2278ml = this._continuousCapture;
                m2459kW();
                m2456kT();
                if (this.f2254Fa.isRefocusBeforeCaptureEnabled()) {
                    m2436c((Runnable) new Runnable() {
                        public void run() {
                            C0939b.this.m2458kV();
                        }
                    });
                } else {
                    m2458kV();
                }
            }
        }
    }

    /* renamed from: kT */
    private void m2456kT() {
        this._uiHandler.post(new Runnable() {
            public void run() {
                C0939b.this.m2457kU();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: kU */
    public void m2457kU() {
        for (AboutToCaptureListener imageIsAboutToCapture : this.f2260Fg) {
            imageIsAboutToCapture.imageIsAboutToCapture();
        }
    }

    /* renamed from: c */
    private void m2436c(final Runnable runnable) {
        this._uiHandler.post(new Runnable() {
            public void run() {
                C0939b.this._bus.post(new C0678ae(new C0505k() {
                    /* renamed from: k */
                    public void mo11197k(boolean z) {
                        if (z) {
                            C0939b.this._bus.post(new C0676aa(true));
                            runnable.run();
                            return;
                        }
                        C0939b.this._uiHandler.post(this);
                    }
                }));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: kV */
    public void m2458kV() {
        this.f2271Fs.mo12343a(this.f2254Fa.getHoldSteadyDelay(), this._uiHandler, new Runnable() {
            public void run() {
                C0939b.this.f2265Fl.takePictureForCaptureExperience("com.kofax.kmc.kui.uicontrols.");
            }
        });
    }

    /* renamed from: kW */
    private void m2459kW() {
        this._uiHandler.post(new Runnable() {
            public void run() {
                C0939b.this.m2453kQ();
                C0939b.this.m2454kR();
            }
        });
    }

    public void onPictureTaken() {
        this.f2258Fe = true;
        m2455kS();
    }

    /* renamed from: com.kofax.mobile.sdk.k.b$c */
    class C0948c implements IMessageListener {
        /* access modifiers changed from: private */

        /* renamed from: FB */
        public ImageCapturedEvent f2289FB;

        public C0948c(ImageCapturedEvent imageCapturedEvent) {
            this.f2289FB = imageCapturedEvent;
        }

        public void onStart() {
            synchronized (C0939b.this._lock) {
                C0939b.this.f2266Fm.displayImageCapturedEvent(this.f2289FB);
                C0939b.this.f2266Fm.hideProgressBar();
                C0939b.this._uiHandler.post(new Runnable() {
                    public void run() {
                        C0939b.this.m2426a(C0948c.this.f2289FB);
                        C0939b.this.invokeImageCapturedListeners(C0948c.this.f2289FB);
                        ImageCapturedEvent unused = C0948c.this.f2289FB = null;
                    }
                });
            }
        }

        public void onStop() {
            synchronized (C0939b.this._lock) {
                C0939b.this.mo12334kZ();
                C0939b.this.f2266Fm.clear();
                if (C0939b.this.f2259Ff) {
                    C0939b.this._uiHandler.postDelayed(new Runnable() {
                        public void run() {
                            boolean unused = C0939b.this.f2259Ff = false;
                        }
                    }, 1000);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2426a(ImageCapturedEvent imageCapturedEvent) {
        Bitmap imageBitmap = imageCapturedEvent.getImage().getImageBitmap();
        imageCapturedEvent.getImage().setTargetFrame(m2444k(imageBitmap.getWidth(), imageBitmap.getHeight()));
    }

    /* renamed from: k */
    private Rect m2444k(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        Rect rE = this.f2272Ft.mo11768rE();
        double width = ((double) i3) / ((double) this.f2266Fm.getView().getWidth());
        double height = ((double) i4) / ((double) this.f2266Fm.getView().getHeight());
        Rect rect = new Rect((int) (((double) rE.left) * width), (int) (((double) rE.top) * height), (int) (((double) rE.right) * width), (int) (((double) rE.bottom) * height));
        int i5 = rect.left;
        int i6 = rect.left;
        int width2 = rect.width();
        int i7 = rect.top;
        int i8 = rect.top;
        int height2 = rect.height();
        C0514c cVar = this.f2264Fk;
        double sqrt = Math.sqrt(cVar == null ? 1.0d : cVar.getMaxFillFraction()) - 1.0d;
        int width3 = ((int) (((double) rect.width()) * 0.5d * sqrt)) + 50;
        int height3 = ((int) (((double) rect.height()) * 0.5d * sqrt)) + 50;
        return new Rect(Math.max(0, i5 - width3), Math.max(0, i7 - height3), Math.min(i3, i6 + width2 + width3), Math.min(i4, i8 + height2 + height3));
    }

    /* access modifiers changed from: private */
    public void invokeImageCapturedListeners(ImageCapturedEvent imageCapturedEvent) {
        for (ImageCapturedListener onImageCaptured : this._imageCapturedListeners) {
            onImageCaptured.onImageCaptured(imageCapturedEvent);
        }
    }

    public void enableAnimationTutor(boolean z) {
        this.f2255Fb = z;
        this.f2266Fm.setInstructionOverlay(z);
        if (z) {
            this.f2266Fm.getView().setOnClickListener(this);
        }
    }

    public void onClick(View view) {
        this.f2266Fm.setInstructionOverlay(false);
        this.f2266Fm.getView().setOnClickListener((View.OnClickListener) null);
        this.f2255Fb = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: kX */
    public void mo12332kX() {
        mo12333kY();
        Timer timer = new Timer("Animation Tutor Timer");
        this.f2256Fc = timer;
        timer.schedule(new TimerTask() {
            public void run() {
                C0939b.this.f2266Fm.setInstructionOverlay(false);
                boolean unused = C0939b.this.f2255Fb = false;
            }
        }, 6000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: kY */
    public void mo12333kY() {
        Timer timer = this.f2256Fc;
        if (timer != null) {
            timer.cancel();
            this.f2256Fc.purge();
            this.f2256Fc = null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:2|3|(2:5|6)|7|8|(1:10)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onImageCaptured(com.kofax.kmc.kui.uicontrols.ImageCapturedEvent r5) {
        /*
            r4 = this;
            r4.mo12334kZ()
            java.lang.Object r0 = r4._lock
            monitor-enter(r0)
            com.kofax.kmc.ken.engines.data.Image r1 = r5.getImage()     // Catch:{ all -> 0x002e }
            r4.m2425B(r1)     // Catch:{ all -> 0x002e }
            r1 = 0
            r4._sdkCaptureRequested = r1     // Catch:{ all -> 0x002e }
            r4.f2258Fe = r1     // Catch:{ all -> 0x002e }
            boolean r1 = r4._vibrationEnabled     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x001d
            android.os.Vibrator r1 = r4._vibrator     // Catch:{ Exception -> 0x001d }
            r2 = 500(0x1f4, double:2.47E-321)
            r1.vibrate(r2)     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            r4.mo12333kY()     // Catch:{ all -> 0x002e }
            boolean r1 = r4._continuousCapture     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x0027
            r4.mo12332kX()     // Catch:{ all -> 0x002e }
        L_0x0027:
            r4.f2277mL = r5     // Catch:{ all -> 0x002e }
            r4.m2455kS()     // Catch:{ all -> 0x002e }
            monitor-exit(r0)
            return
        L_0x002e:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk.p023k.C0939b.onImageCaptured(com.kofax.kmc.kui.uicontrols.ImageCapturedEvent):void");
    }

    /* renamed from: B */
    private void m2425B(Image image) {
        for (JustCapturedListener imageJustCaptured : this.f2261Fh) {
            imageJustCaptured.imageJustCaptured(image);
        }
    }

    /* access modifiers changed from: protected */
    public void removeAllViews() {
        C0500f fVar = this.f2265Fl;
        if (fVar != null) {
            fVar.getViewGroup().removeView(this.f2266Fm.getView());
            Bitmap documentSampleImage = this.f2266Fm.getDocumentSampleImage();
            if (documentSampleImage != null) {
                documentSampleImage.recycle();
            }
            this.f2266Fm.setDocumentSampleImage((Bitmap) null);
            Timer timer = this.f2256Fc;
            if (timer != null) {
                timer.purge();
                this.f2256Fc.cancel();
                this.f2256Fc = null;
            }
        }
    }

    public void destroy() {
        this.f2260Fg.clear();
        this.f2261Fh.clear();
        this.f2262Fi.clear();
        removeCameraEventListeners();
        C0514c cVar = this.f2264Fk;
        if (cVar != null) {
            cVar.doCleanUp();
            this.f2264Fk = null;
        }
        removeAllViews();
        mo12334kZ();
    }

    /* access modifiers changed from: protected */
    /* renamed from: kZ */
    public void mo12334kZ() {
        synchronized (this._lock) {
            this.f2276mB = false;
            this.f2268Fo = null;
            this.f2274lU = -1;
            this.f2275lV = -1;
            m2460la();
            this.f2271Fs.reset();
            this.f2277mL = null;
        }
    }

    /* renamed from: la */
    private void m2460la() {
        this.f2269Fp = new C0956k();
    }

    public void stopCapture() {
        this.f2278ml = false;
    }

    public void onDetachFromWindow() {
        synchronized (this._lock) {
            this.f2266Fm.clear();
            mo12334kZ();
            this.f2259Ff = false;
            this._sdkCaptureRequested = false;
        }
    }

    /* renamed from: com.kofax.mobile.sdk.k.b$a */
    static class C0947a implements IMessageListener {

        /* renamed from: Fz */
        private volatile long f2288Fz;

        /* renamed from: e */
        private static long m2468e(double d) {
            return (long) (d * 1000.0d);
        }

        private C0947a() {
            this.f2288Fz = -1;
        }

        public void onStart() {
            this.f2288Fz = now();
        }

        public void onStop() {
            reset();
        }

        /* access modifiers changed from: package-private */
        public boolean isStarted() {
            return this.f2288Fz > 0;
        }

        /* access modifiers changed from: package-private */
        public void reset() {
            this.f2288Fz = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo12343a(double d, Handler handler, Runnable runnable) {
            long now = now();
            if (this.f2288Fz == -1 || now - this.f2288Fz < m2468e(d)) {
                handler.postDelayed(runnable, (m2468e(d) + this.f2288Fz) - now);
            } else {
                runnable.run();
            }
        }

        private static long now() {
            return SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: com.kofax.mobile.sdk.k.b$b */
    static class C0951b implements HmlReviewDocumentActivity<Bitmap> {

        /* renamed from: FA */
        private final PreviewFrameEvent f2293FA;

        public C0951b(PreviewFrameEvent previewFrameEvent) {
            this.f2293FA = previewFrameEvent;
        }

        /* renamed from: aE */
        public Bitmap get() {
            return this.f2293FA.getBitmap();
        }
    }

    public int getGuidanceFrameColor() {
        return this.f2266Fm.getGuidanceFrameColor();
    }

    public void setDiagnosticsViewEnabled(boolean z) {
        this.f2263Fj = z;
    }

    public boolean isDiagnosticsViewEnabled() {
        return this.f2263Fj;
    }

    public void setGuidanceFrameThickness(int i) {
        this.f2266Fm.setGuidanceFrameThickness(i);
    }

    public int getGuidanceFrameThickness() {
        return this.f2266Fm.getGuidanceFrameThickness();
    }

    public void onFocusAreasRequest(List<Rect> list, int i, int i2) {
        this.f2273Fu.mo11319b(list, i, i2);
    }

    public Bitmap getDocumentSampleImage() {
        return this.f2266Fm.getDocumentSampleImage();
    }

    public void setDocumentSampleImage(Bitmap bitmap) {
        this.f2266Fm.setDocumentSampleImage(bitmap);
    }

    public boolean hasDocumentSampleImage() {
        return this.f2266Fm.hasDocumentSampleImage();
    }

    public void setUserInstructionMessage(String str) {
        this.f2266Fm.setUserInstructionMessage(str);
    }

    public void setCenterMessage(String str) {
        this.f2266Fm.setCenterMessage(str);
    }

    public void setUserInstructionMessageTextSize(int i) {
        this.f2266Fm.setUserInstructionMessageTextSize(i);
    }

    public boolean isAnimationTutorEnable() {
        return this.f2255Fb;
    }

    public void setOuterOverlayFrameColor(int i) {
        this.f2266Fm.setOuterOverlayFrameColor(i);
    }

    public int getOuterOverlayFrameColor() {
        return this.f2266Fm.getOuterOverlayFrameColor();
    }

    public void setGuidanceFrameColor(int i) {
        this.f2266Fm.setGuidanceFrameColor(i);
    }

    public void setSteadyGuidanceFrameColor(int i) {
        this.f2266Fm.setSteadyGuidanceFrameColor(i);
    }

    public final void setVibrationEnabled(boolean z) {
        this._vibrationEnabled = z;
    }

    public boolean isVibrationEnabled() {
        return this._vibrationEnabled;
    }
}
