package com.kofax.mobile.sdk.p084x;

import com.kofax.kmc.ken.engines.data.BarCodeResult;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.p073c.C8297a;
import com.kofax.mobile.sdk.p075e.C8340a;
import com.kofax.mobile.sdk.p083w.C8540h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk.x.g */
public class C8615g implements C8540h.C8542a {
    /* renamed from: e */
    public String mo55448e(C8340a aVar) {
        return aVar.mo55128ht();
    }

    /* renamed from: f */
    public String mo55449f(C8340a aVar) {
        C8297a hw = aVar.mo55131hw();
        if (hw == null) {
            return null;
        }
        return hw.getClassId();
    }

    /* renamed from: h */
    public List<BarCodeResult> mo55450h(C8340a aVar) {
        List<BarCodeResult> hC = aVar.mo55118hC();
        if (hC != null) {
            return hC;
        }
        return new ArrayList();
    }

    /* renamed from: a */
    public void mo55447a(C8340a aVar, List<List<DataField>> list, List<Exception> list2) {
        aVar.mo55108f(list);
        if (list2 == null || (list2.size() == 0 && list != null)) {
            aVar.mo55140n(true);
        }
        for (Exception b : list2) {
            aVar.mo55102b(b);
        }
    }
}
