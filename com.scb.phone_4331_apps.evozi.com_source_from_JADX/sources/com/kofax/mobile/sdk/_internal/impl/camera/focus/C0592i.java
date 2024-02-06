package com.kofax.mobile.sdk._internal.impl.camera.focus;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.kmc.ken.engines.gpu.GPUStrategyFocusFactorDetection;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.camera.C0498d;
import com.kofax.mobile.sdk._internal.camera.C0504j;
import com.kofax.mobile.sdk._internal.impl.event.C7959ap;
import com.kofax.mobile.sdk._internal.impl.event.C7981z;
import com.kofax.mobile.sdk._internal.impl.event.PreviewImageReadyBusEvent;
import com.kofax.mobile.sdk._internal.impl.event.SetFocusAreasRequestBusEvent;
import com.kofax.mobile.sdk._internal.impl.event.SurfaceChangedEvent;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;
import p040o.HmlPinActivity;
import p040o.HmlReviewDocumentActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.focus.i */
public class C0592i implements C0504j {
    private static final String TAG = C0592i.class.getSimpleName();

    /* renamed from: DV */
    private boolean f1394DV;

    /* renamed from: Ek */
    private int f1395Ek = 0;

    /* renamed from: El */
    private int f1396El = 0;

    /* renamed from: Em */
    private BoundingTetragon f1397Em = null;

    /* renamed from: En */
    private Rect f1398En = null;

    /* renamed from: Eo */
    private final C0597k f1399Eo;
    /* access modifiers changed from: private */

    /* renamed from: Ep */
    public GPUStrategyFocusFactorDetection f1400Ep;
    /* access modifiers changed from: private */

    /* renamed from: Eq */
    public HmlReviewDocumentActivity<GPUStrategyFocusFactorDetection> f1401Eq;

    /* renamed from: Er */
    private ExecutorService f1402Er = null;

    /* renamed from: Es */
    private boolean f1403Es = false;
    private IBus _bus = null;

    /* renamed from: zU */
    private C0498d f1404zU;

    @HmlPinActivity
    C0592i(IBus iBus, C0597k kVar, HmlReviewDocumentActivity<GPUStrategyFocusFactorDetection> hmlReviewDocumentActivity) {
        this._bus = iBus;
        this.f1399Eo = kVar;
        this.f1401Eq = hmlReviewDocumentActivity;
    }

    /* renamed from: ky */
    private boolean m1285ky() {
        return this.f1404zU.getMaxNumFocusAreas() > 0 && (this.f1399Eo.containsKey(Build.MANUFACTURER) || this.f1399Eo.containsKey(Build.MODEL) || this.f1403Es);
    }

    /* renamed from: bq */
    public void mo11195bq() {
        if (this.f1395Ek > 0 && this.f1396El > 0 && m1285ky()) {
            this._bus.post(new SetFocusAreasRequestBusEvent(m1282i(this.f1395Ek, this.f1396El), this.f1395Ek, this.f1396El));
        }
    }

    /* renamed from: a */
    public void mo11194a(C0498d dVar) {
        this.f1404zU = dVar;
        if (!this.f1394DV) {
            this._bus.register(this);
            this.f1394DV = true;
        }
        this.f1402Er = Executors.newSingleThreadExecutor();
        call(new Callable<Void>() {
            public Void call() throws Exception {
                if (C0592i.this.f1400Ep != null) {
                    return null;
                }
                C0592i iVar = C0592i.this;
                GPUStrategyFocusFactorDetection unused = iVar.f1400Ep = (GPUStrategyFocusFactorDetection) iVar.f1401Eq.get();
                return null;
            }
        });
    }

    public void stop() {
        call(new Callable<Void>() {
            public Void call() throws Exception {
                if (C0592i.this.f1400Ep != null) {
                    C0592i.this.f1400Ep.destroy();
                    GPUStrategyFocusFactorDetection unused = C0592i.this.f1400Ep = null;
                }
                return null;
            }
        });
        this.f1402Er.shutdown();
        try {
            this.f1402Er.awaitTermination(1, TimeUnit.DAYS);
            if (this.f1394DV) {
                this._bus.unregister(this);
                this.f1394DV = false;
            }
        } catch (InterruptedException unused) {
            throw new RuntimeException("Interrupted");
        }
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: c */
    public void mo11500c(C7959ap apVar) {
        this.f1397Em = apVar.f3714Je;
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo11499a(C7981z zVar) {
        this.f1403Es = zVar.f3730IH;
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo11498a(SurfaceChangedEvent surfaceChangedEvent) {
        if (surfaceChangedEvent.hasSurface) {
            this.f1395Ek = surfaceChangedEvent.view.getWidth();
            this.f1396El = surfaceChangedEvent.view.getHeight();
        }
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: f */
    public void mo11501f(final PreviewImageReadyBusEvent previewImageReadyBusEvent) {
        if (this.f1400Ep != null && this.f1394DV && m1285ky()) {
            final Rect rect = new Rect();
            BoundingTetragon boundingTetragon = this.f1397Em;
            if (boundingTetragon != null) {
                BoundingTetragon clone = boundingTetragon.clone();
                if (previewImageReadyBusEvent.rotation != 0) {
                    Point a = m1276a(previewImageReadyBusEvent.width, previewImageReadyBusEvent.height, previewImageReadyBusEvent.rotation);
                    clone.rotate(a.x, a.y, m1284k(previewImageReadyBusEvent.rotation));
                }
                rect.left = Math.min(Math.min(clone.getBottomLeft().x, clone.getBottomRight().x), Math.min(clone.getTopLeft().x, clone.getTopRight().x));
                rect.top = Math.min(Math.min(clone.getBottomLeft().y, clone.getBottomRight().y), Math.min(clone.getTopLeft().y, clone.getTopRight().y));
                rect.right = previewImageReadyBusEvent.width - Math.max(Math.max(clone.getBottomLeft().x, clone.getBottomRight().x), Math.max(clone.getTopLeft().x, clone.getTopRight().x));
                rect.bottom = previewImageReadyBusEvent.height - Math.max(Math.max(clone.getBottomLeft().y, clone.getBottomRight().y), Math.max(clone.getTopLeft().y, clone.getTopRight().y));
                m1281c(rect);
            }
            int[] iArr = (int[]) call(new Callable<int[]>() {
                /* renamed from: kz */
                public int[] call() throws Exception {
                    return C0592i.this.f1400Ep.handleFocus(previewImageReadyBusEvent.imageData, previewImageReadyBusEvent.width, previewImageReadyBusEvent.height, rect, true, true);
                }
            });
            if (iArr != null) {
                this.f1398En = m1277a(new Rect(iArr[0], iArr[1], iArr[2], iArr[3]), previewImageReadyBusEvent.width, previewImageReadyBusEvent.height, previewImageReadyBusEvent.rotation);
            }
        }
    }

    /* renamed from: c */
    private void m1281c(Rect rect) {
        int i = 0;
        rect.left = rect.left < 0 ? 0 : rect.left;
        rect.top = rect.top < 0 ? 0 : rect.top;
        rect.right = rect.right < 0 ? 0 : rect.right;
        if (rect.bottom >= 0) {
            i = rect.bottom;
        }
        rect.bottom = i;
    }

    /* renamed from: a */
    private static Point m1276a(int i, int i2, int i3) {
        if (!(i3 % CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 == 0)) {
            int i4 = i2;
            i2 = i;
            i = i4;
        }
        return new Point(i, i2);
    }

    /* renamed from: k */
    private static BoundingTetragon.Rotation m1284k(int i) {
        if (i == 90) {
            return BoundingTetragon.Rotation.LEFT;
        }
        if (i == 180) {
            return BoundingTetragon.Rotation.FLIP;
        }
        if (i == 270) {
            return BoundingTetragon.Rotation.RIGHT;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    private Rect m1277a(Rect rect, int i, int i2, int i3) {
        RectF rectF = new RectF((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        RectF rectF2 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) i, (float) i2);
        Matrix matrix = new Matrix();
        matrix.postRotate((float) i3);
        matrix.mapRect(rectF);
        matrix.mapRect(rectF2);
        Matrix matrix2 = new Matrix();
        matrix2.postTranslate(-rectF2.left, -rectF2.top);
        matrix2.postScale(((float) this.f1395Ek) / rectF2.width(), ((float) this.f1396El) / rectF2.height());
        matrix2.mapRect(rectF);
        rect.left = (int) rectF.left;
        rect.right = (int) rectF.right;
        rect.top = (int) rectF.top;
        rect.bottom = (int) rectF.bottom;
        return rect;
    }

    /* renamed from: i */
    private List<Rect> m1282i(int i, int i2) {
        Rect rect = this.f1398En;
        if (rect == null) {
            return m1283j(i, i2);
        }
        return Collections.singletonList(rect);
    }

    /* renamed from: j */
    private List<Rect> m1283j(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        return Collections.singletonList(new Rect(i3 * 3, i4 * 3, i3 * 5, i4 * 5));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0019 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <T> T call(java.util.concurrent.Callable<T> r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.ExecutorService r0 = r1.f1402Er     // Catch:{ ExecutionException -> 0x0021, InterruptedException -> 0x0019, RejectedExecutionException -> 0x000f }
            java.util.concurrent.Future r2 = r0.submit(r2)     // Catch:{ ExecutionException -> 0x0021, InterruptedException -> 0x0019, RejectedExecutionException -> 0x000f }
            java.lang.Object r2 = r2.get()     // Catch:{ ExecutionException -> 0x0021, InterruptedException -> 0x0019, RejectedExecutionException -> 0x000f }
            monitor-exit(r1)
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0031
        L_0x000f:
            java.lang.String r2 = TAG     // Catch:{ all -> 0x000d }
            java.lang.String r0 = "Rejected execution calling _executor.submit"
            com.kofax.mobile.sdk._internal.C0767k.m1820e((java.lang.String) r2, (java.lang.String) r0)     // Catch:{ all -> 0x000d }
            monitor-exit(r1)
            r2 = 0
            return r2
        L_0x0019:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x000d }
            java.lang.String r0 = "Interrupted"
            r2.<init>(r0)     // Catch:{ all -> 0x000d }
            throw r2     // Catch:{ all -> 0x000d }
        L_0x0021:
            r2 = move-exception
            java.lang.Throwable r2 = r2.getCause()     // Catch:{ all -> 0x000d }
            throwIfUnchecked(r2)     // Catch:{ all -> 0x000d }
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x000d }
            java.lang.String r0 = "Unexpected exception"
            r2.<init>(r0)     // Catch:{ all -> 0x000d }
            throw r2     // Catch:{ all -> 0x000d }
        L_0x0031:
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk._internal.impl.camera.focus.C0592i.call(java.util.concurrent.Callable):java.lang.Object");
    }

    private static void throwIfUnchecked(Throwable th) {
        throwIfInstanceOf(th, RuntimeException.class);
        throwIfInstanceOf(th, Error.class);
    }

    private static <T extends Throwable> void throwIfInstanceOf(Throwable th, Class<T> cls) throws Throwable {
        if (cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }
}
