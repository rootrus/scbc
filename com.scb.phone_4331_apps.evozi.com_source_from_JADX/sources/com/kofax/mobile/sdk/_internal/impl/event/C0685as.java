package com.kofax.mobile.sdk._internal.impl.event;

import com.kofax.kmc.kui.uicontrols.PreviewCallbackListener;
import com.kofax.kmc.kui.uicontrols.PreviewFrameEvent;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;

/* renamed from: com.kofax.mobile.sdk._internal.impl.event.as */
public final class C0685as extends C0701x<PreviewCallbackListener> {
    public C0685as(PreviewCallbackListener previewCallbackListener) {
        super(previewCallbackListener, PreviewCallbackListener.class);
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public final void mo11626a(RealtimeVideoEvent realtimeVideoEvent) {
        try {
            ((PreviewCallbackListener) this.f1635IC).onPreviewFrame(new PreviewFrameEvent(this, realtimeVideoEvent));
        } catch (Exception e) {
            mo11635c(e);
        }
    }
}
