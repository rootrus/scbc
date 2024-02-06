package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zzcv<T> {
    private static final Object zza = new Object();
    private static volatile Context zzb;
    private static volatile boolean zzc = false;
    private static final AtomicReference<Collection<zzcv<?>>> zzd = new AtomicReference<>();
    private static volatile zzdj<zzdi<zzcr>> zze;
    private static final AtomicInteger zzi = new AtomicInteger();
    private final zzdb zzf;
    private final String zzg;
    private final T zzh;
    private volatile int zzj;
    private volatile T zzk;
    private final boolean zzl;

    @Deprecated
    public static void zza(Context context) {
        synchronized (zza) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (zzb != context) {
                zzch.zzc();
                zzde.zza();
                zzcq.zza();
                zze = zzdm.zza(zzcy.zza);
                zzb = context;
                zzi.incrementAndGet();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract T zza(Object obj);

    static void zza() {
        zzi.incrementAndGet();
    }

    private zzcv(zzdb zzdb, String str, T t, boolean z) {
        this.zzj = -1;
        if (zzdb.zzb != null) {
            this.zzf = zzdb;
            this.zzg = str;
            this.zzh = t;
            this.zzl = z;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    private final String zza(String str) {
        if (str != null && str.isEmpty()) {
            return this.zzg;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.zzg);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public final String zzb() {
        return zza(this.zzf.zzd);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T zzc() {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = zzi
            int r0 = r0.get()
            int r1 = r6.zzj
            if (r1 >= r0) goto L_0x00f9
            monitor-enter(r6)
            int r1 = r6.zzj     // Catch:{ all -> 0x00f6 }
            if (r1 >= r0) goto L_0x00f4
            android.content.Context r1 = zzb     // Catch:{ all -> 0x00f6 }
            if (r1 == 0) goto L_0x00ec
            android.content.Context r1 = zzb     // Catch:{ all -> 0x00f6 }
            com.google.android.gms.internal.measurement.zzcq r1 = com.google.android.gms.internal.measurement.zzcq.zza((android.content.Context) r1)     // Catch:{ all -> 0x00f6 }
            java.lang.String r2 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            java.lang.Object r1 = r1.zza((java.lang.String) r2)     // Catch:{ all -> 0x00f6 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00f6 }
            if (r1 == 0) goto L_0x0031
            java.util.regex.Pattern r2 = com.google.android.gms.internal.measurement.zzcg.zzb     // Catch:{ all -> 0x00f6 }
            java.util.regex.Matcher r1 = r2.matcher(r1)     // Catch:{ all -> 0x00f6 }
            boolean r1 = r1.matches()     // Catch:{ all -> 0x00f6 }
            if (r1 == 0) goto L_0x0031
            r1 = 1
            goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            r2 = 0
            if (r1 != 0) goto L_0x006f
            com.google.android.gms.internal.measurement.zzdb r1 = r6.zzf     // Catch:{ all -> 0x00f6 }
            android.net.Uri r1 = r1.zzb     // Catch:{ all -> 0x00f6 }
            if (r1 == 0) goto L_0x0058
            android.content.Context r1 = zzb     // Catch:{ all -> 0x00f6 }
            com.google.android.gms.internal.measurement.zzdb r3 = r6.zzf     // Catch:{ all -> 0x00f6 }
            android.net.Uri r3 = r3.zzb     // Catch:{ all -> 0x00f6 }
            boolean r1 = com.google.android.gms.internal.measurement.zzct.zza(r1, r3)     // Catch:{ all -> 0x00f6 }
            if (r1 == 0) goto L_0x0056
            android.content.Context r1 = zzb     // Catch:{ all -> 0x00f6 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ all -> 0x00f6 }
            com.google.android.gms.internal.measurement.zzdb r3 = r6.zzf     // Catch:{ all -> 0x00f6 }
            android.net.Uri r3 = r3.zzb     // Catch:{ all -> 0x00f6 }
            com.google.android.gms.internal.measurement.zzch r1 = com.google.android.gms.internal.measurement.zzch.zza(r1, r3)     // Catch:{ all -> 0x00f6 }
            goto L_0x005e
        L_0x0056:
            r1 = r2
            goto L_0x005e
        L_0x0058:
            android.content.Context r1 = zzb     // Catch:{ all -> 0x00f6 }
            com.google.android.gms.internal.measurement.zzde r1 = com.google.android.gms.internal.measurement.zzde.zza((android.content.Context) r1, (java.lang.String) r2)     // Catch:{ all -> 0x00f6 }
        L_0x005e:
            if (r1 == 0) goto L_0x0099
            java.lang.String r3 = r6.zzb()     // Catch:{ all -> 0x00f6 }
            java.lang.Object r1 = r1.zza(r3)     // Catch:{ all -> 0x00f6 }
            if (r1 == 0) goto L_0x0099
            java.lang.Object r1 = r6.zza((java.lang.Object) r1)     // Catch:{ all -> 0x00f6 }
            goto L_0x009a
        L_0x006f:
            java.lang.String r1 = "PhenotypeFlag"
            r3 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r3)     // Catch:{ all -> 0x00f6 }
            if (r1 == 0) goto L_0x0099
            java.lang.String r1 = r6.zzb()     // Catch:{ all -> 0x00f6 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00f6 }
            int r3 = r1.length()     // Catch:{ all -> 0x00f6 }
            if (r3 == 0) goto L_0x008d
            java.lang.String r3 = "Bypass reading Phenotype values for flag: "
            java.lang.String r1 = r3.concat(r1)     // Catch:{ all -> 0x00f6 }
            goto L_0x0094
        L_0x008d:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x00f6 }
            java.lang.String r3 = "Bypass reading Phenotype values for flag: "
            r1.<init>(r3)     // Catch:{ all -> 0x00f6 }
        L_0x0094:
            java.lang.String r3 = "PhenotypeFlag"
            android.util.Log.d(r3, r1)     // Catch:{ all -> 0x00f6 }
        L_0x0099:
            r1 = r2
        L_0x009a:
            if (r1 == 0) goto L_0x009d
            goto L_0x00bc
        L_0x009d:
            android.content.Context r1 = zzb     // Catch:{ all -> 0x00f6 }
            com.google.android.gms.internal.measurement.zzcq r1 = com.google.android.gms.internal.measurement.zzcq.zza((android.content.Context) r1)     // Catch:{ all -> 0x00f6 }
            com.google.android.gms.internal.measurement.zzdb r3 = r6.zzf     // Catch:{ all -> 0x00f6 }
            java.lang.String r3 = r3.zzc     // Catch:{ all -> 0x00f6 }
            java.lang.String r3 = r6.zza((java.lang.String) r3)     // Catch:{ all -> 0x00f6 }
            java.lang.Object r1 = r1.zza(r3)     // Catch:{ all -> 0x00f6 }
            if (r1 == 0) goto L_0x00b6
            java.lang.Object r1 = r6.zza((java.lang.Object) r1)     // Catch:{ all -> 0x00f6 }
            goto L_0x00b7
        L_0x00b6:
            r1 = r2
        L_0x00b7:
            if (r1 == 0) goto L_0x00ba
            goto L_0x00bc
        L_0x00ba:
            T r1 = r6.zzh     // Catch:{ all -> 0x00f6 }
        L_0x00bc:
            com.google.android.gms.internal.measurement.zzdj<com.google.android.gms.internal.measurement.zzdi<com.google.android.gms.internal.measurement.zzcr>> r3 = zze     // Catch:{ all -> 0x00f6 }
            java.lang.Object r3 = r3.zza()     // Catch:{ all -> 0x00f6 }
            com.google.android.gms.internal.measurement.zzdi r3 = (com.google.android.gms.internal.measurement.zzdi) r3     // Catch:{ all -> 0x00f6 }
            boolean r4 = r3.zza()     // Catch:{ all -> 0x00f6 }
            if (r4 == 0) goto L_0x00e7
            java.lang.Object r1 = r3.zzb()     // Catch:{ all -> 0x00f6 }
            com.google.android.gms.internal.measurement.zzcr r1 = (com.google.android.gms.internal.measurement.zzcr) r1     // Catch:{ all -> 0x00f6 }
            com.google.android.gms.internal.measurement.zzdb r3 = r6.zzf     // Catch:{ all -> 0x00f6 }
            android.net.Uri r3 = r3.zzb     // Catch:{ all -> 0x00f6 }
            com.google.android.gms.internal.measurement.zzdb r4 = r6.zzf     // Catch:{ all -> 0x00f6 }
            java.lang.String r4 = r4.zzd     // Catch:{ all -> 0x00f6 }
            java.lang.String r5 = r6.zzg     // Catch:{ all -> 0x00f6 }
            java.lang.String r1 = r1.zza(r3, r2, r4, r5)     // Catch:{ all -> 0x00f6 }
            if (r1 != 0) goto L_0x00e3
            T r1 = r6.zzh     // Catch:{ all -> 0x00f6 }
            goto L_0x00e7
        L_0x00e3:
            java.lang.Object r1 = r6.zza((java.lang.Object) r1)     // Catch:{ all -> 0x00f6 }
        L_0x00e7:
            r6.zzk = r1     // Catch:{ all -> 0x00f6 }
            r6.zzj = r0     // Catch:{ all -> 0x00f6 }
            goto L_0x00f4
        L_0x00ec:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f6 }
            java.lang.String r1 = "Must call PhenotypeFlag.init() first"
            r0.<init>(r1)     // Catch:{ all -> 0x00f6 }
            throw r0     // Catch:{ all -> 0x00f6 }
        L_0x00f4:
            monitor-exit(r6)     // Catch:{ all -> 0x00f6 }
            goto L_0x00f9
        L_0x00f6:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00f6 }
            throw r0
        L_0x00f9:
            T r0 = r6.zzk
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzcv.zzc():java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static zzcv<Long> zzb(zzdb zzdb, String str, long j, boolean z) {
        return new zzcx(zzdb, str, Long.valueOf(j), true);
    }

    /* access modifiers changed from: private */
    public static zzcv<Boolean> zzb(zzdb zzdb, String str, boolean z, boolean z2) {
        return new zzda(zzdb, str, Boolean.valueOf(z), true);
    }

    /* access modifiers changed from: private */
    public static zzcv<Double> zzb(zzdb zzdb, String str, double d, boolean z) {
        return new zzcz(zzdb, str, Double.valueOf(d), true);
    }

    /* access modifiers changed from: private */
    public static zzcv<String> zzb(zzdb zzdb, String str, String str2, boolean z) {
        return new zzdc(zzdb, str, str2, true);
    }

    static final /* synthetic */ zzdi zzd() {
        new zzcu();
        return zzcu.zza(zzb);
    }

    /* synthetic */ zzcv(zzdb zzdb, String str, Object obj, boolean z, zzcx zzcx) {
        this(zzdb, str, obj, z);
    }
}
