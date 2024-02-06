package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;

public class zzfb {
    private static volatile boolean zza = false;
    private static boolean zzb = true;
    private static volatile zzfb zzc;
    private static volatile zzfb zzd;
    private static final zzfb zze = new zzfb(true);
    private final Map<zza, zzfo.zzd<?, ?>> zzf;

    public static zzfb zza() {
        zzfb zzfb = zzc;
        if (zzfb == null) {
            synchronized (zzfb.class) {
                zzfb = zzc;
                if (zzfb == null) {
                    zzfb = zze;
                    zzc = zzfb;
                }
            }
        }
        return zzfb;
    }

    static final class zza {
        private final Object zza;
        private final int zzb;

        zza(Object obj, int i) {
            this.zza = obj;
            this.zzb = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zza2 = (zza) obj;
            if (this.zza == zza2.zza && this.zzb == zza2.zzb) {
                return true;
            }
            return false;
        }
    }

    public static zzfb zzb() {
        Class<zzfb> cls = zzfb.class;
        zzfb zzfb = zzd;
        if (zzfb != null) {
            return zzfb;
        }
        synchronized (cls) {
            zzfb zzfb2 = zzd;
            if (zzfb2 != null) {
                return zzfb2;
            }
            zzfb zza2 = zzfn.zza(cls);
            zzd = zza2;
            return zza2;
        }
    }

    public final <ContainingType extends zzgw> zzfo.zzd<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return this.zzf.get(new zza(containingtype, i));
    }

    zzfb() {
        this.zzf = new HashMap();
    }

    private zzfb(boolean z) {
        this.zzf = Collections.emptyMap();
    }
}
