package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzko;

final class zzfr implements Runnable {
    private final /* synthetic */ zzd zza;
    private final /* synthetic */ ServiceConnection zzb;
    private final /* synthetic */ zzfo zzc;

    zzfr(zzfo zzfo, zzd zzd, ServiceConnection serviceConnection) {
        this.zzc = zzfo;
        this.zza = zzd;
        this.zzb = serviceConnection;
    }

    public final void run() {
        zzfp zzfp = this.zzc.zza;
        String zza2 = this.zzc.zzb;
        zzd zzd = this.zza;
        ServiceConnection serviceConnection = this.zzb;
        Bundle zza3 = zzfp.zza(zza2, zzd);
        zzfp.zza.zzq().zzd();
        if (zza3 != null) {
            long j = zza3.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                zzfp.zza.zzr().zzi().zza("Service response is missing Install Referrer install timestamp");
            } else {
                String string = zza3.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    zzfp.zza.zzr().zzf().zza("No referrer defined in Install Referrer response");
                } else {
                    zzfp.zza.zzr().zzx().zza("InstallReferrer API result", string);
                    zzkr zzi = zzfp.zza.zzi();
                    String valueOf = String.valueOf(string);
                    Bundle zza4 = zzi.zza(Uri.parse(valueOf.length() != 0 ? "?".concat(valueOf) : new String("?")));
                    if (zza4 == null) {
                        zzfp.zza.zzr().zzf().zza("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = zza4.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = zza3.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                zzfp.zza.zzr().zzf().zza("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                zza4.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == zzfp.zza.zzc().zzi.zza()) {
                            zzfp.zza.zzu();
                            zzfp.zza.zzr().zzx().zza("Install Referrer campaign has already been logged");
                        } else if (!zzko.zzb() || !zzfp.zza.zzb().zza(zzaq.zzca) || zzfp.zza.zzab()) {
                            zzfp.zza.zzc().zzi.zza(j);
                            zzfp.zza.zzu();
                            zzfp.zza.zzr().zzx().zza("Logging Install Referrer campaign from sdk with ", "referrer API");
                            zza4.putString("_cis", "referrer API");
                            zzfp.zza.zzh().zza("auto", "_cmp", zza4);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            ConnectionTracker.getInstance().unbindService(zzfp.zza.zzn(), serviceConnection);
        }
    }
}
