package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.common.internal.Objects;

public final class zznt<T> {
    private final String zzapl;
    private final T zzapm;

    public static <T> zznt<T> zzj(String str, T t) {
        return new zznt<>(str, t);
    }

    private zznt(String str, T t) {
        if (str != null) {
            this.zzapl = str;
            if (t != null) {
                this.zzapm = t;
                return;
            }
            throw new NullPointerException("Null options");
        }
        throw new NullPointerException("Null firebasePersistentKey");
    }

    public final String toString() {
        String str = this.zzapl;
        String valueOf = String.valueOf(this.zzapm);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 58 + String.valueOf(valueOf).length());
        sb.append("MlModelDriverInstanceKey{firebasePersistentKey=");
        sb.append(str);
        sb.append(", options=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zznt)) {
            return false;
        }
        zznt zznt = (zznt) obj;
        if (!this.zzapl.equals(zznt.zzapl) || !this.zzapm.equals(zznt.zzapm)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzapl, this.zzapm);
    }
}
