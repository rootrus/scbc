package com.google.android.gms.internal.measurement;

public final class zzjm implements zzjn {
    private static final zzcv<Boolean> zza;
    private static final zzcv<Long> zzb;

    public final boolean zza() {
        return zza.zzc().booleanValue();
    }

    public final long zzb() {
        return zzb.zzc().longValue();
    }

    static {
        zzdb zzdb = new zzdb(zzcw.zza("com.google.android.gms.measurement"));
        zza = zzdb.zza("measurement.sdk.attribution.cache", true);
        zzb = zzdb.zza("measurement.sdk.attribution.cache.ttl", 604800000);
    }
}
