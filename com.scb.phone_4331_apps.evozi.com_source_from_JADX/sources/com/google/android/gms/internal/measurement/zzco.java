package com.google.android.gms.internal.measurement;

import android.os.Binder;

public final /* synthetic */ class zzco {
    public static <V> V zza(zzcn<V> zzcn) {
        long clearCallingIdentity;
        try {
            return zzcn.zza();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V zza = zzcn.zza();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return zza;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
