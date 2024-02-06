package com.kofax.mobile.sdk.p084x;

import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.p075e.C8340a;
import com.kofax.mobile.sdk.p083w.C8494ab;
import java.util.Collections;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk.x.as */
public class C8590as implements C8494ab.C8495a {
    /* renamed from: x */
    public List<List<DataField>> mo55396x(C8340a aVar) {
        return Collections.singletonList(aVar.mo55117hB());
    }

    /* renamed from: y */
    public List<List<DataField>> mo55397y(C8340a aVar) {
        return Collections.singletonList(aVar.mo55122hG());
    }

    /* renamed from: b */
    public void mo55395b(C8340a aVar, List<DataField> list, Exception exc) {
        aVar.mo55106d(list);
        aVar.mo55098a(exc);
    }
}
