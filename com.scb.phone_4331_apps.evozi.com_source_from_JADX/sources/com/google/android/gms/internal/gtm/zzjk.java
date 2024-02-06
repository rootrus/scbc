package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

public final class zzjk extends zzhb {
    /* access modifiers changed from: protected */
    public final zzoa<?> zza(zzfl zzfl, zzoa<?>... zzoaArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaArr.length == 2);
        zzog zzog = zzoaArr[0];
        zzog zzog2 = zzoaArr[1];
        if ((!(zzog instanceof zzog) || zzog == zzog.zzaum || zzog == zzog.zzaul) && (!(zzog2 instanceof zzog) || zzog2 == zzog.zzaum || zzog2 == zzog.zzaul)) {
            if ((zzog instanceof zzok) || (zzog instanceof zzoh) || (zzog instanceof zzof)) {
                zzog = new zzom(zzha.zzd(zzog));
            }
            if ((zzog2 instanceof zzok) || (zzog2 instanceof zzoh) || (zzog2 instanceof zzof)) {
                zzog2 = new zzom(zzha.zzd(zzog2));
            }
            if (!(zzog instanceof zzom) && !(zzog2 instanceof zzom)) {
                return new zzoe(Double.valueOf(zzha.zza(zzog, zzog2)));
            }
            String valueOf = String.valueOf(zzha.zzd(zzog));
            String valueOf2 = String.valueOf(zzha.zzd(zzog2));
            return new zzom(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        }
        throw new IllegalArgumentException("Illegal InternalType passed to Add.");
    }
}
