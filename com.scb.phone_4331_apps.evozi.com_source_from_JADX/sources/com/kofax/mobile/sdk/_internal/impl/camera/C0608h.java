package com.kofax.mobile.sdk._internal.impl.camera;

import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.SurfaceHolder;
import com.kofax.kmc.kui.uicontrols.CameraInitializationEvent;
import com.kofax.kmc.kui.uicontrols.Utility;
import com.kofax.kmc.kui.uicontrols.data.CameraType;
import com.kofax.kmc.kui.uicontrols.data.Flash;
import com.kofax.kmc.kut.utilities.Size;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.camera.C0498d;
import com.kofax.mobile.sdk._internal.camera.C0499e;
import com.kofax.mobile.sdk._internal.camera.C0501g;
import com.kofax.mobile.sdk._internal.camera.C0505k;
import com.kofax.mobile.sdk._internal.camera.C0506n;
import com.kofax.mobile.sdk._internal.camera.C0507o;
import com.kofax.mobile.sdk._internal.camera.C0508p;
import com.kofax.mobile.sdk._internal.camera.C0509q;
import com.kofax.mobile.sdk._internal.camera.C0510s;
import com.kofax.mobile.sdk._internal.camera.C7889a;
import com.kofax.mobile.sdk._internal.dagger.C0519a;
import com.kofax.mobile.sdk._internal.impl.camera.focus.C0598m;
import com.kofax.mobile.sdk._internal.impl.event.C0682aj;
import com.kofax.mobile.sdk._internal.impl.event.C0684aq;
import com.kofax.mobile.sdk._internal.impl.event.C0690ba;
import com.kofax.mobile.sdk._internal.impl.event.C0694g;
import com.kofax.mobile.sdk._internal.impl.event.C0695i;
import com.kofax.mobile.sdk._internal.impl.event.C0696n;
import com.kofax.mobile.sdk._internal.impl.event.C0699v;
import com.kofax.mobile.sdk._internal.impl.event.C7961at;
import com.kofax.mobile.sdk._internal.impl.event.C7974m;
import com.kofax.mobile.sdk._internal.impl.event.C7975o;
import com.kofax.mobile.sdk._internal.impl.event.ImageCapturedBusEvent;
import com.kofax.mobile.sdk._internal.impl.event.PreviewImageReadyBusEvent;
import com.kofax.mobile.sdk._internal.impl.event.SetFocusAreasRequestBusEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;
import p040o.HmlPinActivity;

@C0519a
/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.h */
public class C0608h implements C0508p {
    /* access modifiers changed from: private */

    /* renamed from: AA */
    public static final Object f1444AA = new Object();

    /* renamed from: Ax */
    public static final int f1445Ax = 1000;

    /* renamed from: Ay */
    public static final int f1446Ay = 720;

    /* renamed from: Az */
    public static final int f1447Az = 480;
    /* access modifiers changed from: private */
    public static final String TAG = C0608h.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: AB */
    public final C0499e f1448AB;

    /* renamed from: AC */
    private final C0577f f1449AC;

    /* renamed from: AD */
    private final C0506n f1450AD;

    /* renamed from: AE */
    private final C0598m f1451AE;

    /* renamed from: AF */
    private boolean f1452AF = false;
    /* access modifiers changed from: private */

    /* renamed from: AG */
    public List<C0505k> f1453AG = new CopyOnWriteArrayList();

    /* renamed from: AH */
    private boolean f1454AH;

    /* renamed from: AI */
    private byte[] f1455AI;
    /* access modifiers changed from: private */

    /* renamed from: AJ */
    public C0507o f1456AJ = new C0507o() {
        /* renamed from: b */
        public void mo11199b(byte[] bArr, int i, int i2, int i3) {
            final byte[] bArr2 = bArr;
            final int i4 = i2;
            final int i5 = i3;
            final int i6 = i;
            C0608h.this.f1471wO.post(new Runnable() {
                public void run() {
                    final ImageCapturedBusEvent imageCapturedBusEvent = new ImageCapturedBusEvent(Utility.imageDataToBitmap(bArr2, i4, i5, i6, C0608h.this.f1466jN));
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public void run() {
                            C0608h.this._bus.post(imageCapturedBusEvent);
                        }
                    });
                }
            });
        }
    };

    /* renamed from: AK */
    private int f1457AK = 0;

    /* renamed from: AL */
    private boolean f1458AL;
    /* access modifiers changed from: private */

    /* renamed from: AM */
    public boolean f1459AM = false;
    /* access modifiers changed from: private */

    /* renamed from: AN */
    public boolean f1460AN = false;

    /* renamed from: AO */
    private C0501g f1461AO = new C0501g() {
        public void onError(int i) {
            String jJ = C0608h.TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Camera Error: ");
            sb.append(i);
            C0767k.m1820e(jJ, sb.toString());
            if (i != 100) {
                synchronized (C0608h.f1444AA) {
                    boolean unused = C0608h.this.f1460AN = false;
                    C0608h.this.m1344jE();
                }
                return;
            }
            throw new KmcRuntimeException(ErrorInfo.KMC_UI_CAMERA_OPERATION_FAILURE);
        }
    };

    /* renamed from: AP */
    private final C0505k f1462AP = new C0505k() {
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
            return;
         */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo11197k(boolean r4) {
            /*
                r3 = this;
                java.lang.Object r0 = com.kofax.mobile.sdk._internal.impl.camera.C0608h.f1444AA
                monitor-enter(r0)
                com.kofax.mobile.sdk._internal.impl.camera.h r1 = com.kofax.mobile.sdk._internal.impl.camera.C0608h.this     // Catch:{ all -> 0x0056 }
                boolean r1 = r1.f1460AN     // Catch:{ all -> 0x0056 }
                if (r1 == 0) goto L_0x0018
                java.lang.String r4 = com.kofax.mobile.sdk._internal.impl.camera.C0608h.TAG     // Catch:{ all -> 0x0056 }
                java.lang.String r1 = "Unexpected auto-focus callback"
                com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r4, (java.lang.String) r1)     // Catch:{ all -> 0x0056 }
                monitor-exit(r0)
                return
            L_0x0018:
                com.kofax.mobile.sdk._internal.impl.camera.h r1 = com.kofax.mobile.sdk._internal.impl.camera.C0608h.this     // Catch:{ all -> 0x0056 }
                r2 = 0
                boolean unused = r1.f1472wz = r2     // Catch:{ all -> 0x0056 }
                com.kofax.mobile.sdk._internal.impl.camera.h r1 = com.kofax.mobile.sdk._internal.impl.camera.C0608h.this     // Catch:{ all -> 0x0056 }
                boolean r1 = r1.f1459AM     // Catch:{ all -> 0x0056 }
                if (r1 == 0) goto L_0x002c
                com.kofax.mobile.sdk._internal.impl.camera.h r4 = com.kofax.mobile.sdk._internal.impl.camera.C0608h.this     // Catch:{ all -> 0x0056 }
                r4.m1344jE()     // Catch:{ all -> 0x0056 }
                goto L_0x0054
            L_0x002c:
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0056 }
                com.kofax.mobile.sdk._internal.impl.camera.h r2 = com.kofax.mobile.sdk._internal.impl.camera.C0608h.this     // Catch:{ all -> 0x0056 }
                java.util.List r2 = r2.f1453AG     // Catch:{ all -> 0x0056 }
                r1.<init>(r2)     // Catch:{ all -> 0x0056 }
                com.kofax.mobile.sdk._internal.impl.camera.h r2 = com.kofax.mobile.sdk._internal.impl.camera.C0608h.this     // Catch:{ all -> 0x0056 }
                java.util.List r2 = r2.f1453AG     // Catch:{ all -> 0x0056 }
                r2.clear()     // Catch:{ all -> 0x0056 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0056 }
            L_0x0044:
                boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0056 }
                if (r2 == 0) goto L_0x0054
                java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0056 }
                com.kofax.mobile.sdk._internal.camera.k r2 = (com.kofax.mobile.sdk._internal.camera.C0505k) r2     // Catch:{ all -> 0x0056 }
                r2.mo11197k(r4)     // Catch:{ all -> 0x0056 }
                goto L_0x0044
            L_0x0054:
                monitor-exit(r0)
                return
            L_0x0056:
                r4 = move-exception
                monitor-exit(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk._internal.impl.camera.C0608h.C06133.mo11197k(boolean):void");
        }
    };

    /* renamed from: AQ */
    private final C0507o f1463AQ = new C0507o() {
        /* renamed from: b */
        public void mo11199b(byte[] bArr, int i, int i2, int i3) {
            synchronized (C0608h.f1444AA) {
                try {
                    C0767k.m1801b(C0608h.TAG, "Photo taken");
                    C0608h.this._bus.post(new C0684aq());
                    C0608h.this.f1456AJ.mo11199b(bArr, i, i2, i3);
                    C0608h.this.f1448AB.startPreview();
                    C0608h.this.m1345jF();
                    boolean unused = C0608h.this.f1459AM = false;
                    boolean unused2 = C0608h.this.f1460AN = false;
                } catch (Throwable th) {
                    boolean unused3 = C0608h.this.f1459AM = false;
                    boolean unused4 = C0608h.this.f1460AN = false;
                    throw th;
                }
            }
        }
    };

    /* renamed from: AR */
    private final C0510s f1464AR = new C0510s() {
        public void onShutter() {
        }
    };

    /* renamed from: AS */
    private WeakReference<SurfaceHolder> f1465AS;
    /* access modifiers changed from: private */
    public final IBus _bus;
    /* access modifiers changed from: private */

    /* renamed from: jN */
    public int f1466jN = 0;

    /* renamed from: kA */
    private CameraType f1467kA = CameraType.BACK_CAMERA;

    /* renamed from: kB */
    private Flash f1468kB = Flash.OFF;

    /* renamed from: ki */
    private CameraInitializationEvent.CameraInitStatus f1469ki = CameraInitializationEvent.CameraInitStatus.CAMERA_VIEW_CREATED;

    /* renamed from: kp */
    private C0509q f1470kp;
    /* access modifiers changed from: private */

    /* renamed from: wO */
    public Handler f1471wO;
    /* access modifiers changed from: private */

    /* renamed from: wz */
    public boolean f1472wz = false;

    /* renamed from: i */
    private static int m1340i(int i) {
        if (i == 0) {
            return 0;
        }
        if (i != 1) {
            return i != 2 ? i != 3 ? 0 : 270 : CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256;
        }
        return 90;
    }

    @HmlPinActivity
    public C0608h(C0499e eVar, C0577f fVar, IBus iBus, C0506n nVar, C0598m mVar) {
        this._bus = iBus;
        this.f1448AB = eVar;
        this.f1449AC = fVar;
        this.f1450AD = nVar;
        this.f1451AE = mVar;
    }

    public void close() {
        if (this.f1448AB.mo11171bl()) {
            synchronized (f1444AA) {
                if (this.f1448AB.mo11171bl()) {
                    this._bus.unregister(this);
                    m1351ju();
                    try {
                        stopPreview();
                        this.f1448AB.mo11167a((C0501g) null);
                        this.f1448AB.close();
                        this.f1472wz = false;
                        this.f1458AL = false;
                        this.f1459AM = false;
                        this.f1460AN = false;
                    } catch (Exception unused) {
                        this.f1472wz = false;
                        this.f1458AL = false;
                        this.f1459AM = false;
                        this.f1460AN = false;
                    } catch (Throwable th) {
                        this.f1472wz = false;
                        this.f1458AL = false;
                        this.f1459AM = false;
                        this.f1460AN = false;
                        this.f1468kB = Flash.OFF;
                        throw th;
                    }
                    this.f1468kB = Flash.OFF;
                }
            }
        }
    }

    /* renamed from: ju */
    private void m1351ju() {
        if (Build.VERSION.SDK_INT >= 18) {
            m1352jv();
        } else {
            m1353jw();
        }
    }

    /* renamed from: jv */
    private void m1352jv() {
        this.f1471wO.getLooper().quitSafely();
    }

    /* renamed from: jw */
    private void m1353jw() {
        this.f1471wO.getLooper().quit();
    }

    public void open() {
        if (!this.f1448AB.mo11171bl()) {
            synchronized (f1444AA) {
                if (!this.f1448AB.mo11171bl()) {
                    this._bus.register(this);
                    HandlerThread handlerThread = new HandlerThread("CameraManager Background Handler Thread");
                    handlerThread.start();
                    this.f1471wO = new Handler(handlerThread.getLooper());
                    try {
                        this.f1448AB.mo11165a(this.f1467kA);
                        this.f1448AB.mo11167a(this.f1461AO);
                    } catch (RuntimeException e) {
                        this._bus.post(new C0694g(e));
                        this._bus.unregister(this);
                        throw new KmcRuntimeException(ErrorInfo.KMC_UI_CAMERA_OPERATION_FAILURE, e);
                    }
                }
            }
        }
    }

    public void cancelAutoFocus() {
        m1354s(false);
    }

    public void setCameraType(CameraType cameraType) {
        this.f1467kA = cameraType;
    }

    /* renamed from: jx */
    public Camera.Size mo11542jx() {
        if (!this.f1448AB.mo11171bl()) {
            return null;
        }
        synchronized (f1444AA) {
            if (!this.f1448AB.mo11171bl()) {
                return null;
            }
            if (this.f1452AF) {
                Camera.Size e = this.f1450AD.mo11198e(this.f1449AC.mo11465c((C0498d) this.f1448AB));
                return e;
            }
            Camera.Size e2 = this.f1450AD.mo11198e(this.f1449AC.mo11462b((C0498d) this.f1448AB));
            return e2;
        }
    }

    public int getRotation() {
        return this.f1466jN;
    }

    /* renamed from: bm */
    public boolean mo11531bm() {
        return this.f1448AB.mo11172bm();
    }

    /* renamed from: h */
    public Point mo11537h(int i, int i2) {
        if (!this.f1448AB.mo11171bl()) {
            return new Point();
        }
        Point bk = this.f1449AC.mo11464bk();
        int i3 = this.f1466jN;
        boolean z = i3 == 90 || i3 == 270 || i3 == -90 || i3 == -270;
        int i4 = z ? bk.y : bk.x;
        int i5 = z ? bk.x : bk.y;
        float f = (float) i4;
        float f2 = (float) i5;
        float min = Math.min(((float) i) / f, ((float) i2) / f2);
        return new Point(Math.round(f * min), Math.round(min * f2));
    }

    /* renamed from: jy */
    public List<Camera.Size> mo11543jy() {
        int i;
        List<Point> list;
        ArrayList arrayList = new ArrayList();
        if (this.f1448AB.mo11171bl()) {
            if (this.f1452AF) {
                list = this.f1449AC.mo11469f((C0498d) this.f1448AB);
                i = f1446Ay;
            } else {
                list = this.f1449AC.mo11472g((C0498d) this.f1448AB);
                i = f1447Az;
            }
            for (Point next : list) {
                if (next.x >= i && next.y >= i) {
                    arrayList.add(this.f1450AD.mo11198e(next));
                }
            }
            return arrayList;
        }
        throw new IllegalStateException("Camera is not initialized");
    }

    /* renamed from: jz */
    public List<Size> mo11544jz() {
        List<Camera.Size> jy = mo11543jy();
        ArrayList arrayList = new ArrayList(jy.size());
        for (Camera.Size size : jy) {
            arrayList.add(new Size(size));
        }
        return arrayList;
    }

    /* renamed from: jA */
    public Point mo11539jA() {
        Point bk = this.f1449AC.mo11464bk();
        if (bk == null) {
            bk = new Point();
        }
        int i = this.f1466jN;
        if (i == 90 || i == -90 || i == 270 || i == -270) {
            bk.set(bk.y, bk.x);
        }
        return bk;
    }

    /* renamed from: jB */
    public boolean mo11540jB() {
        return this.f1452AF;
    }

    /* renamed from: r */
    public boolean mo11546r(boolean z) {
        if (this.f1452AF == z) {
            return true;
        }
        this.f1452AF = z;
        this.f1449AC.mo11481q(z);
        if (!this.f1448AB.mo11171bl() || this.f1465AS.get() == null) {
            return false;
        }
        synchronized (f1444AA) {
            if (!this.f1448AB.mo11171bl()) {
                return false;
            }
            close();
            this.f1469ki = CameraInitializationEvent.CameraInitStatus.CAMERA_USE_VIDEO_FRAME_CHANGED;
            open();
            this.f1449AC.mo11466c(this.f1448AB);
            this.f1448AB.setPreviewDisplay(this.f1465AS.get());
            m1343jD();
            startPreview();
            m1345jF();
            return true;
        }
    }

    /* renamed from: a */
    public void mo11522a(SurfaceHolder surfaceHolder, int i, int i2) {
        m1343jD();
        this.f1465AS = new WeakReference<>(surfaceHolder);
        this.f1448AB.setPreviewDisplay(surfaceHolder);
        this.f1449AC.mo11461a(this.f1448AB, i, i2);
    }

    /* renamed from: c */
    public void mo11532c(List<Rect> list, int i, int i2) {
        if (this.f1448AB.mo11171bl()) {
            synchronized (f1444AA) {
                if (this.f1448AB.mo11171bl()) {
                    int i3 = Build.VERSION.SDK_INT;
                    int maxNumFocusAreas = this.f1448AB.getMaxNumFocusAreas();
                    if (i3 < 14 || maxNumFocusAreas <= 0) {
                        throw new KmcRuntimeException(ErrorInfo.KMC_UI_FOCUS_AREA_NOT_SUPPORTED);
                    }
                    if (list != null) {
                        if (list.size() > maxNumFocusAreas) {
                            throw new KmcRuntimeException(ErrorInfo.KMC_UI_FOCUS_AREA_COUNT);
                        }
                    }
                    ArrayList arrayList = null;
                    if (list != null && list.size() > 0) {
                        arrayList = new ArrayList();
                        for (Rect next : list) {
                            arrayList.add(new C7889a(m1326a(new Rect(next.left, next.top, next.right, next.bottom), i, i2), 1000));
                        }
                    }
                    this.f1448AB.setFocusAreas(arrayList);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo11528a(Size size) {
        synchronized (f1444AA) {
            try {
                List<Size> jz = mo11544jz();
                Point point = null;
                if (size != null) {
                    point = new Point(size.width, size.height);
                }
                if (jz == null || !jz.contains(size)) {
                    throw new KmcRuntimeException(ErrorInfo.KMC_GN_UNSUPPORTED_OPERATION);
                }
                close();
                this.f1469ki = CameraInitializationEvent.CameraInitStatus.CAMERA_IMAGE_RESOLUTION_CHANGED;
                if (this.f1452AF) {
                    this.f1449AC.mo11471f(point);
                } else {
                    this.f1449AC.mo11474g(point);
                }
                open();
                this.f1449AC.mo11466c(this.f1448AB);
                this.f1448AB.setPreviewDisplay(this.f1465AS.get());
                m1343jD();
                startPreview();
                m1345jF();
            } catch (Throwable th) {
                open();
                this.f1449AC.mo11466c(this.f1448AB);
                this.f1448AB.setPreviewDisplay(this.f1465AS.get());
                m1343jD();
                startPreview();
                m1345jF();
                throw th;
            }
        }
        return true;
    }

    public void onPreviewFrame(byte[] bArr, int i, int i2) {
        if (this.f1454AH && this.f1470kp != null) {
            Point bk = this.f1449AC.mo11464bk();
            this.f1470kp.onPreviewFrame(new PreviewImageReadyBusEvent(bArr, bk.x, bk.y, this.f1466jN));
        }
    }

    public void startPreview() {
        if (!this.f1448AB.mo11171bl() || !this.f1458AL) {
            synchronized (f1444AA) {
                if (!this.f1448AB.mo11171bl() || !this.f1458AL) {
                    this.f1449AC.mo11466c(this.f1448AB);
                    this.f1448AB.startPreview();
                    setFlash(this.f1468kB);
                    this.f1458AL = true;
                    this._bus.post(new C0695i(this, mo11542jx(), this.f1469ki));
                    this.f1469ki = CameraInitializationEvent.CameraInitStatus.CAMERA_VIEW_CREATED;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void stopPreview() {
        /*
            r2 = this;
            com.kofax.mobile.sdk._internal.camera.e r0 = r2.f1448AB
            boolean r0 = r0.mo11171bl()
            if (r0 == 0) goto L_0x0033
            boolean r0 = r2.f1458AL
            if (r0 == 0) goto L_0x0033
            java.lang.Object r0 = f1444AA
            monitor-enter(r0)
            com.kofax.mobile.sdk._internal.camera.e r1 = r2.f1448AB     // Catch:{ all -> 0x0030 }
            boolean r1 = r1.mo11171bl()     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002e
            boolean r1 = r2.f1458AL     // Catch:{ all -> 0x0030 }
            if (r1 != 0) goto L_0x001c
            goto L_0x002e
        L_0x001c:
            r1 = 0
            r2.f1458AL = r1     // Catch:{ all -> 0x0030 }
            r2.f1472wz = r1     // Catch:{ all -> 0x0030 }
            com.kofax.mobile.sdk._internal.camera.e r1 = r2.f1448AB     // Catch:{ all -> 0x0030 }
            r1.stopPreview()     // Catch:{ all -> 0x0030 }
            r2.m1348jI()     // Catch:{ all -> 0x0030 }
            r2.cancelAutoFocus()     // Catch:{ all -> 0x0030 }
            monitor-exit(r0)
            return
        L_0x002e:
            monitor-exit(r0)
            return
        L_0x0030:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk._internal.impl.camera.C0608h.stopPreview():void");
    }

    /* renamed from: jC */
    public void mo11541jC() {
        mo11535d((C0505k) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11535d(com.kofax.mobile.sdk._internal.camera.C0505k r5) {
        /*
            r4 = this;
            java.lang.Object r0 = f1444AA
            monitor-enter(r0)
            if (r5 == 0) goto L_0x0012
            java.util.List<com.kofax.mobile.sdk._internal.camera.k> r1 = r4.f1453AG     // Catch:{ all -> 0x0054 }
            boolean r1 = r1.contains(r5)     // Catch:{ all -> 0x0054 }
            if (r1 != 0) goto L_0x0012
            java.util.List<com.kofax.mobile.sdk._internal.camera.k> r1 = r4.f1453AG     // Catch:{ all -> 0x0054 }
            r1.add(r5)     // Catch:{ all -> 0x0054 }
        L_0x0012:
            com.kofax.mobile.sdk._internal.camera.e r5 = r4.f1448AB     // Catch:{ all -> 0x0054 }
            boolean r5 = r5.mo11171bl()     // Catch:{ all -> 0x0054 }
            if (r5 == 0) goto L_0x0052
            boolean r5 = r4.f1460AN     // Catch:{ all -> 0x0054 }
            if (r5 != 0) goto L_0x0052
            boolean r5 = r4.f1458AL     // Catch:{ all -> 0x0054 }
            if (r5 == 0) goto L_0x0052
            boolean r5 = r4.f1472wz     // Catch:{ all -> 0x0054 }
            if (r5 == 0) goto L_0x0027
            goto L_0x0052
        L_0x0027:
            r5 = 1
            r4.f1472wz = r5     // Catch:{ all -> 0x0054 }
            com.kofax.mobile.sdk._internal.camera.e r5 = r4.f1448AB     // Catch:{ RuntimeException -> 0x0032 }
            com.kofax.mobile.sdk._internal.camera.k r1 = r4.f1462AP     // Catch:{ RuntimeException -> 0x0032 }
            r5.mo11168a((com.kofax.mobile.sdk._internal.camera.C0505k) r1)     // Catch:{ RuntimeException -> 0x0032 }
            goto L_0x0050
        L_0x0032:
            r5 = move-exception
            java.lang.String r1 = TAG     // Catch:{ all -> 0x0054 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0054 }
            r2.<init>()     // Catch:{ all -> 0x0054 }
            java.lang.String r3 = "Focus exception: "
            r2.append(r3)     // Catch:{ all -> 0x0054 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x0054 }
            r2.append(r5)     // Catch:{ all -> 0x0054 }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x0054 }
            com.kofax.mobile.sdk._internal.C0767k.m1820e((java.lang.String) r1, (java.lang.String) r5)     // Catch:{ all -> 0x0054 }
            r5 = 0
            r4.f1472wz = r5     // Catch:{ all -> 0x0054 }
        L_0x0050:
            monitor-exit(r0)
            return
        L_0x0052:
            monitor-exit(r0)
            return
        L_0x0054:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk._internal.impl.camera.C0608h.mo11535d(com.kofax.mobile.sdk._internal.camera.k):void");
    }

    /* renamed from: a */
    public void mo11523a(C0509q qVar) {
        this.f1470kp = qVar;
        if (qVar == null) {
            m1348jI();
        } else {
            m1345jF();
        }
    }

    public void setFlash(Flash flash) {
        m1327a(flash, true);
    }

    public boolean isFlashSupported(Flash flash) {
        boolean z;
        if (flash != null) {
            synchronized (f1444AA) {
                if (this.f1448AB.mo11171bl()) {
                    List<Flash> supportedFlashModes = this.f1448AB.getSupportedFlashModes();
                    z = supportedFlashModes != null && supportedFlashModes.contains(flash);
                } else {
                    throw new IllegalStateException("Camera is not initialized");
                }
            }
            return z;
        }
        throw null;
    }

    /* renamed from: jD */
    private void m1343jD() {
        int i;
        int i2;
        if (this.f1448AB.mo11171bl()) {
            synchronized (f1444AA) {
                if (this.f1448AB.mo11171bl()) {
                    int i3 = m1340i(this.f1457AK);
                    if (mo11531bm()) {
                        i = (this.f1448AB.getOrientation() + i3) % 360;
                        i2 = (360 - i) % 360;
                    } else {
                        i = ((this.f1448AB.getOrientation() - i3) + 360) % 360;
                        i2 = i;
                    }
                    this.f1466jN = i;
                    this.f1448AB.setDisplayOrientation(i2);
                }
            }
        }
    }

    /* renamed from: a */
    private Rect m1326a(Rect rect, int i, int i2) {
        if (m1331b(rect)) {
            m1330b(rect, i, i2);
            Matrix matrix = new Matrix();
            matrix.postTranslate(((float) (-i)) / 2.0f, ((float) (-i2)) / 2.0f);
            matrix.postScale(2000.0f / ((float) i), 2000.0f / ((float) i2));
            matrix.postRotate((float) (-this.f1466jN));
            RectF rectF = new RectF((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
            matrix.mapRect(rectF);
            rect.left = (int) rectF.left;
            rect.right = (int) rectF.right;
            rect.top = (int) rectF.top;
            rect.bottom = (int) rectF.bottom;
            return rect;
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_UI_FOCUS_AREA_INVALID);
    }

    /* renamed from: b */
    private void m1330b(Rect rect, int i, int i2) {
        int i3 = rect.left;
        int i4 = rect.top;
        int i5 = rect.right;
        int i6 = rect.bottom;
        if (rect.left < 0) {
            i5 = (int) (((double) i) * 0.1d);
            i3 = 0;
        }
        if (rect.top < 0) {
            i6 = (int) (((double) i2) * 0.1d);
            i4 = 0;
        }
        if (rect.right > i) {
            i3 = i - ((int) (((double) i) * 0.1d));
        } else {
            i = i5;
        }
        if (rect.bottom > i2) {
            i4 = i2 - ((int) (((double) i2) * 0.1d));
        } else {
            i2 = i6;
        }
        rect.set(i3, i4, i, i2);
    }

    /* renamed from: b */
    private boolean m1331b(Rect rect) {
        return rect.width() > 0 && rect.height() > 0 && rect.right >= rect.left && rect.bottom >= rect.top;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        return;
     */
    /* renamed from: jE */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m1344jE() {
        /*
            r4 = this;
            com.kofax.mobile.sdk._internal.camera.e r0 = r4.f1448AB
            boolean r0 = r0.mo11171bl()
            if (r0 == 0) goto L_0x0042
            boolean r0 = r4.f1460AN
            if (r0 != 0) goto L_0x0042
            boolean r0 = r4.f1458AL
            if (r0 == 0) goto L_0x0042
            java.lang.Object r0 = f1444AA
            monitor-enter(r0)
            com.kofax.mobile.sdk._internal.camera.e r1 = r4.f1448AB     // Catch:{ all -> 0x003f }
            boolean r1 = r1.mo11171bl()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003d
            boolean r1 = r4.f1460AN     // Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x003d
            boolean r1 = r4.f1458AL     // Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x0024
            goto L_0x003d
        L_0x0024:
            r1 = 1
            r4.f1459AM = r1     // Catch:{ all -> 0x003f }
            boolean r2 = r4.f1472wz     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x002d
            monitor-exit(r0)
            return
        L_0x002d:
            r4.m1348jI()     // Catch:{ all -> 0x003f }
            r4.f1460AN = r1     // Catch:{ all -> 0x003f }
            com.kofax.mobile.sdk._internal.camera.e r1 = r4.f1448AB     // Catch:{ all -> 0x003f }
            com.kofax.mobile.sdk._internal.camera.s r2 = r4.f1464AR     // Catch:{ all -> 0x003f }
            com.kofax.mobile.sdk._internal.camera.o r3 = r4.f1463AQ     // Catch:{ all -> 0x003f }
            r1.mo11170a((com.kofax.mobile.sdk._internal.camera.C0510s) r2, (com.kofax.mobile.sdk._internal.camera.C0507o) r3)     // Catch:{ all -> 0x003f }
            monitor-exit(r0)
            return
        L_0x003d:
            monitor-exit(r0)
            return
        L_0x003f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk._internal.impl.camera.C0608h.m1344jE():void");
    }

    /* renamed from: a */
    private void m1327a(Flash flash, boolean z) {
        if (this.f1448AB.mo11171bl()) {
            synchronized (f1444AA) {
                if (this.f1448AB.mo11171bl()) {
                    try {
                        List<Flash> supportedFlashModes = this.f1448AB.getSupportedFlashModes();
                        if (supportedFlashModes == null) {
                            this.f1468kB = Flash.OFF;
                            return;
                        }
                        int i = C06167.f1485Ba[flash.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        if (supportedFlashModes.contains(Flash.OFF)) {
                                            Flash flash2 = Flash.OFF;
                                            this.f1468kB = flash2;
                                            this.f1448AB.mo11148a(flash2);
                                        } else {
                                            throw new KmcRuntimeException(ErrorInfo.KMC_UI_FLASH_OFF_NOT_SUPPORTED);
                                        }
                                    } else if (!supportedFlashModes.contains(Flash.AUTOTORCH)) {
                                        throw new KmcRuntimeException(ErrorInfo.KMC_UI_FLASH_TORCH_NOT_SUPPORTED);
                                    }
                                } else if (supportedFlashModes.contains(Flash.TORCH)) {
                                    Flash flash3 = Flash.TORCH;
                                    this.f1468kB = flash3;
                                    this.f1448AB.mo11148a(flash3);
                                } else {
                                    throw new KmcRuntimeException(ErrorInfo.KMC_UI_FLASH_TORCH_NOT_SUPPORTED);
                                }
                            } else if (supportedFlashModes.contains(Flash.ON)) {
                                Flash flash4 = Flash.ON;
                                this.f1468kB = flash4;
                                this.f1448AB.mo11148a(flash4);
                            } else {
                                throw new KmcRuntimeException(ErrorInfo.KMC_UI_FLASH_ON_NOT_SUPPORTED);
                            }
                        } else if (supportedFlashModes.contains(Flash.AUTO)) {
                            Flash flash5 = Flash.AUTO;
                            this.f1468kB = flash5;
                            this.f1448AB.mo11148a(flash5);
                        } else {
                            throw new KmcRuntimeException(ErrorInfo.KMC_UI_FLASH_AUTO_NOT_SUPPORTED);
                        }
                    } catch (KmcRuntimeException e) {
                        if (z) {
                            throw e;
                        }
                    } catch (Exception e2) {
                        this._bus.post(new C0682aj(TAG, C0682aj.C0683a.ERROR, ErrorInfo.KMC_UI_CAMERA_OPERATION_FAILURE.getErrMsg(), e2));
                    }
                } else {
                    return;
                }
            }
        } else {
            return;
        }
        return;
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.camera.h$7 */
    static /* synthetic */ class C06167 {

        /* renamed from: Ba */
        static final /* synthetic */ int[] f1485Ba;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.kofax.kmc.kui.uicontrols.data.Flash[] r0 = com.kofax.kmc.kui.uicontrols.data.Flash.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1485Ba = r0
                com.kofax.kmc.kui.uicontrols.data.Flash r1 = com.kofax.kmc.kui.uicontrols.data.Flash.AUTO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1485Ba     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.kmc.kui.uicontrols.data.Flash r1 = com.kofax.kmc.kui.uicontrols.data.Flash.ON     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1485Ba     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.kofax.kmc.kui.uicontrols.data.Flash r1 = com.kofax.kmc.kui.uicontrols.data.Flash.TORCH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1485Ba     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.kofax.kmc.kui.uicontrols.data.Flash r1 = com.kofax.kmc.kui.uicontrols.data.Flash.AUTOTORCH     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f1485Ba     // Catch:{ NoSuchFieldError -> 0x003e }
                com.kofax.kmc.kui.uicontrols.data.Flash r1 = com.kofax.kmc.kui.uicontrols.data.Flash.OFF     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk._internal.impl.camera.C0608h.C06167.<clinit>():void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005b, code lost:
        return;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1354s(boolean r5) {
        /*
            r4 = this;
            com.kofax.mobile.sdk._internal.camera.e r0 = r4.f1448AB
            boolean r0 = r0.mo11171bl()
            if (r0 == 0) goto L_0x005f
            boolean r0 = r4.f1459AM
            if (r0 != 0) goto L_0x005f
            boolean r0 = r4.f1458AL
            if (r0 == 0) goto L_0x005f
            boolean r0 = r4.f1472wz
            if (r0 == 0) goto L_0x0016
            if (r5 == 0) goto L_0x005f
        L_0x0016:
            java.lang.Object r0 = f1444AA
            monitor-enter(r0)
            com.kofax.mobile.sdk._internal.camera.e r1 = r4.f1448AB     // Catch:{ all -> 0x005c }
            boolean r1 = r1.mo11171bl()     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x005a
            boolean r1 = r4.f1459AM     // Catch:{ all -> 0x005c }
            if (r1 != 0) goto L_0x005a
            boolean r1 = r4.f1458AL     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x005a
            boolean r1 = r4.f1472wz     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x002f
            if (r5 == 0) goto L_0x005a
        L_0x002f:
            com.kofax.mobile.sdk._internal.camera.e r5 = r4.f1448AB     // Catch:{ RuntimeException -> 0x003e }
            r5.cancelAutoFocus()     // Catch:{ RuntimeException -> 0x003e }
            java.util.List<com.kofax.mobile.sdk._internal.camera.k> r5 = r4.f1453AG     // Catch:{ RuntimeException -> 0x003e }
            r5.clear()     // Catch:{ RuntimeException -> 0x003e }
            r5 = 0
            r4.f1472wz = r5     // Catch:{ RuntimeException -> 0x003e }
            monitor-exit(r0)
            return
        L_0x003e:
            r5 = move-exception
            java.lang.String r1 = TAG     // Catch:{ all -> 0x005c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x005c }
            r2.<init>()     // Catch:{ all -> 0x005c }
            java.lang.String r3 = "Cancel focus exception: "
            r2.append(r3)     // Catch:{ all -> 0x005c }
            java.lang.String r3 = r5.getMessage()     // Catch:{ all -> 0x005c }
            r2.append(r3)     // Catch:{ all -> 0x005c }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x005c }
            com.kofax.mobile.sdk._internal.C0767k.m1820e((java.lang.String) r1, (java.lang.String) r2)     // Catch:{ all -> 0x005c }
            throw r5     // Catch:{ all -> 0x005c }
        L_0x005a:
            monitor-exit(r0)
            return
        L_0x005c:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk._internal.impl.camera.C0608h.m1354s(boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: jF */
    public void m1345jF() {
        synchronized (f1444AA) {
            if (!this.f1454AH) {
                byte[] bArr = new byte[m1346jG()];
                this.f1455AI = bArr;
                this.f1448AB.mo11169a((C0508p) this, bArr);
                this.f1454AH = true;
            }
        }
    }

    /* renamed from: jG */
    private int m1346jG() {
        return (int) Math.ceil(((double) m1347jH()) * (((double) ImageFormat.getBitsPerPixel(this.f1448AB.getPreviewFormat())) / 8.0d));
    }

    /* renamed from: jH */
    private int m1347jH() {
        int i = 0;
        for (Point next : this.f1448AB.getSupportedPreviewSizes()) {
            int i2 = next.y * next.x;
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    /* renamed from: jI */
    private void m1348jI() {
        synchronized (f1444AA) {
            this.f1448AB.mo11169a((C0508p) null, (byte[]) null);
            this.f1455AI = null;
            this.f1454AH = false;
        }
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo11524a(SetFocusAreasRequestBusEvent setFocusAreasRequestBusEvent) {
        mo11532c(setFocusAreasRequestBusEvent.areas, setFocusAreasRequestBusEvent.width, setFocusAreasRequestBusEvent.height);
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: b */
    public void mo11529b(C0690ba baVar) {
        mo11535d(baVar.f1628IN);
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo11526a(C0696n nVar) {
        m1354s(nVar.f1632Iw);
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo11527a(C7975o oVar) {
        m1344jE();
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo11525a(C7961at atVar) {
        C0499e eVar = this.f1448AB;
        if (eVar != null && eVar.mo11171bl()) {
            final C0499e eVar2 = this.f1448AB;
            final long j = atVar.f3724Iu;
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    C0608h.this._bus.post(new C7974m(eVar2, j));
                }
            });
        }
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: b */
    public void mo11530b(C0699v vVar) {
        this.f1457AK = vVar.rotation;
        if (Build.VERSION.SDK_INT >= 14) {
            m1343jD();
        }
    }
}
