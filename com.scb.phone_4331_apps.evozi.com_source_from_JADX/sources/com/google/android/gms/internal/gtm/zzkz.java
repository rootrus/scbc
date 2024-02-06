package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

public final class zzkz implements zzgz {
    private Clock zzsd = DefaultClock.getInstance();

    public final zzoa<?> zzb(zzfl zzfl, zzoa<?>... zzoaArr) {
        boolean z = false;
        Preconditions.checkArgument(zzoaArr != null);
        if (zzoaArr.length == 0) {
            z = true;
        }
        Preconditions.checkArgument(z);
        return new zzoe(Double.valueOf((double) this.zzsd.currentTimeMillis()));
    }

    public final void zza(Clock clock) {
        this.zzsd = (Clock) Preconditions.checkNotNull(clock);
    }
}
