package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

public final class zzlq implements zzgz {
    public final zzoa<?> zzb(zzfl zzfl, zzoa<?>... zzoaArr) {
        boolean z = false;
        Preconditions.checkArgument(zzoaArr != null);
        if (zzoaArr.length == 0) {
            z = true;
        }
        Preconditions.checkArgument(z);
        return new zzom("Android");
    }
}
