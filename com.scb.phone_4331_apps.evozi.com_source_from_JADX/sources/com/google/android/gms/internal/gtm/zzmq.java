package com.google.android.gms.internal.gtm;

import java.util.List;

final class zzmq extends zzmn {
    private final zzmp zzasr;
    private final List<Integer> zzass;
    private final int zzast;
    private final /* synthetic */ zzmo zzasu;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzmq(zzmo zzmo, int i, zzmw zzmw, zzms zzms, List<Integer> list, int i2, zzmp zzmp, zzdz zzdz) {
        super(i, zzmw, zzms, zzdz);
        this.zzasu = zzmo;
        this.zzasr = zzmp;
        this.zzass = list;
        this.zzast = i2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.gtm.zzmx r10) {
        /*
            r9 = this;
            com.google.android.gms.common.api.Status r0 = r10.getStatus()
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            r2 = 1
            if (r0 != r1) goto L_0x0067
            java.lang.String r0 = r10.zzln()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.String r3 = "Container resource successfully loaded from "
            if (r1 == 0) goto L_0x001e
            java.lang.String r0 = r3.concat(r0)
            goto L_0x0023
        L_0x001e:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
        L_0x0023:
            com.google.android.gms.internal.gtm.zzev.zzab(r0)
            int r0 = r10.getSource()
            if (r0 != 0) goto L_0x0065
            com.google.android.gms.internal.gtm.zzmy r0 = r10.zzll()
            com.google.android.gms.internal.gtm.zzmk r1 = r0.zzlp()
            boolean r1 = r1.zzlg()
            if (r1 != 0) goto L_0x0065
            com.google.android.gms.internal.gtm.zzmo r1 = r9.zzasu
            com.google.android.gms.common.api.Status r3 = r10.getStatus()
            r1.zza(r3, r0)
            byte[] r1 = r0.zzlo()
            if (r1 == 0) goto L_0x0067
            byte[] r1 = r0.zzlo()
            int r1 = r1.length
            if (r1 <= 0) goto L_0x0067
            com.google.android.gms.internal.gtm.zzmo r1 = r9.zzasu
            com.google.android.gms.internal.gtm.zzmz r1 = r1.zzaso
            com.google.android.gms.internal.gtm.zzmk r3 = r0.zzlp()
            java.lang.String r3 = r3.zzlf()
            byte[] r0 = r0.zzlo()
            r1.zza((java.lang.String) r3, (byte[]) r0)
        L_0x0065:
            r0 = r2
            goto L_0x0068
        L_0x0067:
            r0 = 0
        L_0x0068:
            if (r0 == 0) goto L_0x0070
            com.google.android.gms.internal.gtm.zzmp r0 = r9.zzasr
            r0.zza(r10)
            return
        L_0x0070:
            java.lang.String r0 = r10.zzln()
            com.google.android.gms.common.api.Status r1 = r10.getStatus()
            boolean r1 = r1.isSuccess()
            if (r1 == 0) goto L_0x0081
            java.lang.String r1 = "SUCCESS"
            goto L_0x0083
        L_0x0081:
            java.lang.String r1 = "FAILURE"
        L_0x0083:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = java.lang.String.valueOf(r0)
            int r4 = r4.length()
            int r4 = r4 + 54
            int r5 = r1.length()
            int r4 = r4 + r5
            r3.<init>(r4)
            java.lang.String r4 = "Cannot fetch a valid resource from "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ". Response status: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            com.google.android.gms.internal.gtm.zzev.zzab(r0)
            com.google.android.gms.common.api.Status r0 = r10.getStatus()
            boolean r0 = r0.isSuccess()
            if (r0 == 0) goto L_0x00f4
            java.lang.String r0 = r10.zzln()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.String r3 = "Response source: "
            if (r1 == 0) goto L_0x00cd
            java.lang.String r0 = r3.concat(r0)
            goto L_0x00d2
        L_0x00cd:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
        L_0x00d2:
            com.google.android.gms.internal.gtm.zzev.zzab(r0)
            com.google.android.gms.internal.gtm.zzmy r10 = r10.zzll()
            byte[] r10 = r10.zzlo()
            int r10 = r10.length
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 26
            r0.<init>(r1)
            java.lang.String r1 = "Response size: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            com.google.android.gms.internal.gtm.zzev.zzab(r10)
        L_0x00f4:
            com.google.android.gms.internal.gtm.zzmo r3 = r9.zzasu
            com.google.android.gms.internal.gtm.zzmw r4 = r9.zzask
            java.util.List<java.lang.Integer> r5 = r9.zzass
            int r10 = r9.zzast
            int r6 = r10 + 1
            com.google.android.gms.internal.gtm.zzmp r7 = r9.zzasr
            com.google.android.gms.internal.gtm.zzdz r8 = r9.zzasn
            r3.zza(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzmq.zza(com.google.android.gms.internal.gtm.zzmx):void");
    }
}
