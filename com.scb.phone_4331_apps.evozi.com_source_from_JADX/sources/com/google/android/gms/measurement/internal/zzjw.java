package com.google.android.gms.measurement.internal;

final class zzjw {
    final /* synthetic */ zzjv zza;
    private zzjz zzb;

    zzjw(zzjv zzjv) {
        this.zza = zzjv;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        this.zza.zzd();
        if (this.zza.zzt().zza(zzaq.zzbo) && this.zzb != null) {
            this.zza.zzc.removeCallbacks(this.zzb);
        }
        if (this.zza.zzt().zza(zzaq.zzcc)) {
            this.zza.zzs().zzr.zza(false);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(long j) {
        if (this.zza.zzt().zza(zzaq.zzbo)) {
            this.zzb = new zzjz(this, this.zza.zzm().currentTimeMillis(), j);
            this.zza.zzc.postDelayed(this.zzb, 2000);
        }
    }
}
