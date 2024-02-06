package com.kofax.mobile.sdk._internal.impl.event;

import com.kofax.kmc.kui.uicontrols.PageDetectionEvent;
import com.kofax.kmc.kui.uicontrols.PageDetectionListener;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;

/* renamed from: com.kofax.mobile.sdk._internal.impl.event.ao */
public final class C7958ao extends C0701x<PageDetectionListener> {
    public C7958ao(PageDetectionListener pageDetectionListener) {
        super(pageDetectionListener, PageDetectionListener.class);
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: b */
    public final void mo54364b(C7959ap apVar) {
        try {
            if (apVar.f3715Jf) {
                ((PageDetectionListener) this.f1635IC).pageDetected(new PageDetectionEvent((Object) this, apVar.f3713Jd, apVar.f3714Je));
            }
        } catch (Exception e) {
            mo11635c(e);
        }
    }
}
