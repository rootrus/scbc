package com.google.android.gms.internal.measurement;

public final class zzmf implements zzmc {
    private static final zzcv<Boolean> zza;
    private static final zzcv<Boolean> zzb;

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
        zza = zzdb.zza("measurement.sdk.screen.manual_screen_view_logging", true);
        zzb = zzdb.zza("measurement.sdk.screen.disabling_automatic_reporting", true);
    }
}
