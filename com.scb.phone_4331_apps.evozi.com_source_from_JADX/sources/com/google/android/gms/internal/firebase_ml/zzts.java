package com.google.android.gms.internal.firebase_ml;

import okhttp3.internal.http2.Settings;

final class zzts {
    private final int number;
    private final Object object;

    zzts(Object obj, int i) {
        this.object = obj;
        this.number = i;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.object) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.number;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzts)) {
            return false;
        }
        zzts zzts = (zzts) obj;
        if (this.object == zzts.object && this.number == zzts.number) {
            return true;
        }
        return false;
    }
}
