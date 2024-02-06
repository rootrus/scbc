package com.google.android.gms.internal.firebase_ml;

public final class zzek extends zzfl {
    private final transient zzej zzsk;

    private zzek(zzfm zzfm, zzej zzej) {
        super(zzfm);
        this.zzsk = zzej;
    }

    public final zzej zzei() {
        return this.zzsk;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.google.android.gms.internal.firebase_ml.zzej} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.google.android.gms.internal.firebase_ml.zzej} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: com.google.android.gms.internal.firebase_ml.zzej} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: com.google.android.gms.internal.firebase_ml.zzej} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v40, resolved type: com.google.android.gms.internal.firebase_ml.zzej} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v42, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v33, types: [com.google.android.gms.internal.firebase_ml.zzgd, com.google.android.gms.internal.firebase_ml.zzej] */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a2, code lost:
        if (r2 != null) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a4, code lost:
        r5.close();
        r2 = r2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0076 A[SYNTHETIC, Splitter:B:28:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007d A[Catch:{ IOException -> 0x007b }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00aa A[Catch:{ IOException -> 0x00b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b0 A[Catch:{ IOException -> 0x00b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d2  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.firebase_ml.zzek zza(com.google.android.gms.internal.firebase_ml.zzge r5, com.google.android.gms.internal.firebase_ml.zzfk r6) {
        /*
            com.google.android.gms.internal.firebase_ml.zzfm r0 = new com.google.android.gms.internal.firebase_ml.zzfm
            int r1 = r6.getStatusCode()
            java.lang.String r2 = r6.getStatusMessage()
            com.google.android.gms.internal.firebase_ml.zzfe r3 = r6.zzfe()
            r0.<init>(r1, r2, r3)
            com.google.android.gms.internal.firebase_ml.zzks.checkNotNull(r5)
            r1 = 0
            boolean r2 = r6.zzfk()     // Catch:{ IOException -> 0x00bd }
            if (r2 != 0) goto L_0x00b6
            java.lang.String r2 = "application/json; charset=UTF-8"
            java.lang.String r3 = r6.getContentType()     // Catch:{ IOException -> 0x00bd }
            boolean r2 = com.google.android.gms.internal.firebase_ml.zzfg.zzb(r2, r3)     // Catch:{ IOException -> 0x00bd }
            if (r2 == 0) goto L_0x00b6
            java.io.InputStream r2 = r6.getContent()     // Catch:{ IOException -> 0x00bd }
            if (r2 == 0) goto L_0x00b6
            java.io.InputStream r2 = r6.getContent()     // Catch:{ IOException -> 0x0095, all -> 0x0090 }
            com.google.android.gms.internal.firebase_ml.zzgi r5 = r5.zza(r2)     // Catch:{ IOException -> 0x0095, all -> 0x0090 }
            com.google.android.gms.internal.firebase_ml.zzgm r2 = r5.zzgi()     // Catch:{ IOException -> 0x008c, all -> 0x0088 }
            if (r2 != 0) goto L_0x003f
            com.google.android.gms.internal.firebase_ml.zzgm r2 = r5.zzgh()     // Catch:{ IOException -> 0x008c, all -> 0x0088 }
        L_0x003f:
            if (r2 == 0) goto L_0x0073
            java.lang.String r2 = "error"
            java.util.Set r2 = java.util.Collections.singleton(r2)     // Catch:{ IOException -> 0x008c, all -> 0x0088 }
            r5.zza(r2)     // Catch:{ IOException -> 0x008c, all -> 0x0088 }
            com.google.android.gms.internal.firebase_ml.zzgm r2 = r5.zzgi()     // Catch:{ IOException -> 0x008c, all -> 0x0088 }
            com.google.android.gms.internal.firebase_ml.zzgm r3 = com.google.android.gms.internal.firebase_ml.zzgm.VALUE_STRING     // Catch:{ IOException -> 0x008c, all -> 0x0088 }
            if (r2 != r3) goto L_0x0057
            java.lang.String r2 = r5.getText()     // Catch:{ IOException -> 0x008c, all -> 0x0088 }
            goto L_0x0074
        L_0x0057:
            com.google.android.gms.internal.firebase_ml.zzgm r2 = r5.zzgi()     // Catch:{ IOException -> 0x008c, all -> 0x0088 }
            com.google.android.gms.internal.firebase_ml.zzgm r3 = com.google.android.gms.internal.firebase_ml.zzgm.START_OBJECT     // Catch:{ IOException -> 0x008c, all -> 0x0088 }
            if (r2 != r3) goto L_0x0073
            java.lang.Class<com.google.android.gms.internal.firebase_ml.zzej> r2 = com.google.android.gms.internal.firebase_ml.zzej.class
            java.lang.Object r2 = r5.zza(r2, r1)     // Catch:{ IOException -> 0x008c, all -> 0x0088 }
            com.google.android.gms.internal.firebase_ml.zzej r2 = (com.google.android.gms.internal.firebase_ml.zzej) r2     // Catch:{ IOException -> 0x008c, all -> 0x0088 }
            java.lang.String r1 = r2.zzfx()     // Catch:{ IOException -> 0x0071 }
            r4 = r2
            r2 = r1
            r1 = r4
            goto L_0x0074
        L_0x006f:
            r3 = move-exception
            goto L_0x00a8
        L_0x0071:
            r3 = move-exception
            goto L_0x0099
        L_0x0073:
            r2 = r1
        L_0x0074:
            if (r5 != 0) goto L_0x007d
            r6.ignore()     // Catch:{ IOException -> 0x007b }
            goto L_0x00c5
        L_0x007b:
            r5 = move-exception
            goto L_0x0084
        L_0x007d:
            if (r1 != 0) goto L_0x00c5
            r5.close()     // Catch:{ IOException -> 0x007b }
            goto L_0x00c5
        L_0x0084:
            r4 = r2
            r2 = r1
            r1 = r4
            goto L_0x00bf
        L_0x0088:
            r2 = move-exception
            r3 = r2
            r2 = r1
            goto L_0x00a8
        L_0x008c:
            r2 = move-exception
            r3 = r2
            r2 = r1
            goto L_0x0099
        L_0x0090:
            r5 = move-exception
            r3 = r5
            r5 = r1
            r2 = r5
            goto L_0x00a8
        L_0x0095:
            r5 = move-exception
            r3 = r5
            r5 = r1
            r2 = r5
        L_0x0099:
            com.google.android.gms.internal.firebase_ml.zzlx.zzb(r3)     // Catch:{ all -> 0x006f }
            if (r5 != 0) goto L_0x00a2
            r6.ignore()     // Catch:{ IOException -> 0x00b4 }
            goto L_0x00c8
        L_0x00a2:
            if (r2 != 0) goto L_0x00c2
            r5.close()     // Catch:{ IOException -> 0x00b4 }
            goto L_0x00c8
        L_0x00a8:
            if (r5 == 0) goto L_0x00b0
            if (r2 != 0) goto L_0x00b3
            r5.close()     // Catch:{ IOException -> 0x00b4 }
            goto L_0x00b3
        L_0x00b0:
            r6.ignore()     // Catch:{ IOException -> 0x00b4 }
        L_0x00b3:
            throw r3     // Catch:{ IOException -> 0x00b4 }
        L_0x00b4:
            r5 = move-exception
            goto L_0x00bf
        L_0x00b6:
            java.lang.String r5 = r6.zzfl()     // Catch:{ IOException -> 0x00bd }
            r2 = r1
            r1 = r5
            goto L_0x00c8
        L_0x00bd:
            r5 = move-exception
            r2 = r1
        L_0x00bf:
            com.google.android.gms.internal.firebase_ml.zzlx.zzb(r5)
        L_0x00c2:
            r4 = r2
            r2 = r1
            r1 = r4
        L_0x00c5:
            r4 = r2
            r2 = r1
            r1 = r4
        L_0x00c8:
            java.lang.StringBuilder r5 = com.google.android.gms.internal.firebase_ml.zzfl.zzc(r6)
            boolean r6 = com.google.android.gms.internal.firebase_ml.zzla.zzbb(r1)
            if (r6 != 0) goto L_0x00dd
            java.lang.String r6 = com.google.android.gms.internal.firebase_ml.zzhz.zzaae
            r5.append(r6)
            r5.append(r1)
            r0.zzai(r1)
        L_0x00dd:
            java.lang.String r5 = r5.toString()
            r0.zzah(r5)
            com.google.android.gms.internal.firebase_ml.zzek r5 = new com.google.android.gms.internal.firebase_ml.zzek
            r5.<init>(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzek.zza(com.google.android.gms.internal.firebase_ml.zzge, com.google.android.gms.internal.firebase_ml.zzfk):com.google.android.gms.internal.firebase_ml.zzek");
    }
}
