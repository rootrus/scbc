package com.kofax.mobile.sdk._internal.impl.event;

import com.kofax.kmc.kui.uicontrols.LevelnessEvent;
import com.kofax.kmc.kui.uicontrols.LevelnessListener;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;

/* renamed from: com.kofax.mobile.sdk._internal.impl.event.ai */
public final class C0681ai extends C0701x<LevelnessListener> {
    public C0681ai(LevelnessListener levelnessListener) {
        super(levelnessListener, LevelnessListener.class);
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    public final void onLevelnessChanged(LevelChangedEvent levelChangedEvent) {
        try {
            ((LevelnessListener) this.f1635IC).onLevelness(new LevelnessEvent(this, (int) levelChangedEvent.pitch, (int) levelChangedEvent.roll));
        } catch (Exception e) {
            mo11635c(e);
        }
    }
}
