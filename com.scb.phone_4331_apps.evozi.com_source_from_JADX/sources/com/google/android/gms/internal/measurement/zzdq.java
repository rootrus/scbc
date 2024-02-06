package com.google.android.gms.internal.measurement;

public final class zzdq {
    private static final zzdp zza;
    private static final int zzb;

    static final class zza extends zzdp {
        zza() {
        }

        public final void zza(Throwable th, Throwable th2) {
        }
    }

    public static void zza(Throwable th, Throwable th2) {
        zza.zza(th, th2);
    }

    private static Integer zza() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get((Object) null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
    static {
        /*
            r0 = 1
            java.lang.Integer r1 = zza()     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0015
            int r2 = r1.intValue()     // Catch:{ all -> 0x002a }
            r3 = 19
            if (r2 < r3) goto L_0x0015
            com.google.android.gms.internal.measurement.zzdu r2 = new com.google.android.gms.internal.measurement.zzdu     // Catch:{ all -> 0x002a }
            r2.<init>()     // Catch:{ all -> 0x002a }
            goto L_0x0064
        L_0x0015:
            java.lang.String r2 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r2 = java.lang.Boolean.getBoolean(r2)     // Catch:{ all -> 0x002a }
            r2 = r2 ^ r0
            if (r2 == 0) goto L_0x0024
            com.google.android.gms.internal.measurement.zzdt r2 = new com.google.android.gms.internal.measurement.zzdt     // Catch:{ all -> 0x002a }
            r2.<init>()     // Catch:{ all -> 0x002a }
            goto L_0x0064
        L_0x0024:
            com.google.android.gms.internal.measurement.zzdq$zza r2 = new com.google.android.gms.internal.measurement.zzdq$zza     // Catch:{ all -> 0x002a }
            r2.<init>()     // Catch:{ all -> 0x002a }
            goto L_0x0064
        L_0x002a:
            r2 = move-exception
            goto L_0x002e
        L_0x002c:
            r2 = move-exception
            r1 = 0
        L_0x002e:
            java.io.PrintStream r3 = java.lang.System.err
            java.lang.Class<com.google.android.gms.internal.measurement.zzdq$zza> r4 = com.google.android.gms.internal.measurement.zzdq.zza.class
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = java.lang.String.valueOf(r4)
            int r6 = r6.length()
            int r6 = r6 + 133
            r5.<init>(r6)
            java.lang.String r6 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = "will be used. The error is: "
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.println(r4)
            java.io.PrintStream r3 = java.lang.System.err
            r2.printStackTrace(r3)
            com.google.android.gms.internal.measurement.zzdq$zza r2 = new com.google.android.gms.internal.measurement.zzdq$zza
            r2.<init>()
        L_0x0064:
            zza = r2
            if (r1 != 0) goto L_0x0069
            goto L_0x006d
        L_0x0069:
            int r0 = r1.intValue()
        L_0x006d:
            zzb = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzdq.<clinit>():void");
    }
}
