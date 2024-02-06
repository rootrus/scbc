package com.google.android.gms.measurement.internal;

final class zzex implements Runnable {
    private final /* synthetic */ int zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ Object zzc;
    private final /* synthetic */ Object zzd;
    private final /* synthetic */ Object zze;
    private final /* synthetic */ zzeu zzf;

    zzex(zzeu zzeu, int i, String str, Object obj, Object obj2, Object obj3) {
        this.zzf = zzeu;
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
    }

    public final void run() {
        zzfg zzc2 = this.zzf.zzy.zzc();
        if (zzc2.zzz()) {
            if (this.zzf.zza == 0) {
                if (this.zzf.zzt().zzg()) {
                    zzeu zzeu = this.zzf;
                    zzeu.zzu();
                    char unused = zzeu.zza = 'C';
                } else {
                    zzeu zzeu2 = this.zzf;
                    zzeu2.zzu();
                    char unused2 = zzeu2.zza = 'c';
                }
            }
            if (this.zzf.zzb < 0) {
                zzeu zzeu3 = this.zzf;
                long unused3 = zzeu3.zzb = zzeu3.zzt().zzf();
            }
            char charAt = "01VDIWEA?".charAt(this.zza);
            char zza2 = this.zzf.zza;
            long zzb2 = this.zzf.zzb;
            String zza3 = zzeu.zza(true, this.zzb, this.zzc, this.zzd, this.zze);
            StringBuilder sb = new StringBuilder(String.valueOf(zza3).length() + 24);
            sb.append("2");
            sb.append(charAt);
            sb.append(zza2);
            sb.append(zzb2);
            sb.append(":");
            sb.append(zza3);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = this.zzb.substring(0, 1024);
            }
            zzc2.zzb.zza(sb2, 1);
            return;
        }
        this.zzf.zza(6, "Persisted config not initialized. Not logging error/warn");
    }
}
