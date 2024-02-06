package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7910e;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.p074d.C8336a;
import java.util.List;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.p */
public class C8151p implements C8336a {

    /* renamed from: Ls */
    private final C7910e f4172Ls;

    @HmlPinActivity
    public C8151p(C7910e eVar) {
        this.f4172Ls = eVar;
    }

    /* renamed from: c */
    public void mo54540c(String str, List<DataField> list) {
        DataField a;
        if (list != null && (a = this.f4172Ls.mo54315a(str, list)) != null && a.getObject() != null) {
            list.remove(a);
            list.add(new DataField(a.getName(), a.getObject().replaceAll("_|[^\\w*]*", ""), a.getConfidence(), a.getLocation()));
        }
    }
}
