package com.google.android.gms.measurement.internal;

final class zzhx implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ zzhc zzb;

    zzhx(zzhc zzhc, boolean z) {
        this.zzb = zzhc;
        this.zza = z;
    }

    public final void run() {
        boolean zzab = this.zzb.zzy.zzab();
        boolean zzaa = this.zzb.zzy.zzaa();
        this.zzb.zzy.zza(this.zza);
        if (zzaa == this.zza) {
            this.zzb.zzy.zzr().zzx().zza("Default data collection state already set to", Boolean.valueOf(this.zza));
        }
        if (this.zzb.zzy.zzab() == zzab || this.zzb.zzy.zzab() != this.zzb.zzy.zzaa()) {
            this.zzb.zzy.zzr().zzk().zza("Default data collection is different than actual status", Boolean.valueOf(this.zza), Boolean.valueOf(zzab));
        }
        this.zzb.zzam();
    }
}
