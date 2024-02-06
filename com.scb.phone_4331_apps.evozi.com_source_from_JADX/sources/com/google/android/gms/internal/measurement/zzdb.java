package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;

public final class zzdb {
    final String zza;
    final Uri zzb;
    final String zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final boolean zzh;
    final zzdf<Context, Boolean> zzi;

    public zzdb(Uri uri) {
        this((String) null, uri, "", "", false, false, false, false, (zzdf<Context, Boolean>) null);
    }

    private zzdb(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, zzdf<Context, Boolean> zzdf) {
        this.zza = null;
        this.zzb = uri;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = false;
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = null;
    }

    public final zzcv<Long> zza(String str, long j) {
        return zzcv.zzb(this, str, j, true);
    }

    public final zzcv<Boolean> zza(String str, boolean z) {
        return zzcv.zzb(this, str, z, true);
    }

    public final zzcv<Double> zza(String str, double d) {
        return zzcv.zzb(this, str, -3.0d, true);
    }

    public final zzcv<String> zza(String str, String str2) {
        return zzcv.zzb(this, str, str2, true);
    }
}
