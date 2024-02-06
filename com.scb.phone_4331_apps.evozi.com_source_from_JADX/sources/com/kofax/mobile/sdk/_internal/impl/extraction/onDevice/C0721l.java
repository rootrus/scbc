package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.android.abc.configuration.Configuration;
import com.kofax.mobile.sdk._internal.extraction.p004id.C0529g;
import com.kofax.mobile.sdk.p016b.C0862c;
import java.io.File;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.l */
public class C0721l implements C0529g {

    /* renamed from: KY */
    private final C0862c f1673KY;

    @HmlPinActivity
    C0721l(C0862c cVar) {
        this.f1673KY = cVar;
    }

    /* renamed from: o */
    public Configuration mo11410o(String str, String str2) {
        Configuration configuration = new Configuration();
        File g = this.f1673KY.mo12124g(str, str2);
        File h = this.f1673KY.mo12125h(str, str2);
        File J = this.f1673KY.mo12121J(str);
        String d = m1630d(g);
        if (J != null) {
            String replaceAll = d.replaceAll("\"UseCityDatabase\" type=\"bool\" value=\"no\"", "\"UseCityDatabase\" type=\"bool\" value=\"yes\"");
            StringBuilder sb = new StringBuilder();
            sb.append("\"CityDatabaseFile\" type=\"string\" value=\"");
            sb.append(J.getAbsolutePath());
            sb.append("\"");
            d = replaceAll.replaceAll("\"CityDatabaseFile\" type=\"string\" value=\"\"", sb.toString());
        }
        String absolutePath = h.getParentFile().getAbsolutePath();
        String name = h.getName();
        configuration.loadFromString(d);
        configuration.setStringValue("Common.ModelPath", absolutePath);
        configuration.setStringValue("Common.ModelFile", name);
        return configuration;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.io.Reader] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003c A[SYNTHETIC, Splitter:B:22:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0041 A[Catch:{ IOException -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0048 A[SYNTHETIC, Splitter:B:31:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x004d A[Catch:{ IOException -> 0x0051 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m1630d(java.io.File r4) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 102400(0x19000, float:1.43493E-40)
            r0.<init>(r1)
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0045, all -> 0x0037 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x0045, all -> 0x0037 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0034, all -> 0x002f }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0034, all -> 0x002f }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0034, all -> 0x002f }
            r4.<init>(r3)     // Catch:{ Exception -> 0x0034, all -> 0x002f }
        L_0x0018:
            java.lang.String r1 = r4.readLine()     // Catch:{ Exception -> 0x002d, all -> 0x002b }
            if (r1 == 0) goto L_0x0027
            r0.append(r1)     // Catch:{ Exception -> 0x002d, all -> 0x002b }
            java.lang.String r1 = "\n"
            r0.append(r1)     // Catch:{ Exception -> 0x002d, all -> 0x002b }
            goto L_0x0018
        L_0x0027:
            r2.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x004e
        L_0x002b:
            r0 = move-exception
            goto L_0x0032
        L_0x002d:
            r1 = r4
            goto L_0x0034
        L_0x002f:
            r4 = move-exception
            r0 = r4
            r4 = r1
        L_0x0032:
            r1 = r2
            goto L_0x003a
        L_0x0034:
            r4 = r1
            r1 = r2
            goto L_0x0046
        L_0x0037:
            r4 = move-exception
            r0 = r4
            r4 = r1
        L_0x003a:
            if (r1 == 0) goto L_0x003f
            r1.close()     // Catch:{ IOException -> 0x0044 }
        L_0x003f:
            if (r4 == 0) goto L_0x0044
            r4.close()     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            throw r0
        L_0x0045:
            r4 = r1
        L_0x0046:
            if (r1 == 0) goto L_0x004b
            r1.close()     // Catch:{ IOException -> 0x0051 }
        L_0x004b:
            if (r4 != 0) goto L_0x004e
            goto L_0x0051
        L_0x004e:
            r4.close()     // Catch:{ IOException -> 0x0051 }
        L_0x0051:
            java.lang.String r4 = r0.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C0721l.m1630d(java.io.File):java.lang.String");
    }
}
