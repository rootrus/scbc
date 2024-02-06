package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7909d;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7910e;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7917o;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.p075e.C8340a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.ej */
public class C8137ej implements C7909d {

    /* renamed from: Nv */
    private static final int f4155Nv = 0;

    /* renamed from: Nw */
    private static final int f4156Nw = 50;

    /* renamed from: Nx */
    private static final Set<String> f4157Nx = new HashSet(Arrays.asList(new String[]{C8340a.f4878vN, C8340a.f4879vO, "FirstName", "LastName", "DateOfBirth", "ExpirationDate", "IssueDate", "Address", "City", "State", "ZIP"}));

    /* renamed from: Ny */
    private final C7910e f4158Ny;

    /* renamed from: Nz */
    private final C7917o f4159Nz;

    @HmlPinActivity
    C8137ej(C7910e eVar, C7917o oVar) {
        this.f4158Ny = eVar;
        this.f4159Nz = oVar;
    }

    /* renamed from: b */
    public double mo54314b(List<DataField> list, List<DataField> list2) {
        DataField a;
        double d = 0.0d;
        if (list == null || list.size() == 0) {
            return 0.0d;
        }
        if (list2 == null || list2.size() == 0) {
            return 50.0d;
        }
        int i = 0;
        for (DataField next : list) {
            if (next != null) {
                String name = next.getName();
                if (!(name == null || name.length() == 0) && (a = this.f4158Ny.mo54315a(next.getName(), list2)) != null) {
                    i++;
                    d += m4324c(next, a);
                }
            }
        }
        if (i <= 0) {
            return 50.0d;
        }
        return (d / ((double) i)) * 100.0d;
    }

    /* renamed from: c */
    private double m4324c(DataField dataField, DataField dataField2) {
        String d = m4325d(dataField);
        String d2 = m4325d(dataField2);
        double p = this.f4159Nz.mo54323p(d, d2);
        int max = Math.max(d.length(), d2.length());
        if (p == 0.0d || max == 0) {
            return 1.0d;
        }
        double d3 = (double) max;
        if (p != d3) {
            return 1.0d - ((m4323au(dataField.getName()) * p) / d3);
        }
        return 0.0d;
    }

    /* renamed from: d */
    private static String m4325d(DataField dataField) {
        String object = dataField.getObject();
        if (object == null) {
            return "";
        }
        return object.toLowerCase();
    }

    /* renamed from: au */
    private static double m4323au(String str) {
        return f4157Nx.contains(str) ? 1.0d : 0.9d;
    }
}
