package com.kofax.mobile.sdk.p083w;

import bolts.CancellationToken;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7910e;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.p073c.C8297a;
import com.kofax.mobile.sdk.p075e.C8340a;
import java.util.List;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.w.as */
public class C8520as extends C8500ae {

    /* renamed from: QD */
    private static final String f5185QD = "MRZ1";

    /* renamed from: QE */
    private static final String f5186QE = "MRZ2";

    /* renamed from: Ls */
    private final C7910e f5187Ls;

    /* renamed from: QC */
    private final String f5188QC = "Slovakia (SVK) Identification Card (1999) - Back";

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo55143a(Object obj, CancellationToken cancellationToken) {
        super.mo55143a(obj, cancellationToken);
    }

    @HmlPinActivity
    public C8520as(C7910e eVar) {
        this.f5187Ls = eVar;
    }

    /* renamed from: a */
    public void mo55390a(C8340a aVar) {
        String c = m5259c(aVar.mo55131hw());
        if (c != null && c.contains("Slovakia (SVK) Identification Card (1999) - Back")) {
            m5260f(f5185QD, aVar.mo55134hz());
            m5260f(f5186QE, aVar.mo55134hz());
        }
    }

    /* renamed from: f */
    private void m5260f(String str, List<DataField> list) {
        DataField g = m5261g(str, list);
        if (g != null) {
            String object = g.getObject();
            String aA = m5258aA(object);
            if (!object.equals(aA)) {
                int indexOf = list.indexOf(g);
                list.remove(g);
                list.add(indexOf, new DataField(g.getName(), aA, g.getConfidence(), g.getLocation()));
            }
        }
    }

    /* renamed from: g */
    private DataField m5261g(String str, List<DataField> list) {
        if (list == null) {
            return null;
        }
        return this.f5187Ls.mo54315a(str, list);
    }

    /* renamed from: aA */
    private String m5258aA(String str) {
        return (str == null || str.length() <= 34) ? str : str.substring(0, 34);
    }

    /* renamed from: c */
    private String m5259c(C8297a aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar.getClassId();
    }
}
