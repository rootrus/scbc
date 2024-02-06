package com.kofax.mobile.sdk._internal.impl.event;

import com.kofax.kmc.kui.uicontrols.CameraInitializationEvent;
import com.kofax.kmc.kui.uicontrols.CameraInitializationListener;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;

/* renamed from: com.kofax.mobile.sdk._internal.impl.event.f */
public final class C0693f extends C0701x<CameraInitializationListener> {
    public C0693f(CameraInitializationListener cameraInitializationListener) {
        super(cameraInitializationListener, CameraInitializationListener.class);
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    public final void onCameraInitialized(CameraInitializationEvent cameraInitializationEvent) {
        try {
            ((CameraInitializationListener) this.f1635IC).onCameraInitialized(cameraInitializationEvent);
        } catch (Exception e) {
            mo11635c(e);
        }
    }
}
