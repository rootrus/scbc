package com.kofax.mobile.sdk._internal.impl.camera;

import com.kofax.kmc.kui.uicontrols.data.Flash;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.camera.C0498d;
import com.kofax.mobile.sdk._internal.impl.event.C7954ak;
import com.kofax.mobile.sdk._internal.impl.event.C7955al;
import com.kofax.mobile.sdk._internal.impl.event.C7964ax;
import com.kofax.mobile.sdk._internal.impl.event.C7965bb;
import com.kofax.mobile.sdk._internal.impl.event.C7967bd;
import com.kofax.mobile.sdk._internal.impl.event.C7974m;
import com.kofax.mobile.sdk._internal.impl.event.C7980y;
import com.kofax.mobile.sdk._internal.impl.event.PreviewImageReadyBusEvent;
import com.kofax.mobile.sdk.p014aj.C0856b;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.d */
public class C0576d {

    /* renamed from: zT */
    private static final int f1314zT = -1;

    /* renamed from: Aa */
    private boolean f1315Aa;

    /* renamed from: Ab */
    private boolean f1316Ab;
    private IBus _bus;

    /* renamed from: ky */
    private int f1317ky;

    /* renamed from: mi */
    private boolean f1318mi;

    /* renamed from: mj */
    private boolean f1319mj;

    /* renamed from: zU */
    private C0498d f1320zU;

    /* renamed from: zV */
    private C0856b f1321zV;

    /* renamed from: zW */
    private int f1322zW;

    /* renamed from: zX */
    private int f1323zX;

    /* renamed from: zY */
    private int f1324zY;

    /* renamed from: zZ */
    private int f1325zZ;

    @HmlPinActivity
    public C0576d(IBus iBus, C0856b bVar) {
        this(iBus, bVar, -1, -1);
    }

    public C0576d(IBus iBus, C0856b bVar, int i, int i2) {
        this.f1320zU = null;
        this.f1323zX = 0;
        this.f1324zY = 0;
        this.f1325zZ = 0;
        this.f1315Aa = false;
        this.f1316Ab = false;
        this.f1319mj = false;
        this.f1318mi = false;
        if (iBus == null) {
            throw new IllegalArgumentException("bus cannot be null");
        } else if (bVar != null) {
            this._bus = iBus;
            this.f1321zV = bVar;
            this.f1317ky = i < 0 ? 0 : i;
            this.f1322zW = i2 < 0 ? 0 : i2;
            this._bus.register(this);
        } else {
            throw new IllegalArgumentException("lumi cannot be null");
        }
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo11458a(C7980y yVar) {
        if (yVar.f3729IG == Flash.AUTOTORCH) {
            this.f1323zX = 0;
            this.f1324zY = 0;
            this.f1325zZ = 0;
            this.f1315Aa = true;
            this.f1319mj = false;
            this.f1318mi = false;
        }
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    public void onCameraParametersProduced(C7974m mVar) {
        this.f1320zU = mVar.f3725Iv;
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo11455a(C7954ak akVar) {
        this.f1317ky = akVar.f3704ky > 0 ? akVar.f3704ky : 0;
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo11457a(C7965bb bbVar) {
        this.f1322zW = bbVar.f3717kz > 0 ? bbVar.f3717kz : 0;
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo11456a(C7955al alVar) {
        boolean z = alVar.f3705Ab;
        this.f1316Ab = z;
        if (z && this.f1319mj) {
            this.f1320zU.mo11148a(Flash.OFF);
            this._bus.post(new C7964ax(this.f1320zU));
            this.f1319mj = false;
            this._bus.post(new C7967bd(this.f1325zZ, this.f1318mi, false));
        } else if (!this.f1316Ab && !this.f1319mj) {
            this.f1323zX = 0;
            this.f1324zY = 0;
            this.f1315Aa = true;
        }
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: c */
    public void mo11459c(PreviewImageReadyBusEvent previewImageReadyBusEvent) {
        if (m1179jh()) {
            int d = this.f1321zV.mo11975d(previewImageReadyBusEvent.imageData, previewImageReadyBusEvent.width, previewImageReadyBusEvent.height);
            this.f1325zZ = d;
            boolean h = m1177h(d);
            this.f1318mi = h;
            if (m1184p(h)) {
                this.f1319mj = m1178jg();
            }
            this._bus.post(new C7967bd(this.f1325zZ, this.f1318mi, this.f1319mj));
        }
    }

    /* renamed from: jg */
    private boolean m1178jg() {
        this.f1320zU.mo11148a(Flash.TORCH);
        this._bus.post(new C7964ax(this.f1320zU));
        this.f1315Aa = false;
        this.f1323zX = -1;
        this.f1324zY = -1;
        return true;
    }

    /* renamed from: p */
    private boolean m1184p(boolean z) {
        return this.f1315Aa && z && m1183jl();
    }

    /* renamed from: h */
    private boolean m1177h(int i) {
        int i2 = 0;
        boolean z = i < this.f1317ky;
        if (z) {
            i2 = this.f1324zY + 1;
        }
        this.f1324zY = i2;
        return z;
    }

    /* renamed from: jh */
    private boolean m1179jh() {
        return !this.f1316Ab && m1180ji() && m1181jj();
    }

    /* renamed from: ji */
    private boolean m1180ji() {
        return this.f1320zU != null;
    }

    /* renamed from: jj */
    private boolean m1181jj() {
        return this.f1315Aa || m1182jk();
    }

    /* renamed from: jk */
    private boolean m1182jk() {
        int i = this.f1322zW;
        if (i > 0) {
            int i2 = this.f1323zX + 1;
            this.f1323zX = i2;
            return i2 % i == 0;
        }
    }

    /* renamed from: jl */
    private boolean m1183jl() {
        return this.f1324zY >= this.f1322zW;
    }
}
