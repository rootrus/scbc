package com.google.android.gms.internal.measurement;

import java.util.List;

final class zzgl extends zzgg {
    private zzgl() {
        super();
    }

    /* access modifiers changed from: package-private */
    public final <L> List<L> zza(Object obj, long j) {
        zzfx zzc = zzc(obj, j);
        if (zzc.zza()) {
            return zzc;
        }
        int size = zzc.size();
        zzfx zza = zzc.zza(size == 0 ? 10 : size << 1);
        zzin.zza(obj, j, (Object) zza);
        return zza;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object obj, long j) {
        zzc(obj, j).zzb();
    }

    /* access modifiers changed from: package-private */
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzfx zzc = zzc(obj, j);
        zzfx zzc2 = zzc(obj2, j);
        int size = zzc.size();
        int size2 = zzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzc.zza()) {
                zzc = zzc.zza(size2 + size);
            }
            zzc.addAll(zzc2);
        }
        if (size > 0) {
            zzc2 = zzc;
        }
        zzin.zza(obj, j, (Object) zzc2);
    }

    private static <E> zzfx<E> zzc(Object obj, long j) {
        return (zzfx) zzin.zzf(obj, j);
    }
}
