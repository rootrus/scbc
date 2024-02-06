package com.kofax.mobile.sdk._internal.impl.camera;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.kofax.kmc.kut.utilities.error.IllegalArgumentException;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.camera.C0509q;
import com.kofax.mobile.sdk._internal.dagger.C0519a;
import com.kofax.mobile.sdk._internal.impl.C0729l;
import com.kofax.mobile.sdk._internal.impl.event.C0676aa;
import com.kofax.mobile.sdk._internal.impl.event.C0690ba;
import com.kofax.mobile.sdk._internal.impl.event.LevelChangedEvent;
import com.kofax.mobile.sdk._internal.impl.event.PreviewImageReadyBusEvent;
import com.kofax.mobile.sdk._internal.impl.event.SurfaceChangedEvent;
import java.lang.Thread;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;
import p040o.HmlPinActivity;

@C0519a
/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.aa */
public class C0543aa implements C0509q {
    private static final String TAG = C0543aa.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: BI */
    public RuntimeException f1229BI;

    /* renamed from: BL */
    private final Thread.UncaughtExceptionHandler f1230BL = new Thread.UncaughtExceptionHandler() {
        public void uncaughtException(Thread thread, Throwable th) {
            if (th.getClass().isInstance(RuntimeException.class)) {
                RuntimeException unused = C0543aa.this.f1229BI = (RuntimeException) th;
            } else {
                RuntimeException unused2 = C0543aa.this.f1229BI = new RuntimeException(th);
            }
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    throw C0543aa.this.f1229BI;
                }
            });
        }
    };

    /* renamed from: Cl */
    Handler f1231Cl;

    /* renamed from: Cm */
    private float f1232Cm;

    /* renamed from: Cn */
    private float f1233Cn;

    /* renamed from: Co */
    private volatile boolean f1234Co;

    /* renamed from: Cp */
    private PreviewImageReadyBusEvent f1235Cp = null;

    /* renamed from: Cq */
    private PreviewImageReadyBusEvent f1236Cq = null;

    /* renamed from: Cr */
    boolean f1237Cr = false;

    /* renamed from: Cs */
    boolean f1238Cs = false;

    /* renamed from: Ct */
    private Thread.UncaughtExceptionHandler f1239Ct;
    /* access modifiers changed from: private */
    public final IBus _bus;

    /* renamed from: mB */
    private boolean f1240mB;

    /* renamed from: wz */
    private boolean f1241wz;

    @HmlPinActivity
    public C0543aa(IBus iBus) {
        if (iBus != null) {
            this._bus = iBus;
            iBus.register(this);
            return;
        }
        throw new IllegalArgumentException("bus cannot be null");
    }

    private void start() {
        if (this.f1231Cl != null) {
            C0767k.m1814d(TAG, "already started");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("Image Processing");
        this.f1239Ct = handlerThread.getUncaughtExceptionHandler();
        handlerThread.setUncaughtExceptionHandler(this.f1230BL);
        handlerThread.start();
        this.f1231Cl = new Handler(handlerThread.getLooper());
        C0767k.m1801b(TAG, "started");
    }

    private void stop() {
        synchronized (this) {
            if (this.f1231Cl == null) {
                C0767k.m1814d(TAG, "already stopped");
                return;
            }
            m1090ju();
            Looper looper = this.f1231Cl.getLooper();
            this.f1231Cl = null;
            try {
                looper.getThread().join();
                C0767k.m1801b(TAG, "stopped");
            } catch (InterruptedException unused) {
                throw new RuntimeException("Interrupted");
            }
        }
    }

    /* renamed from: ju */
    private void m1090ju() {
        Looper looper = this.f1231Cl.getLooper();
        looper.getThread().setUncaughtExceptionHandler(this.f1239Ct);
        m1085a(looper);
    }

    public void onPreviewFrame(PreviewImageReadyBusEvent previewImageReadyBusEvent) {
        synchronized (this) {
            m1088d(previewImageReadyBusEvent);
            this.f1238Cs = true;
            m1091kc();
        }
    }

    /* renamed from: kc */
    private void m1091kc() {
        synchronized (this) {
            PreviewImageReadyBusEvent previewImageReadyBusEvent = this.f1237Cr ? this.f1235Cp : this.f1236Cq;
            if (!this.f1234Co && previewImageReadyBusEvent != null && this.f1238Cs && this.f1231Cl != null) {
                this.f1234Co = true;
                m1089e(previewImageReadyBusEvent);
                this.f1231Cl.post(new C0546a(previewImageReadyBusEvent));
                this.f1238Cs = false;
                this.f1237Cr = !this.f1237Cr;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: kd */
    public void m1092kd() {
        this.f1234Co = false;
        m1091kc();
    }

    /* renamed from: d */
    private void m1088d(PreviewImageReadyBusEvent previewImageReadyBusEvent) {
        synchronized (this) {
            if (this.f1237Cr) {
                this.f1235Cp = m1082a(previewImageReadyBusEvent, this.f1235Cp);
            } else {
                this.f1236Cq = m1082a(previewImageReadyBusEvent, this.f1236Cq);
            }
        }
    }

    /* renamed from: a */
    private PreviewImageReadyBusEvent m1082a(PreviewImageReadyBusEvent previewImageReadyBusEvent, PreviewImageReadyBusEvent previewImageReadyBusEvent2) {
        if (previewImageReadyBusEvent == null) {
            throw new RuntimeException("Event is null!");
        } else if (previewImageReadyBusEvent2 == null || previewImageReadyBusEvent2.imageData.length != previewImageReadyBusEvent.imageData.length || previewImageReadyBusEvent2.width != previewImageReadyBusEvent.width || previewImageReadyBusEvent2.height != previewImageReadyBusEvent.height || previewImageReadyBusEvent2.rotation != previewImageReadyBusEvent.rotation) {
            return new PreviewImageReadyBusEvent((byte[]) previewImageReadyBusEvent.imageData.clone(), previewImageReadyBusEvent.width, previewImageReadyBusEvent.height, previewImageReadyBusEvent.rotation);
        } else {
            System.arraycopy(previewImageReadyBusEvent.imageData, 0, previewImageReadyBusEvent2.imageData, 0, previewImageReadyBusEvent.imageData.length);
            previewImageReadyBusEvent2.deleteBitmap();
            return previewImageReadyBusEvent2;
        }
    }

    /* renamed from: e */
    private void m1089e(PreviewImageReadyBusEvent previewImageReadyBusEvent) {
        previewImageReadyBusEvent.state = new C0729l(this.f1240mB, this.f1241wz, this.f1233Cn, this.f1232Cm);
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.camera.aa$a */
    class C0546a implements Runnable {

        /* renamed from: Cw */
        private final PreviewImageReadyBusEvent f1245Cw;

        public C0546a(PreviewImageReadyBusEvent previewImageReadyBusEvent) {
            this.f1245Cw = previewImageReadyBusEvent;
        }

        public void run() {
            try {
                C0543aa.this._bus.post(this.f1245Cw);
            } finally {
                C0543aa.this.m1092kd();
            }
        }
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: c */
    public void mo11421c(C0690ba baVar) {
        this.f1241wz = true;
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: b */
    public void mo11420b(C0676aa aaVar) {
        this.f1241wz = false;
        this.f1240mB = aaVar.f1610II;
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo11419a(LevelChangedEvent levelChangedEvent) {
        this.f1233Cn = levelChangedEvent.pitch;
        this.f1232Cm = levelChangedEvent.roll;
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    public void onSurfaceChanged(SurfaceChangedEvent surfaceChangedEvent) {
        if (surfaceChangedEvent.hasSurface) {
            start();
        } else {
            stop();
        }
    }

    /* renamed from: a */
    private static void m1085a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 18) {
            looper.quitSafely();
        } else {
            looper.quit();
        }
    }
}
