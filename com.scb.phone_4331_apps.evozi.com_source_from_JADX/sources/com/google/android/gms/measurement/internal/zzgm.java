package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

final class zzgm implements Callable<byte[]> {
    private final /* synthetic */ zzao zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzgd zzc;

    zzgm(zzgd zzgd, zzao zzao, String str) {
        this.zzc = zzgd;
        this.zza = zzao;
        this.zzb = str;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.zzc.zza.zzo();
        return this.zzc.zza.zzg().zza(this.zza, this.zzb);
    }
}
