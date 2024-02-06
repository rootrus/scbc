package com.google.android.gms.internal.firebase_ml;

import android.os.SystemClock;
import com.google.android.gms.internal.firebase_ml.zzmd;

final /* synthetic */ class zzqk implements zznv {
    private final long zzaue;
    private final zzmk zzazu;
    private final zzpz zzazv;

    zzqk(long j, zzmk zzmk, zzpz zzpz) {
        this.zzaue = j;
        this.zzazu = zzmk;
        this.zzazv = zzpz;
    }

    public final zzmd.zzq.zza zzm() {
        long j = this.zzaue;
        zzmk zzmk = this.zzazu;
        zzpz zzpz = this.zzazv;
        return zzmd.zzq.zzjx().zzb(zzmd.zzab.zzle().zzh(zzmd.zzs.zzkb().zzn(SystemClock.elapsedRealtime() - j).zzc(zzmk).zzz(zzqj.zzata).zzaa(true).zzab(true)).zze(zzpv.zzc(zzpz)));
    }
}
