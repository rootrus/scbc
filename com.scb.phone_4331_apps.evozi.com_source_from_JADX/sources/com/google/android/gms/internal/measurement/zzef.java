package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

final class zzef extends zzeh {
    private int zza = 0;
    private final int zzb = this.zzc.zza();
    private final /* synthetic */ zzeg zzc;

    zzef(zzeg zzeg) {
        this.zzc = zzeg;
    }

    public final boolean hasNext() {
        return this.zza < this.zzb;
    }

    public final byte zza() {
        int i = this.zza;
        if (i < this.zzb) {
            this.zza = i + 1;
            return this.zzc.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
