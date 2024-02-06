package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.internal.measurement.zzlr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class zzgd extends zzep {
    /* access modifiers changed from: private */
    public final zzkj zza;
    private Boolean zzb;
    private String zzc;

    public zzgd(zzkj zzkj) {
        this(zzkj, (String) null);
    }

    private zzgd(zzkj zzkj, String str) {
        Preconditions.checkNotNull(zzkj);
        this.zza = zzkj;
        this.zzc = null;
    }

    public final void zzb(zzn zzn) {
        zzb(zzn, false);
        zza((Runnable) new zzgf(this, zzn));
    }

    public final void zza(zzao zzao, zzn zzn) {
        Preconditions.checkNotNull(zzao);
        zzb(zzn, false);
        zza((Runnable) new zzgk(this, zzao, zzn));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzao zzb(com.google.android.gms.measurement.internal.zzao r9, com.google.android.gms.measurement.internal.zzn r10) {
        /*
            r8 = this;
            java.lang.String r0 = r9.zza
            java.lang.String r1 = "_cmp"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0047
            com.google.android.gms.measurement.internal.zzan r0 = r9.zzb
            if (r0 == 0) goto L_0x0047
            com.google.android.gms.measurement.internal.zzan r0 = r9.zzb
            int r0 = r0.zza()
            if (r0 != 0) goto L_0x0017
            goto L_0x0047
        L_0x0017:
            com.google.android.gms.measurement.internal.zzan r0 = r9.zzb
            java.lang.String r1 = "_cis"
            java.lang.String r0 = r0.zzd(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0047
            java.lang.String r1 = "referrer broadcast"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0035
            java.lang.String r1 = "referrer API"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0047
        L_0x0035:
            com.google.android.gms.measurement.internal.zzkj r0 = r8.zza
            com.google.android.gms.measurement.internal.zzy r0 = r0.zzb()
            java.lang.String r10 = r10.zza
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.zzaq.zzar
            boolean r10 = r0.zze(r10, r1)
            if (r10 == 0) goto L_0x0047
            r10 = 1
            goto L_0x0048
        L_0x0047:
            r10 = 0
        L_0x0048:
            if (r10 == 0) goto L_0x006c
            com.google.android.gms.measurement.internal.zzkj r10 = r8.zza
            com.google.android.gms.measurement.internal.zzeu r10 = r10.zzr()
            com.google.android.gms.measurement.internal.zzew r10 = r10.zzv()
            java.lang.String r0 = r9.toString()
            java.lang.String r1 = "Event has been filtered "
            r10.zza(r1, r0)
            com.google.android.gms.measurement.internal.zzao r10 = new com.google.android.gms.measurement.internal.zzao
            com.google.android.gms.measurement.internal.zzan r4 = r9.zzb
            java.lang.String r5 = r9.zzc
            long r6 = r9.zzd
            java.lang.String r3 = "_cmpx"
            r2 = r10
            r2.<init>(r3, r4, r5, r6)
            return r10
        L_0x006c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgd.zzb(com.google.android.gms.measurement.internal.zzao, com.google.android.gms.measurement.internal.zzn):com.google.android.gms.measurement.internal.zzao");
    }

    public final void zza(zzao zzao, String str, String str2) {
        Preconditions.checkNotNull(zzao);
        Preconditions.checkNotEmpty(str);
        zza(str, true);
        zza((Runnable) new zzgn(this, zzao, str));
    }

    public final byte[] zza(zzao zzao, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzao);
        zza(str, true);
        this.zza.zzr().zzw().zza("Log and bundle. event", this.zza.zzi().zza(zzao.zza));
        long nanoTime = this.zza.zzm().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.zza.zzq().zzb(new zzgm(this, zzao, str)).get();
            if (bArr == null) {
                this.zza.zzr().zzf().zza("Log and bundle returned null. appId", zzeu.zza(str));
                bArr = new byte[0];
            }
            this.zza.zzr().zzw().zza("Log and bundle processed. event, size, time_ms", this.zza.zzi().zza(zzao.zza), Integer.valueOf(bArr.length), Long.valueOf((this.zza.zzm().nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzr().zzf().zza("Failed to log and bundle. appId, event, error", zzeu.zza(str), this.zza.zzi().zza(zzao.zza), e);
            return null;
        }
    }

    public final void zza(zzkq zzkq, zzn zzn) {
        Preconditions.checkNotNull(zzkq);
        zzb(zzn, false);
        zza((Runnable) new zzgp(this, zzkq, zzn));
    }

    public final List<zzkq> zza(zzn zzn, boolean z) {
        zzb(zzn, false);
        try {
            List<zzks> list = (List) this.zza.zzq().zza(new zzgo(this, zzn)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzks zzks : list) {
                if (z || !zzkr.zze(zzks.zzc)) {
                    arrayList.add(new zzkq(zzks));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzr().zzf().zza("Failed to get user properties. appId", zzeu.zza(zzn.zza), e);
            return null;
        }
    }

    public final void zza(zzn zzn) {
        zzb(zzn, false);
        zza((Runnable) new zzgr(this, zzn));
    }

    private final void zzb(zzn zzn, boolean z) {
        Preconditions.checkNotNull(zzn);
        zza(zzn.zza, false);
        this.zza.zzj().zza(zzn.zzb, zzn.zzr, zzn.zzv);
    }

    private final void zza(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.zzb == null) {
                        if (!"com.google.android.gms".equals(this.zzc) && !UidVerifier.isGooglePlayServicesUid(this.zza.zzn(), Binder.getCallingUid())) {
                            if (!GoogleSignatureVerifier.getInstance(this.zza.zzn()).isUidGoogleSigned(Binder.getCallingUid())) {
                                z2 = false;
                                this.zzb = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.zzb = Boolean.valueOf(z2);
                    }
                    if (this.zzb.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.zza.zzr().zzf().zza("Measurement Service called with invalid calling package. appId", zzeu.zza(str));
                    throw e;
                }
            }
            if (this.zzc == null && GooglePlayServicesUtilLight.uidHasPackageName(this.zza.zzn(), Binder.getCallingUid(), str)) {
                this.zzc = str;
            }
            if (!str.equals(this.zzc)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.zza.zzr().zzf().zza("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    public final void zza(long j, String str, String str2, String str3) {
        zza((Runnable) new zzgq(this, str2, str3, str, j));
    }

    public final void zza(Bundle bundle, zzn zzn) {
        if (zzlr.zzb() && this.zza.zzb().zza(zzaq.zzcn)) {
            zzb(zzn, false);
            zza((Runnable) new zzgc(this, zzn, bundle));
        }
    }

    public final String zzc(zzn zzn) {
        zzb(zzn, false);
        return this.zza.zzd(zzn);
    }

    public final void zza(zzw zzw, zzn zzn) {
        Preconditions.checkNotNull(zzw);
        Preconditions.checkNotNull(zzw.zzc);
        zzb(zzn, false);
        zzw zzw2 = new zzw(zzw);
        zzw2.zza = zzn.zza;
        zza((Runnable) new zzgt(this, zzw2, zzn));
    }

    public final void zza(zzw zzw) {
        Preconditions.checkNotNull(zzw);
        Preconditions.checkNotNull(zzw.zzc);
        zza(zzw.zza, true);
        zza((Runnable) new zzge(this, new zzw(zzw)));
    }

    public final List<zzkq> zza(String str, String str2, boolean z, zzn zzn) {
        zzb(zzn, false);
        try {
            List<zzks> list = (List) this.zza.zzq().zza(new zzgh(this, zzn, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzks zzks : list) {
                if (z || !zzkr.zze(zzks.zzc)) {
                    arrayList.add(new zzkq(zzks));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzr().zzf().zza("Failed to query user properties. appId", zzeu.zza(zzn.zza), e);
            return Collections.emptyList();
        }
    }

    public final List<zzkq> zza(String str, String str2, String str3, boolean z) {
        zza(str, true);
        try {
            List<zzks> list = (List) this.zza.zzq().zza(new zzgg(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzks zzks : list) {
                if (z || !zzkr.zze(zzks.zzc)) {
                    arrayList.add(new zzkq(zzks));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzr().zzf().zza("Failed to get user properties as. appId", zzeu.zza(str), e);
            return Collections.emptyList();
        }
    }

    public final List<zzw> zza(String str, String str2, zzn zzn) {
        zzb(zzn, false);
        try {
            return (List) this.zza.zzq().zza(new zzgj(this, zzn, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzr().zzf().zza("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    public final List<zzw> zza(String str, String str2, String str3) {
        zza(str, true);
        try {
            return (List) this.zza.zzq().zza(new zzgi(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzr().zzf().zza("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    public final void zzd(zzn zzn) {
        zza(zzn.zza, false);
        zza((Runnable) new zzgl(this, zzn));
    }

    private final void zza(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        if (this.zza.zzq().zzg()) {
            runnable.run();
        } else {
            this.zza.zzq().zza(runnable);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzn zzn, Bundle bundle) {
        this.zza.zze().zza(zzn.zza, bundle);
    }
}
