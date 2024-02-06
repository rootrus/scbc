package com.google.android.gms.internal.measurement;

public final class zzjs implements zzjt {
    private static final zzcv<Boolean> zza;
    private static final zzcv<Boolean> zzb;
    private static final zzcv<Long> zzc;

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return zza.zzc().booleanValue();
    }

    public final boolean zzc() {
        return zzb.zzc().booleanValue();
    }

    static {
        zzdb zzdb = new zzdb(zzcw.zza("com.google.android.gms.measurement"));
        zza = zzdb.zza("measurement.service.configurable_service_limits", false);
        zzb = zzdb.zza("measurement.client.configurable_service_limits", false);
        zzc = zzdb.zza("measurement.id.service.configurable_service_limits", 0);
    }
}
