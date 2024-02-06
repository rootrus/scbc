package com.kofax.mobile.sdk._internal.impl.camera.focus;

import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.camera.C0499e;
import com.kofax.mobile.sdk._internal.camera.C0503i;
import com.kofax.mobile.sdk._internal.camera.C0505k;
import com.kofax.mobile.sdk._internal.impl.event.C0676aa;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.focus.d */
public class C0584d implements C0503i {
    private final IBus _bus;

    public void stop() {
    }

    @HmlPinActivity
    public C0584d(IBus iBus) {
        if (iBus != null) {
            this._bus = iBus;
            return;
        }
        throw new IllegalArgumentException("bus cannot be null");
    }

    /* renamed from: a */
    public void mo11191a(C0499e eVar) {
        this._bus.post(new C0676aa(true));
    }

    /* renamed from: b */
    public void mo11192b(C0505k kVar) {
        this._bus.post(new C0676aa(true));
        kVar.mo11197k(true);
    }
}
