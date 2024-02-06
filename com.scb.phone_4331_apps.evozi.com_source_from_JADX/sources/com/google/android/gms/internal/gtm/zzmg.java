package com.google.android.gms.internal.gtm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class zzmg extends zzhb {
    private static final Set<String> zzarz = new HashSet(Arrays.asList(new String[]{"GET", "HEAD", "POST", "PUT"}));
    private final zzei zzary;

    public zzmg(zzei zzei) {
        this.zzary = zzei;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.gtm.zzoa<?> zza(com.google.android.gms.internal.gtm.zzfl r13, com.google.android.gms.internal.gtm.zzoa<?>... r14) {
        /*
            r12 = this;
            r13 = 1
            com.google.android.gms.common.internal.Preconditions.checkArgument(r13)
            int r0 = r14.length
            r1 = 0
            if (r0 != r13) goto L_0x000a
            r0 = r13
            goto L_0x000b
        L_0x000a:
            r0 = r1
        L_0x000b:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            r0 = r14[r1]
            boolean r0 = r0 instanceof com.google.android.gms.internal.gtm.zzok
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            r0 = r14[r1]
            java.lang.String r2 = "url"
            com.google.android.gms.internal.gtm.zzoa r0 = r0.zzco(r2)
            boolean r2 = r0 instanceof com.google.android.gms.internal.gtm.zzom
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2)
            com.google.android.gms.internal.gtm.zzom r0 = (com.google.android.gms.internal.gtm.zzom) r0
            java.lang.Object r0 = r0.value()
            java.lang.String r0 = (java.lang.String) r0
            r2 = r14[r1]
            java.lang.String r3 = "method"
            com.google.android.gms.internal.gtm.zzoa r2 = r2.zzco(r3)
            com.google.android.gms.internal.gtm.zzog r3 = com.google.android.gms.internal.gtm.zzog.zzaum
            java.lang.String r4 = "GET"
            if (r2 != r3) goto L_0x003e
            com.google.android.gms.internal.gtm.zzom r2 = new com.google.android.gms.internal.gtm.zzom
            r2.<init>(r4)
        L_0x003e:
            boolean r3 = r2 instanceof com.google.android.gms.internal.gtm.zzom
            com.google.android.gms.common.internal.Preconditions.checkArgument(r3)
            com.google.android.gms.internal.gtm.zzom r2 = (com.google.android.gms.internal.gtm.zzom) r2
            java.lang.Object r2 = r2.value()
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            java.util.Set<java.lang.String> r2 = zzarz
            boolean r2 = r2.contains(r8)
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2)
            r2 = r14[r1]
            java.lang.String r3 = "uniqueId"
            com.google.android.gms.internal.gtm.zzoa r2 = r2.zzco(r3)
            com.google.android.gms.internal.gtm.zzog r3 = com.google.android.gms.internal.gtm.zzog.zzaum
            if (r2 == r3) goto L_0x006d
            com.google.android.gms.internal.gtm.zzog r3 = com.google.android.gms.internal.gtm.zzog.zzaul
            if (r2 == r3) goto L_0x006d
            boolean r3 = r2 instanceof com.google.android.gms.internal.gtm.zzom
            if (r3 == 0) goto L_0x006b
            goto L_0x006d
        L_0x006b:
            r3 = r1
            goto L_0x006e
        L_0x006d:
            r3 = r13
        L_0x006e:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r3)
            com.google.android.gms.internal.gtm.zzog r3 = com.google.android.gms.internal.gtm.zzog.zzaum
            r5 = 0
            if (r2 == r3) goto L_0x0085
            com.google.android.gms.internal.gtm.zzog r3 = com.google.android.gms.internal.gtm.zzog.zzaul
            if (r2 != r3) goto L_0x007b
            goto L_0x0085
        L_0x007b:
            com.google.android.gms.internal.gtm.zzom r2 = (com.google.android.gms.internal.gtm.zzom) r2
            java.lang.Object r2 = r2.value()
            java.lang.String r2 = (java.lang.String) r2
            r9 = r2
            goto L_0x0086
        L_0x0085:
            r9 = r5
        L_0x0086:
            r2 = r14[r1]
            java.lang.String r3 = "headers"
            com.google.android.gms.internal.gtm.zzoa r2 = r2.zzco(r3)
            com.google.android.gms.internal.gtm.zzog r3 = com.google.android.gms.internal.gtm.zzog.zzaum
            if (r2 == r3) goto L_0x0099
            boolean r3 = r2 instanceof com.google.android.gms.internal.gtm.zzok
            if (r3 == 0) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            r3 = r1
            goto L_0x009a
        L_0x0099:
            r3 = r13
        L_0x009a:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            com.google.android.gms.internal.gtm.zzog r6 = com.google.android.gms.internal.gtm.zzog.zzaum
            if (r2 != r6) goto L_0x00a8
            r10 = r5
            goto L_0x00ef
        L_0x00a8:
            com.google.android.gms.internal.gtm.zzok r2 = (com.google.android.gms.internal.gtm.zzok) r2
            java.lang.Object r2 = r2.value()
            java.util.Map r2 = (java.util.Map) r2
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x00b8:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x00ee
            java.lang.Object r6 = r2.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r6.getValue()
            com.google.android.gms.internal.gtm.zzoa r6 = (com.google.android.gms.internal.gtm.zzoa) r6
            boolean r10 = r6 instanceof com.google.android.gms.internal.gtm.zzom
            if (r10 != 0) goto L_0x00e2
            java.lang.Object[] r6 = new java.lang.Object[r13]
            r6[r1] = r7
            java.lang.String r7 = "Ignore the non-string value of header key %s."
            java.lang.String r6 = java.lang.String.format(r7, r6)
            com.google.android.gms.internal.gtm.zzev.zzac(r6)
            goto L_0x00b8
        L_0x00e2:
            com.google.android.gms.internal.gtm.zzom r6 = (com.google.android.gms.internal.gtm.zzom) r6
            java.lang.Object r6 = r6.value()
            java.lang.String r6 = (java.lang.String) r6
            r3.put(r7, r6)
            goto L_0x00b8
        L_0x00ee:
            r10 = r3
        L_0x00ef:
            r14 = r14[r1]
            java.lang.String r2 = "body"
            com.google.android.gms.internal.gtm.zzoa r14 = r14.zzco(r2)
            com.google.android.gms.internal.gtm.zzog r2 = com.google.android.gms.internal.gtm.zzog.zzaum
            if (r14 == r2) goto L_0x0102
            boolean r2 = r14 instanceof com.google.android.gms.internal.gtm.zzom
            if (r2 == 0) goto L_0x0100
            goto L_0x0102
        L_0x0100:
            r2 = r1
            goto L_0x0103
        L_0x0102:
            r2 = r13
        L_0x0103:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2)
            com.google.android.gms.internal.gtm.zzog r2 = com.google.android.gms.internal.gtm.zzog.zzaum
            if (r14 != r2) goto L_0x010b
            goto L_0x0114
        L_0x010b:
            com.google.android.gms.internal.gtm.zzom r14 = (com.google.android.gms.internal.gtm.zzom) r14
            java.lang.Object r14 = r14.value()
            r5 = r14
            java.lang.String r5 = (java.lang.String) r5
        L_0x0114:
            r14 = r5
            boolean r2 = r8.equals(r4)
            r11 = 2
            if (r2 != 0) goto L_0x0124
            java.lang.String r2 = "HEAD"
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x0135
        L_0x0124:
            if (r14 == 0) goto L_0x0135
            java.lang.Object[] r2 = new java.lang.Object[r11]
            r2[r1] = r8
            r2[r13] = r14
            java.lang.String r3 = "Body of %s hit will be ignored: %s."
            java.lang.String r2 = java.lang.String.format(r3, r2)
            com.google.android.gms.internal.gtm.zzev.zzac(r2)
        L_0x0135:
            com.google.android.gms.internal.gtm.zzei r2 = r12.zzary
            r3 = r0
            r4 = r8
            r5 = r9
            r6 = r10
            r7 = r14
            r2.zza(r3, r4, r5, r6, r7)
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r0
            r2[r13] = r8
            r2[r11] = r9
            r13 = 3
            r2[r13] = r10
            r13 = 4
            r2[r13] = r14
            java.lang.String r13 = "QueueRequest:\n  url = %s,\n  method = %s,\n  uniqueId = %s,\n  headers = %s,\n  body = %s"
            java.lang.String r13 = java.lang.String.format(r13, r2)
            com.google.android.gms.internal.gtm.zzev.zzab(r13)
            com.google.android.gms.internal.gtm.zzog r13 = com.google.android.gms.internal.gtm.zzog.zzaum
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzmg.zza(com.google.android.gms.internal.gtm.zzfl, com.google.android.gms.internal.gtm.zzoa[]):com.google.android.gms.internal.gtm.zzoa");
    }
}
