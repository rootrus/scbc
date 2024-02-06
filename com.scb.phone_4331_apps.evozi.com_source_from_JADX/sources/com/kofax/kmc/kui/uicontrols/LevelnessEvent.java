package com.kofax.kmc.kui.uicontrols;

import java.util.EventObject;

public class LevelnessEvent extends EventObject {
    private static final long serialVersionUID = 1;

    /* renamed from: lU */
    private int f3516lU;

    /* renamed from: lV */
    private int f3517lV;

    public LevelnessEvent(Object obj, int i, int i2) {
        super(obj);
        this.f3516lU = i;
        this.f3517lV = i2;
    }

    public int getPitch() {
        return this.f3516lU;
    }

    public int getRoll() {
        return this.f3517lV;
    }
}
