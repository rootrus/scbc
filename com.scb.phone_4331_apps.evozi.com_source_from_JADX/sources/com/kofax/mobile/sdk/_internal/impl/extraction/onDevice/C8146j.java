package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7910e;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.j */
public class C8146j implements C7910e {
    /* renamed from: a */
    public DataField mo54315a(String str, List<DataField> list) {
        if (list == null) {
            return null;
        }
        for (DataField next : list) {
            if (next != null && str.equals(next.getName())) {
                return next;
            }
        }
        return null;
    }
}
