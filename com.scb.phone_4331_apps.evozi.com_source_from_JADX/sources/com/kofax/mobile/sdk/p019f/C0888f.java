package com.kofax.mobile.sdk.p019f;

import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.IllegalArgumentException;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.impl.event.C0700w;
import com.kofax.mobile.sdk.p020g.C0911j;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.f.f */
public class C0888f {
    private IBus _bus;

    /* renamed from: xh */
    private C0911j f2101xh = new C0911j();

    @HmlPinActivity
    public C0888f(IBus iBus) {
        if (iBus != null) {
            this._bus = iBus;
            iBus.register(this);
            return;
        }
        throw new IllegalArgumentException("bus cannot be null");
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo12253a(C0700w wVar) {
        ErrorInfo errorInfo = wVar.errorInfo;
        if (wVar.f1633IA != null) {
            errorInfo.setErrCause(wVar.f1633IA);
        }
        this.f2101xh.mo12308a(AppStatsEventIDType.APP_STATS_ERROR_LOG_EVENT, errorInfo);
    }
}
