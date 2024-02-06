package com.google.android.gms.internal.measurement;

public class zzgf {
    private static final zzfb zza = zzfb.zza();
    private zzeg zzb;
    private volatile zzgw zzc;
    private volatile zzeg zzd;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgf)) {
            return false;
        }
        zzgf zzgf = (zzgf) obj;
        zzgw zzgw = this.zzc;
        zzgw zzgw2 = zzgf.zzc;
        if (zzgw == null && zzgw2 == null) {
            return zzc().equals(zzgf.zzc());
        }
        if (zzgw != null && zzgw2 != null) {
            return zzgw.equals(zzgw2);
        }
        if (zzgw != null) {
            return zzgw.equals(zzgf.zzb(zzgw.mo5788h_()));
        }
        return zzb(zzgw2.mo5788h_()).equals(zzgw2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.measurement.zzgw zzb(com.google.android.gms.internal.measurement.zzgw r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.zzgw r0 = r1.zzc
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.zzgw r0 = r1.zzc     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000b:
            r1.zzc = r2     // Catch:{ zzfw -> 0x0012 }
            com.google.android.gms.internal.measurement.zzeg r0 = com.google.android.gms.internal.measurement.zzeg.zza     // Catch:{ zzfw -> 0x0012 }
            r1.zzd = r0     // Catch:{ zzfw -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.zzc = r2     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.measurement.zzeg r2 = com.google.android.gms.internal.measurement.zzeg.zza     // Catch:{ all -> 0x001a }
            r1.zzd = r2     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        L_0x001d:
            com.google.android.gms.internal.measurement.zzgw r2 = r1.zzc
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgf.zzb(com.google.android.gms.internal.measurement.zzgw):com.google.android.gms.internal.measurement.zzgw");
    }

    public final zzgw zza(zzgw zzgw) {
        zzgw zzgw2 = this.zzc;
        this.zzb = null;
        this.zzd = null;
        this.zzc = zzgw;
        return zzgw2;
    }

    public final int zzb() {
        if (this.zzd != null) {
            return this.zzd.zza();
        }
        if (this.zzc != null) {
            return this.zzc.zzbm();
        }
        return 0;
    }

    public final zzeg zzc() {
        if (this.zzd != null) {
            return this.zzd;
        }
        synchronized (this) {
            if (this.zzd != null) {
                zzeg zzeg = this.zzd;
                return zzeg;
            }
            if (this.zzc == null) {
                this.zzd = zzeg.zza;
            } else {
                this.zzd = this.zzc.zzbh();
            }
            zzeg zzeg2 = this.zzd;
            return zzeg2;
        }
    }
}
