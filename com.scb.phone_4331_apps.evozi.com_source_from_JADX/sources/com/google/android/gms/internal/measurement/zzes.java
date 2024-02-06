package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api;
import java.io.IOException;

public abstract class zzes {
    int zza;
    int zzb;
    zzet zzc;
    private int zzd;
    private boolean zze;

    public static long zza(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    static zzes zza(byte[] bArr, int i, int i2, boolean z) {
        zzeu zzeu = new zzeu(bArr, 0, i2, false);
        try {
            zzeu.zzc(i2);
            return zzeu;
        } catch (zzfw e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int zze(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public abstract int zza() throws IOException;

    public abstract void zza(int i) throws zzfw;

    public abstract double zzb() throws IOException;

    public abstract boolean zzb(int i) throws IOException;

    public abstract float zzc() throws IOException;

    public abstract int zzc(int i) throws zzfw;

    public abstract long zzd() throws IOException;

    public abstract void zzd(int i);

    public abstract long zze() throws IOException;

    public abstract int zzf() throws IOException;

    public abstract long zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract boolean zzi() throws IOException;

    public abstract String zzj() throws IOException;

    public abstract String zzk() throws IOException;

    public abstract zzeg zzl() throws IOException;

    public abstract int zzm() throws IOException;

    public abstract int zzn() throws IOException;

    public abstract int zzo() throws IOException;

    public abstract long zzp() throws IOException;

    public abstract int zzq() throws IOException;

    public abstract long zzr() throws IOException;

    /* access modifiers changed from: package-private */
    public abstract long zzs() throws IOException;

    public abstract boolean zzt() throws IOException;

    public abstract int zzu();

    private zzes() {
        this.zzb = 100;
        this.zzd = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zze = false;
    }
}
