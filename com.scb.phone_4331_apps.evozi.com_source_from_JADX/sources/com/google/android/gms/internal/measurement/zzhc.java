package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

final class zzhc<T> implements zzhp<T> {
    private final zzgw zza;
    private final zzih<?, ?> zzb;
    private final boolean zzc;
    private final zzfd<?> zzd;

    private zzhc(zzih<?, ?> zzih, zzfd<?> zzfd, zzgw zzgw) {
        this.zzb = zzih;
        this.zzc = zzfd.zza(zzgw);
        this.zzd = zzfd;
        this.zza = zzgw;
    }

    static <T> zzhc<T> zza(zzih<?, ?> zzih, zzfd<?> zzfd, zzgw zzgw) {
        return new zzhc<>(zzih, zzfd, zzgw);
    }

    public final T zza() {
        return this.zza.zzbr().zzu();
    }

    public final boolean zza(T t, T t2) {
        if (!this.zzb.zzb(t).equals(this.zzb.zzb(t2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza((Object) t).equals(this.zzd.zza((Object) t2));
        }
        return true;
    }

    public final int zza(T t) {
        int hashCode = this.zzb.zzb(t).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zza((Object) t).hashCode() : hashCode;
    }

    public final void zzb(T t, T t2) {
        zzhr.zza(this.zzb, t, t2);
        if (this.zzc) {
            zzhr.zza(this.zzd, t, t2);
        }
    }

    public final void zza(T t, zzja zzja) throws IOException {
        Iterator<Map.Entry<?, Object>> zzd2 = this.zzd.zza((Object) t).zzd();
        while (zzd2.hasNext()) {
            Map.Entry next = zzd2.next();
            zzfg zzfg = (zzfg) next.getKey();
            if (zzfg.zzc() != zzjb.MESSAGE || zzfg.zzd() || zzfg.zze()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof zzgd) {
                zzja.zza(zzfg.zza(), (Object) ((zzgd) next).zza().zzc());
            } else {
                zzja.zza(zzfg.zza(), next.getValue());
            }
        }
        zzih<?, ?> zzih = this.zzb;
        zzih.zzb(zzih.zzb(t), zzja);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.gms.internal.measurement.zzfo$zzd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.measurement.zzeb r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.measurement.zzfo r0 = (com.google.android.gms.internal.measurement.zzfo) r0
            com.google.android.gms.internal.measurement.zzig r1 = r0.zzb
            com.google.android.gms.internal.measurement.zzig r2 = com.google.android.gms.internal.measurement.zzig.zza()
            if (r1 != r2) goto L_0x0011
            com.google.android.gms.internal.measurement.zzig r1 = com.google.android.gms.internal.measurement.zzig.zzb()
            r0.zzb = r1
        L_0x0011:
            com.google.android.gms.internal.measurement.zzfo$zzb r10 = (com.google.android.gms.internal.measurement.zzfo.zzb) r10
            r10.zza()
            r10 = 0
            r0 = r10
        L_0x0018:
            if (r12 >= r13) goto L_0x00a4
            int r4 = com.google.android.gms.internal.measurement.zzec.zza(r11, r12, r14)
            int r2 = r14.zza
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L_0x0051
            r12 = r2 & 7
            if (r12 != r3) goto L_0x004c
            com.google.android.gms.internal.measurement.zzfd<?> r12 = r9.zzd
            com.google.android.gms.internal.measurement.zzfb r0 = r14.zzd
            com.google.android.gms.internal.measurement.zzgw r3 = r9.zza
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.zza(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.measurement.zzfo$zzd r0 = (com.google.android.gms.internal.measurement.zzfo.zzd) r0
            if (r0 != 0) goto L_0x0043
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.measurement.zzec.zza((int) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.measurement.zzig) r6, (com.google.android.gms.internal.measurement.zzeb) r7)
            goto L_0x0018
        L_0x0043:
            com.google.android.gms.internal.measurement.zzhl.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x004c:
            int r12 = com.google.android.gms.internal.measurement.zzec.zza((int) r2, (byte[]) r11, (int) r4, (int) r13, (com.google.android.gms.internal.measurement.zzeb) r14)
            goto L_0x0018
        L_0x0051:
            r12 = 0
            r2 = r10
        L_0x0053:
            if (r4 >= r13) goto L_0x0099
            int r4 = com.google.android.gms.internal.measurement.zzec.zza(r11, r4, r14)
            int r5 = r14.zza
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L_0x007b
            r8 = 3
            if (r6 == r8) goto L_0x0065
            goto L_0x0090
        L_0x0065:
            if (r0 != 0) goto L_0x0072
            if (r7 != r3) goto L_0x0090
            int r4 = com.google.android.gms.internal.measurement.zzec.zze(r11, r4, r14)
            java.lang.Object r2 = r14.zzc
            com.google.android.gms.internal.measurement.zzeg r2 = (com.google.android.gms.internal.measurement.zzeg) r2
            goto L_0x0053
        L_0x0072:
            com.google.android.gms.internal.measurement.zzhl.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x007b:
            if (r7 != 0) goto L_0x0090
            int r4 = com.google.android.gms.internal.measurement.zzec.zza(r11, r4, r14)
            int r12 = r14.zza
            com.google.android.gms.internal.measurement.zzfd<?> r0 = r9.zzd
            com.google.android.gms.internal.measurement.zzfb r5 = r14.zzd
            com.google.android.gms.internal.measurement.zzgw r6 = r9.zza
            java.lang.Object r0 = r0.zza(r5, r6, r12)
            com.google.android.gms.internal.measurement.zzfo$zzd r0 = (com.google.android.gms.internal.measurement.zzfo.zzd) r0
            goto L_0x0053
        L_0x0090:
            r6 = 12
            if (r5 == r6) goto L_0x0099
            int r4 = com.google.android.gms.internal.measurement.zzec.zza((int) r5, (byte[]) r11, (int) r4, (int) r13, (com.google.android.gms.internal.measurement.zzeb) r14)
            goto L_0x0053
        L_0x0099:
            if (r2 == 0) goto L_0x00a1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.zza((int) r12, (java.lang.Object) r2)
        L_0x00a1:
            r12 = r4
            goto L_0x0018
        L_0x00a4:
            if (r12 != r13) goto L_0x00a7
            return
        L_0x00a7:
            com.google.android.gms.internal.measurement.zzfw r10 = com.google.android.gms.internal.measurement.zzfw.zzg()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhc.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzeb):void");
    }

    public final void zza(T t, zzhm zzhm, zzfb zzfb) throws IOException {
        boolean z;
        zzih<?, ?> zzih = this.zzb;
        zzfd<?> zzfd = this.zzd;
        Object zzc2 = zzih.zzc(t);
        zzfe<?> zzb2 = zzfd.zzb(t);
        do {
            try {
                if (zzhm.zza() == Integer.MAX_VALUE) {
                    zzih.zzb((Object) t, zzc2);
                    return;
                }
                int zzb3 = zzhm.zzb();
                if (zzb3 == 11) {
                    int i = 0;
                    Object obj = null;
                    zzeg zzeg = null;
                    while (zzhm.zza() != Integer.MAX_VALUE) {
                        int zzb4 = zzhm.zzb();
                        if (zzb4 == 16) {
                            i = zzhm.zzo();
                            obj = zzfd.zza(zzfb, this.zza, i);
                        } else if (zzb4 == 26) {
                            if (obj != null) {
                                zzfd.zza(zzhm, obj, zzfb, zzb2);
                            } else {
                                zzeg = zzhm.zzn();
                            }
                        } else if (!zzhm.zzc()) {
                            break;
                        }
                    }
                    if (zzhm.zzb() != 12) {
                        throw zzfw.zze();
                    } else if (zzeg != null) {
                        if (obj != null) {
                            zzfd.zza(zzeg, obj, zzfb, zzb2);
                        } else {
                            zzih.zza(zzc2, i, zzeg);
                        }
                    }
                } else if ((zzb3 & 7) == 2) {
                    Object zza2 = zzfd.zza(zzfb, this.zza, zzb3 >>> 3);
                    if (zza2 != null) {
                        zzfd.zza(zzhm, zza2, zzfb, zzb2);
                    } else {
                        z = zzih.zza(zzc2, zzhm);
                        continue;
                    }
                } else {
                    z = zzhm.zzc();
                    continue;
                }
                z = true;
                continue;
            } finally {
                zzih.zzb((Object) t, zzc2);
            }
        } while (z);
    }

    public final void zzc(T t) {
        this.zzb.zzd(t);
        this.zzd.zzc(t);
    }

    public final boolean zzd(T t) {
        return this.zzd.zza((Object) t).zzf();
    }

    public final int zzb(T t) {
        zzih<?, ?> zzih = this.zzb;
        int zze = zzih.zze(zzih.zzb(t)) + 0;
        return this.zzc ? zze + this.zzd.zza((Object) t).zzg() : zze;
    }
}
