package com.google.android.gms.internal.measurement;

final class zzfm implements zzgx {
    private static final zzfm zza = new zzfm();

    private zzfm() {
    }

    public static zzfm zza() {
        return zza;
    }

    public final boolean zza(Class<?> cls) {
        return zzfo.class.isAssignableFrom(cls);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.zzgu zzb(java.lang.Class<?> r4) {
        /*
            r3 = this;
            java.lang.Class<com.google.android.gms.internal.measurement.zzfo> r0 = com.google.android.gms.internal.measurement.zzfo.class
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 != 0) goto L_0x0028
            java.lang.String r4 = r4.getName()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r0 = r4.length()
            java.lang.String r1 = "Unsupported message type: "
            if (r0 == 0) goto L_0x001d
            java.lang.String r4 = r1.concat(r4)
            goto L_0x0022
        L_0x001d:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1)
        L_0x0022:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r4)
            throw r0
        L_0x0028:
            java.lang.Class<com.google.android.gms.internal.measurement.zzfo> r0 = com.google.android.gms.internal.measurement.zzfo.class
            java.lang.Class r0 = r4.asSubclass(r0)     // Catch:{ Exception -> 0x003c }
            com.google.android.gms.internal.measurement.zzfo r0 = com.google.android.gms.internal.measurement.zzfo.zza(r0)     // Catch:{ Exception -> 0x003c }
            int r1 = com.google.android.gms.internal.measurement.zzfo.zzf.zzc     // Catch:{ Exception -> 0x003c }
            r2 = 0
            java.lang.Object r0 = r0.zza((int) r1, (java.lang.Object) r2, (java.lang.Object) r2)     // Catch:{ Exception -> 0x003c }
            com.google.android.gms.internal.measurement.zzgu r0 = (com.google.android.gms.internal.measurement.zzgu) r0     // Catch:{ Exception -> 0x003c }
            return r0
        L_0x003c:
            r0 = move-exception
            java.lang.String r4 = r4.getName()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r1 = r4.length()
            java.lang.String r2 = "Unable to get message info for "
            if (r1 == 0) goto L_0x0052
            java.lang.String r4 = r2.concat(r4)
            goto L_0x0057
        L_0x0052:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r2)
        L_0x0057:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r4, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzfm.zzb(java.lang.Class):com.google.android.gms.internal.measurement.zzgu");
    }
}
