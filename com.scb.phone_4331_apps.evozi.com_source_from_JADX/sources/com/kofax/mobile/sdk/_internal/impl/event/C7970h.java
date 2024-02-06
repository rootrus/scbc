package com.kofax.mobile.sdk._internal.impl.event;

import com.kofax.kmc.kui.uicontrols.CameraInitializationFailedEvent;
import com.kofax.kmc.kui.uicontrols.CameraInitializationFailedListener;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;

/* renamed from: com.kofax.mobile.sdk._internal.impl.event.h */
public final class C7970h extends C0701x<CameraInitializationFailedListener> {
    public C7970h(CameraInitializationFailedListener cameraInitializationFailedListener) {
        super(cameraInitializationFailedListener, CameraInitializationFailedListener.class);
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public final void mo54366a(C0694g gVar) {
        try {
            ((CameraInitializationFailedListener) this.f1635IC).onCameraInitializationFailed(new CameraInitializationFailedEvent(this, gVar.getCause()));
        } catch (Exception e) {
            mo11635c(e);
        }
    }
}
