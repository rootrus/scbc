package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

final class zzx {
    private final SharedPreferences zza;
    private final String zzb;
    private final String zzc;
    private final ArrayDeque<String> zzd = new ArrayDeque<>();
    private final Executor zze;
    private boolean zzf = false;

    private zzx(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.zza = sharedPreferences;
        this.zzb = str;
        this.zzc = str2;
        this.zze = executor;
    }

    static zzx zza(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        zzx zzx = new zzx(sharedPreferences, str, str2, executor);
        synchronized (zzx.zzd) {
            zzx.zzd.clear();
            String string = zzx.zza.getString(zzx.zzb, "");
            if (!TextUtils.isEmpty(string)) {
                if (string.contains(zzx.zzc)) {
                    String[] split = string.split(zzx.zzc, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str3 : split) {
                        if (!TextUtils.isEmpty(str3)) {
                            zzx.zzd.add(str3);
                        }
                    }
                }
            }
        }
        return zzx;
    }

    private final boolean zza(boolean z) {
        if (z) {
            this.zze.execute(new zzw(this));
        }
        return z;
    }

    public final boolean zza(Object obj) {
        boolean zza2;
        synchronized (this.zzd) {
            zza2 = zza(this.zzd.remove(obj));
        }
        return zza2;
    }

    public final String zza() {
        String peek;
        synchronized (this.zzd) {
            peek = this.zzd.peek();
        }
        return peek;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb() {
        synchronized (this.zzd) {
            SharedPreferences.Editor edit = this.zza.edit();
            String str = this.zzb;
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = this.zzd.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(this.zzc);
            }
            edit.putString(str, sb.toString()).commit();
        }
    }
}
