package com.google.android.gms.internal.measurement;

public final class zzjg implements zzjh {
    private static final zzcv<Boolean> zza;
    private static final zzcv<Boolean> zzb;

    public final boolean zza() {
        return zza.zzc().booleanValue();
    }

    static {
        zzdb zzdb = new zzdb(zzcw.zza("com.google.android.gms.measurement"));
        zza = zzdb.zza("measurement.androidId.delete_feature", true);
        zzb = zzdb.zza("measurement.log_androidId_enabled", false);
    }
}
