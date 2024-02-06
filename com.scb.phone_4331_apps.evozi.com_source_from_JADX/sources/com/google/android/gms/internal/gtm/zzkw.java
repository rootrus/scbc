package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.gms.common.internal.Preconditions;

public final class zzkw implements zzgz {
    private final Context zzrm;

    public zzkw(Context context) {
        this.zzrm = (Context) Preconditions.checkNotNull(context);
    }

    public final zzoa<?> zzb(zzfl zzfl, zzoa<?>... zzoaArr) {
        String networkOperatorName;
        boolean z = false;
        Preconditions.checkArgument(zzoaArr != null);
        if (zzoaArr.length == 0) {
            z = true;
        }
        Preconditions.checkArgument(z);
        TelephonyManager telephonyManager = (TelephonyManager) this.zzrm.getSystemService("phone");
        zzog zzog = zzog.zzaum;
        return (telephonyManager == null || (networkOperatorName = telephonyManager.getNetworkOperatorName()) == null) ? zzog : new zzom(networkOperatorName);
    }
}
