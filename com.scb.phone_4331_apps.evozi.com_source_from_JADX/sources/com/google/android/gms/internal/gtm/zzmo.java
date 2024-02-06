package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzmo {
    private String zzafk;
    /* access modifiers changed from: private */
    public final zzmz zzaso;
    private final Map<String, zzmr<zznm>> zzasp;
    private final Map<String, zznk> zzasq;
    private final Context zzrm;
    private final Clock zzsd;

    public zzmo(Context context) {
        this(context, new HashMap(), new zzmz(context), DefaultClock.getInstance());
    }

    private zzmo(Context context, Map<String, zznk> map, zzmz zzmz, Clock clock) {
        this.zzafk = null;
        this.zzasp = new HashMap();
        this.zzrm = context.getApplicationContext();
        this.zzsd = clock;
        this.zzaso = zzmz;
        this.zzasq = map;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (r16.equals(r2.getContainerId()) != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.util.List<java.lang.Integer> r19, com.google.android.gms.internal.gtm.zzmp r20, com.google.android.gms.internal.gtm.zzdz r21) {
        /*
            r15 = this;
            boolean r0 = r19.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            com.google.android.gms.internal.gtm.zzmw r0 = new com.google.android.gms.internal.gtm.zzmw
            r0.<init>()
            com.google.android.gms.internal.gtm.zzfd r2 = com.google.android.gms.internal.gtm.zzfd.zzkr()
            boolean r3 = r2.isPreview()
            if (r3 == 0) goto L_0x0025
            java.lang.String r2 = r2.getContainerId()
            r4 = r16
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0025:
            r4 = r16
        L_0x0027:
            r1 = 0
        L_0x0028:
            r7 = r1
            com.google.android.gms.internal.gtm.zzmk r1 = new com.google.android.gms.internal.gtm.zzmk
            com.google.android.gms.internal.gtm.zzfd r2 = com.google.android.gms.internal.gtm.zzfd.zzkr()
            java.lang.String r8 = r2.zzks()
            r3 = r1
            r4 = r16
            r5 = r17
            r6 = r18
            r3.<init>(r4, r5, r6, r7, r8)
            com.google.android.gms.internal.gtm.zzmw r10 = r0.zza(r1)
            java.util.List r11 = java.util.Collections.unmodifiableList(r19)
            r12 = 0
            r9 = r15
            r13 = r20
            r14 = r21
            r9.zza(r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzmo.zza(java.lang.String, java.lang.String, java.lang.String, java.util.List, com.google.android.gms.internal.gtm.zzmp, com.google.android.gms.internal.gtm.zzdz):void");
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzmw zzmw, List<Integer> list, int i, zzmp zzmp, zzdz zzdz) {
        long j;
        List<Integer> list2 = list;
        int i2 = i;
        while (true) {
            if (i2 == 0) {
                zzev.zzab("Starting to fetch a new resource");
            }
            boolean z = true;
            if (i2 >= list.size()) {
                String valueOf = String.valueOf(zzmw.zzlk().getContainerId());
                String concat = valueOf.length() != 0 ? "There is no valid resource for the container: ".concat(valueOf) : new String("There is no valid resource for the container: ");
                zzev.zzab(concat);
                zzmp.zza(new zzmx(new Status(16, concat), list2.get(i2 - 1).intValue()));
                return;
            }
            zzmp zzmp2 = zzmp;
            int intValue = list2.get(i2).intValue();
            if (intValue == 0) {
                zzmk zzlk = zzmw.zzlk();
                zzmr zzmr = this.zzasp.get(zzlk.getContainerId());
                if (!zzmw.zzlk().zzlg()) {
                    if (zzmr != null) {
                        j = zzmr.zzlj();
                    } else {
                        j = this.zzaso.zzcg(zzlk.getContainerId());
                    }
                    if (j + 900000 >= this.zzsd.currentTimeMillis()) {
                        z = false;
                    }
                }
                if (z) {
                    zznk zznk = this.zzasq.get(zzmw.getId());
                    if (zznk == null) {
                        zznk = new zznk();
                        this.zzasq.put(zzmw.getId(), zznk);
                    }
                    zznk zznk2 = zznk;
                    String containerId = zzlk.getContainerId();
                    StringBuilder sb = new StringBuilder(String.valueOf(containerId).length() + 43);
                    sb.append("Attempting to fetch container ");
                    sb.append(containerId);
                    sb.append(" from network");
                    zzev.zzab(sb.toString());
                    zznk2.zza(this.zzrm, zzmw, 0, new zzmq(this, 0, zzmw, zzmt.zzasw, list, i2, zzmp, zzdz));
                    return;
                }
                i2++;
            } else if (intValue == 1) {
                zzmk zzlk2 = zzmw.zzlk();
                String containerId2 = zzlk2.getContainerId();
                StringBuilder sb2 = new StringBuilder(String.valueOf(containerId2).length() + 52);
                sb2.append("Attempting to fetch container ");
                sb2.append(containerId2);
                sb2.append(" from a saved resource");
                zzev.zzab(sb2.toString());
                this.zzaso.zza(zzlk2.zzlf(), (zzmn) new zzmq(this, 1, zzmw, zzmt.zzasw, list, i2, zzmp, (zzdz) null));
                return;
            } else if (intValue == 2) {
                zzmk zzlk3 = zzmw.zzlk();
                String containerId3 = zzlk3.getContainerId();
                StringBuilder sb3 = new StringBuilder(String.valueOf(containerId3).length() + 56);
                sb3.append("Attempting to fetch container ");
                sb3.append(containerId3);
                sb3.append(" from the default resource");
                zzev.zzab(sb3.toString());
                this.zzaso.zza(zzlk3.zzlf(), zzlk3.zzld(), new zzmq(this, 2, zzmw, zzmt.zzasw, list, i2, zzmp, (zzdz) null));
                return;
            } else {
                StringBuilder sb4 = new StringBuilder(36);
                sb4.append("Unknown fetching source: ");
                sb4.append(i2);
                throw new UnsupportedOperationException(sb4.toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(Status status, zzmy zzmy) {
        String containerId = zzmy.zzlp().getContainerId();
        zznm zzlq = zzmy.zzlq();
        if (this.zzasp.containsKey(containerId)) {
            zzmr zzmr = this.zzasp.get(containerId);
            zzmr.zzo(this.zzsd.currentTimeMillis());
            if (status == Status.RESULT_SUCCESS) {
                zzmr.zzb(status);
                zzmr.zzp(zzlq);
                return;
            }
            return;
        }
        this.zzasp.put(containerId, new zzmr(status, zzlq, this.zzsd.currentTimeMillis()));
    }
}
