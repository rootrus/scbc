package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

public final class zzkn extends zzhb {
    /* access modifiers changed from: protected */
    public final zzoa<?> zza(zzfl zzfl, zzoa<?>... zzoaArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaArr.length == 2);
        Preconditions.checkArgument(zzoaArr[0] instanceof zzom);
        String zzd = zzha.zzd(zzoaArr[1]);
        String str = (String) zzoaArr[0].value();
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 101) {
            if (hashCode != 105) {
                if (hashCode != 118) {
                    if (hashCode == 119 && str.equals("w")) {
                        c = 3;
                    }
                } else if (str.equals("v")) {
                    c = 2;
                }
            } else if (str.equals("i")) {
                c = 1;
            }
        } else if (str.equals("e")) {
            c = 0;
        }
        if (c == 0) {
            zzev.zzav(zzd);
        } else if (c == 1) {
            zzev.zzaw(zzd);
        } else if (c == 2) {
            zzev.zzab(zzd);
        } else if (c != 3) {
            String valueOf = String.valueOf((String) zzoaArr[0].value());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid logging level: ".concat(valueOf) : new String("Invalid logging level: "));
        } else {
            zzev.zzac(zzd);
        }
        return zzog.zzaum;
    }
}
