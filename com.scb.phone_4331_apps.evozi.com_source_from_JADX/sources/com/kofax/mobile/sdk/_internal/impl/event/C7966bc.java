package com.kofax.mobile.sdk._internal.impl.event;

import com.kofax.kmc.kui.uicontrols.TorchLuminanceEvent;
import com.kofax.kmc.kui.uicontrols.TorchLuminanceListener;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;

/* renamed from: com.kofax.mobile.sdk._internal.impl.event.bc */
public final class C7966bc extends C0701x<TorchLuminanceListener> {
    public C7966bc(TorchLuminanceListener torchLuminanceListener) {
        super(torchLuminanceListener, TorchLuminanceListener.class);
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public final void mo54365a(C7967bd bdVar) {
        try {
            ((TorchLuminanceListener) this.f1635IC).onTorchLuminance(new TorchLuminanceEvent(this, bdVar.f3718mh, bdVar.f3719mi, bdVar.f3720mj));
        } catch (Exception e) {
            mo11635c(e);
        }
    }
}
