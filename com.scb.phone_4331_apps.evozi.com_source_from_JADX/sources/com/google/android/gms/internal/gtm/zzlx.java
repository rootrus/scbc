package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

public final class zzlx extends zzhb {
    /* access modifiers changed from: protected */
    public final zzoa<?> zza(zzfl zzfl, zzoa<?>... zzoaArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaArr.length == 2);
        return new zzod(Boolean.valueOf(zzha.zzd(zzoaArr[0]).endsWith(zzha.zzd(zzoaArr[1]))));
    }
}
