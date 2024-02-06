package com.kofax.kmc.kui.uicontrols;

import java.util.EventObject;

public class AutoFocusResultEvent extends EventObject {
    private static final long serialVersionUID = 1;

    /* renamed from: jC */
    private boolean f552jC;

    public AutoFocusResultEvent(Object obj, boolean z) {
        super(obj);
        this.f552jC = z;
    }

    public boolean getSuccess() {
        return this.f552jC;
    }
}
