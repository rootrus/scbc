package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTextAppearance;

final class zzaz {
    private final SharedPreferences zza;
    private final Context zzb;
    private final Map<String, Long> zzc = new setTextAppearance();

    public zzaz(Context context) {
        this.zzb = context;
        this.zza = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(setLastBaselineToBottomHeight.MediaBrowserCompat$ItemReceiver(this.zzb), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !zzb()) {
                    Log.i("FirebaseInstanceId", "App restored, clearing state");
                    zza();
                    FirebaseInstanceId.getInstance().zze();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
                }
            }
        }
    }

    private final boolean zzb() {
        boolean isEmpty;
        synchronized (this) {
            isEmpty = this.zza.getAll().isEmpty();
        }
        return isEmpty;
    }

    private static String zzc(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    private static String zza(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    public final void zza() {
        synchronized (this) {
            this.zzc.clear();
            this.zza.edit().clear().commit();
        }
    }

    public final zzay zza(String str, String str2, String str3) {
        zzay zza2;
        synchronized (this) {
            zza2 = zzay.zza(this.zza.getString(zzc(str, str2, str3), (String) null));
        }
        return zza2;
    }

    public final void zza(String str, String str2, String str3, String str4, String str5) {
        synchronized (this) {
            String zza2 = zzay.zza(str4, str5, System.currentTimeMillis());
            if (zza2 != null) {
                SharedPreferences.Editor edit = this.zza.edit();
                edit.putString(zzc(str, str2, str3), zza2);
                edit.commit();
            }
        }
    }

    private final long zzd(String str) {
        String string = this.zza.getString(zza(str, "cre"), (String) null);
        if (string == null) {
            return 0;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final long zzb(String str) {
        long currentTimeMillis;
        synchronized (this) {
            currentTimeMillis = System.currentTimeMillis();
            if (!this.zza.contains(zza(str, "cre"))) {
                SharedPreferences.Editor edit = this.zza.edit();
                edit.putString(zza(str, "cre"), String.valueOf(currentTimeMillis));
                edit.commit();
            } else {
                currentTimeMillis = zzd(str);
            }
            this.zzc.put(str, Long.valueOf(currentTimeMillis));
        }
        return currentTimeMillis;
    }

    public final void zzc(String str) {
        synchronized (this) {
            String concat = String.valueOf(str).concat("|T|");
            SharedPreferences.Editor edit = this.zza.edit();
            for (String next : this.zza.getAll().keySet()) {
                if (next.startsWith(concat)) {
                    edit.remove(next);
                }
            }
            edit.commit();
        }
    }
}
