package com.kofax.kmc.kui.uicontrols;

import java.util.EventObject;

public class CameraInitializationFailedEvent extends EventObject {

    /* renamed from: kk */
    private final Exception f3498kk;

    public CameraInitializationFailedEvent(Object obj, Exception exc) {
        super(obj);
        if (exc != null) {
            this.f3498kk = exc;
            return;
        }
        throw null;
    }

    public Exception getCause() {
        return this.f3498kk;
    }
}
