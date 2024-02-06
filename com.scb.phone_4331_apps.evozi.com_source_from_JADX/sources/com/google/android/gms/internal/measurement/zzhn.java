package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfo;

final class zzhn implements zzgu {
    private final zzgw zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    zzhn(zzgw zzgw, String str, Object[] objArr) {
        this.zza = zzgw;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 1;
        int i2 = 13;
        while (true) {
            char charAt2 = str.charAt(i);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i2;
                i2 += 13;
                i++;
            } else {
                this.zzd = c | (charAt2 << i2);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final String zzd() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zze() {
        return this.zzc;
    }

    public final zzgw zzc() {
        return this.zza;
    }

    public final int zza() {
        return (this.zzd & 1) == 1 ? zzfo.zzf.zzh : zzfo.zzf.zzi;
    }

    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }
}
