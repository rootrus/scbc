package com.google.android.gms.internal.measurement;

public final class zzlz implements zzlw {
    private static final zzcv<Boolean> zza;
    private static final zzcv<Boolean> zzb;
    private static final zzcv<Boolean> zzc;
    private static final zzcv<Boolean> zzd;
    private static final zzcv<Long> zze;

    public final boolean zza() {
        return zza.zzc().booleanValue();
    }

    public final boolean zzb() {
        return zzb.zzc().booleanValue();
    }

    public final boolean zzc() {
        return zzc.zzc().booleanValue();
    }

    public final boolean zzd() {
        return zzd.zzc().booleanValue();
    }

    static {
        zzdb zzdb = new zzdb(zzcw.zza("com.google.android.gms.measurement"));
        zza = zzdb.zza("measurement.sdk.collection.enable_extend_user_property_size", true);
        zzb = zzdb.zza("measurement.sdk.collection.last_deep_link_referrer2", true);
        zzc = zzdb.zza("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        zzd = zzdb.zza("measurement.sdk.collection.last_gclid_from_referrer2", false);
        zze = zzdb.zza("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }
}
