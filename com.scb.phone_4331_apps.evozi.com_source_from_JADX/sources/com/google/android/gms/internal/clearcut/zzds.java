package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

final class zzds<T> implements zzef<T> {
    private static final Unsafe zzmh = zzfd.zzef();
    private final int[] zzmi;
    private final Object[] zzmj;
    private final int zzmk;
    private final int zzml;
    private final int zzmm;
    private final zzdo zzmn;
    private final boolean zzmo;
    private final boolean zzmp;
    private final boolean zzmq;
    private final boolean zzmr;
    private final int[] zzms;
    private final int[] zzmt;
    private final int[] zzmu;
    private final zzdw zzmv;
    private final zzcy zzmw;
    private final zzex<?, ?> zzmx;
    private final zzbu<?> zzmy;
    private final zzdj zzmz;

    private zzds(int[] iArr, Object[] objArr, int i, int i2, int i3, zzdo zzdo, boolean z, boolean z2, int[] iArr2, int[] iArr3, int[] iArr4, zzdw zzdw, zzcy zzcy, zzex<?, ?> zzex, zzbu<?> zzbu, zzdj zzdj) {
        zzdo zzdo2 = zzdo;
        zzbu<?> zzbu2 = zzbu;
        this.zzmi = iArr;
        this.zzmj = objArr;
        this.zzmk = i;
        this.zzml = i2;
        this.zzmm = i3;
        this.zzmp = zzdo2 instanceof zzcg;
        this.zzmq = z;
        this.zzmo = zzbu2 != null && zzbu2.zze(zzdo);
        this.zzmr = false;
        this.zzms = iArr2;
        this.zzmt = iArr3;
        this.zzmu = iArr4;
        this.zzmv = zzdw;
        this.zzmw = zzcy;
        this.zzmx = zzex;
        this.zzmy = zzbu2;
        this.zzmn = zzdo2;
        this.zzmz = zzdj;
    }

    private static int zza(int i, byte[] bArr, int i2, int i3, Object obj, zzay zzay) throws IOException {
        return zzax.zza(i, bArr, i2, i3, zzn(obj), zzay);
    }

    private static int zza(zzef<?> zzef, int i, byte[] bArr, int i2, int i3, zzcn<?> zzcn, zzay zzay) throws IOException {
        int zza = zza((zzef) zzef, bArr, i2, i3, zzay);
        while (true) {
            zzcn.add(zzay.zzff);
            if (zza >= i3) {
                break;
            }
            int zza2 = zzax.zza(bArr, zza, zzay);
            if (i != zzay.zzfd) {
                break;
            }
            zza = zza((zzef) zzef, bArr, zza2, i3, zzay);
        }
        return zza;
    }

    private static int zza(zzef zzef, byte[] bArr, int i, int i2, int i3, zzay zzay) throws IOException {
        zzds zzds = (zzds) zzef;
        Object newInstance = zzds.newInstance();
        int zza = zzds.zza(newInstance, bArr, i, i2, i3, zzay);
        zzds.zzc(newInstance);
        zzay.zzff = newInstance;
        return zza;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zza(com.google.android.gms.internal.clearcut.zzef r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.clearcut.zzay r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = com.google.android.gms.internal.clearcut.zzax.zza((int) r8, (byte[]) r7, (int) r0, (com.google.android.gms.internal.clearcut.zzay) r10)
            int r8 = r10.zzfd
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.newInstance()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.zza(r1, r2, r3, r4, r5)
            r6.zzc(r9)
            r10.zzff = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.clearcut.zzco r6 = com.google.android.gms.internal.clearcut.zzco.zzbl()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zza(com.google.android.gms.internal.clearcut.zzef, byte[], int, int, com.google.android.gms.internal.clearcut.zzay):int");
    }

    private static <UT, UB> int zza(zzex<UT, UB> zzex, T t) {
        return zzex.zzm(zzex.zzq(t));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cc, code lost:
        if (r15 == null) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d0, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzci.zza(r15, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0101, code lost:
        r2 = r2 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0139, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0146, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x014a, code lost:
        r12.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0158, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0169, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016e, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004e, code lost:
        if (r15 == null) goto L_0x014a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zza(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.clearcut.zzay r29) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = zzmh
            int[] r7 = r0.zzmi
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x015e;
                case 52: goto L_0x014e;
                case 53: goto L_0x013e;
                case 54: goto L_0x013e;
                case 55: goto L_0x0131;
                case 56: goto L_0x0125;
                case 57: goto L_0x011a;
                case 58: goto L_0x0104;
                case 59: goto L_0x00d6;
                case 60: goto L_0x00b2;
                case 61: goto L_0x009c;
                case 62: goto L_0x0131;
                case 63: goto L_0x006e;
                case 64: goto L_0x011a;
                case 65: goto L_0x0125;
                case 66: goto L_0x0060;
                case 67: goto L_0x0052;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0172
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x0172
            com.google.android.gms.internal.clearcut.zzef r5 = r0.zzad(r6)
            r2 = r2 & -8
            r6 = r2 | 4
            r2 = r5
            r3 = r18
            r4 = r19
            r5 = r20
            r7 = r29
            int r2 = zza((com.google.android.gms.internal.clearcut.zzef) r2, (byte[]) r3, (int) r4, (int) r5, (int) r6, (com.google.android.gms.internal.clearcut.zzay) r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            java.lang.Object r3 = r11.zzff
            if (r15 != 0) goto L_0x00d0
            goto L_0x014a
        L_0x0052:
            if (r5 != 0) goto L_0x0172
            int r2 = com.google.android.gms.internal.clearcut.zzax.zzb(r3, r4, r11)
            long r3 = r11.zzfe
            long r3 = com.google.android.gms.internal.clearcut.zzbk.zza(r3)
            goto L_0x0146
        L_0x0060:
            if (r5 != 0) goto L_0x0172
            int r2 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r11)
            int r3 = r11.zzfd
            int r3 = com.google.android.gms.internal.clearcut.zzbk.zzm(r3)
            goto L_0x0139
        L_0x006e:
            if (r5 != 0) goto L_0x0172
            int r3 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r11)
            int r4 = r11.zzfd
            com.google.android.gms.internal.clearcut.zzck r5 = r0.zzaf(r6)
            if (r5 == 0) goto L_0x0092
            com.google.android.gms.internal.clearcut.zzcj r5 = r5.zzb(r4)
            if (r5 == 0) goto L_0x0083
            goto L_0x0092
        L_0x0083:
            com.google.android.gms.internal.clearcut.zzey r1 = zzn(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.zzb(r2, r4)
            r2 = r3
            goto L_0x0173
        L_0x0092:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x016e
        L_0x009c:
            if (r5 != r15) goto L_0x0172
            int r2 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r11)
            int r4 = r11.zzfd
            if (r4 != 0) goto L_0x00aa
            com.google.android.gms.internal.clearcut.zzbb r3 = com.google.android.gms.internal.clearcut.zzbb.zzfi
            goto L_0x014a
        L_0x00aa:
            com.google.android.gms.internal.clearcut.zzbb r3 = com.google.android.gms.internal.clearcut.zzbb.zzb((byte[]) r3, (int) r2, (int) r4)
            r12.putObject(r1, r9, r3)
            goto L_0x0101
        L_0x00b2:
            if (r5 != r15) goto L_0x0172
            com.google.android.gms.internal.clearcut.zzef r2 = r0.zzad(r6)
            r5 = r20
            int r2 = zza((com.google.android.gms.internal.clearcut.zzef) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.clearcut.zzay) r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00c9
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00ca
        L_0x00c9:
            r15 = 0
        L_0x00ca:
            java.lang.Object r3 = r11.zzff
            if (r15 != 0) goto L_0x00d0
            goto L_0x014a
        L_0x00d0:
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.zzci.zza((java.lang.Object) r15, (java.lang.Object) r3)
            goto L_0x014a
        L_0x00d6:
            if (r5 != r15) goto L_0x0172
            int r2 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r11)
            int r4 = r11.zzfd
            if (r4 != 0) goto L_0x00e3
            java.lang.String r3 = ""
            goto L_0x014a
        L_0x00e3:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x00f7
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.clearcut.zzff.zze((byte[]) r3, (int) r2, (int) r5)
            if (r5 == 0) goto L_0x00f2
            goto L_0x00f7
        L_0x00f2:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.zzbp()
            throw r1
        L_0x00f7:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.clearcut.zzci.UTF_8
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
        L_0x0101:
            int r2 = r2 + r4
            goto L_0x016e
        L_0x0104:
            if (r5 != 0) goto L_0x0172
            int r2 = com.google.android.gms.internal.clearcut.zzax.zzb(r3, r4, r11)
            long r3 = r11.zzfe
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0114
            r15 = 1
            goto L_0x0115
        L_0x0114:
            r15 = 0
        L_0x0115:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            goto L_0x014a
        L_0x011a:
            if (r5 != r7) goto L_0x0172
            int r2 = com.google.android.gms.internal.clearcut.zzax.zzc(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0158
        L_0x0125:
            r2 = 1
            if (r5 != r2) goto L_0x0172
            long r2 = com.google.android.gms.internal.clearcut.zzax.zzd(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x0169
        L_0x0131:
            if (r5 != 0) goto L_0x0172
            int r2 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r11)
            int r3 = r11.zzfd
        L_0x0139:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x014a
        L_0x013e:
            if (r5 != 0) goto L_0x0172
            int r2 = com.google.android.gms.internal.clearcut.zzax.zzb(r3, r4, r11)
            long r3 = r11.zzfe
        L_0x0146:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x014a:
            r12.putObject(r1, r9, r3)
            goto L_0x016e
        L_0x014e:
            if (r5 != r7) goto L_0x0172
            float r2 = com.google.android.gms.internal.clearcut.zzax.zzf(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
        L_0x0158:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 4
            goto L_0x016e
        L_0x015e:
            r2 = 1
            if (r5 != r2) goto L_0x0172
            double r2 = com.google.android.gms.internal.clearcut.zzax.zze(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
        L_0x0169:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 8
        L_0x016e:
            r12.putInt(r1, r13, r8)
            goto L_0x0173
        L_0x0172:
            r2 = r4
        L_0x0173:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zza(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.clearcut.zzay):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0236, code lost:
        if (r7.zzfe != 0) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0239, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x023a, code lost:
        r11.addBoolean(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x023d, code lost:
        if (r4 >= r5) goto L_0x0393;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x023f, code lost:
        r6 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0245, code lost:
        if (r2 != r7.zzfd) goto L_0x0393;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0247, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzax.zzb(r3, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x024f, code lost:
        if (r7.zzfe == 0) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0251, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013a, code lost:
        if (r4 == 0) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013d, code lost:
        r11.add(com.google.android.gms.internal.clearcut.zzbb.zzb(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0145, code lost:
        if (r1 >= r5) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0147, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014d, code lost:
        if (r2 != r7.zzfd) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014f, code lost:
        r1 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7);
        r4 = r7.zzfd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0155, code lost:
        if (r4 != 0) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0157, code lost:
        r11.add(com.google.android.gms.internal.clearcut.zzbb.zzfi);
     */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zza(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.clearcut.zzay r30) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r23
            r8 = r24
            r9 = r28
            r7 = r30
            sun.misc.Unsafe r11 = zzmh
            java.lang.Object r11 = r11.getObject(r1, r9)
            com.google.android.gms.internal.clearcut.zzcn r11 = (com.google.android.gms.internal.clearcut.zzcn) r11
            boolean r12 = r11.zzu()
            r13 = 1
            if (r12 != 0) goto L_0x0036
            int r12 = r11.size()
            if (r12 != 0) goto L_0x002c
            r12 = 10
            goto L_0x002d
        L_0x002c:
            int r12 = r12 << r13
        L_0x002d:
            com.google.android.gms.internal.clearcut.zzcn r11 = r11.zzi(r12)
            sun.misc.Unsafe r12 = zzmh
            r12.putObject(r1, r9, r11)
        L_0x0036:
            r9 = 5
            r14 = 0
            r10 = 2
            switch(r27) {
                case 18: goto L_0x0358;
                case 19: goto L_0x031d;
                case 20: goto L_0x02e5;
                case 21: goto L_0x02e5;
                case 22: goto L_0x02cb;
                case 23: goto L_0x028f;
                case 24: goto L_0x0253;
                case 25: goto L_0x0202;
                case 26: goto L_0x0177;
                case 27: goto L_0x015d;
                case 28: goto L_0x0132;
                case 29: goto L_0x02cb;
                case 30: goto L_0x00fa;
                case 31: goto L_0x0253;
                case 32: goto L_0x028f;
                case 33: goto L_0x00ba;
                case 34: goto L_0x007a;
                case 35: goto L_0x0358;
                case 36: goto L_0x031d;
                case 37: goto L_0x02e5;
                case 38: goto L_0x02e5;
                case 39: goto L_0x02cb;
                case 40: goto L_0x028f;
                case 41: goto L_0x0253;
                case 42: goto L_0x0202;
                case 43: goto L_0x02cb;
                case 44: goto L_0x00fa;
                case 45: goto L_0x0253;
                case 46: goto L_0x028f;
                case 47: goto L_0x00ba;
                case 48: goto L_0x007a;
                case 49: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0393
        L_0x003f:
            r1 = 3
            if (r6 != r1) goto L_0x0393
            com.google.android.gms.internal.clearcut.zzef r1 = r0.zzad(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = zza((com.google.android.gms.internal.clearcut.zzef) r22, (byte[]) r23, (int) r24, (int) r25, (int) r26, (com.google.android.gms.internal.clearcut.zzay) r27)
        L_0x005a:
            java.lang.Object r8 = r7.zzff
            r11.add(r8)
            if (r4 >= r5) goto L_0x0393
            int r8 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7)
            int r9 = r7.zzfd
            if (r2 != r9) goto L_0x0393
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = zza((com.google.android.gms.internal.clearcut.zzef) r22, (byte[]) r23, (int) r24, (int) r25, (int) r26, (com.google.android.gms.internal.clearcut.zzay) r27)
            goto L_0x005a
        L_0x007a:
            if (r6 != r10) goto L_0x009e
            com.google.android.gms.internal.clearcut.zzdc r11 = (com.google.android.gms.internal.clearcut.zzdc) r11
            int r1 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7)
            int r2 = r7.zzfd
            int r2 = r2 + r1
        L_0x0085:
            if (r1 >= r2) goto L_0x0095
            int r1 = com.google.android.gms.internal.clearcut.zzax.zzb(r3, r1, r7)
            long r4 = r7.zzfe
            long r4 = com.google.android.gms.internal.clearcut.zzbk.zza(r4)
            r11.zzm(r4)
            goto L_0x0085
        L_0x0095:
            if (r1 != r2) goto L_0x0099
            goto L_0x0394
        L_0x0099:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.zzbl()
            throw r1
        L_0x009e:
            if (r6 != 0) goto L_0x0393
            com.google.android.gms.internal.clearcut.zzdc r11 = (com.google.android.gms.internal.clearcut.zzdc) r11
        L_0x00a2:
            int r1 = com.google.android.gms.internal.clearcut.zzax.zzb(r3, r4, r7)
            long r8 = r7.zzfe
            long r8 = com.google.android.gms.internal.clearcut.zzbk.zza(r8)
            r11.zzm(r8)
            if (r1 >= r5) goto L_0x0394
            int r4 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r1, r7)
            int r6 = r7.zzfd
            if (r2 != r6) goto L_0x0394
            goto L_0x00a2
        L_0x00ba:
            if (r6 != r10) goto L_0x00de
            com.google.android.gms.internal.clearcut.zzch r11 = (com.google.android.gms.internal.clearcut.zzch) r11
            int r1 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7)
            int r2 = r7.zzfd
            int r2 = r2 + r1
        L_0x00c5:
            if (r1 >= r2) goto L_0x00d5
            int r1 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r1, r7)
            int r4 = r7.zzfd
            int r4 = com.google.android.gms.internal.clearcut.zzbk.zzm(r4)
            r11.zzac(r4)
            goto L_0x00c5
        L_0x00d5:
            if (r1 != r2) goto L_0x00d9
            goto L_0x0394
        L_0x00d9:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.zzbl()
            throw r1
        L_0x00de:
            if (r6 != 0) goto L_0x0393
            com.google.android.gms.internal.clearcut.zzch r11 = (com.google.android.gms.internal.clearcut.zzch) r11
        L_0x00e2:
            int r1 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7)
            int r4 = r7.zzfd
            int r4 = com.google.android.gms.internal.clearcut.zzbk.zzm(r4)
            r11.zzac(r4)
            if (r1 >= r5) goto L_0x0394
            int r4 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r1, r7)
            int r6 = r7.zzfd
            if (r2 != r6) goto L_0x0394
            goto L_0x00e2
        L_0x00fa:
            if (r6 != r10) goto L_0x0101
            int r2 = com.google.android.gms.internal.clearcut.zzax.zza((byte[]) r3, (int) r4, (com.google.android.gms.internal.clearcut.zzcn<?>) r11, (com.google.android.gms.internal.clearcut.zzay) r7)
            goto L_0x0112
        L_0x0101:
            if (r6 != 0) goto L_0x0393
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r11
            r7 = r30
            int r2 = com.google.android.gms.internal.clearcut.zzax.zza((int) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.clearcut.zzcn<?>) r6, (com.google.android.gms.internal.clearcut.zzay) r7)
        L_0x0112:
            com.google.android.gms.internal.clearcut.zzcg r1 = (com.google.android.gms.internal.clearcut.zzcg) r1
            com.google.android.gms.internal.clearcut.zzey r3 = r1.zzjp
            com.google.android.gms.internal.clearcut.zzey r4 = com.google.android.gms.internal.clearcut.zzey.zzea()
            if (r3 != r4) goto L_0x011d
            r3 = 0
        L_0x011d:
            com.google.android.gms.internal.clearcut.zzck r4 = r0.zzaf(r8)
            com.google.android.gms.internal.clearcut.zzex<?, ?> r5 = r0.zzmx
            r6 = r22
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.zzeh.zza(r6, r11, r4, r3, r5)
            com.google.android.gms.internal.clearcut.zzey r3 = (com.google.android.gms.internal.clearcut.zzey) r3
            if (r3 == 0) goto L_0x012f
            r1.zzjp = r3
        L_0x012f:
            r1 = r2
            goto L_0x0394
        L_0x0132:
            if (r6 != r10) goto L_0x0393
            int r1 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7)
            int r4 = r7.zzfd
            if (r4 != 0) goto L_0x013d
            goto L_0x0157
        L_0x013d:
            com.google.android.gms.internal.clearcut.zzbb r6 = com.google.android.gms.internal.clearcut.zzbb.zzb((byte[]) r3, (int) r1, (int) r4)
            r11.add(r6)
            int r1 = r1 + r4
        L_0x0145:
            if (r1 >= r5) goto L_0x0394
            int r4 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r1, r7)
            int r6 = r7.zzfd
            if (r2 != r6) goto L_0x0394
            int r1 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7)
            int r4 = r7.zzfd
            if (r4 != 0) goto L_0x013d
        L_0x0157:
            com.google.android.gms.internal.clearcut.zzbb r4 = com.google.android.gms.internal.clearcut.zzbb.zzfi
            r11.add(r4)
            goto L_0x0145
        L_0x015d:
            if (r6 != r10) goto L_0x0393
            com.google.android.gms.internal.clearcut.zzef r1 = r0.zzad(r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r11
            r28 = r30
            int r1 = zza((com.google.android.gms.internal.clearcut.zzef<?>) r22, (int) r23, (byte[]) r24, (int) r25, (int) r26, (com.google.android.gms.internal.clearcut.zzcn<?>) r27, (com.google.android.gms.internal.clearcut.zzay) r28)
            goto L_0x0394
        L_0x0177:
            if (r6 != r10) goto L_0x0393
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            int r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x01b6
            int r1 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7)
            int r4 = r7.zzfd
            if (r4 != 0) goto L_0x018d
            goto L_0x01aa
        L_0x018d:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.clearcut.zzci.UTF_8
            r8.<init>(r3, r1, r4, r9)
        L_0x0194:
            r11.add(r8)
            int r1 = r1 + r4
        L_0x0198:
            if (r1 >= r5) goto L_0x0394
            int r4 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r1, r7)
            int r8 = r7.zzfd
            if (r2 != r8) goto L_0x0394
            int r1 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7)
            int r4 = r7.zzfd
            if (r4 != 0) goto L_0x01ae
        L_0x01aa:
            r11.add(r6)
            goto L_0x0198
        L_0x01ae:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.clearcut.zzci.UTF_8
            r8.<init>(r3, r1, r4, r9)
            goto L_0x0194
        L_0x01b6:
            int r1 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7)
            int r4 = r7.zzfd
            if (r4 != 0) goto L_0x01bf
            goto L_0x01e4
        L_0x01bf:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.clearcut.zzff.zze((byte[]) r3, (int) r1, (int) r8)
            if (r9 == 0) goto L_0x01fd
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.clearcut.zzci.UTF_8
            r9.<init>(r3, r1, r4, r10)
        L_0x01ce:
            r11.add(r9)
            r1 = r8
        L_0x01d2:
            if (r1 >= r5) goto L_0x0394
            int r4 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r1, r7)
            int r8 = r7.zzfd
            if (r2 != r8) goto L_0x0394
            int r1 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7)
            int r4 = r7.zzfd
            if (r4 != 0) goto L_0x01e8
        L_0x01e4:
            r11.add(r6)
            goto L_0x01d2
        L_0x01e8:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.clearcut.zzff.zze((byte[]) r3, (int) r1, (int) r8)
            if (r9 == 0) goto L_0x01f8
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.clearcut.zzci.UTF_8
            r9.<init>(r3, r1, r4, r10)
            goto L_0x01ce
        L_0x01f8:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.zzbp()
            throw r1
        L_0x01fd:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.zzbp()
            throw r1
        L_0x0202:
            r1 = 0
            if (r6 != r10) goto L_0x022a
            com.google.android.gms.internal.clearcut.zzaz r11 = (com.google.android.gms.internal.clearcut.zzaz) r11
            int r2 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7)
            int r4 = r7.zzfd
            int r4 = r4 + r2
        L_0x020e:
            if (r2 >= r4) goto L_0x0221
            int r2 = com.google.android.gms.internal.clearcut.zzax.zzb(r3, r2, r7)
            long r5 = r7.zzfe
            int r5 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x021c
            r5 = r13
            goto L_0x021d
        L_0x021c:
            r5 = r1
        L_0x021d:
            r11.addBoolean(r5)
            goto L_0x020e
        L_0x0221:
            if (r2 != r4) goto L_0x0225
            goto L_0x012f
        L_0x0225:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.zzbl()
            throw r1
        L_0x022a:
            if (r6 != 0) goto L_0x0393
            com.google.android.gms.internal.clearcut.zzaz r11 = (com.google.android.gms.internal.clearcut.zzaz) r11
            int r4 = com.google.android.gms.internal.clearcut.zzax.zzb(r3, r4, r7)
            long r8 = r7.zzfe
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0239
            goto L_0x0251
        L_0x0239:
            r6 = r1
        L_0x023a:
            r11.addBoolean(r6)
            if (r4 >= r5) goto L_0x0393
            int r6 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7)
            int r8 = r7.zzfd
            if (r2 != r8) goto L_0x0393
            int r4 = com.google.android.gms.internal.clearcut.zzax.zzb(r3, r6, r7)
            long r8 = r7.zzfe
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0239
        L_0x0251:
            r6 = r13
            goto L_0x023a
        L_0x0253:
            if (r6 != r10) goto L_0x0273
            com.google.android.gms.internal.clearcut.zzch r11 = (com.google.android.gms.internal.clearcut.zzch) r11
            int r1 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7)
            int r2 = r7.zzfd
            int r2 = r2 + r1
        L_0x025e:
            if (r1 >= r2) goto L_0x026a
            int r4 = com.google.android.gms.internal.clearcut.zzax.zzc(r3, r1)
            r11.zzac(r4)
            int r1 = r1 + 4
            goto L_0x025e
        L_0x026a:
            if (r1 != r2) goto L_0x026e
            goto L_0x0394
        L_0x026e:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.zzbl()
            throw r1
        L_0x0273:
            if (r6 != r9) goto L_0x0393
            com.google.android.gms.internal.clearcut.zzch r11 = (com.google.android.gms.internal.clearcut.zzch) r11
            int r1 = com.google.android.gms.internal.clearcut.zzax.zzc(r18, r19)
        L_0x027b:
            r11.zzac(r1)
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0394
            int r4 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r1, r7)
            int r6 = r7.zzfd
            if (r2 != r6) goto L_0x0394
            int r1 = com.google.android.gms.internal.clearcut.zzax.zzc(r3, r4)
            goto L_0x027b
        L_0x028f:
            if (r6 != r10) goto L_0x02af
            com.google.android.gms.internal.clearcut.zzdc r11 = (com.google.android.gms.internal.clearcut.zzdc) r11
            int r1 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7)
            int r2 = r7.zzfd
            int r2 = r2 + r1
        L_0x029a:
            if (r1 >= r2) goto L_0x02a6
            long r4 = com.google.android.gms.internal.clearcut.zzax.zzd(r3, r1)
            r11.zzm(r4)
            int r1 = r1 + 8
            goto L_0x029a
        L_0x02a6:
            if (r1 != r2) goto L_0x02aa
            goto L_0x0394
        L_0x02aa:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.zzbl()
            throw r1
        L_0x02af:
            if (r6 != r13) goto L_0x0393
            com.google.android.gms.internal.clearcut.zzdc r11 = (com.google.android.gms.internal.clearcut.zzdc) r11
            long r8 = com.google.android.gms.internal.clearcut.zzax.zzd(r18, r19)
        L_0x02b7:
            r11.zzm(r8)
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0394
            int r4 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r1, r7)
            int r6 = r7.zzfd
            if (r2 != r6) goto L_0x0394
            long r8 = com.google.android.gms.internal.clearcut.zzax.zzd(r3, r4)
            goto L_0x02b7
        L_0x02cb:
            if (r6 != r10) goto L_0x02d3
            int r1 = com.google.android.gms.internal.clearcut.zzax.zza((byte[]) r3, (int) r4, (com.google.android.gms.internal.clearcut.zzcn<?>) r11, (com.google.android.gms.internal.clearcut.zzay) r7)
            goto L_0x0394
        L_0x02d3:
            if (r6 != 0) goto L_0x0393
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r11
            r26 = r30
            int r1 = com.google.android.gms.internal.clearcut.zzax.zza((int) r21, (byte[]) r22, (int) r23, (int) r24, (com.google.android.gms.internal.clearcut.zzcn<?>) r25, (com.google.android.gms.internal.clearcut.zzay) r26)
            goto L_0x0394
        L_0x02e5:
            if (r6 != r10) goto L_0x0305
            com.google.android.gms.internal.clearcut.zzdc r11 = (com.google.android.gms.internal.clearcut.zzdc) r11
            int r1 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7)
            int r2 = r7.zzfd
            int r2 = r2 + r1
        L_0x02f0:
            if (r1 >= r2) goto L_0x02fc
            int r1 = com.google.android.gms.internal.clearcut.zzax.zzb(r3, r1, r7)
            long r4 = r7.zzfe
            r11.zzm(r4)
            goto L_0x02f0
        L_0x02fc:
            if (r1 != r2) goto L_0x0300
            goto L_0x0394
        L_0x0300:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.zzbl()
            throw r1
        L_0x0305:
            if (r6 != 0) goto L_0x0393
            com.google.android.gms.internal.clearcut.zzdc r11 = (com.google.android.gms.internal.clearcut.zzdc) r11
        L_0x0309:
            int r1 = com.google.android.gms.internal.clearcut.zzax.zzb(r3, r4, r7)
            long r8 = r7.zzfe
            r11.zzm(r8)
            if (r1 >= r5) goto L_0x0394
            int r4 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r1, r7)
            int r6 = r7.zzfd
            if (r2 != r6) goto L_0x0394
            goto L_0x0309
        L_0x031d:
            if (r6 != r10) goto L_0x033c
            com.google.android.gms.internal.clearcut.zzce r11 = (com.google.android.gms.internal.clearcut.zzce) r11
            int r1 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7)
            int r2 = r7.zzfd
            int r2 = r2 + r1
        L_0x0328:
            if (r1 >= r2) goto L_0x0334
            float r4 = com.google.android.gms.internal.clearcut.zzax.zzf(r3, r1)
            r11.zzc(r4)
            int r1 = r1 + 4
            goto L_0x0328
        L_0x0334:
            if (r1 != r2) goto L_0x0337
            goto L_0x0394
        L_0x0337:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.zzbl()
            throw r1
        L_0x033c:
            if (r6 != r9) goto L_0x0393
            com.google.android.gms.internal.clearcut.zzce r11 = (com.google.android.gms.internal.clearcut.zzce) r11
            float r1 = com.google.android.gms.internal.clearcut.zzax.zzf(r18, r19)
        L_0x0344:
            r11.zzc(r1)
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0394
            int r4 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r1, r7)
            int r6 = r7.zzfd
            if (r2 != r6) goto L_0x0394
            float r1 = com.google.android.gms.internal.clearcut.zzax.zzf(r3, r4)
            goto L_0x0344
        L_0x0358:
            if (r6 != r10) goto L_0x0377
            com.google.android.gms.internal.clearcut.zzbq r11 = (com.google.android.gms.internal.clearcut.zzbq) r11
            int r1 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r4, r7)
            int r2 = r7.zzfd
            int r2 = r2 + r1
        L_0x0363:
            if (r1 >= r2) goto L_0x036f
            double r4 = com.google.android.gms.internal.clearcut.zzax.zze(r3, r1)
            r11.zzc(r4)
            int r1 = r1 + 8
            goto L_0x0363
        L_0x036f:
            if (r1 != r2) goto L_0x0372
            goto L_0x0394
        L_0x0372:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.zzbl()
            throw r1
        L_0x0377:
            if (r6 != r13) goto L_0x0393
            com.google.android.gms.internal.clearcut.zzbq r11 = (com.google.android.gms.internal.clearcut.zzbq) r11
            double r8 = com.google.android.gms.internal.clearcut.zzax.zze(r18, r19)
        L_0x037f:
            r11.zzc(r8)
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0394
            int r4 = com.google.android.gms.internal.clearcut.zzax.zza(r3, r1, r7)
            int r6 = r7.zzfd
            if (r2 != r6) goto L_0x0394
            double r8 = com.google.android.gms.internal.clearcut.zzax.zze(r3, r4)
            goto L_0x037f
        L_0x0393:
            r1 = r4
        L_0x0394:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zza(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.clearcut.zzay):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <K, V> int zza(T r7, byte[] r8, int r9, int r10, int r11, int r12, long r13, com.google.android.gms.internal.clearcut.zzay r15) throws java.io.IOException {
        /*
            r6 = this;
            sun.misc.Unsafe r12 = zzmh
            java.lang.Object r11 = r6.zzae(r11)
            java.lang.Object r0 = r12.getObject(r7, r13)
            com.google.android.gms.internal.clearcut.zzdj r1 = r6.zzmz
            boolean r1 = r1.zzi(r0)
            if (r1 == 0) goto L_0x0021
            com.google.android.gms.internal.clearcut.zzdj r1 = r6.zzmz
            java.lang.Object r1 = r1.zzk(r11)
            com.google.android.gms.internal.clearcut.zzdj r2 = r6.zzmz
            r2.zzb(r1, r0)
            r12.putObject(r7, r13, r1)
            r0 = r1
        L_0x0021:
            com.google.android.gms.internal.clearcut.zzdj r7 = r6.zzmz
            com.google.android.gms.internal.clearcut.zzdh r7 = r7.zzl(r11)
            com.google.android.gms.internal.clearcut.zzdj r11 = r6.zzmz
            java.util.Map r11 = r11.zzg(r0)
            int r9 = com.google.android.gms.internal.clearcut.zzax.zza(r8, r9, r15)
            int r12 = r15.zzfd
            if (r12 < 0) goto L_0x0097
            int r13 = r10 - r9
            if (r12 > r13) goto L_0x0097
            int r12 = r12 + r9
            K r13 = r7.zzmc
            V r14 = r7.zzdu
        L_0x003e:
            if (r9 >= r12) goto L_0x008c
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x004c
            int r0 = com.google.android.gms.internal.clearcut.zzax.zza((int) r9, (byte[]) r8, (int) r0, (com.google.android.gms.internal.clearcut.zzay) r15)
            int r9 = r15.zzfd
        L_0x004c:
            r1 = r0
            int r0 = r9 >>> 3
            r2 = r9 & 7
            r3 = 1
            if (r0 == r3) goto L_0x0072
            r3 = 2
            if (r0 == r3) goto L_0x0058
            goto L_0x0087
        L_0x0058:
            com.google.android.gms.internal.clearcut.zzfl r0 = r7.zzmd
            int r0 = r0.zzel()
            if (r2 != r0) goto L_0x0087
            com.google.android.gms.internal.clearcut.zzfl r3 = r7.zzmd
            V r9 = r7.zzdu
            java.lang.Class r4 = r9.getClass()
            r0 = r8
            r2 = r10
            r5 = r15
            int r9 = zza((byte[]) r0, (int) r1, (int) r2, (com.google.android.gms.internal.clearcut.zzfl) r3, (java.lang.Class<?>) r4, (com.google.android.gms.internal.clearcut.zzay) r5)
            java.lang.Object r14 = r15.zzff
            goto L_0x003e
        L_0x0072:
            com.google.android.gms.internal.clearcut.zzfl r0 = r7.zzmb
            int r0 = r0.zzel()
            if (r2 != r0) goto L_0x0087
            com.google.android.gms.internal.clearcut.zzfl r3 = r7.zzmb
            r4 = 0
            r0 = r8
            r2 = r10
            r5 = r15
            int r9 = zza((byte[]) r0, (int) r1, (int) r2, (com.google.android.gms.internal.clearcut.zzfl) r3, (java.lang.Class<?>) r4, (com.google.android.gms.internal.clearcut.zzay) r5)
            java.lang.Object r13 = r15.zzff
            goto L_0x003e
        L_0x0087:
            int r9 = com.google.android.gms.internal.clearcut.zzax.zza(r9, r8, r1, r10, r15)
            goto L_0x003e
        L_0x008c:
            if (r9 != r12) goto L_0x0092
            r11.put(r13, r14)
            return r12
        L_0x0092:
            com.google.android.gms.internal.clearcut.zzco r7 = com.google.android.gms.internal.clearcut.zzco.zzbo()
            throw r7
        L_0x0097:
            com.google.android.gms.internal.clearcut.zzco r7 = com.google.android.gms.internal.clearcut.zzco.zzbl()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zza(java.lang.Object, byte[], int, int, int, int, long, com.google.android.gms.internal.clearcut.zzay):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v44, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v45, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x032b, code lost:
        if (r0 == r24) goto L_0x032d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0378, code lost:
        if (r0 == r14) goto L_0x032d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d9, code lost:
        r12 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x013d, code lost:
        r6 = r6 | r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x013e, code lost:
        r13 = r32;
        r31 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0161, code lost:
        r1 = r9.zzff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x016f, code lost:
        r13 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0192, code lost:
        r10.putObject(r15, r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01cf, code lost:
        r1 = r6 | r8;
        r31 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f6, code lost:
        r31 = r7;
        r7 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0270, code lost:
        r2 = r7 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0272, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0273, code lost:
        r1 = r6 | r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0275, code lost:
        r7 = r0;
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0277, code lost:
        r6 = r0;
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0279, code lost:
        r7 = r31;
        r5 = r11;
        r1 = r14;
        r4 = r15;
        r8 = -1;
        r15 = r28;
        r14 = r29;
        r11 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0287, code lost:
        r8 = r33;
        r2 = r7;
        r25 = r10;
        r15 = r13;
        r9 = r14;
        r7 = r31;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03a8 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zza(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.clearcut.zzay r34) throws java.io.IOException {
        /*
            r28 = this;
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r9 = r34
            sun.misc.Unsafe r10 = zzmh
            r16 = 0
            r8 = -1
            r0 = r31
            r7 = r8
            r4 = r14
            r5 = r15
            r1 = r16
            r6 = r1
        L_0x0019:
            r17 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 >= r13) goto L_0x03ce
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002d
            int r0 = com.google.android.gms.internal.clearcut.zzax.zza((int) r0, (byte[]) r12, (int) r1, (com.google.android.gms.internal.clearcut.zzay) r9)
            int r1 = r9.zzfd
            r2 = r0
            r3 = r1
            goto L_0x002f
        L_0x002d:
            r3 = r0
            r2 = r1
        L_0x002f:
            int r1 = r3 >>> 3
            r0 = r3 & 7
            int r14 = r5.zzai(r1)
            if (r14 == r8) goto L_0x0393
            int[] r8 = r5.zzmi
            int r19 = r14 + 1
            r11 = r8[r19]
            r19 = 267386880(0xff00000, float:2.3665827E-29)
            r19 = r11 & r19
            int r15 = r19 >>> 20
            r31 = r3
            r3 = r11 & r17
            r19 = r11
            long r11 = (long) r3
            r3 = 17
            if (r15 > r3) goto L_0x0292
            int r3 = r14 + 2
            r3 = r8[r3]
            int r8 = r3 >>> 20
            r13 = 1
            int r8 = r13 << r8
            r3 = r3 & r17
            if (r3 == r7) goto L_0x006d
            r13 = -1
            r18 = r14
            if (r7 == r13) goto L_0x0066
            long r13 = (long) r7
            r10.putInt(r4, r13, r6)
        L_0x0066:
            long r6 = (long) r3
            int r6 = r10.getInt(r4, r6)
            r7 = r3
            goto L_0x006f
        L_0x006d:
            r18 = r14
        L_0x006f:
            r3 = 5
            switch(r15) {
                case 0: goto L_0x0257;
                case 1: goto L_0x023c;
                case 2: goto L_0x0217;
                case 3: goto L_0x0217;
                case 4: goto L_0x01fb;
                case 5: goto L_0x01d5;
                case 6: goto L_0x01b8;
                case 7: goto L_0x0196;
                case 8: goto L_0x0173;
                case 9: goto L_0x0144;
                case 10: goto L_0x0127;
                case 11: goto L_0x01fb;
                case 12: goto L_0x00f5;
                case 13: goto L_0x01b8;
                case 14: goto L_0x01d5;
                case 15: goto L_0x00dd;
                case 16: goto L_0x00b2;
                case 17: goto L_0x0079;
                default: goto L_0x0073;
            }
        L_0x0073:
            r12 = r30
            r14 = r31
            goto L_0x016f
        L_0x0079:
            r3 = 3
            if (r0 != r3) goto L_0x00af
            r13 = r18
            com.google.android.gms.internal.clearcut.zzef r0 = r5.zzad(r13)
            int r1 = r1 << 3
            r13 = r1 | 4
            r1 = r30
            r14 = r31
            r3 = r32
            r15 = r4
            r4 = r13
            r13 = r5
            r5 = r34
            int r0 = zza((com.google.android.gms.internal.clearcut.zzef) r0, (byte[]) r1, (int) r2, (int) r3, (int) r4, (com.google.android.gms.internal.clearcut.zzay) r5)
            r1 = r6 & r8
            if (r1 != 0) goto L_0x009c
            java.lang.Object r1 = r9.zzff
            goto L_0x00a6
        L_0x009c:
            java.lang.Object r1 = r10.getObject(r15, r11)
            java.lang.Object r2 = r9.zzff
            java.lang.Object r1 = com.google.android.gms.internal.clearcut.zzci.zza((java.lang.Object) r1, (java.lang.Object) r2)
        L_0x00a6:
            r10.putObject(r15, r11, r1)
            r6 = r6 | r8
            r12 = r30
            r11 = r13
            goto L_0x013e
        L_0x00af:
            r14 = r31
            goto L_0x00d9
        L_0x00b2:
            r14 = r31
            r15 = r4
            r13 = r5
            if (r0 != 0) goto L_0x00d9
            r4 = r11
            r12 = r30
            int r11 = com.google.android.gms.internal.clearcut.zzax.zzb(r12, r2, r9)
            long r0 = r9.zzfe
            long r17 = com.google.android.gms.internal.clearcut.zzbk.zza(r0)
            r0 = r10
            r1 = r29
            r2 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            r0 = r6 | r8
            r6 = r0
            r31 = r7
            r0 = r11
            r11 = r13
            r13 = r32
            goto L_0x0279
        L_0x00d9:
            r12 = r30
            goto L_0x016f
        L_0x00dd:
            r14 = r31
            r15 = r4
            r13 = r5
            r4 = r11
            r12 = r30
            if (r0 != 0) goto L_0x016f
            int r0 = com.google.android.gms.internal.clearcut.zzax.zza(r12, r2, r9)
            int r1 = r9.zzfd
            int r1 = com.google.android.gms.internal.clearcut.zzbk.zzm(r1)
            r10.putInt(r15, r4, r1)
            r11 = r13
            goto L_0x013d
        L_0x00f5:
            r14 = r31
            r15 = r4
            r13 = r18
            r26 = r11
            r12 = r30
            r11 = r5
            r4 = r26
            if (r0 != 0) goto L_0x016f
            int r0 = com.google.android.gms.internal.clearcut.zzax.zza(r12, r2, r9)
            int r1 = r9.zzfd
            com.google.android.gms.internal.clearcut.zzck r2 = r11.zzaf(r13)
            if (r2 == 0) goto L_0x0123
            com.google.android.gms.internal.clearcut.zzcj r2 = r2.zzb(r1)
            if (r2 == 0) goto L_0x0116
            goto L_0x0123
        L_0x0116:
            com.google.android.gms.internal.clearcut.zzey r2 = zzn(r29)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.zzb(r14, r1)
            goto L_0x013e
        L_0x0123:
            r10.putInt(r15, r4, r1)
            goto L_0x013d
        L_0x0127:
            r14 = r31
            r15 = r4
            r1 = 2
            r26 = r11
            r12 = r30
            r11 = r5
            r4 = r26
            if (r0 != r1) goto L_0x016f
            int r0 = com.google.android.gms.internal.clearcut.zzax.zze(r12, r2, r9)
            java.lang.Object r1 = r9.zzff
            r10.putObject(r15, r4, r1)
        L_0x013d:
            r6 = r6 | r8
        L_0x013e:
            r13 = r32
            r31 = r7
            goto L_0x0279
        L_0x0144:
            r14 = r31
            r15 = r4
            r13 = r18
            r1 = 2
            r26 = r11
            r12 = r30
            r11 = r5
            r4 = r26
            if (r0 != r1) goto L_0x016f
            com.google.android.gms.internal.clearcut.zzef r0 = r11.zzad(r13)
            r13 = r32
            int r0 = zza((com.google.android.gms.internal.clearcut.zzef) r0, (byte[]) r12, (int) r2, (int) r13, (com.google.android.gms.internal.clearcut.zzay) r9)
            r1 = r6 & r8
            if (r1 != 0) goto L_0x0164
        L_0x0161:
            java.lang.Object r1 = r9.zzff
            goto L_0x0192
        L_0x0164:
            java.lang.Object r1 = r10.getObject(r15, r4)
            java.lang.Object r2 = r9.zzff
            java.lang.Object r1 = com.google.android.gms.internal.clearcut.zzci.zza((java.lang.Object) r1, (java.lang.Object) r2)
            goto L_0x0192
        L_0x016f:
            r13 = r32
            goto L_0x01f6
        L_0x0173:
            r14 = r31
            r13 = r32
            r15 = r4
            r3 = 2
            r26 = r11
            r12 = r30
            r11 = r5
            r4 = r26
            if (r0 != r3) goto L_0x01f6
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r19 & r0
            if (r0 != 0) goto L_0x018d
            int r0 = com.google.android.gms.internal.clearcut.zzax.zzc(r12, r2, r9)
            goto L_0x0161
        L_0x018d:
            int r0 = com.google.android.gms.internal.clearcut.zzax.zzd(r12, r2, r9)
            goto L_0x0161
        L_0x0192:
            r10.putObject(r15, r4, r1)
            goto L_0x01cf
        L_0x0196:
            r14 = r31
            r13 = r32
            r15 = r4
            r26 = r11
            r12 = r30
            r11 = r5
            r4 = r26
            if (r0 != 0) goto L_0x01f6
            int r0 = com.google.android.gms.internal.clearcut.zzax.zzb(r12, r2, r9)
            long r1 = r9.zzfe
            r17 = 0
            int r1 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r1 == 0) goto L_0x01b2
            r1 = 1
            goto L_0x01b4
        L_0x01b2:
            r1 = r16
        L_0x01b4:
            com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) r15, (long) r4, (boolean) r1)
            goto L_0x01cf
        L_0x01b8:
            r14 = r31
            r13 = r32
            r15 = r4
            r26 = r11
            r12 = r30
            r11 = r5
            r4 = r26
            if (r0 != r3) goto L_0x01f6
            int r0 = com.google.android.gms.internal.clearcut.zzax.zzc(r12, r2)
            r10.putInt(r15, r4, r0)
            int r0 = r2 + 4
        L_0x01cf:
            r1 = r6 | r8
            r31 = r7
            goto L_0x0275
        L_0x01d5:
            r14 = r31
            r13 = r32
            r15 = r4
            r1 = 1
            r26 = r11
            r12 = r30
            r11 = r5
            r4 = r26
            if (r0 != r1) goto L_0x01f6
            long r17 = com.google.android.gms.internal.clearcut.zzax.zzd(r12, r2)
            r0 = r10
            r1 = r29
            r31 = r7
            r7 = r2
            r2 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            goto L_0x0270
        L_0x01f6:
            r31 = r7
            r7 = r2
            goto L_0x0287
        L_0x01fb:
            r14 = r31
            r13 = r32
            r15 = r4
            r31 = r7
            r7 = r2
            r26 = r11
            r12 = r30
            r11 = r5
            r4 = r26
            if (r0 != 0) goto L_0x0287
            int r0 = com.google.android.gms.internal.clearcut.zzax.zza(r12, r7, r9)
            int r1 = r9.zzfd
            r10.putInt(r15, r4, r1)
            goto L_0x0273
        L_0x0217:
            r14 = r31
            r13 = r32
            r15 = r4
            r31 = r7
            r7 = r2
            r26 = r11
            r12 = r30
            r11 = r5
            r4 = r26
            if (r0 != 0) goto L_0x0287
            int r7 = com.google.android.gms.internal.clearcut.zzax.zzb(r12, r7, r9)
            long r2 = r9.zzfe
            r0 = r10
            r1 = r29
            r17 = r2
            r2 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            r0 = r6 | r8
            goto L_0x0277
        L_0x023c:
            r14 = r31
            r13 = r32
            r15 = r4
            r31 = r7
            r7 = r2
            r26 = r11
            r12 = r30
            r11 = r5
            r4 = r26
            if (r0 != r3) goto L_0x0287
            float r0 = com.google.android.gms.internal.clearcut.zzax.zzf(r12, r7)
            com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) r15, (long) r4, (float) r0)
            int r2 = r7 + 4
            goto L_0x0272
        L_0x0257:
            r14 = r31
            r13 = r32
            r15 = r4
            r31 = r7
            r1 = 1
            r7 = r2
            r26 = r11
            r12 = r30
            r11 = r5
            r4 = r26
            if (r0 != r1) goto L_0x0287
            double r0 = com.google.android.gms.internal.clearcut.zzax.zze(r12, r7)
            com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) r15, (long) r4, (double) r0)
        L_0x0270:
            int r2 = r7 + 8
        L_0x0272:
            r0 = r2
        L_0x0273:
            r1 = r6 | r8
        L_0x0275:
            r7 = r0
            r0 = r1
        L_0x0277:
            r6 = r0
            r0 = r7
        L_0x0279:
            r7 = r31
            r5 = r11
            r1 = r14
            r4 = r15
            r8 = -1
            r15 = r28
            r14 = r29
            r11 = r33
            goto L_0x0019
        L_0x0287:
            r8 = r33
            r2 = r7
            r25 = r10
            r15 = r13
            r9 = r14
            r7 = r31
            goto L_0x03a6
        L_0x0292:
            r8 = r7
            r13 = r14
            r3 = 2
            r14 = r31
            r31 = r1
            r7 = r2
            r2 = r4
            r26 = r11
            r12 = r30
            r11 = r5
            r4 = r26
            r1 = 27
            if (r15 != r1) goto L_0x02f5
            if (r0 != r3) goto L_0x02e8
            java.lang.Object r0 = r10.getObject(r2, r4)
            com.google.android.gms.internal.clearcut.zzcn r0 = (com.google.android.gms.internal.clearcut.zzcn) r0
            boolean r1 = r0.zzu()
            if (r1 != 0) goto L_0x02c6
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02bd
            r1 = 10
            goto L_0x02bf
        L_0x02bd:
            int r1 = r1 << 1
        L_0x02bf:
            com.google.android.gms.internal.clearcut.zzcn r0 = r0.zzi(r1)
            r10.putObject(r2, r4, r0)
        L_0x02c6:
            r5 = r0
            com.google.android.gms.internal.clearcut.zzef r0 = r11.zzad(r13)
            r1 = r14
            r15 = r2
            r2 = r30
            r3 = r7
            r4 = r32
            r18 = r6
            r6 = r34
            int r0 = zza((com.google.android.gms.internal.clearcut.zzef<?>) r0, (int) r1, (byte[]) r2, (int) r3, (int) r4, (com.google.android.gms.internal.clearcut.zzcn<?>) r5, (com.google.android.gms.internal.clearcut.zzay) r6)
            r7 = r8
            r25 = r10
            r5 = r11
            r9 = r14
            r4 = r15
            r6 = r18
            r15 = r32
            r8 = r33
            goto L_0x03be
        L_0x02e8:
            r18 = r6
            r15 = r32
            r21 = r8
            r25 = r10
            r31 = r14
            r14 = r7
            goto L_0x039d
        L_0x02f5:
            r18 = r6
            r1 = 49
            if (r15 > r1) goto L_0x0330
            r11 = r19
            long r2 = (long) r11
            r11 = r0
            r0 = r28
            r6 = r31
            r1 = r29
            r19 = r2
            r2 = r30
            r3 = r7
            r22 = r4
            r4 = r32
            r5 = r14
            r21 = r8
            r8 = r7
            r7 = r11
            r11 = r8
            r8 = r13
            r13 = r10
            r9 = r19
            r24 = r11
            r11 = r15
            r15 = r32
            r25 = r13
            r12 = r22
            r31 = r14
            r14 = r34
            int r0 = r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (com.google.android.gms.internal.clearcut.zzay) r14)
            r14 = r24
            if (r0 != r14) goto L_0x037b
        L_0x032d:
            r2 = r0
            goto L_0x039e
        L_0x0330:
            r6 = r31
            r12 = r32
            r22 = r4
            r21 = r8
            r25 = r10
            r31 = r14
            r11 = r19
            r14 = r7
            r7 = r0
            r0 = 50
            if (r15 != r0) goto L_0x0361
            if (r7 != r3) goto L_0x035f
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r14
            r4 = r32
            r5 = r13
            r7 = r22
            r9 = r34
            int r0 = r0.zza(r1, r2, r3, r4, r5, r6, r7, r9)
            if (r0 != r14) goto L_0x035d
            r2 = r0
            r15 = r12
            goto L_0x039e
        L_0x035d:
            r15 = r12
            goto L_0x037b
        L_0x035f:
            r15 = r12
            goto L_0x039d
        L_0x0361:
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r14
            r4 = r32
            r5 = r31
            r8 = r11
            r9 = r15
            r10 = r22
            r15 = r12
            r12 = r13
            r13 = r34
            int r0 = r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (com.google.android.gms.internal.clearcut.zzay) r13)
            if (r0 != r14) goto L_0x037b
            goto L_0x032d
        L_0x037b:
            r5 = r28
            r4 = r29
            r14 = r4
            r12 = r30
            r1 = r31
            r11 = r33
            r9 = r34
            r13 = r15
            r6 = r18
            r7 = r21
            r10 = r25
            r8 = -1
            r15 = r5
            goto L_0x0019
        L_0x0393:
            r14 = r2
            r31 = r3
            r18 = r6
            r21 = r7
            r25 = r10
            r15 = r13
        L_0x039d:
            r2 = r14
        L_0x039e:
            r9 = r31
            r8 = r33
            r6 = r18
            r7 = r21
        L_0x03a6:
            if (r9 != r8) goto L_0x03af
            if (r8 != 0) goto L_0x03ab
            goto L_0x03af
        L_0x03ab:
            r0 = r7
            r1 = -1
            r7 = r2
            goto L_0x03db
        L_0x03af:
            r0 = r9
            r1 = r30
            r3 = r32
            r4 = r29
            r5 = r34
            int r0 = zza((int) r0, (byte[]) r1, (int) r2, (int) r3, (java.lang.Object) r4, (com.google.android.gms.internal.clearcut.zzay) r5)
            r5 = r28
        L_0x03be:
            r14 = r29
            r12 = r30
            r11 = r8
            r1 = r9
            r13 = r15
            r10 = r25
            r8 = -1
            r15 = r28
            r9 = r34
            goto L_0x0019
        L_0x03ce:
            r18 = r6
            r21 = r7
            r25 = r10
            r8 = r11
            r15 = r13
            r7 = r0
            r9 = r1
            r0 = r21
            r1 = -1
        L_0x03db:
            if (r0 == r1) goto L_0x03e6
            long r0 = (long) r0
            r10 = r29
            r2 = r25
            r2.putInt(r10, r0, r6)
            goto L_0x03e8
        L_0x03e6:
            r10 = r29
        L_0x03e8:
            r11 = r28
            int[] r12 = r11.zzmt
            if (r12 == 0) goto L_0x042a
            int r13 = r12.length
            r0 = 0
            r5 = r0
            r14 = r16
        L_0x03f3:
            if (r14 >= r13) goto L_0x0423
            r1 = r12[r14]
            com.google.android.gms.internal.clearcut.zzex<?, ?> r6 = r11.zzmx
            int[] r0 = r11.zzmi
            r2 = r0[r1]
            int r0 = r11.zzag(r1)
            r0 = r0 & r17
            long r3 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r3)
            if (r0 != 0) goto L_0x040b
            goto L_0x041e
        L_0x040b:
            com.google.android.gms.internal.clearcut.zzck r4 = r11.zzaf(r1)
            if (r4 != 0) goto L_0x0412
            goto L_0x041e
        L_0x0412:
            com.google.android.gms.internal.clearcut.zzdj r3 = r11.zzmz
            java.util.Map r3 = r3.zzg(r0)
            r0 = r28
            java.lang.Object r5 = r0.zza((int) r1, (int) r2, r3, (com.google.android.gms.internal.clearcut.zzck<?>) r4, r5, r6)
        L_0x041e:
            com.google.android.gms.internal.clearcut.zzey r5 = (com.google.android.gms.internal.clearcut.zzey) r5
            int r14 = r14 + 1
            goto L_0x03f3
        L_0x0423:
            if (r5 == 0) goto L_0x042a
            com.google.android.gms.internal.clearcut.zzex<?, ?> r0 = r11.zzmx
            r0.zzf(r10, r5)
        L_0x042a:
            if (r8 != 0) goto L_0x0434
            if (r7 != r15) goto L_0x042f
            goto L_0x0438
        L_0x042f:
            com.google.android.gms.internal.clearcut.zzco r0 = com.google.android.gms.internal.clearcut.zzco.zzbo()
            throw r0
        L_0x0434:
            if (r7 > r15) goto L_0x0439
            if (r9 != r8) goto L_0x0439
        L_0x0438:
            return r7
        L_0x0439:
            com.google.android.gms.internal.clearcut.zzco r0 = com.google.android.gms.internal.clearcut.zzco.zzbo()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.clearcut.zzay):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
        r2 = java.lang.Integer.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006c, code lost:
        r6.zzff = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0079, code lost:
        r6.zzff = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0096, code lost:
        r6.zzff = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r2 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        r2 = java.lang.Long.valueOf(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zza(byte[] r1, int r2, int r3, com.google.android.gms.internal.clearcut.zzfl r4, java.lang.Class<?> r5, com.google.android.gms.internal.clearcut.zzay r6) throws java.io.IOException {
        /*
            int[] r0 = com.google.android.gms.internal.clearcut.zzdt.zzgq
            int r4 = r4.ordinal()
            r4 = r0[r4]
            switch(r4) {
                case 1: goto L_0x0083;
                case 2: goto L_0x007e;
                case 3: goto L_0x0071;
                case 4: goto L_0x0064;
                case 5: goto L_0x0064;
                case 6: goto L_0x005b;
                case 7: goto L_0x005b;
                case 8: goto L_0x0052;
                case 9: goto L_0x0047;
                case 10: goto L_0x0047;
                case 11: goto L_0x0047;
                case 12: goto L_0x003c;
                case 13: goto L_0x003c;
                case 14: goto L_0x002f;
                case 15: goto L_0x0024;
                case 16: goto L_0x0019;
                case 17: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "unsupported field type."
            r1.<init>(r2)
            throw r1
        L_0x0013:
            int r1 = com.google.android.gms.internal.clearcut.zzax.zzd(r1, r2, r6)
            goto L_0x0098
        L_0x0019:
            int r1 = com.google.android.gms.internal.clearcut.zzax.zzb(r1, r2, r6)
            long r2 = r6.zzfe
            long r2 = com.google.android.gms.internal.clearcut.zzbk.zza(r2)
            goto L_0x0042
        L_0x0024:
            int r1 = com.google.android.gms.internal.clearcut.zzax.zza(r1, r2, r6)
            int r2 = r6.zzfd
            int r2 = com.google.android.gms.internal.clearcut.zzbk.zzm(r2)
            goto L_0x004d
        L_0x002f:
            com.google.android.gms.internal.clearcut.zzea r4 = com.google.android.gms.internal.clearcut.zzea.zzcm()
            com.google.android.gms.internal.clearcut.zzef r4 = r4.zze(r5)
            int r1 = zza((com.google.android.gms.internal.clearcut.zzef) r4, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.clearcut.zzay) r6)
            goto L_0x0098
        L_0x003c:
            int r1 = com.google.android.gms.internal.clearcut.zzax.zzb(r1, r2, r6)
            long r2 = r6.zzfe
        L_0x0042:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x0096
        L_0x0047:
            int r1 = com.google.android.gms.internal.clearcut.zzax.zza(r1, r2, r6)
            int r2 = r6.zzfd
        L_0x004d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0096
        L_0x0052:
            float r1 = com.google.android.gms.internal.clearcut.zzax.zzf(r1, r2)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            goto L_0x006c
        L_0x005b:
            long r3 = com.google.android.gms.internal.clearcut.zzax.zzd(r1, r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L_0x0079
        L_0x0064:
            int r1 = com.google.android.gms.internal.clearcut.zzax.zzc(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x006c:
            r6.zzff = r1
            int r1 = r2 + 4
            goto L_0x0098
        L_0x0071:
            double r3 = com.google.android.gms.internal.clearcut.zzax.zze(r1, r2)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
        L_0x0079:
            r6.zzff = r1
            int r1 = r2 + 8
            goto L_0x0098
        L_0x007e:
            int r1 = com.google.android.gms.internal.clearcut.zzax.zze(r1, r2, r6)
            goto L_0x0098
        L_0x0083:
            int r1 = com.google.android.gms.internal.clearcut.zzax.zzb(r1, r2, r6)
            long r2 = r6.zzfe
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0091
            r2 = 1
            goto L_0x0092
        L_0x0091:
            r2 = 0
        L_0x0092:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
        L_0x0096:
            r6.zzff = r2
        L_0x0098:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zza(byte[], int, int, com.google.android.gms.internal.clearcut.zzfl, java.lang.Class, com.google.android.gms.internal.clearcut.zzay):int");
    }

    static <T> zzds<T> zza(Class<T> cls, zzdm zzdm, zzdw zzdw, zzcy zzcy, zzex<?, ?> zzex, zzbu<?> zzbu, zzdj zzdj) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        zzdm zzdm2 = zzdm;
        if (zzdm2 instanceof zzec) {
            zzec zzec = (zzec) zzdm2;
            boolean z = zzec.zzcf() == zzcg.zzg.zzkm;
            if (zzec.getFieldCount() == 0) {
                i3 = 0;
                i2 = 0;
                i = 0;
            } else {
                int zzcp = zzec.zzcp();
                int zzcq = zzec.zzcq();
                i3 = zzec.zzcu();
                i2 = zzcp;
                i = zzcq;
            }
            int[] iArr = new int[(i3 << 2)];
            Object[] objArr = new Object[(i3 << 1)];
            int[] iArr2 = zzec.zzcr() > 0 ? new int[zzec.zzcr()] : null;
            int[] iArr3 = zzec.zzcs() > 0 ? new int[zzec.zzcs()] : null;
            zzed zzco = zzec.zzco();
            if (zzco.next()) {
                int zzcx = zzco.zzcx();
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    if (zzcx >= zzec.zzcv() || i7 >= ((zzcx - i2) << 2)) {
                        if (zzco.zzda()) {
                            i6 = (int) zzfd.zza(zzco.zzdb());
                            i5 = (int) zzfd.zza(zzco.zzdc());
                            i4 = 0;
                        } else {
                            i6 = (int) zzfd.zza(zzco.zzdd());
                            if (zzco.zzde()) {
                                i5 = (int) zzfd.zza(zzco.zzdf());
                                i4 = zzco.zzdg();
                            } else {
                                i5 = 0;
                                i4 = 0;
                            }
                        }
                        iArr[i7] = zzco.zzcx();
                        int i10 = i7 + 1;
                        iArr[i10] = (zzco.zzdi() ? PKIFailureInfo.duplicateCertReq : 0) | (zzco.zzdh() ? 268435456 : 0) | (zzco.zzcy() << 20) | i6;
                        iArr[i7 + 2] = i5 | (i4 << 20);
                        if (zzco.zzdl() != null) {
                            int i11 = (i7 / 4) << 1;
                            objArr[i11] = zzco.zzdl();
                            if (zzco.zzdj() != null) {
                                objArr[i11 + 1] = zzco.zzdj();
                            } else if (zzco.zzdk() != null) {
                                objArr[i11 + 1] = zzco.zzdk();
                            }
                        } else if (zzco.zzdj() != null) {
                            objArr[((i7 / 4) << 1) + 1] = zzco.zzdj();
                        } else if (zzco.zzdk() != null) {
                            objArr[((i7 / 4) << 1) + 1] = zzco.zzdk();
                        }
                        int zzcy2 = zzco.zzcy();
                        if (zzcy2 == zzcb.MAP.ordinal()) {
                            iArr2[i9] = i7;
                            i9++;
                        } else if (zzcy2 >= 18 && zzcy2 <= 49) {
                            iArr3[i8] = iArr[i10] & 1048575;
                            i8++;
                        }
                        if (!zzco.next()) {
                            break;
                        }
                        zzcx = zzco.zzcx();
                    } else {
                        for (int i12 = 0; i12 < 4; i12++) {
                            iArr[i7 + i12] = -1;
                        }
                    }
                    i7 += 4;
                }
            }
            return new zzds(iArr, objArr, i2, i, zzec.zzcv(), zzec.zzch(), z, false, zzec.zzct(), iArr2, iArr3, zzdw, zzcy, zzex, zzbu, zzdj);
        }
        ((zzes) zzdm2).zzcf();
        throw new NoSuchMethodError();
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzck<?> zzck, UB ub, zzex<UT, UB> zzex) {
        zzdh<?, ?> zzl = this.zzmz.zzl(zzae(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (zzck.zzb(((Integer) next.getValue()).intValue()) == null) {
                if (ub == null) {
                    ub = zzex.zzdz();
                }
                zzbg zzk = zzbb.zzk(zzdg.zza(zzl, next.getKey(), next.getValue()));
                try {
                    zzdg.zza(zzk.zzae(), zzl, next.getKey(), next.getValue());
                    zzex.zza(ub, i2, zzk.zzad());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private static void zza(int i, Object obj, zzfr zzfr) throws IOException {
        if (obj instanceof String) {
            zzfr.zza(i, (String) obj);
        } else {
            zzfr.zza(i, (zzbb) obj);
        }
    }

    private static <UT, UB> void zza(zzex<UT, UB> zzex, T t, zzfr zzfr) throws IOException {
        zzex.zza(zzex.zzq(t), zzfr);
    }

    private final <K, V> void zza(zzfr zzfr, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzfr.zza(i, this.zzmz.zzl(zzae(i2)), this.zzmz.zzh(obj));
        }
    }

    private final void zza(T t, T t2, int i) {
        long zzag = (long) (zzag(i) & 1048575);
        if (zza(t2, i)) {
            Object zzo = zzfd.zzo(t, zzag);
            Object zzo2 = zzfd.zzo(t2, zzag);
            if (zzo != null && zzo2 != null) {
                zzfd.zza((Object) t, zzag, zzci.zza(zzo, zzo2));
                zzb(t, i);
            } else if (zzo2 != null) {
                zzfd.zza((Object) t, zzag, zzo2);
                zzb(t, i);
            }
        }
    }

    private final boolean zza(T t, int i) {
        if (this.zzmq) {
            int zzag = zzag(i);
            long j = (long) (zzag & 1048575);
            switch ((zzag & 267386880) >>> 20) {
                case 0:
                    return zzfd.zzn(t, j) != 0.0d;
                case 1:
                    return zzfd.zzm(t, j) != BitmapDescriptorFactory.HUE_RED;
                case 2:
                    return zzfd.zzk(t, j) != 0;
                case 3:
                    return zzfd.zzk(t, j) != 0;
                case 4:
                    return zzfd.zzj(t, j) != 0;
                case 5:
                    return zzfd.zzk(t, j) != 0;
                case 6:
                    return zzfd.zzj(t, j) != 0;
                case 7:
                    return zzfd.zzl(t, j);
                case 8:
                    Object zzo = zzfd.zzo(t, j);
                    if (zzo instanceof String) {
                        return !((String) zzo).isEmpty();
                    }
                    if (zzo instanceof zzbb) {
                        return !zzbb.zzfi.equals(zzo);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return zzfd.zzo(t, j) != null;
                case 10:
                    return !zzbb.zzfi.equals(zzfd.zzo(t, j));
                case 11:
                    return zzfd.zzj(t, j) != 0;
                case 12:
                    return zzfd.zzj(t, j) != 0;
                case 13:
                    return zzfd.zzj(t, j) != 0;
                case 14:
                    return zzfd.zzk(t, j) != 0;
                case 15:
                    return zzfd.zzj(t, j) != 0;
                case 16:
                    return zzfd.zzk(t, j) != 0;
                case 17:
                    return zzfd.zzo(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int zzah = zzah(i);
            return (zzfd.zzj(t, (long) (zzah & 1048575)) & (1 << (zzah >>> 20))) != 0;
        }
    }

    private final boolean zza(T t, int i, int i2) {
        return zzfd.zzj(t, (long) (zzah(i2) & 1048575)) == i;
    }

    private final boolean zza(T t, int i, int i2, int i3) {
        return this.zzmq ? zza(t, i) : (i2 & i3) != 0;
    }

    private static boolean zza(Object obj, int i, zzef zzef) {
        return zzef.zzo(zzfd.zzo(obj, (long) (i & 1048575)));
    }

    private final zzef zzad(int i) {
        int i2 = (i / 4) << 1;
        zzef zzef = (zzef) this.zzmj[i2];
        if (zzef != null) {
            return zzef;
        }
        zzef zze = zzea.zzcm().zze((Class) this.zzmj[i2 + 1]);
        this.zzmj[i2] = zze;
        return zze;
    }

    private final Object zzae(int i) {
        return this.zzmj[(i / 4) << 1];
    }

    private final zzck<?> zzaf(int i) {
        return (zzck) this.zzmj[((i / 4) << 1) + 1];
    }

    private final int zzag(int i) {
        return this.zzmi[i + 1];
    }

    private final int zzah(int i) {
        return this.zzmi[i + 2];
    }

    private final int zzai(int i) {
        int i2 = this.zzmk;
        if (i >= i2) {
            int i3 = this.zzmm;
            if (i < i3) {
                int i4 = (i - i2) << 2;
                if (this.zzmi[i4] == i) {
                    return i4;
                }
                return -1;
            } else if (i <= this.zzml) {
                int i5 = i3 - i2;
                int length = (this.zzmi.length / 4) - 1;
                while (i5 <= length) {
                    int i6 = (length + i5) >>> 1;
                    int i7 = i6 << 2;
                    int i8 = this.zzmi[i7];
                    if (i == i8) {
                        return i7;
                    }
                    if (i < i8) {
                        length = i6 - 1;
                    } else {
                        i5 = i6 + 1;
                    }
                }
            }
        }
        return -1;
    }

    private final void zzb(T t, int i) {
        if (!this.zzmq) {
            int zzah = zzah(i);
            long j = (long) (1048575 & zzah);
            zzfd.zza((Object) t, j, (1 << (zzah >>> 20)) | zzfd.zzj(t, j));
        }
    }

    private final void zzb(T t, int i, int i2) {
        zzfd.zza((Object) t, (long) (zzah(i2) & 1048575), i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:170:0x0494  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzb(T r19, com.google.android.gms.internal.clearcut.zzfr r20) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.zzmo
            if (r3 == 0) goto L_0x0021
            com.google.android.gms.internal.clearcut.zzbu<?> r3 = r0.zzmy
            com.google.android.gms.internal.clearcut.zzby r3 = r3.zza((java.lang.Object) r1)
            boolean r5 = r3.isEmpty()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.iterator()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            r6 = -1
            int[] r7 = r0.zzmi
            int r7 = r7.length
            sun.misc.Unsafe r8 = zzmh
            r10 = 0
            r11 = 0
        L_0x002b:
            if (r10 >= r7) goto L_0x0492
            int r12 = r0.zzag(r10)
            int[] r13 = r0.zzmi
            r14 = r13[r10]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r15 = r15 & r12
            int r15 = r15 >>> 20
            boolean r4 = r0.zzmq
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != 0) goto L_0x005b
            r4 = 17
            if (r15 > r4) goto L_0x005b
            int r4 = r10 + 2
            r4 = r13[r4]
            r13 = r4 & r16
            r17 = r10
            if (r13 == r6) goto L_0x0055
            long r9 = (long) r13
            int r11 = r8.getInt(r1, r9)
            r6 = r13
        L_0x0055:
            int r4 = r4 >>> 20
            r9 = 1
            int r4 = r9 << r4
            goto L_0x005e
        L_0x005b:
            r17 = r10
            r4 = 0
        L_0x005e:
            if (r5 == 0) goto L_0x007c
            com.google.android.gms.internal.clearcut.zzbu<?> r9 = r0.zzmy
            int r9 = r9.zza((java.util.Map.Entry<?, ?>) r5)
            if (r9 > r14) goto L_0x007c
            com.google.android.gms.internal.clearcut.zzbu<?> r9 = r0.zzmy
            r9.zza((com.google.android.gms.internal.clearcut.zzfr) r2, (java.util.Map.Entry<?, ?>) r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007a
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x005e
        L_0x007a:
            r5 = 0
            goto L_0x005e
        L_0x007c:
            r9 = r12 & r16
            long r9 = (long) r9
            r12 = r17
            switch(r15) {
                case 0: goto L_0x0483;
                case 1: goto L_0x0477;
                case 2: goto L_0x046b;
                case 3: goto L_0x045f;
                case 4: goto L_0x0453;
                case 5: goto L_0x0447;
                case 6: goto L_0x043b;
                case 7: goto L_0x042f;
                case 8: goto L_0x0423;
                case 9: goto L_0x0412;
                case 10: goto L_0x0403;
                case 11: goto L_0x03f6;
                case 12: goto L_0x03e9;
                case 13: goto L_0x03dc;
                case 14: goto L_0x03cf;
                case 15: goto L_0x03c2;
                case 16: goto L_0x03b5;
                case 17: goto L_0x03a4;
                case 18: goto L_0x0394;
                case 19: goto L_0x0384;
                case 20: goto L_0x0374;
                case 21: goto L_0x0364;
                case 22: goto L_0x0354;
                case 23: goto L_0x0344;
                case 24: goto L_0x0334;
                case 25: goto L_0x0324;
                case 26: goto L_0x0315;
                case 27: goto L_0x0302;
                case 28: goto L_0x02f3;
                case 29: goto L_0x02e3;
                case 30: goto L_0x02d3;
                case 31: goto L_0x02c3;
                case 32: goto L_0x02b3;
                case 33: goto L_0x02a3;
                case 34: goto L_0x0293;
                case 35: goto L_0x0283;
                case 36: goto L_0x0273;
                case 37: goto L_0x0263;
                case 38: goto L_0x0253;
                case 39: goto L_0x0243;
                case 40: goto L_0x0233;
                case 41: goto L_0x0223;
                case 42: goto L_0x0213;
                case 43: goto L_0x0203;
                case 44: goto L_0x01f3;
                case 45: goto L_0x01e3;
                case 46: goto L_0x01d3;
                case 47: goto L_0x01c3;
                case 48: goto L_0x01b3;
                case 49: goto L_0x01a0;
                case 50: goto L_0x0197;
                case 51: goto L_0x0188;
                case 52: goto L_0x0179;
                case 53: goto L_0x016a;
                case 54: goto L_0x015b;
                case 55: goto L_0x014c;
                case 56: goto L_0x013d;
                case 57: goto L_0x012e;
                case 58: goto L_0x011f;
                case 59: goto L_0x0110;
                case 60: goto L_0x00fd;
                case 61: goto L_0x00ed;
                case 62: goto L_0x00df;
                case 63: goto L_0x00d1;
                case 64: goto L_0x00c3;
                case 65: goto L_0x00b5;
                case 66: goto L_0x00a7;
                case 67: goto L_0x0099;
                case 68: goto L_0x0087;
                default: goto L_0x0084;
            }
        L_0x0084:
            r13 = 0
            goto L_0x048e
        L_0x0087:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.clearcut.zzef r9 = r0.zzad(r12)
            r2.zzb((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.clearcut.zzef) r9)
            goto L_0x0084
        L_0x0099:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            long r9 = zzh(r1, r9)
            r2.zzb((int) r14, (long) r9)
            goto L_0x0084
        L_0x00a7:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            int r4 = zzg(r1, r9)
            r2.zze(r14, r4)
            goto L_0x0084
        L_0x00b5:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            long r9 = zzh(r1, r9)
            r2.zzj(r14, r9)
            goto L_0x0084
        L_0x00c3:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            int r4 = zzg(r1, r9)
            r2.zzm(r14, r4)
            goto L_0x0084
        L_0x00d1:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            int r4 = zzg(r1, r9)
            r2.zzn(r14, r4)
            goto L_0x0084
        L_0x00df:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            int r4 = zzg(r1, r9)
            r2.zzd(r14, r4)
            goto L_0x0084
        L_0x00ed:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.clearcut.zzbb r4 = (com.google.android.gms.internal.clearcut.zzbb) r4
            r2.zza((int) r14, (com.google.android.gms.internal.clearcut.zzbb) r4)
            goto L_0x0084
        L_0x00fd:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.clearcut.zzef r9 = r0.zzad(r12)
            r2.zza((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.clearcut.zzef) r9)
            goto L_0x0084
        L_0x0110:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            java.lang.Object r4 = r8.getObject(r1, r9)
            zza((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.clearcut.zzfr) r2)
            goto L_0x0084
        L_0x011f:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            boolean r4 = zzi(r1, r9)
            r2.zzb((int) r14, (boolean) r4)
            goto L_0x0084
        L_0x012e:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            int r4 = zzg(r1, r9)
            r2.zzf(r14, r4)
            goto L_0x0084
        L_0x013d:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            long r9 = zzh(r1, r9)
            r2.zzc((int) r14, (long) r9)
            goto L_0x0084
        L_0x014c:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            int r4 = zzg(r1, r9)
            r2.zzc((int) r14, (int) r4)
            goto L_0x0084
        L_0x015b:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            long r9 = zzh(r1, r9)
            r2.zza((int) r14, (long) r9)
            goto L_0x0084
        L_0x016a:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            long r9 = zzh(r1, r9)
            r2.zzi(r14, r9)
            goto L_0x0084
        L_0x0179:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            float r4 = zzf(r1, r9)
            r2.zza((int) r14, (float) r4)
            goto L_0x0084
        L_0x0188:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            double r9 = zze(r1, r9)
            r2.zza((int) r14, (double) r9)
            goto L_0x0084
        L_0x0197:
            java.lang.Object r4 = r8.getObject(r1, r9)
            r0.zza((com.google.android.gms.internal.clearcut.zzfr) r2, (int) r14, (java.lang.Object) r4, (int) r12)
            goto L_0x0084
        L_0x01a0:
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzef r10 = r0.zzad(r12)
            com.google.android.gms.internal.clearcut.zzeh.zzb((int) r4, (java.util.List<?>) r9, (com.google.android.gms.internal.clearcut.zzfr) r2, (com.google.android.gms.internal.clearcut.zzef) r10)
            goto L_0x0084
        L_0x01b3:
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 1
            com.google.android.gms.internal.clearcut.zzeh.zze(r4, r9, r2, r13)
            goto L_0x0084
        L_0x01c3:
            r13 = 1
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzj(r4, r9, r2, r13)
            goto L_0x0084
        L_0x01d3:
            r13 = 1
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzg(r4, r9, r2, r13)
            goto L_0x0084
        L_0x01e3:
            r13 = 1
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzl(r4, r9, r2, r13)
            goto L_0x0084
        L_0x01f3:
            r13 = 1
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzm(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0203:
            r13 = 1
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzi(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0213:
            r13 = 1
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzn(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0223:
            r13 = 1
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzk(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0233:
            r13 = 1
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzf(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0243:
            r13 = 1
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzh(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0253:
            r13 = 1
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzd(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0263:
            r13 = 1
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzc(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0273:
            r13 = 1
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzb((int) r4, (java.util.List<java.lang.Float>) r9, (com.google.android.gms.internal.clearcut.zzfr) r2, (boolean) r13)
            goto L_0x0084
        L_0x0283:
            r13 = 1
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zza((int) r4, (java.util.List<java.lang.Double>) r9, (com.google.android.gms.internal.clearcut.zzfr) r2, (boolean) r13)
            goto L_0x0084
        L_0x0293:
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 0
            com.google.android.gms.internal.clearcut.zzeh.zze(r4, r9, r2, r13)
            goto L_0x048e
        L_0x02a3:
            r13 = 0
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzj(r4, r9, r2, r13)
            goto L_0x048e
        L_0x02b3:
            r13 = 0
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzg(r4, r9, r2, r13)
            goto L_0x048e
        L_0x02c3:
            r13 = 0
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzl(r4, r9, r2, r13)
            goto L_0x048e
        L_0x02d3:
            r13 = 0
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzm(r4, r9, r2, r13)
            goto L_0x048e
        L_0x02e3:
            r13 = 0
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzi(r4, r9, r2, r13)
            goto L_0x048e
        L_0x02f3:
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzb(r4, r9, r2)
            goto L_0x0084
        L_0x0302:
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzef r10 = r0.zzad(r12)
            com.google.android.gms.internal.clearcut.zzeh.zza((int) r4, (java.util.List<?>) r9, (com.google.android.gms.internal.clearcut.zzfr) r2, (com.google.android.gms.internal.clearcut.zzef) r10)
            goto L_0x0084
        L_0x0315:
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zza((int) r4, (java.util.List<java.lang.String>) r9, (com.google.android.gms.internal.clearcut.zzfr) r2)
            goto L_0x0084
        L_0x0324:
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 0
            com.google.android.gms.internal.clearcut.zzeh.zzn(r4, r9, r2, r13)
            goto L_0x048e
        L_0x0334:
            r13 = 0
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzk(r4, r9, r2, r13)
            goto L_0x048e
        L_0x0344:
            r13 = 0
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzf(r4, r9, r2, r13)
            goto L_0x048e
        L_0x0354:
            r13 = 0
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzh(r4, r9, r2, r13)
            goto L_0x048e
        L_0x0364:
            r13 = 0
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzd(r4, r9, r2, r13)
            goto L_0x048e
        L_0x0374:
            r13 = 0
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzc(r4, r9, r2, r13)
            goto L_0x048e
        L_0x0384:
            r13 = 0
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzb((int) r4, (java.util.List<java.lang.Float>) r9, (com.google.android.gms.internal.clearcut.zzfr) r2, (boolean) r13)
            goto L_0x048e
        L_0x0394:
            r13 = 0
            int[] r4 = r0.zzmi
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zza((int) r4, (java.util.List<java.lang.Double>) r9, (com.google.android.gms.internal.clearcut.zzfr) r2, (boolean) r13)
            goto L_0x048e
        L_0x03a4:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.clearcut.zzef r9 = r0.zzad(r12)
            r2.zzb((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.clearcut.zzef) r9)
            goto L_0x048e
        L_0x03b5:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            long r9 = r8.getLong(r1, r9)
            r2.zzb((int) r14, (long) r9)
            goto L_0x048e
        L_0x03c2:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            int r4 = r8.getInt(r1, r9)
            r2.zze(r14, r4)
            goto L_0x048e
        L_0x03cf:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            long r9 = r8.getLong(r1, r9)
            r2.zzj(r14, r9)
            goto L_0x048e
        L_0x03dc:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            int r4 = r8.getInt(r1, r9)
            r2.zzm(r14, r4)
            goto L_0x048e
        L_0x03e9:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            int r4 = r8.getInt(r1, r9)
            r2.zzn(r14, r4)
            goto L_0x048e
        L_0x03f6:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            int r4 = r8.getInt(r1, r9)
            r2.zzd(r14, r4)
            goto L_0x048e
        L_0x0403:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.clearcut.zzbb r4 = (com.google.android.gms.internal.clearcut.zzbb) r4
            r2.zza((int) r14, (com.google.android.gms.internal.clearcut.zzbb) r4)
            goto L_0x048e
        L_0x0412:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.clearcut.zzef r9 = r0.zzad(r12)
            r2.zza((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.clearcut.zzef) r9)
            goto L_0x048e
        L_0x0423:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            java.lang.Object r4 = r8.getObject(r1, r9)
            zza((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.clearcut.zzfr) r2)
            goto L_0x048e
        L_0x042f:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            boolean r4 = com.google.android.gms.internal.clearcut.zzfd.zzl(r1, r9)
            r2.zzb((int) r14, (boolean) r4)
            goto L_0x048e
        L_0x043b:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            int r4 = r8.getInt(r1, r9)
            r2.zzf(r14, r4)
            goto L_0x048e
        L_0x0447:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            long r9 = r8.getLong(r1, r9)
            r2.zzc((int) r14, (long) r9)
            goto L_0x048e
        L_0x0453:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            int r4 = r8.getInt(r1, r9)
            r2.zzc((int) r14, (int) r4)
            goto L_0x048e
        L_0x045f:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            long r9 = r8.getLong(r1, r9)
            r2.zza((int) r14, (long) r9)
            goto L_0x048e
        L_0x046b:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            long r9 = r8.getLong(r1, r9)
            r2.zzi(r14, r9)
            goto L_0x048e
        L_0x0477:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            float r4 = com.google.android.gms.internal.clearcut.zzfd.zzm(r1, r9)
            r2.zza((int) r14, (float) r4)
            goto L_0x048e
        L_0x0483:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            double r9 = com.google.android.gms.internal.clearcut.zzfd.zzn(r1, r9)
            r2.zza((int) r14, (double) r9)
        L_0x048e:
            int r10 = r12 + 4
            goto L_0x002b
        L_0x0492:
            if (r5 == 0) goto L_0x04a9
            com.google.android.gms.internal.clearcut.zzbu<?> r4 = r0.zzmy
            r4.zza((com.google.android.gms.internal.clearcut.zzfr) r2, (java.util.Map.Entry<?, ?>) r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04a7
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0492
        L_0x04a7:
            r5 = 0
            goto L_0x0492
        L_0x04a9:
            com.google.android.gms.internal.clearcut.zzex<?, ?> r3 = r0.zzmx
            zza(r3, r1, (com.google.android.gms.internal.clearcut.zzfr) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zzb(java.lang.Object, com.google.android.gms.internal.clearcut.zzfr):void");
    }

    private final void zzb(T t, T t2, int i) {
        int zzag = zzag(i);
        int i2 = this.zzmi[i];
        long j = (long) (zzag & 1048575);
        if (zza(t2, i2, i)) {
            Object zzo = zzfd.zzo(t, j);
            Object zzo2 = zzfd.zzo(t2, j);
            if (zzo != null && zzo2 != null) {
                zzfd.zza((Object) t, j, zzci.zza(zzo, zzo2));
                zzb(t, i2, i);
            } else if (zzo2 != null) {
                zzfd.zza((Object) t, j, zzo2);
                zzb(t, i2, i);
            }
        }
    }

    private final boolean zzc(T t, T t2, int i) {
        return zza(t, i) == zza(t2, i);
    }

    private static <E> List<E> zzd(Object obj, long j) {
        return (List) zzfd.zzo(obj, j);
    }

    private static <T> double zze(T t, long j) {
        return ((Double) zzfd.zzo(t, j)).doubleValue();
    }

    private static <T> float zzf(T t, long j) {
        return ((Float) zzfd.zzo(t, j)).floatValue();
    }

    private static <T> int zzg(T t, long j) {
        return ((Integer) zzfd.zzo(t, j)).intValue();
    }

    private static <T> long zzh(T t, long j) {
        return ((Long) zzfd.zzo(t, j)).longValue();
    }

    private static <T> boolean zzi(T t, long j) {
        return ((Boolean) zzfd.zzo(t, j)).booleanValue();
    }

    private static zzey zzn(Object obj) {
        zzcg zzcg = (zzcg) obj;
        zzey zzey = zzcg.zzjp;
        if (zzey != zzey.zzea()) {
            return zzey;
        }
        zzey zzeb = zzey.zzeb();
        zzcg.zzjp = zzeb;
        return zzeb;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        if (com.google.android.gms.internal.clearcut.zzeh.zzd(com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6), com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6)) != false) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6)) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        if (com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        if (com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6)) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
        if (com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        if (com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        if (com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        if (com.google.android.gms.internal.clearcut.zzeh.zzd(com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6), com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6)) != false) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (com.google.android.gms.internal.clearcut.zzeh.zzd(com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6), com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6)) != false) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        if (com.google.android.gms.internal.clearcut.zzeh.zzd(com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6), com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6)) != false) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0120, code lost:
        if (com.google.android.gms.internal.clearcut.zzfd.zzl(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzl(r11, r6)) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        if (com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0146, code lost:
        if (com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6)) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0157, code lost:
        if (com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x016a, code lost:
        if (com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6)) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017d, code lost:
        if (com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6)) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018e, code lost:
        if (com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a1, code lost:
        if (com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6)) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a3, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.clearcut.zzeh.zzd(com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6), com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6)) != false) goto L_0x01a4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.zzmi
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01ab
            int r4 = r9.zzag(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x0191;
                case 1: goto L_0x0180;
                case 2: goto L_0x016d;
                case 3: goto L_0x015a;
                case 4: goto L_0x0149;
                case 5: goto L_0x0136;
                case 6: goto L_0x0124;
                case 7: goto L_0x0112;
                case 8: goto L_0x00fc;
                case 9: goto L_0x00e6;
                case 10: goto L_0x00d0;
                case 11: goto L_0x00be;
                case 12: goto L_0x00ac;
                case 13: goto L_0x009a;
                case 14: goto L_0x0086;
                case 15: goto L_0x0074;
                case 16: goto L_0x0060;
                case 17: goto L_0x004a;
                case 18: goto L_0x003c;
                case 19: goto L_0x003c;
                case 20: goto L_0x003c;
                case 21: goto L_0x003c;
                case 22: goto L_0x003c;
                case 23: goto L_0x003c;
                case 24: goto L_0x003c;
                case 25: goto L_0x003c;
                case 26: goto L_0x003c;
                case 27: goto L_0x003c;
                case 28: goto L_0x003c;
                case 29: goto L_0x003c;
                case 30: goto L_0x003c;
                case 31: goto L_0x003c;
                case 32: goto L_0x003c;
                case 33: goto L_0x003c;
                case 34: goto L_0x003c;
                case 35: goto L_0x003c;
                case 36: goto L_0x003c;
                case 37: goto L_0x003c;
                case 38: goto L_0x003c;
                case 39: goto L_0x003c;
                case 40: goto L_0x003c;
                case 41: goto L_0x003c;
                case 42: goto L_0x003c;
                case 43: goto L_0x003c;
                case 44: goto L_0x003c;
                case 45: goto L_0x003c;
                case 46: goto L_0x003c;
                case 47: goto L_0x003c;
                case 48: goto L_0x003c;
                case 49: goto L_0x003c;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01a4
        L_0x001c:
            int r4 = r9.zzah(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r4)
            int r4 = com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r4)
            if (r8 != r4) goto L_0x01a3
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6)
            boolean r4 = com.google.android.gms.internal.clearcut.zzeh.zzd((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01a4
            goto L_0x01a3
        L_0x003c:
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6)
            boolean r3 = com.google.android.gms.internal.clearcut.zzeh.zzd((java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x01a4
        L_0x004a:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01a3
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6)
            boolean r4 = com.google.android.gms.internal.clearcut.zzeh.zzd((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01a4
            goto L_0x01a3
        L_0x0060:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01a3
            long r4 = com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6)
            long r6 = com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01a4
            goto L_0x01a3
        L_0x0074:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01a3
            int r4 = com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)
            if (r4 == r5) goto L_0x01a4
            goto L_0x01a3
        L_0x0086:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01a3
            long r4 = com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6)
            long r6 = com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01a4
            goto L_0x01a3
        L_0x009a:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01a3
            int r4 = com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)
            if (r4 == r5) goto L_0x01a4
            goto L_0x01a3
        L_0x00ac:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01a3
            int r4 = com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)
            if (r4 == r5) goto L_0x01a4
            goto L_0x01a3
        L_0x00be:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01a3
            int r4 = com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)
            if (r4 == r5) goto L_0x01a4
            goto L_0x01a3
        L_0x00d0:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01a3
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6)
            boolean r4 = com.google.android.gms.internal.clearcut.zzeh.zzd((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01a4
            goto L_0x01a3
        L_0x00e6:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01a3
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6)
            boolean r4 = com.google.android.gms.internal.clearcut.zzeh.zzd((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01a4
            goto L_0x01a3
        L_0x00fc:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01a3
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6)
            boolean r4 = com.google.android.gms.internal.clearcut.zzeh.zzd((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01a4
            goto L_0x01a3
        L_0x0112:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01a3
            boolean r4 = com.google.android.gms.internal.clearcut.zzfd.zzl(r10, r6)
            boolean r5 = com.google.android.gms.internal.clearcut.zzfd.zzl(r11, r6)
            if (r4 == r5) goto L_0x01a4
            goto L_0x01a3
        L_0x0124:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01a3
            int r4 = com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)
            if (r4 == r5) goto L_0x01a4
            goto L_0x01a3
        L_0x0136:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01a3
            long r4 = com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6)
            long r6 = com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01a4
            goto L_0x01a3
        L_0x0149:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01a3
            int r4 = com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)
            if (r4 == r5) goto L_0x01a4
            goto L_0x01a3
        L_0x015a:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01a3
            long r4 = com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6)
            long r6 = com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01a4
            goto L_0x01a3
        L_0x016d:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01a3
            long r4 = com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6)
            long r6 = com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01a4
            goto L_0x01a3
        L_0x0180:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01a3
            int r4 = com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)
            if (r4 == r5) goto L_0x01a4
            goto L_0x01a3
        L_0x0191:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01a3
            long r4 = com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6)
            long r6 = com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01a4
        L_0x01a3:
            r3 = r1
        L_0x01a4:
            if (r3 != 0) goto L_0x01a7
            return r1
        L_0x01a7:
            int r2 = r2 + 4
            goto L_0x0005
        L_0x01ab:
            com.google.android.gms.internal.clearcut.zzex<?, ?> r0 = r9.zzmx
            java.lang.Object r0 = r0.zzq(r10)
            com.google.android.gms.internal.clearcut.zzex<?, ?> r2 = r9.zzmx
            java.lang.Object r2 = r2.zzq(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01be
            return r1
        L_0x01be:
            boolean r0 = r9.zzmo
            if (r0 == 0) goto L_0x01d3
            com.google.android.gms.internal.clearcut.zzbu<?> r0 = r9.zzmy
            com.google.android.gms.internal.clearcut.zzby r10 = r0.zza((java.lang.Object) r10)
            com.google.android.gms.internal.clearcut.zzbu<?> r0 = r9.zzmy
            com.google.android.gms.internal.clearcut.zzby r11 = r0.zza((java.lang.Object) r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01d3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.equals(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r5);
        r2 = r2 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        r2 = r2 * 53;
        r3 = zzg(r10, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a8, code lost:
        r2 = r2 * 53;
        r3 = zzh(r10, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ce, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d7, code lost:
        r3 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e2, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e6, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ea, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fd, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzci.zzc(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0116, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0121, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0125, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzci.zzl(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0129, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012a, code lost:
        r1 = r1 + 4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode(T r10) {
        /*
            r9 = this;
            int[] r0 = r9.zzmi
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x012e
            int r3 = r9.zzag(r1)
            int[] r4 = r9.zzmi
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 37
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r8
            int r3 = r3 >>> 20
            switch(r3) {
                case 0: goto L_0x011b;
                case 1: goto L_0x0110;
                case 2: goto L_0x0109;
                case 3: goto L_0x0109;
                case 4: goto L_0x0102;
                case 5: goto L_0x0109;
                case 6: goto L_0x0102;
                case 7: goto L_0x00f7;
                case 8: goto L_0x00ea;
                case 9: goto L_0x00dc;
                case 10: goto L_0x00d1;
                case 11: goto L_0x0102;
                case 12: goto L_0x0102;
                case 13: goto L_0x0102;
                case 14: goto L_0x0109;
                case 15: goto L_0x0102;
                case 16: goto L_0x0109;
                case 17: goto L_0x00ca;
                case 18: goto L_0x00d1;
                case 19: goto L_0x00d1;
                case 20: goto L_0x00d1;
                case 21: goto L_0x00d1;
                case 22: goto L_0x00d1;
                case 23: goto L_0x00d1;
                case 24: goto L_0x00d1;
                case 25: goto L_0x00d1;
                case 26: goto L_0x00d1;
                case 27: goto L_0x00d1;
                case 28: goto L_0x00d1;
                case 29: goto L_0x00d1;
                case 30: goto L_0x00d1;
                case 31: goto L_0x00d1;
                case 32: goto L_0x00d1;
                case 33: goto L_0x00d1;
                case 34: goto L_0x00d1;
                case 35: goto L_0x00d1;
                case 36: goto L_0x00d1;
                case 37: goto L_0x00d1;
                case 38: goto L_0x00d1;
                case 39: goto L_0x00d1;
                case 40: goto L_0x00d1;
                case 41: goto L_0x00d1;
                case 42: goto L_0x00d1;
                case 43: goto L_0x00d1;
                case 44: goto L_0x00d1;
                case 45: goto L_0x00d1;
                case 46: goto L_0x00d1;
                case 47: goto L_0x00d1;
                case 48: goto L_0x00d1;
                case 49: goto L_0x00d1;
                case 50: goto L_0x00d1;
                case 51: goto L_0x00bd;
                case 52: goto L_0x00b0;
                case 53: goto L_0x00a2;
                case 54: goto L_0x009b;
                case 55: goto L_0x008d;
                case 56: goto L_0x0086;
                case 57: goto L_0x007f;
                case 58: goto L_0x0071;
                case 59: goto L_0x0069;
                case 60: goto L_0x005b;
                case 61: goto L_0x0053;
                case 62: goto L_0x004c;
                case 63: goto L_0x0045;
                case 64: goto L_0x003e;
                case 65: goto L_0x0036;
                case 66: goto L_0x002f;
                case 67: goto L_0x0027;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x012a
        L_0x0020:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0061
        L_0x0027:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x002f:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0093
        L_0x0036:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x003e:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0093
        L_0x0045:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0093
        L_0x004c:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0093
        L_0x0053:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00d1
        L_0x005b:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
        L_0x0061:
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r5)
            int r2 = r2 * 53
            goto L_0x00d7
        L_0x0069:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00ea
        L_0x0071:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            boolean r3 = zzi(r10, r5)
            goto L_0x00fd
        L_0x007f:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0093
        L_0x0086:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x008d:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
        L_0x0093:
            int r2 = r2 * 53
            int r3 = zzg(r10, r5)
            goto L_0x0129
        L_0x009b:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x00a2:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
        L_0x00a8:
            int r2 = r2 * 53
            long r3 = zzh(r10, r5)
            goto L_0x0125
        L_0x00b0:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            float r3 = zzf(r10, r5)
            goto L_0x0116
        L_0x00bd:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            double r3 = zze(r10, r5)
            goto L_0x0121
        L_0x00ca:
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r5)
            if (r3 == 0) goto L_0x00e6
            goto L_0x00e2
        L_0x00d1:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r5)
        L_0x00d7:
            int r3 = r3.hashCode()
            goto L_0x0129
        L_0x00dc:
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r5)
            if (r3 == 0) goto L_0x00e6
        L_0x00e2:
            int r7 = r3.hashCode()
        L_0x00e6:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x012a
        L_0x00ea:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0129
        L_0x00f7:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.clearcut.zzfd.zzl(r10, r5)
        L_0x00fd:
            int r3 = com.google.android.gms.internal.clearcut.zzci.zzc(r3)
            goto L_0x0129
        L_0x0102:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r5)
            goto L_0x0129
        L_0x0109:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r5)
            goto L_0x0125
        L_0x0110:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.clearcut.zzfd.zzm(r10, r5)
        L_0x0116:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0129
        L_0x011b:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.clearcut.zzfd.zzn(r10, r5)
        L_0x0121:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x0125:
            int r3 = com.google.android.gms.internal.clearcut.zzci.zzl(r3)
        L_0x0129:
            int r2 = r2 + r3
        L_0x012a:
            int r1 = r1 + 4
            goto L_0x0005
        L_0x012e:
            int r2 = r2 * 53
            com.google.android.gms.internal.clearcut.zzex<?, ?> r0 = r9.zzmx
            java.lang.Object r0 = r0.zzq(r10)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r9.zzmo
            if (r0 == 0) goto L_0x014c
            int r2 = r2 * 53
            com.google.android.gms.internal.clearcut.zzbu<?> r0 = r9.zzmy
            com.google.android.gms.internal.clearcut.zzby r10 = r0.zza((java.lang.Object) r10)
            int r10 = r10.hashCode()
            int r2 = r2 + r10
        L_0x014c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.hashCode(java.lang.Object):int");
    }

    public final T newInstance() {
        return this.zzmv.newInstance(this.zzmn);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: java.util.Map$Entry} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0385, code lost:
        r15.zzb(r9, com.google.android.gms.internal.clearcut.zzfd.zzo(r14, (long) (r8 & 1048575)), zzad(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x03a0, code lost:
        r15.zzb(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03b1, code lost:
        r15.zze(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03c2, code lost:
        r15.zzj(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03d3, code lost:
        r15.zzm(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03e4, code lost:
        r15.zzn(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03f5, code lost:
        r15.zzd(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0400, code lost:
        r15.zza(r9, (com.google.android.gms.internal.clearcut.zzbb) com.google.android.gms.internal.clearcut.zzfd.zzo(r14, (long) (r8 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0413, code lost:
        r15.zza(r9, com.google.android.gms.internal.clearcut.zzfd.zzo(r14, (long) (r8 & 1048575)), zzad(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0428, code lost:
        zza(r9, com.google.android.gms.internal.clearcut.zzfd.zzo(r14, (long) (r8 & 1048575)), r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x043f, code lost:
        r15.zzb(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0450, code lost:
        r15.zzf(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0460, code lost:
        r15.zzc(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0470, code lost:
        r15.zzc(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0480, code lost:
        r15.zza(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0490, code lost:
        r15.zzi(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04a0, code lost:
        r15.zza(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04b0, code lost:
        r15.zza(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0842, code lost:
        r15.zzb(r10, com.google.android.gms.internal.clearcut.zzfd.zzo(r14, (long) (r9 & 1048575)), zzad(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x085d, code lost:
        r15.zzb(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x086e, code lost:
        r15.zze(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x087f, code lost:
        r15.zzj(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0890, code lost:
        r15.zzm(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x08a1, code lost:
        r15.zzn(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x08b2, code lost:
        r15.zzd(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x08bd, code lost:
        r15.zza(r10, (com.google.android.gms.internal.clearcut.zzbb) com.google.android.gms.internal.clearcut.zzfd.zzo(r14, (long) (r9 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x08d0, code lost:
        r15.zza(r10, com.google.android.gms.internal.clearcut.zzfd.zzo(r14, (long) (r9 & 1048575)), zzad(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x08e5, code lost:
        zza(r10, com.google.android.gms.internal.clearcut.zzfd.zzo(r14, (long) (r9 & 1048575)), r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x08fc, code lost:
        r15.zzb(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x090d, code lost:
        r15.zzf(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x091d, code lost:
        r15.zzc(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x092d, code lost:
        r15.zzc(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x093d, code lost:
        r15.zza(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x094d, code lost:
        r15.zzi(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x095d, code lost:
        r15.zza(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x096d, code lost:
        r15.zza(r10, r11);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x04b9  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x04f6  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0976  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r14, com.google.android.gms.internal.clearcut.zzfr r15) throws java.io.IOException {
        /*
            r13 = this;
            int r0 = r15.zzaj()
            int r1 = com.google.android.gms.internal.clearcut.zzcg.zzg.zzkp
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x04cf
            com.google.android.gms.internal.clearcut.zzex<?, ?> r0 = r13.zzmx
            zza(r0, r14, (com.google.android.gms.internal.clearcut.zzfr) r15)
            boolean r0 = r13.zzmo
            if (r0 == 0) goto L_0x0030
            com.google.android.gms.internal.clearcut.zzbu<?> r0 = r13.zzmy
            com.google.android.gms.internal.clearcut.zzby r0 = r0.zza((java.lang.Object) r14)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0030
            java.util.Iterator r0 = r0.descendingIterator()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0032
        L_0x0030:
            r0 = r3
            r1 = r0
        L_0x0032:
            int[] r7 = r13.zzmi
            int r7 = r7.length
            int r7 = r7 + -4
        L_0x0037:
            if (r7 < 0) goto L_0x04b7
            int r8 = r13.zzag(r7)
            int[] r9 = r13.zzmi
            r9 = r9[r7]
        L_0x0041:
            if (r1 == 0) goto L_0x005f
            com.google.android.gms.internal.clearcut.zzbu<?> r10 = r13.zzmy
            int r10 = r10.zza((java.util.Map.Entry<?, ?>) r1)
            if (r10 <= r9) goto L_0x005f
            com.google.android.gms.internal.clearcut.zzbu<?> r10 = r13.zzmy
            r10.zza((com.google.android.gms.internal.clearcut.zzfr) r15, (java.util.Map.Entry<?, ?>) r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0041
        L_0x005d:
            r1 = r3
            goto L_0x0041
        L_0x005f:
            r10 = r8 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x04a4;
                case 1: goto L_0x0494;
                case 2: goto L_0x0484;
                case 3: goto L_0x0474;
                case 4: goto L_0x0464;
                case 5: goto L_0x0454;
                case 6: goto L_0x0444;
                case 7: goto L_0x0433;
                case 8: goto L_0x0422;
                case 9: goto L_0x040d;
                case 10: goto L_0x03fa;
                case 11: goto L_0x03e9;
                case 12: goto L_0x03d8;
                case 13: goto L_0x03c7;
                case 14: goto L_0x03b6;
                case 15: goto L_0x03a5;
                case 16: goto L_0x0394;
                case 17: goto L_0x037f;
                case 18: goto L_0x036e;
                case 19: goto L_0x035d;
                case 20: goto L_0x034c;
                case 21: goto L_0x033b;
                case 22: goto L_0x032a;
                case 23: goto L_0x0319;
                case 24: goto L_0x0308;
                case 25: goto L_0x02f7;
                case 26: goto L_0x02e6;
                case 27: goto L_0x02d1;
                case 28: goto L_0x02c0;
                case 29: goto L_0x02af;
                case 30: goto L_0x029e;
                case 31: goto L_0x028d;
                case 32: goto L_0x027c;
                case 33: goto L_0x026b;
                case 34: goto L_0x025a;
                case 35: goto L_0x0249;
                case 36: goto L_0x0238;
                case 37: goto L_0x0227;
                case 38: goto L_0x0216;
                case 39: goto L_0x0205;
                case 40: goto L_0x01f4;
                case 41: goto L_0x01e3;
                case 42: goto L_0x01d2;
                case 43: goto L_0x01c1;
                case 44: goto L_0x01b0;
                case 45: goto L_0x019f;
                case 46: goto L_0x018e;
                case 47: goto L_0x017d;
                case 48: goto L_0x016c;
                case 49: goto L_0x0157;
                case 50: goto L_0x014c;
                case 51: goto L_0x013e;
                case 52: goto L_0x0130;
                case 53: goto L_0x0122;
                case 54: goto L_0x0114;
                case 55: goto L_0x0106;
                case 56: goto L_0x00f8;
                case 57: goto L_0x00ea;
                case 58: goto L_0x00dc;
                case 59: goto L_0x00d4;
                case 60: goto L_0x00cc;
                case 61: goto L_0x00c4;
                case 62: goto L_0x00b6;
                case 63: goto L_0x00a8;
                case 64: goto L_0x009a;
                case 65: goto L_0x008c;
                case 66: goto L_0x007e;
                case 67: goto L_0x0070;
                case 68: goto L_0x0068;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x04b3
        L_0x0068:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x04b3
            goto L_0x0385
        L_0x0070:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zzh(r14, r10)
            goto L_0x03a0
        L_0x007e:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzg(r14, r10)
            goto L_0x03b1
        L_0x008c:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zzh(r14, r10)
            goto L_0x03c2
        L_0x009a:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzg(r14, r10)
            goto L_0x03d3
        L_0x00a8:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzg(r14, r10)
            goto L_0x03e4
        L_0x00b6:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzg(r14, r10)
            goto L_0x03f5
        L_0x00c4:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x04b3
            goto L_0x0400
        L_0x00cc:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x04b3
            goto L_0x0413
        L_0x00d4:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x04b3
            goto L_0x0428
        L_0x00dc:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = zzi(r14, r10)
            goto L_0x043f
        L_0x00ea:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzg(r14, r10)
            goto L_0x0450
        L_0x00f8:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zzh(r14, r10)
            goto L_0x0460
        L_0x0106:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzg(r14, r10)
            goto L_0x0470
        L_0x0114:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zzh(r14, r10)
            goto L_0x0480
        L_0x0122:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zzh(r14, r10)
            goto L_0x0490
        L_0x0130:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = zzf(r14, r10)
            goto L_0x04a0
        L_0x013e:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = zze(r14, r10)
            goto L_0x04b0
        L_0x014c:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            r13.zza((com.google.android.gms.internal.clearcut.zzfr) r15, (int) r9, (java.lang.Object) r8, (int) r7)
            goto L_0x04b3
        L_0x0157:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzef r10 = r13.zzad(r7)
            com.google.android.gms.internal.clearcut.zzeh.zzb((int) r9, (java.util.List<?>) r8, (com.google.android.gms.internal.clearcut.zzfr) r15, (com.google.android.gms.internal.clearcut.zzef) r10)
            goto L_0x04b3
        L_0x016c:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzeh.zze(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x017d:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzeh.zzj(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x018e:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzeh.zzg(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x019f:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzeh.zzl(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x01b0:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzeh.zzm(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x01c1:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzeh.zzi(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x01d2:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzeh.zzn(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x01e3:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzeh.zzk(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x01f4:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzeh.zzf(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x0205:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzeh.zzh(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x0216:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzeh.zzd(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x0227:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzeh.zzc(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x0238:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzeh.zzb((int) r9, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.clearcut.zzfr) r15, (boolean) r4)
            goto L_0x04b3
        L_0x0249:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzeh.zza((int) r9, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.clearcut.zzfr) r15, (boolean) r4)
            goto L_0x04b3
        L_0x025a:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzeh.zze(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x026b:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzeh.zzj(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x027c:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzeh.zzg(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x028d:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzeh.zzl(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x029e:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzeh.zzm(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x02af:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzeh.zzi(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x02c0:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzeh.zzb(r9, r8, r15)
            goto L_0x04b3
        L_0x02d1:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzef r10 = r13.zzad(r7)
            com.google.android.gms.internal.clearcut.zzeh.zza((int) r9, (java.util.List<?>) r8, (com.google.android.gms.internal.clearcut.zzfr) r15, (com.google.android.gms.internal.clearcut.zzef) r10)
            goto L_0x04b3
        L_0x02e6:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzeh.zza((int) r9, (java.util.List<java.lang.String>) r8, (com.google.android.gms.internal.clearcut.zzfr) r15)
            goto L_0x04b3
        L_0x02f7:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzeh.zzn(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x0308:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzeh.zzk(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x0319:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzeh.zzf(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x032a:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzeh.zzh(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x033b:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzeh.zzd(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x034c:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzeh.zzc(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x035d:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzeh.zzb((int) r9, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.clearcut.zzfr) r15, (boolean) r5)
            goto L_0x04b3
        L_0x036e:
            int[] r9 = r13.zzmi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.zzeh.zza((int) r9, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.clearcut.zzfr) r15, (boolean) r5)
            goto L_0x04b3
        L_0x037f:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x04b3
        L_0x0385:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            com.google.android.gms.internal.clearcut.zzef r10 = r13.zzad(r7)
            r15.zzb((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.clearcut.zzef) r10)
            goto L_0x04b3
        L_0x0394:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.clearcut.zzfd.zzk(r14, r10)
        L_0x03a0:
            r15.zzb((int) r9, (long) r10)
            goto L_0x04b3
        L_0x03a5:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.clearcut.zzfd.zzj(r14, r10)
        L_0x03b1:
            r15.zze(r9, r8)
            goto L_0x04b3
        L_0x03b6:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.clearcut.zzfd.zzk(r14, r10)
        L_0x03c2:
            r15.zzj(r9, r10)
            goto L_0x04b3
        L_0x03c7:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.clearcut.zzfd.zzj(r14, r10)
        L_0x03d3:
            r15.zzm(r9, r8)
            goto L_0x04b3
        L_0x03d8:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.clearcut.zzfd.zzj(r14, r10)
        L_0x03e4:
            r15.zzn(r9, r8)
            goto L_0x04b3
        L_0x03e9:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.clearcut.zzfd.zzj(r14, r10)
        L_0x03f5:
            r15.zzd(r9, r8)
            goto L_0x04b3
        L_0x03fa:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x04b3
        L_0x0400:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            com.google.android.gms.internal.clearcut.zzbb r8 = (com.google.android.gms.internal.clearcut.zzbb) r8
            r15.zza((int) r9, (com.google.android.gms.internal.clearcut.zzbb) r8)
            goto L_0x04b3
        L_0x040d:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x04b3
        L_0x0413:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            com.google.android.gms.internal.clearcut.zzef r10 = r13.zzad(r7)
            r15.zza((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.clearcut.zzef) r10)
            goto L_0x04b3
        L_0x0422:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x04b3
        L_0x0428:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r10)
            zza((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.clearcut.zzfr) r15)
            goto L_0x04b3
        L_0x0433:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = com.google.android.gms.internal.clearcut.zzfd.zzl(r14, r10)
        L_0x043f:
            r15.zzb((int) r9, (boolean) r8)
            goto L_0x04b3
        L_0x0444:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.clearcut.zzfd.zzj(r14, r10)
        L_0x0450:
            r15.zzf(r9, r8)
            goto L_0x04b3
        L_0x0454:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.clearcut.zzfd.zzk(r14, r10)
        L_0x0460:
            r15.zzc((int) r9, (long) r10)
            goto L_0x04b3
        L_0x0464:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.clearcut.zzfd.zzj(r14, r10)
        L_0x0470:
            r15.zzc((int) r9, (int) r8)
            goto L_0x04b3
        L_0x0474:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.clearcut.zzfd.zzk(r14, r10)
        L_0x0480:
            r15.zza((int) r9, (long) r10)
            goto L_0x04b3
        L_0x0484:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.clearcut.zzfd.zzk(r14, r10)
        L_0x0490:
            r15.zzi(r9, r10)
            goto L_0x04b3
        L_0x0494:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = com.google.android.gms.internal.clearcut.zzfd.zzm(r14, r10)
        L_0x04a0:
            r15.zza((int) r9, (float) r8)
            goto L_0x04b3
        L_0x04a4:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = com.google.android.gms.internal.clearcut.zzfd.zzn(r14, r10)
        L_0x04b0:
            r15.zza((int) r9, (double) r10)
        L_0x04b3:
            int r7 = r7 + -4
            goto L_0x0037
        L_0x04b7:
            if (r1 == 0) goto L_0x04ce
            com.google.android.gms.internal.clearcut.zzbu<?> r14 = r13.zzmy
            r14.zza((com.google.android.gms.internal.clearcut.zzfr) r15, (java.util.Map.Entry<?, ?>) r1)
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x04cc
            java.lang.Object r14 = r0.next()
            r1 = r14
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x04b7
        L_0x04cc:
            r1 = r3
            goto L_0x04b7
        L_0x04ce:
            return
        L_0x04cf:
            boolean r0 = r13.zzmq
            if (r0 == 0) goto L_0x0990
            boolean r0 = r13.zzmo
            if (r0 == 0) goto L_0x04ee
            com.google.android.gms.internal.clearcut.zzbu<?> r0 = r13.zzmy
            com.google.android.gms.internal.clearcut.zzby r0 = r0.zza((java.lang.Object) r14)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x04ee
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x04f0
        L_0x04ee:
            r0 = r3
            r1 = r0
        L_0x04f0:
            int[] r7 = r13.zzmi
            int r7 = r7.length
            r8 = r5
        L_0x04f4:
            if (r8 >= r7) goto L_0x0974
            int r9 = r13.zzag(r8)
            int[] r10 = r13.zzmi
            r10 = r10[r8]
        L_0x04fe:
            if (r1 == 0) goto L_0x051c
            com.google.android.gms.internal.clearcut.zzbu<?> r11 = r13.zzmy
            int r11 = r11.zza((java.util.Map.Entry<?, ?>) r1)
            if (r11 > r10) goto L_0x051c
            com.google.android.gms.internal.clearcut.zzbu<?> r11 = r13.zzmy
            r11.zza((com.google.android.gms.internal.clearcut.zzfr) r15, (java.util.Map.Entry<?, ?>) r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x051a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x04fe
        L_0x051a:
            r1 = r3
            goto L_0x04fe
        L_0x051c:
            r11 = r9 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0961;
                case 1: goto L_0x0951;
                case 2: goto L_0x0941;
                case 3: goto L_0x0931;
                case 4: goto L_0x0921;
                case 5: goto L_0x0911;
                case 6: goto L_0x0901;
                case 7: goto L_0x08f0;
                case 8: goto L_0x08df;
                case 9: goto L_0x08ca;
                case 10: goto L_0x08b7;
                case 11: goto L_0x08a6;
                case 12: goto L_0x0895;
                case 13: goto L_0x0884;
                case 14: goto L_0x0873;
                case 15: goto L_0x0862;
                case 16: goto L_0x0851;
                case 17: goto L_0x083c;
                case 18: goto L_0x082b;
                case 19: goto L_0x081a;
                case 20: goto L_0x0809;
                case 21: goto L_0x07f8;
                case 22: goto L_0x07e7;
                case 23: goto L_0x07d6;
                case 24: goto L_0x07c5;
                case 25: goto L_0x07b4;
                case 26: goto L_0x07a3;
                case 27: goto L_0x078e;
                case 28: goto L_0x077d;
                case 29: goto L_0x076c;
                case 30: goto L_0x075b;
                case 31: goto L_0x074a;
                case 32: goto L_0x0739;
                case 33: goto L_0x0728;
                case 34: goto L_0x0717;
                case 35: goto L_0x0706;
                case 36: goto L_0x06f5;
                case 37: goto L_0x06e4;
                case 38: goto L_0x06d3;
                case 39: goto L_0x06c2;
                case 40: goto L_0x06b1;
                case 41: goto L_0x06a0;
                case 42: goto L_0x068f;
                case 43: goto L_0x067e;
                case 44: goto L_0x066d;
                case 45: goto L_0x065c;
                case 46: goto L_0x064b;
                case 47: goto L_0x063a;
                case 48: goto L_0x0629;
                case 49: goto L_0x0614;
                case 50: goto L_0x0609;
                case 51: goto L_0x05fb;
                case 52: goto L_0x05ed;
                case 53: goto L_0x05df;
                case 54: goto L_0x05d1;
                case 55: goto L_0x05c3;
                case 56: goto L_0x05b5;
                case 57: goto L_0x05a7;
                case 58: goto L_0x0599;
                case 59: goto L_0x0591;
                case 60: goto L_0x0589;
                case 61: goto L_0x0581;
                case 62: goto L_0x0573;
                case 63: goto L_0x0565;
                case 64: goto L_0x0557;
                case 65: goto L_0x0549;
                case 66: goto L_0x053b;
                case 67: goto L_0x052d;
                case 68: goto L_0x0525;
                default: goto L_0x0523;
            }
        L_0x0523:
            goto L_0x0970
        L_0x0525:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0970
            goto L_0x0842
        L_0x052d:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zzh(r14, r11)
            goto L_0x085d
        L_0x053b:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzg(r14, r11)
            goto L_0x086e
        L_0x0549:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zzh(r14, r11)
            goto L_0x087f
        L_0x0557:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzg(r14, r11)
            goto L_0x0890
        L_0x0565:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzg(r14, r11)
            goto L_0x08a1
        L_0x0573:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzg(r14, r11)
            goto L_0x08b2
        L_0x0581:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0970
            goto L_0x08bd
        L_0x0589:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0970
            goto L_0x08d0
        L_0x0591:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0970
            goto L_0x08e5
        L_0x0599:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = zzi(r14, r11)
            goto L_0x08fc
        L_0x05a7:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzg(r14, r11)
            goto L_0x090d
        L_0x05b5:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zzh(r14, r11)
            goto L_0x091d
        L_0x05c3:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzg(r14, r11)
            goto L_0x092d
        L_0x05d1:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zzh(r14, r11)
            goto L_0x093d
        L_0x05df:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zzh(r14, r11)
            goto L_0x094d
        L_0x05ed:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = zzf(r14, r11)
            goto L_0x095d
        L_0x05fb:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = zze(r14, r11)
            goto L_0x096d
        L_0x0609:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            r13.zza((com.google.android.gms.internal.clearcut.zzfr) r15, (int) r10, (java.lang.Object) r9, (int) r8)
            goto L_0x0970
        L_0x0614:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzef r11 = r13.zzad(r8)
            com.google.android.gms.internal.clearcut.zzeh.zzb((int) r10, (java.util.List<?>) r9, (com.google.android.gms.internal.clearcut.zzfr) r15, (com.google.android.gms.internal.clearcut.zzef) r11)
            goto L_0x0970
        L_0x0629:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zze(r10, r9, r15, r4)
            goto L_0x0970
        L_0x063a:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzj(r10, r9, r15, r4)
            goto L_0x0970
        L_0x064b:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzg(r10, r9, r15, r4)
            goto L_0x0970
        L_0x065c:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzl(r10, r9, r15, r4)
            goto L_0x0970
        L_0x066d:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzm(r10, r9, r15, r4)
            goto L_0x0970
        L_0x067e:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzi(r10, r9, r15, r4)
            goto L_0x0970
        L_0x068f:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzn(r10, r9, r15, r4)
            goto L_0x0970
        L_0x06a0:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzk(r10, r9, r15, r4)
            goto L_0x0970
        L_0x06b1:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzf(r10, r9, r15, r4)
            goto L_0x0970
        L_0x06c2:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzh(r10, r9, r15, r4)
            goto L_0x0970
        L_0x06d3:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzd(r10, r9, r15, r4)
            goto L_0x0970
        L_0x06e4:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzc(r10, r9, r15, r4)
            goto L_0x0970
        L_0x06f5:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzb((int) r10, (java.util.List<java.lang.Float>) r9, (com.google.android.gms.internal.clearcut.zzfr) r15, (boolean) r4)
            goto L_0x0970
        L_0x0706:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zza((int) r10, (java.util.List<java.lang.Double>) r9, (com.google.android.gms.internal.clearcut.zzfr) r15, (boolean) r4)
            goto L_0x0970
        L_0x0717:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zze(r10, r9, r15, r5)
            goto L_0x0970
        L_0x0728:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzj(r10, r9, r15, r5)
            goto L_0x0970
        L_0x0739:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzg(r10, r9, r15, r5)
            goto L_0x0970
        L_0x074a:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzl(r10, r9, r15, r5)
            goto L_0x0970
        L_0x075b:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzm(r10, r9, r15, r5)
            goto L_0x0970
        L_0x076c:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzi(r10, r9, r15, r5)
            goto L_0x0970
        L_0x077d:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzb(r10, r9, r15)
            goto L_0x0970
        L_0x078e:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzef r11 = r13.zzad(r8)
            com.google.android.gms.internal.clearcut.zzeh.zza((int) r10, (java.util.List<?>) r9, (com.google.android.gms.internal.clearcut.zzfr) r15, (com.google.android.gms.internal.clearcut.zzef) r11)
            goto L_0x0970
        L_0x07a3:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zza((int) r10, (java.util.List<java.lang.String>) r9, (com.google.android.gms.internal.clearcut.zzfr) r15)
            goto L_0x0970
        L_0x07b4:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzn(r10, r9, r15, r5)
            goto L_0x0970
        L_0x07c5:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzk(r10, r9, r15, r5)
            goto L_0x0970
        L_0x07d6:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzf(r10, r9, r15, r5)
            goto L_0x0970
        L_0x07e7:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzh(r10, r9, r15, r5)
            goto L_0x0970
        L_0x07f8:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzd(r10, r9, r15, r5)
            goto L_0x0970
        L_0x0809:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzc(r10, r9, r15, r5)
            goto L_0x0970
        L_0x081a:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zzb((int) r10, (java.util.List<java.lang.Float>) r9, (com.google.android.gms.internal.clearcut.zzfr) r15, (boolean) r5)
            goto L_0x0970
        L_0x082b:
            int[] r10 = r13.zzmi
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.zzeh.zza((int) r10, (java.util.List<java.lang.Double>) r9, (com.google.android.gms.internal.clearcut.zzfr) r15, (boolean) r5)
            goto L_0x0970
        L_0x083c:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0970
        L_0x0842:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            com.google.android.gms.internal.clearcut.zzef r11 = r13.zzad(r8)
            r15.zzb((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.clearcut.zzef) r11)
            goto L_0x0970
        L_0x0851:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.clearcut.zzfd.zzk(r14, r11)
        L_0x085d:
            r15.zzb((int) r10, (long) r11)
            goto L_0x0970
        L_0x0862:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.clearcut.zzfd.zzj(r14, r11)
        L_0x086e:
            r15.zze(r10, r9)
            goto L_0x0970
        L_0x0873:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.clearcut.zzfd.zzk(r14, r11)
        L_0x087f:
            r15.zzj(r10, r11)
            goto L_0x0970
        L_0x0884:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.clearcut.zzfd.zzj(r14, r11)
        L_0x0890:
            r15.zzm(r10, r9)
            goto L_0x0970
        L_0x0895:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.clearcut.zzfd.zzj(r14, r11)
        L_0x08a1:
            r15.zzn(r10, r9)
            goto L_0x0970
        L_0x08a6:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.clearcut.zzfd.zzj(r14, r11)
        L_0x08b2:
            r15.zzd(r10, r9)
            goto L_0x0970
        L_0x08b7:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0970
        L_0x08bd:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            com.google.android.gms.internal.clearcut.zzbb r9 = (com.google.android.gms.internal.clearcut.zzbb) r9
            r15.zza((int) r10, (com.google.android.gms.internal.clearcut.zzbb) r9)
            goto L_0x0970
        L_0x08ca:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0970
        L_0x08d0:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            com.google.android.gms.internal.clearcut.zzef r11 = r13.zzad(r8)
            r15.zza((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.clearcut.zzef) r11)
            goto L_0x0970
        L_0x08df:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0970
        L_0x08e5:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.zzfd.zzo(r14, r11)
            zza((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.clearcut.zzfr) r15)
            goto L_0x0970
        L_0x08f0:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = com.google.android.gms.internal.clearcut.zzfd.zzl(r14, r11)
        L_0x08fc:
            r15.zzb((int) r10, (boolean) r9)
            goto L_0x0970
        L_0x0901:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.clearcut.zzfd.zzj(r14, r11)
        L_0x090d:
            r15.zzf(r10, r9)
            goto L_0x0970
        L_0x0911:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.clearcut.zzfd.zzk(r14, r11)
        L_0x091d:
            r15.zzc((int) r10, (long) r11)
            goto L_0x0970
        L_0x0921:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.clearcut.zzfd.zzj(r14, r11)
        L_0x092d:
            r15.zzc((int) r10, (int) r9)
            goto L_0x0970
        L_0x0931:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.clearcut.zzfd.zzk(r14, r11)
        L_0x093d:
            r15.zza((int) r10, (long) r11)
            goto L_0x0970
        L_0x0941:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.clearcut.zzfd.zzk(r14, r11)
        L_0x094d:
            r15.zzi(r10, r11)
            goto L_0x0970
        L_0x0951:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = com.google.android.gms.internal.clearcut.zzfd.zzm(r14, r11)
        L_0x095d:
            r15.zza((int) r10, (float) r9)
            goto L_0x0970
        L_0x0961:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = com.google.android.gms.internal.clearcut.zzfd.zzn(r14, r11)
        L_0x096d:
            r15.zza((int) r10, (double) r11)
        L_0x0970:
            int r8 = r8 + 4
            goto L_0x04f4
        L_0x0974:
            if (r1 == 0) goto L_0x098a
            com.google.android.gms.internal.clearcut.zzbu<?> r2 = r13.zzmy
            r2.zza((com.google.android.gms.internal.clearcut.zzfr) r15, (java.util.Map.Entry<?, ?>) r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0988
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0974
        L_0x0988:
            r1 = r3
            goto L_0x0974
        L_0x098a:
            com.google.android.gms.internal.clearcut.zzex<?, ?> r0 = r13.zzmx
            zza(r0, r14, (com.google.android.gms.internal.clearcut.zzfr) r15)
            return
        L_0x0990:
            r13.zzb(r14, (com.google.android.gms.internal.clearcut.zzfr) r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zza(java.lang.Object, com.google.android.gms.internal.clearcut.zzfr):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        if (r7 == 0) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
        r1 = r11.zzff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009e, code lost:
        r9.putObject(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cf, code lost:
        if (r7 == 0) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d1, code lost:
        r0 = com.google.android.gms.internal.clearcut.zzax.zza(r12, r10, r11);
        r1 = r11.zzfd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d7, code lost:
        r9.putInt(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e4, code lost:
        r9.putLong(r23, r2, r4);
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f7, code lost:
        r0 = r10 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0104, code lost:
        r0 = r10 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0166, code lost:
        if (r0 == r15) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x018a, code lost:
        if (r0 == r15) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a3, code lost:
        if (r0 == r15) goto L_0x01a5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r23, byte[] r24, int r25, int r26, com.google.android.gms.internal.clearcut.zzay r27) throws java.io.IOException {
        /*
            r22 = this;
            r15 = r22
            r14 = r23
            r12 = r24
            r13 = r26
            r11 = r27
            boolean r0 = r15.zzmq
            if (r0 == 0) goto L_0x01d0
            sun.misc.Unsafe r9 = zzmh
            r0 = r25
        L_0x0012:
            if (r0 >= r13) goto L_0x01c7
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0024
            int r0 = com.google.android.gms.internal.clearcut.zzax.zza((int) r0, (byte[]) r12, (int) r1, (com.google.android.gms.internal.clearcut.zzay) r11)
            int r1 = r11.zzfd
            r10 = r0
            r16 = r1
            goto L_0x0027
        L_0x0024:
            r16 = r0
            r10 = r1
        L_0x0027:
            int r6 = r16 >>> 3
            r7 = r16 & 7
            int r8 = r15.zzai(r6)
            if (r8 < 0) goto L_0x01a7
            int[] r0 = r15.zzmi
            int r1 = r8 + 1
            r5 = r0[r1]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r5
            int r4 = r0 >>> 20
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r2 = (long) r0
            r0 = 17
            r1 = 2
            if (r4 > r0) goto L_0x0108
            r0 = 5
            r6 = 1
            switch(r4) {
                case 0: goto L_0x00fb;
                case 1: goto L_0x00ee;
                case 2: goto L_0x00dc;
                case 3: goto L_0x00dc;
                case 4: goto L_0x00cf;
                case 5: goto L_0x00c2;
                case 6: goto L_0x00b8;
                case 7: goto L_0x00a3;
                case 8: goto L_0x008c;
                case 9: goto L_0x0074;
                case 10: goto L_0x006d;
                case 11: goto L_0x00cf;
                case 12: goto L_0x0069;
                case 13: goto L_0x00b8;
                case 14: goto L_0x00c2;
                case 15: goto L_0x005b;
                case 16: goto L_0x004d;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x01a7
        L_0x004d:
            if (r7 != 0) goto L_0x01a7
            int r0 = com.google.android.gms.internal.clearcut.zzax.zzb(r12, r10, r11)
            long r4 = r11.zzfe
            long r4 = com.google.android.gms.internal.clearcut.zzbk.zza(r4)
            goto L_0x00e4
        L_0x005b:
            if (r7 != 0) goto L_0x01a7
            int r0 = com.google.android.gms.internal.clearcut.zzax.zza(r12, r10, r11)
            int r1 = r11.zzfd
            int r1 = com.google.android.gms.internal.clearcut.zzbk.zzm(r1)
            goto L_0x00d7
        L_0x0069:
            if (r7 != 0) goto L_0x01a7
            goto L_0x00d1
        L_0x006d:
            if (r7 != r1) goto L_0x01a7
            int r0 = com.google.android.gms.internal.clearcut.zzax.zze(r12, r10, r11)
            goto L_0x009c
        L_0x0074:
            if (r7 != r1) goto L_0x01a7
            com.google.android.gms.internal.clearcut.zzef r0 = r15.zzad(r8)
            int r0 = zza((com.google.android.gms.internal.clearcut.zzef) r0, (byte[]) r12, (int) r10, (int) r13, (com.google.android.gms.internal.clearcut.zzay) r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x0085
            goto L_0x009c
        L_0x0085:
            java.lang.Object r4 = r11.zzff
            java.lang.Object r1 = com.google.android.gms.internal.clearcut.zzci.zza((java.lang.Object) r1, (java.lang.Object) r4)
            goto L_0x009e
        L_0x008c:
            if (r7 != r1) goto L_0x01a7
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x0098
            int r0 = com.google.android.gms.internal.clearcut.zzax.zzc(r12, r10, r11)
            goto L_0x009c
        L_0x0098:
            int r0 = com.google.android.gms.internal.clearcut.zzax.zzd(r12, r10, r11)
        L_0x009c:
            java.lang.Object r1 = r11.zzff
        L_0x009e:
            r9.putObject(r14, r2, r1)
            goto L_0x0012
        L_0x00a3:
            if (r7 != 0) goto L_0x01a7
            int r0 = com.google.android.gms.internal.clearcut.zzax.zzb(r12, r10, r11)
            long r4 = r11.zzfe
            r7 = 0
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            r6 = 0
        L_0x00b3:
            com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) r14, (long) r2, (boolean) r6)
            goto L_0x0012
        L_0x00b8:
            if (r7 != r0) goto L_0x01a7
            int r0 = com.google.android.gms.internal.clearcut.zzax.zzc(r12, r10)
            r9.putInt(r14, r2, r0)
            goto L_0x00f7
        L_0x00c2:
            if (r7 != r6) goto L_0x01a7
            long r4 = com.google.android.gms.internal.clearcut.zzax.zzd(r12, r10)
            r0 = r9
            r1 = r23
            r0.putLong(r1, r2, r4)
            goto L_0x0104
        L_0x00cf:
            if (r7 != 0) goto L_0x01a7
        L_0x00d1:
            int r0 = com.google.android.gms.internal.clearcut.zzax.zza(r12, r10, r11)
            int r1 = r11.zzfd
        L_0x00d7:
            r9.putInt(r14, r2, r1)
            goto L_0x0012
        L_0x00dc:
            if (r7 != 0) goto L_0x01a7
            int r0 = com.google.android.gms.internal.clearcut.zzax.zzb(r12, r10, r11)
            long r4 = r11.zzfe
        L_0x00e4:
            r6 = r0
            r0 = r9
            r1 = r23
            r0.putLong(r1, r2, r4)
            r0 = r6
            goto L_0x0012
        L_0x00ee:
            if (r7 != r0) goto L_0x01a7
            float r0 = com.google.android.gms.internal.clearcut.zzax.zzf(r12, r10)
            com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) r14, (long) r2, (float) r0)
        L_0x00f7:
            int r0 = r10 + 4
            goto L_0x0012
        L_0x00fb:
            if (r7 != r6) goto L_0x01a7
            double r0 = com.google.android.gms.internal.clearcut.zzax.zze(r12, r10)
            com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) r14, (long) r2, (double) r0)
        L_0x0104:
            int r0 = r10 + 8
            goto L_0x0012
        L_0x0108:
            r0 = 27
            if (r4 != r0) goto L_0x0140
            if (r7 != r1) goto L_0x01a7
            java.lang.Object r0 = r9.getObject(r14, r2)
            com.google.android.gms.internal.clearcut.zzcn r0 = (com.google.android.gms.internal.clearcut.zzcn) r0
            boolean r1 = r0.zzu()
            if (r1 != 0) goto L_0x012c
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0123
            r1 = 10
            goto L_0x0125
        L_0x0123:
            int r1 = r1 << 1
        L_0x0125:
            com.google.android.gms.internal.clearcut.zzcn r0 = r0.zzi(r1)
            r9.putObject(r14, r2, r0)
        L_0x012c:
            r5 = r0
            com.google.android.gms.internal.clearcut.zzef r0 = r15.zzad(r8)
            r1 = r16
            r2 = r24
            r3 = r10
            r4 = r26
            r6 = r27
            int r0 = zza((com.google.android.gms.internal.clearcut.zzef<?>) r0, (int) r1, (byte[]) r2, (int) r3, (int) r4, (com.google.android.gms.internal.clearcut.zzcn<?>) r5, (com.google.android.gms.internal.clearcut.zzay) r6)
            goto L_0x0012
        L_0x0140:
            r0 = 49
            if (r4 > r0) goto L_0x0169
            long r0 = (long) r5
            r17 = r0
            r0 = r22
            r1 = r23
            r19 = r2
            r2 = r24
            r3 = r10
            r5 = r4
            r4 = r26
            r25 = r5
            r5 = r16
            r21 = r9
            r15 = r10
            r9 = r17
            r11 = r25
            r12 = r19
            r14 = r27
            int r0 = r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (com.google.android.gms.internal.clearcut.zzay) r14)
            if (r0 != r15) goto L_0x01b9
            goto L_0x01a5
        L_0x0169:
            r19 = r2
            r25 = r4
            r21 = r9
            r15 = r10
            r0 = 50
            r9 = r25
            if (r9 != r0) goto L_0x018d
            if (r7 != r1) goto L_0x01aa
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r15
            r4 = r26
            r5 = r8
            r7 = r19
            r9 = r27
            int r0 = r0.zza(r1, r2, r3, r4, r5, r6, r7, r9)
            if (r0 != r15) goto L_0x01b9
            goto L_0x01a5
        L_0x018d:
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r15
            r4 = r26
            r10 = r5
            r5 = r16
            r12 = r8
            r8 = r10
            r10 = r19
            r13 = r27
            int r0 = r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (com.google.android.gms.internal.clearcut.zzay) r13)
            if (r0 != r15) goto L_0x01b9
        L_0x01a5:
            r2 = r0
            goto L_0x01ab
        L_0x01a7:
            r21 = r9
            r15 = r10
        L_0x01aa:
            r2 = r15
        L_0x01ab:
            r0 = r16
            r1 = r24
            r3 = r26
            r4 = r23
            r5 = r27
            int r0 = zza((int) r0, (byte[]) r1, (int) r2, (int) r3, (java.lang.Object) r4, (com.google.android.gms.internal.clearcut.zzay) r5)
        L_0x01b9:
            r15 = r22
            r14 = r23
            r12 = r24
            r13 = r26
            r11 = r27
            r9 = r21
            goto L_0x0012
        L_0x01c7:
            r4 = r13
            if (r0 != r4) goto L_0x01cb
            return
        L_0x01cb:
            com.google.android.gms.internal.clearcut.zzco r0 = com.google.android.gms.internal.clearcut.zzco.zzbo()
            throw r0
        L_0x01d0:
            r4 = r13
            r5 = 0
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r6 = r27
            r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (com.google.android.gms.internal.clearcut.zzay) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.clearcut.zzay):void");
    }

    public final void zzc(T t) {
        int[] iArr = this.zzmt;
        if (iArr != null) {
            for (int zzag : iArr) {
                long zzag2 = (long) (zzag(zzag) & 1048575);
                Object zzo = zzfd.zzo(t, zzag2);
                if (zzo != null) {
                    zzfd.zza((Object) t, zzag2, this.zzmz.zzj(zzo));
                }
            }
        }
        int[] iArr2 = this.zzmu;
        if (iArr2 != null) {
            for (int i : iArr2) {
                this.zzmw.zza(t, (long) i);
            }
        }
        this.zzmx.zzc(t);
        if (this.zzmo) {
            this.zzmy.zzc(t);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) r7, r2, com.google.android.gms.internal.clearcut.zzfd.zzo(r8, r2));
        zzb(r7, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) r7, r2, com.google.android.gms.internal.clearcut.zzfd.zzo(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b3, code lost:
        com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) r7, r2, com.google.android.gms.internal.clearcut.zzfd.zzj(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
        com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) r7, r2, com.google.android.gms.internal.clearcut.zzfd.zzk(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00eb, code lost:
        zzb(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ee, code lost:
        r0 = r0 + 4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzc(T r7, T r8) {
        /*
            r6 = this;
            if (r8 == 0) goto L_0x0105
            r0 = 0
        L_0x0003:
            int[] r1 = r6.zzmi
            int r1 = r1.length
            if (r0 >= r1) goto L_0x00f2
            int r1 = r6.zzag(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.zzmi
            r4 = r4[r0]
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r1 = r1 & r5
            int r1 = r1 >>> 20
            switch(r1) {
                case 0: goto L_0x00de;
                case 1: goto L_0x00d0;
                case 2: goto L_0x00c2;
                case 3: goto L_0x00bb;
                case 4: goto L_0x00ad;
                case 5: goto L_0x00a6;
                case 6: goto L_0x009f;
                case 7: goto L_0x0091;
                case 8: goto L_0x0083;
                case 9: goto L_0x007e;
                case 10: goto L_0x0077;
                case 11: goto L_0x0070;
                case 12: goto L_0x0069;
                case 13: goto L_0x0062;
                case 14: goto L_0x005a;
                case 15: goto L_0x0053;
                case 16: goto L_0x004b;
                case 17: goto L_0x007e;
                case 18: goto L_0x0044;
                case 19: goto L_0x0044;
                case 20: goto L_0x0044;
                case 21: goto L_0x0044;
                case 22: goto L_0x0044;
                case 23: goto L_0x0044;
                case 24: goto L_0x0044;
                case 25: goto L_0x0044;
                case 26: goto L_0x0044;
                case 27: goto L_0x0044;
                case 28: goto L_0x0044;
                case 29: goto L_0x0044;
                case 30: goto L_0x0044;
                case 31: goto L_0x0044;
                case 32: goto L_0x0044;
                case 33: goto L_0x0044;
                case 34: goto L_0x0044;
                case 35: goto L_0x0044;
                case 36: goto L_0x0044;
                case 37: goto L_0x0044;
                case 38: goto L_0x0044;
                case 39: goto L_0x0044;
                case 40: goto L_0x0044;
                case 41: goto L_0x0044;
                case 42: goto L_0x0044;
                case 43: goto L_0x0044;
                case 44: goto L_0x0044;
                case 45: goto L_0x0044;
                case 46: goto L_0x0044;
                case 47: goto L_0x0044;
                case 48: goto L_0x0044;
                case 49: goto L_0x0044;
                case 50: goto L_0x003d;
                case 51: goto L_0x002b;
                case 52: goto L_0x002b;
                case 53: goto L_0x002b;
                case 54: goto L_0x002b;
                case 55: goto L_0x002b;
                case 56: goto L_0x002b;
                case 57: goto L_0x002b;
                case 58: goto L_0x002b;
                case 59: goto L_0x002b;
                case 60: goto L_0x0026;
                case 61: goto L_0x001f;
                case 62: goto L_0x001f;
                case 63: goto L_0x001f;
                case 64: goto L_0x001f;
                case 65: goto L_0x001f;
                case 66: goto L_0x001f;
                case 67: goto L_0x001f;
                case 68: goto L_0x0026;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x00ee
        L_0x001f:
            boolean r1 = r6.zza(r8, (int) r4, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x0031
        L_0x0026:
            r6.zzb(r7, r8, (int) r0)
            goto L_0x00ee
        L_0x002b:
            boolean r1 = r6.zza(r8, (int) r4, (int) r0)
            if (r1 == 0) goto L_0x00ee
        L_0x0031:
            java.lang.Object r1 = com.google.android.gms.internal.clearcut.zzfd.zzo(r8, r2)
            com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) r7, (long) r2, (java.lang.Object) r1)
            r6.zzb(r7, (int) r4, (int) r0)
            goto L_0x00ee
        L_0x003d:
            com.google.android.gms.internal.clearcut.zzdj r1 = r6.zzmz
            com.google.android.gms.internal.clearcut.zzeh.zza((com.google.android.gms.internal.clearcut.zzdj) r1, r7, r8, (long) r2)
            goto L_0x00ee
        L_0x0044:
            com.google.android.gms.internal.clearcut.zzcy r1 = r6.zzmw
            r1.zza(r7, r8, r2)
            goto L_0x00ee
        L_0x004b:
            boolean r1 = r6.zza(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x0053:
            boolean r1 = r6.zza(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x005a:
            boolean r1 = r6.zza(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x0062:
            boolean r1 = r6.zza(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x0069:
            boolean r1 = r6.zza(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x0070:
            boolean r1 = r6.zza(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x0077:
            boolean r1 = r6.zza(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x0089
        L_0x007e:
            r6.zza(r7, r8, (int) r0)
            goto L_0x00ee
        L_0x0083:
            boolean r1 = r6.zza(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
        L_0x0089:
            java.lang.Object r1 = com.google.android.gms.internal.clearcut.zzfd.zzo(r8, r2)
            com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) r7, (long) r2, (java.lang.Object) r1)
            goto L_0x00eb
        L_0x0091:
            boolean r1 = r6.zza(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            boolean r1 = com.google.android.gms.internal.clearcut.zzfd.zzl(r8, r2)
            com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) r7, (long) r2, (boolean) r1)
            goto L_0x00eb
        L_0x009f:
            boolean r1 = r6.zza(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x00a6:
            boolean r1 = r6.zza(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00ad:
            boolean r1 = r6.zza(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00b3:
            int r1 = com.google.android.gms.internal.clearcut.zzfd.zzj(r8, r2)
            com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) r7, (long) r2, (int) r1)
            goto L_0x00eb
        L_0x00bb:
            boolean r1 = r6.zza(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00c2:
            boolean r1 = r6.zza(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00c8:
            long r4 = com.google.android.gms.internal.clearcut.zzfd.zzk(r8, r2)
            com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) r7, (long) r2, (long) r4)
            goto L_0x00eb
        L_0x00d0:
            boolean r1 = r6.zza(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            float r1 = com.google.android.gms.internal.clearcut.zzfd.zzm(r8, r2)
            com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) r7, (long) r2, (float) r1)
            goto L_0x00eb
        L_0x00de:
            boolean r1 = r6.zza(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            double r4 = com.google.android.gms.internal.clearcut.zzfd.zzn(r8, r2)
            com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) r7, (long) r2, (double) r4)
        L_0x00eb:
            r6.zzb(r7, (int) r0)
        L_0x00ee:
            int r0 = r0 + 4
            goto L_0x0003
        L_0x00f2:
            boolean r0 = r6.zzmq
            if (r0 != 0) goto L_0x0104
            com.google.android.gms.internal.clearcut.zzex<?, ?> r0 = r6.zzmx
            com.google.android.gms.internal.clearcut.zzeh.zza(r0, r7, r8)
            boolean r0 = r6.zzmo
            if (r0 == 0) goto L_0x0104
            com.google.android.gms.internal.clearcut.zzbu<?> r0 = r6.zzmy
            com.google.android.gms.internal.clearcut.zzeh.zza(r0, r7, r8)
        L_0x0104:
            return
        L_0x0105:
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zzc(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d8, code lost:
        if (r0.zzmr != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01e9, code lost:
        if (r0.zzmr != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01fa, code lost:
        if (r0.zzmr != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x020b, code lost:
        if (r0.zzmr != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x020d, code lost:
        r2.putInt(r1, (long) r14, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0211, code lost:
        r3 = (com.google.android.gms.internal.clearcut.zzbn.zzr(r3) + com.google.android.gms.internal.clearcut.zzbn.zzt(r5)) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02a9, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzc(r3, (com.google.android.gms.internal.clearcut.zzdo) com.google.android.gms.internal.clearcut.zzfd.zzo(r1, r5), zzad(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02c3, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzf(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02d3, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzi(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02df, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzh(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02eb, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzk(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02fb, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzl(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x030b, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzh(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0317, code lost:
        r5 = com.google.android.gms.internal.clearcut.zzfd.zzo(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0322, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzeh.zzc(r3, com.google.android.gms.internal.clearcut.zzfd.zzo(r1, r5), zzad(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x033c, code lost:
        if ((r5 instanceof com.google.android.gms.internal.clearcut.zzbb) != false) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x033e, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzc(r3, (com.google.android.gms.internal.clearcut.zzbb) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0346, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzb(r3, (java.lang.String) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0353, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzc(r3, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x035e, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzj(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0369, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzg(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0378, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzg(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0387, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zze(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0396, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzd(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03a1, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzb(r3, (float) com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03ac, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzb(r3, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03b2, code lost:
        r13 = r13 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03b3, code lost:
        r12 = r12 + 4;
        r3 = 267386880;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0420, code lost:
        if (zza(r1, r15, r5) != false) goto L_0x06ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0440, code lost:
        if (zza(r1, r15, r5) != false) goto L_0x06fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0448, code lost:
        if (zza(r1, r15, r5) != false) goto L_0x0706;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0468, code lost:
        if (zza(r1, r15, r5) != false) goto L_0x072b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0470, code lost:
        if (zza(r1, r15, r5) != false) goto L_0x0734;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0480, code lost:
        if ((r4 instanceof com.google.android.gms.internal.clearcut.zzbb) != false) goto L_0x074d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0488, code lost:
        if (zza(r1, r15, r5) != false) goto L_0x0761;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0520, code lost:
        if (r0.zzmr != false) goto L_0x0606;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0532, code lost:
        if (r0.zzmr != false) goto L_0x0606;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0544, code lost:
        if (r0.zzmr != false) goto L_0x0606;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0556, code lost:
        if (r0.zzmr != false) goto L_0x0606;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0568, code lost:
        if (r0.zzmr != false) goto L_0x0606;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x057a, code lost:
        if (r0.zzmr != false) goto L_0x0606;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x058c, code lost:
        if (r0.zzmr != false) goto L_0x0606;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x059e, code lost:
        if (r0.zzmr != false) goto L_0x0606;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x05af, code lost:
        if (r0.zzmr != false) goto L_0x0606;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x05c0, code lost:
        if (r0.zzmr != false) goto L_0x0606;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x05d1, code lost:
        if (r0.zzmr != false) goto L_0x0606;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x05e2, code lost:
        if (r0.zzmr != false) goto L_0x0606;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x05f3, code lost:
        if (r0.zzmr != false) goto L_0x0606;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0604, code lost:
        if (r0.zzmr != false) goto L_0x0606;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0606, code lost:
        r2.putInt(r1, (long) r8, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x060a, code lost:
        r7 = (com.google.android.gms.internal.clearcut.zzbn.zzr(r15) + com.google.android.gms.internal.clearcut.zzbn.zzt(r4)) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x06b7, code lost:
        r6 = r6 + r4;
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x06c6, code lost:
        r7 = r4;
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x06cc, code lost:
        if ((r12 & r14) != 0) goto L_0x06ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x06ce, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.zzc(r15, (com.google.android.gms.internal.clearcut.zzdo) r2.getObject(r1, r10), zzad(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x06e5, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.zzf(r15, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x06f2, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.zzi(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x06f9, code lost:
        if ((r12 & r14) != 0) goto L_0x06fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x06fb, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.zzh(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0704, code lost:
        if ((r12 & r14) != 0) goto L_0x0706;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0706, code lost:
        r7 = com.google.android.gms.internal.clearcut.zzbn.zzk(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x070b, code lost:
        r6 = r6 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0715, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.zzl(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0722, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.zzh(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0729, code lost:
        if ((r12 & r14) != 0) goto L_0x072b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x072b, code lost:
        r4 = r2.getObject(r1, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0732, code lost:
        if ((r12 & r14) != 0) goto L_0x0734;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0734, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzc(r15, r2.getObject(r1, r10), zzad(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x074b, code lost:
        if ((r4 instanceof com.google.android.gms.internal.clearcut.zzbb) != false) goto L_0x074d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x074d, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.zzc(r15, (com.google.android.gms.internal.clearcut.zzbb) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ab, code lost:
        if ((r5 instanceof com.google.android.gms.internal.clearcut.zzbb) != false) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0755, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.zzb(r15, (java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x075f, code lost:
        if ((r12 & r14) != 0) goto L_0x0761;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0761, code lost:
        r4 = 1;
        r7 = com.google.android.gms.internal.clearcut.zzbn.zzc(r15, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0766, code lost:
        r6 = r6 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0768, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0776, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0777, code lost:
        r8 = false;
        r18 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x07e8, code lost:
        r5 = r5 + 4;
        r11 = r7;
        r10 = 1048575;
        r7 = r4;
        r4 = r8;
        r8 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0127, code lost:
        if (r0.zzmr != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0139, code lost:
        if (r0.zzmr != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014b, code lost:
        if (r0.zzmr != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x015d, code lost:
        if (r0.zzmr != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x016f, code lost:
        if (r0.zzmr != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0181, code lost:
        if (r0.zzmr != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0193, code lost:
        if (r0.zzmr != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a5, code lost:
        if (r0.zzmr != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b6, code lost:
        if (r0.zzmr != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c7, code lost:
        if (r0.zzmr != false) goto L_0x020d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzm(T r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            boolean r2 = r0.zzmq
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1
            r8 = 0
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r11 = 0
            if (r2 == 0) goto L_0x03c1
            sun.misc.Unsafe r2 = zzmh
            r12 = r11
            r13 = r12
        L_0x0016:
            int[] r14 = r0.zzmi
            int r14 = r14.length
            if (r12 >= r14) goto L_0x03b9
            int r14 = r0.zzag(r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.zzmi
            r3 = r3[r12]
            r14 = r14 & r10
            long r5 = (long) r14
            com.google.android.gms.internal.clearcut.zzcb r14 = com.google.android.gms.internal.clearcut.zzcb.DOUBLE_LIST_PACKED
            int r14 = r14.mo47711id()
            if (r15 < r14) goto L_0x0041
            com.google.android.gms.internal.clearcut.zzcb r14 = com.google.android.gms.internal.clearcut.zzcb.SINT64_LIST_PACKED
            int r14 = r14.mo47711id()
            if (r15 > r14) goto L_0x0041
            int[] r14 = r0.zzmi
            int r17 = r12 + 2
            r14 = r14[r17]
            r14 = r14 & r10
            goto L_0x0042
        L_0x0041:
            r14 = r11
        L_0x0042:
            switch(r15) {
                case 0: goto L_0x03a6;
                case 1: goto L_0x039b;
                case 2: goto L_0x038c;
                case 3: goto L_0x037d;
                case 4: goto L_0x036e;
                case 5: goto L_0x0363;
                case 6: goto L_0x0358;
                case 7: goto L_0x034d;
                case 8: goto L_0x0330;
                case 9: goto L_0x031c;
                case 10: goto L_0x0311;
                case 11: goto L_0x0301;
                case 12: goto L_0x02f1;
                case 13: goto L_0x02e5;
                case 14: goto L_0x02d9;
                case 15: goto L_0x02c9;
                case 16: goto L_0x02b9;
                case 17: goto L_0x02a3;
                case 18: goto L_0x0299;
                case 19: goto L_0x028f;
                case 20: goto L_0x0285;
                case 21: goto L_0x027b;
                case 22: goto L_0x0271;
                case 23: goto L_0x0299;
                case 24: goto L_0x028f;
                case 25: goto L_0x0267;
                case 26: goto L_0x025d;
                case 27: goto L_0x024f;
                case 28: goto L_0x0245;
                case 29: goto L_0x023b;
                case 30: goto L_0x0231;
                case 31: goto L_0x028f;
                case 32: goto L_0x0299;
                case 33: goto L_0x0227;
                case 34: goto L_0x021d;
                case 35: goto L_0x01fd;
                case 36: goto L_0x01ec;
                case 37: goto L_0x01db;
                case 38: goto L_0x01ca;
                case 39: goto L_0x01b9;
                case 40: goto L_0x01a8;
                case 41: goto L_0x0197;
                case 42: goto L_0x0185;
                case 43: goto L_0x0173;
                case 44: goto L_0x0161;
                case 45: goto L_0x014f;
                case 46: goto L_0x013d;
                case 47: goto L_0x012b;
                case 48: goto L_0x0119;
                case 49: goto L_0x010b;
                case 50: goto L_0x00fb;
                case 51: goto L_0x00f3;
                case 52: goto L_0x00eb;
                case 53: goto L_0x00df;
                case 54: goto L_0x00d3;
                case 55: goto L_0x00c7;
                case 56: goto L_0x00bf;
                case 57: goto L_0x00b7;
                case 58: goto L_0x00af;
                case 59: goto L_0x009f;
                case 60: goto L_0x0097;
                case 61: goto L_0x008f;
                case 62: goto L_0x0083;
                case 63: goto L_0x0077;
                case 64: goto L_0x006f;
                case 65: goto L_0x0067;
                case 66: goto L_0x005b;
                case 67: goto L_0x004f;
                case 68: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x03b3
        L_0x0047:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03b3
            goto L_0x02a9
        L_0x004f:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03b3
            long r5 = zzh(r1, r5)
            goto L_0x02c3
        L_0x005b:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03b3
            int r5 = zzg(r1, r5)
            goto L_0x02d3
        L_0x0067:
            boolean r5 = r0.zza(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x03b3
            goto L_0x02df
        L_0x006f:
            boolean r5 = r0.zza(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x03b3
            goto L_0x02eb
        L_0x0077:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03b3
            int r5 = zzg(r1, r5)
            goto L_0x02fb
        L_0x0083:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03b3
            int r5 = zzg(r1, r5)
            goto L_0x030b
        L_0x008f:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03b3
            goto L_0x0317
        L_0x0097:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03b3
            goto L_0x0322
        L_0x009f:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03b3
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.zzfd.zzo(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.clearcut.zzbb
            if (r6 == 0) goto L_0x0346
            goto L_0x033e
        L_0x00af:
            boolean r5 = r0.zza(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x03b3
            goto L_0x0353
        L_0x00b7:
            boolean r5 = r0.zza(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x03b3
            goto L_0x035e
        L_0x00bf:
            boolean r5 = r0.zza(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x03b3
            goto L_0x0369
        L_0x00c7:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03b3
            int r5 = zzg(r1, r5)
            goto L_0x0378
        L_0x00d3:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03b3
            long r5 = zzh(r1, r5)
            goto L_0x0387
        L_0x00df:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03b3
            long r5 = zzh(r1, r5)
            goto L_0x0396
        L_0x00eb:
            boolean r5 = r0.zza(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x03b3
            goto L_0x03a1
        L_0x00f3:
            boolean r5 = r0.zza(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x03b3
            goto L_0x03ac
        L_0x00fb:
            com.google.android.gms.internal.clearcut.zzdj r14 = r0.zzmz
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.zzfd.zzo(r1, r5)
            java.lang.Object r6 = r0.zzae(r12)
            int r3 = r14.zzb(r3, r5, r6)
            goto L_0x03b2
        L_0x010b:
            java.util.List r5 = zzd(r1, r5)
            com.google.android.gms.internal.clearcut.zzef r6 = r0.zzad(r12)
            int r3 = com.google.android.gms.internal.clearcut.zzeh.zzd(r3, r5, r6)
            goto L_0x03b2
        L_0x0119:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.zzeh.zzc(r5)
            if (r5 <= 0) goto L_0x03b3
            boolean r6 = r0.zzmr
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x012b:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.zzeh.zzg(r5)
            if (r5 <= 0) goto L_0x03b3
            boolean r6 = r0.zzmr
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x013d:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.zzeh.zzi(r5)
            if (r5 <= 0) goto L_0x03b3
            boolean r6 = r0.zzmr
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x014f:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.zzeh.zzh(r5)
            if (r5 <= 0) goto L_0x03b3
            boolean r6 = r0.zzmr
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0161:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.zzeh.zzd((java.util.List<java.lang.Integer>) r5)
            if (r5 <= 0) goto L_0x03b3
            boolean r6 = r0.zzmr
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0173:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.zzeh.zzf((java.util.List<java.lang.Integer>) r5)
            if (r5 <= 0) goto L_0x03b3
            boolean r6 = r0.zzmr
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0185:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.zzeh.zzj(r5)
            if (r5 <= 0) goto L_0x03b3
            boolean r6 = r0.zzmr
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0197:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.zzeh.zzh(r5)
            if (r5 <= 0) goto L_0x03b3
            boolean r6 = r0.zzmr
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01a8:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.zzeh.zzi(r5)
            if (r5 <= 0) goto L_0x03b3
            boolean r6 = r0.zzmr
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01b9:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.zzeh.zze(r5)
            if (r5 <= 0) goto L_0x03b3
            boolean r6 = r0.zzmr
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01ca:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.zzeh.zzb(r5)
            if (r5 <= 0) goto L_0x03b3
            boolean r6 = r0.zzmr
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01db:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.zzeh.zza(r5)
            if (r5 <= 0) goto L_0x03b3
            boolean r6 = r0.zzmr
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01ec:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.zzeh.zzh(r5)
            if (r5 <= 0) goto L_0x03b3
            boolean r6 = r0.zzmr
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01fd:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.zzeh.zzi(r5)
            if (r5 <= 0) goto L_0x03b3
            boolean r6 = r0.zzmr
            if (r6 == 0) goto L_0x0211
        L_0x020d:
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0211:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.zzr(r3)
            int r6 = com.google.android.gms.internal.clearcut.zzbn.zzt(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            goto L_0x03b2
        L_0x021d:
            java.util.List r5 = zzd(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.zzeh.zzq(r3, r5, r11)
            goto L_0x03b2
        L_0x0227:
            java.util.List r5 = zzd(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.zzeh.zzu(r3, r5, r11)
            goto L_0x03b2
        L_0x0231:
            java.util.List r5 = zzd(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.zzeh.zzr(r3, r5, r11)
            goto L_0x03b2
        L_0x023b:
            java.util.List r5 = zzd(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.zzeh.zzt(r3, r5, r11)
            goto L_0x03b2
        L_0x0245:
            java.util.List r5 = zzd(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.zzeh.zzd((int) r3, (java.util.List<com.google.android.gms.internal.clearcut.zzbb>) r5)
            goto L_0x03b2
        L_0x024f:
            java.util.List r5 = zzd(r1, r5)
            com.google.android.gms.internal.clearcut.zzef r6 = r0.zzad(r12)
            int r3 = com.google.android.gms.internal.clearcut.zzeh.zzc((int) r3, (java.util.List<?>) r5, (com.google.android.gms.internal.clearcut.zzef) r6)
            goto L_0x03b2
        L_0x025d:
            java.util.List r5 = zzd(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.zzeh.zzc(r3, r5)
            goto L_0x03b2
        L_0x0267:
            java.util.List r5 = zzd(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.zzeh.zzx(r3, r5, r11)
            goto L_0x03b2
        L_0x0271:
            java.util.List r5 = zzd(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.zzeh.zzs(r3, r5, r11)
            goto L_0x03b2
        L_0x027b:
            java.util.List r5 = zzd(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.zzeh.zzp(r3, r5, r11)
            goto L_0x03b2
        L_0x0285:
            java.util.List r5 = zzd(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.zzeh.zzo(r3, r5, r11)
            goto L_0x03b2
        L_0x028f:
            java.util.List r5 = zzd(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.zzeh.zzv(r3, r5, r11)
            goto L_0x03b2
        L_0x0299:
            java.util.List r5 = zzd(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.zzeh.zzw(r3, r5, r11)
            goto L_0x03b2
        L_0x02a3:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x03b3
        L_0x02a9:
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.zzfd.zzo(r1, r5)
            com.google.android.gms.internal.clearcut.zzdo r5 = (com.google.android.gms.internal.clearcut.zzdo) r5
            com.google.android.gms.internal.clearcut.zzef r6 = r0.zzad(r12)
            int r3 = com.google.android.gms.internal.clearcut.zzbn.zzc(r3, r5, r6)
            goto L_0x03b2
        L_0x02b9:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x03b3
            long r5 = com.google.android.gms.internal.clearcut.zzfd.zzk(r1, r5)
        L_0x02c3:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.zzf((int) r3, (long) r5)
            goto L_0x03b2
        L_0x02c9:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x03b3
            int r5 = com.google.android.gms.internal.clearcut.zzfd.zzj(r1, r5)
        L_0x02d3:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.zzi(r3, r5)
            goto L_0x03b2
        L_0x02d9:
            boolean r5 = r0.zza(r1, (int) r12)
            if (r5 == 0) goto L_0x03b3
        L_0x02df:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.zzh((int) r3, (long) r8)
            goto L_0x03b2
        L_0x02e5:
            boolean r5 = r0.zza(r1, (int) r12)
            if (r5 == 0) goto L_0x03b3
        L_0x02eb:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.zzk(r3, r11)
            goto L_0x03b2
        L_0x02f1:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x03b3
            int r5 = com.google.android.gms.internal.clearcut.zzfd.zzj(r1, r5)
        L_0x02fb:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.zzl(r3, r5)
            goto L_0x03b2
        L_0x0301:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x03b3
            int r5 = com.google.android.gms.internal.clearcut.zzfd.zzj(r1, r5)
        L_0x030b:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.zzh((int) r3, (int) r5)
            goto L_0x03b2
        L_0x0311:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x03b3
        L_0x0317:
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.zzfd.zzo(r1, r5)
            goto L_0x033e
        L_0x031c:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x03b3
        L_0x0322:
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.zzfd.zzo(r1, r5)
            com.google.android.gms.internal.clearcut.zzef r6 = r0.zzad(r12)
            int r3 = com.google.android.gms.internal.clearcut.zzeh.zzc((int) r3, (java.lang.Object) r5, (com.google.android.gms.internal.clearcut.zzef) r6)
            goto L_0x03b2
        L_0x0330:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x03b3
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.zzfd.zzo(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.clearcut.zzbb
            if (r6 == 0) goto L_0x0346
        L_0x033e:
            com.google.android.gms.internal.clearcut.zzbb r5 = (com.google.android.gms.internal.clearcut.zzbb) r5
            int r3 = com.google.android.gms.internal.clearcut.zzbn.zzc((int) r3, (com.google.android.gms.internal.clearcut.zzbb) r5)
            goto L_0x03b2
        L_0x0346:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.clearcut.zzbn.zzb((int) r3, (java.lang.String) r5)
            goto L_0x03b2
        L_0x034d:
            boolean r5 = r0.zza(r1, (int) r12)
            if (r5 == 0) goto L_0x03b3
        L_0x0353:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.zzc((int) r3, (boolean) r7)
            goto L_0x03b2
        L_0x0358:
            boolean r5 = r0.zza(r1, (int) r12)
            if (r5 == 0) goto L_0x03b3
        L_0x035e:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.zzj(r3, r11)
            goto L_0x03b2
        L_0x0363:
            boolean r5 = r0.zza(r1, (int) r12)
            if (r5 == 0) goto L_0x03b3
        L_0x0369:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.zzg((int) r3, (long) r8)
            goto L_0x03b2
        L_0x036e:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x03b3
            int r5 = com.google.android.gms.internal.clearcut.zzfd.zzj(r1, r5)
        L_0x0378:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.zzg((int) r3, (int) r5)
            goto L_0x03b2
        L_0x037d:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x03b3
            long r5 = com.google.android.gms.internal.clearcut.zzfd.zzk(r1, r5)
        L_0x0387:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.zze((int) r3, (long) r5)
            goto L_0x03b2
        L_0x038c:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x03b3
            long r5 = com.google.android.gms.internal.clearcut.zzfd.zzk(r1, r5)
        L_0x0396:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.zzd((int) r3, (long) r5)
            goto L_0x03b2
        L_0x039b:
            boolean r5 = r0.zza(r1, (int) r12)
            if (r5 == 0) goto L_0x03b3
        L_0x03a1:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.zzb((int) r3, (float) r4)
            goto L_0x03b2
        L_0x03a6:
            boolean r5 = r0.zza(r1, (int) r12)
            if (r5 == 0) goto L_0x03b3
        L_0x03ac:
            r5 = 0
            int r3 = com.google.android.gms.internal.clearcut.zzbn.zzb((int) r3, (double) r5)
        L_0x03b2:
            int r13 = r13 + r3
        L_0x03b3:
            int r12 = r12 + 4
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x03b9:
            com.google.android.gms.internal.clearcut.zzex<?, ?> r2 = r0.zzmx
            int r1 = zza(r2, r1)
            int r13 = r13 + r1
            return r13
        L_0x03c1:
            sun.misc.Unsafe r2 = zzmh
            r3 = -1
            r5 = r11
            r6 = r5
            r12 = r6
        L_0x03c7:
            int[] r13 = r0.zzmi
            int r13 = r13.length
            if (r5 >= r13) goto L_0x07f4
            int r13 = r0.zzag(r5)
            int[] r14 = r0.zzmi
            r15 = r14[r5]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r13 & r16
            int r4 = r17 >>> 20
            r8 = 17
            if (r4 > r8) goto L_0x03f5
            int r8 = r5 + 2
            r8 = r14[r8]
            r9 = r8 & r10
            int r14 = r8 >>> 20
            int r14 = r7 << r14
            r20 = r8
            if (r9 == r3) goto L_0x03f2
            long r7 = (long) r9
            int r12 = r2.getInt(r1, r7)
            r3 = r9
        L_0x03f2:
            r8 = r20
            goto L_0x0414
        L_0x03f5:
            boolean r7 = r0.zzmr
            if (r7 == 0) goto L_0x0412
            com.google.android.gms.internal.clearcut.zzcb r7 = com.google.android.gms.internal.clearcut.zzcb.DOUBLE_LIST_PACKED
            int r7 = r7.mo47711id()
            if (r4 < r7) goto L_0x0412
            com.google.android.gms.internal.clearcut.zzcb r7 = com.google.android.gms.internal.clearcut.zzcb.SINT64_LIST_PACKED
            int r7 = r7.mo47711id()
            if (r4 > r7) goto L_0x0412
            int[] r7 = r0.zzmi
            int r8 = r5 + 2
            r7 = r7[r8]
            r7 = r7 & r10
            r8 = r7
            goto L_0x0413
        L_0x0412:
            r8 = r11
        L_0x0413:
            r14 = r11
        L_0x0414:
            r7 = r13 & r10
            long r10 = (long) r7
            switch(r4) {
                case 0: goto L_0x07d5;
                case 1: goto L_0x07c6;
                case 2: goto L_0x07b3;
                case 3: goto L_0x07a2;
                case 4: goto L_0x0791;
                case 5: goto L_0x077e;
                case 6: goto L_0x076a;
                case 7: goto L_0x075d;
                case 8: goto L_0x0741;
                case 9: goto L_0x0730;
                case 10: goto L_0x0727;
                case 11: goto L_0x071a;
                case 12: goto L_0x070d;
                case 13: goto L_0x0702;
                case 14: goto L_0x06f7;
                case 15: goto L_0x06ea;
                case 16: goto L_0x06dd;
                case 17: goto L_0x06ca;
                case 18: goto L_0x06bb;
                case 19: goto L_0x06ac;
                case 20: goto L_0x06a0;
                case 21: goto L_0x0694;
                case 22: goto L_0x0688;
                case 23: goto L_0x067c;
                case 24: goto L_0x06ac;
                case 25: goto L_0x0670;
                case 26: goto L_0x0665;
                case 27: goto L_0x0656;
                case 28: goto L_0x064a;
                case 29: goto L_0x063d;
                case 30: goto L_0x0630;
                case 31: goto L_0x06ac;
                case 32: goto L_0x067c;
                case 33: goto L_0x0623;
                case 34: goto L_0x0616;
                case 35: goto L_0x05f6;
                case 36: goto L_0x05e5;
                case 37: goto L_0x05d4;
                case 38: goto L_0x05c3;
                case 39: goto L_0x05b2;
                case 40: goto L_0x05a1;
                case 41: goto L_0x0590;
                case 42: goto L_0x057e;
                case 43: goto L_0x056c;
                case 44: goto L_0x055a;
                case 45: goto L_0x0548;
                case 46: goto L_0x0536;
                case 47: goto L_0x0524;
                case 48: goto L_0x0512;
                case 49: goto L_0x0502;
                case 50: goto L_0x04f2;
                case 51: goto L_0x04e4;
                case 52: goto L_0x04d7;
                case 53: goto L_0x04c7;
                case 54: goto L_0x04b7;
                case 55: goto L_0x04a7;
                case 56: goto L_0x0499;
                case 57: goto L_0x048c;
                case 58: goto L_0x0484;
                case 59: goto L_0x0474;
                case 60: goto L_0x046c;
                case 61: goto L_0x0464;
                case 62: goto L_0x0458;
                case 63: goto L_0x044c;
                case 64: goto L_0x0444;
                case 65: goto L_0x043c;
                case 66: goto L_0x0430;
                case 67: goto L_0x0424;
                case 68: goto L_0x041c;
                default: goto L_0x041a;
            }
        L_0x041a:
            goto L_0x0768
        L_0x041c:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0768
            goto L_0x06ce
        L_0x0424:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0768
            long r7 = zzh(r1, r10)
            goto L_0x06e5
        L_0x0430:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0768
            int r4 = zzg(r1, r10)
            goto L_0x06f2
        L_0x043c:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0768
            goto L_0x06fb
        L_0x0444:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0768
            goto L_0x0706
        L_0x044c:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0768
            int r4 = zzg(r1, r10)
            goto L_0x0715
        L_0x0458:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0768
            int r4 = zzg(r1, r10)
            goto L_0x0722
        L_0x0464:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0768
            goto L_0x072b
        L_0x046c:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0768
            goto L_0x0734
        L_0x0474:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0768
            java.lang.Object r4 = r2.getObject(r1, r10)
            boolean r7 = r4 instanceof com.google.android.gms.internal.clearcut.zzbb
            if (r7 == 0) goto L_0x0755
            goto L_0x074d
        L_0x0484:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0768
            goto L_0x0761
        L_0x048c:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0768
            r4 = 0
            int r7 = com.google.android.gms.internal.clearcut.zzbn.zzj(r15, r4)
            goto L_0x070b
        L_0x0499:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0768
            r7 = 0
            int r4 = com.google.android.gms.internal.clearcut.zzbn.zzg((int) r15, (long) r7)
            goto L_0x06c6
        L_0x04a7:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0768
            int r4 = zzg(r1, r10)
            int r4 = com.google.android.gms.internal.clearcut.zzbn.zzg((int) r15, (int) r4)
            goto L_0x06c6
        L_0x04b7:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0768
            long r7 = zzh(r1, r10)
            int r4 = com.google.android.gms.internal.clearcut.zzbn.zze((int) r15, (long) r7)
            goto L_0x06c6
        L_0x04c7:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0768
            long r7 = zzh(r1, r10)
            int r4 = com.google.android.gms.internal.clearcut.zzbn.zzd((int) r15, (long) r7)
            goto L_0x06c6
        L_0x04d7:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0768
            r4 = 0
            int r7 = com.google.android.gms.internal.clearcut.zzbn.zzb((int) r15, (float) r4)
            goto L_0x070b
        L_0x04e4:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0768
            r7 = 0
            int r4 = com.google.android.gms.internal.clearcut.zzbn.zzb((int) r15, (double) r7)
            goto L_0x06c6
        L_0x04f2:
            com.google.android.gms.internal.clearcut.zzdj r4 = r0.zzmz
            java.lang.Object r7 = r2.getObject(r1, r10)
            java.lang.Object r8 = r0.zzae(r5)
            int r4 = r4.zzb(r15, r7, r8)
            goto L_0x06c6
        L_0x0502:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.zzef r7 = r0.zzad(r5)
            int r4 = com.google.android.gms.internal.clearcut.zzeh.zzd(r15, r4, r7)
            goto L_0x06c6
        L_0x0512:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.zzeh.zzc(r4)
            if (r4 <= 0) goto L_0x0768
            boolean r7 = r0.zzmr
            if (r7 == 0) goto L_0x060a
            goto L_0x0606
        L_0x0524:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.zzeh.zzg(r4)
            if (r4 <= 0) goto L_0x0768
            boolean r7 = r0.zzmr
            if (r7 == 0) goto L_0x060a
            goto L_0x0606
        L_0x0536:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.zzeh.zzi(r4)
            if (r4 <= 0) goto L_0x0768
            boolean r7 = r0.zzmr
            if (r7 == 0) goto L_0x060a
            goto L_0x0606
        L_0x0548:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.zzeh.zzh(r4)
            if (r4 <= 0) goto L_0x0768
            boolean r7 = r0.zzmr
            if (r7 == 0) goto L_0x060a
            goto L_0x0606
        L_0x055a:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.zzeh.zzd((java.util.List<java.lang.Integer>) r4)
            if (r4 <= 0) goto L_0x0768
            boolean r7 = r0.zzmr
            if (r7 == 0) goto L_0x060a
            goto L_0x0606
        L_0x056c:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.zzeh.zzf((java.util.List<java.lang.Integer>) r4)
            if (r4 <= 0) goto L_0x0768
            boolean r7 = r0.zzmr
            if (r7 == 0) goto L_0x060a
            goto L_0x0606
        L_0x057e:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.zzeh.zzj(r4)
            if (r4 <= 0) goto L_0x0768
            boolean r7 = r0.zzmr
            if (r7 == 0) goto L_0x060a
            goto L_0x0606
        L_0x0590:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.zzeh.zzh(r4)
            if (r4 <= 0) goto L_0x0768
            boolean r7 = r0.zzmr
            if (r7 == 0) goto L_0x060a
            goto L_0x0606
        L_0x05a1:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.zzeh.zzi(r4)
            if (r4 <= 0) goto L_0x0768
            boolean r7 = r0.zzmr
            if (r7 == 0) goto L_0x060a
            goto L_0x0606
        L_0x05b2:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.zzeh.zze(r4)
            if (r4 <= 0) goto L_0x0768
            boolean r7 = r0.zzmr
            if (r7 == 0) goto L_0x060a
            goto L_0x0606
        L_0x05c3:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.zzeh.zzb(r4)
            if (r4 <= 0) goto L_0x0768
            boolean r7 = r0.zzmr
            if (r7 == 0) goto L_0x060a
            goto L_0x0606
        L_0x05d4:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.zzeh.zza(r4)
            if (r4 <= 0) goto L_0x0768
            boolean r7 = r0.zzmr
            if (r7 == 0) goto L_0x060a
            goto L_0x0606
        L_0x05e5:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.zzeh.zzh(r4)
            if (r4 <= 0) goto L_0x0768
            boolean r7 = r0.zzmr
            if (r7 == 0) goto L_0x060a
            goto L_0x0606
        L_0x05f6:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.zzeh.zzi(r4)
            if (r4 <= 0) goto L_0x0768
            boolean r7 = r0.zzmr
            if (r7 == 0) goto L_0x060a
        L_0x0606:
            long r7 = (long) r8
            r2.putInt(r1, r7, r4)
        L_0x060a:
            int r7 = com.google.android.gms.internal.clearcut.zzbn.zzr(r15)
            int r8 = com.google.android.gms.internal.clearcut.zzbn.zzt(r4)
            int r7 = r7 + r8
            int r7 = r7 + r4
            goto L_0x070b
        L_0x0616:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            r7 = 0
            int r4 = com.google.android.gms.internal.clearcut.zzeh.zzq(r15, r4, r7)
            goto L_0x06b7
        L_0x0623:
            r7 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.zzeh.zzu(r15, r4, r7)
            goto L_0x06b7
        L_0x0630:
            r7 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.zzeh.zzr(r15, r4, r7)
            goto L_0x06b7
        L_0x063d:
            r7 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.zzeh.zzt(r15, r4, r7)
            goto L_0x06c6
        L_0x064a:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.zzeh.zzd((int) r15, (java.util.List<com.google.android.gms.internal.clearcut.zzbb>) r4)
            goto L_0x06c6
        L_0x0656:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.zzef r7 = r0.zzad(r5)
            int r4 = com.google.android.gms.internal.clearcut.zzeh.zzc((int) r15, (java.util.List<?>) r4, (com.google.android.gms.internal.clearcut.zzef) r7)
            goto L_0x06c6
        L_0x0665:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.zzeh.zzc(r15, r4)
            goto L_0x06c6
        L_0x0670:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            r7 = 0
            int r4 = com.google.android.gms.internal.clearcut.zzeh.zzx(r15, r4, r7)
            goto L_0x06b7
        L_0x067c:
            r7 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.zzeh.zzw(r15, r4, r7)
            goto L_0x06b7
        L_0x0688:
            r7 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.zzeh.zzs(r15, r4, r7)
            goto L_0x06b7
        L_0x0694:
            r7 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.zzeh.zzp(r15, r4, r7)
            goto L_0x06b7
        L_0x06a0:
            r7 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.zzeh.zzo(r15, r4, r7)
            goto L_0x06b7
        L_0x06ac:
            r7 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.zzeh.zzv(r15, r4, r7)
        L_0x06b7:
            int r6 = r6 + r4
            r4 = 1
            goto L_0x0777
        L_0x06bb:
            r7 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.zzeh.zzw(r15, r4, r7)
        L_0x06c6:
            r7 = r4
            r4 = 1
            goto L_0x0766
        L_0x06ca:
            r4 = r12 & r14
            if (r4 == 0) goto L_0x0768
        L_0x06ce:
            java.lang.Object r4 = r2.getObject(r1, r10)
            com.google.android.gms.internal.clearcut.zzdo r4 = (com.google.android.gms.internal.clearcut.zzdo) r4
            com.google.android.gms.internal.clearcut.zzef r7 = r0.zzad(r5)
            int r4 = com.google.android.gms.internal.clearcut.zzbn.zzc(r15, r4, r7)
            goto L_0x06c6
        L_0x06dd:
            r4 = r12 & r14
            if (r4 == 0) goto L_0x0768
            long r7 = r2.getLong(r1, r10)
        L_0x06e5:
            int r4 = com.google.android.gms.internal.clearcut.zzbn.zzf((int) r15, (long) r7)
            goto L_0x06c6
        L_0x06ea:
            r4 = r12 & r14
            if (r4 == 0) goto L_0x0768
            int r4 = r2.getInt(r1, r10)
        L_0x06f2:
            int r4 = com.google.android.gms.internal.clearcut.zzbn.zzi(r15, r4)
            goto L_0x06c6
        L_0x06f7:
            r4 = r12 & r14
            if (r4 == 0) goto L_0x0768
        L_0x06fb:
            r7 = 0
            int r4 = com.google.android.gms.internal.clearcut.zzbn.zzh((int) r15, (long) r7)
            goto L_0x06c6
        L_0x0702:
            r4 = r12 & r14
            if (r4 == 0) goto L_0x0768
        L_0x0706:
            r4 = 0
            int r7 = com.google.android.gms.internal.clearcut.zzbn.zzk(r15, r4)
        L_0x070b:
            int r6 = r6 + r7
            goto L_0x0768
        L_0x070d:
            r4 = r12 & r14
            if (r4 == 0) goto L_0x0768
            int r4 = r2.getInt(r1, r10)
        L_0x0715:
            int r4 = com.google.android.gms.internal.clearcut.zzbn.zzl(r15, r4)
            goto L_0x06c6
        L_0x071a:
            r4 = r12 & r14
            if (r4 == 0) goto L_0x0768
            int r4 = r2.getInt(r1, r10)
        L_0x0722:
            int r4 = com.google.android.gms.internal.clearcut.zzbn.zzh((int) r15, (int) r4)
            goto L_0x06c6
        L_0x0727:
            r4 = r12 & r14
            if (r4 == 0) goto L_0x0768
        L_0x072b:
            java.lang.Object r4 = r2.getObject(r1, r10)
            goto L_0x074d
        L_0x0730:
            r4 = r12 & r14
            if (r4 == 0) goto L_0x0768
        L_0x0734:
            java.lang.Object r4 = r2.getObject(r1, r10)
            com.google.android.gms.internal.clearcut.zzef r7 = r0.zzad(r5)
            int r4 = com.google.android.gms.internal.clearcut.zzeh.zzc((int) r15, (java.lang.Object) r4, (com.google.android.gms.internal.clearcut.zzef) r7)
            goto L_0x06c6
        L_0x0741:
            r4 = r12 & r14
            if (r4 == 0) goto L_0x0768
            java.lang.Object r4 = r2.getObject(r1, r10)
            boolean r7 = r4 instanceof com.google.android.gms.internal.clearcut.zzbb
            if (r7 == 0) goto L_0x0755
        L_0x074d:
            com.google.android.gms.internal.clearcut.zzbb r4 = (com.google.android.gms.internal.clearcut.zzbb) r4
            int r4 = com.google.android.gms.internal.clearcut.zzbn.zzc((int) r15, (com.google.android.gms.internal.clearcut.zzbb) r4)
            goto L_0x06c6
        L_0x0755:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.clearcut.zzbn.zzb((int) r15, (java.lang.String) r4)
            goto L_0x06c6
        L_0x075d:
            r4 = r12 & r14
            if (r4 == 0) goto L_0x0768
        L_0x0761:
            r4 = 1
            int r7 = com.google.android.gms.internal.clearcut.zzbn.zzc((int) r15, (boolean) r4)
        L_0x0766:
            int r6 = r6 + r7
            goto L_0x0776
        L_0x0768:
            r4 = 1
            goto L_0x0776
        L_0x076a:
            r4 = 1
            r7 = r12 & r14
            if (r7 == 0) goto L_0x0776
            r7 = 0
            int r8 = com.google.android.gms.internal.clearcut.zzbn.zzj(r15, r7)
            int r6 = r6 + r8
            goto L_0x0777
        L_0x0776:
            r7 = 0
        L_0x0777:
            r8 = 0
            r10 = 0
            r18 = 0
            goto L_0x07e8
        L_0x077e:
            r4 = 1
            r7 = 0
            r8 = r12 & r14
            if (r8 == 0) goto L_0x078d
            r10 = 0
            int r8 = com.google.android.gms.internal.clearcut.zzbn.zzg((int) r15, (long) r10)
            r18 = r10
            goto L_0x07c3
        L_0x078d:
            r8 = 0
            r18 = 0
            goto L_0x07e6
        L_0x0791:
            r4 = 1
            r7 = 0
            r18 = 0
            r8 = r12 & r14
            if (r8 == 0) goto L_0x07c4
            int r8 = r2.getInt(r1, r10)
            int r8 = com.google.android.gms.internal.clearcut.zzbn.zzg((int) r15, (int) r8)
            goto L_0x07c3
        L_0x07a2:
            r4 = 1
            r7 = 0
            r18 = 0
            r8 = r12 & r14
            if (r8 == 0) goto L_0x07c4
            long r10 = r2.getLong(r1, r10)
            int r8 = com.google.android.gms.internal.clearcut.zzbn.zze((int) r15, (long) r10)
            goto L_0x07c3
        L_0x07b3:
            r4 = 1
            r7 = 0
            r18 = 0
            r8 = r12 & r14
            if (r8 == 0) goto L_0x07c4
            long r10 = r2.getLong(r1, r10)
            int r8 = com.google.android.gms.internal.clearcut.zzbn.zzd((int) r15, (long) r10)
        L_0x07c3:
            int r6 = r6 + r8
        L_0x07c4:
            r8 = 0
            goto L_0x07e6
        L_0x07c6:
            r4 = 1
            r7 = 0
            r18 = 0
            r8 = r12 & r14
            if (r8 == 0) goto L_0x07c4
            r8 = 0
            int r10 = com.google.android.gms.internal.clearcut.zzbn.zzb((int) r15, (float) r8)
            int r6 = r6 + r10
            goto L_0x07e6
        L_0x07d5:
            r4 = 1
            r7 = 0
            r8 = 0
            r18 = 0
            r10 = r12 & r14
            if (r10 == 0) goto L_0x07e6
            r10 = 0
            int r13 = com.google.android.gms.internal.clearcut.zzbn.zzb((int) r15, (double) r10)
            int r6 = r6 + r13
            goto L_0x07e8
        L_0x07e6:
            r10 = 0
        L_0x07e8:
            int r5 = r5 + 4
            r11 = r7
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r4
            r4 = r8
            r8 = r18
            goto L_0x03c7
        L_0x07f4:
            com.google.android.gms.internal.clearcut.zzex<?, ?> r2 = r0.zzmx
            int r2 = zza(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.zzmo
            if (r2 == 0) goto L_0x080a
            com.google.android.gms.internal.clearcut.zzbu<?> r2 = r0.zzmy
            com.google.android.gms.internal.clearcut.zzby r1 = r2.zza((java.lang.Object) r1)
            int r1 = r1.zzas()
            int r6 = r6 + r1
        L_0x080a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zzm(java.lang.Object):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:80:0x0109 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x011d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzo(T r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int[] r2 = r0.zzms
            r3 = 1
            if (r2 == 0) goto L_0x0133
            int r4 = r2.length
            if (r4 != 0) goto L_0x000e
            goto L_0x0133
        L_0x000e:
            r4 = -1
            int r5 = r2.length
            r7 = 0
            r8 = 0
        L_0x0012:
            if (r7 >= r5) goto L_0x0121
            r9 = r2[r7]
            int r10 = r0.zzai(r9)
            int r11 = r0.zzag(r10)
            boolean r12 = r0.zzmq
            r13 = 1048575(0xfffff, float:1.469367E-39)
            if (r12 != 0) goto L_0x003f
            int[] r12 = r0.zzmi
            int r14 = r10 + 2
            r12 = r12[r14]
            r14 = r12 & r13
            int r12 = r12 >>> 20
            int r12 = r3 << r12
            if (r14 == r4) goto L_0x003d
            sun.misc.Unsafe r4 = zzmh
            r15 = r7
            long r6 = (long) r14
            int r8 = r4.getInt(r1, r6)
            r4 = r14
            goto L_0x0041
        L_0x003d:
            r15 = r7
            goto L_0x0041
        L_0x003f:
            r15 = r7
            r12 = 0
        L_0x0041:
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            r6 = r6 & r11
            if (r6 == 0) goto L_0x0048
            r6 = r3
            goto L_0x0049
        L_0x0048:
            r6 = 0
        L_0x0049:
            if (r6 == 0) goto L_0x0053
            boolean r6 = r0.zza(r1, (int) r10, (int) r8, (int) r12)
            if (r6 != 0) goto L_0x0053
            r6 = 0
            return r6
        L_0x0053:
            r6 = 267386880(0xff00000, float:2.3665827E-29)
            r6 = r6 & r11
            int r6 = r6 >>> 20
            r7 = 9
            if (r6 == r7) goto L_0x010b
            r7 = 17
            if (r6 == r7) goto L_0x010b
            r7 = 27
            if (r6 == r7) goto L_0x00dd
            r7 = 60
            if (r6 == r7) goto L_0x00cb
            r7 = 68
            if (r6 == r7) goto L_0x00cb
            r7 = 49
            if (r6 == r7) goto L_0x00dd
            r7 = 50
            if (r6 == r7) goto L_0x0076
            goto L_0x011d
        L_0x0076:
            com.google.android.gms.internal.clearcut.zzdj r6 = r0.zzmz
            r7 = r11 & r13
            long r11 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.clearcut.zzfd.zzo(r1, r11)
            java.util.Map r6 = r6.zzh(r7)
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x00c6
            java.lang.Object r7 = r0.zzae(r10)
            com.google.android.gms.internal.clearcut.zzdj r9 = r0.zzmz
            com.google.android.gms.internal.clearcut.zzdh r7 = r9.zzl(r7)
            com.google.android.gms.internal.clearcut.zzfl r7 = r7.zzmd
            com.google.android.gms.internal.clearcut.zzfq r7 = r7.zzek()
            com.google.android.gms.internal.clearcut.zzfq r9 = com.google.android.gms.internal.clearcut.zzfq.MESSAGE
            if (r7 != r9) goto L_0x00c6
            r7 = 0
            java.util.Collection r6 = r6.values()
            java.util.Iterator r6 = r6.iterator()
        L_0x00a6:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x00c6
            java.lang.Object r9 = r6.next()
            if (r7 != 0) goto L_0x00be
            com.google.android.gms.internal.clearcut.zzea r7 = com.google.android.gms.internal.clearcut.zzea.zzcm()
            java.lang.Class r10 = r9.getClass()
            com.google.android.gms.internal.clearcut.zzef r7 = r7.zze(r10)
        L_0x00be:
            boolean r9 = r7.zzo(r9)
            if (r9 != 0) goto L_0x00a6
            r6 = 0
            goto L_0x00c7
        L_0x00c6:
            r6 = r3
        L_0x00c7:
            if (r6 != 0) goto L_0x011d
            r6 = 0
            return r6
        L_0x00cb:
            r6 = 0
            boolean r7 = r0.zza(r1, (int) r9, (int) r10)
            if (r7 == 0) goto L_0x011d
            com.google.android.gms.internal.clearcut.zzef r7 = r0.zzad(r10)
            boolean r7 = zza((java.lang.Object) r1, (int) r11, (com.google.android.gms.internal.clearcut.zzef) r7)
            if (r7 != 0) goto L_0x011d
            return r6
        L_0x00dd:
            r6 = r11 & r13
            long r6 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.clearcut.zzfd.zzo(r1, r6)
            java.util.List r6 = (java.util.List) r6
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x0106
            com.google.android.gms.internal.clearcut.zzef r7 = r0.zzad(r10)
            r9 = 0
        L_0x00f1:
            int r10 = r6.size()
            if (r9 >= r10) goto L_0x0106
            java.lang.Object r10 = r6.get(r9)
            boolean r10 = r7.zzo(r10)
            if (r10 != 0) goto L_0x0103
            r6 = 0
            goto L_0x0107
        L_0x0103:
            int r9 = r9 + 1
            goto L_0x00f1
        L_0x0106:
            r6 = r3
        L_0x0107:
            if (r6 != 0) goto L_0x011d
            r6 = 0
            return r6
        L_0x010b:
            r6 = 0
            boolean r7 = r0.zza(r1, (int) r10, (int) r8, (int) r12)
            if (r7 == 0) goto L_0x011d
            com.google.android.gms.internal.clearcut.zzef r7 = r0.zzad(r10)
            boolean r7 = zza((java.lang.Object) r1, (int) r11, (com.google.android.gms.internal.clearcut.zzef) r7)
            if (r7 != 0) goto L_0x011d
            return r6
        L_0x011d:
            int r7 = r15 + 1
            goto L_0x0012
        L_0x0121:
            boolean r2 = r0.zzmo
            if (r2 == 0) goto L_0x0133
            com.google.android.gms.internal.clearcut.zzbu<?> r2 = r0.zzmy
            com.google.android.gms.internal.clearcut.zzby r1 = r2.zza((java.lang.Object) r1)
            boolean r1 = r1.isInitialized()
            if (r1 != 0) goto L_0x0133
            r1 = 0
            return r1
        L_0x0133:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zzo(java.lang.Object):boolean");
    }
}
