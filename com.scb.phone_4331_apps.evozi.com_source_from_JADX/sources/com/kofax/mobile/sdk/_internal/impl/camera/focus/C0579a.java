package com.kofax.mobile.sdk._internal.impl.camera.focus;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.kofax.kmc.kui.uicontrols.Utility;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.camera.C0496b;
import com.kofax.mobile.sdk._internal.camera.C0499e;
import com.kofax.mobile.sdk._internal.camera.C0503i;
import com.kofax.mobile.sdk._internal.camera.C0504j;
import com.kofax.mobile.sdk._internal.camera.C0505k;
import com.kofax.mobile.sdk._internal.impl.event.C0676aa;
import com.kofax.mobile.sdk._internal.impl.event.C0687ay;
import com.kofax.mobile.sdk._internal.impl.event.C0690ba;
import com.kofax.mobile.sdk._internal.impl.event.C0696n;
import com.kofax.mobile.sdk._internal.impl.event.C7964ax;
import com.kofax.mobile.sdk._internal.impl.event.ImageCapturedBusEvent;
import java.util.HashSet;
import java.util.Set;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.focus.a */
public class C0579a implements C0503i {

    /* renamed from: DP */
    private static final long f1357DP = 5000;

    /* renamed from: DQ */
    static final int f1358DQ = 75;
    @HmlPinActivity

    /* renamed from: DR */
    C0504j f1359DR;

    /* renamed from: DS */
    private boolean f1360DS;
    /* access modifiers changed from: private */

    /* renamed from: DT */
    public long f1361DT = System.currentTimeMillis();
    /* access modifiers changed from: private */

    /* renamed from: DU */
    public Handler f1362DU;
    /* access modifiers changed from: private */

    /* renamed from: DV */
    public boolean f1363DV = false;
    /* access modifiers changed from: private */

    /* renamed from: DW */
    public final Set<C0505k> f1364DW = new HashSet();

    /* renamed from: DX */
    private final C0581a f1365DX = new C0581a();
    @HmlPinActivity
    IBus _bus;
    /* access modifiers changed from: private */

    /* renamed from: wz */
    public boolean f1366wz = false;

    @HmlPinActivity
    public C0579a(IBus iBus) {
        if (iBus != null) {
            this._bus = iBus;
            return;
        }
        throw new IllegalArgumentException("bus cannot be null");
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: b */
    public void mo11486b(C0687ay ayVar) {
        boolean z = ayVar.stability > 75;
        if (!this.f1360DS && z) {
            m1234jC();
        } else if (this.f1360DS && !z) {
            this._bus.post(new C0676aa(false));
        }
        this.f1360DS = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: jC */
    public void m1234jC() {
        if (!this.f1366wz) {
            this.f1366wz = true;
            this.f1359DR.mo11195bq();
            this._bus.post(new C0676aa(false));
            this._bus.post(new C0690ba(new C0505k() {
                /* renamed from: k */
                public void mo11197k(boolean z) {
                    boolean unused = C0579a.this.f1366wz = false;
                    for (C0505k k : C0579a.this.f1364DW) {
                        k.mo11197k(z);
                    }
                    C0579a.this.f1364DW.clear();
                    if (z) {
                        C0579a.this._bus.post(new C0676aa(true));
                    } else {
                        C0579a.this.m1234jC();
                    }
                }
            }));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ku */
    public void m1235ku() {
        if (this.f1366wz) {
            this.f1366wz = false;
            this._bus.post(new C0696n(true));
        }
        m1234jC();
    }

    /* renamed from: b */
    public void mo11192b(C0505k kVar) {
        this.f1364DW.add(kVar);
        m1234jC();
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo11485a(ImageCapturedBusEvent imageCapturedBusEvent) {
        if (Build.MODEL.equalsIgnoreCase(Utility.MOTO_G_MODEL)) {
            this._bus.post(new C0696n());
        }
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.camera.focus.a$a */
    class C0581a implements Runnable {

        /* renamed from: DZ */
        long f1369DZ;

        /* renamed from: Ea */
        boolean f1370Ea;

        private C0581a() {
            this.f1369DZ = 0;
            this.f1370Ea = false;
        }

        public void run() {
            Handler c = C0579a.this.f1362DU;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis > C0579a.this.f1361DT + C0579a.f1357DP) {
                C0579a.this.m1234jC();
                long unused = C0579a.this.f1361DT = currentTimeMillis;
            }
            if (C0579a.this.f1366wz && !this.f1370Ea) {
                long unused2 = C0579a.this.f1361DT = currentTimeMillis;
                this.f1369DZ = currentTimeMillis + C0579a.f1357DP;
                this.f1370Ea = true;
            } else if (!C0579a.this.f1366wz) {
                this.f1370Ea = false;
            } else if (currentTimeMillis > this.f1369DZ) {
                this.f1370Ea = false;
                C0579a.this.m1235ku();
            }
            if (c != null && C0579a.this.f1363DV) {
                c.postDelayed(this, 300);
            }
        }
    }

    /* renamed from: a */
    public void mo11191a(C0499e eVar) {
        this.f1363DV = true;
        this._bus.register(this);
        eVar.mo11149a(C0496b.AUTO);
        this.f1359DR.mo11194a(eVar);
        this.f1359DR.mo11195bq();
        this.f1362DU = new Handler(Looper.getMainLooper());
        this.f1365DX.f1369DZ = 0;
        this.f1365DX.f1370Ea = false;
        this.f1362DU.post(this.f1365DX);
        this._bus.post(new C7964ax(eVar));
        m1235ku();
    }

    public void stop() {
        this.f1363DV = false;
        Handler handler = this.f1362DU;
        if (handler != null) {
            handler.removeCallbacks(this.f1365DX);
        }
        C0504j jVar = this.f1359DR;
        if (jVar != null) {
            jVar.stop();
        }
        this._bus.unregister(this);
    }
}
