package com.google.android.gms.internal.measurement;

public final class zzlc implements zzld {
    private static final zzcv<Boolean> zza;
    private static final zzcv<Boolean> zzb;
    private static final zzcv<Boolean> zzc;

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return zza.zzc().booleanValue();
    }

    static {
        zzdb zzdb = new zzdb(zzcw.zza("com.google.android.gms.measurement"));
        zza = zzdb.zza("measurement.client.sessions.check_on_reset_and_enable2", true);
        zzb = zzdb.zza("measurement.client.sessions.check_on_startup", true);
        zzc = zzdb.zza("measurement.client.sessions.start_session_before_view_screen", true);
    }
}
