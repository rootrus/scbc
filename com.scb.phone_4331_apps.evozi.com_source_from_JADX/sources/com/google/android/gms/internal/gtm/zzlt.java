package com.google.android.gms.internal.gtm;

import android.os.Build;
import com.google.android.gms.common.internal.Preconditions;

public final class zzlt implements zzgz {
    public final zzoa<?> zzb(zzfl zzfl, zzoa<?>... zzoaArr) {
        boolean z = false;
        Preconditions.checkArgument(zzoaArr != null);
        if (zzoaArr.length == 0) {
            z = true;
        }
        Preconditions.checkArgument(z);
        int i = Build.VERSION.SDK_INT;
        StringBuilder sb = new StringBuilder(16);
        sb.append("5.06-");
        sb.append(i);
        return new zzom(sb.toString());
    }
}
