package com.kofax.mobile.sdk._internal.impl.event;

import com.kofax.kmc.kui.uicontrols.AutoFocusResultEvent;
import com.kofax.kmc.kui.uicontrols.AutoFocusResultListener;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;

/* renamed from: com.kofax.mobile.sdk._internal.impl.event.e */
public final class C0692e extends C0701x<AutoFocusResultListener> {

    /* renamed from: Ir */
    private boolean f1629Ir = false;

    public C0692e(AutoFocusResultListener autoFocusResultListener) {
        super(autoFocusResultListener, AutoFocusResultListener.class);
        ((AutoFocusResultListener) this.f1635IC).onAutoFocus(new AutoFocusResultEvent(this, false));
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public final void mo11631a(C0676aa aaVar) {
        if (this.f1629Ir != aaVar.f1610II) {
            try {
                ((AutoFocusResultListener) this.f1635IC).onAutoFocus(new AutoFocusResultEvent(this, aaVar.f1610II));
            } catch (Exception e) {
                mo11635c(e);
            } catch (Throwable th) {
                this.f1629Ir = aaVar.f1610II;
                throw th;
            }
            this.f1629Ir = aaVar.f1610II;
        }
    }
}
