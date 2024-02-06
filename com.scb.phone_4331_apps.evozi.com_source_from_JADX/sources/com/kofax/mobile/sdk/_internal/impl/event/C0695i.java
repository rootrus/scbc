package com.kofax.mobile.sdk._internal.impl.event;

import android.hardware.Camera;
import com.kofax.kmc.kui.uicontrols.CameraInitializationEvent;

/* renamed from: com.kofax.mobile.sdk._internal.impl.event.i */
public final class C0695i extends CameraInitializationEvent {
    private static final long serialVersionUID = 1;

    public C0695i(Object obj, Camera.Size size, CameraInitializationEvent.CameraInitStatus cameraInitStatus) {
        super(obj, size, cameraInitStatus);
    }
}
