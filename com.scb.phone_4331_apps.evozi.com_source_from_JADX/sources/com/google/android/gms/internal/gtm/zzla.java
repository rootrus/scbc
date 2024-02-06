package com.google.android.gms.internal.gtm;

import android.os.Build;
import com.google.android.gms.common.internal.Preconditions;

public final class zzla implements zzgz {
    private final String zzarp = Build.BRAND;

    public final zzoa<?> zzb(zzfl zzfl, zzoa<?>... zzoaArr) {
        boolean z = false;
        Preconditions.checkArgument(zzoaArr != null);
        if (zzoaArr.length == 0) {
            z = true;
        }
        Preconditions.checkArgument(z);
        return new zzom(this.zzarp);
    }
}
