package com.google.android.gms.internal.measurement;

import java.util.List;

abstract class zzgg {
    private static final zzgg zza = new zzgi();
    private static final zzgg zzb = new zzgl();

    private zzgg() {
    }

    /* access modifiers changed from: package-private */
    public abstract <L> List<L> zza(Object obj, long j);

    /* access modifiers changed from: package-private */
    public abstract <L> void zza(Object obj, Object obj2, long j);

    /* access modifiers changed from: package-private */
    public abstract void zzb(Object obj, long j);

    static zzgg zza() {
        return zza;
    }

    static zzgg zzb() {
        return zzb;
    }
}
