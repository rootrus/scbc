package com.kofax.kmc.kui.uicontrols;

import java.util.EventObject;

public class StabilityDelayEvent extends EventObject {
    private static final long serialVersionUID = 1;

    /* renamed from: mg */
    private int f3534mg;

    public StabilityDelayEvent(Object obj, int i) {
        super(obj);
        this.f3534mg = i;
    }

    public int getStability() {
        return this.f3534mg;
    }
}
