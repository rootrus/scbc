package com.kofax.mobile.sdk.p084x;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7910e;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.p073c.C8297a;
import com.kofax.mobile.sdk.p075e.C8340a;
import com.kofax.mobile.sdk.p083w.C8504ag;
import java.util.List;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.x.ay */
public class C8596ay implements C8504ag.C8505a {

    /* renamed from: Rx */
    private static final String f5279Rx = "MRZ1";

    /* renamed from: Ry */
    private static final String f5280Ry = "MRZ2";

    /* renamed from: Ls */
    private final C7910e f5281Ls;

    @HmlPinActivity
    public C8596ay(C7910e eVar) {
        this.f5281Ls = eVar;
    }

    /* renamed from: k */
    public boolean mo55414k(C8340a aVar) {
        return m5466a(aVar.mo55130hv(), C8572ac.f5257Re);
    }

    /* renamed from: z */
    public boolean mo55415z(C8340a aVar) {
        return aVar.mo55132hx() != null && aVar.mo55132hx().size() > 0;
    }

    /* renamed from: A */
    public boolean mo55412A(C8340a aVar) {
        return mo55415z(aVar) && m5468u(aVar.mo55132hx());
    }

    /* renamed from: d */
    public void mo55413d(C8340a aVar, Exception exc) {
        if (exc != null) {
            aVar.mo55098a(exc);
        }
    }

    /* renamed from: u */
    private boolean m5468u(List<DataField> list) {
        DataField a = this.f5281Ls.mo54315a(f5279Rx, list);
        DataField a2 = this.f5281Ls.mo54315a(f5280Ry, list);
        return (a != null && !a.getObject().equals("")) || (a2 != null && !a2.getObject().equals(""));
    }

    /* renamed from: a */
    private static boolean m5466a(C8297a aVar, String str) {
        String e = m5467e(aVar);
        return e != null && e.equals(str);
    }

    /* renamed from: e */
    private static String m5467e(C8297a aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar.getClassId();
    }
}
