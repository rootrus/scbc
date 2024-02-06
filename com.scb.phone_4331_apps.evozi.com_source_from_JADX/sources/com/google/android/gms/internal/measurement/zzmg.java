package com.google.android.gms.internal.measurement;

public final class zzmg implements zzmh {
    private static final zzcv<Long> zza;
    private static final zzcv<Long> zzb;

    public final long zza() {
        return zzb.zzc().longValue();
    }

    static {
        zzdb zzdb = new zzdb(zzcw.zza("com.google.android.gms.measurement"));
        zza = zzdb.zza("measurement.id.max_bundles_per_iteration", 0);
        zzb = zzdb.zza("measurement.max_bundles_per_iteration", 2);
    }
}
