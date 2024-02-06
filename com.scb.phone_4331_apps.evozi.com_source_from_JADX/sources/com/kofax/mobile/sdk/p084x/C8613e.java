package com.kofax.mobile.sdk.p084x;

import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.p073c.C8297a;
import com.kofax.mobile.sdk.p075e.C8340a;
import com.kofax.mobile.sdk.p083w.C8537g;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk.x.e */
public class C8613e implements C8537g.C8539a {
    /* renamed from: e */
    public String mo55443e(C8340a aVar) {
        return aVar.mo55128ht();
    }

    /* renamed from: f */
    public String mo55444f(C8340a aVar) {
        C8297a hw = aVar.mo55131hw();
        if (hw != null) {
            return hw.getClassId();
        }
        return null;
    }

    /* renamed from: g */
    public Image mo55445g(C8340a aVar) {
        return aVar.mo55127hs().originalImage;
    }

    /* renamed from: a */
    public void mo55442a(C8340a aVar, List<DataField> list, Exception exc) {
        aVar.mo55135i(list);
        aVar.mo55102b(exc);
        if (exc == null && list != null) {
            aVar.mo55140n(true);
        }
    }
}
