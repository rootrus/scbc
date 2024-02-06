package com.kofax.mobile.sdk._internal.impl.camera.focus;

import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.camera.C0496b;
import com.kofax.mobile.sdk._internal.camera.C0499e;
import com.kofax.mobile.sdk._internal.camera.C0503i;
import com.kofax.mobile.sdk._internal.camera.C0505k;
import com.kofax.mobile.sdk._internal.impl.event.C0676aa;
import com.kofax.mobile.sdk._internal.impl.event.C0687ay;
import com.kofax.mobile.sdk._internal.impl.event.C0690ba;
import com.kofax.mobile.sdk._internal.impl.event.C0696n;
import com.kofax.mobile.sdk._internal.impl.event.C7964ax;
import com.kofax.mobile.sdk._internal.impl.event.SurfaceChangedEvent;
import java.util.HashSet;
import java.util.Set;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.focus.p */
public class C0602p implements C0503i {

    /* renamed from: DS */
    private boolean f1435DS;
    /* access modifiers changed from: private */

    /* renamed from: ET */
    public boolean f1436ET = false;

    /* renamed from: EU */
    private final C0604a f1437EU = new C0604a();
    @HmlPinActivity
    IBus _bus;
    /* access modifiers changed from: private */

    /* renamed from: wz */
    public boolean f1438wz = false;

    @HmlPinActivity
    public C0602p(IBus iBus) {
        if (iBus != null) {
            this._bus = iBus;
            return;
        }
        throw new IllegalArgumentException("bus cannot be null");
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: b */
    public void mo11515b(C0687ay ayVar) {
        boolean z = ayVar.stability > 75;
        if (!this.f1435DS && z) {
            m1312jC();
        } else if (this.f1435DS && !z) {
            this._bus.post(new C0676aa(false));
        }
        this.f1435DS = z;
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.camera.focus.p$a */
    class C0604a implements C0505k {

        /* renamed from: DW */
        private final Set<C0505k> f1439DW;

        private C0604a() {
            this.f1439DW = new HashSet();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo11517e(C0505k kVar) {
            this.f1439DW.add(kVar);
        }

        /* renamed from: k */
        public void mo11197k(boolean z) {
            boolean unused = C0602p.this.f1438wz = false;
            C0602p.this._bus.post(new C0676aa(z));
            for (C0505k k : this.f1439DW) {
                k.mo11197k(z);
            }
            this.f1439DW.clear();
            if (!C0602p.this.f1436ET) {
                C0602p.this.m1312jC();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: jC */
    public void m1312jC() {
        if (!this.f1438wz) {
            this.f1438wz = true;
            this._bus.post(new C0690ba(this.f1437EU));
        }
    }

    /* renamed from: b */
    public void mo11192b(C0505k kVar) {
        this.f1437EU.mo11517e(kVar);
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    public void onSurfaceChanged(SurfaceChangedEvent surfaceChangedEvent) {
        if (surfaceChangedEvent.hasSurface) {
            m1312jC();
        } else {
            this.f1436ET = true;
        }
    }

    /* renamed from: a */
    public void mo11191a(C0499e eVar) {
        this._bus.register(this);
        eVar.mo11149a(C0496b.AUTO);
        this._bus.post(new C7964ax(eVar));
        this._bus.post(new C0696n());
        this._bus.post(new C0690ba());
    }

    public void stop() {
        this._bus.unregister(this);
    }
}
