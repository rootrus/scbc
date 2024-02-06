package com.google.android.gms.internal.gtm;

import android.os.RemoteException;

final class zzgm implements Runnable {
    private final /* synthetic */ String zzaqk;
    private final /* synthetic */ String zzaql;
    private final /* synthetic */ String zzaqm;
    private final /* synthetic */ zzeo zzaqu;
    private final /* synthetic */ zzgl zzaqv;

    zzgm(zzgl zzgl, String str, String str2, String str3, zzeo zzeo) {
        this.zzaqv = zzgl;
        this.zzaqk = str;
        this.zzaql = str2;
        this.zzaqm = str3;
        this.zzaqu = zzeo;
    }

    public final void run() {
        boolean z;
        try {
            if (!this.zzaqv.zzaqs.containsKey(this.zzaqk)) {
                this.zzaqv.zzaqs.put(this.zzaqk, this.zzaqv.zzaqt.zzb(this.zzaqk, this.zzaql, this.zzaqm));
            }
            z = true;
        } catch (Exception e) {
            zzea.zza("Fail to load container: ", e, this.zzaqv.zzrm);
            z = false;
        }
        try {
            if (this.zzaqu != null) {
                this.zzaqu.zza(z, this.zzaqk);
            }
        } catch (RemoteException e2) {
            zzea.zza("Error relaying callback: ", e2, this.zzaqv.zzrm);
        }
    }
}
