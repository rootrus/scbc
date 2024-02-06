package com.google.android.gms.internal.measurement;

public final class zzkk implements zzkl {
    private static final zzcv<Boolean> zza;
    private static final zzcv<Boolean> zzb;
    private static final zzcv<Boolean> zzc;
    private static final zzcv<Boolean> zzd;

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

    public final boolean zze() {
        return zzd.zzc().booleanValue();
    }

    static {
        zzdb zzdb = new zzdb(zzcw.zza("com.google.android.gms.measurement"));
        zza = zzdb.zza("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        zzb = zzdb.zza("measurement.audience.refresh_event_count_filters_timestamp", false);
        zzc = zzdb.zza("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        zzd = zzdb.zza("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
}
