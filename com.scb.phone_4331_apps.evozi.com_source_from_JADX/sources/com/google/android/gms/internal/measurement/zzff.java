package com.google.android.gms.internal.measurement;

final class zzff {
    private static final zzfd<?> zza = new zzfc();
    private static final zzfd<?> zzb = zzc();

    private static zzfd<?> zzc() {
        try {
            return (zzfd) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static zzfd<?> zza() {
        return zza;
    }

    static zzfd<?> zzb() {
        zzfd<?> zzfd = zzb;
        if (zzfd != null) {
            return zzfd;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
