package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Locale;

public final class zzlm implements zzgz {
    public final zzoa<?> zzb(zzfl zzfl, zzoa<?>... zzoaArr) {
        boolean z = false;
        Preconditions.checkArgument(zzoaArr != null);
        if (zzoaArr.length == 0) {
            z = true;
        }
        Preconditions.checkArgument(z);
        return new zzom(Locale.getDefault().getCountry());
    }
}
