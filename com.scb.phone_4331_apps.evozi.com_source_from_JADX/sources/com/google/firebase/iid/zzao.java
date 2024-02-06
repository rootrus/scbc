package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.FirebaseApp;
import java.util.List;

public final class zzao {
    private final Context zza;
    private String zzb;
    private String zzc;
    private int zzd;
    private int zze = 0;

    public zzao(Context context) {
        this.zza = context;
    }

    public final boolean zza() {
        return zzb() != 0;
    }

    public final int zzb() {
        synchronized (this) {
            if (this.zze != 0) {
                int i = this.zze;
                return i;
            }
            PackageManager packageManager = this.zza.getPackageManager();
            if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
                return 0;
            }
            if (!PlatformVersion.isAtLeastO()) {
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                if (queryIntentServices != null && queryIntentServices.size() > 0) {
                    this.zze = 1;
                    return 1;
                }
            }
            Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
            intent2.setPackage("com.google.android.gms");
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
            if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
                if (PlatformVersion.isAtLeastO()) {
                    this.zze = 2;
                } else {
                    this.zze = 1;
                }
                int i2 = this.zze;
                return i2;
            }
            this.zze = 2;
            return 2;
        }
    }

    public static String zza(FirebaseApp firebaseApp) {
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:")) {
            return applicationId;
        }
        String[] split = applicationId.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public final String zzc() {
        String str;
        synchronized (this) {
            if (this.zzb == null) {
                zzf();
            }
            str = this.zzb;
        }
        return str;
    }

    public final String zzd() {
        String str;
        synchronized (this) {
            if (this.zzc == null) {
                zzf();
            }
            str = this.zzc;
        }
        return str;
    }

    public final int zze() {
        int i;
        PackageInfo zza2;
        synchronized (this) {
            if (this.zzd == 0 && (zza2 = zza("com.google.android.gms")) != null) {
                this.zzd = zza2.versionCode;
            }
            i = this.zzd;
        }
        return i;
    }

    private final void zzf() {
        synchronized (this) {
            PackageInfo zza2 = zza(this.zza.getPackageName());
            if (zza2 != null) {
                this.zzb = Integer.toString(zza2.versionCode);
                this.zzc = zza2.versionName;
            }
        }
    }

    private final PackageInfo zza(String str) {
        try {
            return this.zza.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }
}
