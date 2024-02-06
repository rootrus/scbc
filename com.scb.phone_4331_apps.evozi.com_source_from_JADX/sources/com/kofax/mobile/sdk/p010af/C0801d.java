package com.kofax.mobile.sdk.p010af;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.kmc.kui.uicontrols.Utility;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.dagger.C0519a;
import com.kofax.mobile.sdk._internal.impl.event.C0687ay;
import com.kofax.mobile.sdk._internal.impl.event.C0698u;
import com.kofax.mobile.sdk._internal.impl.event.C0699v;
import com.kofax.mobile.sdk._internal.impl.event.C7978s;
import com.kofax.mobile.sdk._internal.impl.event.C7979t;
import com.kofax.mobile.sdk._internal.impl.event.LevelChangedEvent;
import com.kofax.mobile.sdk._internal.impl.event.SurfaceChangedEvent;
import org.jmrtd.cbeff.ISO781611;
import p040o.FragmentBuilder_BindEasycashReviewFragment;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;
import p040o.HmlPinActivity;

@C0519a
/* renamed from: com.kofax.mobile.sdk.af.d */
public class C0801d implements SensorEventListener {

    /* renamed from: Ue */
    private static final long f1921Ue = 500;

    /* renamed from: Uf */
    private static final float f1922Uf = ((float) Math.toRadians(180.0d));

    /* renamed from: Ug */
    private static final float f1923Ug = ((float) Math.toRadians(90.0d));

    /* renamed from: Uh */
    private static final float f1924Uh = ((float) Math.toRadians(75.0d));

    /* renamed from: Ui */
    private static final float f1925Ui = ((float) Math.toRadians(60.0d));

    /* renamed from: Uj */
    private static final float f1926Uj = ((float) Math.toRadians(30.0d));

    /* renamed from: Uk */
    private static final float f1927Uk = ((float) Math.toRadians(15.0d));

    /* renamed from: Cm */
    private float f1928Cm;

    /* renamed from: Cn */
    private float f1929Cn;

    /* renamed from: UA */
    private float[] f1930UA = new float[16];

    /* renamed from: UB */
    private boolean f1931UB = false;
    /* access modifiers changed from: private */

    /* renamed from: UC */
    public Handler f1932UC;
    /* access modifiers changed from: private */

    /* renamed from: UD */
    public boolean f1933UD = true;

    /* renamed from: UE */
    private boolean f1934UE = false;

    /* renamed from: UF */
    private boolean f1935UF = false;
    /* access modifiers changed from: private */

    /* renamed from: UG */
    public final Runnable f1936UG = new Runnable() {
        public void run() {
            C0801d.this.m1928rd();
            if (C0801d.this.f1941Up) {
                C0801d.this.f1932UC.postDelayed(C0801d.this.f1936UG, C0801d.f1921Ue);
            }
        }
    };

    /* renamed from: Ul */
    private final C0803a f1937Ul = new C0803a();
    /* access modifiers changed from: private */

    /* renamed from: Um */
    public float f1938Um;
    /* access modifiers changed from: private */

    /* renamed from: Un */
    public float f1939Un;

    /* renamed from: Uo */
    private final SensorManager f1940Uo;
    /* access modifiers changed from: private */

    /* renamed from: Up */
    public boolean f1941Up;

    /* renamed from: Uq */
    private long f1942Uq = (System.currentTimeMillis() - f1921Ue);

    /* renamed from: Ur */
    private long f1943Ur = 0;
    /* access modifiers changed from: private */

    /* renamed from: Us */
    public float f1944Us = BitmapDescriptorFactory.HUE_RED;
    /* access modifiers changed from: private */

    /* renamed from: Ut */
    public float f1945Ut = BitmapDescriptorFactory.HUE_RED;
    /* access modifiers changed from: private */

    /* renamed from: Uu */
    public float f1946Uu = 100.0f;
    /* access modifiers changed from: private */

    /* renamed from: Uv */
    public float f1947Uv = BitmapDescriptorFactory.HUE_RED;
    /* access modifiers changed from: private */

    /* renamed from: Uw */
    public float f1948Uw = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: Ux */
    private float[] f1949Ux;

    /* renamed from: Uy */
    private float[] f1950Uy;

    /* renamed from: Uz */
    private float[] f1951Uz = new float[16];
    /* access modifiers changed from: private */
    public final IBus _bus;
    private final Object _lock = new Object();
    /* access modifiers changed from: private */

    /* renamed from: jN */
    public int f1952jN = 0;

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @HmlPinActivity
    public C0801d(IBus iBus, SensorManager sensorManager) {
        this._bus = iBus;
        iBus.register(this.f1937Ul);
        this.f1940Uo = sensorManager;
    }

    /* access modifiers changed from: private */
    public void start() {
        if (!this.f1941Up) {
            synchronized (this._lock) {
                if (!this.f1941Up) {
                    this.f1941Up = true;
                    HandlerThread handlerThread = new HandlerThread("Sensors");
                    handlerThread.start();
                    this.f1932UC = new Handler(handlerThread.getLooper());
                    m1898a(m1921qW());
                    m1902b(m1922qX());
                    this.f1932UC.postDelayed(this.f1936UG, f1921Ue);
                }
            }
        }
    }

    /* renamed from: qW */
    private Sensor m1921qW() {
        Sensor defaultSensor = this.f1940Uo.getDefaultSensor(11);
        if (defaultSensor != null && !m1924qZ()) {
            return defaultSensor;
        }
        this.f1931UB = true;
        return this.f1940Uo.getDefaultSensor(1);
    }

    /* renamed from: qX */
    private Sensor m1922qX() {
        if (this.f1931UB) {
            return this.f1940Uo.getDefaultSensor(2);
        }
        return null;
    }

    /* renamed from: a */
    private void m1898a(Sensor sensor) {
        this.f1935UF = this.f1940Uo.registerListener(this, sensor, m1923qY(), this.f1932UC);
    }

    /* renamed from: b */
    private void m1902b(Sensor sensor) {
        if (this.f1931UB && sensor != null) {
            this.f1934UE = this.f1940Uo.registerListener(this, sensor, 2, this.f1932UC);
        }
    }

    /* renamed from: qY */
    private static int m1923qY() {
        return (!Build.MODEL.equalsIgnoreCase(Utility.NEXUS_5) || Build.VERSION.SDK_INT < 23) ? 0 : 1;
    }

    /* renamed from: qZ */
    private boolean m1924qZ() {
        if (Build.MODEL.equalsIgnoreCase(Utility.GOOGLE_PIXEL_C)) {
            return Build.VERSION.SDK_INT == 24 || Build.VERSION.SDK_INT == 25;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void stop() {
        if (this.f1941Up) {
            synchronized (this._lock) {
                if (this.f1941Up) {
                    this.f1940Uo.unregisterListener(this);
                    m1916ju();
                    this.f1932UC = null;
                    this.f1941Up = false;
                }
            }
        }
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (this.f1933UD) {
            mo11951a(sensorEvent.sensor, sensorEvent.values);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11951a(Sensor sensor, float[] fArr) {
        float[] b = m1904b(sensor, fArr);
        if (b != null) {
            m1908d(m1906c(b));
            m1926rb();
            m1928rd();
            m1927rc();
        }
    }

    /* renamed from: b */
    private float[] m1904b(Sensor sensor, float[] fArr) {
        float[] fArr2;
        if (this.f1931UB && sensor.getType() != 1 && sensor.getType() != 2) {
            return null;
        }
        if (!this.f1931UB && sensor.getType() != 11) {
            return null;
        }
        if (this.f1931UB) {
            int type = sensor.getType();
            if (type == 1) {
                this.f1949Ux = (float[]) fArr.clone();
            } else if (type == 2) {
                this.f1950Uy = (float[]) fArr.clone();
            }
            m1925ra();
            float[] fArr3 = this.f1949Ux;
            if (fArr3 == null || (fArr2 = this.f1950Uy) == null || !SensorManager.getRotationMatrix(this.f1951Uz, (float[]) null, fArr3, fArr2)) {
                return null;
            }
        } else {
            getRotationMatrixFromVector(this.f1951Uz, fArr);
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.f1942Uq;
        this.f1943Ur = j;
        if (j < 100) {
            return null;
        }
        this.f1942Uq = currentTimeMillis;
        return this.f1951Uz;
    }

    /* renamed from: ra */
    private void m1925ra() {
        float[] fArr;
        float[] fArr2;
        if (!this.f1934UE && (fArr2 = this.f1949Ux) != null) {
            this.f1950Uy = m1910e(fArr2);
        } else if (!this.f1935UF && (fArr = this.f1950Uy) != null) {
            float[] fArr3 = {fArr[0], fArr[1], -fArr[2]};
            this.f1949Ux = fArr3;
            this.f1950Uy = m1910e(fArr3);
        }
    }

    /* renamed from: c */
    private float[] m1906c(float[] fArr) {
        int i = this.f1952jN;
        int i2 = 129;
        int i3 = ISO781611.BIOMETRIC_SUBTYPE_TAG;
        if (i == 1) {
            i3 = 129;
            i2 = 2;
        } else if (i != 2) {
            if (i != 3) {
                i3 = 2;
                i2 = 1;
            } else {
                i2 = 130;
                i3 = 1;
            }
        }
        SensorManager.remapCoordinateSystem(fArr, i2, i3, this.f1930UA);
        return this.f1930UA;
    }

    /* renamed from: d */
    private void m1908d(float[] fArr) {
        this.f1929Cn = this.f1944Us;
        this.f1928Cm = this.f1945Ut;
        float[] fArr2 = new float[9];
        SensorManager.getOrientation(fArr, fArr2);
        boolean z = true;
        float f = -fArr2[1];
        this.f1944Us = f;
        this.f1945Ut = fArr2[2];
        float abs = Math.abs(f);
        float abs2 = Math.abs(this.f1945Ut);
        float f2 = f1923Ug;
        if (abs2 > f2) {
            abs2 += f2 - abs2;
        }
        boolean z2 = abs > f1924Uh;
        boolean z3 = abs > f1925Ui;
        boolean z4 = abs < f1926Uj;
        if (abs2 <= f1924Uh) {
            z = false;
        }
        if (z2) {
            this.f1945Ut = BitmapDescriptorFactory.HUE_RED;
        } else if (z3) {
            float f3 = 1.0f - ((abs - f1925Ui) / f1927Uk);
            float f4 = this.f1945Ut;
            float f5 = f1923Ug;
            if (f4 < (-f5)) {
                float f6 = f1922Uf;
                this.f1945Ut = ((f4 + f6) * f3) - f6;
            } else if (f4 > f5) {
                float f7 = f1922Uf;
                this.f1945Ut = ((f4 - f7) * f3) + f7;
            } else {
                this.f1945Ut = f4 * f3;
            }
        } else if (z && z4) {
            this.f1944Us = BitmapDescriptorFactory.HUE_RED;
        }
        this.f1944Us = (float) Math.toDegrees((double) this.f1944Us);
        this.f1945Ut = (float) Math.toDegrees((double) this.f1945Ut);
    }

    /* renamed from: rb */
    private void m1926rb() {
        float f = ((float) this.f1943Ur) / 1000.0f;
        this.f1947Uv = (((float) Math.toRadians((double) this.f1945Ut)) - ((float) Math.toRadians((double) this.f1928Cm))) / f;
        this.f1948Uw = (((float) Math.toRadians((double) this.f1944Us)) - ((float) Math.toRadians((double) this.f1929Cn))) / f;
        this.f1946Uu = (float) Math.round(Math.max(Math.max((double) ((1.0f - (Math.abs(this.f1947Uv) * 2.0f)) * 100.0f), (double) ((1.0f - (Math.abs(this.f1948Uw) * 2.0f)) * 100.0f)), 0.0d));
    }

    /* renamed from: rc */
    private void m1927rc() {
        Handler handler = this.f1932UC;
        if (handler != null) {
            handler.removeCallbacks(this.f1936UG);
            this.f1932UC.postDelayed(this.f1936UG, f1921Ue);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: rd */
    public void m1928rd() {
        this.f1937Ul.mo11962ri();
    }

    /* renamed from: e */
    private float[] m1910e(float[] fArr) {
        char c = Math.abs(fArr[1]) < Math.abs(fArr[0]) ? (char) 1 : 0;
        if (Math.abs(fArr[2]) < Math.abs(fArr[c])) {
            c = 2;
        }
        if (c == 0) {
            return new float[]{0.0f, fArr[2], -fArr[1]};
        } else if (c != 1) {
            return new float[]{fArr[1], -fArr[0], 0.0f};
        } else {
            return new float[]{fArr[2], 0.0f, -fArr[0]};
        }
    }

    /* renamed from: ju */
    private void m1916ju() {
        if (Build.VERSION.SDK_INT >= 18) {
            m1929re();
        } else {
            m1930rf();
        }
    }

    /* renamed from: re */
    private void m1929re() {
        this.f1932UC.getLooper().quitSafely();
    }

    /* renamed from: rf */
    private void m1930rf() {
        this.f1932UC.getLooper().quit();
    }

    /* renamed from: com.kofax.mobile.sdk.af.d$a */
    class C0803a {
        private C0803a() {
        }

        @FragmentBuilder_BindEasycashSalesheetIndexFragment
        /* renamed from: b */
        public void mo11958b(SurfaceChangedEvent surfaceChangedEvent) {
            if (surfaceChangedEvent.hasSurface) {
                C0801d.this.start();
            } else {
                C0801d.this.stop();
            }
        }

        @FragmentBuilder_BindEasycashSalesheetIndexFragment
        /* renamed from: c */
        public void mo11959c(C0699v vVar) {
            int unused = C0801d.this.f1952jN = vVar.rotation;
        }

        @FragmentBuilder_BindEasycashReviewFragment
        /* renamed from: rg */
        public LevelChangedEvent mo11960rg() {
            float g = C0801d.this.f1944Us;
            float h = C0801d.this.f1938Um;
            return new LevelChangedEvent(g - h, C0801d.this.f1945Ut - C0801d.this.f1939Un, C0801d.this.f1948Uw, C0801d.this.f1947Uv);
        }

        @FragmentBuilder_BindEasycashReviewFragment
        /* renamed from: rh */
        public C0687ay mo11961rh() {
            return new C0687ay(Math.round(C0801d.this.f1946Uu));
        }

        @FragmentBuilder_BindEasycashSalesheetIndexFragment
        /* renamed from: a */
        public void mo11955a(C7978s sVar) {
            int i = sVar.f3727Iy;
            if (i < -180 || i > 180) {
                throw new KmcRuntimeException(ErrorInfo.KMC_UI_INVALID_DECLINATION_ARGUMENT);
            }
            float unused = C0801d.this.f1938Um = (float) i;
        }

        @FragmentBuilder_BindEasycashSalesheetIndexFragment
        /* renamed from: a */
        public void mo11956a(C7979t tVar) {
            int i = tVar.f3728Iz;
            if (i < -180 || i > 180) {
                throw new KmcRuntimeException(ErrorInfo.KMC_UI_INVALID_DECLINATION_ARGUMENT);
            }
            float unused = C0801d.this.f1939Un = (float) i;
        }

        @FragmentBuilder_BindEasycashSalesheetIndexFragment
        /* renamed from: a */
        public void mo11957a(C0698u uVar) {
            boolean unused = C0801d.this.f1933UD = uVar.enabled;
        }

        /* renamed from: ri */
        public void mo11962ri() {
            C0801d.this._bus.post(mo11960rg());
            C0801d.this._bus.post(mo11961rh());
        }
    }

    private static void getRotationMatrixFromVector(float[] fArr, float[] fArr2) {
        float f;
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float f2 = fArr4[0];
        float f3 = fArr4[1];
        float f4 = fArr4[2];
        if (fArr4.length == 4) {
            f = fArr4[3];
        } else {
            float f5 = ((1.0f - (f2 * f2)) - (f3 * f3)) - (f4 * f4);
            f = f5 > BitmapDescriptorFactory.HUE_RED ? (float) Math.sqrt((double) f5) : 0.0f;
        }
        float f6 = f2 * 2.0f;
        float f7 = f2 * f6;
        float f8 = f3 * 2.0f;
        float f9 = f8 * f3;
        float f10 = 2.0f * f4;
        float f11 = f10 * f4;
        float f12 = f3 * f6;
        float f13 = f10 * f;
        float f14 = f6 * f4;
        float f15 = f8 * f;
        float f16 = f8 * f4;
        float f17 = f6 * f;
        if (fArr3.length == 9) {
            fArr3[0] = (1.0f - f9) - f11;
            fArr3[1] = f12 - f13;
            fArr3[2] = f14 + f15;
            fArr3[3] = f12 + f13;
            float f18 = 1.0f - f7;
            fArr3[4] = f18 - f11;
            fArr3[5] = f16 - f17;
            fArr3[6] = f14 - f15;
            fArr3[7] = f16 + f17;
            fArr3[8] = f18 - f9;
        } else if (fArr3.length == 16) {
            fArr3[0] = (1.0f - f9) - f11;
            fArr3[1] = f12 - f13;
            fArr3[2] = f14 + f15;
            fArr3[3] = 0.0f;
            fArr3[4] = f12 + f13;
            float f19 = 1.0f - f7;
            fArr3[5] = f19 - f11;
            fArr3[6] = f16 - f17;
            fArr3[7] = 0.0f;
            fArr3[8] = f14 - f15;
            fArr3[9] = f16 + f17;
            fArr3[10] = f19 - f9;
            fArr3[11] = 0.0f;
            fArr3[14] = 0.0f;
            fArr3[13] = 0.0f;
            fArr3[12] = 0.0f;
            fArr3[15] = 1.0f;
        }
    }
}
