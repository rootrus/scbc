package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

public final class zzkx implements zzgz {
    private final zzoa<?> zzaro;

    public zzkx(zzoa<?> zzoa) {
        this.zzaro = (zzoa) Preconditions.checkNotNull(zzoa);
    }

    public final zzoa<?> zzb(zzfl zzfl, zzoa<?>... zzoaArr) {
        boolean z = false;
        Preconditions.checkArgument(zzoaArr != null);
        if (zzoaArr.length == 0) {
            z = true;
        }
        Preconditions.checkArgument(z);
        return this.zzaro;
    }
}
