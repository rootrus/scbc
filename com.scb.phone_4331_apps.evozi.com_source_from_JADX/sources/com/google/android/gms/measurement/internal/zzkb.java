package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzkt;
import com.google.android.gms.internal.measurement.zzla;
import com.google.android.gms.internal.measurement.zzlf;

final class zzkb {
    private long zza;
    private long zzb;
    private final zzag zzc = new zzka(this, this.zzd.zzy);
    private final /* synthetic */ zzjv zzd;

    public zzkb(zzjv zzjv) {
        this.zzd = zzjv;
        long elapsedRealtime = zzjv.zzm().elapsedRealtime();
        this.zza = elapsedRealtime;
        this.zzb = elapsedRealtime;
    }

    /* access modifiers changed from: package-private */
    public final void zza(long j) {
        this.zzd.zzd();
        this.zzc.zzc();
        this.zza = j;
        this.zzb = j;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(long j) {
        this.zzc.zzc();
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        this.zzc.zzc();
        this.zza = 0;
        this.zzb = 0;
    }

    /* access modifiers changed from: private */
    public final void zzc() {
        this.zzd.zzd();
        zza(false, false, this.zzd.zzm().elapsedRealtime());
        this.zzd.zze().zza(this.zzd.zzm().elapsedRealtime());
    }

    public final boolean zza(boolean z, boolean z2, long j) {
        this.zzd.zzd();
        this.zzd.zzw();
        if (!zzkt.zzb() || !this.zzd.zzt().zza(zzaq.zzbz)) {
            j = this.zzd.zzm().elapsedRealtime();
        }
        if (!zzla.zzb() || !this.zzd.zzt().zza(zzaq.zzbv) || this.zzd.zzy.zzab()) {
            this.zzd.zzs().zzp.zza(this.zzd.zzm().currentTimeMillis());
        }
        long j2 = j - this.zza;
        if (z || j2 >= 1000) {
            if (this.zzd.zzt().zza(zzaq.zzat) && !z2) {
                j2 = (!zzlf.zzb() || !this.zzd.zzt().zza(zzaq.zzav) || !zzkt.zzb() || !this.zzd.zzt().zza(zzaq.zzbz)) ? zzb() : zzc(j);
            }
            this.zzd.zzr().zzx().zza("Recording user engagement, ms", Long.valueOf(j2));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            zzii.zza(this.zzd.zzi().zza(!this.zzd.zzt().zzj().booleanValue()), bundle, true);
            if (this.zzd.zzt().zza(zzaq.zzat) && !this.zzd.zzt().zza(zzaq.zzau) && z2) {
                bundle.putLong("_fr", 1);
            }
            if (!this.zzd.zzt().zza(zzaq.zzau) || !z2) {
                this.zzd.zzf().zza("auto", "_e", bundle);
            }
            this.zza = j;
            this.zzc.zzc();
            this.zzc.zza(3600000);
            return true;
        }
        this.zzd.zzr().zzx().zza("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
        return false;
    }

    /* access modifiers changed from: package-private */
    public final long zzb() {
        long elapsedRealtime = this.zzd.zzm().elapsedRealtime();
        long j = this.zzb;
        this.zzb = elapsedRealtime;
        return elapsedRealtime - j;
    }

    /* access modifiers changed from: package-private */
    public final long zzc(long j) {
        long j2 = this.zzb;
        this.zzb = j;
        return j - j2;
    }
}
