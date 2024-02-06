package com.google.android.gms.internal.firebase_ml;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzkt<T> extends zzko<T> {
    private final T zzabi;

    zzkt(T t) {
        this.zzabi = t;
    }

    public final boolean isPresent() {
        return true;
    }

    public final T get() {
        return this.zzabi;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof zzkt) {
            return this.zzabi.equals(((zzkt) obj).zzabi);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzabi.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzabi);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
