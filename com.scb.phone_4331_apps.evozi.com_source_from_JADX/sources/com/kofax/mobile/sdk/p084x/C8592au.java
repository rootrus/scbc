package com.kofax.mobile.sdk.p084x;

import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.p075e.C8340a;
import com.kofax.mobile.sdk.p083w.C8494ab;
import java.util.Collections;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk.x.au */
public class C8592au implements C8494ab.C8495a {
    /* renamed from: x */
    public List<List<DataField>> mo55396x(C8340a aVar) {
        return Collections.singletonList(aVar.mo55132hx());
    }

    /* renamed from: y */
    public List<List<DataField>> mo55397y(C8340a aVar) {
        return Collections.singletonList(aVar.mo55133hy());
    }

    /* renamed from: b */
    public void mo55395b(C8340a aVar, List<DataField> list, Exception exc) {
        aVar.mo55107e(list);
        aVar.mo55098a(exc);
        if (list != null && list.size() > 0) {
            aVar.mo55141o(true);
        }
    }
}
