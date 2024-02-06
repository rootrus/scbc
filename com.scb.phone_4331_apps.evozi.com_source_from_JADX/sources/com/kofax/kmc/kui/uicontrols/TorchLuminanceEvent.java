package com.kofax.kmc.kui.uicontrols;

import java.util.EventObject;

public class TorchLuminanceEvent extends EventObject {
    private static final long serialVersionUID = 1;

    /* renamed from: mh */
    private int f3535mh;

    /* renamed from: mi */
    private boolean f3536mi;

    /* renamed from: mj */
    private boolean f3537mj;

    public TorchLuminanceEvent(Object obj, int i, boolean z, boolean z2) {
        super(obj);
        this.f3535mh = i;
        this.f3536mi = z;
        this.f3537mj = z2;
    }

    public final int getLuminance() {
        return this.f3535mh;
    }

    public final boolean isBelowThreshold() {
        return this.f3536mi;
    }

    public final boolean isTorchOn() {
        return this.f3537mj;
    }
}
