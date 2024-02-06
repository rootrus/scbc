package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

public final class zzjs extends zzhb {
    /* access modifiers changed from: protected */
    public final zzoa<?> zza(zzfl zzfl, zzoa<?>... zzoaArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaArr.length == 2 || zzoaArr.length == 3);
        Preconditions.checkArgument(zzoaArr[0] instanceof zzom);
        String str = (String) zzoaArr[0].value();
        String zzd = zzha.zzd(zzoaArr[1]);
        double d = Double.POSITIVE_INFINITY;
        if (zzoaArr.length == 3 && !Double.isNaN(zzha.zzb(zzoaArr[2]))) {
            d = zzha.zzc(zzoaArr[2]);
        }
        return new zzoe(Double.valueOf((double) str.lastIndexOf(zzd, (int) Math.min(Math.max(d, 0.0d), (double) str.length()))));
    }
}
