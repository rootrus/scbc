package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class zzdm {
    public static <T> zzdj<T> zza(zzdj<T> zzdj) {
        if ((zzdj instanceof zzdo) || (zzdj instanceof zzdl)) {
            return zzdj;
        }
        if (zzdj instanceof Serializable) {
            return new zzdl(zzdj);
        }
        return new zzdo(zzdj);
    }

    public static <T> zzdj<T> zza(@NullableDecl T t) {
        return new zzdn(t);
    }
}
