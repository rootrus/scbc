package com.google.android.gms.internal.firebase_ml;

import java.util.Map;

final class zzvk implements zzvj {
    zzvk() {
    }

    public final Map<?, ?> zzu(Object obj) {
        return (zzvi) obj;
    }

    public final zzvh<?, ?> zzz(Object obj) {
        return ((zzvg) obj).zzsa();
    }

    public final Map<?, ?> zzv(Object obj) {
        return (zzvi) obj;
    }

    public final boolean zzw(Object obj) {
        return !((zzvi) obj).isMutable();
    }

    public final Object zzx(Object obj) {
        ((zzvi) obj).zzpt();
        return obj;
    }

    public final Object zzy(Object obj) {
        return zzvi.zzsb().zzsc();
    }

    public final Object zzf(Object obj, Object obj2) {
        zzvi zzvi = (zzvi) obj;
        zzvi zzvi2 = (zzvi) obj2;
        if (!zzvi2.isEmpty()) {
            if (!zzvi.isMutable()) {
                zzvi = zzvi.zzsc();
            }
            zzvi.zza(zzvi2);
        }
        return zzvi;
    }

    public final int zzd(int i, Object obj, Object obj2) {
        zzvi zzvi = (zzvi) obj;
        zzvg zzvg = (zzvg) obj2;
        int i2 = 0;
        if (zzvi.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : zzvi.entrySet()) {
            i2 += zzvg.zzc(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }
}
