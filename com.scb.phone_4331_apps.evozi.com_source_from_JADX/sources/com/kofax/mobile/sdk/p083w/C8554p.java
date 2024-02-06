package com.kofax.mobile.sdk.p083w;

import bolts.CancellationToken;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7910e;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.extract.p018id.IdRegion;
import com.kofax.mobile.sdk.p075e.C8340a;
import java.util.List;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.w.p */
public class C8554p extends C8500ae {

    /* renamed from: Ls */
    private final C7910e f5238Ls;

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo55143a(Object obj, CancellationToken cancellationToken) {
        super.mo55143a(obj, cancellationToken);
    }

    @HmlPinActivity
    public C8554p(C7910e eVar) {
        this.f5238Ls = eVar;
    }

    /* renamed from: a */
    public void mo55390a(C8340a aVar) {
        List<DataField> hz = aVar.mo55134hz();
        String ht = aVar.mo55128ht();
        if (hz != null && ht.equals(IdRegion.US.getRegionName())) {
            DataField a = this.f5238Ls.mo54315a(C8340a.f4879vO, hz);
            DataField a2 = this.f5238Ls.mo54315a(C8340a.f4878vN, hz);
            if (a2 != null && a != null) {
                hz.remove(a);
                hz.add(new DataField(a.getName(), a2.getObject(), a2.getConfidence(), a.getLocation()));
            }
        }
    }
}
