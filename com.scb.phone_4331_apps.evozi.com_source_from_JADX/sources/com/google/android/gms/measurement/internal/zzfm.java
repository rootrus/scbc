package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

public final class zzfm {
    private final String zza;
    private final String zzb = null;
    private boolean zzc;
    private String zzd;
    private final /* synthetic */ zzfg zze;

    public zzfm(zzfg zzfg, String str, String str2) {
        this.zze = zzfg;
        Preconditions.checkNotEmpty(str);
        this.zza = str;
    }

    public final String zza() {
        if (!this.zzc) {
            this.zzc = true;
            this.zzd = this.zze.zzg().getString(this.zza, (String) null);
        }
        return this.zzd;
    }

    public final void zza(String str) {
        if (this.zze.zzt().zza(zzaq.zzbw) || !zzkr.zzc(str, this.zzd)) {
            SharedPreferences.Editor edit = this.zze.zzg().edit();
            edit.putString(this.zza, str);
            edit.apply();
            this.zzd = str;
        }
    }
}
