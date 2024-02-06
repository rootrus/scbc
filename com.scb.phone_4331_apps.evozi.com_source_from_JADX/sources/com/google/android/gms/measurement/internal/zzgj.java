package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class zzgj implements Callable<List<zzw>> {
    private final /* synthetic */ zzn zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzgd zzd;

    zzgj(zzgd zzgd, zzn zzn, String str, String str2) {
        this.zzd = zzgd;
        this.zza = zzn;
        this.zzb = str;
        this.zzc = str2;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.zzd.zza.zzo();
        return this.zzd.zza.zze().zzb(this.zza.zza, this.zzb, this.zzc);
    }
}
