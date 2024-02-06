package com.google.android.gms.internal.measurement;

public final class zzjx implements zzju {
    private static final zzcv<Boolean> zza;
    private static final zzcv<Boolean> zzb;
    private static final zzcv<Boolean> zzc;
    private static final zzcv<Long> zzd;

    public final boolean zza() {
        return zza.zzc().booleanValue();
    }

    static {
        zzdb zzdb = new zzdb(zzcw.zza("com.google.android.gms.measurement"));
        zza = zzdb.zza("measurement.sdk.dynamite.allow_remote_dynamite2", false);
        zzb = zzdb.zza("measurement.collection.init_params_control_enabled", true);
        zzc = zzdb.zza("measurement.sdk.dynamite.use_dynamite3", true);
        zzd = zzdb.zza("measurement.id.sdk.dynamite.use_dynamite", 0);
    }
}
