package com.google.android.gms.common.wrappers;

import android.content.Context;

public class Wrappers {
    private static Wrappers zziq = new Wrappers();
    private PackageManagerWrapper zzip = null;

    private final PackageManagerWrapper zzj(Context context) {
        PackageManagerWrapper packageManagerWrapper;
        synchronized (this) {
            if (this.zzip == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.zzip = new PackageManagerWrapper(context);
            }
            packageManagerWrapper = this.zzip;
        }
        return packageManagerWrapper;
    }

    public static PackageManagerWrapper packageManager(Context context) {
        return zziq.zzj(context);
    }
}
