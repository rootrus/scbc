package com.google.android.gms.internal.measurement;

public final class zzjy implements zzjz {
    private static final zzcv<Boolean> zza;
    private static final zzcv<Boolean> zzb;
    private static final zzcv<Boolean> zzc;
    private static final zzcv<Boolean> zzd;
    private static final zzcv<Boolean> zze;
    private static final zzcv<Boolean> zzf;

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

    public final boolean zzf() {
        return zze.zzc().booleanValue();
    }

    public final boolean zzg() {
        return zzf.zzc().booleanValue();
    }

    static {
        zzdb zzdb = new zzdb(zzcw.zza("com.google.android.gms.measurement"));
        zza = zzdb.zza("measurement.gold.enhanced_ecommerce.format_logs", true);
        zzb = zzdb.zza("measurement.gold.enhanced_ecommerce.log_nested_complex_events", true);
        zzc = zzdb.zza("measurement.gold.enhanced_ecommerce.nested_param_daily_event_count", true);
        zzd = zzdb.zza("measurement.gold.enhanced_ecommerce.updated_schema.client", true);
        zze = zzdb.zza("measurement.gold.enhanced_ecommerce.updated_schema.service", true);
        zzf = zzdb.zza("measurement.gold.enhanced_ecommerce.upload_nested_complex_events", true);
    }
}
