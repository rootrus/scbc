package com.google.firebase.analytics;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzag;

public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics zza;
    private final zzag zzb;
    private final Object zze = new Object();

    public static FirebaseAnalytics getInstance(Context context) {
        if (zza == null) {
            synchronized (FirebaseAnalytics.class) {
                if (zza == null) {
                    zza = new FirebaseAnalytics(zzag.zza(context));
                }
            }
        }
        return zza;
    }

    public final void logEvent(String str, Bundle bundle) {
        this.zzb.zza(str, bundle);
    }

    public final void setUserId(String str) {
        this.zzb.zza(str);
    }

    private FirebaseAnalytics(zzag zzag) {
        Preconditions.checkNotNull(zzag);
        this.zzb = zzag;
    }
}
