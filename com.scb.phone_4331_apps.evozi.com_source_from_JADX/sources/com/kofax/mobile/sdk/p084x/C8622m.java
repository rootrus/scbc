package com.kofax.mobile.sdk.p084x;

import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.extract.p018id.IdRegion;
import com.kofax.mobile.sdk.p073c.C8297a;
import com.kofax.mobile.sdk.p075e.C8340a;
import com.kofax.mobile.sdk.p083w.C8496ac;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk.x.m */
public class C8622m implements C8496ac.C8498a {
    /* renamed from: e */
    public String mo55400e(C8340a aVar) {
        return aVar.mo55128ht();
    }

    /* renamed from: f */
    public String mo55401f(C8340a aVar) {
        C8297a hw = aVar.mo55131hw();
        if (hw != null) {
            return hw.getClassId();
        }
        return null;
    }

    /* renamed from: g */
    public Image mo55402g(C8340a aVar) {
        if (aVar.mo55128ht().equals(IdRegion.US.getRegionName())) {
            return null;
        }
        return aVar.mo55127hs().f5066NW;
    }

    /* renamed from: c */
    public void mo55399c(C8340a aVar, List<DataField> list, Exception exc) {
        aVar.mo55104c(list);
        aVar.mo55102b(exc);
        aVar.mo55141o((aVar.mo55127hs().originalImage == null || list == null || list.size() <= 0) ? false : true);
    }
}
