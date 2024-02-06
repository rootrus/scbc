package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Locale;

public final class zzll implements zzgz {
    public final zzoa<?> zzb(zzfl zzfl, zzoa<?>... zzoaArr) {
        boolean z = false;
        Preconditions.checkArgument(zzoaArr != null);
        if (zzoaArr.length == 0) {
            z = true;
        }
        Preconditions.checkArgument(z);
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return new zzom("");
        }
        String language = locale.getLanguage();
        if (language == null) {
            return new zzom("");
        }
        return new zzom(language.toLowerCase());
    }
}
