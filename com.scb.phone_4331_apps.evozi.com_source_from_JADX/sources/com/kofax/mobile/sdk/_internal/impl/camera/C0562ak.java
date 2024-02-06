package com.kofax.mobile.sdk._internal.impl.camera;

import com.kofax.kmc.kut.utilities.error.IllegalArgumentException;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.camera.C0509q;
import com.kofax.mobile.sdk._internal.dagger.C0519a;
import com.kofax.mobile.sdk._internal.impl.C0729l;
import com.kofax.mobile.sdk._internal.impl.event.C0676aa;
import com.kofax.mobile.sdk._internal.impl.event.C0690ba;
import com.kofax.mobile.sdk._internal.impl.event.LevelChangedEvent;
import com.kofax.mobile.sdk._internal.impl.event.PreviewImageReadyBusEvent;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;
import p040o.HmlPinActivity;

@C0519a
/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.ak */
public class C0562ak implements C0509q {

    /* renamed from: Cm */
    private float f1283Cm;

    /* renamed from: Cn */
    private float f1284Cn;
    private final IBus _bus;

    /* renamed from: mB */
    private boolean f1285mB;

    /* renamed from: wz */
    private boolean f1286wz;

    @HmlPinActivity
    public C0562ak(IBus iBus) {
        if (iBus != null) {
            this._bus = iBus;
            iBus.register(this);
            return;
        }
        throw new IllegalArgumentException("bus cannot be null");
    }

    public void onPreviewFrame(PreviewImageReadyBusEvent previewImageReadyBusEvent) {
        synchronized (this) {
            m1146e(previewImageReadyBusEvent);
            this._bus.post(previewImageReadyBusEvent);
        }
    }

    /* renamed from: e */
    private void m1146e(PreviewImageReadyBusEvent previewImageReadyBusEvent) {
        previewImageReadyBusEvent.state = new C0729l(this.f1285mB, this.f1286wz, this.f1284Cn, this.f1283Cm);
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: c */
    public void mo11440c(C0690ba baVar) {
        this.f1286wz = true;
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: b */
    public void mo11439b(C0676aa aaVar) {
        this.f1286wz = false;
        this.f1285mB = aaVar.f1610II;
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo11438a(LevelChangedEvent levelChangedEvent) {
        this.f1284Cn = levelChangedEvent.pitch;
        this.f1283Cm = levelChangedEvent.roll;
    }
}
