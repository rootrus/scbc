package com.google.android.gms.internal.measurement;

public final class zzlt implements zzlq {
    private static final zzcv<Boolean> zza;
    private static final zzcv<Boolean> zzb;
    private static final zzcv<Boolean> zzc;

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return zza.zzc().booleanValue();
    }

    public final boolean zzc() {
        return zzb.zzc().booleanValue();
    }

    public final boolean zzd() {
        return zzc.zzc().booleanValue();
    }

    static {
        zzdb zzdb = new zzdb(zzcw.zza("com.google.android.gms.measurement"));
        zza = zzdb.zza("measurement.client.global_params.dev", false);
        zzb = zzdb.zza("measurement.service.global_params_in_payload", true);
        zzc = zzdb.zza("measurement.service.global_params", false);
    }
}
