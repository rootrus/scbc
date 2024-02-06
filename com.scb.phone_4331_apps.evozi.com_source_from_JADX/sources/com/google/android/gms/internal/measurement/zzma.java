package com.google.android.gms.internal.measurement;

public final class zzma implements zzmb {
    private static final zzcv<Long> zza;
    private static final zzcv<Boolean> zzb;
    private static final zzcv<Boolean> zzc;
    private static final zzcv<Boolean> zzd;
    private static final zzcv<Long> zze;

    public final boolean zza() {
        return zzb.zzc().booleanValue();
    }

    public final boolean zzb() {
        return zzc.zzc().booleanValue();
    }

    public final boolean zzc() {
        return zzd.zzc().booleanValue();
    }

    static {
        zzdb zzdb = new zzdb(zzcw.zza("com.google.android.gms.measurement"));
        zza = zzdb.zza("measurement.id.lifecycle.app_in_background_parameter", 0);
        zzb = zzdb.zza("measurement.lifecycle.app_backgrounded_engagement", false);
        zzc = zzdb.zza("measurement.lifecycle.app_backgrounded_tracking", true);
        zzd = zzdb.zza("measurement.lifecycle.app_in_background_parameter", false);
        zze = zzdb.zza("measurement.id.lifecycle.app_backgrounded_tracking", 0);
    }
}
