package com.kofax.mobile.sdk.p084x;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7910e;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.p075e.C8340a;
import com.kofax.mobile.sdk.p083w.C8556r;
import java.util.List;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.x.u */
public class C8630u implements C8556r.C8557a {
    private static final String COUNTRY = "Country";

    /* renamed from: Ra */
    private static final String f5315Ra = "CountryShort";

    /* renamed from: Ls */
    private final C7910e f5316Ls;

    @HmlPinActivity
    public C8630u(C7910e eVar) {
        this.f5316Ls = eVar;
    }

    /* renamed from: k */
    public boolean mo55460k(C8340a aVar) {
        return aVar.mo55128ht().equals(C8340a.f4877vM);
    }

    /* renamed from: l */
    public DataField mo55461l(C8340a aVar) {
        return this.f5316Ls.mo54315a("Country", aVar.mo55134hz());
    }

    /* renamed from: a */
    public void mo55459a(C8340a aVar, DataField dataField) {
        DataField a = this.f5316Ls.mo54315a("Country", aVar.mo55134hz());
        List<DataField> hz = aVar.mo55134hz();
        if (a != null && hz != null) {
            hz.remove(a);
            hz.add(dataField);
        }
    }

    /* renamed from: m */
    public DataField mo55462m(C8340a aVar) {
        return this.f5316Ls.mo54315a(f5315Ra, aVar.mo55134hz());
    }
}
