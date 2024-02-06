package com.kofax.mobile.sdk.p083w;

import bolts.CancellationToken;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7910e;
import com.kofax.mobile.sdk.capture.model.FieldLocation;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.p073c.C8297a;
import com.kofax.mobile.sdk.p075e.C8340a;
import java.util.List;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.w.v */
public class C8562v extends C8500ae {

    /* renamed from: PC */
    private static final String f5246PC = "FullName";

    /* renamed from: PD */
    private static final String f5247PD = "LastName";

    /* renamed from: Qd */
    private static final String f5248Qd = "Philippines (PHL) Driver License (2001)";

    /* renamed from: Lu */
    private final C7910e f5249Lu;

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo55143a(Object obj, CancellationToken cancellationToken) {
        super.mo55143a(obj, cancellationToken);
    }

    @HmlPinActivity
    public C8562v(C7910e eVar) {
        this.f5249Lu = eVar;
    }

    /* renamed from: a */
    public void mo55390a(C8340a aVar) {
        if (f5248Qd.equals(m5354c(aVar.mo55130hv()))) {
            DataField g = m5356g(f5247PD, aVar.mo55117hB());
            DataField g2 = m5356g(f5246PC, aVar.mo55122hG());
            if (g != null && g2 != null) {
                aVar.mo55122hG().remove(g2);
                aVar.mo55122hG().add(m5355d(g, g2));
            }
        }
    }

    /* renamed from: d */
    static DataField m5355d(DataField dataField, DataField dataField2) {
        return new DataField(dataField2.getName(), m5353E(dataField.getObject(), dataField2.getObject()), dataField.getConfidence(), FieldLocation.UNDEFINED);
    }

    /* renamed from: g */
    private DataField m5356g(String str, List<DataField> list) {
        if (list == null) {
            return null;
        }
        return this.f5249Lu.mo54315a(str, list);
    }

    /* renamed from: c */
    private static String m5354c(C8297a aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar.getClassId();
    }

    /* renamed from: E */
    private static String m5353E(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str2.isEmpty()) {
            return str;
        }
        if (str.isEmpty()) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        return sb.toString();
    }
}
