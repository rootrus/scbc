package com.google.android.gms.internal.measurement;

public final class zzmr implements zzmo {
    private static final zzcv<Boolean> zza;
    private static final zzcv<Double> zzb;
    private static final zzcv<Long> zzc;
    private static final zzcv<Long> zzd;
    private static final zzcv<String> zze;

    public final boolean zza() {
        return zza.zzc().booleanValue();
    }

    public final double zzb() {
        return zzb.zzc().doubleValue();
    }

    public final long zzc() {
        return zzc.zzc().longValue();
    }

    public final long zzd() {
        return zzd.zzc().longValue();
    }

    public final String zze() {
        return zze.zzc();
    }

    static {
        zzdb zzdb = new zzdb(zzcw.zza("com.google.android.gms.measurement"));
        zza = zzdb.zza("measurement.test.boolean_flag", false);
        zzb = zzdb.zza("measurement.test.double_flag", -3.0d);
        zzc = zzdb.zza("measurement.test.int_flag", -2);
        zzd = zzdb.zza("measurement.test.long_flag", -1);
        zze = zzdb.zza("measurement.test.string_flag", "---");
    }
}
