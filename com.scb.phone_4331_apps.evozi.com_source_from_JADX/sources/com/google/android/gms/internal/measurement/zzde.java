package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p040o.setTextAppearance;

public final class zzde implements zzcl {
    private static final Map<String, zzde> zza = new setTextAppearance();
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc = new zzdd(this);
    private final Object zzd = new Object();
    private volatile Map<String, ?> zze;
    private final List<zzcm> zzf = new ArrayList();

    static zzde zza(Context context, String str) {
        zzde zzde;
        if (!((!zzci.zza() || str.startsWith("direct_boot:")) ? true : zzci.zza(context))) {
            return null;
        }
        synchronized (zzde.class) {
            zzde = zza.get(str);
            if (zzde == null) {
                zzde = new zzde(zzb(context, str));
                zza.put(str, zzde);
            }
        }
        return zzde;
    }

    private static SharedPreferences zzb(Context context, String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (str.startsWith("direct_boot:")) {
                if (zzci.zza()) {
                    context = context.createDeviceProtectedStorageContext();
                }
                return context.getSharedPreferences(str.substring(12), 0);
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return sharedPreferences;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private zzde(SharedPreferences sharedPreferences) {
        this.zzb = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.zzc);
    }

    /* JADX INFO: finally extract failed */
    public final Object zza(String str) {
        Map<String, ?> map = this.zze;
        if (map == null) {
            synchronized (this.zzd) {
                map = this.zze;
                if (map == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        Map<String, ?> all = this.zzb.getAll();
                        this.zze = all;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = all;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    static void zza() {
        synchronized (zzde.class) {
            for (zzde next : zza.values()) {
                next.zzb.unregisterOnSharedPreferenceChangeListener(next.zzc);
            }
            zza.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str) {
        synchronized (this.zzd) {
            this.zze = null;
            zzcv.zza();
        }
        synchronized (this) {
            for (zzcm zza2 : this.zzf) {
                zza2.zza();
            }
        }
    }
}
