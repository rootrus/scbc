package com.kofax.mobile.sdk._internal.impl.camera;

import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.camera.C0497c;
import com.kofax.mobile.sdk._internal.camera.C0502h;
import com.kofax.mobile.sdk._internal.camera.C0505k;
import com.kofax.mobile.sdk._internal.camera.C0512u;
import com.kofax.mobile.sdk._internal.camera.IVideoResourceProvider;
import com.kofax.mobile.sdk._internal.impl.event.C0687ay;
import com.kofax.mobile.sdk._internal.impl.event.LevelChangedEvent;
import java.io.File;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.ao */
public class C0570ao implements C0497c, C0505k, C0512u {

    /* renamed from: DA */
    private C0505k f1303DA = null;

    /* renamed from: DB */
    private boolean f1304DB;

    /* renamed from: DK */
    private long f1305DK;

    /* renamed from: DL */
    public File f1306DL = null;

    /* renamed from: Dz */
    private C0497c f1307Dz = null;
    private final IBus _bus;

    @HmlPinActivity
    public C0570ao(IBus iBus, IVideoResourceProvider iVideoResourceProvider) {
        if (iBus != null) {
            this._bus = iBus;
            C0502h fileProvider = iVideoResourceProvider.getFileProvider();
            if (fileProvider != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(fileProvider.mo11182bn().getAbsolutePath());
                sb.append(".data");
                this.f1306DL = new File(sb.toString());
                return;
            }
            throw new IllegalArgumentException("fileProvider cannot be null");
        }
        throw new IllegalArgumentException("bus cannot be null");
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: b */
    public void mo11450b(LevelChangedEvent levelChangedEvent) {
        if (this.f1304DB) {
            m1163ah(C0559ai.m1128a(getTime(), levelChangedEvent));
        }
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo11449a(C0687ay ayVar) {
        if (this.f1304DB) {
            m1163ah(C0559ai.m1129a(getTime(), ayVar));
        }
    }

    /* renamed from: a */
    public void mo11208a(C0497c cVar) {
        this.f1307Dz = cVar;
    }

    /* renamed from: c */
    public void mo11209c(C0505k kVar) {
        this.f1303DA = kVar;
    }

    /* renamed from: j */
    public void mo11147j(boolean z) {
        if (this.f1304DB) {
            m1163ah(C0559ai.m1138b(getTime(), z));
        }
        C0497c cVar = this.f1307Dz;
        if (cVar != null) {
            cVar.mo11147j(z);
        }
    }

    /* renamed from: k */
    public void mo11197k(boolean z) {
        if (this.f1304DB) {
            m1163ah(C0559ai.m1130a(getTime(), z));
        }
        C0505k kVar = this.f1303DA;
        if (kVar != null) {
            kVar.mo11197k(z);
        }
    }

    public void start() {
        if (!this.f1304DB) {
            this.f1305DK = System.currentTimeMillis();
            this.f1304DB = true;
            this._bus.register(this);
        }
    }

    /* renamed from: ah */
    private void m1163ah(String str) {
        C0561aj.m1140a(this.f1306DL, str);
    }

    private long getTime() {
        return System.currentTimeMillis() - this.f1305DK;
    }

    public void stop() {
        if (this.f1304DB) {
            this.f1304DB = false;
            this._bus.unregister(this);
        }
    }
}
