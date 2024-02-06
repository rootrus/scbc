package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

final class zzfw<V> extends FutureTask<V> implements Comparable<zzfw<V>> {
    final boolean zza;
    private final long zzb;
    private final String zzc;
    private final /* synthetic */ zzfv zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfw(zzfv zzfv, Callable<V> callable, boolean z, String str) {
        super(callable);
        this.zzd = zzfv;
        Preconditions.checkNotNull(str);
        long andIncrement = zzfv.zzj.getAndIncrement();
        this.zzb = andIncrement;
        this.zzc = str;
        this.zza = z;
        if (andIncrement == Long.MAX_VALUE) {
            zzfv.zzr().zzf().zza("Tasks index overflow");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfw(zzfv zzfv, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.zzd = zzfv;
        Preconditions.checkNotNull(str);
        long andIncrement = zzfv.zzj.getAndIncrement();
        this.zzb = andIncrement;
        this.zzc = str;
        this.zza = false;
        if (andIncrement == Long.MAX_VALUE) {
            zzfv.zzr().zzf().zza("Tasks index overflow");
        }
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.zzd.zzr().zzf().zza(this.zzc, th);
        if (th instanceof zzfu) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        zzfw zzfw = (zzfw) obj;
        boolean z = this.zza;
        if (z != zzfw.zza) {
            return z ? -1 : 1;
        }
        int i = (this.zzb > zzfw.zzb ? 1 : (this.zzb == zzfw.zzb ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        this.zzd.zzr().zzg().zza("Two tasks share the same index. index", Long.valueOf(this.zzb));
        return 0;
    }
}
