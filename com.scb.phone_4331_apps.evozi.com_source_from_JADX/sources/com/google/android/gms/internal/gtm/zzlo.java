package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.common.internal.Preconditions;

public final class zzlo implements zzgz {
    private final Context zzrm;

    public zzlo(Context context) {
        this.zzrm = (Context) Preconditions.checkNotNull(context);
    }

    public final zzoa<?> zzb(zzfl zzfl, zzoa<?>... zzoaArr) {
        boolean z = false;
        Preconditions.checkArgument(zzoaArr != null);
        if (zzoaArr.length == 0) {
            z = true;
        }
        Preconditions.checkArgument(z);
        String string = Settings.Secure.getString(this.zzrm.getContentResolver(), "android_id");
        return string != null ? new zzom(string) : zzog.zzaum;
    }
}
