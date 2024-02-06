package com.kofax.mobile.sdk._internal.impl.camera.focus;

import android.os.Handler;
import android.os.Looper;
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
import com.kofax.mobile.sdk._internal.impl.event.C7951ab;
import com.kofax.mobile.sdk._internal.impl.event.C7964ax;
import com.kofax.mobile.sdk._internal.impl.event.C7981z;
import java.util.HashSet;
import java.util.Set;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.focus.f */
public class C0586f implements C0503i {

    /* renamed from: Ed */
    private static final int f1376Ed = 2000;

    /* renamed from: Eg */
    private static final Object f1377Eg = new Object();
    @HmlPinActivity

    /* renamed from: DR */
    C0504j f1378DR;
    /* access modifiers changed from: private */

    /* renamed from: DS */
    public boolean f1379DS;
    /* access modifiers changed from: private */

    /* renamed from: DV */
    public boolean f1380DV = false;

    /* renamed from: DW */
    private final Set<C0505k> f1381DW = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: Ee */
    public int f1382Ee = 2000;
    /* access modifiers changed from: private */

    /* renamed from: Ef */
    public long f1383Ef = (System.currentTimeMillis() + ((long) this.f1382Ee));

    /* renamed from: Eh */
    private final C0588a f1384Eh = new C0588a();

    /* renamed from: Ei */
    private final Runnable f1385Ei = new Runnable() {
        public void run() {
            if (System.currentTimeMillis() > C0586f.this.f1383Ef) {
                C0586f.this.m1265t(true);
            }
            if (C0586f.this.f1380DV) {
                C0586f.this.f1386wO.postDelayed(this, (long) (C0586f.this.f1382Ee / 2));
            }
        }
    };
    private IBus _bus;
    /* access modifiers changed from: private */

    /* renamed from: wO */
    public final Handler f1386wO = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: wz */
    public boolean f1387wz = false;

    @HmlPinActivity
    public C0586f(IBus iBus) {
        if (iBus != null) {
            this._bus = iBus;
            return;
        }
        throw new IllegalArgumentException("bus cannot be null");
    }

    /* renamed from: a */
    public void mo11191a(C0499e eVar) {
        synchronized (f1377Eg) {
            this.f1380DV = true;
            this._bus.register(this.f1384Eh);
            this.f1386wO.postDelayed(this.f1385Ei, (long) this.f1382Ee);
            this.f1378DR.mo11194a(eVar);
            this._bus.post(new C7981z(true));
            this.f1378DR.mo11195bq();
            eVar.mo11149a(C0496b.AUTO);
            this._bus.post(new C7964ax(eVar));
            m1264ku();
        }
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.camera.focus.f$a */
    class C0588a {
        private C0588a() {
        }

        @FragmentBuilder_BindEasycashSalesheetIndexFragment
        /* renamed from: a */
        public void mo11493a(C7951ab abVar) {
            int unused = C0586f.this.f1382Ee = abVar.f3701IJ;
        }

        @FragmentBuilder_BindEasycashSalesheetIndexFragment
        /* renamed from: b */
        public void mo11494b(C0687ay ayVar) {
            boolean z = ayVar.stability > 75;
            if (!z) {
                try {
                    if (C0586f.this.f1379DS) {
                        long unused = C0586f.this.f1383Ef = Long.MAX_VALUE;
                        C0586f.this.m1265t(false);
                    }
                } finally {
                    boolean unused2 = C0586f.this.f1379DS = z;
                }
            }
            if (!z || C0586f.this.f1379DS) {
                if (z && System.currentTimeMillis() - C0586f.this.f1383Ef > ((long) C0586f.this.f1382Ee)) {
                    C0586f.this.m1264ku();
                }
            }
            C0586f.this.m1263jC();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: jC */
    public void m1263jC() {
        this.f1383Ef = System.currentTimeMillis() + ((long) this.f1382Ee);
        if (!this.f1387wz) {
            this.f1387wz = true;
            this.f1378DR.mo11195bq();
            this._bus.post(new C0690ba(new C0505k() {
                /* renamed from: k */
                public void mo11197k(boolean z) {
                    boolean unused = C0586f.this.f1387wz = false;
                }
            }));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ku */
    public void m1264ku() {
        if (this.f1387wz) {
            this.f1387wz = false;
            this._bus.post(new C0696n(true));
        }
        m1263jC();
    }

    /* renamed from: b */
    public void mo11192b(C0505k kVar) {
        this.f1381DW.add(kVar);
        m1264ku();
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m1265t(boolean z) {
        for (C0505k k : this.f1381DW) {
            k.mo11197k(z);
        }
        this.f1381DW.clear();
        this._bus.post(new C0676aa(z));
    }

    public void stop() {
        synchronized (f1377Eg) {
            this.f1380DV = false;
            this.f1386wO.removeCallbacks(this.f1385Ei);
            if (this.f1378DR != null) {
                this.f1378DR.stop();
            }
            this._bus.unregister(this.f1384Eh);
        }
    }
}
