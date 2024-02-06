package com.google.android.gms.internal.measurement;

public final class zzli implements zzlj {
    private static final zzcv<Boolean> zza;
    private static final zzcv<Boolean> zzb;
    private static final zzcv<Long> zzc;

    public final boolean zza() {
        return zza.zzc().booleanValue();
    }

    public final boolean zzb() {
        return zzb.zzc().booleanValue();
    }

    static {
        zzdb zzdb = new zzdb(zzcw.zza("com.google.android.gms.measurement"));
        zza = zzdb.zza("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        zzb = zzdb.zza("measurement.collection.redundant_engagement_removal_enabled", false);
        zzc = zzdb.zza("measurement.id.collection.redundant_engagement_removal_enabled", 0);
    }
}
