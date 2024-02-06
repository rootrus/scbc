package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7908c;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.h */
public class C8144h implements C7908c {
    /* renamed from: a */
    public List<DataField> mo54313a(List<DataField> list, List<DataField> list2) {
        return m4340d(m4339c(new ArrayList(), list), list2);
    }

    /* renamed from: c */
    private List<DataField> m4339c(List<DataField> list, List<DataField> list2) {
        try {
            list.addAll(list2);
        } catch (NullPointerException unused) {
        }
        return list;
    }

    /* renamed from: d */
    private List<DataField> m4340d(List<DataField> list, List<DataField> list2) {
        try {
            return m4341e(list, list2);
        } catch (NullPointerException unused) {
            return list;
        }
    }

    /* renamed from: e */
    private List<DataField> m4341e(List<DataField> list, List<DataField> list2) {
        for (int i = 0; i < list.size(); i++) {
            DataField dataField = list.get(i);
            Iterator<DataField> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DataField next = it.next();
                if (m4337a(dataField, next)) {
                    list.set(i, m4338b(dataField, next));
                    list2.remove(next);
                    break;
                }
            }
        }
        list.addAll(list2);
        return list;
    }

    /* renamed from: a */
    private boolean m4337a(DataField dataField, DataField dataField2) {
        String name = dataField.getName();
        String name2 = dataField2.getName();
        if (!(name == null || name.length() == 0)) {
            return name.equals(name2);
        }
        if (name2 == null || name2.length() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        if ((r0 == null || r0.length() == 0) == false) goto L_0x0051;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.kofax.mobile.sdk.extract.p018id.DataField m4338b(com.kofax.mobile.sdk.extract.p018id.DataField r11, com.kofax.mobile.sdk.extract.p018id.DataField r12) {
        /*
            r10 = this;
            java.lang.String r1 = r11.getName()
            com.kofax.mobile.sdk.capture.model.FieldLocation r0 = r11.getLocation()
            com.kofax.mobile.sdk.capture.model.FieldLocation r2 = com.kofax.mobile.sdk.capture.model.FieldLocation.UNDEFINED
            if (r0 == r2) goto L_0x0011
            com.kofax.mobile.sdk.capture.model.FieldLocation r0 = r11.getLocation()
            goto L_0x0015
        L_0x0011:
            com.kofax.mobile.sdk.capture.model.FieldLocation r0 = r12.getLocation()
        L_0x0015:
            r5 = r0
            java.lang.String r0 = r11.getObject()
            java.lang.String r2 = ""
            if (r0 != 0) goto L_0x001f
            r0 = r2
        L_0x001f:
            java.lang.String r3 = r12.getObject()
            if (r3 == 0) goto L_0x0026
            r2 = r3
        L_0x0026:
            double r3 = r11.getConfidence()
            double r6 = r11.getConfidence()
            double r8 = r12.getConfidence()
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x005f
            double r6 = r11.getConfidence()
            double r8 = r12.getConfidence()
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r11 != 0) goto L_0x0051
            if (r0 == 0) goto L_0x004e
            int r11 = r0.length()
            if (r11 == 0) goto L_0x004e
            r11 = r6
            goto L_0x004f
        L_0x004e:
            r11 = r7
        L_0x004f:
            if (r11 != 0) goto L_0x005f
        L_0x0051:
            if (r2 == 0) goto L_0x005a
            int r11 = r2.length()
            if (r11 == 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r6 = r7
        L_0x005b:
            if (r6 == 0) goto L_0x005f
            r2 = r0
            goto L_0x0064
        L_0x005f:
            double r11 = r12.getConfidence()
            r3 = r11
        L_0x0064:
            com.kofax.mobile.sdk.extract.id.DataField r11 = new com.kofax.mobile.sdk.extract.id.DataField
            r0 = r11
            r0.<init>(r1, r2, r3, r5)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8144h.m4338b(com.kofax.mobile.sdk.extract.id.DataField, com.kofax.mobile.sdk.extract.id.DataField):com.kofax.mobile.sdk.extract.id.DataField");
    }
}
