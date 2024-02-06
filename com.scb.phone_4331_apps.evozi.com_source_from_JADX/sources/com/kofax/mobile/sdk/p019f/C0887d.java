package com.kofax.mobile.sdk.p019f;

import com.kofax.kmc.klo.logistics.data.Document;
import com.kofax.kmc.klo.logistics.data.Field;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk.p020g.C0895d;
import com.kofax.mobile.sdk.p020g.C0898e;
import com.kofax.mobile.sdk.p079q.C8464a;
import com.kofax.mobile.sdk.p079q.C8465b;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.f.d */
public class C0887d {
    private IBus _bus;

    /* renamed from: xf */
    private C0895d f2099xf = new C0895d();

    /* renamed from: xg */
    private C0898e f2100xg = new C0898e();

    @HmlPinActivity
    public C0887d(IBus iBus) {
        this._bus = iBus;
        iBus.register(this);
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo12251a(C8464a aVar) {
        Document document = aVar.f5035Jk;
        this.f2099xf.mo12297a(AppStatsEventIDType.APP_STATS_DOCUMENT_CREATE_EVENT, document.getDocumentId(), document.getDocumentType().getTypeName());
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo12252a(C8465b bVar) {
        Field field = bVar.f5037Jm;
        C0898e eVar = this.f2100xg;
        AppStatsEventIDType appStatsEventIDType = AppStatsEventIDType.APP_STATS_FIELD_CHANGE_EVENT;
        String str = bVar.f5036Jl;
        String str2 = bVar.f5038Jn;
        String value = field.getValue();
        String name = field.getFieldType().getName();
        boolean booleanValue = field.isValid().booleanValue();
        eVar.mo12299a(appStatsEventIDType, str, str2, value, name, booleanValue ? 1 : 0, field.getErrorDescription());
    }
}
