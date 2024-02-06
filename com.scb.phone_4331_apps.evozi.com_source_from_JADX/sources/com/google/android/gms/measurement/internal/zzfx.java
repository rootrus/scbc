package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;

final class zzfx implements Thread.UncaughtExceptionHandler {
    private final String zza;
    private final /* synthetic */ zzfv zzb;

    public zzfx(zzfv zzfv, String str) {
        this.zzb = zzfv;
        Preconditions.checkNotNull(str);
        this.zza = str;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        synchronized (this) {
            this.zzb.zzr().zzf().zza(this.zza, th);
        }
    }
}
