package com.google.android.gms.internal.measurement;

public final class zzkq implements zzkr {
    private static final zzcv<Boolean> zza;
    private static final zzcv<Long> zzb;

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return zza.zzc().booleanValue();
    }

    static {
        zzdb zzdb = new zzdb(zzcw.zza("com.google.android.gms.measurement"));
        zza = zzdb.zza("measurement.sdk.referrer.delayed_install_referrer_api", false);
        zzb = zzdb.zza("measurement.id.sdk.referrer.delayed_install_referrer_api", 0);
    }
}
