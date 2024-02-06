package com.kofax.mobile.sdk.p019f;

import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk.p020g.C0901f;
import com.kofax.mobile.sdk.p020g.C8390b;
import com.kofax.mobile.sdk.p027r.C0990b;
import com.kofax.mobile.sdk.p027r.C0991c;
import com.kofax.mobile.sdk.p027r.C8466a;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.f.h */
public class C0889h {
    private IBus _bus;

    /* renamed from: xi */
    private C0901f f2102xi = new C0901f();

    @HmlPinActivity
    public C0889h(IBus iBus) {
        this._bus = iBus;
        iBus.register(this);
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo12255a(C0990b bVar) {
        this.f2102xi.mo12300a(AppStatsEventIDType.APP_STATS_IMAGE_CREATED, new C8390b(bVar.image, bVar.f2383rQ));
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo12256a(C0991c cVar) {
        this.f2102xi.mo12300a(AppStatsEventIDType.APP_STATS_IMAGE_ADD_TO_DOCUMENT, new C8390b(cVar.image, cVar.f2384rQ));
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo12254a(C8466a aVar) {
        this.f2102xi.mo12300a(AppStatsEventIDType.APP_STATS_IMAGE_ADD_TO_DOCUMENT, new C8390b(aVar.image, aVar.f5039Jl));
    }
}
