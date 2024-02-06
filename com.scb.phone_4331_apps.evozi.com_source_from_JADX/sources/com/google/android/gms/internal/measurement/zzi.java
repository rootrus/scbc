package com.google.android.gms.internal.measurement;

public final class zzi {
    private static final zzj zza;
    private static volatile zzj zzb;

    public static zzj zza() {
        return zzb;
    }

    static {
        zzk zzk = new zzk();
        zza = zzk;
        zzb = zzk;
    }
}
