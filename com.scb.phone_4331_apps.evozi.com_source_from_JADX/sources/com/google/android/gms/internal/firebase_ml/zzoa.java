package com.google.android.gms.internal.firebase_ml;

import android.os.SystemClock;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.firebase.FirebaseApp;

public final class zzoa {
    private static final GmsLogger zzaoz = new GmsLogger("SharedPrefManager", "");

    public static boolean zzc(FirebaseApp firebaseApp) {
        boolean z;
        synchronized (zzoa.class) {
            z = firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getBoolean(String.format("logging_%s_%s", new Object[]{"vision", firebaseApp.getPersistenceKey()}), true);
        }
        return z;
    }

    public static void zza(FirebaseApp firebaseApp, boolean z) {
        synchronized (zzoa.class) {
            firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).edit().putBoolean(String.format("logging_%s_%s", new Object[]{"vision", firebaseApp.getPersistenceKey()}), z).apply();
        }
    }

    public static boolean zzd(FirebaseApp firebaseApp) {
        boolean z;
        synchronized (zzoa.class) {
            z = firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getBoolean(String.format("logging_%s_%s", new Object[]{"model", firebaseApp.getPersistenceKey()}), true);
        }
        return z;
    }

    public static void zzb(FirebaseApp firebaseApp, boolean z) {
        synchronized (zzoa.class) {
            firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).edit().putBoolean(String.format("logging_%s_%s", new Object[]{"model", firebaseApp.getPersistenceKey()}), z).apply();
        }
    }

    public static Long zza(FirebaseApp firebaseApp, String str) {
        synchronized (zzoa.class) {
            long j = firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getLong(String.format("downloading_model_id_%s_%s", new Object[]{firebaseApp.getPersistenceKey(), str}), -1);
            if (j < 0) {
                return null;
            }
            return Long.valueOf(j);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|(1:10)(1:11)|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        r3 = "Invalid model type ".concat(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        r3 = new java.lang.String("Invalid model type ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        r1.mo4174e("SharedPrefManager", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r1 = zzaoz;
        r3 = java.lang.String.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        if (r3.length() != 0) goto L_0x0031;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.firebase_ml.zzok zzb(com.google.firebase.FirebaseApp r3, java.lang.String r4) {
        /*
            java.lang.Class<com.google.android.gms.internal.firebase_ml.zzoa> r0 = com.google.android.gms.internal.firebase_ml.zzoa.class
            monitor-enter(r0)
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = "com.google.firebase.ml.internal"
            r2 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r1, r2)     // Catch:{ all -> 0x0046 }
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0046 }
            r1[r2] = r4     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = "downloading_model_type_%s"
            java.lang.String r4 = java.lang.String.format(r4, r1)     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = ""
            java.lang.String r3 = r3.getString(r4, r1)     // Catch:{ all -> 0x0046 }
            r4 = 0
            com.google.android.gms.internal.firebase_ml.zzok r4 = com.google.android.gms.internal.firebase_ml.zzok.zzbx(r3)     // Catch:{ IllegalArgumentException -> 0x0025 }
            goto L_0x0044
        L_0x0025:
            com.google.android.gms.common.internal.GmsLogger r1 = zzaoz     // Catch:{ all -> 0x0046 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0046 }
            int r2 = r3.length()     // Catch:{ all -> 0x0046 }
            if (r2 == 0) goto L_0x0038
            java.lang.String r2 = "Invalid model type "
            java.lang.String r3 = r2.concat(r3)     // Catch:{ all -> 0x0046 }
            goto L_0x003f
        L_0x0038:
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x0046 }
            java.lang.String r2 = "Invalid model type "
            r3.<init>(r2)     // Catch:{ all -> 0x0046 }
        L_0x003f:
            java.lang.String r2 = "SharedPrefManager"
            r1.mo4174e(r2, r3)     // Catch:{ all -> 0x0046 }
        L_0x0044:
            monitor-exit(r0)
            return r4
        L_0x0046:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzoa.zzb(com.google.firebase.FirebaseApp, java.lang.String):com.google.android.gms.internal.firebase_ml.zzok");
    }

    public static String zzc(FirebaseApp firebaseApp, String str) {
        String string;
        synchronized (zzoa.class) {
            string = firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getString(String.format("downloading_model_hash_%s_%s", new Object[]{firebaseApp.getPersistenceKey(), str}), (String) null);
        }
        return string;
    }

    public static String zzd(FirebaseApp firebaseApp, String str) {
        String string;
        synchronized (zzoa.class) {
            string = firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getString(String.format("current_model_hash_%s_%s", new Object[]{firebaseApp.getPersistenceKey(), str}), (String) null);
        }
        return string;
    }

    public static String zze(FirebaseApp firebaseApp, String str) {
        String string;
        synchronized (zzoa.class) {
            string = firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getString(String.format("bad_hash_%s_%s", new Object[]{firebaseApp.getPersistenceKey(), str}), (String) null);
        }
        return string;
    }

    public static String zze(FirebaseApp firebaseApp) {
        String string;
        synchronized (zzoa.class) {
            string = firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getString("app_version", (String) null);
        }
        return string;
    }

    public static long zzf(FirebaseApp firebaseApp, String str) {
        long j;
        synchronized (zzoa.class) {
            j = firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getLong(String.format("downloading_begin_time_%s_%s", new Object[]{firebaseApp.getPersistenceKey(), str}), 0);
        }
        return j;
    }

    public static long zzg(FirebaseApp firebaseApp, String str) {
        long j;
        synchronized (zzoa.class) {
            j = firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getLong(String.format("model_first_use_time_%s_%s", new Object[]{firebaseApp.getPersistenceKey(), str}), 0);
        }
        return j;
    }

    public static void zza(FirebaseApp firebaseApp, String str, long j) {
        synchronized (zzoa.class) {
            firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).edit().putLong(String.format("model_first_use_time_%s_%s", new Object[]{firebaseApp.getPersistenceKey(), str}), j).apply();
        }
    }

    public static void zzh(FirebaseApp firebaseApp, String str) {
        synchronized (zzoa.class) {
            String zzc = zzc(firebaseApp, str);
            firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).edit().remove(String.format("downloading_model_id_%s_%s", new Object[]{firebaseApp.getPersistenceKey(), str})).remove(String.format("downloading_model_hash_%s_%s", new Object[]{firebaseApp.getPersistenceKey(), str})).remove(String.format("downloading_model_type_%s", new Object[]{zzc})).remove(String.format("downloading_begin_time_%s_%s", new Object[]{firebaseApp.getPersistenceKey(), str})).remove(String.format("model_first_use_time_%s_%s", new Object[]{firebaseApp.getPersistenceKey(), str})).apply();
        }
    }

    public static void zzi(FirebaseApp firebaseApp, String str) {
        synchronized (zzoa.class) {
            firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).edit().remove(String.format("current_model_hash_%s_%s", new Object[]{firebaseApp.getPersistenceKey(), str})).apply();
        }
    }

    public static void zza(FirebaseApp firebaseApp, String str, String str2) {
        synchronized (zzoa.class) {
            firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).edit().putString(String.format("current_model_hash_%s_%s", new Object[]{firebaseApp.getPersistenceKey(), str}), str2).apply();
        }
    }

    public static void zza(FirebaseApp firebaseApp, long j, zzop zzop) {
        synchronized (zzoa.class) {
            String modelName = zzop.getModelName();
            String zzmd = zzop.zzmd();
            zzok zzme = zzop.zzme();
            firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).edit().putString(String.format("downloading_model_hash_%s_%s", new Object[]{firebaseApp.getPersistenceKey(), modelName}), zzmd).putLong(String.format("downloading_model_id_%s_%s", new Object[]{firebaseApp.getPersistenceKey(), modelName}), j).putString(String.format("downloading_model_type_%s", new Object[]{zzmd}), zzme.name()).putLong(String.format("downloading_begin_time_%s_%s", new Object[]{firebaseApp.getPersistenceKey(), modelName}), SystemClock.elapsedRealtime()).apply();
        }
    }

    public static void zza(FirebaseApp firebaseApp, String str, String str2, String str3) {
        synchronized (zzoa.class) {
            firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).edit().putString(String.format("bad_hash_%s_%s", new Object[]{firebaseApp.getPersistenceKey(), str}), str2).putString("app_version", str3).apply();
        }
    }
}
