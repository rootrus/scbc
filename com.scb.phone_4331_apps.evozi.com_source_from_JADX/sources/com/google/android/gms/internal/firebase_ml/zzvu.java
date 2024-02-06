package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

final class zzvu<T> implements zzwe<T> {
    private final zzvo zzbrb;
    private final boolean zzbrc;
    private final zzww<?, ?> zzbrl;
    private final zztt<?> zzbrm;

    private zzvu(zzww<?, ?> zzww, zztt<?> zztt, zzvo zzvo) {
        this.zzbrl = zzww;
        this.zzbrc = zztt.zze(zzvo);
        this.zzbrm = zztt;
        this.zzbrb = zzvo;
    }

    static <T> zzvu<T> zza(zzww<?, ?> zzww, zztt<?> zztt, zzvo zzvo) {
        return new zzvu<>(zzww, zztt, zzvo);
    }

    public final T newInstance() {
        return this.zzbrb.zzrd().zzri();
    }

    public final boolean equals(T t, T t2) {
        if (!this.zzbrl.zzae(t).equals(this.zzbrl.zzae(t2))) {
            return false;
        }
        if (this.zzbrc) {
            return this.zzbrm.zzo(t).equals(this.zzbrm.zzo(t2));
        }
        return true;
    }

    public final int hashCode(T t) {
        int hashCode = this.zzbrl.zzae(t).hashCode();
        return this.zzbrc ? (hashCode * 53) + this.zzbrm.zzo(t).hashCode() : hashCode;
    }

    public final void zzg(T t, T t2) {
        zzwg.zza(this.zzbrl, t, t2);
        if (this.zzbrc) {
            zzwg.zza(this.zzbrm, t, t2);
        }
    }

    public final void zza(T t, zzxr zzxr) throws IOException {
        Iterator<Map.Entry<?, Object>> it = this.zzbrm.zzo(t).iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            zzty zzty = (zzty) next.getKey();
            if (zzty.zzqs() != zzxq.MESSAGE || zzty.zzqt() || zzty.zzqu()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof zzut) {
                zzxr.zza(zzty.zzo(), (Object) ((zzut) next).zzru().zzpp());
            } else {
                zzxr.zza(zzty.zzo(), next.getValue());
            }
        }
        zzww<?, ?> zzww = this.zzbrl;
        zzww.zzc(zzww.zzae(t), zzxr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.gms.internal.firebase_ml.zzue$zze} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.firebase_ml.zzst r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.firebase_ml.zzue r0 = (com.google.android.gms.internal.firebase_ml.zzue) r0
            com.google.android.gms.internal.firebase_ml.zzwx r1 = r0.zzboh
            com.google.android.gms.internal.firebase_ml.zzwx r2 = com.google.android.gms.internal.firebase_ml.zzwx.zztg()
            if (r1 != r2) goto L_0x0011
            com.google.android.gms.internal.firebase_ml.zzwx r1 = com.google.android.gms.internal.firebase_ml.zzwx.zzth()
            r0.zzboh = r1
        L_0x0011:
            com.google.android.gms.internal.firebase_ml.zzue$zzd r10 = (com.google.android.gms.internal.firebase_ml.zzue.zzd) r10
            r10.zzrk()
            r10 = 0
            r0 = r10
        L_0x0018:
            if (r12 >= r13) goto L_0x00a4
            int r4 = com.google.android.gms.internal.firebase_ml.zzss.zza(r11, r12, r14)
            int r2 = r14.zzbkg
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L_0x0051
            r12 = r2 & 7
            if (r12 != r3) goto L_0x004c
            com.google.android.gms.internal.firebase_ml.zztt<?> r12 = r9.zzbrm
            com.google.android.gms.internal.firebase_ml.zztr r0 = r14.zzix
            com.google.android.gms.internal.firebase_ml.zzvo r3 = r9.zzbrb
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.zza(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.firebase_ml.zzue$zze r0 = (com.google.android.gms.internal.firebase_ml.zzue.zze) r0
            if (r0 != 0) goto L_0x0043
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.firebase_ml.zzss.zza((int) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.firebase_ml.zzwx) r6, (com.google.android.gms.internal.firebase_ml.zzst) r7)
            goto L_0x0018
        L_0x0043:
            com.google.android.gms.internal.firebase_ml.zzwb.zzso()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x004c:
            int r12 = com.google.android.gms.internal.firebase_ml.zzss.zza((int) r2, (byte[]) r11, (int) r4, (int) r13, (com.google.android.gms.internal.firebase_ml.zzst) r14)
            goto L_0x0018
        L_0x0051:
            r12 = 0
            r2 = r10
        L_0x0053:
            if (r4 >= r13) goto L_0x0099
            int r4 = com.google.android.gms.internal.firebase_ml.zzss.zza(r11, r4, r14)
            int r5 = r14.zzbkg
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L_0x007b
            r8 = 3
            if (r6 == r8) goto L_0x0065
            goto L_0x0090
        L_0x0065:
            if (r0 != 0) goto L_0x0072
            if (r7 != r3) goto L_0x0090
            int r4 = com.google.android.gms.internal.firebase_ml.zzss.zze(r11, r4, r14)
            java.lang.Object r2 = r14.zzbki
            com.google.android.gms.internal.firebase_ml.zzsw r2 = (com.google.android.gms.internal.firebase_ml.zzsw) r2
            goto L_0x0053
        L_0x0072:
            com.google.android.gms.internal.firebase_ml.zzwb.zzso()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x007b:
            if (r7 != 0) goto L_0x0090
            int r4 = com.google.android.gms.internal.firebase_ml.zzss.zza(r11, r4, r14)
            int r12 = r14.zzbkg
            com.google.android.gms.internal.firebase_ml.zztt<?> r0 = r9.zzbrm
            com.google.android.gms.internal.firebase_ml.zztr r5 = r14.zzix
            com.google.android.gms.internal.firebase_ml.zzvo r6 = r9.zzbrb
            java.lang.Object r0 = r0.zza(r5, r6, r12)
            com.google.android.gms.internal.firebase_ml.zzue$zze r0 = (com.google.android.gms.internal.firebase_ml.zzue.zze) r0
            goto L_0x0053
        L_0x0090:
            r6 = 12
            if (r5 == r6) goto L_0x0099
            int r4 = com.google.android.gms.internal.firebase_ml.zzss.zza((int) r5, (byte[]) r11, (int) r4, (int) r13, (com.google.android.gms.internal.firebase_ml.zzst) r14)
            goto L_0x0053
        L_0x0099:
            if (r2 == 0) goto L_0x00a1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.zzb((int) r12, (java.lang.Object) r2)
        L_0x00a1:
            r12 = r4
            goto L_0x0018
        L_0x00a4:
            if (r12 != r13) goto L_0x00a7
            return
        L_0x00a7:
            com.google.android.gms.internal.firebase_ml.zzuo r10 = com.google.android.gms.internal.firebase_ml.zzuo.zzrq()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzvu.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.firebase_ml.zzst):void");
    }

    public final void zzq(T t) {
        this.zzbrl.zzq(t);
        this.zzbrm.zzq(t);
    }

    public final boolean zzac(T t) {
        return this.zzbrm.zzo(t).isInitialized();
    }

    public final int zzaa(T t) {
        zzww<?, ?> zzww = this.zzbrl;
        int zzaf = zzww.zzaf(zzww.zzae(t)) + 0;
        return this.zzbrc ? zzaf + this.zzbrm.zzo(t).zzqq() : zzaf;
    }
}
