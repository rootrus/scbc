package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzdk<T> extends zzdi<T> {
    private final T zza;

    zzdk(T t) {
        this.zza = t;
    }

    public final boolean zza() {
        return true;
    }

    public final T zzb() {
        return this.zza;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof zzdk) {
            return this.zza.equals(((zzdk) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
