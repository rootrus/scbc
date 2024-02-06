package com.kofax.mobile.sdk._internal.impl.event;

import com.kofax.kmc.kui.uicontrols.StabilityDelayEvent;
import com.kofax.kmc.kui.uicontrols.StabilityDelayListener;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;

/* renamed from: com.kofax.mobile.sdk._internal.impl.event.az */
public final class C0688az extends C0701x<StabilityDelayListener> {
    public C0688az(StabilityDelayListener stabilityDelayListener) {
        super(stabilityDelayListener, StabilityDelayListener.class);
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: b */
    public final void mo11628b(C0687ay ayVar) {
        try {
            ((StabilityDelayListener) this.f1635IC).onStabilityDelay(new StabilityDelayEvent(this, ayVar.stability));
        } catch (Exception e) {
            mo11635c(e);
        }
    }
}
