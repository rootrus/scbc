package com.google.android.gms.internal.measurement;

final class zzgp implements zzgx {
    private zzgx[] zza;

    zzgp(zzgx... zzgxArr) {
        this.zza = zzgxArr;
    }

    public final boolean zza(Class<?> cls) {
        for (zzgx zza2 : this.zza) {
            if (zza2.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    public final zzgu zzb(Class<?> cls) {
        for (zzgx zzgx : this.zza) {
            if (zzgx.zza(cls)) {
                return zzgx.zzb(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
