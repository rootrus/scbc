package com.kofax.mobile.sdk.p083w;

import bolts.CancellationToken;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7910e;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.p073c.C8297a;
import com.kofax.mobile.sdk.p075e.C8340a;
import java.util.List;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.w.am */
public class C8513am extends C8500ae {

    /* renamed from: Qw */
    private static final String f5174Qw = "India (IND) Aadhar Card - Back";

    /* renamed from: Qx */
    private static final String f5175Qx = "City";

    /* renamed from: Ls */
    private final C7910e f5176Ls;

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo55143a(Object obj, CancellationToken cancellationToken) {
        super.mo55143a(obj, cancellationToken);
    }

    @HmlPinActivity
    public C8513am(C7910e eVar) {
        this.f5176Ls = eVar;
    }

    /* renamed from: a */
    public void mo55390a(C8340a aVar) {
        C8297a hw = aVar.mo55131hw();
        if (f5174Qw.equals(hw != null ? hw.getClassId() : null)) {
            m5242a(aVar.mo55133hy(), f5175Qx, this.f5176Ls);
        }
    }

    /* renamed from: a */
    private static void m5242a(List<DataField> list, String str, C7910e eVar) {
        DataField a;
        if (list != null && (a = eVar.mo54315a(str, list)) != null) {
            list.remove(a);
        }
    }
}
