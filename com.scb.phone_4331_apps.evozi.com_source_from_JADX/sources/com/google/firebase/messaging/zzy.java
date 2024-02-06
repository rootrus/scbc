package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

final class zzy {
    private static WeakReference<zzy> zza;
    private final SharedPreferences zzb;
    private zzx zzc;
    private final Executor zzd;

    private zzy(SharedPreferences sharedPreferences, Executor executor) {
        this.zzd = executor;
        this.zzb = sharedPreferences;
    }

    private final void zzb() {
        synchronized (this) {
            this.zzc = zzx.zza(this.zzb, "topic_operation_queue", ",", this.zzd);
        }
    }

    public static zzy zza(Context context, Executor executor) {
        zzy zzy;
        synchronized (zzy.class) {
            zzy = zza != null ? zza.get() : null;
            if (zzy == null) {
                zzy = new zzy(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                zzy.zzb();
                zza = new WeakReference<>(zzy);
            }
        }
        return zzy;
    }

    /* access modifiers changed from: package-private */
    public final zzz zza() {
        zzz zzc2;
        synchronized (this) {
            zzc2 = zzz.zzc(this.zzc.zza());
        }
        return zzc2;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzb(zzz zzz) {
        boolean zza2;
        synchronized (this) {
            zza2 = this.zzc.zza((Object) zzz.zzc());
        }
        return zza2;
    }
}
