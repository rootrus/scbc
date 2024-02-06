package com.google.android.gms.internal.measurement;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

final class zzha<T> implements zzhp<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzin.zzc();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgw zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final int[] zzl;
    private final int zzm;
    private final int zzn;
    private final zzhe zzo;
    private final zzgg zzp;
    private final zzih<?, ?> zzq;
    private final zzfd<?> zzr;
    private final zzgt zzs;

    private zzha(int[] iArr, Object[] objArr, int i, int i2, zzgw zzgw, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzhe zzhe, zzgg zzgg, zzih<?, ?> zzih, zzfd<?> zzfd, zzgt zzgt) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzgw instanceof zzfo;
        this.zzj = z;
        this.zzh = zzfd != null && zzfd.zza(zzgw);
        this.zzk = false;
        this.zzl = iArr2;
        this.zzm = i3;
        this.zzn = i4;
        this.zzo = zzhe;
        this.zzp = zzgg;
        this.zzq = zzih;
        this.zzr = zzfd;
        this.zzg = zzgw;
        this.zzs = zzgt;
    }

    private static boolean zzf(int i) {
        return (i & PKIFailureInfo.duplicateCertReq) != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:158:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0380  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.measurement.zzha<T> zza(java.lang.Class<T> r34, com.google.android.gms.internal.measurement.zzgu r35, com.google.android.gms.internal.measurement.zzhe r36, com.google.android.gms.internal.measurement.zzgg r37, com.google.android.gms.internal.measurement.zzih<?, ?> r38, com.google.android.gms.internal.measurement.zzfd<?> r39, com.google.android.gms.internal.measurement.zzgt r40) {
        /*
            r0 = r35
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzhn
            if (r1 == 0) goto L_0x03ff
            com.google.android.gms.internal.measurement.zzhn r0 = (com.google.android.gms.internal.measurement.zzhn) r0
            int r1 = r0.zza()
            int r2 = com.google.android.gms.internal.measurement.zzfo.zzf.zzi
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x0014
            r11 = r4
            goto L_0x0015
        L_0x0014:
            r11 = r3
        L_0x0015:
            java.lang.String r1 = r0.zzd()
            int r2 = r1.length()
            char r5 = r1.charAt(r3)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x0031
            r5 = r4
        L_0x0027:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0032
            r5 = r7
            goto L_0x0027
        L_0x0031:
            r7 = r4
        L_0x0032:
            int r5 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0051
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x003e:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x004e
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r7 = r7 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x003e
        L_0x004e:
            int r5 = r5 << r9
            r7 = r7 | r5
            r5 = r10
        L_0x0051:
            if (r7 != 0) goto L_0x005e
            int[] r7 = zza
            r9 = r3
            r10 = r9
            r12 = r10
            r13 = r12
            r15 = r13
            r14 = r7
            r7 = r15
            goto L_0x016f
        L_0x005e:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x007d
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x006a:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x007a
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r5 = r5 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L_0x006a
        L_0x007a:
            int r7 = r7 << r9
            r5 = r5 | r7
            r7 = r10
        L_0x007d:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x009c
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0089:
            int r12 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x0099
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r12
            goto L_0x0089
        L_0x0099:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r12
        L_0x009c:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x00bb
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00a8:
            int r13 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00b8
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r12
            r9 = r9 | r10
            int r12 = r12 + 13
            r10 = r13
            goto L_0x00a8
        L_0x00b8:
            int r10 = r10 << r12
            r9 = r9 | r10
            r10 = r13
        L_0x00bb:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00da
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00c7:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00d7
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r10 = r10 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00c7
        L_0x00d7:
            int r12 = r12 << r13
            r10 = r10 | r12
            r12 = r14
        L_0x00da:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00f9
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00e6:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x00f6
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00e6
        L_0x00f6:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00f9:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x011a
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0105:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x0116
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0105
        L_0x0116:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x011a:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x013d
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0126:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0138
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0126
        L_0x0138:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x013d:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0162
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r3 = r16
            r16 = 13
        L_0x014b:
            int r17 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r6) goto L_0x015d
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r16
            r15 = r15 | r3
            int r16 = r16 + 13
            r3 = r17
            goto L_0x014b
        L_0x015d:
            int r3 = r3 << r16
            r15 = r15 | r3
            r16 = r17
        L_0x0162:
            int r3 = r15 + r13
            int r3 = r3 + r14
            int[] r3 = new int[r3]
            int r14 = r5 << 1
            int r14 = r14 + r7
            r7 = r14
            r14 = r3
            r3 = r5
            r5 = r16
        L_0x016f:
            sun.misc.Unsafe r8 = zzb
            java.lang.Object[] r16 = r0.zze()
            com.google.android.gms.internal.measurement.zzgw r17 = r0.zzc()
            java.lang.Class r6 = r17.getClass()
            r17 = r5
            int r5 = r12 * 3
            int[] r5 = new int[r5]
            int r12 = r12 << r4
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r19 = r15 + r13
            r13 = r7
            r21 = r15
            r7 = r17
            r22 = r19
            r17 = 0
            r20 = 0
        L_0x0193:
            if (r7 >= r2) goto L_0x03d5
            int r23 = r7 + 1
            char r7 = r1.charAt(r7)
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r4) goto L_0x01c5
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r4 = r23
            r23 = 13
        L_0x01a6:
            int r25 = r4 + 1
            char r4 = r1.charAt(r4)
            r26 = r2
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r2) goto L_0x01bf
            r2 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r23
            r7 = r7 | r2
            int r23 = r23 + 13
            r4 = r25
            r2 = r26
            goto L_0x01a6
        L_0x01bf:
            int r2 = r4 << r23
            r7 = r7 | r2
            r2 = r25
            goto L_0x01c9
        L_0x01c5:
            r26 = r2
            r2 = r23
        L_0x01c9:
            int r4 = r2 + 1
            char r2 = r1.charAt(r2)
            r23 = r4
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r4) goto L_0x01fb
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r4 = r23
            r23 = 13
        L_0x01dc:
            int r25 = r4 + 1
            char r4 = r1.charAt(r4)
            r27 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r15) goto L_0x01f5
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r23
            r2 = r2 | r4
            int r23 = r23 + 13
            r4 = r25
            r15 = r27
            goto L_0x01dc
        L_0x01f5:
            int r4 = r4 << r23
            r2 = r2 | r4
            r4 = r25
            goto L_0x01ff
        L_0x01fb:
            r27 = r15
            r4 = r23
        L_0x01ff:
            r15 = r2 & 255(0xff, float:3.57E-43)
            r23 = r10
            r10 = r2 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L_0x020b
            r14[r20] = r17
            int r20 = r20 + 1
        L_0x020b:
            r10 = 51
            r29 = r9
            if (r15 < r10) goto L_0x029e
            int r10 = r4 + 1
            char r4 = r1.charAt(r4)
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r9) goto L_0x023a
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r31 = 13
        L_0x0220:
            int r32 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r9) goto L_0x0235
            r9 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r31
            r4 = r4 | r9
            int r31 = r31 + 13
            r10 = r32
            r9 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0220
        L_0x0235:
            int r9 = r10 << r31
            r4 = r4 | r9
            r10 = r32
        L_0x023a:
            int r9 = r15 + -51
            r31 = r10
            r10 = 9
            if (r9 == r10) goto L_0x025a
            r10 = 17
            if (r9 != r10) goto L_0x0247
            goto L_0x025a
        L_0x0247:
            r10 = 12
            if (r9 != r10) goto L_0x0258
            if (r11 != 0) goto L_0x0258
            int r9 = r17 / 3
            r10 = 1
            int r9 = r9 << r10
            int r9 = r9 + r10
            r10 = r16[r13]
            r12[r9] = r10
            int r13 = r13 + 1
        L_0x0258:
            r10 = 1
            goto L_0x0265
        L_0x025a:
            int r9 = r17 / 3
            r10 = 1
            int r9 = r9 << r10
            int r9 = r9 + r10
            r24 = r16[r13]
            r12[r9] = r24
            int r13 = r13 + 1
        L_0x0265:
            int r4 = r4 << r10
            r9 = r16[r4]
            boolean r10 = r9 instanceof java.lang.reflect.Field
            if (r10 == 0) goto L_0x026f
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x0277
        L_0x026f:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = zza((java.lang.Class<?>) r6, (java.lang.String) r9)
            r16[r4] = r9
        L_0x0277:
            long r9 = r8.objectFieldOffset(r9)
            int r9 = (int) r9
            int r4 = r4 + 1
            r10 = r16[r4]
            r25 = r9
            boolean r9 = r10 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L_0x0289
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10
            goto L_0x0291
        L_0x0289:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = zza((java.lang.Class<?>) r6, (java.lang.String) r10)
            r16[r4] = r10
        L_0x0291:
            long r9 = r8.objectFieldOffset(r10)
            int r4 = (int) r9
            r30 = r1
            r1 = r11
            r9 = r25
            r11 = 0
            goto L_0x0398
        L_0x029e:
            int r9 = r13 + 1
            r10 = r16[r13]
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = zza((java.lang.Class<?>) r6, (java.lang.String) r10)
            r13 = 9
            if (r15 == r13) goto L_0x0312
            r13 = 17
            if (r15 != r13) goto L_0x02b1
            goto L_0x0312
        L_0x02b1:
            r13 = 27
            if (r15 == r13) goto L_0x0303
            r13 = 49
            if (r15 != r13) goto L_0x02ba
            goto L_0x0303
        L_0x02ba:
            r13 = 12
            if (r15 == r13) goto L_0x02ef
            r13 = 30
            if (r15 == r13) goto L_0x02ef
            r13 = 44
            if (r15 != r13) goto L_0x02c7
            goto L_0x02ef
        L_0x02c7:
            r13 = 50
            if (r15 != r13) goto L_0x0320
            int r13 = r21 + 1
            r14[r21] = r17
            int r21 = r17 / 3
            r24 = 1
            int r21 = r21 << 1
            int r25 = r9 + 1
            r9 = r16[r9]
            r12[r21] = r9
            r9 = r2 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x02ea
            int r9 = r25 + 1
            int r21 = r21 + 1
            r25 = r16[r25]
            r12[r21] = r25
            r21 = r13
            goto L_0x0320
        L_0x02ea:
            r21 = r13
            r24 = 1
            goto L_0x0322
        L_0x02ef:
            if (r11 != 0) goto L_0x0300
            int r13 = r17 / 3
            int r25 = r9 + 1
            r24 = 1
            int r13 = r13 << 1
            int r13 = r13 + 1
            r9 = r16[r9]
            r12[r13] = r9
            goto L_0x0322
        L_0x0300:
            r24 = 1
            goto L_0x0320
        L_0x0303:
            r24 = 1
            int r13 = r17 / 3
            int r25 = r9 + 1
            int r13 = r13 << 1
            int r13 = r13 + 1
            r9 = r16[r9]
            r12[r13] = r9
            goto L_0x0322
        L_0x0312:
            r24 = 1
            int r13 = r17 / 3
            int r13 = r13 << 1
            int r13 = r13 + 1
            java.lang.Class r25 = r10.getType()
            r12[r13] = r25
        L_0x0320:
            r25 = r9
        L_0x0322:
            long r9 = r8.objectFieldOffset(r10)
            int r9 = (int) r9
            r10 = r2 & 4096(0x1000, float:5.74E-42)
            r13 = 4096(0x1000, float:5.74E-42)
            if (r10 != r13) goto L_0x0380
            r10 = 17
            if (r15 > r10) goto L_0x0380
            int r10 = r4 + 1
            char r4 = r1.charAt(r4)
            r13 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r13) goto L_0x0357
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r18 = 13
        L_0x0340:
            int r28 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r13) goto L_0x0352
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r18
            r4 = r4 | r10
            int r18 = r18 + 13
            r10 = r28
            goto L_0x0340
        L_0x0352:
            int r10 = r10 << r18
            r4 = r4 | r10
            r10 = r28
        L_0x0357:
            r18 = 1
            int r28 = r3 << 1
            int r18 = r4 / 32
            int r28 = r28 + r18
            r13 = r16[r28]
            r30 = r1
            boolean r1 = r13 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L_0x036a
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            goto L_0x0372
        L_0x036a:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = zza((java.lang.Class<?>) r6, (java.lang.String) r13)
            r16[r28] = r13
        L_0x0372:
            r28 = r10
            r1 = r11
            long r10 = r8.objectFieldOffset(r13)
            int r10 = (int) r10
            int r4 = r4 % 32
            r11 = r4
            r4 = r28
            goto L_0x0387
        L_0x0380:
            r30 = r1
            r1 = r11
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r11 = 0
        L_0x0387:
            r13 = 18
            if (r15 < r13) goto L_0x0393
            r13 = 49
            if (r15 > r13) goto L_0x0393
            r14[r22] = r9
            int r22 = r22 + 1
        L_0x0393:
            r31 = r4
            r4 = r10
            r13 = r25
        L_0x0398:
            int r10 = r17 + 1
            r5[r17] = r7
            int r7 = r10 + 1
            r17 = r3
            r3 = r2 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x03a7
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03a8
        L_0x03a7:
            r3 = 0
        L_0x03a8:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03af
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03b0
        L_0x03af:
            r2 = 0
        L_0x03b0:
            r2 = r2 | r3
            int r3 = r15 << 20
            r2 = r2 | r3
            r2 = r2 | r9
            r5[r10] = r2
            int r2 = r11 << 20
            r2 = r2 | r4
            r5[r7] = r2
            r2 = 1
            int r3 = r7 + 1
            r11 = r1
            r4 = r2
            r10 = r23
            r2 = r26
            r15 = r27
            r9 = r29
            r1 = r30
            r7 = r31
            r33 = r17
            r17 = r3
            r3 = r33
            goto L_0x0193
        L_0x03d5:
            r29 = r9
            r23 = r10
            r1 = r11
            r27 = r15
            com.google.android.gms.internal.measurement.zzha r2 = new com.google.android.gms.internal.measurement.zzha
            com.google.android.gms.internal.measurement.zzgw r10 = r0.zzc()
            r0 = 0
            r3 = r5
            r5 = r2
            r6 = r3
            r7 = r12
            r8 = r29
            r9 = r23
            r12 = r0
            r13 = r14
            r14 = r27
            r15 = r19
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r20 = r40
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r2
        L_0x03ff:
            com.google.android.gms.internal.measurement.zzia r0 = (com.google.android.gms.internal.measurement.zzia) r0
            r0.zza()
            int r0 = com.google.android.gms.internal.measurement.zzfo.zzf.zzi
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzha.zza(java.lang.Class, com.google.android.gms.internal.measurement.zzgu, com.google.android.gms.internal.measurement.zzhe, com.google.android.gms.internal.measurement.zzgg, com.google.android.gms.internal.measurement.zzih, com.google.android.gms.internal.measurement.zzfd, com.google.android.gms.internal.measurement.zzgt):com.google.android.gms.internal.measurement.zzha");
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    public final T zza() {
        return this.zzo.zza(this.zzg);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (com.google.android.gms.internal.measurement.zzhr.zza(com.google.android.gms.internal.measurement.zzin.zzf(r10, r6), com.google.android.gms.internal.measurement.zzin.zzf(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (com.google.android.gms.internal.measurement.zzin.zzb(r10, r6) == com.google.android.gms.internal.measurement.zzin.zzb(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (com.google.android.gms.internal.measurement.zzin.zzb(r10, r6) == com.google.android.gms.internal.measurement.zzin.zzb(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (com.google.android.gms.internal.measurement.zzhr.zza(com.google.android.gms.internal.measurement.zzin.zzf(r10, r6), com.google.android.gms.internal.measurement.zzin.zzf(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (com.google.android.gms.internal.measurement.zzhr.zza(com.google.android.gms.internal.measurement.zzin.zzf(r10, r6), com.google.android.gms.internal.measurement.zzin.zzf(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (com.google.android.gms.internal.measurement.zzhr.zza(com.google.android.gms.internal.measurement.zzin.zzf(r10, r6), com.google.android.gms.internal.measurement.zzin.zzf(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (com.google.android.gms.internal.measurement.zzin.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzin.zzc(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (com.google.android.gms.internal.measurement.zzin.zzb(r10, r6) == com.google.android.gms.internal.measurement.zzin.zzb(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (com.google.android.gms.internal.measurement.zzin.zzb(r10, r6) == com.google.android.gms.internal.measurement.zzin.zzb(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (com.google.android.gms.internal.measurement.zzin.zzb(r10, r6) == com.google.android.gms.internal.measurement.zzin.zzb(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzin.zzd(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzin.zzd(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzin.zze(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzin.zze(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.measurement.zzhr.zza(com.google.android.gms.internal.measurement.zzin.zzf(r10, r6), com.google.android.gms.internal.measurement.zzin.zzf(r11, r6)) != false) goto L_0x01c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.zzc
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01c9
            int r4 = r9.zzd((int) r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01a7;
                case 1: goto L_0x018e;
                case 2: goto L_0x017b;
                case 3: goto L_0x0168;
                case 4: goto L_0x0157;
                case 5: goto L_0x0144;
                case 6: goto L_0x0132;
                case 7: goto L_0x0120;
                case 8: goto L_0x010a;
                case 9: goto L_0x00f4;
                case 10: goto L_0x00de;
                case 11: goto L_0x00cc;
                case 12: goto L_0x00ba;
                case 13: goto L_0x00a8;
                case 14: goto L_0x0094;
                case 15: goto L_0x0082;
                case 16: goto L_0x006e;
                case 17: goto L_0x0058;
                case 18: goto L_0x004a;
                case 19: goto L_0x004a;
                case 20: goto L_0x004a;
                case 21: goto L_0x004a;
                case 22: goto L_0x004a;
                case 23: goto L_0x004a;
                case 24: goto L_0x004a;
                case 25: goto L_0x004a;
                case 26: goto L_0x004a;
                case 27: goto L_0x004a;
                case 28: goto L_0x004a;
                case 29: goto L_0x004a;
                case 30: goto L_0x004a;
                case 31: goto L_0x004a;
                case 32: goto L_0x004a;
                case 33: goto L_0x004a;
                case 34: goto L_0x004a;
                case 35: goto L_0x004a;
                case 36: goto L_0x004a;
                case 37: goto L_0x004a;
                case 38: goto L_0x004a;
                case 39: goto L_0x004a;
                case 40: goto L_0x004a;
                case 41: goto L_0x004a;
                case 42: goto L_0x004a;
                case 43: goto L_0x004a;
                case 44: goto L_0x004a;
                case 45: goto L_0x004a;
                case 46: goto L_0x004a;
                case 47: goto L_0x004a;
                case 48: goto L_0x004a;
                case 49: goto L_0x004a;
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
            goto L_0x01c2
        L_0x001c:
            int r4 = r9.zze((int) r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r10, (long) r4)
            int r4 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r11, (long) r4)
            if (r8 != r4) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzin.zzf(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.zzin.zzf(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.zzhr.zza((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x003c:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzin.zzf(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzin.zzf(r11, r6)
            boolean r3 = com.google.android.gms.internal.measurement.zzhr.zza((java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x01c2
        L_0x004a:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzin.zzf(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzin.zzf(r11, r6)
            boolean r3 = com.google.android.gms.internal.measurement.zzhr.zza((java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x01c2
        L_0x0058:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzin.zzf(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.zzin.zzf(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.zzhr.zza((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x006e:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.zzin.zzb(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.zzin.zzb(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0082:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0094:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.zzin.zzb(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.zzin.zzb(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00a8:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00ba:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00cc:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00de:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzin.zzf(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.zzin.zzf(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.zzhr.zza((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00f4:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzin.zzf(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.zzin.zzf(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.zzhr.zza((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x010a:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzin.zzf(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.zzin.zzf(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.zzhr.zza((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0120:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            boolean r4 = com.google.android.gms.internal.measurement.zzin.zzc(r10, r6)
            boolean r5 = com.google.android.gms.internal.measurement.zzin.zzc(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0132:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0144:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.zzin.zzb(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.zzin.zzb(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0157:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0168:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.zzin.zzb(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.zzin.zzb(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x017b:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.zzin.zzb(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.zzin.zzb(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x018e:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            float r4 = com.google.android.gms.internal.measurement.zzin.zzd(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = com.google.android.gms.internal.measurement.zzin.zzd(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x01a7:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            double r4 = com.google.android.gms.internal.measurement.zzin.zze(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = com.google.android.gms.internal.measurement.zzin.zze(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c2
        L_0x01c1:
            r3 = r1
        L_0x01c2:
            if (r3 != 0) goto L_0x01c5
            return r1
        L_0x01c5:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01c9:
            com.google.android.gms.internal.measurement.zzih<?, ?> r0 = r9.zzq
            java.lang.Object r0 = r0.zzb(r10)
            com.google.android.gms.internal.measurement.zzih<?, ?> r2 = r9.zzq
            java.lang.Object r2 = r2.zzb(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01dc
            return r1
        L_0x01dc:
            boolean r0 = r9.zzh
            if (r0 == 0) goto L_0x01f1
            com.google.android.gms.internal.measurement.zzfd<?> r0 = r9.zzr
            com.google.android.gms.internal.measurement.zzfe r10 = r0.zza((java.lang.Object) r10)
            com.google.android.gms.internal.measurement.zzfd<?> r0 = r9.zzr
            com.google.android.gms.internal.measurement.zzfe r11 = r0.zza((java.lang.Object) r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01f1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzha.zza(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c3, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0227, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0228, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(T r10) {
        /*
            r9 = this;
            int[] r0 = r9.zzc
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x022c
            int r3 = r9.zzd((int) r1)
            int[] r4 = r9.zzc
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 37
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r8
            int r3 = r3 >>> 20
            switch(r3) {
                case 0: goto L_0x0219;
                case 1: goto L_0x020e;
                case 2: goto L_0x0203;
                case 3: goto L_0x01f8;
                case 4: goto L_0x01f1;
                case 5: goto L_0x01e6;
                case 6: goto L_0x01df;
                case 7: goto L_0x01d4;
                case 8: goto L_0x01c7;
                case 9: goto L_0x01b9;
                case 10: goto L_0x01ad;
                case 11: goto L_0x01a5;
                case 12: goto L_0x019d;
                case 13: goto L_0x0195;
                case 14: goto L_0x0189;
                case 15: goto L_0x0181;
                case 16: goto L_0x0175;
                case 17: goto L_0x016a;
                case 18: goto L_0x015e;
                case 19: goto L_0x015e;
                case 20: goto L_0x015e;
                case 21: goto L_0x015e;
                case 22: goto L_0x015e;
                case 23: goto L_0x015e;
                case 24: goto L_0x015e;
                case 25: goto L_0x015e;
                case 26: goto L_0x015e;
                case 27: goto L_0x015e;
                case 28: goto L_0x015e;
                case 29: goto L_0x015e;
                case 30: goto L_0x015e;
                case 31: goto L_0x015e;
                case 32: goto L_0x015e;
                case 33: goto L_0x015e;
                case 34: goto L_0x015e;
                case 35: goto L_0x015e;
                case 36: goto L_0x015e;
                case 37: goto L_0x015e;
                case 38: goto L_0x015e;
                case 39: goto L_0x015e;
                case 40: goto L_0x015e;
                case 41: goto L_0x015e;
                case 42: goto L_0x015e;
                case 43: goto L_0x015e;
                case 44: goto L_0x015e;
                case 45: goto L_0x015e;
                case 46: goto L_0x015e;
                case 47: goto L_0x015e;
                case 48: goto L_0x015e;
                case 49: goto L_0x015e;
                case 50: goto L_0x0152;
                case 51: goto L_0x013c;
                case 52: goto L_0x012a;
                case 53: goto L_0x0118;
                case 54: goto L_0x0106;
                case 55: goto L_0x00f8;
                case 56: goto L_0x00e6;
                case 57: goto L_0x00d8;
                case 58: goto L_0x00c6;
                case 59: goto L_0x00b2;
                case 60: goto L_0x00a0;
                case 61: goto L_0x008e;
                case 62: goto L_0x0080;
                case 63: goto L_0x0072;
                case 64: goto L_0x0064;
                case 65: goto L_0x0052;
                case 66: goto L_0x0044;
                case 67: goto L_0x0032;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0228
        L_0x0020:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzin.zzf(r10, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x0032:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = zze(r10, r5)
            int r3 = com.google.android.gms.internal.measurement.zzfr.zza((long) r3)
            goto L_0x0227
        L_0x0044:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = zzd(r10, r5)
            goto L_0x0227
        L_0x0052:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = zze(r10, r5)
            int r3 = com.google.android.gms.internal.measurement.zzfr.zza((long) r3)
            goto L_0x0227
        L_0x0064:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = zzd(r10, r5)
            goto L_0x0227
        L_0x0072:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = zzd(r10, r5)
            goto L_0x0227
        L_0x0080:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = zzd(r10, r5)
            goto L_0x0227
        L_0x008e:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzin.zzf(r10, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00a0:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzin.zzf(r10, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00b2:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzin.zzf(r10, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00c6:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            boolean r3 = zzf(r10, r5)
            int r3 = com.google.android.gms.internal.measurement.zzfr.zza((boolean) r3)
            goto L_0x0227
        L_0x00d8:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = zzd(r10, r5)
            goto L_0x0227
        L_0x00e6:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = zze(r10, r5)
            int r3 = com.google.android.gms.internal.measurement.zzfr.zza((long) r3)
            goto L_0x0227
        L_0x00f8:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = zzd(r10, r5)
            goto L_0x0227
        L_0x0106:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = zze(r10, r5)
            int r3 = com.google.android.gms.internal.measurement.zzfr.zza((long) r3)
            goto L_0x0227
        L_0x0118:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = zze(r10, r5)
            int r3 = com.google.android.gms.internal.measurement.zzfr.zza((long) r3)
            goto L_0x0227
        L_0x012a:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            float r3 = zzc(r10, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x013c:
            boolean r3 = r9.zza(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            double r3 = zzb(r10, (long) r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.measurement.zzfr.zza((long) r3)
            goto L_0x0227
        L_0x0152:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzin.zzf(r10, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x015e:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzin.zzf(r10, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x016a:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzin.zzf(r10, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
            goto L_0x01c3
        L_0x0175:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.zzin.zzb(r10, r5)
            int r3 = com.google.android.gms.internal.measurement.zzfr.zza((long) r3)
            goto L_0x0227
        L_0x0181:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r10, (long) r5)
            goto L_0x0227
        L_0x0189:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.zzin.zzb(r10, r5)
            int r3 = com.google.android.gms.internal.measurement.zzfr.zza((long) r3)
            goto L_0x0227
        L_0x0195:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r10, (long) r5)
            goto L_0x0227
        L_0x019d:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r10, (long) r5)
            goto L_0x0227
        L_0x01a5:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r10, (long) r5)
            goto L_0x0227
        L_0x01ad:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzin.zzf(r10, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01b9:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzin.zzf(r10, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
        L_0x01c3:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0228
        L_0x01c7:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzin.zzf(r10, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01d4:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.measurement.zzin.zzc(r10, r5)
            int r3 = com.google.android.gms.internal.measurement.zzfr.zza((boolean) r3)
            goto L_0x0227
        L_0x01df:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r10, (long) r5)
            goto L_0x0227
        L_0x01e6:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.zzin.zzb(r10, r5)
            int r3 = com.google.android.gms.internal.measurement.zzfr.zza((long) r3)
            goto L_0x0227
        L_0x01f1:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r10, (long) r5)
            goto L_0x0227
        L_0x01f8:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.zzin.zzb(r10, r5)
            int r3 = com.google.android.gms.internal.measurement.zzfr.zza((long) r3)
            goto L_0x0227
        L_0x0203:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.zzin.zzb(r10, r5)
            int r3 = com.google.android.gms.internal.measurement.zzfr.zza((long) r3)
            goto L_0x0227
        L_0x020e:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.measurement.zzin.zzd(r10, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x0219:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.measurement.zzin.zze(r10, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.measurement.zzfr.zza((long) r3)
        L_0x0227:
            int r2 = r2 + r3
        L_0x0228:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022c:
            int r2 = r2 * 53
            com.google.android.gms.internal.measurement.zzih<?, ?> r0 = r9.zzq
            java.lang.Object r0 = r0.zzb(r10)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r9.zzh
            if (r0 == 0) goto L_0x024a
            int r2 = r2 * 53
            com.google.android.gms.internal.measurement.zzfd<?> r0 = r9.zzr
            com.google.android.gms.internal.measurement.zzfe r10 = r0.zza((java.lang.Object) r10)
            int r10 = r10.hashCode()
            int r2 = r2 + r10
        L_0x024a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzha.zza(java.lang.Object):int");
    }

    public final void zzb(T t, T t2) {
        if (t2 != null) {
            for (int i = 0; i < this.zzc.length; i += 3) {
                int zzd2 = zzd(i);
                long j = (long) (1048575 & zzd2);
                int i2 = this.zzc[i];
                switch ((zzd2 & 267386880) >>> 20) {
                    case 0:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zzin.zza((Object) t, j, zzin.zze(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 1:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zzin.zza((Object) t, j, zzin.zzd(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 2:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zzin.zza((Object) t, j, zzin.zzb(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 3:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zzin.zza((Object) t, j, zzin.zzb(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 4:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zzin.zza((Object) t, j, zzin.zza((Object) t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 5:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zzin.zza((Object) t, j, zzin.zzb(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 6:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zzin.zza((Object) t, j, zzin.zza((Object) t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 7:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zzin.zza((Object) t, j, zzin.zzc(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 8:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zzin.zza((Object) t, j, zzin.zzf(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 9:
                        zza(t, t2, i);
                        break;
                    case 10:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zzin.zza((Object) t, j, zzin.zzf(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 11:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zzin.zza((Object) t, j, zzin.zza((Object) t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 12:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zzin.zza((Object) t, j, zzin.zza((Object) t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 13:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zzin.zza((Object) t, j, zzin.zza((Object) t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 14:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zzin.zza((Object) t, j, zzin.zzb(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 15:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zzin.zza((Object) t, j, zzin.zza((Object) t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 16:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zzin.zza((Object) t, j, zzin.zzb(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 17:
                        zza(t, t2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.zzp.zza(t, t2, j);
                        break;
                    case 50:
                        zzhr.zza(this.zzs, t, t2, j);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!zza(t2, i2, i)) {
                            break;
                        } else {
                            zzin.zza((Object) t, j, zzin.zzf(t2, j));
                            zzb(t, i2, i);
                            break;
                        }
                    case 60:
                        zzb(t, t2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!zza(t2, i2, i)) {
                            break;
                        } else {
                            zzin.zza((Object) t, j, zzin.zzf(t2, j));
                            zzb(t, i2, i);
                            break;
                        }
                    case 68:
                        zzb(t, t2, i);
                        break;
                }
            }
            zzhr.zza(this.zzq, t, t2);
            if (this.zzh) {
                zzhr.zza(this.zzr, t, t2);
                return;
            }
            return;
        }
        throw null;
    }

    private final void zza(T t, T t2, int i) {
        long zzd2 = (long) (zzd(i) & 1048575);
        if (zza(t2, i)) {
            Object zzf2 = zzin.zzf(t, zzd2);
            Object zzf3 = zzin.zzf(t2, zzd2);
            if (zzf2 != null && zzf3 != null) {
                zzin.zza((Object) t, zzd2, zzfr.zza(zzf2, zzf3));
                zzb(t, i);
            } else if (zzf3 != null) {
                zzin.zza((Object) t, zzd2, zzf3);
                zzb(t, i);
            }
        }
    }

    private final void zzb(T t, T t2, int i) {
        int zzd2 = zzd(i);
        int i2 = this.zzc[i];
        long j = (long) (zzd2 & 1048575);
        if (zza(t2, i2, i)) {
            Object zzf2 = zzin.zzf(t, j);
            Object zzf3 = zzin.zzf(t2, j);
            if (zzf2 != null && zzf3 != null) {
                zzin.zza((Object) t, j, zzfr.zza(zzf2, zzf3));
                zzb(t, i2, i);
            } else if (zzf3 != null) {
                zzin.zza((Object) t, j, zzf3);
                zzb(t, i2, i);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0839, code lost:
        r9 = (r9 + r10) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0906, code lost:
        r5 = r5 + r4;
        r4 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x095c, code lost:
        r5 = r5 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x09c9, code lost:
        r9 = false;
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0a0a, code lost:
        r5 = r5 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0a2d, code lost:
        r3 = r3 + 3;
        r11 = r4;
        r4 = r9;
        r9 = r13;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(T r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r0.zzj
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x04fb
            sun.misc.Unsafe r2 = zzb
            r12 = r11
            r13 = r12
        L_0x0016:
            int[] r14 = r0.zzc
            int r14 = r14.length
            if (r12 >= r14) goto L_0x04f3
            int r14 = r0.zzd((int) r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.zzc
            r3 = r3[r12]
            r14 = r14 & r8
            long r5 = (long) r14
            com.google.android.gms.internal.measurement.zzfj r14 = com.google.android.gms.internal.measurement.zzfj.DOUBLE_LIST_PACKED
            int r14 = r14.zza()
            if (r15 < r14) goto L_0x0041
            com.google.android.gms.internal.measurement.zzfj r14 = com.google.android.gms.internal.measurement.zzfj.SINT64_LIST_PACKED
            int r14 = r14.zza()
            if (r15 > r14) goto L_0x0041
            int[] r14 = r0.zzc
            int r17 = r12 + 2
            r14 = r14[r17]
            r14 = r14 & r8
            goto L_0x0042
        L_0x0041:
            r14 = r11
        L_0x0042:
            switch(r15) {
                case 0: goto L_0x04e0;
                case 1: goto L_0x04d5;
                case 2: goto L_0x04c6;
                case 3: goto L_0x04b7;
                case 4: goto L_0x04a8;
                case 5: goto L_0x049d;
                case 6: goto L_0x0492;
                case 7: goto L_0x0487;
                case 8: goto L_0x046a;
                case 9: goto L_0x0456;
                case 10: goto L_0x0444;
                case 11: goto L_0x0434;
                case 12: goto L_0x0424;
                case 13: goto L_0x0418;
                case 14: goto L_0x040c;
                case 15: goto L_0x03fc;
                case 16: goto L_0x03ec;
                case 17: goto L_0x03d6;
                case 18: goto L_0x03cc;
                case 19: goto L_0x03c2;
                case 20: goto L_0x03b8;
                case 21: goto L_0x03ae;
                case 22: goto L_0x03a4;
                case 23: goto L_0x039a;
                case 24: goto L_0x0390;
                case 25: goto L_0x0386;
                case 26: goto L_0x037c;
                case 27: goto L_0x036e;
                case 28: goto L_0x0364;
                case 29: goto L_0x035a;
                case 30: goto L_0x0350;
                case 31: goto L_0x0346;
                case 32: goto L_0x033c;
                case 33: goto L_0x0332;
                case 34: goto L_0x0328;
                case 35: goto L_0x0308;
                case 36: goto L_0x02eb;
                case 37: goto L_0x02ce;
                case 38: goto L_0x02b1;
                case 39: goto L_0x0293;
                case 40: goto L_0x0275;
                case 41: goto L_0x0257;
                case 42: goto L_0x0239;
                case 43: goto L_0x021b;
                case 44: goto L_0x01fd;
                case 45: goto L_0x01df;
                case 46: goto L_0x01c1;
                case 47: goto L_0x01a3;
                case 48: goto L_0x0185;
                case 49: goto L_0x0177;
                case 50: goto L_0x0167;
                case 51: goto L_0x0159;
                case 52: goto L_0x014d;
                case 53: goto L_0x013d;
                case 54: goto L_0x012d;
                case 55: goto L_0x011d;
                case 56: goto L_0x0111;
                case 57: goto L_0x0105;
                case 58: goto L_0x00f9;
                case 59: goto L_0x00db;
                case 60: goto L_0x00c7;
                case 61: goto L_0x00b5;
                case 62: goto L_0x00a5;
                case 63: goto L_0x0095;
                case 64: goto L_0x0089;
                case 65: goto L_0x007d;
                case 66: goto L_0x006d;
                case 67: goto L_0x005d;
                case 68: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x04ed
        L_0x0047:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04ed
            java.lang.Object r5 = com.google.android.gms.internal.measurement.zzin.zzf(r1, r5)
            com.google.android.gms.internal.measurement.zzgw r5 = (com.google.android.gms.internal.measurement.zzgw) r5
            com.google.android.gms.internal.measurement.zzhp r6 = r0.zza((int) r12)
            int r3 = com.google.android.gms.internal.measurement.zzev.zzc(r3, r5, r6)
            goto L_0x04ec
        L_0x005d:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04ed
            long r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzev.zzf((int) r3, (long) r5)
            goto L_0x04ec
        L_0x006d:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04ed
            int r5 = zzd(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzev.zzh((int) r3, (int) r5)
            goto L_0x04ec
        L_0x007d:
            boolean r5 = r0.zza(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04ed
            int r3 = com.google.android.gms.internal.measurement.zzev.zzh((int) r3, (long) r9)
            goto L_0x04ec
        L_0x0089:
            boolean r5 = r0.zza(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04ed
            int r3 = com.google.android.gms.internal.measurement.zzev.zzj(r3, r11)
            goto L_0x04ec
        L_0x0095:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04ed
            int r5 = zzd(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzev.zzk(r3, r5)
            goto L_0x04ec
        L_0x00a5:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04ed
            int r5 = zzd(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzev.zzg((int) r3, (int) r5)
            goto L_0x04ec
        L_0x00b5:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04ed
            java.lang.Object r5 = com.google.android.gms.internal.measurement.zzin.zzf(r1, r5)
            com.google.android.gms.internal.measurement.zzeg r5 = (com.google.android.gms.internal.measurement.zzeg) r5
            int r3 = com.google.android.gms.internal.measurement.zzev.zzc((int) r3, (com.google.android.gms.internal.measurement.zzeg) r5)
            goto L_0x04ec
        L_0x00c7:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04ed
            java.lang.Object r5 = com.google.android.gms.internal.measurement.zzin.zzf(r1, r5)
            com.google.android.gms.internal.measurement.zzhp r6 = r0.zza((int) r12)
            int r3 = com.google.android.gms.internal.measurement.zzhr.zza((int) r3, (java.lang.Object) r5, (com.google.android.gms.internal.measurement.zzhp) r6)
            goto L_0x04ec
        L_0x00db:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04ed
            java.lang.Object r5 = com.google.android.gms.internal.measurement.zzin.zzf(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.measurement.zzeg
            if (r6 == 0) goto L_0x00f1
            com.google.android.gms.internal.measurement.zzeg r5 = (com.google.android.gms.internal.measurement.zzeg) r5
            int r3 = com.google.android.gms.internal.measurement.zzev.zzc((int) r3, (com.google.android.gms.internal.measurement.zzeg) r5)
            goto L_0x04ec
        L_0x00f1:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.measurement.zzev.zzb((int) r3, (java.lang.String) r5)
            goto L_0x04ec
        L_0x00f9:
            boolean r5 = r0.zza(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04ed
            int r3 = com.google.android.gms.internal.measurement.zzev.zzb((int) r3, (boolean) r7)
            goto L_0x04ec
        L_0x0105:
            boolean r5 = r0.zza(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04ed
            int r3 = com.google.android.gms.internal.measurement.zzev.zzi(r3, r11)
            goto L_0x04ec
        L_0x0111:
            boolean r5 = r0.zza(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04ed
            int r3 = com.google.android.gms.internal.measurement.zzev.zzg((int) r3, (long) r9)
            goto L_0x04ec
        L_0x011d:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04ed
            int r5 = zzd(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzev.zzf((int) r3, (int) r5)
            goto L_0x04ec
        L_0x012d:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04ed
            long r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzev.zze((int) r3, (long) r5)
            goto L_0x04ec
        L_0x013d:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04ed
            long r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzev.zzd((int) r3, (long) r5)
            goto L_0x04ec
        L_0x014d:
            boolean r5 = r0.zza(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04ed
            int r3 = com.google.android.gms.internal.measurement.zzev.zzb((int) r3, (float) r4)
            goto L_0x04ec
        L_0x0159:
            boolean r5 = r0.zza(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04ed
            r5 = 0
            int r3 = com.google.android.gms.internal.measurement.zzev.zzb((int) r3, (double) r5)
            goto L_0x04ec
        L_0x0167:
            com.google.android.gms.internal.measurement.zzgt r14 = r0.zzs
            java.lang.Object r5 = com.google.android.gms.internal.measurement.zzin.zzf(r1, r5)
            java.lang.Object r6 = r0.zzb((int) r12)
            int r3 = r14.zza(r3, r5, r6)
            goto L_0x04ec
        L_0x0177:
            java.util.List r5 = zza((java.lang.Object) r1, (long) r5)
            com.google.android.gms.internal.measurement.zzhp r6 = r0.zza((int) r12)
            int r3 = com.google.android.gms.internal.measurement.zzhr.zzb((int) r3, (java.util.List<com.google.android.gms.internal.measurement.zzgw>) r5, (com.google.android.gms.internal.measurement.zzhp) r6)
            goto L_0x04ec
        L_0x0185:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.zzhr.zzc(r5)
            if (r5 <= 0) goto L_0x04ed
            boolean r6 = r0.zzk
            if (r6 == 0) goto L_0x0199
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0199:
            int r3 = com.google.android.gms.internal.measurement.zzev.zze((int) r3)
            int r6 = com.google.android.gms.internal.measurement.zzev.zzg((int) r5)
            goto L_0x0324
        L_0x01a3:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.zzhr.zzg(r5)
            if (r5 <= 0) goto L_0x04ed
            boolean r6 = r0.zzk
            if (r6 == 0) goto L_0x01b7
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01b7:
            int r3 = com.google.android.gms.internal.measurement.zzev.zze((int) r3)
            int r6 = com.google.android.gms.internal.measurement.zzev.zzg((int) r5)
            goto L_0x0324
        L_0x01c1:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.zzhr.zzi(r5)
            if (r5 <= 0) goto L_0x04ed
            boolean r6 = r0.zzk
            if (r6 == 0) goto L_0x01d5
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01d5:
            int r3 = com.google.android.gms.internal.measurement.zzev.zze((int) r3)
            int r6 = com.google.android.gms.internal.measurement.zzev.zzg((int) r5)
            goto L_0x0324
        L_0x01df:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.zzhr.zzh(r5)
            if (r5 <= 0) goto L_0x04ed
            boolean r6 = r0.zzk
            if (r6 == 0) goto L_0x01f3
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01f3:
            int r3 = com.google.android.gms.internal.measurement.zzev.zze((int) r3)
            int r6 = com.google.android.gms.internal.measurement.zzev.zzg((int) r5)
            goto L_0x0324
        L_0x01fd:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.zzhr.zzd(r5)
            if (r5 <= 0) goto L_0x04ed
            boolean r6 = r0.zzk
            if (r6 == 0) goto L_0x0211
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0211:
            int r3 = com.google.android.gms.internal.measurement.zzev.zze((int) r3)
            int r6 = com.google.android.gms.internal.measurement.zzev.zzg((int) r5)
            goto L_0x0324
        L_0x021b:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.zzhr.zzf(r5)
            if (r5 <= 0) goto L_0x04ed
            boolean r6 = r0.zzk
            if (r6 == 0) goto L_0x022f
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x022f:
            int r3 = com.google.android.gms.internal.measurement.zzev.zze((int) r3)
            int r6 = com.google.android.gms.internal.measurement.zzev.zzg((int) r5)
            goto L_0x0324
        L_0x0239:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.zzhr.zzj(r5)
            if (r5 <= 0) goto L_0x04ed
            boolean r6 = r0.zzk
            if (r6 == 0) goto L_0x024d
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x024d:
            int r3 = com.google.android.gms.internal.measurement.zzev.zze((int) r3)
            int r6 = com.google.android.gms.internal.measurement.zzev.zzg((int) r5)
            goto L_0x0324
        L_0x0257:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.zzhr.zzh(r5)
            if (r5 <= 0) goto L_0x04ed
            boolean r6 = r0.zzk
            if (r6 == 0) goto L_0x026b
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x026b:
            int r3 = com.google.android.gms.internal.measurement.zzev.zze((int) r3)
            int r6 = com.google.android.gms.internal.measurement.zzev.zzg((int) r5)
            goto L_0x0324
        L_0x0275:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.zzhr.zzi(r5)
            if (r5 <= 0) goto L_0x04ed
            boolean r6 = r0.zzk
            if (r6 == 0) goto L_0x0289
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0289:
            int r3 = com.google.android.gms.internal.measurement.zzev.zze((int) r3)
            int r6 = com.google.android.gms.internal.measurement.zzev.zzg((int) r5)
            goto L_0x0324
        L_0x0293:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.zzhr.zze(r5)
            if (r5 <= 0) goto L_0x04ed
            boolean r6 = r0.zzk
            if (r6 == 0) goto L_0x02a7
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02a7:
            int r3 = com.google.android.gms.internal.measurement.zzev.zze((int) r3)
            int r6 = com.google.android.gms.internal.measurement.zzev.zzg((int) r5)
            goto L_0x0324
        L_0x02b1:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.zzhr.zzb(r5)
            if (r5 <= 0) goto L_0x04ed
            boolean r6 = r0.zzk
            if (r6 == 0) goto L_0x02c5
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02c5:
            int r3 = com.google.android.gms.internal.measurement.zzev.zze((int) r3)
            int r6 = com.google.android.gms.internal.measurement.zzev.zzg((int) r5)
            goto L_0x0324
        L_0x02ce:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.zzhr.zza((java.util.List<java.lang.Long>) r5)
            if (r5 <= 0) goto L_0x04ed
            boolean r6 = r0.zzk
            if (r6 == 0) goto L_0x02e2
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02e2:
            int r3 = com.google.android.gms.internal.measurement.zzev.zze((int) r3)
            int r6 = com.google.android.gms.internal.measurement.zzev.zzg((int) r5)
            goto L_0x0324
        L_0x02eb:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.zzhr.zzh(r5)
            if (r5 <= 0) goto L_0x04ed
            boolean r6 = r0.zzk
            if (r6 == 0) goto L_0x02ff
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02ff:
            int r3 = com.google.android.gms.internal.measurement.zzev.zze((int) r3)
            int r6 = com.google.android.gms.internal.measurement.zzev.zzg((int) r5)
            goto L_0x0324
        L_0x0308:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.zzhr.zzi(r5)
            if (r5 <= 0) goto L_0x04ed
            boolean r6 = r0.zzk
            if (r6 == 0) goto L_0x031c
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x031c:
            int r3 = com.google.android.gms.internal.measurement.zzev.zze((int) r3)
            int r6 = com.google.android.gms.internal.measurement.zzev.zzg((int) r5)
        L_0x0324:
            int r3 = r3 + r6
            int r3 = r3 + r5
            goto L_0x04ec
        L_0x0328:
            java.util.List r5 = zza((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.zzhr.zzc(r3, r5, r11)
            goto L_0x04ec
        L_0x0332:
            java.util.List r5 = zza((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.zzhr.zzg(r3, r5, r11)
            goto L_0x04ec
        L_0x033c:
            java.util.List r5 = zza((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.zzhr.zzi(r3, r5, r11)
            goto L_0x04ec
        L_0x0346:
            java.util.List r5 = zza((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.zzhr.zzh(r3, r5, r11)
            goto L_0x04ec
        L_0x0350:
            java.util.List r5 = zza((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.zzhr.zzd(r3, r5, r11)
            goto L_0x04ec
        L_0x035a:
            java.util.List r5 = zza((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.zzhr.zzf(r3, r5, r11)
            goto L_0x04ec
        L_0x0364:
            java.util.List r5 = zza((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.zzhr.zzb(r3, r5)
            goto L_0x04ec
        L_0x036e:
            java.util.List r5 = zza((java.lang.Object) r1, (long) r5)
            com.google.android.gms.internal.measurement.zzhp r6 = r0.zza((int) r12)
            int r3 = com.google.android.gms.internal.measurement.zzhr.zza((int) r3, (java.util.List<?>) r5, (com.google.android.gms.internal.measurement.zzhp) r6)
            goto L_0x04ec
        L_0x037c:
            java.util.List r5 = zza((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.zzhr.zza((int) r3, (java.util.List<?>) r5)
            goto L_0x04ec
        L_0x0386:
            java.util.List r5 = zza((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.zzhr.zzj(r3, r5, r11)
            goto L_0x04ec
        L_0x0390:
            java.util.List r5 = zza((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.zzhr.zzh(r3, r5, r11)
            goto L_0x04ec
        L_0x039a:
            java.util.List r5 = zza((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.zzhr.zzi(r3, r5, r11)
            goto L_0x04ec
        L_0x03a4:
            java.util.List r5 = zza((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.zzhr.zze(r3, r5, r11)
            goto L_0x04ec
        L_0x03ae:
            java.util.List r5 = zza((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.zzhr.zzb((int) r3, (java.util.List<java.lang.Long>) r5, (boolean) r11)
            goto L_0x04ec
        L_0x03b8:
            java.util.List r5 = zza((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.zzhr.zza((int) r3, (java.util.List<java.lang.Long>) r5, (boolean) r11)
            goto L_0x04ec
        L_0x03c2:
            java.util.List r5 = zza((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.zzhr.zzh(r3, r5, r11)
            goto L_0x04ec
        L_0x03cc:
            java.util.List r5 = zza((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.zzhr.zzi(r3, r5, r11)
            goto L_0x04ec
        L_0x03d6:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x04ed
            java.lang.Object r5 = com.google.android.gms.internal.measurement.zzin.zzf(r1, r5)
            com.google.android.gms.internal.measurement.zzgw r5 = (com.google.android.gms.internal.measurement.zzgw) r5
            com.google.android.gms.internal.measurement.zzhp r6 = r0.zza((int) r12)
            int r3 = com.google.android.gms.internal.measurement.zzev.zzc(r3, r5, r6)
            goto L_0x04ec
        L_0x03ec:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x04ed
            long r5 = com.google.android.gms.internal.measurement.zzin.zzb(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzev.zzf((int) r3, (long) r5)
            goto L_0x04ec
        L_0x03fc:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x04ed
            int r5 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.zzev.zzh((int) r3, (int) r5)
            goto L_0x04ec
        L_0x040c:
            boolean r5 = r0.zza(r1, (int) r12)
            if (r5 == 0) goto L_0x04ed
            int r3 = com.google.android.gms.internal.measurement.zzev.zzh((int) r3, (long) r9)
            goto L_0x04ec
        L_0x0418:
            boolean r5 = r0.zza(r1, (int) r12)
            if (r5 == 0) goto L_0x04ed
            int r3 = com.google.android.gms.internal.measurement.zzev.zzj(r3, r11)
            goto L_0x04ec
        L_0x0424:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x04ed
            int r5 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.zzev.zzk(r3, r5)
            goto L_0x04ec
        L_0x0434:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x04ed
            int r5 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.zzev.zzg((int) r3, (int) r5)
            goto L_0x04ec
        L_0x0444:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x04ed
            java.lang.Object r5 = com.google.android.gms.internal.measurement.zzin.zzf(r1, r5)
            com.google.android.gms.internal.measurement.zzeg r5 = (com.google.android.gms.internal.measurement.zzeg) r5
            int r3 = com.google.android.gms.internal.measurement.zzev.zzc((int) r3, (com.google.android.gms.internal.measurement.zzeg) r5)
            goto L_0x04ec
        L_0x0456:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x04ed
            java.lang.Object r5 = com.google.android.gms.internal.measurement.zzin.zzf(r1, r5)
            com.google.android.gms.internal.measurement.zzhp r6 = r0.zza((int) r12)
            int r3 = com.google.android.gms.internal.measurement.zzhr.zza((int) r3, (java.lang.Object) r5, (com.google.android.gms.internal.measurement.zzhp) r6)
            goto L_0x04ec
        L_0x046a:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x04ed
            java.lang.Object r5 = com.google.android.gms.internal.measurement.zzin.zzf(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.measurement.zzeg
            if (r6 == 0) goto L_0x0480
            com.google.android.gms.internal.measurement.zzeg r5 = (com.google.android.gms.internal.measurement.zzeg) r5
            int r3 = com.google.android.gms.internal.measurement.zzev.zzc((int) r3, (com.google.android.gms.internal.measurement.zzeg) r5)
            goto L_0x04ec
        L_0x0480:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.measurement.zzev.zzb((int) r3, (java.lang.String) r5)
            goto L_0x04ec
        L_0x0487:
            boolean r5 = r0.zza(r1, (int) r12)
            if (r5 == 0) goto L_0x04ed
            int r3 = com.google.android.gms.internal.measurement.zzev.zzb((int) r3, (boolean) r7)
            goto L_0x04ec
        L_0x0492:
            boolean r5 = r0.zza(r1, (int) r12)
            if (r5 == 0) goto L_0x04ed
            int r3 = com.google.android.gms.internal.measurement.zzev.zzi(r3, r11)
            goto L_0x04ec
        L_0x049d:
            boolean r5 = r0.zza(r1, (int) r12)
            if (r5 == 0) goto L_0x04ed
            int r3 = com.google.android.gms.internal.measurement.zzev.zzg((int) r3, (long) r9)
            goto L_0x04ec
        L_0x04a8:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x04ed
            int r5 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.zzev.zzf((int) r3, (int) r5)
            goto L_0x04ec
        L_0x04b7:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x04ed
            long r5 = com.google.android.gms.internal.measurement.zzin.zzb(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzev.zze((int) r3, (long) r5)
            goto L_0x04ec
        L_0x04c6:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x04ed
            long r5 = com.google.android.gms.internal.measurement.zzin.zzb(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzev.zzd((int) r3, (long) r5)
            goto L_0x04ec
        L_0x04d5:
            boolean r5 = r0.zza(r1, (int) r12)
            if (r5 == 0) goto L_0x04ed
            int r3 = com.google.android.gms.internal.measurement.zzev.zzb((int) r3, (float) r4)
            goto L_0x04ec
        L_0x04e0:
            boolean r5 = r0.zza(r1, (int) r12)
            if (r5 == 0) goto L_0x04ed
            r5 = 0
            int r3 = com.google.android.gms.internal.measurement.zzev.zzb((int) r3, (double) r5)
        L_0x04ec:
            int r13 = r13 + r3
        L_0x04ed:
            int r12 = r12 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x04f3:
            com.google.android.gms.internal.measurement.zzih<?, ?> r2 = r0.zzq
            int r1 = zza(r2, r1)
            int r13 = r13 + r1
            return r13
        L_0x04fb:
            sun.misc.Unsafe r2 = zzb
            r6 = r8
            r3 = r11
            r5 = r3
            r12 = r5
        L_0x0501:
            int[] r13 = r0.zzc
            int r13 = r13.length
            if (r3 >= r13) goto L_0x0a34
            int r13 = r0.zzd((int) r3)
            int[] r14 = r0.zzc
            r15 = r14[r3]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r13 & r16
            int r4 = r17 >>> 20
            r11 = 17
            if (r4 > r11) goto L_0x052b
            int r11 = r3 + 2
            r11 = r14[r11]
            r14 = r11 & r8
            int r18 = r11 >>> 20
            int r18 = r7 << r18
            if (r14 == r6) goto L_0x054b
            long r9 = (long) r14
            int r12 = r2.getInt(r1, r9)
            r6 = r14
            goto L_0x054b
        L_0x052b:
            boolean r9 = r0.zzk
            if (r9 == 0) goto L_0x0547
            com.google.android.gms.internal.measurement.zzfj r9 = com.google.android.gms.internal.measurement.zzfj.DOUBLE_LIST_PACKED
            int r9 = r9.zza()
            if (r4 < r9) goto L_0x0547
            com.google.android.gms.internal.measurement.zzfj r9 = com.google.android.gms.internal.measurement.zzfj.SINT64_LIST_PACKED
            int r9 = r9.zza()
            if (r4 > r9) goto L_0x0547
            int[] r9 = r0.zzc
            int r10 = r3 + 2
            r9 = r9[r10]
            r9 = r9 & r8
            goto L_0x0548
        L_0x0547:
            r9 = 0
        L_0x0548:
            r11 = r9
            r18 = 0
        L_0x054b:
            r9 = r13 & r8
            long r9 = (long) r9
            switch(r4) {
                case 0: goto L_0x0a1b;
                case 1: goto L_0x0a0d;
                case 2: goto L_0x09fb;
                case 3: goto L_0x09eb;
                case 4: goto L_0x09db;
                case 5: goto L_0x09cf;
                case 6: goto L_0x09bd;
                case 7: goto L_0x09b3;
                case 8: goto L_0x0999;
                case 9: goto L_0x0988;
                case 10: goto L_0x0979;
                case 11: goto L_0x096c;
                case 12: goto L_0x095f;
                case 13: goto L_0x0953;
                case 14: goto L_0x0947;
                case 15: goto L_0x0939;
                case 16: goto L_0x092b;
                case 17: goto L_0x0917;
                case 18: goto L_0x090a;
                case 19: goto L_0x08fb;
                case 20: goto L_0x08ef;
                case 21: goto L_0x08e3;
                case 22: goto L_0x08d7;
                case 23: goto L_0x08cb;
                case 24: goto L_0x08bf;
                case 25: goto L_0x08b3;
                case 26: goto L_0x08a7;
                case 27: goto L_0x0897;
                case 28: goto L_0x088b;
                case 29: goto L_0x087e;
                case 30: goto L_0x0871;
                case 31: goto L_0x0864;
                case 32: goto L_0x0857;
                case 33: goto L_0x084a;
                case 34: goto L_0x083d;
                case 35: goto L_0x081d;
                case 36: goto L_0x0800;
                case 37: goto L_0x07e3;
                case 38: goto L_0x07c6;
                case 39: goto L_0x07a8;
                case 40: goto L_0x078a;
                case 41: goto L_0x076c;
                case 42: goto L_0x074e;
                case 43: goto L_0x0730;
                case 44: goto L_0x0712;
                case 45: goto L_0x06f4;
                case 46: goto L_0x06d6;
                case 47: goto L_0x06b8;
                case 48: goto L_0x069a;
                case 49: goto L_0x068a;
                case 50: goto L_0x067a;
                case 51: goto L_0x066c;
                case 52: goto L_0x065f;
                case 53: goto L_0x064f;
                case 54: goto L_0x063f;
                case 55: goto L_0x062f;
                case 56: goto L_0x0621;
                case 57: goto L_0x0614;
                case 58: goto L_0x0608;
                case 59: goto L_0x05ea;
                case 60: goto L_0x05d6;
                case 61: goto L_0x05c4;
                case 62: goto L_0x05b4;
                case 63: goto L_0x05a4;
                case 64: goto L_0x0597;
                case 65: goto L_0x0589;
                case 66: goto L_0x0579;
                case 67: goto L_0x0569;
                case 68: goto L_0x0553;
                default: goto L_0x0551;
            }
        L_0x0551:
            goto L_0x09c8
        L_0x0553:
            boolean r4 = r0.zza(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x09c8
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.measurement.zzgw r4 = (com.google.android.gms.internal.measurement.zzgw) r4
            com.google.android.gms.internal.measurement.zzhp r9 = r0.zza((int) r3)
            int r4 = com.google.android.gms.internal.measurement.zzev.zzc(r15, r4, r9)
            goto L_0x09bb
        L_0x0569:
            boolean r4 = r0.zza(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x09c8
            long r9 = zze(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.zzev.zzf((int) r15, (long) r9)
            goto L_0x09bb
        L_0x0579:
            boolean r4 = r0.zza(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x09c8
            int r4 = zzd(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.zzev.zzh((int) r15, (int) r4)
            goto L_0x09bb
        L_0x0589:
            boolean r4 = r0.zza(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x09c8
            r9 = 0
            int r4 = com.google.android.gms.internal.measurement.zzev.zzh((int) r15, (long) r9)
            goto L_0x09bb
        L_0x0597:
            boolean r4 = r0.zza(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x09c8
            r4 = 0
            int r9 = com.google.android.gms.internal.measurement.zzev.zzj(r15, r4)
            goto L_0x095c
        L_0x05a4:
            boolean r4 = r0.zza(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x09c8
            int r4 = zzd(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.zzev.zzk(r15, r4)
            goto L_0x09bb
        L_0x05b4:
            boolean r4 = r0.zza(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x09c8
            int r4 = zzd(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.zzev.zzg((int) r15, (int) r4)
            goto L_0x09bb
        L_0x05c4:
            boolean r4 = r0.zza(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x09c8
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.measurement.zzeg r4 = (com.google.android.gms.internal.measurement.zzeg) r4
            int r4 = com.google.android.gms.internal.measurement.zzev.zzc((int) r15, (com.google.android.gms.internal.measurement.zzeg) r4)
            goto L_0x09bb
        L_0x05d6:
            boolean r4 = r0.zza(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x09c8
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.measurement.zzhp r9 = r0.zza((int) r3)
            int r4 = com.google.android.gms.internal.measurement.zzhr.zza((int) r15, (java.lang.Object) r4, (com.google.android.gms.internal.measurement.zzhp) r9)
            goto L_0x09bb
        L_0x05ea:
            boolean r4 = r0.zza(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x09c8
            java.lang.Object r4 = r2.getObject(r1, r9)
            boolean r9 = r4 instanceof com.google.android.gms.internal.measurement.zzeg
            if (r9 == 0) goto L_0x0600
            com.google.android.gms.internal.measurement.zzeg r4 = (com.google.android.gms.internal.measurement.zzeg) r4
            int r4 = com.google.android.gms.internal.measurement.zzev.zzc((int) r15, (com.google.android.gms.internal.measurement.zzeg) r4)
            goto L_0x09bb
        L_0x0600:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.measurement.zzev.zzb((int) r15, (java.lang.String) r4)
            goto L_0x09bb
        L_0x0608:
            boolean r4 = r0.zza(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x09c8
            int r4 = com.google.android.gms.internal.measurement.zzev.zzb((int) r15, (boolean) r7)
            goto L_0x09bb
        L_0x0614:
            boolean r4 = r0.zza(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x09c8
            r4 = 0
            int r9 = com.google.android.gms.internal.measurement.zzev.zzi(r15, r4)
            goto L_0x095c
        L_0x0621:
            boolean r4 = r0.zza(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x09c8
            r9 = 0
            int r4 = com.google.android.gms.internal.measurement.zzev.zzg((int) r15, (long) r9)
            goto L_0x09bb
        L_0x062f:
            boolean r4 = r0.zza(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x09c8
            int r4 = zzd(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.zzev.zzf((int) r15, (int) r4)
            goto L_0x09bb
        L_0x063f:
            boolean r4 = r0.zza(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x09c8
            long r9 = zze(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.zzev.zze((int) r15, (long) r9)
            goto L_0x09bb
        L_0x064f:
            boolean r4 = r0.zza(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x09c8
            long r9 = zze(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.zzev.zzd((int) r15, (long) r9)
            goto L_0x09bb
        L_0x065f:
            boolean r4 = r0.zza(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x09c8
            r4 = 0
            int r9 = com.google.android.gms.internal.measurement.zzev.zzb((int) r15, (float) r4)
            goto L_0x095c
        L_0x066c:
            boolean r4 = r0.zza(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x09c8
            r9 = 0
            int r4 = com.google.android.gms.internal.measurement.zzev.zzb((int) r15, (double) r9)
            goto L_0x09bb
        L_0x067a:
            com.google.android.gms.internal.measurement.zzgt r4 = r0.zzs
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.lang.Object r10 = r0.zzb((int) r3)
            int r4 = r4.zza(r15, r9, r10)
            goto L_0x09bb
        L_0x068a:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.zzhp r9 = r0.zza((int) r3)
            int r4 = com.google.android.gms.internal.measurement.zzhr.zzb((int) r15, (java.util.List<com.google.android.gms.internal.measurement.zzgw>) r4, (com.google.android.gms.internal.measurement.zzhp) r9)
            goto L_0x09bb
        L_0x069a:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzhr.zzc(r4)
            if (r4 <= 0) goto L_0x09c8
            boolean r9 = r0.zzk
            if (r9 == 0) goto L_0x06ae
            long r9 = (long) r11
            r2.putInt(r1, r9, r4)
        L_0x06ae:
            int r9 = com.google.android.gms.internal.measurement.zzev.zze((int) r15)
            int r10 = com.google.android.gms.internal.measurement.zzev.zzg((int) r4)
            goto L_0x0839
        L_0x06b8:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzhr.zzg(r4)
            if (r4 <= 0) goto L_0x09c8
            boolean r9 = r0.zzk
            if (r9 == 0) goto L_0x06cc
            long r9 = (long) r11
            r2.putInt(r1, r9, r4)
        L_0x06cc:
            int r9 = com.google.android.gms.internal.measurement.zzev.zze((int) r15)
            int r10 = com.google.android.gms.internal.measurement.zzev.zzg((int) r4)
            goto L_0x0839
        L_0x06d6:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzhr.zzi(r4)
            if (r4 <= 0) goto L_0x09c8
            boolean r9 = r0.zzk
            if (r9 == 0) goto L_0x06ea
            long r9 = (long) r11
            r2.putInt(r1, r9, r4)
        L_0x06ea:
            int r9 = com.google.android.gms.internal.measurement.zzev.zze((int) r15)
            int r10 = com.google.android.gms.internal.measurement.zzev.zzg((int) r4)
            goto L_0x0839
        L_0x06f4:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzhr.zzh(r4)
            if (r4 <= 0) goto L_0x09c8
            boolean r9 = r0.zzk
            if (r9 == 0) goto L_0x0708
            long r9 = (long) r11
            r2.putInt(r1, r9, r4)
        L_0x0708:
            int r9 = com.google.android.gms.internal.measurement.zzev.zze((int) r15)
            int r10 = com.google.android.gms.internal.measurement.zzev.zzg((int) r4)
            goto L_0x0839
        L_0x0712:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzhr.zzd(r4)
            if (r4 <= 0) goto L_0x09c8
            boolean r9 = r0.zzk
            if (r9 == 0) goto L_0x0726
            long r9 = (long) r11
            r2.putInt(r1, r9, r4)
        L_0x0726:
            int r9 = com.google.android.gms.internal.measurement.zzev.zze((int) r15)
            int r10 = com.google.android.gms.internal.measurement.zzev.zzg((int) r4)
            goto L_0x0839
        L_0x0730:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzhr.zzf(r4)
            if (r4 <= 0) goto L_0x09c8
            boolean r9 = r0.zzk
            if (r9 == 0) goto L_0x0744
            long r9 = (long) r11
            r2.putInt(r1, r9, r4)
        L_0x0744:
            int r9 = com.google.android.gms.internal.measurement.zzev.zze((int) r15)
            int r10 = com.google.android.gms.internal.measurement.zzev.zzg((int) r4)
            goto L_0x0839
        L_0x074e:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzhr.zzj(r4)
            if (r4 <= 0) goto L_0x09c8
            boolean r9 = r0.zzk
            if (r9 == 0) goto L_0x0762
            long r9 = (long) r11
            r2.putInt(r1, r9, r4)
        L_0x0762:
            int r9 = com.google.android.gms.internal.measurement.zzev.zze((int) r15)
            int r10 = com.google.android.gms.internal.measurement.zzev.zzg((int) r4)
            goto L_0x0839
        L_0x076c:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzhr.zzh(r4)
            if (r4 <= 0) goto L_0x09c8
            boolean r9 = r0.zzk
            if (r9 == 0) goto L_0x0780
            long r9 = (long) r11
            r2.putInt(r1, r9, r4)
        L_0x0780:
            int r9 = com.google.android.gms.internal.measurement.zzev.zze((int) r15)
            int r10 = com.google.android.gms.internal.measurement.zzev.zzg((int) r4)
            goto L_0x0839
        L_0x078a:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzhr.zzi(r4)
            if (r4 <= 0) goto L_0x09c8
            boolean r9 = r0.zzk
            if (r9 == 0) goto L_0x079e
            long r9 = (long) r11
            r2.putInt(r1, r9, r4)
        L_0x079e:
            int r9 = com.google.android.gms.internal.measurement.zzev.zze((int) r15)
            int r10 = com.google.android.gms.internal.measurement.zzev.zzg((int) r4)
            goto L_0x0839
        L_0x07a8:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzhr.zze(r4)
            if (r4 <= 0) goto L_0x09c8
            boolean r9 = r0.zzk
            if (r9 == 0) goto L_0x07bc
            long r9 = (long) r11
            r2.putInt(r1, r9, r4)
        L_0x07bc:
            int r9 = com.google.android.gms.internal.measurement.zzev.zze((int) r15)
            int r10 = com.google.android.gms.internal.measurement.zzev.zzg((int) r4)
            goto L_0x0839
        L_0x07c6:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzhr.zzb(r4)
            if (r4 <= 0) goto L_0x09c8
            boolean r9 = r0.zzk
            if (r9 == 0) goto L_0x07da
            long r9 = (long) r11
            r2.putInt(r1, r9, r4)
        L_0x07da:
            int r9 = com.google.android.gms.internal.measurement.zzev.zze((int) r15)
            int r10 = com.google.android.gms.internal.measurement.zzev.zzg((int) r4)
            goto L_0x0839
        L_0x07e3:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzhr.zza((java.util.List<java.lang.Long>) r4)
            if (r4 <= 0) goto L_0x09c8
            boolean r9 = r0.zzk
            if (r9 == 0) goto L_0x07f7
            long r9 = (long) r11
            r2.putInt(r1, r9, r4)
        L_0x07f7:
            int r9 = com.google.android.gms.internal.measurement.zzev.zze((int) r15)
            int r10 = com.google.android.gms.internal.measurement.zzev.zzg((int) r4)
            goto L_0x0839
        L_0x0800:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzhr.zzh(r4)
            if (r4 <= 0) goto L_0x09c8
            boolean r9 = r0.zzk
            if (r9 == 0) goto L_0x0814
            long r9 = (long) r11
            r2.putInt(r1, r9, r4)
        L_0x0814:
            int r9 = com.google.android.gms.internal.measurement.zzev.zze((int) r15)
            int r10 = com.google.android.gms.internal.measurement.zzev.zzg((int) r4)
            goto L_0x0839
        L_0x081d:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzhr.zzi(r4)
            if (r4 <= 0) goto L_0x09c8
            boolean r9 = r0.zzk
            if (r9 == 0) goto L_0x0831
            long r9 = (long) r11
            r2.putInt(r1, r9, r4)
        L_0x0831:
            int r9 = com.google.android.gms.internal.measurement.zzev.zze((int) r15)
            int r10 = com.google.android.gms.internal.measurement.zzev.zzg((int) r4)
        L_0x0839:
            int r9 = r9 + r10
            int r9 = r9 + r4
            goto L_0x095c
        L_0x083d:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            r11 = 0
            int r4 = com.google.android.gms.internal.measurement.zzhr.zzc(r15, r4, r11)
            goto L_0x0906
        L_0x084a:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzhr.zzg(r15, r4, r11)
            goto L_0x0906
        L_0x0857:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzhr.zzi(r15, r4, r11)
            goto L_0x0906
        L_0x0864:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzhr.zzh(r15, r4, r11)
            goto L_0x0906
        L_0x0871:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzhr.zzd(r15, r4, r11)
            goto L_0x0906
        L_0x087e:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzhr.zzf(r15, r4, r11)
            goto L_0x09bb
        L_0x088b:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzhr.zzb(r15, r4)
            goto L_0x09bb
        L_0x0897:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.zzhp r9 = r0.zza((int) r3)
            int r4 = com.google.android.gms.internal.measurement.zzhr.zza((int) r15, (java.util.List<?>) r4, (com.google.android.gms.internal.measurement.zzhp) r9)
            goto L_0x09bb
        L_0x08a7:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzhr.zza((int) r15, (java.util.List<?>) r4)
            goto L_0x09bb
        L_0x08b3:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            r11 = 0
            int r4 = com.google.android.gms.internal.measurement.zzhr.zzj(r15, r4, r11)
            goto L_0x0906
        L_0x08bf:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzhr.zzh(r15, r4, r11)
            goto L_0x0906
        L_0x08cb:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzhr.zzi(r15, r4, r11)
            goto L_0x0906
        L_0x08d7:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzhr.zze(r15, r4, r11)
            goto L_0x0906
        L_0x08e3:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzhr.zzb((int) r15, (java.util.List<java.lang.Long>) r4, (boolean) r11)
            goto L_0x0906
        L_0x08ef:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzhr.zza((int) r15, (java.util.List<java.lang.Long>) r4, (boolean) r11)
            goto L_0x0906
        L_0x08fb:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzhr.zzh(r15, r4, r11)
        L_0x0906:
            int r5 = r5 + r4
            r4 = r11
            goto L_0x09c9
        L_0x090a:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzhr.zzi(r15, r4, r11)
            goto L_0x09bb
        L_0x0917:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x09c8
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.measurement.zzgw r4 = (com.google.android.gms.internal.measurement.zzgw) r4
            com.google.android.gms.internal.measurement.zzhp r9 = r0.zza((int) r3)
            int r4 = com.google.android.gms.internal.measurement.zzev.zzc(r15, r4, r9)
            goto L_0x09bb
        L_0x092b:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x09c8
            long r9 = r2.getLong(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.zzev.zzf((int) r15, (long) r9)
            goto L_0x09bb
        L_0x0939:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x09c8
            int r4 = r2.getInt(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.zzev.zzh((int) r15, (int) r4)
            goto L_0x09bb
        L_0x0947:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x09c8
            r9 = 0
            int r4 = com.google.android.gms.internal.measurement.zzev.zzh((int) r15, (long) r9)
            goto L_0x09bb
        L_0x0953:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x09c8
            r4 = 0
            int r9 = com.google.android.gms.internal.measurement.zzev.zzj(r15, r4)
        L_0x095c:
            int r5 = r5 + r9
            goto L_0x09c8
        L_0x095f:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x09c8
            int r4 = r2.getInt(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.zzev.zzk(r15, r4)
            goto L_0x09bb
        L_0x096c:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x09c8
            int r4 = r2.getInt(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.zzev.zzg((int) r15, (int) r4)
            goto L_0x09bb
        L_0x0979:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x09c8
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.measurement.zzeg r4 = (com.google.android.gms.internal.measurement.zzeg) r4
            int r4 = com.google.android.gms.internal.measurement.zzev.zzc((int) r15, (com.google.android.gms.internal.measurement.zzeg) r4)
            goto L_0x09bb
        L_0x0988:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x09c8
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.measurement.zzhp r9 = r0.zza((int) r3)
            int r4 = com.google.android.gms.internal.measurement.zzhr.zza((int) r15, (java.lang.Object) r4, (com.google.android.gms.internal.measurement.zzhp) r9)
            goto L_0x09bb
        L_0x0999:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x09c8
            java.lang.Object r4 = r2.getObject(r1, r9)
            boolean r9 = r4 instanceof com.google.android.gms.internal.measurement.zzeg
            if (r9 == 0) goto L_0x09ac
            com.google.android.gms.internal.measurement.zzeg r4 = (com.google.android.gms.internal.measurement.zzeg) r4
            int r4 = com.google.android.gms.internal.measurement.zzev.zzc((int) r15, (com.google.android.gms.internal.measurement.zzeg) r4)
            goto L_0x09bb
        L_0x09ac:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.measurement.zzev.zzb((int) r15, (java.lang.String) r4)
            goto L_0x09bb
        L_0x09b3:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x09c8
            int r4 = com.google.android.gms.internal.measurement.zzev.zzb((int) r15, (boolean) r7)
        L_0x09bb:
            int r5 = r5 + r4
            goto L_0x09c8
        L_0x09bd:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x09c8
            r4 = 0
            int r9 = com.google.android.gms.internal.measurement.zzev.zzi(r15, r4)
            int r5 = r5 + r9
            goto L_0x09c9
        L_0x09c8:
            r4 = 0
        L_0x09c9:
            r9 = 0
            r10 = 0
            r13 = 0
            goto L_0x0a2d
        L_0x09cf:
            r4 = 0
            r9 = r12 & r18
            r13 = 0
            if (r9 == 0) goto L_0x0a0b
            int r9 = com.google.android.gms.internal.measurement.zzev.zzg((int) r15, (long) r13)
            goto L_0x0a0a
        L_0x09db:
            r4 = 0
            r13 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x0a0b
            int r9 = r2.getInt(r1, r9)
            int r9 = com.google.android.gms.internal.measurement.zzev.zzf((int) r15, (int) r9)
            goto L_0x0a0a
        L_0x09eb:
            r4 = 0
            r13 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x0a0b
            long r9 = r2.getLong(r1, r9)
            int r9 = com.google.android.gms.internal.measurement.zzev.zze((int) r15, (long) r9)
            goto L_0x0a0a
        L_0x09fb:
            r4 = 0
            r13 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x0a0b
            long r9 = r2.getLong(r1, r9)
            int r9 = com.google.android.gms.internal.measurement.zzev.zzd((int) r15, (long) r9)
        L_0x0a0a:
            int r5 = r5 + r9
        L_0x0a0b:
            r9 = 0
            goto L_0x0a2b
        L_0x0a0d:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x0a0b
            r9 = 0
            int r10 = com.google.android.gms.internal.measurement.zzev.zzb((int) r15, (float) r9)
            int r5 = r5 + r10
            goto L_0x0a2b
        L_0x0a1b:
            r4 = 0
            r9 = 0
            r13 = 0
            r10 = r12 & r18
            if (r10 == 0) goto L_0x0a2b
            r10 = 0
            int r15 = com.google.android.gms.internal.measurement.zzev.zzb((int) r15, (double) r10)
            int r5 = r5 + r15
            goto L_0x0a2d
        L_0x0a2b:
            r10 = 0
        L_0x0a2d:
            int r3 = r3 + 3
            r11 = r4
            r4 = r9
            r9 = r13
            goto L_0x0501
        L_0x0a34:
            r4 = r11
            com.google.android.gms.internal.measurement.zzih<?, ?> r2 = r0.zzq
            int r2 = zza(r2, r1)
            int r5 = r5 + r2
            boolean r2 = r0.zzh
            if (r2 == 0) goto L_0x0a8e
            com.google.android.gms.internal.measurement.zzfd<?> r2 = r0.zzr
            com.google.android.gms.internal.measurement.zzfe r1 = r2.zza((java.lang.Object) r1)
            r11 = r4
        L_0x0a47:
            com.google.android.gms.internal.measurement.zzhq<T, java.lang.Object> r2 = r1.zza
            int r2 = r2.zzc()
            if (r11 >= r2) goto L_0x0a67
            com.google.android.gms.internal.measurement.zzhq<T, java.lang.Object> r2 = r1.zza
            java.util.Map$Entry r2 = r2.zzb((int) r11)
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.measurement.zzfg r3 = (com.google.android.gms.internal.measurement.zzfg) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = com.google.android.gms.internal.measurement.zzfe.zza((com.google.android.gms.internal.measurement.zzfg<?>) r3, (java.lang.Object) r2)
            int r4 = r4 + r2
            int r11 = r11 + 1
            goto L_0x0a47
        L_0x0a67:
            com.google.android.gms.internal.measurement.zzhq<T, java.lang.Object> r1 = r1.zza
            java.lang.Iterable r1 = r1.zzd()
            java.util.Iterator r1 = r1.iterator()
        L_0x0a71:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0a8d
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.measurement.zzfg r3 = (com.google.android.gms.internal.measurement.zzfg) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = com.google.android.gms.internal.measurement.zzfe.zza((com.google.android.gms.internal.measurement.zzfg<?>) r3, (java.lang.Object) r2)
            int r4 = r4 + r2
            goto L_0x0a71
        L_0x0a8d:
            int r5 = r5 + r4
        L_0x0a8e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzha.zzb(java.lang.Object):int");
    }

    private static <UT, UB> int zza(zzih<UT, UB> zzih, T t) {
        return zzih.zzf(zzih.zzb(t));
    }

    private static List<?> zza(Object obj, long j) {
        return (List) zzin.zzf(obj, j);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: java.util.Map$Entry} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0552  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0a2a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r14, com.google.android.gms.internal.measurement.zzja r15) throws java.io.IOException {
        /*
            r13 = this;
            int r0 = r15.zza()
            int r1 = com.google.android.gms.internal.measurement.zzfo.zzf.zzk
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x0529
            com.google.android.gms.internal.measurement.zzih<?, ?> r0 = r13.zzq
            zza(r0, r14, (com.google.android.gms.internal.measurement.zzja) r15)
            boolean r0 = r13.zzh
            if (r0 == 0) goto L_0x0032
            com.google.android.gms.internal.measurement.zzfd<?> r0 = r13.zzr
            com.google.android.gms.internal.measurement.zzfe r0 = r0.zza((java.lang.Object) r14)
            com.google.android.gms.internal.measurement.zzhq<T, java.lang.Object> r1 = r0.zza
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0032
            java.util.Iterator r0 = r0.zze()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0034
        L_0x0032:
            r0 = r3
            r1 = r0
        L_0x0034:
            int[] r7 = r13.zzc
            int r7 = r7.length
            int r7 = r7 + -3
        L_0x0039:
            if (r7 < 0) goto L_0x0511
            int r8 = r13.zzd((int) r7)
            int[] r9 = r13.zzc
            r9 = r9[r7]
        L_0x0043:
            if (r1 == 0) goto L_0x0061
            com.google.android.gms.internal.measurement.zzfd<?> r10 = r13.zzr
            int r10 = r10.zza((java.util.Map.Entry<?, ?>) r1)
            if (r10 <= r9) goto L_0x0061
            com.google.android.gms.internal.measurement.zzfd<?> r10 = r13.zzr
            r10.zza(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005f
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0043
        L_0x005f:
            r1 = r3
            goto L_0x0043
        L_0x0061:
            r10 = r8 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x04fe;
                case 1: goto L_0x04ee;
                case 2: goto L_0x04de;
                case 3: goto L_0x04ce;
                case 4: goto L_0x04be;
                case 5: goto L_0x04ae;
                case 6: goto L_0x049e;
                case 7: goto L_0x048d;
                case 8: goto L_0x047c;
                case 9: goto L_0x0467;
                case 10: goto L_0x0454;
                case 11: goto L_0x0443;
                case 12: goto L_0x0432;
                case 13: goto L_0x0421;
                case 14: goto L_0x0410;
                case 15: goto L_0x03ff;
                case 16: goto L_0x03ee;
                case 17: goto L_0x03d9;
                case 18: goto L_0x03c8;
                case 19: goto L_0x03b7;
                case 20: goto L_0x03a6;
                case 21: goto L_0x0395;
                case 22: goto L_0x0384;
                case 23: goto L_0x0373;
                case 24: goto L_0x0362;
                case 25: goto L_0x0351;
                case 26: goto L_0x0340;
                case 27: goto L_0x032b;
                case 28: goto L_0x031a;
                case 29: goto L_0x0309;
                case 30: goto L_0x02f8;
                case 31: goto L_0x02e7;
                case 32: goto L_0x02d6;
                case 33: goto L_0x02c5;
                case 34: goto L_0x02b4;
                case 35: goto L_0x02a3;
                case 36: goto L_0x0292;
                case 37: goto L_0x0281;
                case 38: goto L_0x0270;
                case 39: goto L_0x025f;
                case 40: goto L_0x024e;
                case 41: goto L_0x023d;
                case 42: goto L_0x022c;
                case 43: goto L_0x021b;
                case 44: goto L_0x020a;
                case 45: goto L_0x01f9;
                case 46: goto L_0x01e8;
                case 47: goto L_0x01d7;
                case 48: goto L_0x01c6;
                case 49: goto L_0x01b1;
                case 50: goto L_0x01a6;
                case 51: goto L_0x0195;
                case 52: goto L_0x0184;
                case 53: goto L_0x0173;
                case 54: goto L_0x0162;
                case 55: goto L_0x0151;
                case 56: goto L_0x0140;
                case 57: goto L_0x012f;
                case 58: goto L_0x011e;
                case 59: goto L_0x010d;
                case 60: goto L_0x00f8;
                case 61: goto L_0x00e5;
                case 62: goto L_0x00d4;
                case 63: goto L_0x00c3;
                case 64: goto L_0x00b2;
                case 65: goto L_0x00a1;
                case 66: goto L_0x0090;
                case 67: goto L_0x007f;
                case 68: goto L_0x006a;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x050d
        L_0x006a:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            com.google.android.gms.internal.measurement.zzhp r10 = r13.zza((int) r7)
            r15.zzb((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.measurement.zzhp) r10)
            goto L_0x050d
        L_0x007f:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zze(r14, r10)
            r15.zze((int) r9, (long) r10)
            goto L_0x050d
        L_0x0090:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzd(r14, r10)
            r15.zzf(r9, r8)
            goto L_0x050d
        L_0x00a1:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zze(r14, r10)
            r15.zzb((int) r9, (long) r10)
            goto L_0x050d
        L_0x00b2:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzd(r14, r10)
            r15.zza((int) r9, (int) r8)
            goto L_0x050d
        L_0x00c3:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzd(r14, r10)
            r15.zzb((int) r9, (int) r8)
            goto L_0x050d
        L_0x00d4:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzd(r14, r10)
            r15.zze((int) r9, (int) r8)
            goto L_0x050d
        L_0x00e5:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            com.google.android.gms.internal.measurement.zzeg r8 = (com.google.android.gms.internal.measurement.zzeg) r8
            r15.zza((int) r9, (com.google.android.gms.internal.measurement.zzeg) r8)
            goto L_0x050d
        L_0x00f8:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            com.google.android.gms.internal.measurement.zzhp r10 = r13.zza((int) r7)
            r15.zza((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.measurement.zzhp) r10)
            goto L_0x050d
        L_0x010d:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            zza((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.measurement.zzja) r15)
            goto L_0x050d
        L_0x011e:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = zzf(r14, r10)
            r15.zza((int) r9, (boolean) r8)
            goto L_0x050d
        L_0x012f:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzd(r14, r10)
            r15.zzd((int) r9, (int) r8)
            goto L_0x050d
        L_0x0140:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zze(r14, r10)
            r15.zzd((int) r9, (long) r10)
            goto L_0x050d
        L_0x0151:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzd(r14, r10)
            r15.zzc((int) r9, (int) r8)
            goto L_0x050d
        L_0x0162:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zze(r14, r10)
            r15.zzc((int) r9, (long) r10)
            goto L_0x050d
        L_0x0173:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zze(r14, r10)
            r15.zza((int) r9, (long) r10)
            goto L_0x050d
        L_0x0184:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = zzc(r14, r10)
            r15.zza((int) r9, (float) r8)
            goto L_0x050d
        L_0x0195:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = zzb(r14, (long) r10)
            r15.zza((int) r9, (double) r10)
            goto L_0x050d
        L_0x01a6:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            r13.zza((com.google.android.gms.internal.measurement.zzja) r15, (int) r9, (java.lang.Object) r8, (int) r7)
            goto L_0x050d
        L_0x01b1:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhp r10 = r13.zza((int) r7)
            com.google.android.gms.internal.measurement.zzhr.zzb((int) r9, (java.util.List<?>) r8, (com.google.android.gms.internal.measurement.zzja) r15, (com.google.android.gms.internal.measurement.zzhp) r10)
            goto L_0x050d
        L_0x01c6:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zze(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01d7:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzj(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01e8:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzg(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01f9:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzl(r9, r8, r15, r4)
            goto L_0x050d
        L_0x020a:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzm(r9, r8, r15, r4)
            goto L_0x050d
        L_0x021b:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzi(r9, r8, r15, r4)
            goto L_0x050d
        L_0x022c:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzn(r9, r8, r15, r4)
            goto L_0x050d
        L_0x023d:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzk(r9, r8, r15, r4)
            goto L_0x050d
        L_0x024e:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzf(r9, r8, r15, r4)
            goto L_0x050d
        L_0x025f:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzh(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0270:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzd(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0281:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzc(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0292:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzb((int) r9, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.measurement.zzja) r15, (boolean) r4)
            goto L_0x050d
        L_0x02a3:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zza((int) r9, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.measurement.zzja) r15, (boolean) r4)
            goto L_0x050d
        L_0x02b4:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zze(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02c5:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzj(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02d6:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzg(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02e7:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzl(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02f8:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzm(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0309:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzi(r9, r8, r15, r5)
            goto L_0x050d
        L_0x031a:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzb((int) r9, (java.util.List<com.google.android.gms.internal.measurement.zzeg>) r8, (com.google.android.gms.internal.measurement.zzja) r15)
            goto L_0x050d
        L_0x032b:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhp r10 = r13.zza((int) r7)
            com.google.android.gms.internal.measurement.zzhr.zza((int) r9, (java.util.List<?>) r8, (com.google.android.gms.internal.measurement.zzja) r15, (com.google.android.gms.internal.measurement.zzhp) r10)
            goto L_0x050d
        L_0x0340:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zza((int) r9, (java.util.List<java.lang.String>) r8, (com.google.android.gms.internal.measurement.zzja) r15)
            goto L_0x050d
        L_0x0351:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzn(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0362:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzk(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0373:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzf(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0384:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzh(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0395:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzd(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03a6:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzc(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03b7:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzb((int) r9, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.measurement.zzja) r15, (boolean) r5)
            goto L_0x050d
        L_0x03c8:
            int[] r9 = r13.zzc
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zza((int) r9, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.measurement.zzja) r15, (boolean) r5)
            goto L_0x050d
        L_0x03d9:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            com.google.android.gms.internal.measurement.zzhp r10 = r13.zza((int) r7)
            r15.zzb((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.measurement.zzhp) r10)
            goto L_0x050d
        L_0x03ee:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.zzin.zzb(r14, r10)
            r15.zze((int) r9, (long) r10)
            goto L_0x050d
        L_0x03ff:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r14, (long) r10)
            r15.zzf(r9, r8)
            goto L_0x050d
        L_0x0410:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.zzin.zzb(r14, r10)
            r15.zzb((int) r9, (long) r10)
            goto L_0x050d
        L_0x0421:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r14, (long) r10)
            r15.zza((int) r9, (int) r8)
            goto L_0x050d
        L_0x0432:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r14, (long) r10)
            r15.zzb((int) r9, (int) r8)
            goto L_0x050d
        L_0x0443:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r14, (long) r10)
            r15.zze((int) r9, (int) r8)
            goto L_0x050d
        L_0x0454:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            com.google.android.gms.internal.measurement.zzeg r8 = (com.google.android.gms.internal.measurement.zzeg) r8
            r15.zza((int) r9, (com.google.android.gms.internal.measurement.zzeg) r8)
            goto L_0x050d
        L_0x0467:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            com.google.android.gms.internal.measurement.zzhp r10 = r13.zza((int) r7)
            r15.zza((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.measurement.zzhp) r10)
            goto L_0x050d
        L_0x047c:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r10)
            zza((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.measurement.zzja) r15)
            goto L_0x050d
        L_0x048d:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = com.google.android.gms.internal.measurement.zzin.zzc(r14, r10)
            r15.zza((int) r9, (boolean) r8)
            goto L_0x050d
        L_0x049e:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r14, (long) r10)
            r15.zzd((int) r9, (int) r8)
            goto L_0x050d
        L_0x04ae:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.zzin.zzb(r14, r10)
            r15.zzd((int) r9, (long) r10)
            goto L_0x050d
        L_0x04be:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r14, (long) r10)
            r15.zzc((int) r9, (int) r8)
            goto L_0x050d
        L_0x04ce:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.zzin.zzb(r14, r10)
            r15.zzc((int) r9, (long) r10)
            goto L_0x050d
        L_0x04de:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.zzin.zzb(r14, r10)
            r15.zza((int) r9, (long) r10)
            goto L_0x050d
        L_0x04ee:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = com.google.android.gms.internal.measurement.zzin.zzd(r14, r10)
            r15.zza((int) r9, (float) r8)
            goto L_0x050d
        L_0x04fe:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = com.google.android.gms.internal.measurement.zzin.zze(r14, r10)
            r15.zza((int) r9, (double) r10)
        L_0x050d:
            int r7 = r7 + -3
            goto L_0x0039
        L_0x0511:
            if (r1 == 0) goto L_0x0528
            com.google.android.gms.internal.measurement.zzfd<?> r14 = r13.zzr
            r14.zza(r15, r1)
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x0526
            java.lang.Object r14 = r0.next()
            r1 = r14
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0511
        L_0x0526:
            r1 = r3
            goto L_0x0511
        L_0x0528:
            return
        L_0x0529:
            boolean r0 = r13.zzj
            if (r0 == 0) goto L_0x0a44
            boolean r0 = r13.zzh
            if (r0 == 0) goto L_0x054a
            com.google.android.gms.internal.measurement.zzfd<?> r0 = r13.zzr
            com.google.android.gms.internal.measurement.zzfe r0 = r0.zza((java.lang.Object) r14)
            com.google.android.gms.internal.measurement.zzhq<T, java.lang.Object> r1 = r0.zza
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x054a
            java.util.Iterator r0 = r0.zzd()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x054c
        L_0x054a:
            r0 = r3
            r1 = r0
        L_0x054c:
            int[] r7 = r13.zzc
            int r7 = r7.length
            r8 = r5
        L_0x0550:
            if (r8 >= r7) goto L_0x0a28
            int r9 = r13.zzd((int) r8)
            int[] r10 = r13.zzc
            r10 = r10[r8]
        L_0x055a:
            if (r1 == 0) goto L_0x0578
            com.google.android.gms.internal.measurement.zzfd<?> r11 = r13.zzr
            int r11 = r11.zza((java.util.Map.Entry<?, ?>) r1)
            if (r11 > r10) goto L_0x0578
            com.google.android.gms.internal.measurement.zzfd<?> r11 = r13.zzr
            r11.zza(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0576
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x055a
        L_0x0576:
            r1 = r3
            goto L_0x055a
        L_0x0578:
            r11 = r9 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0a15;
                case 1: goto L_0x0a05;
                case 2: goto L_0x09f5;
                case 3: goto L_0x09e5;
                case 4: goto L_0x09d5;
                case 5: goto L_0x09c5;
                case 6: goto L_0x09b5;
                case 7: goto L_0x09a4;
                case 8: goto L_0x0993;
                case 9: goto L_0x097e;
                case 10: goto L_0x096b;
                case 11: goto L_0x095a;
                case 12: goto L_0x0949;
                case 13: goto L_0x0938;
                case 14: goto L_0x0927;
                case 15: goto L_0x0916;
                case 16: goto L_0x0905;
                case 17: goto L_0x08f0;
                case 18: goto L_0x08df;
                case 19: goto L_0x08ce;
                case 20: goto L_0x08bd;
                case 21: goto L_0x08ac;
                case 22: goto L_0x089b;
                case 23: goto L_0x088a;
                case 24: goto L_0x0879;
                case 25: goto L_0x0868;
                case 26: goto L_0x0857;
                case 27: goto L_0x0842;
                case 28: goto L_0x0831;
                case 29: goto L_0x0820;
                case 30: goto L_0x080f;
                case 31: goto L_0x07fe;
                case 32: goto L_0x07ed;
                case 33: goto L_0x07dc;
                case 34: goto L_0x07cb;
                case 35: goto L_0x07ba;
                case 36: goto L_0x07a9;
                case 37: goto L_0x0798;
                case 38: goto L_0x0787;
                case 39: goto L_0x0776;
                case 40: goto L_0x0765;
                case 41: goto L_0x0754;
                case 42: goto L_0x0743;
                case 43: goto L_0x0732;
                case 44: goto L_0x0721;
                case 45: goto L_0x0710;
                case 46: goto L_0x06ff;
                case 47: goto L_0x06ee;
                case 48: goto L_0x06dd;
                case 49: goto L_0x06c8;
                case 50: goto L_0x06bd;
                case 51: goto L_0x06ac;
                case 52: goto L_0x069b;
                case 53: goto L_0x068a;
                case 54: goto L_0x0679;
                case 55: goto L_0x0668;
                case 56: goto L_0x0657;
                case 57: goto L_0x0646;
                case 58: goto L_0x0635;
                case 59: goto L_0x0624;
                case 60: goto L_0x060f;
                case 61: goto L_0x05fc;
                case 62: goto L_0x05eb;
                case 63: goto L_0x05da;
                case 64: goto L_0x05c9;
                case 65: goto L_0x05b8;
                case 66: goto L_0x05a7;
                case 67: goto L_0x0596;
                case 68: goto L_0x0581;
                default: goto L_0x057f;
            }
        L_0x057f:
            goto L_0x0a24
        L_0x0581:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            com.google.android.gms.internal.measurement.zzhp r11 = r13.zza((int) r8)
            r15.zzb((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.measurement.zzhp) r11)
            goto L_0x0a24
        L_0x0596:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zze(r14, r11)
            r15.zze((int) r10, (long) r11)
            goto L_0x0a24
        L_0x05a7:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzd(r14, r11)
            r15.zzf(r10, r9)
            goto L_0x0a24
        L_0x05b8:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zze(r14, r11)
            r15.zzb((int) r10, (long) r11)
            goto L_0x0a24
        L_0x05c9:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzd(r14, r11)
            r15.zza((int) r10, (int) r9)
            goto L_0x0a24
        L_0x05da:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzd(r14, r11)
            r15.zzb((int) r10, (int) r9)
            goto L_0x0a24
        L_0x05eb:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzd(r14, r11)
            r15.zze((int) r10, (int) r9)
            goto L_0x0a24
        L_0x05fc:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            com.google.android.gms.internal.measurement.zzeg r9 = (com.google.android.gms.internal.measurement.zzeg) r9
            r15.zza((int) r10, (com.google.android.gms.internal.measurement.zzeg) r9)
            goto L_0x0a24
        L_0x060f:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            com.google.android.gms.internal.measurement.zzhp r11 = r13.zza((int) r8)
            r15.zza((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.measurement.zzhp) r11)
            goto L_0x0a24
        L_0x0624:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            zza((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.measurement.zzja) r15)
            goto L_0x0a24
        L_0x0635:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = zzf(r14, r11)
            r15.zza((int) r10, (boolean) r9)
            goto L_0x0a24
        L_0x0646:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzd(r14, r11)
            r15.zzd((int) r10, (int) r9)
            goto L_0x0a24
        L_0x0657:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zze(r14, r11)
            r15.zzd((int) r10, (long) r11)
            goto L_0x0a24
        L_0x0668:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzd(r14, r11)
            r15.zzc((int) r10, (int) r9)
            goto L_0x0a24
        L_0x0679:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zze(r14, r11)
            r15.zzc((int) r10, (long) r11)
            goto L_0x0a24
        L_0x068a:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zze(r14, r11)
            r15.zza((int) r10, (long) r11)
            goto L_0x0a24
        L_0x069b:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = zzc(r14, r11)
            r15.zza((int) r10, (float) r9)
            goto L_0x0a24
        L_0x06ac:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = zzb(r14, (long) r11)
            r15.zza((int) r10, (double) r11)
            goto L_0x0a24
        L_0x06bd:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            r13.zza((com.google.android.gms.internal.measurement.zzja) r15, (int) r10, (java.lang.Object) r9, (int) r8)
            goto L_0x0a24
        L_0x06c8:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhp r11 = r13.zza((int) r8)
            com.google.android.gms.internal.measurement.zzhr.zzb((int) r10, (java.util.List<?>) r9, (com.google.android.gms.internal.measurement.zzja) r15, (com.google.android.gms.internal.measurement.zzhp) r11)
            goto L_0x0a24
        L_0x06dd:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhr.zze(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x06ee:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhr.zzj(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x06ff:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhr.zzg(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0710:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhr.zzl(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0721:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhr.zzm(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0732:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhr.zzi(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0743:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhr.zzn(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0754:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhr.zzk(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0765:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhr.zzf(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0776:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhr.zzh(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0787:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhr.zzd(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0798:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhr.zzc(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x07a9:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhr.zzb((int) r10, (java.util.List<java.lang.Float>) r9, (com.google.android.gms.internal.measurement.zzja) r15, (boolean) r4)
            goto L_0x0a24
        L_0x07ba:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhr.zza((int) r10, (java.util.List<java.lang.Double>) r9, (com.google.android.gms.internal.measurement.zzja) r15, (boolean) r4)
            goto L_0x0a24
        L_0x07cb:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhr.zze(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x07dc:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhr.zzj(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x07ed:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhr.zzg(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x07fe:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhr.zzl(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x080f:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhr.zzm(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x0820:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhr.zzi(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x0831:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhr.zzb((int) r10, (java.util.List<com.google.android.gms.internal.measurement.zzeg>) r9, (com.google.android.gms.internal.measurement.zzja) r15)
            goto L_0x0a24
        L_0x0842:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhp r11 = r13.zza((int) r8)
            com.google.android.gms.internal.measurement.zzhr.zza((int) r10, (java.util.List<?>) r9, (com.google.android.gms.internal.measurement.zzja) r15, (com.google.android.gms.internal.measurement.zzhp) r11)
            goto L_0x0a24
        L_0x0857:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhr.zza((int) r10, (java.util.List<java.lang.String>) r9, (com.google.android.gms.internal.measurement.zzja) r15)
            goto L_0x0a24
        L_0x0868:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhr.zzn(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x0879:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhr.zzk(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x088a:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhr.zzf(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x089b:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhr.zzh(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08ac:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhr.zzd(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08bd:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhr.zzc(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08ce:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhr.zzb((int) r10, (java.util.List<java.lang.Float>) r9, (com.google.android.gms.internal.measurement.zzja) r15, (boolean) r5)
            goto L_0x0a24
        L_0x08df:
            int[] r10 = r13.zzc
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.zzhr.zza((int) r10, (java.util.List<java.lang.Double>) r9, (com.google.android.gms.internal.measurement.zzja) r15, (boolean) r5)
            goto L_0x0a24
        L_0x08f0:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            com.google.android.gms.internal.measurement.zzhp r11 = r13.zza((int) r8)
            r15.zzb((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.measurement.zzhp) r11)
            goto L_0x0a24
        L_0x0905:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.measurement.zzin.zzb(r14, r11)
            r15.zze((int) r10, (long) r11)
            goto L_0x0a24
        L_0x0916:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r14, (long) r11)
            r15.zzf(r10, r9)
            goto L_0x0a24
        L_0x0927:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.measurement.zzin.zzb(r14, r11)
            r15.zzb((int) r10, (long) r11)
            goto L_0x0a24
        L_0x0938:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r14, (long) r11)
            r15.zza((int) r10, (int) r9)
            goto L_0x0a24
        L_0x0949:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r14, (long) r11)
            r15.zzb((int) r10, (int) r9)
            goto L_0x0a24
        L_0x095a:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r14, (long) r11)
            r15.zze((int) r10, (int) r9)
            goto L_0x0a24
        L_0x096b:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            com.google.android.gms.internal.measurement.zzeg r9 = (com.google.android.gms.internal.measurement.zzeg) r9
            r15.zza((int) r10, (com.google.android.gms.internal.measurement.zzeg) r9)
            goto L_0x0a24
        L_0x097e:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            com.google.android.gms.internal.measurement.zzhp r11 = r13.zza((int) r8)
            r15.zza((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.measurement.zzhp) r11)
            goto L_0x0a24
        L_0x0993:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzin.zzf(r14, r11)
            zza((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.measurement.zzja) r15)
            goto L_0x0a24
        L_0x09a4:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = com.google.android.gms.internal.measurement.zzin.zzc(r14, r11)
            r15.zza((int) r10, (boolean) r9)
            goto L_0x0a24
        L_0x09b5:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r14, (long) r11)
            r15.zzd((int) r10, (int) r9)
            goto L_0x0a24
        L_0x09c5:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.measurement.zzin.zzb(r14, r11)
            r15.zzd((int) r10, (long) r11)
            goto L_0x0a24
        L_0x09d5:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r14, (long) r11)
            r15.zzc((int) r10, (int) r9)
            goto L_0x0a24
        L_0x09e5:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.measurement.zzin.zzb(r14, r11)
            r15.zzc((int) r10, (long) r11)
            goto L_0x0a24
        L_0x09f5:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.measurement.zzin.zzb(r14, r11)
            r15.zza((int) r10, (long) r11)
            goto L_0x0a24
        L_0x0a05:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = com.google.android.gms.internal.measurement.zzin.zzd(r14, r11)
            r15.zza((int) r10, (float) r9)
            goto L_0x0a24
        L_0x0a15:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = com.google.android.gms.internal.measurement.zzin.zze(r14, r11)
            r15.zza((int) r10, (double) r11)
        L_0x0a24:
            int r8 = r8 + 3
            goto L_0x0550
        L_0x0a28:
            if (r1 == 0) goto L_0x0a3e
            com.google.android.gms.internal.measurement.zzfd<?> r2 = r13.zzr
            r2.zza(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0a3c
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0a28
        L_0x0a3c:
            r1 = r3
            goto L_0x0a28
        L_0x0a3e:
            com.google.android.gms.internal.measurement.zzih<?, ?> r0 = r13.zzq
            zza(r0, r14, (com.google.android.gms.internal.measurement.zzja) r15)
            return
        L_0x0a44:
            r13.zzb(r14, (com.google.android.gms.internal.measurement.zzja) r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzha.zza(java.lang.Object, com.google.android.gms.internal.measurement.zzja):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x039c, code lost:
        r4 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0489, code lost:
        r10 = r10 + 3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzb(T r18, com.google.android.gms.internal.measurement.zzja r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.zzh
            if (r3 == 0) goto L_0x0023
            com.google.android.gms.internal.measurement.zzfd<?> r3 = r0.zzr
            com.google.android.gms.internal.measurement.zzfe r3 = r3.zza((java.lang.Object) r1)
            com.google.android.gms.internal.measurement.zzhq<T, java.lang.Object> r5 = r3.zza
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0023
            java.util.Iterator r3 = r3.zzd()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0025
        L_0x0023:
            r3 = 0
            r5 = 0
        L_0x0025:
            int[] r6 = r0.zzc
            int r6 = r6.length
            sun.misc.Unsafe r7 = zzb
            r10 = 0
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x002f:
            if (r10 >= r6) goto L_0x048d
            int r13 = r0.zzd((int) r10)
            int[] r14 = r0.zzc
            r15 = r14[r10]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r16 = r13 & r16
            int r4 = r16 >>> 20
            boolean r9 = r0.zzj
            if (r9 != 0) goto L_0x005e
            r9 = 17
            if (r4 > r9) goto L_0x005e
            int r9 = r10 + 2
            r9 = r14[r9]
            r14 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r9 & r14
            if (r8 == r11) goto L_0x0058
            long r11 = (long) r8
            int r12 = r7.getInt(r1, r11)
            r11 = r8
        L_0x0058:
            int r8 = r9 >>> 20
            r9 = 1
            int r8 = r9 << r8
            goto L_0x005f
        L_0x005e:
            r8 = 0
        L_0x005f:
            if (r5 == 0) goto L_0x007d
            com.google.android.gms.internal.measurement.zzfd<?> r9 = r0.zzr
            int r9 = r9.zza((java.util.Map.Entry<?, ?>) r5)
            if (r9 > r15) goto L_0x007d
            com.google.android.gms.internal.measurement.zzfd<?> r9 = r0.zzr
            r9.zza(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007b
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x005f
        L_0x007b:
            r5 = 0
            goto L_0x005f
        L_0x007d:
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r13 & r9
            long r13 = (long) r13
            switch(r4) {
                case 0: goto L_0x047e;
                case 1: goto L_0x0472;
                case 2: goto L_0x0466;
                case 3: goto L_0x045a;
                case 4: goto L_0x044e;
                case 5: goto L_0x0442;
                case 6: goto L_0x0436;
                case 7: goto L_0x042a;
                case 8: goto L_0x041e;
                case 9: goto L_0x040d;
                case 10: goto L_0x03fe;
                case 11: goto L_0x03f1;
                case 12: goto L_0x03e4;
                case 13: goto L_0x03d7;
                case 14: goto L_0x03ca;
                case 15: goto L_0x03bd;
                case 16: goto L_0x03b0;
                case 17: goto L_0x039f;
                case 18: goto L_0x038e;
                case 19: goto L_0x037f;
                case 20: goto L_0x0370;
                case 21: goto L_0x0361;
                case 22: goto L_0x0352;
                case 23: goto L_0x0343;
                case 24: goto L_0x0334;
                case 25: goto L_0x0325;
                case 26: goto L_0x0316;
                case 27: goto L_0x0303;
                case 28: goto L_0x02f4;
                case 29: goto L_0x02e4;
                case 30: goto L_0x02d4;
                case 31: goto L_0x02c4;
                case 32: goto L_0x02b4;
                case 33: goto L_0x02a4;
                case 34: goto L_0x0294;
                case 35: goto L_0x0284;
                case 36: goto L_0x0274;
                case 37: goto L_0x0264;
                case 38: goto L_0x0254;
                case 39: goto L_0x0244;
                case 40: goto L_0x0234;
                case 41: goto L_0x0224;
                case 42: goto L_0x0214;
                case 43: goto L_0x0204;
                case 44: goto L_0x01f4;
                case 45: goto L_0x01e4;
                case 46: goto L_0x01d4;
                case 47: goto L_0x01c4;
                case 48: goto L_0x01b4;
                case 49: goto L_0x01a1;
                case 50: goto L_0x0198;
                case 51: goto L_0x0189;
                case 52: goto L_0x017a;
                case 53: goto L_0x016b;
                case 54: goto L_0x015c;
                case 55: goto L_0x014d;
                case 56: goto L_0x013e;
                case 57: goto L_0x012f;
                case 58: goto L_0x0120;
                case 59: goto L_0x0111;
                case 60: goto L_0x00fe;
                case 61: goto L_0x00ee;
                case 62: goto L_0x00e0;
                case 63: goto L_0x00d2;
                case 64: goto L_0x00c4;
                case 65: goto L_0x00b6;
                case 66: goto L_0x00a8;
                case 67: goto L_0x009a;
                case 68: goto L_0x0088;
                default: goto L_0x0085;
            }
        L_0x0085:
            r4 = 0
            goto L_0x0489
        L_0x0088:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x0085
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.android.gms.internal.measurement.zzhp r8 = r0.zza((int) r10)
            r2.zzb((int) r15, (java.lang.Object) r4, (com.google.android.gms.internal.measurement.zzhp) r8)
            goto L_0x0085
        L_0x009a:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x0085
            long r13 = zze(r1, r13)
            r2.zze((int) r15, (long) r13)
            goto L_0x0085
        L_0x00a8:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x0085
            int r4 = zzd(r1, r13)
            r2.zzf(r15, r4)
            goto L_0x0085
        L_0x00b6:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x0085
            long r13 = zze(r1, r13)
            r2.zzb((int) r15, (long) r13)
            goto L_0x0085
        L_0x00c4:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x0085
            int r4 = zzd(r1, r13)
            r2.zza((int) r15, (int) r4)
            goto L_0x0085
        L_0x00d2:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x0085
            int r4 = zzd(r1, r13)
            r2.zzb((int) r15, (int) r4)
            goto L_0x0085
        L_0x00e0:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x0085
            int r4 = zzd(r1, r13)
            r2.zze((int) r15, (int) r4)
            goto L_0x0085
        L_0x00ee:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x0085
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.android.gms.internal.measurement.zzeg r4 = (com.google.android.gms.internal.measurement.zzeg) r4
            r2.zza((int) r15, (com.google.android.gms.internal.measurement.zzeg) r4)
            goto L_0x0085
        L_0x00fe:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x0085
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.android.gms.internal.measurement.zzhp r8 = r0.zza((int) r10)
            r2.zza((int) r15, (java.lang.Object) r4, (com.google.android.gms.internal.measurement.zzhp) r8)
            goto L_0x0085
        L_0x0111:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x0085
            java.lang.Object r4 = r7.getObject(r1, r13)
            zza((int) r15, (java.lang.Object) r4, (com.google.android.gms.internal.measurement.zzja) r2)
            goto L_0x0085
        L_0x0120:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x0085
            boolean r4 = zzf(r1, r13)
            r2.zza((int) r15, (boolean) r4)
            goto L_0x0085
        L_0x012f:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x0085
            int r4 = zzd(r1, r13)
            r2.zzd((int) r15, (int) r4)
            goto L_0x0085
        L_0x013e:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x0085
            long r13 = zze(r1, r13)
            r2.zzd((int) r15, (long) r13)
            goto L_0x0085
        L_0x014d:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x0085
            int r4 = zzd(r1, r13)
            r2.zzc((int) r15, (int) r4)
            goto L_0x0085
        L_0x015c:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x0085
            long r13 = zze(r1, r13)
            r2.zzc((int) r15, (long) r13)
            goto L_0x0085
        L_0x016b:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x0085
            long r13 = zze(r1, r13)
            r2.zza((int) r15, (long) r13)
            goto L_0x0085
        L_0x017a:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x0085
            float r4 = zzc(r1, r13)
            r2.zza((int) r15, (float) r4)
            goto L_0x0085
        L_0x0189:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x0085
            double r13 = zzb(r1, (long) r13)
            r2.zza((int) r15, (double) r13)
            goto L_0x0085
        L_0x0198:
            java.lang.Object r4 = r7.getObject(r1, r13)
            r0.zza((com.google.android.gms.internal.measurement.zzja) r2, (int) r15, (java.lang.Object) r4, (int) r10)
            goto L_0x0085
        L_0x01a1:
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhp r13 = r0.zza((int) r10)
            com.google.android.gms.internal.measurement.zzhr.zzb((int) r4, (java.util.List<?>) r8, (com.google.android.gms.internal.measurement.zzja) r2, (com.google.android.gms.internal.measurement.zzhp) r13)
            goto L_0x0085
        L_0x01b4:
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 1
            com.google.android.gms.internal.measurement.zzhr.zze(r4, r8, r2, r15)
            goto L_0x0085
        L_0x01c4:
            r15 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzj(r4, r8, r2, r15)
            goto L_0x0085
        L_0x01d4:
            r15 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzg(r4, r8, r2, r15)
            goto L_0x0085
        L_0x01e4:
            r15 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzl(r4, r8, r2, r15)
            goto L_0x0085
        L_0x01f4:
            r15 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzm(r4, r8, r2, r15)
            goto L_0x0085
        L_0x0204:
            r15 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzi(r4, r8, r2, r15)
            goto L_0x0085
        L_0x0214:
            r15 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzn(r4, r8, r2, r15)
            goto L_0x0085
        L_0x0224:
            r15 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzk(r4, r8, r2, r15)
            goto L_0x0085
        L_0x0234:
            r15 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzf(r4, r8, r2, r15)
            goto L_0x0085
        L_0x0244:
            r15 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzh(r4, r8, r2, r15)
            goto L_0x0085
        L_0x0254:
            r15 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzd(r4, r8, r2, r15)
            goto L_0x0085
        L_0x0264:
            r15 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzc(r4, r8, r2, r15)
            goto L_0x0085
        L_0x0274:
            r15 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzb((int) r4, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.measurement.zzja) r2, (boolean) r15)
            goto L_0x0085
        L_0x0284:
            r15 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zza((int) r4, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.measurement.zzja) r2, (boolean) r15)
            goto L_0x0085
        L_0x0294:
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.android.gms.internal.measurement.zzhr.zze(r4, r8, r2, r15)
            goto L_0x039c
        L_0x02a4:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzj(r4, r8, r2, r15)
            goto L_0x039c
        L_0x02b4:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzg(r4, r8, r2, r15)
            goto L_0x039c
        L_0x02c4:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzl(r4, r8, r2, r15)
            goto L_0x039c
        L_0x02d4:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzm(r4, r8, r2, r15)
            goto L_0x039c
        L_0x02e4:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzi(r4, r8, r2, r15)
            goto L_0x039c
        L_0x02f4:
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzb((int) r4, (java.util.List<com.google.android.gms.internal.measurement.zzeg>) r8, (com.google.android.gms.internal.measurement.zzja) r2)
            goto L_0x0085
        L_0x0303:
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhp r13 = r0.zza((int) r10)
            com.google.android.gms.internal.measurement.zzhr.zza((int) r4, (java.util.List<?>) r8, (com.google.android.gms.internal.measurement.zzja) r2, (com.google.android.gms.internal.measurement.zzhp) r13)
            goto L_0x0085
        L_0x0316:
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zza((int) r4, (java.util.List<java.lang.String>) r8, (com.google.android.gms.internal.measurement.zzja) r2)
            goto L_0x0085
        L_0x0325:
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.android.gms.internal.measurement.zzhr.zzn(r4, r8, r2, r15)
            goto L_0x039c
        L_0x0334:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzk(r4, r8, r2, r15)
            goto L_0x039c
        L_0x0343:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzf(r4, r8, r2, r15)
            goto L_0x039c
        L_0x0352:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzh(r4, r8, r2, r15)
            goto L_0x039c
        L_0x0361:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzd(r4, r8, r2, r15)
            goto L_0x039c
        L_0x0370:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzc(r4, r8, r2, r15)
            goto L_0x039c
        L_0x037f:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zzb((int) r4, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.measurement.zzja) r2, (boolean) r15)
            goto L_0x039c
        L_0x038e:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.zzhr.zza((int) r4, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.measurement.zzja) r2, (boolean) r15)
        L_0x039c:
            r4 = r15
            goto L_0x0489
        L_0x039f:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.android.gms.internal.measurement.zzhp r13 = r0.zza((int) r10)
            r2.zzb((int) r15, (java.lang.Object) r8, (com.google.android.gms.internal.measurement.zzhp) r13)
            goto L_0x0489
        L_0x03b0:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            long r13 = r7.getLong(r1, r13)
            r2.zze((int) r15, (long) r13)
            goto L_0x0489
        L_0x03bd:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            int r8 = r7.getInt(r1, r13)
            r2.zzf(r15, r8)
            goto L_0x0489
        L_0x03ca:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            long r13 = r7.getLong(r1, r13)
            r2.zzb((int) r15, (long) r13)
            goto L_0x0489
        L_0x03d7:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            int r8 = r7.getInt(r1, r13)
            r2.zza((int) r15, (int) r8)
            goto L_0x0489
        L_0x03e4:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            int r8 = r7.getInt(r1, r13)
            r2.zzb((int) r15, (int) r8)
            goto L_0x0489
        L_0x03f1:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            int r8 = r7.getInt(r1, r13)
            r2.zze((int) r15, (int) r8)
            goto L_0x0489
        L_0x03fe:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.android.gms.internal.measurement.zzeg r8 = (com.google.android.gms.internal.measurement.zzeg) r8
            r2.zza((int) r15, (com.google.android.gms.internal.measurement.zzeg) r8)
            goto L_0x0489
        L_0x040d:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.android.gms.internal.measurement.zzhp r13 = r0.zza((int) r10)
            r2.zza((int) r15, (java.lang.Object) r8, (com.google.android.gms.internal.measurement.zzhp) r13)
            goto L_0x0489
        L_0x041e:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            java.lang.Object r8 = r7.getObject(r1, r13)
            zza((int) r15, (java.lang.Object) r8, (com.google.android.gms.internal.measurement.zzja) r2)
            goto L_0x0489
        L_0x042a:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            boolean r8 = com.google.android.gms.internal.measurement.zzin.zzc(r1, r13)
            r2.zza((int) r15, (boolean) r8)
            goto L_0x0489
        L_0x0436:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            int r8 = r7.getInt(r1, r13)
            r2.zzd((int) r15, (int) r8)
            goto L_0x0489
        L_0x0442:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            long r13 = r7.getLong(r1, r13)
            r2.zzd((int) r15, (long) r13)
            goto L_0x0489
        L_0x044e:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            int r8 = r7.getInt(r1, r13)
            r2.zzc((int) r15, (int) r8)
            goto L_0x0489
        L_0x045a:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            long r13 = r7.getLong(r1, r13)
            r2.zzc((int) r15, (long) r13)
            goto L_0x0489
        L_0x0466:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            long r13 = r7.getLong(r1, r13)
            r2.zza((int) r15, (long) r13)
            goto L_0x0489
        L_0x0472:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            float r8 = com.google.android.gms.internal.measurement.zzin.zzd(r1, r13)
            r2.zza((int) r15, (float) r8)
            goto L_0x0489
        L_0x047e:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            double r13 = com.google.android.gms.internal.measurement.zzin.zze(r1, r13)
            r2.zza((int) r15, (double) r13)
        L_0x0489:
            int r10 = r10 + 3
            goto L_0x002f
        L_0x048d:
            if (r5 == 0) goto L_0x04a4
            com.google.android.gms.internal.measurement.zzfd<?> r4 = r0.zzr
            r4.zza(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04a2
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x048d
        L_0x04a2:
            r5 = 0
            goto L_0x048d
        L_0x04a4:
            com.google.android.gms.internal.measurement.zzih<?, ?> r3 = r0.zzq
            zza(r3, r1, (com.google.android.gms.internal.measurement.zzja) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzha.zzb(java.lang.Object, com.google.android.gms.internal.measurement.zzja):void");
    }

    private final <K, V> void zza(zzja zzja, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzja.zza(i, this.zzs.zzb(zzb(i2)), this.zzs.zzc(obj));
        }
    }

    private static <UT, UB> void zza(zzih<UT, UB> zzih, T t, zzja zzja) throws IOException {
        zzih.zza(zzih.zzb(t), zzja);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void zza(T r13, com.google.android.gms.internal.measurement.zzhm r14, com.google.android.gms.internal.measurement.zzfb r15) throws java.io.IOException {
        /*
            r12 = this;
            r0 = 0
            if (r15 == 0) goto L_0x05dc
            com.google.android.gms.internal.measurement.zzih<?, ?> r8 = r12.zzq
            com.google.android.gms.internal.measurement.zzfd<?> r9 = r12.zzr
            r1 = r0
            r10 = r1
        L_0x0009:
            int r2 = r14.zza()     // Catch:{ all -> 0x05c4 }
            int r3 = r12.zzg(r2)     // Catch:{ all -> 0x05c4 }
            if (r3 >= 0) goto L_0x0077
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r3) goto L_0x002f
            int r14 = r12.zzm
        L_0x001a:
            int r15 = r12.zzn
            if (r14 >= r15) goto L_0x0029
            int[] r15 = r12.zzl
            r15 = r15[r14]
            java.lang.Object r10 = r12.zza((java.lang.Object) r13, (int) r15, r10, r8)
            int r14 = r14 + 1
            goto L_0x001a
        L_0x0029:
            if (r10 == 0) goto L_0x002e
            r8.zzb((java.lang.Object) r13, r10)
        L_0x002e:
            return
        L_0x002f:
            boolean r3 = r12.zzh     // Catch:{ all -> 0x05c4 }
            if (r3 != 0) goto L_0x0035
            r3 = r0
            goto L_0x003c
        L_0x0035:
            com.google.android.gms.internal.measurement.zzgw r3 = r12.zzg     // Catch:{ all -> 0x05c4 }
            java.lang.Object r2 = r9.zza(r15, r3, r2)     // Catch:{ all -> 0x05c4 }
            r3 = r2
        L_0x003c:
            if (r3 == 0) goto L_0x0051
            if (r1 != 0) goto L_0x0044
            com.google.android.gms.internal.measurement.zzfe r1 = r9.zzb(r13)     // Catch:{ all -> 0x05c4 }
        L_0x0044:
            r11 = r1
            r1 = r9
            r2 = r14
            r4 = r15
            r5 = r11
            r6 = r10
            r7 = r8
            java.lang.Object r10 = r1.zza(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x05c4 }
            r1 = r11
            goto L_0x0009
        L_0x0051:
            r8.zza((com.google.android.gms.internal.measurement.zzhm) r14)     // Catch:{ all -> 0x05c4 }
            if (r10 != 0) goto L_0x005a
            java.lang.Object r10 = r8.zzc(r13)     // Catch:{ all -> 0x05c4 }
        L_0x005a:
            boolean r2 = r8.zza(r10, (com.google.android.gms.internal.measurement.zzhm) r14)     // Catch:{ all -> 0x05c4 }
            if (r2 != 0) goto L_0x0009
            int r14 = r12.zzm
        L_0x0062:
            int r15 = r12.zzn
            if (r14 >= r15) goto L_0x0071
            int[] r15 = r12.zzl
            r15 = r15[r14]
            java.lang.Object r10 = r12.zza((java.lang.Object) r13, (int) r15, r10, r8)
            int r14 = r14 + 1
            goto L_0x0062
        L_0x0071:
            if (r10 == 0) goto L_0x0076
            r8.zzb((java.lang.Object) r13, r10)
        L_0x0076:
            return
        L_0x0077:
            int r4 = r12.zzd((int) r3)     // Catch:{ all -> 0x05c4 }
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r5 = r5 & r4
            int r5 = r5 >>> 20
            r6 = 1048575(0xfffff, float:1.469367E-39)
            switch(r5) {
                case 0: goto L_0x056d;
                case 1: goto L_0x055e;
                case 2: goto L_0x054f;
                case 3: goto L_0x0540;
                case 4: goto L_0x0531;
                case 5: goto L_0x0522;
                case 6: goto L_0x0513;
                case 7: goto L_0x0504;
                case 8: goto L_0x04fc;
                case 9: goto L_0x04cb;
                case 10: goto L_0x04bc;
                case 11: goto L_0x04ad;
                case 12: goto L_0x048b;
                case 13: goto L_0x047c;
                case 14: goto L_0x046d;
                case 15: goto L_0x045e;
                case 16: goto L_0x044f;
                case 17: goto L_0x041e;
                case 18: goto L_0x0410;
                case 19: goto L_0x0402;
                case 20: goto L_0x03f4;
                case 21: goto L_0x03e6;
                case 22: goto L_0x03d8;
                case 23: goto L_0x03ca;
                case 24: goto L_0x03bc;
                case 25: goto L_0x03ae;
                case 26: goto L_0x038c;
                case 27: goto L_0x037a;
                case 28: goto L_0x036c;
                case 29: goto L_0x035e;
                case 30: goto L_0x0349;
                case 31: goto L_0x033b;
                case 32: goto L_0x032d;
                case 33: goto L_0x031f;
                case 34: goto L_0x0311;
                case 35: goto L_0x0303;
                case 36: goto L_0x02f5;
                case 37: goto L_0x02e7;
                case 38: goto L_0x02d9;
                case 39: goto L_0x02cb;
                case 40: goto L_0x02bd;
                case 41: goto L_0x02af;
                case 42: goto L_0x02a1;
                case 43: goto L_0x0293;
                case 44: goto L_0x027e;
                case 45: goto L_0x0270;
                case 46: goto L_0x0262;
                case 47: goto L_0x0254;
                case 48: goto L_0x0246;
                case 49: goto L_0x0234;
                case 50: goto L_0x01f2;
                case 51: goto L_0x01e0;
                case 52: goto L_0x01ce;
                case 53: goto L_0x01bc;
                case 54: goto L_0x01aa;
                case 55: goto L_0x0198;
                case 56: goto L_0x0186;
                case 57: goto L_0x0174;
                case 58: goto L_0x0162;
                case 59: goto L_0x015a;
                case 60: goto L_0x0129;
                case 61: goto L_0x011b;
                case 62: goto L_0x0109;
                case 63: goto L_0x00e4;
                case 64: goto L_0x00d2;
                case 65: goto L_0x00c0;
                case 66: goto L_0x00ae;
                case 67: goto L_0x009c;
                case 68: goto L_0x008a;
                default: goto L_0x0086;
            }
        L_0x0086:
            if (r10 != 0) goto L_0x0580
            goto L_0x057c
        L_0x008a:
            r4 = r4 & r6
            long r4 = (long) r4
            com.google.android.gms.internal.measurement.zzhp r6 = r12.zza((int) r3)     // Catch:{ zzfz -> 0x059d }
            java.lang.Object r6 = r14.zzb(r6, r15)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x009c:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzfz -> 0x059d }
            long r6 = r14.zzt()     // Catch:{ zzfz -> 0x059d }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x00ae:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzfz -> 0x059d }
            int r6 = r14.zzs()     // Catch:{ zzfz -> 0x059d }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x00c0:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzfz -> 0x059d }
            long r6 = r14.zzr()     // Catch:{ zzfz -> 0x059d }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x00d2:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzfz -> 0x059d }
            int r6 = r14.zzq()     // Catch:{ zzfz -> 0x059d }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x00e4:
            int r5 = r14.zzp()     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzfs r7 = r12.zzc((int) r3)     // Catch:{ zzfz -> 0x059d }
            if (r7 == 0) goto L_0x00fb
            boolean r7 = r7.zza(r5)     // Catch:{ zzfz -> 0x059d }
            if (r7 == 0) goto L_0x00f5
            goto L_0x00fb
        L_0x00f5:
            java.lang.Object r10 = com.google.android.gms.internal.measurement.zzhr.zza((int) r2, (int) r5, r10, r8)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x00fb:
            r4 = r4 & r6
            long r6 = (long) r4     // Catch:{ zzfz -> 0x059d }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r6, (java.lang.Object) r4)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x0109:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzfz -> 0x059d }
            int r6 = r14.zzo()     // Catch:{ zzfz -> 0x059d }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x011b:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzeg r6 = r14.zzn()     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x0129:
            boolean r5 = r12.zza(r13, (int) r2, (int) r3)     // Catch:{ zzfz -> 0x059d }
            if (r5 == 0) goto L_0x0145
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzfz -> 0x059d }
            java.lang.Object r6 = com.google.android.gms.internal.measurement.zzin.zzf(r13, r4)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzhp r7 = r12.zza((int) r3)     // Catch:{ zzfz -> 0x059d }
            java.lang.Object r7 = r14.zza(r7, r15)     // Catch:{ zzfz -> 0x059d }
            java.lang.Object r6 = com.google.android.gms.internal.measurement.zzfr.zza((java.lang.Object) r6, (java.lang.Object) r7)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0155
        L_0x0145:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzhp r6 = r12.zza((int) r3)     // Catch:{ zzfz -> 0x059d }
            java.lang.Object r6 = r14.zza(r6, r15)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzfz -> 0x059d }
        L_0x0155:
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x015a:
            r12.zza((java.lang.Object) r13, (int) r4, (com.google.android.gms.internal.measurement.zzhm) r14)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x0162:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzfz -> 0x059d }
            boolean r6 = r14.zzk()     // Catch:{ zzfz -> 0x059d }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x0174:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzfz -> 0x059d }
            int r6 = r14.zzj()     // Catch:{ zzfz -> 0x059d }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x0186:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzfz -> 0x059d }
            long r6 = r14.zzi()     // Catch:{ zzfz -> 0x059d }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x0198:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzfz -> 0x059d }
            int r6 = r14.zzh()     // Catch:{ zzfz -> 0x059d }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x01aa:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzfz -> 0x059d }
            long r6 = r14.zzf()     // Catch:{ zzfz -> 0x059d }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x01bc:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzfz -> 0x059d }
            long r6 = r14.zzg()     // Catch:{ zzfz -> 0x059d }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x01ce:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzfz -> 0x059d }
            float r6 = r14.zze()     // Catch:{ zzfz -> 0x059d }
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x01e0:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzfz -> 0x059d }
            double r6 = r14.zzd()     // Catch:{ zzfz -> 0x059d }
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x01f2:
            java.lang.Object r2 = r12.zzb((int) r3)     // Catch:{ zzfz -> 0x059d }
            int r3 = r12.zzd((int) r3)     // Catch:{ zzfz -> 0x059d }
            r3 = r3 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            java.lang.Object r5 = com.google.android.gms.internal.measurement.zzin.zzf(r13, r3)     // Catch:{ zzfz -> 0x059d }
            if (r5 != 0) goto L_0x020c
            com.google.android.gms.internal.measurement.zzgt r5 = r12.zzs     // Catch:{ zzfz -> 0x059d }
            java.lang.Object r5 = r5.zzf(r2)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0223
        L_0x020c:
            com.google.android.gms.internal.measurement.zzgt r6 = r12.zzs     // Catch:{ zzfz -> 0x059d }
            boolean r6 = r6.zzd(r5)     // Catch:{ zzfz -> 0x059d }
            if (r6 == 0) goto L_0x0223
            com.google.android.gms.internal.measurement.zzgt r6 = r12.zzs     // Catch:{ zzfz -> 0x059d }
            java.lang.Object r6 = r6.zzf(r2)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzgt r7 = r12.zzs     // Catch:{ zzfz -> 0x059d }
            r7.zza(r6, r5)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r3, (java.lang.Object) r6)     // Catch:{ zzfz -> 0x059d }
            r5 = r6
        L_0x0223:
            com.google.android.gms.internal.measurement.zzgt r3 = r12.zzs     // Catch:{ zzfz -> 0x059d }
            java.util.Map r3 = r3.zza(r5)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzgt r4 = r12.zzs     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzgr r2 = r4.zzb(r2)     // Catch:{ zzfz -> 0x059d }
            r14.zza(r3, r2, (com.google.android.gms.internal.measurement.zzfb) r15)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x0234:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzhp r2 = r12.zza((int) r3)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzgg r3 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            java.util.List r3 = r3.zza(r13, r4)     // Catch:{ zzfz -> 0x059d }
            r14.zzb(r3, r2, r15)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x0246:
            com.google.android.gms.internal.measurement.zzgg r2 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzfz -> 0x059d }
            r14.zzq(r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x0254:
            com.google.android.gms.internal.measurement.zzgg r2 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzfz -> 0x059d }
            r14.zzp(r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x0262:
            com.google.android.gms.internal.measurement.zzgg r2 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzfz -> 0x059d }
            r14.zzo(r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x0270:
            com.google.android.gms.internal.measurement.zzgg r2 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzfz -> 0x059d }
            r14.zzn(r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x027e:
            com.google.android.gms.internal.measurement.zzgg r5 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r4 = r4 & r6
            long r6 = (long) r4     // Catch:{ zzfz -> 0x059d }
            java.util.List r4 = r5.zza(r13, r6)     // Catch:{ zzfz -> 0x059d }
            r14.zzm(r4)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzfs r3 = r12.zzc((int) r3)     // Catch:{ zzfz -> 0x059d }
            java.lang.Object r10 = com.google.android.gms.internal.measurement.zzhr.zza(r2, r4, r3, r10, r8)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x0293:
            com.google.android.gms.internal.measurement.zzgg r2 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzfz -> 0x059d }
            r14.zzl(r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x02a1:
            com.google.android.gms.internal.measurement.zzgg r2 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzfz -> 0x059d }
            r14.zzh(r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x02af:
            com.google.android.gms.internal.measurement.zzgg r2 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzfz -> 0x059d }
            r14.zzg(r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x02bd:
            com.google.android.gms.internal.measurement.zzgg r2 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzfz -> 0x059d }
            r14.zzf(r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x02cb:
            com.google.android.gms.internal.measurement.zzgg r2 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzfz -> 0x059d }
            r14.zze(r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x02d9:
            com.google.android.gms.internal.measurement.zzgg r2 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzfz -> 0x059d }
            r14.zzc(r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x02e7:
            com.google.android.gms.internal.measurement.zzgg r2 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzfz -> 0x059d }
            r14.zzd(r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x02f5:
            com.google.android.gms.internal.measurement.zzgg r2 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzfz -> 0x059d }
            r14.zzb(r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x0303:
            com.google.android.gms.internal.measurement.zzgg r2 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzfz -> 0x059d }
            r14.zza(r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x0311:
            com.google.android.gms.internal.measurement.zzgg r2 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzfz -> 0x059d }
            r14.zzq(r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x031f:
            com.google.android.gms.internal.measurement.zzgg r2 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzfz -> 0x059d }
            r14.zzp(r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x032d:
            com.google.android.gms.internal.measurement.zzgg r2 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzfz -> 0x059d }
            r14.zzo(r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x033b:
            com.google.android.gms.internal.measurement.zzgg r2 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzfz -> 0x059d }
            r14.zzn(r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x0349:
            com.google.android.gms.internal.measurement.zzgg r5 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r4 = r4 & r6
            long r6 = (long) r4     // Catch:{ zzfz -> 0x059d }
            java.util.List r4 = r5.zza(r13, r6)     // Catch:{ zzfz -> 0x059d }
            r14.zzm(r4)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzfs r3 = r12.zzc((int) r3)     // Catch:{ zzfz -> 0x059d }
            java.lang.Object r10 = com.google.android.gms.internal.measurement.zzhr.zza(r2, r4, r3, r10, r8)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x035e:
            com.google.android.gms.internal.measurement.zzgg r2 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzfz -> 0x059d }
            r14.zzl(r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x036c:
            com.google.android.gms.internal.measurement.zzgg r2 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzfz -> 0x059d }
            r14.zzk(r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x037a:
            com.google.android.gms.internal.measurement.zzhp r2 = r12.zza((int) r3)     // Catch:{ zzfz -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzgg r5 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            java.util.List r3 = r5.zza(r13, r3)     // Catch:{ zzfz -> 0x059d }
            r14.zza(r3, r2, (com.google.android.gms.internal.measurement.zzfb) r15)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x038c:
            boolean r2 = zzf(r4)     // Catch:{ zzfz -> 0x059d }
            if (r2 == 0) goto L_0x03a0
            com.google.android.gms.internal.measurement.zzgg r2 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzfz -> 0x059d }
            r14.zzj(r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x03a0:
            com.google.android.gms.internal.measurement.zzgg r2 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzfz -> 0x059d }
            r14.zzi(r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x03ae:
            com.google.android.gms.internal.measurement.zzgg r2 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzfz -> 0x059d }
            r14.zzh(r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x03bc:
            com.google.android.gms.internal.measurement.zzgg r2 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzfz -> 0x059d }
            r14.zzg(r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x03ca:
            com.google.android.gms.internal.measurement.zzgg r2 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzfz -> 0x059d }
            r14.zzf(r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x03d8:
            com.google.android.gms.internal.measurement.zzgg r2 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzfz -> 0x059d }
            r14.zze(r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x03e6:
            com.google.android.gms.internal.measurement.zzgg r2 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzfz -> 0x059d }
            r14.zzc(r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x03f4:
            com.google.android.gms.internal.measurement.zzgg r2 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzfz -> 0x059d }
            r14.zzd(r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x0402:
            com.google.android.gms.internal.measurement.zzgg r2 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzfz -> 0x059d }
            r14.zzb(r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x0410:
            com.google.android.gms.internal.measurement.zzgg r2 = r12.zzp     // Catch:{ zzfz -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzfz -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzfz -> 0x059d }
            r14.zza(r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x041e:
            boolean r2 = r12.zza(r13, (int) r3)     // Catch:{ zzfz -> 0x059d }
            if (r2 == 0) goto L_0x043c
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzfz -> 0x059d }
            java.lang.Object r2 = com.google.android.gms.internal.measurement.zzin.zzf(r13, r4)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzhp r3 = r12.zza((int) r3)     // Catch:{ zzfz -> 0x059d }
            java.lang.Object r3 = r14.zzb(r3, r15)     // Catch:{ zzfz -> 0x059d }
            java.lang.Object r2 = com.google.android.gms.internal.measurement.zzfr.zza((java.lang.Object) r2, (java.lang.Object) r3)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x043c:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzhp r2 = r12.zza((int) r3)     // Catch:{ zzfz -> 0x059d }
            java.lang.Object r2 = r14.zzb(r2, r15)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r2)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x044f:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzfz -> 0x059d }
            long r6 = r14.zzt()     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (long) r6)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x045e:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzfz -> 0x059d }
            int r2 = r14.zzs()     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (int) r2)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x046d:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzfz -> 0x059d }
            long r6 = r14.zzr()     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (long) r6)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x047c:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzfz -> 0x059d }
            int r2 = r14.zzq()     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (int) r2)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x048b:
            int r5 = r14.zzp()     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzfs r7 = r12.zzc((int) r3)     // Catch:{ zzfz -> 0x059d }
            if (r7 == 0) goto L_0x04a2
            boolean r7 = r7.zza(r5)     // Catch:{ zzfz -> 0x059d }
            if (r7 == 0) goto L_0x049c
            goto L_0x04a2
        L_0x049c:
            java.lang.Object r10 = com.google.android.gms.internal.measurement.zzhr.zza((int) r2, (int) r5, r10, r8)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x04a2:
            r2 = r4 & r6
            long r6 = (long) r2     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r6, (int) r5)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x04ad:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzfz -> 0x059d }
            int r2 = r14.zzo()     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (int) r2)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x04bc:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzeg r2 = r14.zzn()     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r2)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x04cb:
            boolean r2 = r12.zza(r13, (int) r3)     // Catch:{ zzfz -> 0x059d }
            if (r2 == 0) goto L_0x04e9
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzfz -> 0x059d }
            java.lang.Object r2 = com.google.android.gms.internal.measurement.zzin.zzf(r13, r4)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzhp r3 = r12.zza((int) r3)     // Catch:{ zzfz -> 0x059d }
            java.lang.Object r3 = r14.zza(r3, r15)     // Catch:{ zzfz -> 0x059d }
            java.lang.Object r2 = com.google.android.gms.internal.measurement.zzfr.zza((java.lang.Object) r2, (java.lang.Object) r3)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r2)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x04e9:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzhp r2 = r12.zza((int) r3)     // Catch:{ zzfz -> 0x059d }
            java.lang.Object r2 = r14.zza(r2, r15)     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r2)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x04fc:
            r12.zza((java.lang.Object) r13, (int) r4, (com.google.android.gms.internal.measurement.zzhm) r14)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x0504:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzfz -> 0x059d }
            boolean r2 = r14.zzk()     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (boolean) r2)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x0513:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzfz -> 0x059d }
            int r2 = r14.zzj()     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (int) r2)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x0522:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzfz -> 0x059d }
            long r6 = r14.zzi()     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (long) r6)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x0531:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzfz -> 0x059d }
            int r2 = r14.zzh()     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (int) r2)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x0540:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzfz -> 0x059d }
            long r6 = r14.zzf()     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (long) r6)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x054f:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzfz -> 0x059d }
            long r6 = r14.zzg()     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (long) r6)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x055e:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzfz -> 0x059d }
            float r2 = r14.zze()     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (float) r2)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x056d:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzfz -> 0x059d }
            double r6 = r14.zzd()     // Catch:{ zzfz -> 0x059d }
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r13, (long) r4, (double) r6)     // Catch:{ zzfz -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzfz -> 0x059d }
            goto L_0x0009
        L_0x057c:
            java.lang.Object r10 = r8.zza()     // Catch:{ zzfz -> 0x059d }
        L_0x0580:
            boolean r2 = r8.zza(r10, (com.google.android.gms.internal.measurement.zzhm) r14)     // Catch:{ zzfz -> 0x059d }
            if (r2 != 0) goto L_0x0009
            int r14 = r12.zzm
        L_0x0588:
            int r15 = r12.zzn
            if (r14 >= r15) goto L_0x0597
            int[] r15 = r12.zzl
            r15 = r15[r14]
            java.lang.Object r10 = r12.zza((java.lang.Object) r13, (int) r15, r10, r8)
            int r14 = r14 + 1
            goto L_0x0588
        L_0x0597:
            if (r10 == 0) goto L_0x059c
            r8.zzb((java.lang.Object) r13, r10)
        L_0x059c:
            return
        L_0x059d:
            r8.zza((com.google.android.gms.internal.measurement.zzhm) r14)     // Catch:{ all -> 0x05c4 }
            if (r10 != 0) goto L_0x05a7
            java.lang.Object r2 = r8.zzc(r13)     // Catch:{ all -> 0x05c4 }
            r10 = r2
        L_0x05a7:
            boolean r2 = r8.zza(r10, (com.google.android.gms.internal.measurement.zzhm) r14)     // Catch:{ all -> 0x05c4 }
            if (r2 != 0) goto L_0x0009
            int r14 = r12.zzm
        L_0x05af:
            int r15 = r12.zzn
            if (r14 >= r15) goto L_0x05be
            int[] r15 = r12.zzl
            r15 = r15[r14]
            java.lang.Object r10 = r12.zza((java.lang.Object) r13, (int) r15, r10, r8)
            int r14 = r14 + 1
            goto L_0x05af
        L_0x05be:
            if (r10 == 0) goto L_0x05c3
            r8.zzb((java.lang.Object) r13, r10)
        L_0x05c3:
            return
        L_0x05c4:
            r14 = move-exception
            int r15 = r12.zzm
        L_0x05c7:
            int r0 = r12.zzn
            if (r15 >= r0) goto L_0x05d6
            int[] r0 = r12.zzl
            r0 = r0[r15]
            java.lang.Object r10 = r12.zza((java.lang.Object) r13, (int) r0, r10, r8)
            int r15 = r15 + 1
            goto L_0x05c7
        L_0x05d6:
            if (r10 == 0) goto L_0x05db
            r8.zzb((java.lang.Object) r13, r10)
        L_0x05db:
            throw r14
        L_0x05dc:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzha.zza(java.lang.Object, com.google.android.gms.internal.measurement.zzhm, com.google.android.gms.internal.measurement.zzfb):void");
    }

    private static zzig zze(Object obj) {
        zzfo zzfo = (zzfo) obj;
        zzig zzig = zzfo.zzb;
        if (zzig != zzig.zza()) {
            return zzig;
        }
        zzig zzb2 = zzig.zzb();
        zzfo.zzb = zzb2;
        return zzb2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r2 + 8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zza(byte[] r1, int r2, int r3, com.google.android.gms.internal.measurement.zziu r4, java.lang.Class<?> r5, com.google.android.gms.internal.measurement.zzeb r6) throws java.io.IOException {
        /*
            int[] r0 = com.google.android.gms.internal.measurement.zzhd.zza
            int r4 = r4.ordinal()
            r4 = r0[r4]
            switch(r4) {
                case 1: goto L_0x009a;
                case 2: goto L_0x0095;
                case 3: goto L_0x0088;
                case 4: goto L_0x007b;
                case 5: goto L_0x007b;
                case 6: goto L_0x0070;
                case 7: goto L_0x0070;
                case 8: goto L_0x0065;
                case 9: goto L_0x0058;
                case 10: goto L_0x0058;
                case 11: goto L_0x0058;
                case 12: goto L_0x004b;
                case 13: goto L_0x004b;
                case 14: goto L_0x003e;
                case 15: goto L_0x002c;
                case 16: goto L_0x001a;
                case 17: goto L_0x0014;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "unsupported field type."
            r1.<init>(r2)
            throw r1
        L_0x0014:
            int r1 = com.google.android.gms.internal.measurement.zzec.zzd(r1, r2, r6)
            goto L_0x00af
        L_0x001a:
            int r1 = com.google.android.gms.internal.measurement.zzec.zzb(r1, r2, r6)
            long r2 = r6.zzb
            long r2 = com.google.android.gms.internal.measurement.zzes.zza((long) r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.zzc = r2
            goto L_0x00af
        L_0x002c:
            int r1 = com.google.android.gms.internal.measurement.zzec.zza(r1, r2, r6)
            int r2 = r6.zza
            int r2 = com.google.android.gms.internal.measurement.zzes.zze(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.zzc = r2
            goto L_0x00af
        L_0x003e:
            com.google.android.gms.internal.measurement.zzhl r4 = com.google.android.gms.internal.measurement.zzhl.zza()
            com.google.android.gms.internal.measurement.zzhp r4 = r4.zza(r5)
            int r1 = com.google.android.gms.internal.measurement.zzec.zza((com.google.android.gms.internal.measurement.zzhp) r4, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.measurement.zzeb) r6)
            goto L_0x00af
        L_0x004b:
            int r1 = com.google.android.gms.internal.measurement.zzec.zzb(r1, r2, r6)
            long r2 = r6.zzb
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.zzc = r2
            goto L_0x00af
        L_0x0058:
            int r1 = com.google.android.gms.internal.measurement.zzec.zza(r1, r2, r6)
            int r2 = r6.zza
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.zzc = r2
            goto L_0x00af
        L_0x0065:
            float r1 = com.google.android.gms.internal.measurement.zzec.zzd(r1, r2)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r6.zzc = r1
            goto L_0x0085
        L_0x0070:
            long r3 = com.google.android.gms.internal.measurement.zzec.zzb(r1, r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r6.zzc = r1
            goto L_0x0092
        L_0x007b:
            int r1 = com.google.android.gms.internal.measurement.zzec.zza(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.zzc = r1
        L_0x0085:
            int r1 = r2 + 4
            goto L_0x00af
        L_0x0088:
            double r3 = com.google.android.gms.internal.measurement.zzec.zzc(r1, r2)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r6.zzc = r1
        L_0x0092:
            int r1 = r2 + 8
            goto L_0x00af
        L_0x0095:
            int r1 = com.google.android.gms.internal.measurement.zzec.zze(r1, r2, r6)
            goto L_0x00af
        L_0x009a:
            int r1 = com.google.android.gms.internal.measurement.zzec.zzb(r1, r2, r6)
            long r2 = r6.zzb
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x00a8
            r2 = 1
            goto L_0x00a9
        L_0x00a8:
            r2 = 0
        L_0x00a9:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6.zzc = r2
        L_0x00af:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzha.zza(byte[], int, int, com.google.android.gms.internal.measurement.zziu, java.lang.Class, com.google.android.gms.internal.measurement.zzeb):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0423 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01eb  */
    private final int zza(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.measurement.zzeb r30) throws java.io.IOException {
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
            sun.misc.Unsafe r11 = zzb
            java.lang.Object r11 = r11.getObject(r1, r9)
            com.google.android.gms.internal.measurement.zzfx r11 = (com.google.android.gms.internal.measurement.zzfx) r11
            boolean r12 = r11.zza()
            r13 = 1
            if (r12 != 0) goto L_0x0036
            int r12 = r11.size()
            if (r12 != 0) goto L_0x002c
            r12 = 10
            goto L_0x002d
        L_0x002c:
            int r12 = r12 << r13
        L_0x002d:
            com.google.android.gms.internal.measurement.zzfx r11 = r11.zza(r12)
            sun.misc.Unsafe r12 = zzb
            r12.putObject(r1, r9, r11)
        L_0x0036:
            r9 = 5
            r14 = 0
            r10 = 2
            switch(r27) {
                case 18: goto L_0x03e4;
                case 19: goto L_0x03a6;
                case 20: goto L_0x0365;
                case 21: goto L_0x0365;
                case 22: goto L_0x034b;
                case 23: goto L_0x030c;
                case 24: goto L_0x02cd;
                case 25: goto L_0x0276;
                case 26: goto L_0x01c3;
                case 27: goto L_0x01a9;
                case 28: goto L_0x0151;
                case 29: goto L_0x034b;
                case 30: goto L_0x0119;
                case 31: goto L_0x02cd;
                case 32: goto L_0x030c;
                case 33: goto L_0x00cc;
                case 34: goto L_0x007f;
                case 35: goto L_0x03e4;
                case 36: goto L_0x03a6;
                case 37: goto L_0x0365;
                case 38: goto L_0x0365;
                case 39: goto L_0x034b;
                case 40: goto L_0x030c;
                case 41: goto L_0x02cd;
                case 42: goto L_0x0276;
                case 43: goto L_0x034b;
                case 44: goto L_0x0119;
                case 45: goto L_0x02cd;
                case 46: goto L_0x030c;
                case 47: goto L_0x00cc;
                case 48: goto L_0x007f;
                case 49: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0422
        L_0x003f:
            r1 = 3
            if (r6 != r1) goto L_0x0422
            com.google.android.gms.internal.measurement.zzhp r1 = r0.zza((int) r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.google.android.gms.internal.measurement.zzec.zza((com.google.android.gms.internal.measurement.zzhp) r22, (byte[]) r23, (int) r24, (int) r25, (int) r26, (com.google.android.gms.internal.measurement.zzeb) r27)
            java.lang.Object r8 = r7.zzc
            r11.add(r8)
        L_0x005f:
            if (r4 >= r5) goto L_0x0422
            int r8 = com.google.android.gms.internal.measurement.zzec.zza(r3, r4, r7)
            int r9 = r7.zza
            if (r2 != r9) goto L_0x0422
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.google.android.gms.internal.measurement.zzec.zza((com.google.android.gms.internal.measurement.zzhp) r22, (byte[]) r23, (int) r24, (int) r25, (int) r26, (com.google.android.gms.internal.measurement.zzeb) r27)
            java.lang.Object r8 = r7.zzc
            r11.add(r8)
            goto L_0x005f
        L_0x007f:
            if (r6 != r10) goto L_0x00a3
            com.google.android.gms.internal.measurement.zzgk r11 = (com.google.android.gms.internal.measurement.zzgk) r11
            int r1 = com.google.android.gms.internal.measurement.zzec.zza(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x008a:
            if (r1 >= r2) goto L_0x009a
            int r1 = com.google.android.gms.internal.measurement.zzec.zzb(r3, r1, r7)
            long r4 = r7.zzb
            long r4 = com.google.android.gms.internal.measurement.zzes.zza((long) r4)
            r11.zza((long) r4)
            goto L_0x008a
        L_0x009a:
            if (r1 != r2) goto L_0x009e
            goto L_0x0423
        L_0x009e:
            com.google.android.gms.internal.measurement.zzfw r1 = com.google.android.gms.internal.measurement.zzfw.zza()
            throw r1
        L_0x00a3:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.measurement.zzgk r11 = (com.google.android.gms.internal.measurement.zzgk) r11
            int r1 = com.google.android.gms.internal.measurement.zzec.zzb(r3, r4, r7)
            long r8 = r7.zzb
            long r8 = com.google.android.gms.internal.measurement.zzes.zza((long) r8)
            r11.zza((long) r8)
        L_0x00b4:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.zzec.zza(r3, r1, r7)
            int r6 = r7.zza
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.measurement.zzec.zzb(r3, r4, r7)
            long r8 = r7.zzb
            long r8 = com.google.android.gms.internal.measurement.zzes.zza((long) r8)
            r11.zza((long) r8)
            goto L_0x00b4
        L_0x00cc:
            if (r6 != r10) goto L_0x00f0
            com.google.android.gms.internal.measurement.zzfp r11 = (com.google.android.gms.internal.measurement.zzfp) r11
            int r1 = com.google.android.gms.internal.measurement.zzec.zza(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x00d7:
            if (r1 >= r2) goto L_0x00e7
            int r1 = com.google.android.gms.internal.measurement.zzec.zza(r3, r1, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.measurement.zzes.zze(r4)
            r11.zzd(r4)
            goto L_0x00d7
        L_0x00e7:
            if (r1 != r2) goto L_0x00eb
            goto L_0x0423
        L_0x00eb:
            com.google.android.gms.internal.measurement.zzfw r1 = com.google.android.gms.internal.measurement.zzfw.zza()
            throw r1
        L_0x00f0:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.measurement.zzfp r11 = (com.google.android.gms.internal.measurement.zzfp) r11
            int r1 = com.google.android.gms.internal.measurement.zzec.zza(r3, r4, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.measurement.zzes.zze(r4)
            r11.zzd(r4)
        L_0x0101:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.zzec.zza(r3, r1, r7)
            int r6 = r7.zza
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.measurement.zzec.zza(r3, r4, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.measurement.zzes.zze(r4)
            r11.zzd(r4)
            goto L_0x0101
        L_0x0119:
            if (r6 != r10) goto L_0x0120
            int r2 = com.google.android.gms.internal.measurement.zzec.zza((byte[]) r3, (int) r4, (com.google.android.gms.internal.measurement.zzfx<?>) r11, (com.google.android.gms.internal.measurement.zzeb) r7)
            goto L_0x0131
        L_0x0120:
            if (r6 != 0) goto L_0x0422
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r11
            r7 = r30
            int r2 = com.google.android.gms.internal.measurement.zzec.zza((int) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.measurement.zzfx<?>) r6, (com.google.android.gms.internal.measurement.zzeb) r7)
        L_0x0131:
            com.google.android.gms.internal.measurement.zzfo r1 = (com.google.android.gms.internal.measurement.zzfo) r1
            com.google.android.gms.internal.measurement.zzig r3 = r1.zzb
            com.google.android.gms.internal.measurement.zzig r4 = com.google.android.gms.internal.measurement.zzig.zza()
            if (r3 != r4) goto L_0x013c
            r3 = 0
        L_0x013c:
            com.google.android.gms.internal.measurement.zzfs r4 = r0.zzc((int) r8)
            com.google.android.gms.internal.measurement.zzih<?, ?> r5 = r0.zzq
            r6 = r22
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzhr.zza(r6, r11, r4, r3, r5)
            com.google.android.gms.internal.measurement.zzig r3 = (com.google.android.gms.internal.measurement.zzig) r3
            if (r3 == 0) goto L_0x014e
            r1.zzb = r3
        L_0x014e:
            r1 = r2
            goto L_0x0423
        L_0x0151:
            if (r6 != r10) goto L_0x0422
            int r1 = com.google.android.gms.internal.measurement.zzec.zza(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x01a4
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x019f
            if (r4 != 0) goto L_0x0167
            com.google.android.gms.internal.measurement.zzeg r4 = com.google.android.gms.internal.measurement.zzeg.zza
            r11.add(r4)
            goto L_0x016f
        L_0x0167:
            com.google.android.gms.internal.measurement.zzeg r6 = com.google.android.gms.internal.measurement.zzeg.zza((byte[]) r3, (int) r1, (int) r4)
            r11.add(r6)
        L_0x016e:
            int r1 = r1 + r4
        L_0x016f:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.zzec.zza(r3, r1, r7)
            int r6 = r7.zza
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.measurement.zzec.zza(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x019a
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0195
            if (r4 != 0) goto L_0x018d
            com.google.android.gms.internal.measurement.zzeg r4 = com.google.android.gms.internal.measurement.zzeg.zza
            r11.add(r4)
            goto L_0x016f
        L_0x018d:
            com.google.android.gms.internal.measurement.zzeg r6 = com.google.android.gms.internal.measurement.zzeg.zza((byte[]) r3, (int) r1, (int) r4)
            r11.add(r6)
            goto L_0x016e
        L_0x0195:
            com.google.android.gms.internal.measurement.zzfw r1 = com.google.android.gms.internal.measurement.zzfw.zza()
            throw r1
        L_0x019a:
            com.google.android.gms.internal.measurement.zzfw r1 = com.google.android.gms.internal.measurement.zzfw.zzb()
            throw r1
        L_0x019f:
            com.google.android.gms.internal.measurement.zzfw r1 = com.google.android.gms.internal.measurement.zzfw.zza()
            throw r1
        L_0x01a4:
            com.google.android.gms.internal.measurement.zzfw r1 = com.google.android.gms.internal.measurement.zzfw.zzb()
            throw r1
        L_0x01a9:
            if (r6 != r10) goto L_0x0422
            com.google.android.gms.internal.measurement.zzhp r1 = r0.zza((int) r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r11
            r28 = r30
            int r1 = com.google.android.gms.internal.measurement.zzec.zza(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0423
        L_0x01c3:
            if (r6 != r10) goto L_0x0422
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            int r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x0216
            int r1 = com.google.android.gms.internal.measurement.zzec.zza(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x0211
            if (r4 != 0) goto L_0x01de
            r11.add(r6)
            goto L_0x01e9
        L_0x01de:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.zzfr.zza
            r8.<init>(r3, r1, r4, r9)
            r11.add(r8)
        L_0x01e8:
            int r1 = r1 + r4
        L_0x01e9:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.zzec.zza(r3, r1, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x0423
            int r1 = com.google.android.gms.internal.measurement.zzec.zza(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x020c
            if (r4 != 0) goto L_0x0201
            r11.add(r6)
            goto L_0x01e9
        L_0x0201:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.zzfr.zza
            r8.<init>(r3, r1, r4, r9)
            r11.add(r8)
            goto L_0x01e8
        L_0x020c:
            com.google.android.gms.internal.measurement.zzfw r1 = com.google.android.gms.internal.measurement.zzfw.zzb()
            throw r1
        L_0x0211:
            com.google.android.gms.internal.measurement.zzfw r1 = com.google.android.gms.internal.measurement.zzfw.zzb()
            throw r1
        L_0x0216:
            int r1 = com.google.android.gms.internal.measurement.zzec.zza(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x0271
            if (r4 != 0) goto L_0x0224
            r11.add(r6)
            goto L_0x0237
        L_0x0224:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.measurement.zzip.zza((byte[]) r3, (int) r1, (int) r8)
            if (r9 == 0) goto L_0x026c
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.zzfr.zza
            r9.<init>(r3, r1, r4, r10)
            r11.add(r9)
        L_0x0236:
            r1 = r8
        L_0x0237:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.zzec.zza(r3, r1, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x0423
            int r1 = com.google.android.gms.internal.measurement.zzec.zza(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x0267
            if (r4 != 0) goto L_0x024f
            r11.add(r6)
            goto L_0x0237
        L_0x024f:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.measurement.zzip.zza((byte[]) r3, (int) r1, (int) r8)
            if (r9 == 0) goto L_0x0262
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.zzfr.zza
            r9.<init>(r3, r1, r4, r10)
            r11.add(r9)
            goto L_0x0236
        L_0x0262:
            com.google.android.gms.internal.measurement.zzfw r1 = com.google.android.gms.internal.measurement.zzfw.zzh()
            throw r1
        L_0x0267:
            com.google.android.gms.internal.measurement.zzfw r1 = com.google.android.gms.internal.measurement.zzfw.zzb()
            throw r1
        L_0x026c:
            com.google.android.gms.internal.measurement.zzfw r1 = com.google.android.gms.internal.measurement.zzfw.zzh()
            throw r1
        L_0x0271:
            com.google.android.gms.internal.measurement.zzfw r1 = com.google.android.gms.internal.measurement.zzfw.zzb()
            throw r1
        L_0x0276:
            r1 = 0
            if (r6 != r10) goto L_0x029e
            com.google.android.gms.internal.measurement.zzee r11 = (com.google.android.gms.internal.measurement.zzee) r11
            int r2 = com.google.android.gms.internal.measurement.zzec.zza(r3, r4, r7)
            int r4 = r7.zza
            int r4 = r4 + r2
        L_0x0282:
            if (r2 >= r4) goto L_0x0295
            int r2 = com.google.android.gms.internal.measurement.zzec.zzb(r3, r2, r7)
            long r5 = r7.zzb
            int r5 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x0290
            r5 = r13
            goto L_0x0291
        L_0x0290:
            r5 = r1
        L_0x0291:
            r11.zza((boolean) r5)
            goto L_0x0282
        L_0x0295:
            if (r2 != r4) goto L_0x0299
            goto L_0x014e
        L_0x0299:
            com.google.android.gms.internal.measurement.zzfw r1 = com.google.android.gms.internal.measurement.zzfw.zza()
            throw r1
        L_0x029e:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.measurement.zzee r11 = (com.google.android.gms.internal.measurement.zzee) r11
            int r4 = com.google.android.gms.internal.measurement.zzec.zzb(r3, r4, r7)
            long r8 = r7.zzb
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x02ae
            r6 = r13
            goto L_0x02af
        L_0x02ae:
            r6 = r1
        L_0x02af:
            r11.zza((boolean) r6)
        L_0x02b2:
            if (r4 >= r5) goto L_0x0422
            int r6 = com.google.android.gms.internal.measurement.zzec.zza(r3, r4, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x0422
            int r4 = com.google.android.gms.internal.measurement.zzec.zzb(r3, r6, r7)
            long r8 = r7.zzb
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x02c8
            r6 = r13
            goto L_0x02c9
        L_0x02c8:
            r6 = r1
        L_0x02c9:
            r11.zza((boolean) r6)
            goto L_0x02b2
        L_0x02cd:
            if (r6 != r10) goto L_0x02ed
            com.google.android.gms.internal.measurement.zzfp r11 = (com.google.android.gms.internal.measurement.zzfp) r11
            int r1 = com.google.android.gms.internal.measurement.zzec.zza(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x02d8:
            if (r1 >= r2) goto L_0x02e4
            int r4 = com.google.android.gms.internal.measurement.zzec.zza(r3, r1)
            r11.zzd(r4)
            int r1 = r1 + 4
            goto L_0x02d8
        L_0x02e4:
            if (r1 != r2) goto L_0x02e8
            goto L_0x0423
        L_0x02e8:
            com.google.android.gms.internal.measurement.zzfw r1 = com.google.android.gms.internal.measurement.zzfw.zza()
            throw r1
        L_0x02ed:
            if (r6 != r9) goto L_0x0422
            com.google.android.gms.internal.measurement.zzfp r11 = (com.google.android.gms.internal.measurement.zzfp) r11
            int r1 = com.google.android.gms.internal.measurement.zzec.zza(r18, r19)
            r11.zzd(r1)
        L_0x02f8:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.zzec.zza(r3, r1, r7)
            int r6 = r7.zza
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.measurement.zzec.zza(r3, r4)
            r11.zzd(r1)
            goto L_0x02f8
        L_0x030c:
            if (r6 != r10) goto L_0x032c
            com.google.android.gms.internal.measurement.zzgk r11 = (com.google.android.gms.internal.measurement.zzgk) r11
            int r1 = com.google.android.gms.internal.measurement.zzec.zza(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0317:
            if (r1 >= r2) goto L_0x0323
            long r4 = com.google.android.gms.internal.measurement.zzec.zzb(r3, r1)
            r11.zza((long) r4)
            int r1 = r1 + 8
            goto L_0x0317
        L_0x0323:
            if (r1 != r2) goto L_0x0327
            goto L_0x0423
        L_0x0327:
            com.google.android.gms.internal.measurement.zzfw r1 = com.google.android.gms.internal.measurement.zzfw.zza()
            throw r1
        L_0x032c:
            if (r6 != r13) goto L_0x0422
            com.google.android.gms.internal.measurement.zzgk r11 = (com.google.android.gms.internal.measurement.zzgk) r11
            long r8 = com.google.android.gms.internal.measurement.zzec.zzb(r18, r19)
            r11.zza((long) r8)
        L_0x0337:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.zzec.zza(r3, r1, r7)
            int r6 = r7.zza
            if (r2 != r6) goto L_0x0423
            long r8 = com.google.android.gms.internal.measurement.zzec.zzb(r3, r4)
            r11.zza((long) r8)
            goto L_0x0337
        L_0x034b:
            if (r6 != r10) goto L_0x0353
            int r1 = com.google.android.gms.internal.measurement.zzec.zza((byte[]) r3, (int) r4, (com.google.android.gms.internal.measurement.zzfx<?>) r11, (com.google.android.gms.internal.measurement.zzeb) r7)
            goto L_0x0423
        L_0x0353:
            if (r6 != 0) goto L_0x0422
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r11
            r26 = r30
            int r1 = com.google.android.gms.internal.measurement.zzec.zza((int) r21, (byte[]) r22, (int) r23, (int) r24, (com.google.android.gms.internal.measurement.zzfx<?>) r25, (com.google.android.gms.internal.measurement.zzeb) r26)
            goto L_0x0423
        L_0x0365:
            if (r6 != r10) goto L_0x0385
            com.google.android.gms.internal.measurement.zzgk r11 = (com.google.android.gms.internal.measurement.zzgk) r11
            int r1 = com.google.android.gms.internal.measurement.zzec.zza(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0370:
            if (r1 >= r2) goto L_0x037c
            int r1 = com.google.android.gms.internal.measurement.zzec.zzb(r3, r1, r7)
            long r4 = r7.zzb
            r11.zza((long) r4)
            goto L_0x0370
        L_0x037c:
            if (r1 != r2) goto L_0x0380
            goto L_0x0423
        L_0x0380:
            com.google.android.gms.internal.measurement.zzfw r1 = com.google.android.gms.internal.measurement.zzfw.zza()
            throw r1
        L_0x0385:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.measurement.zzgk r11 = (com.google.android.gms.internal.measurement.zzgk) r11
            int r1 = com.google.android.gms.internal.measurement.zzec.zzb(r3, r4, r7)
            long r8 = r7.zzb
            r11.zza((long) r8)
        L_0x0392:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.zzec.zza(r3, r1, r7)
            int r6 = r7.zza
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.measurement.zzec.zzb(r3, r4, r7)
            long r8 = r7.zzb
            r11.zza((long) r8)
            goto L_0x0392
        L_0x03a6:
            if (r6 != r10) goto L_0x03c5
            com.google.android.gms.internal.measurement.zzfk r11 = (com.google.android.gms.internal.measurement.zzfk) r11
            int r1 = com.google.android.gms.internal.measurement.zzec.zza(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x03b1:
            if (r1 >= r2) goto L_0x03bd
            float r4 = com.google.android.gms.internal.measurement.zzec.zzd(r3, r1)
            r11.zza((float) r4)
            int r1 = r1 + 4
            goto L_0x03b1
        L_0x03bd:
            if (r1 != r2) goto L_0x03c0
            goto L_0x0423
        L_0x03c0:
            com.google.android.gms.internal.measurement.zzfw r1 = com.google.android.gms.internal.measurement.zzfw.zza()
            throw r1
        L_0x03c5:
            if (r6 != r9) goto L_0x0422
            com.google.android.gms.internal.measurement.zzfk r11 = (com.google.android.gms.internal.measurement.zzfk) r11
            float r1 = com.google.android.gms.internal.measurement.zzec.zzd(r18, r19)
            r11.zza((float) r1)
        L_0x03d0:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.zzec.zza(r3, r1, r7)
            int r6 = r7.zza
            if (r2 != r6) goto L_0x0423
            float r1 = com.google.android.gms.internal.measurement.zzec.zzd(r3, r4)
            r11.zza((float) r1)
            goto L_0x03d0
        L_0x03e4:
            if (r6 != r10) goto L_0x0403
            com.google.android.gms.internal.measurement.zzfa r11 = (com.google.android.gms.internal.measurement.zzfa) r11
            int r1 = com.google.android.gms.internal.measurement.zzec.zza(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x03ef:
            if (r1 >= r2) goto L_0x03fb
            double r4 = com.google.android.gms.internal.measurement.zzec.zzc(r3, r1)
            r11.zza((double) r4)
            int r1 = r1 + 8
            goto L_0x03ef
        L_0x03fb:
            if (r1 != r2) goto L_0x03fe
            goto L_0x0423
        L_0x03fe:
            com.google.android.gms.internal.measurement.zzfw r1 = com.google.android.gms.internal.measurement.zzfw.zza()
            throw r1
        L_0x0403:
            if (r6 != r13) goto L_0x0422
            com.google.android.gms.internal.measurement.zzfa r11 = (com.google.android.gms.internal.measurement.zzfa) r11
            double r8 = com.google.android.gms.internal.measurement.zzec.zzc(r18, r19)
            r11.zza((double) r8)
        L_0x040e:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.zzec.zza(r3, r1, r7)
            int r6 = r7.zza
            if (r2 != r6) goto L_0x0423
            double r8 = com.google.android.gms.internal.measurement.zzec.zzc(r3, r4)
            r11.zza((double) r8)
            goto L_0x040e
        L_0x0422:
            r1 = r4
        L_0x0423:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzha.zza(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.zzeb):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <K, V> int zza(T r8, byte[] r9, int r10, int r11, int r12, long r13, com.google.android.gms.internal.measurement.zzeb r15) throws java.io.IOException {
        /*
            r7 = this;
            sun.misc.Unsafe r0 = zzb
            java.lang.Object r12 = r7.zzb((int) r12)
            java.lang.Object r1 = r0.getObject(r8, r13)
            com.google.android.gms.internal.measurement.zzgt r2 = r7.zzs
            boolean r2 = r2.zzd(r1)
            if (r2 == 0) goto L_0x0021
            com.google.android.gms.internal.measurement.zzgt r2 = r7.zzs
            java.lang.Object r2 = r2.zzf(r12)
            com.google.android.gms.internal.measurement.zzgt r3 = r7.zzs
            r3.zza(r2, r1)
            r0.putObject(r8, r13, r2)
            r1 = r2
        L_0x0021:
            com.google.android.gms.internal.measurement.zzgt r8 = r7.zzs
            com.google.android.gms.internal.measurement.zzgr r8 = r8.zzb(r12)
            com.google.android.gms.internal.measurement.zzgt r12 = r7.zzs
            java.util.Map r12 = r12.zza(r1)
            int r10 = com.google.android.gms.internal.measurement.zzec.zza(r9, r10, r15)
            int r13 = r15.zza
            if (r13 < 0) goto L_0x0097
            int r14 = r11 - r10
            if (r13 > r14) goto L_0x0097
            int r13 = r13 + r10
            K r14 = r8.zzb
            V r0 = r8.zzd
        L_0x003e:
            if (r10 >= r13) goto L_0x008c
            int r1 = r10 + 1
            byte r10 = r9[r10]
            if (r10 >= 0) goto L_0x004c
            int r1 = com.google.android.gms.internal.measurement.zzec.zza((int) r10, (byte[]) r9, (int) r1, (com.google.android.gms.internal.measurement.zzeb) r15)
            int r10 = r15.zza
        L_0x004c:
            r2 = r1
            int r1 = r10 >>> 3
            r3 = r10 & 7
            r4 = 1
            if (r1 == r4) goto L_0x0072
            r4 = 2
            if (r1 == r4) goto L_0x0058
            goto L_0x0087
        L_0x0058:
            com.google.android.gms.internal.measurement.zziu r1 = r8.zzc
            int r1 = r1.zzb()
            if (r3 != r1) goto L_0x0087
            com.google.android.gms.internal.measurement.zziu r4 = r8.zzc
            V r10 = r8.zzd
            java.lang.Class r5 = r10.getClass()
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = zza((byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.measurement.zziu) r4, (java.lang.Class<?>) r5, (com.google.android.gms.internal.measurement.zzeb) r6)
            java.lang.Object r0 = r15.zzc
            goto L_0x003e
        L_0x0072:
            com.google.android.gms.internal.measurement.zziu r1 = r8.zza
            int r1 = r1.zzb()
            if (r3 != r1) goto L_0x0087
            com.google.android.gms.internal.measurement.zziu r4 = r8.zza
            r5 = 0
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = zza((byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.measurement.zziu) r4, (java.lang.Class<?>) r5, (com.google.android.gms.internal.measurement.zzeb) r6)
            java.lang.Object r14 = r15.zzc
            goto L_0x003e
        L_0x0087:
            int r10 = com.google.android.gms.internal.measurement.zzec.zza((int) r10, (byte[]) r9, (int) r2, (int) r11, (com.google.android.gms.internal.measurement.zzeb) r15)
            goto L_0x003e
        L_0x008c:
            if (r10 != r13) goto L_0x0092
            r12.put(r14, r0)
            return r13
        L_0x0092:
            com.google.android.gms.internal.measurement.zzfw r8 = com.google.android.gms.internal.measurement.zzfw.zzg()
            throw r8
        L_0x0097:
            com.google.android.gms.internal.measurement.zzfw r8 = com.google.android.gms.internal.measurement.zzfw.zza()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzha.zza(java.lang.Object, byte[], int, int, int, long, com.google.android.gms.internal.measurement.zzeb):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018a, code lost:
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x019b, code lost:
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019d, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zza(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.measurement.zzeb r29) throws java.io.IOException {
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
            sun.misc.Unsafe r12 = zzb
            int[] r7 = r0.zzc
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x018d;
                case 52: goto L_0x017d;
                case 53: goto L_0x016d;
                case 54: goto L_0x016d;
                case 55: goto L_0x015d;
                case 56: goto L_0x014e;
                case 57: goto L_0x0140;
                case 58: goto L_0x0127;
                case 59: goto L_0x00f3;
                case 60: goto L_0x00c5;
                case 61: goto L_0x00b8;
                case 62: goto L_0x015d;
                case 63: goto L_0x008a;
                case 64: goto L_0x0140;
                case 65: goto L_0x014e;
                case 66: goto L_0x0075;
                case 67: goto L_0x0060;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x01a1
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x01a1
            com.google.android.gms.internal.measurement.zzhp r5 = r0.zza((int) r6)
            r2 = r2 & -8
            r6 = r2 | 4
            r2 = r5
            r3 = r18
            r4 = r19
            r5 = r20
            r7 = r29
            int r2 = com.google.android.gms.internal.measurement.zzec.zza((com.google.android.gms.internal.measurement.zzhp) r2, (byte[]) r3, (int) r4, (int) r5, (int) r6, (com.google.android.gms.internal.measurement.zzeb) r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            if (r15 != 0) goto L_0x0055
            java.lang.Object r3 = r11.zzc
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0055:
            java.lang.Object r3 = r11.zzc
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzfr.zza((java.lang.Object) r15, (java.lang.Object) r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0060:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.measurement.zzec.zzb(r3, r4, r11)
            long r3 = r11.zzb
            long r3 = com.google.android.gms.internal.measurement.zzes.zza((long) r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0075:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.measurement.zzec.zza(r3, r4, r11)
            int r3 = r11.zza
            int r3 = com.google.android.gms.internal.measurement.zzes.zze(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x008a:
            if (r5 != 0) goto L_0x01a1
            int r3 = com.google.android.gms.internal.measurement.zzec.zza(r3, r4, r11)
            int r4 = r11.zza
            com.google.android.gms.internal.measurement.zzfs r5 = r0.zzc((int) r6)
            if (r5 == 0) goto L_0x00ae
            boolean r5 = r5.zza(r4)
            if (r5 == 0) goto L_0x009f
            goto L_0x00ae
        L_0x009f:
            com.google.android.gms.internal.measurement.zzig r1 = zze((java.lang.Object) r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.zza((int) r2, (java.lang.Object) r4)
            r2 = r3
            goto L_0x01a2
        L_0x00ae:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x019d
        L_0x00b8:
            if (r5 != r15) goto L_0x01a1
            int r2 = com.google.android.gms.internal.measurement.zzec.zze(r3, r4, r11)
            java.lang.Object r3 = r11.zzc
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x00c5:
            if (r5 != r15) goto L_0x01a1
            com.google.android.gms.internal.measurement.zzhp r2 = r0.zza((int) r6)
            r5 = r20
            int r2 = com.google.android.gms.internal.measurement.zzec.zza((com.google.android.gms.internal.measurement.zzhp) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.measurement.zzeb) r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00dc
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00dd
        L_0x00dc:
            r15 = 0
        L_0x00dd:
            if (r15 != 0) goto L_0x00e5
            java.lang.Object r3 = r11.zzc
            r12.putObject(r1, r9, r3)
            goto L_0x00ee
        L_0x00e5:
            java.lang.Object r3 = r11.zzc
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzfr.zza((java.lang.Object) r15, (java.lang.Object) r3)
            r12.putObject(r1, r9, r3)
        L_0x00ee:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x00f3:
            if (r5 != r15) goto L_0x01a1
            int r2 = com.google.android.gms.internal.measurement.zzec.zza(r3, r4, r11)
            int r4 = r11.zza
            if (r4 != 0) goto L_0x0103
            java.lang.String r3 = ""
            r12.putObject(r1, r9, r3)
            goto L_0x0122
        L_0x0103:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x0117
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.measurement.zzip.zza((byte[]) r3, (int) r2, (int) r5)
            if (r5 == 0) goto L_0x0112
            goto L_0x0117
        L_0x0112:
            com.google.android.gms.internal.measurement.zzfw r1 = com.google.android.gms.internal.measurement.zzfw.zzh()
            throw r1
        L_0x0117:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.measurement.zzfr.zza
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x0122:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x0127:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.measurement.zzec.zzb(r3, r4, r11)
            long r3 = r11.zzb
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0137
            r15 = 1
            goto L_0x0138
        L_0x0137:
            r15 = 0
        L_0x0138:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0140:
            if (r5 != r7) goto L_0x01a1
            int r2 = com.google.android.gms.internal.measurement.zzec.zza(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x018a
        L_0x014e:
            r2 = 1
            if (r5 != r2) goto L_0x01a1
            long r2 = com.google.android.gms.internal.measurement.zzec.zzb(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x019b
        L_0x015d:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.measurement.zzec.zza(r3, r4, r11)
            int r3 = r11.zza
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x016d:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.measurement.zzec.zzb(r3, r4, r11)
            long r3 = r11.zzb
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x017d:
            if (r5 != r7) goto L_0x01a1
            float r2 = com.google.android.gms.internal.measurement.zzec.zzd(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x018a:
            int r2 = r4 + 4
            goto L_0x019d
        L_0x018d:
            r2 = 1
            if (r5 != r2) goto L_0x01a1
            double r2 = com.google.android.gms.internal.measurement.zzec.zzc(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x019b:
            int r2 = r4 + 8
        L_0x019d:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x01a1:
            r2 = r4
        L_0x01a2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzha.zza(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.measurement.zzeb):int");
    }

    private final zzhp zza(int i) {
        int i2 = (i / 3) << 1;
        zzhp zzhp = (zzhp) this.zzd[i2];
        if (zzhp != null) {
            return zzhp;
        }
        zzhp zza2 = zzhl.zza().zza((Class) this.zzd[i2 + 1]);
        this.zzd[i2] = zza2;
        return zza2;
    }

    private final Object zzb(int i) {
        return this.zzd[(i / 3) << 1];
    }

    private final zzfs zzc(int i) {
        return (zzfs) this.zzd[((i / 3) << 1) + 1];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v59, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v81, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009b, code lost:
        r10 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x022f, code lost:
        r1 = r12 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0231, code lost:
        r9 = r30;
        r2 = r8;
        r28 = r11;
        r19 = r15;
        r8 = r33;
        r15 = r5;
        r5 = r6;
        r6 = r1;
        r1 = r7;
        r7 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0298, code lost:
        r12 = r12 | r22;
        r0 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02cf, code lost:
        r12 = r12 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02d2, code lost:
        r9 = r30;
        r5 = r6;
        r1 = r7;
        r2 = r8;
        r28 = r11;
        r6 = r12;
        r7 = r13;
        r19 = r15;
        r8 = r33;
        r15 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02e3, code lost:
        r27 = r33;
        r2 = r4;
        r20 = r6;
        r28 = r11;
        r7 = r13;
        r19 = r15;
        r15 = r34;
        r6 = r35;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v5, types: [int, byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(T r31, byte[] r32, int r33, int r34, int r35, com.google.android.gms.internal.measurement.zzeb r36) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r32
            r12 = r34
            r13 = r36
            sun.misc.Unsafe r11 = zzb
            r16 = 0
            r7 = r31
            r0 = r33
            r1 = r35
            r8 = r15
            r3 = r16
            r4 = r3
            r6 = r4
            r2 = -1
            r5 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001b:
            if (r0 >= r12) goto L_0x04a0
            int r4 = r0 + 1
            byte r0 = r14[r0]
            if (r0 >= 0) goto L_0x002e
            int r0 = com.google.android.gms.internal.measurement.zzec.zza((int) r0, (byte[]) r14, (int) r4, (com.google.android.gms.internal.measurement.zzeb) r13)
            int r4 = r13.zza
            r29 = r4
            r4 = r0
            r0 = r29
        L_0x002e:
            int r10 = r0 >>> 3
            r9 = r0 & 7
            r33 = r0
            r0 = 3
            if (r10 <= r2) goto L_0x003d
            int r3 = r3 / r0
            int r2 = r8.zza((int) r10, (int) r3)
            goto L_0x0041
        L_0x003d:
            int r2 = r8.zzg(r10)
        L_0x0041:
            r3 = r2
            r2 = -1
            if (r3 != r2) goto L_0x0057
            r7 = r33
            r18 = r2
            r2 = r4
            r20 = r5
            r27 = r10
            r28 = r11
            r15 = r12
            r19 = r16
            r12 = r6
            r6 = r1
            goto L_0x0408
        L_0x0057:
            int[] r1 = r8.zzc
            int r18 = r3 + 1
            r0 = r1[r18]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r0 & r18
            int r15 = r18 >>> 20
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r0 & r17
            long r12 = (long) r2
            r2 = 17
            r20 = r12
            if (r15 > r2) goto L_0x02f3
            int r2 = r3 + 2
            r1 = r1[r2]
            int r2 = r1 >>> 20
            r13 = 1
            int r22 = r13 << r2
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r2
            if (r1 == r5) goto L_0x008c
            if (r5 == r2) goto L_0x0084
            long r12 = (long) r5
            r11.putInt(r7, r12, r6)
        L_0x0084:
            long r5 = (long) r1
            int r6 = r11.getInt(r7, r5)
            r12 = r6
            r6 = r1
            goto L_0x008e
        L_0x008c:
            r12 = r6
            r6 = r5
        L_0x008e:
            r1 = 5
            switch(r15) {
                case 0: goto L_0x02b6;
                case 1: goto L_0x029d;
                case 2: goto L_0x027d;
                case 3: goto L_0x027d;
                case 4: goto L_0x0264;
                case 5: goto L_0x0241;
                case 6: goto L_0x0215;
                case 7: goto L_0x01eb;
                case 8: goto L_0x01c5;
                case 9: goto L_0x018d;
                case 10: goto L_0x0172;
                case 11: goto L_0x0264;
                case 12: goto L_0x013d;
                case 13: goto L_0x0215;
                case 14: goto L_0x0241;
                case 15: goto L_0x011f;
                case 16: goto L_0x00f6;
                case 17: goto L_0x009f;
                default: goto L_0x0092;
            }
        L_0x0092:
            r13 = r33
            r19 = r2
            r15 = r3
            r33 = r10
            r18 = -1
        L_0x009b:
            r10 = r36
            goto L_0x02e3
        L_0x009f:
            r5 = 3
            if (r9 != r5) goto L_0x00ec
            com.google.android.gms.internal.measurement.zzhp r0 = r8.zza((int) r3)
            int r1 = r10 << 3
            r5 = r1 | 4
            r13 = r33
            r1 = r32
            r19 = r2
            r18 = -1
            r2 = r4
            r15 = r3
            r3 = r34
            r4 = r5
            r5 = r36
            int r0 = com.google.android.gms.internal.measurement.zzec.zza((com.google.android.gms.internal.measurement.zzhp) r0, (byte[]) r1, (int) r2, (int) r3, (int) r4, (com.google.android.gms.internal.measurement.zzeb) r5)
            r1 = r12 & r22
            if (r1 != 0) goto L_0x00cb
            r5 = r36
            r2 = r20
            java.lang.Object r1 = r5.zzc
            r11.putObject(r7, r2, r1)
            goto L_0x00dc
        L_0x00cb:
            r5 = r36
            r2 = r20
            java.lang.Object r1 = r11.getObject(r7, r2)
            java.lang.Object r4 = r5.zzc
            java.lang.Object r1 = com.google.android.gms.internal.measurement.zzfr.zza((java.lang.Object) r1, (java.lang.Object) r4)
            r11.putObject(r7, r2, r1)
        L_0x00dc:
            r1 = r12 | r22
            r12 = r34
            r2 = r10
            r4 = r13
            r3 = r15
            r15 = r30
            r13 = r5
            r5 = r6
            r6 = r1
            r1 = r35
            goto L_0x001b
        L_0x00ec:
            r13 = r33
            r19 = r2
            r15 = r3
            r18 = -1
            r33 = r10
            goto L_0x009b
        L_0x00f6:
            r13 = r33
            r5 = r36
            r19 = r2
            r15 = r3
            r2 = r20
            r18 = -1
            if (r9 != 0) goto L_0x011a
            int r9 = com.google.android.gms.internal.measurement.zzec.zzb(r14, r4, r5)
            long r0 = r5.zzb
            long r20 = com.google.android.gms.internal.measurement.zzes.zza((long) r0)
            r0 = r11
            r1 = r31
            r33 = r10
            r10 = r5
            r4 = r20
            r0.putLong(r1, r2, r4)
            goto L_0x0298
        L_0x011a:
            r33 = r10
            r10 = r5
            goto L_0x02e3
        L_0x011f:
            r13 = r33
            r19 = r2
            r15 = r3
            r33 = r10
            r2 = r20
            r18 = -1
            r10 = r36
            if (r9 != 0) goto L_0x02e3
            int r0 = com.google.android.gms.internal.measurement.zzec.zza(r14, r4, r10)
            int r1 = r10.zza
            int r1 = com.google.android.gms.internal.measurement.zzes.zze(r1)
            r11.putInt(r7, r2, r1)
            goto L_0x02cf
        L_0x013d:
            r13 = r33
            r19 = r2
            r15 = r3
            r33 = r10
            r2 = r20
            r18 = -1
            r10 = r36
            if (r9 != 0) goto L_0x02e3
            int r0 = com.google.android.gms.internal.measurement.zzec.zza(r14, r4, r10)
            int r1 = r10.zza
            com.google.android.gms.internal.measurement.zzfs r4 = r8.zzc((int) r15)
            if (r4 == 0) goto L_0x016d
            boolean r4 = r4.zza(r1)
            if (r4 == 0) goto L_0x015f
            goto L_0x016d
        L_0x015f:
            com.google.android.gms.internal.measurement.zzig r2 = zze((java.lang.Object) r31)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.zza((int) r13, (java.lang.Object) r1)
            goto L_0x02d2
        L_0x016d:
            r11.putInt(r7, r2, r1)
            goto L_0x02cf
        L_0x0172:
            r13 = r33
            r19 = r2
            r15 = r3
            r33 = r10
            r2 = r20
            r0 = 2
            r18 = -1
            r10 = r36
            if (r9 != r0) goto L_0x02e3
            int r0 = com.google.android.gms.internal.measurement.zzec.zze(r14, r4, r10)
            java.lang.Object r1 = r10.zzc
            r11.putObject(r7, r2, r1)
            goto L_0x02cf
        L_0x018d:
            r13 = r33
            r19 = r2
            r15 = r3
            r33 = r10
            r2 = r20
            r0 = 2
            r18 = -1
            r10 = r36
            if (r9 != r0) goto L_0x01c1
            com.google.android.gms.internal.measurement.zzhp r0 = r8.zza((int) r15)
            r5 = r34
            int r0 = com.google.android.gms.internal.measurement.zzec.zza((com.google.android.gms.internal.measurement.zzhp) r0, (byte[]) r14, (int) r4, (int) r5, (com.google.android.gms.internal.measurement.zzeb) r10)
            r1 = r12 & r22
            if (r1 != 0) goto L_0x01b2
            java.lang.Object r1 = r10.zzc
            r11.putObject(r7, r2, r1)
            goto L_0x022f
        L_0x01b2:
            java.lang.Object r1 = r11.getObject(r7, r2)
            java.lang.Object r4 = r10.zzc
            java.lang.Object r1 = com.google.android.gms.internal.measurement.zzfr.zza((java.lang.Object) r1, (java.lang.Object) r4)
            r11.putObject(r7, r2, r1)
            goto L_0x022f
        L_0x01c1:
            r5 = r34
            goto L_0x02e3
        L_0x01c5:
            r13 = r33
            r5 = r34
            r19 = r2
            r15 = r3
            r33 = r10
            r2 = r20
            r1 = 2
            r18 = -1
            r10 = r36
            if (r9 != r1) goto L_0x02e3
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x01e1
            int r0 = com.google.android.gms.internal.measurement.zzec.zzc(r14, r4, r10)
            goto L_0x01e5
        L_0x01e1:
            int r0 = com.google.android.gms.internal.measurement.zzec.zzd(r14, r4, r10)
        L_0x01e5:
            java.lang.Object r1 = r10.zzc
            r11.putObject(r7, r2, r1)
            goto L_0x022f
        L_0x01eb:
            r13 = r33
            r5 = r34
            r19 = r2
            r15 = r3
            r33 = r10
            r2 = r20
            r18 = -1
            r10 = r36
            if (r9 != 0) goto L_0x02e3
            int r0 = com.google.android.gms.internal.measurement.zzec.zzb(r14, r4, r10)
            r4 = r0
            long r0 = r10.zzb
            r20 = 0
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x020b
            r0 = 1
            goto L_0x020d
        L_0x020b:
            r0 = r16
        L_0x020d:
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r7, (long) r2, (boolean) r0)
            r0 = r12 | r22
            r1 = r0
            r0 = r4
            goto L_0x0231
        L_0x0215:
            r13 = r33
            r5 = r34
            r19 = r2
            r15 = r3
            r33 = r10
            r2 = r20
            r18 = -1
            r10 = r36
            if (r9 != r1) goto L_0x02e3
            int r0 = com.google.android.gms.internal.measurement.zzec.zza(r14, r4)
            r11.putInt(r7, r2, r0)
            int r0 = r4 + 4
        L_0x022f:
            r1 = r12 | r22
        L_0x0231:
            r9 = r30
            r2 = r8
            r28 = r11
            r19 = r15
            r8 = r33
            r15 = r5
            r5 = r6
            r6 = r1
            r1 = r7
            r7 = r13
            goto L_0x048c
        L_0x0241:
            r13 = r33
            r5 = r34
            r19 = r2
            r15 = r3
            r33 = r10
            r2 = r20
            r0 = 1
            r18 = -1
            r10 = r36
            if (r9 != r0) goto L_0x02e3
            long r20 = com.google.android.gms.internal.measurement.zzec.zzb(r14, r4)
            r0 = r11
            r1 = r31
            r9 = r4
            r4 = r20
            r0.putLong(r1, r2, r4)
            int r0 = r9 + 8
            goto L_0x02cf
        L_0x0264:
            r13 = r33
            r19 = r2
            r15 = r3
            r33 = r10
            r2 = r20
            r18 = -1
            r10 = r36
            if (r9 != 0) goto L_0x02e3
            int r0 = com.google.android.gms.internal.measurement.zzec.zza(r14, r4, r10)
            int r1 = r10.zza
            r11.putInt(r7, r2, r1)
            goto L_0x02cf
        L_0x027d:
            r13 = r33
            r19 = r2
            r15 = r3
            r33 = r10
            r2 = r20
            r18 = -1
            r10 = r36
            if (r9 != 0) goto L_0x02e3
            int r9 = com.google.android.gms.internal.measurement.zzec.zzb(r14, r4, r10)
            long r4 = r10.zzb
            r0 = r11
            r1 = r31
            r0.putLong(r1, r2, r4)
        L_0x0298:
            r0 = r12 | r22
            r12 = r0
            r0 = r9
            goto L_0x02d2
        L_0x029d:
            r13 = r33
            r19 = r2
            r15 = r3
            r33 = r10
            r2 = r20
            r18 = -1
            r10 = r36
            if (r9 != r1) goto L_0x02e3
            float r0 = com.google.android.gms.internal.measurement.zzec.zzd(r14, r4)
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r7, (long) r2, (float) r0)
            int r0 = r4 + 4
            goto L_0x02cf
        L_0x02b6:
            r13 = r33
            r19 = r2
            r15 = r3
            r33 = r10
            r2 = r20
            r0 = 1
            r18 = -1
            r10 = r36
            if (r9 != r0) goto L_0x02e3
            double r0 = com.google.android.gms.internal.measurement.zzec.zzc(r14, r4)
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r7, (long) r2, (double) r0)
            int r0 = r4 + 8
        L_0x02cf:
            r1 = r12 | r22
            r12 = r1
        L_0x02d2:
            r9 = r30
            r5 = r6
            r1 = r7
            r2 = r8
            r28 = r11
            r6 = r12
            r7 = r13
            r19 = r15
            r8 = r33
            r15 = r34
            goto L_0x048c
        L_0x02e3:
            r27 = r33
            r2 = r4
            r20 = r6
            r28 = r11
            r7 = r13
            r19 = r15
            r15 = r34
            r6 = r35
            goto L_0x0408
        L_0x02f3:
            r13 = r33
            r12 = r3
            r33 = r10
            r2 = r20
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r36
            r1 = 27
            if (r15 != r1) goto L_0x035e
            r1 = 2
            if (r9 != r1) goto L_0x034d
            java.lang.Object r0 = r11.getObject(r7, r2)
            com.google.android.gms.internal.measurement.zzfx r0 = (com.google.android.gms.internal.measurement.zzfx) r0
            boolean r1 = r0.zza()
            if (r1 != 0) goto L_0x0326
            int r1 = r0.size()
            if (r1 != 0) goto L_0x031d
            r1 = 10
            goto L_0x031f
        L_0x031d:
            int r1 = r1 << 1
        L_0x031f:
            com.google.android.gms.internal.measurement.zzfx r0 = r0.zza(r1)
            r11.putObject(r7, r2, r0)
        L_0x0326:
            r9 = r0
            com.google.android.gms.internal.measurement.zzhp r0 = r8.zza((int) r12)
            r1 = r13
            r2 = r32
            r3 = r4
            r4 = r34
            r20 = r5
            r5 = r9
            r21 = r6
            r6 = r36
            int r0 = com.google.android.gms.internal.measurement.zzec.zza(r0, r1, r2, r3, r4, r5, r6)
            r15 = r30
            r2 = r33
            r1 = r35
            r3 = r12
            r4 = r13
            r5 = r20
            r6 = r21
            r12 = r34
            r13 = r10
            goto L_0x001b
        L_0x034d:
            r20 = r5
            r21 = r6
            r27 = r33
            r14 = r4
            r28 = r11
            r19 = r12
            r33 = r13
            r13 = r34
            goto L_0x03e0
        L_0x035e:
            r20 = r5
            r21 = r6
            r1 = 49
            if (r15 > r1) goto L_0x039a
            long r7 = (long) r0
            r0 = r30
            r1 = r31
            r22 = r2
            r2 = r32
            r3 = r4
            r6 = r4
            r4 = r34
            r5 = r13
            r24 = r6
            r6 = r33
            r25 = r7
            r7 = r9
            r8 = r12
            r27 = r33
            r9 = r25
            r28 = r11
            r11 = r15
            r15 = r34
            r19 = r12
            r33 = r13
            r12 = r22
            r14 = r36
            int r0 = r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (com.google.android.gms.internal.measurement.zzeb) r14)
            r14 = r24
            if (r0 != r14) goto L_0x0398
        L_0x0395:
            r4 = r0
            goto L_0x0401
        L_0x0398:
            r13 = r15
            goto L_0x03c6
        L_0x039a:
            r27 = r33
            r22 = r2
            r14 = r4
            r28 = r11
            r19 = r12
            r33 = r13
            r13 = r34
            r1 = 50
            if (r15 != r1) goto L_0x03e3
            r1 = 2
            if (r9 != r1) goto L_0x03e0
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r14
            r4 = r34
            r5 = r19
            r6 = r22
            r8 = r36
            int r0 = r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (long) r6, (com.google.android.gms.internal.measurement.zzeb) r8)
            if (r0 != r14) goto L_0x03c6
            r4 = r0
            r15 = r13
            goto L_0x0401
        L_0x03c6:
            r8 = r30
            r15 = r8
            r7 = r31
            r14 = r32
            r4 = r33
            r1 = r35
            r12 = r13
            r3 = r19
            r5 = r20
            r6 = r21
            r2 = r27
            r11 = r28
            r13 = r36
            goto L_0x001b
        L_0x03e0:
            r15 = r13
            r4 = r14
            goto L_0x0401
        L_0x03e3:
            r8 = r0
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r14
            r4 = r34
            r5 = r33
            r6 = r27
            r7 = r9
            r9 = r15
            r10 = r22
            r12 = r19
            r15 = r13
            r13 = r36
            int r0 = r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (com.google.android.gms.internal.measurement.zzeb) r13)
            if (r0 != r14) goto L_0x047d
            goto L_0x0395
        L_0x0401:
            r7 = r33
            r6 = r35
            r2 = r4
            r12 = r21
        L_0x0408:
            if (r7 != r6) goto L_0x041d
            if (r6 != 0) goto L_0x040d
            goto L_0x041d
        L_0x040d:
            r8 = r30
            r9 = r8
            r0 = r2
            r1 = r6
            r4 = r7
            r6 = r12
            r5 = r20
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r31
            goto L_0x04ab
        L_0x041d:
            r9 = r30
            boolean r0 = r9.zzh
            r10 = r36
            if (r0 == 0) goto L_0x0458
            com.google.android.gms.internal.measurement.zzfb r0 = r10.zzd
            com.google.android.gms.internal.measurement.zzfb r1 = com.google.android.gms.internal.measurement.zzfb.zza()
            if (r0 == r1) goto L_0x0458
            com.google.android.gms.internal.measurement.zzgw r0 = r9.zzg
            com.google.android.gms.internal.measurement.zzfb r1 = r10.zzd
            r8 = r27
            com.google.android.gms.internal.measurement.zzfo$zzd r0 = r1.zza(r0, r8)
            if (r0 != 0) goto L_0x0449
            com.google.android.gms.internal.measurement.zzig r4 = zze((java.lang.Object) r31)
            r0 = r7
            r1 = r32
            r3 = r34
            r5 = r36
            int r0 = com.google.android.gms.internal.measurement.zzec.zza((int) r0, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.measurement.zzig) r4, (com.google.android.gms.internal.measurement.zzeb) r5)
            goto L_0x0469
        L_0x0449:
            r0 = r31
            com.google.android.gms.internal.measurement.zzfo$zzb r0 = (com.google.android.gms.internal.measurement.zzfo.zzb) r0
            r0.zza()
            com.google.android.gms.internal.measurement.zzfe<com.google.android.gms.internal.measurement.zzfo$zze> r0 = r0.zzc
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x0458:
            r8 = r27
            com.google.android.gms.internal.measurement.zzig r4 = zze((java.lang.Object) r31)
            r0 = r7
            r1 = r32
            r3 = r34
            r5 = r36
            int r0 = com.google.android.gms.internal.measurement.zzec.zza((int) r0, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.measurement.zzig) r4, (com.google.android.gms.internal.measurement.zzeb) r5)
        L_0x0469:
            r14 = r32
            r1 = r6
            r4 = r7
            r2 = r8
            r8 = r9
            r13 = r10
            r6 = r12
            r12 = r15
            r3 = r19
            r5 = r20
            r11 = r28
            r7 = r31
            r15 = r8
            goto L_0x001b
        L_0x047d:
            r9 = r30
            r7 = r33
            r10 = r36
            r8 = r27
            r1 = r31
            r2 = r9
            r5 = r20
            r6 = r21
        L_0x048c:
            r14 = r32
            r4 = r7
            r13 = r10
            r12 = r15
            r3 = r19
            r11 = r28
            r7 = r1
            r15 = r9
            r1 = r35
            r29 = r8
            r8 = r2
            r2 = r29
            goto L_0x001b
        L_0x04a0:
            r20 = r5
            r21 = r6
            r28 = r11
            r9 = r15
            r15 = r12
            r2 = 1048575(0xfffff, float:1.469367E-39)
        L_0x04ab:
            if (r5 == r2) goto L_0x04b3
            long r2 = (long) r5
            r5 = r28
            r5.putInt(r7, r2, r6)
        L_0x04b3:
            r2 = 0
            int r3 = r8.zzm
        L_0x04b6:
            int r5 = r8.zzn
            if (r3 >= r5) goto L_0x04c9
            int[] r5 = r8.zzl
            r5 = r5[r3]
            com.google.android.gms.internal.measurement.zzih<?, ?> r6 = r8.zzq
            java.lang.Object r2 = r8.zza((java.lang.Object) r7, (int) r5, r2, r6)
            com.google.android.gms.internal.measurement.zzig r2 = (com.google.android.gms.internal.measurement.zzig) r2
            int r3 = r3 + 1
            goto L_0x04b6
        L_0x04c9:
            if (r2 == 0) goto L_0x04d0
            com.google.android.gms.internal.measurement.zzih<?, ?> r3 = r8.zzq
            r3.zzb((java.lang.Object) r7, r2)
        L_0x04d0:
            if (r1 != 0) goto L_0x04da
            if (r0 != r15) goto L_0x04d5
            goto L_0x04de
        L_0x04d5:
            com.google.android.gms.internal.measurement.zzfw r0 = com.google.android.gms.internal.measurement.zzfw.zzg()
            throw r0
        L_0x04da:
            if (r0 > r15) goto L_0x04df
            if (r4 != r1) goto L_0x04df
        L_0x04de:
            return r0
        L_0x04df:
            com.google.android.gms.internal.measurement.zzfw r0 = com.google.android.gms.internal.measurement.zzfw.zzg()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzha.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzeb):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02d5, code lost:
        if (r0 == r15) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0307, code lost:
        if (r0 == r15) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0326, code lost:
        if (r0 == r15) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0342, code lost:
        r2 = r20;
        r6 = r27;
        r7 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01c2, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01f9, code lost:
        r18 = r20;
        r20 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x022b, code lost:
        r6 = r6 | r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x022e, code lost:
        r2 = r5;
        r29 = r7;
        r7 = r20;
        r19 = -1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r32, byte[] r33, int r34, int r35, com.google.android.gms.internal.measurement.zzeb r36) throws java.io.IOException {
        /*
            r31 = this;
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            r11 = r36
            boolean r0 = r15.zzj
            if (r0 == 0) goto L_0x0378
            sun.misc.Unsafe r9 = zzb
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r34
            r7 = r8
            r1 = r10
            r2 = r16
            r6 = r2
        L_0x001d:
            if (r0 >= r13) goto L_0x035d
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002f
            int r0 = com.google.android.gms.internal.measurement.zzec.zza((int) r0, (byte[]) r12, (int) r3, (com.google.android.gms.internal.measurement.zzeb) r11)
            int r3 = r11.zza
            r4 = r0
            r17 = r3
            goto L_0x0032
        L_0x002f:
            r17 = r0
            r4 = r3
        L_0x0032:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x003f
            int r2 = r2 / 3
            int r0 = r15.zza((int) r5, (int) r2)
            goto L_0x0043
        L_0x003f:
            int r0 = r15.zzg(r5)
        L_0x0043:
            r2 = r0
            if (r2 != r10) goto L_0x0051
            r2 = r4
            r25 = r5
            r29 = r9
            r19 = r10
            r10 = r16
            goto L_0x0330
        L_0x0051:
            int[] r0 = r15.zzc
            int r1 = r2 + 1
            r1 = r0[r1]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r1 & r18
            int r10 = r18 >>> 20
            r34 = r5
            r5 = r1 & r8
            r18 = r9
            long r8 = (long) r5
            r5 = 17
            r21 = r1
            if (r10 > r5) goto L_0x0237
            int r5 = r2 + 2
            r0 = r0[r5]
            int r5 = r0 >>> 20
            r1 = 1
            int r23 = r1 << r5
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            if (r0 == r7) goto L_0x0090
            r20 = r2
            if (r7 == r5) goto L_0x0084
            long r1 = (long) r7
            r7 = r18
            r7.putInt(r14, r1, r6)
            goto L_0x0086
        L_0x0084:
            r7 = r18
        L_0x0086:
            if (r0 == r5) goto L_0x008d
            long r1 = (long) r0
            int r6 = r7.getInt(r14, r1)
        L_0x008d:
            r2 = r7
            r7 = r0
            goto L_0x0094
        L_0x0090:
            r20 = r2
            r2 = r18
        L_0x0094:
            r0 = 5
            switch(r10) {
                case 0: goto L_0x0215;
                case 1: goto L_0x01ff;
                case 2: goto L_0x01dc;
                case 3: goto L_0x01dc;
                case 4: goto L_0x01c6;
                case 5: goto L_0x01a4;
                case 6: goto L_0x018e;
                case 7: goto L_0x016e;
                case 8: goto L_0x014c;
                case 9: goto L_0x0120;
                case 10: goto L_0x0109;
                case 11: goto L_0x01c6;
                case 12: goto L_0x00f3;
                case 13: goto L_0x018e;
                case 14: goto L_0x01a4;
                case 15: goto L_0x00d9;
                case 16: goto L_0x00a4;
                default: goto L_0x0098;
            }
        L_0x0098:
            r25 = r34
            r26 = r5
            r10 = r20
            r5 = r4
            r20 = r7
            r7 = r2
            goto L_0x022e
        L_0x00a4:
            if (r3 != 0) goto L_0x00cc
            int r10 = com.google.android.gms.internal.measurement.zzec.zzb(r12, r4, r11)
            long r0 = r11.zzb
            long r17 = com.google.android.gms.internal.measurement.zzes.zza((long) r0)
            r0 = r2
            r1 = r32
            r4 = r20
            r20 = r7
            r7 = r2
            r2 = r8
            r25 = r34
            r8 = r4
            r26 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r0 = r10
            r18 = r20
            r20 = r8
            goto L_0x0280
        L_0x00cc:
            r25 = r34
            r26 = r5
            r8 = r20
            r20 = r7
            r7 = r2
            r5 = r4
            r10 = r8
            goto L_0x022e
        L_0x00d9:
            r25 = r34
            r26 = r5
            r10 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x01c2
            int r0 = com.google.android.gms.internal.measurement.zzec.zza(r12, r4, r11)
            int r1 = r11.zza
            int r1 = com.google.android.gms.internal.measurement.zzes.zze(r1)
            r7.putInt(r14, r8, r1)
            goto L_0x022b
        L_0x00f3:
            r25 = r34
            r26 = r5
            r10 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x01c2
            int r0 = com.google.android.gms.internal.measurement.zzec.zza(r12, r4, r11)
            int r1 = r11.zza
            r7.putInt(r14, r8, r1)
            goto L_0x022b
        L_0x0109:
            r25 = r34
            r26 = r5
            r10 = r20
            r0 = 2
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01c2
            int r0 = com.google.android.gms.internal.measurement.zzec.zze(r12, r4, r11)
            java.lang.Object r1 = r11.zzc
            r7.putObject(r14, r8, r1)
            goto L_0x022b
        L_0x0120:
            r25 = r34
            r26 = r5
            r10 = r20
            r0 = 2
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01c2
            com.google.android.gms.internal.measurement.zzhp r0 = r15.zza((int) r10)
            int r0 = com.google.android.gms.internal.measurement.zzec.zza((com.google.android.gms.internal.measurement.zzhp) r0, (byte[]) r12, (int) r4, (int) r13, (com.google.android.gms.internal.measurement.zzeb) r11)
            java.lang.Object r1 = r7.getObject(r14, r8)
            if (r1 != 0) goto L_0x0141
            java.lang.Object r1 = r11.zzc
            r7.putObject(r14, r8, r1)
            goto L_0x022b
        L_0x0141:
            java.lang.Object r2 = r11.zzc
            java.lang.Object r1 = com.google.android.gms.internal.measurement.zzfr.zza((java.lang.Object) r1, (java.lang.Object) r2)
            r7.putObject(r14, r8, r1)
            goto L_0x022b
        L_0x014c:
            r25 = r34
            r26 = r5
            r10 = r20
            r0 = 2
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01c2
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x0163
            int r0 = com.google.android.gms.internal.measurement.zzec.zzc(r12, r4, r11)
            goto L_0x0167
        L_0x0163:
            int r0 = com.google.android.gms.internal.measurement.zzec.zzd(r12, r4, r11)
        L_0x0167:
            java.lang.Object r1 = r11.zzc
            r7.putObject(r14, r8, r1)
            goto L_0x022b
        L_0x016e:
            r25 = r34
            r26 = r5
            r10 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x01c2
            int r0 = com.google.android.gms.internal.measurement.zzec.zzb(r12, r4, r11)
            long r1 = r11.zzb
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0187
            r1 = 1
            goto L_0x0189
        L_0x0187:
            r1 = r16
        L_0x0189:
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r14, (long) r8, (boolean) r1)
            goto L_0x022b
        L_0x018e:
            r25 = r34
            r26 = r5
            r10 = r20
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01c2
            int r0 = com.google.android.gms.internal.measurement.zzec.zza(r12, r4)
            r7.putInt(r14, r8, r0)
            int r0 = r4 + 4
            goto L_0x022b
        L_0x01a4:
            r25 = r34
            r26 = r5
            r10 = r20
            r0 = 1
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01c2
            long r17 = com.google.android.gms.internal.measurement.zzec.zzb(r12, r4)
            r0 = r7
            r1 = r32
            r2 = r8
            r8 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x022b
        L_0x01c2:
            r8 = r4
            r5 = r8
            goto L_0x022e
        L_0x01c6:
            r25 = r34
            r26 = r5
            r10 = r20
            r5 = r4
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x022e
            int r0 = com.google.android.gms.internal.measurement.zzec.zza(r12, r5, r11)
            int r1 = r11.zza
            r7.putInt(r14, r8, r1)
            goto L_0x022b
        L_0x01dc:
            r25 = r34
            r26 = r5
            r10 = r20
            r5 = r4
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x022e
            int r17 = com.google.android.gms.internal.measurement.zzec.zzb(r12, r5, r11)
            long r4 = r11.zzb
            r0 = r7
            r1 = r32
            r2 = r8
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r0 = r17
        L_0x01f9:
            r18 = r20
            r20 = r10
            goto L_0x0280
        L_0x01ff:
            r25 = r34
            r26 = r5
            r10 = r20
            r5 = r4
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x022e
            float r0 = com.google.android.gms.internal.measurement.zzec.zzd(r12, r5)
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r14, (long) r8, (float) r0)
            int r0 = r5 + 4
            goto L_0x022b
        L_0x0215:
            r25 = r34
            r26 = r5
            r10 = r20
            r0 = 1
            r5 = r4
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x022e
            double r0 = com.google.android.gms.internal.measurement.zzec.zzc(r12, r5)
            com.google.android.gms.internal.measurement.zzin.zza((java.lang.Object) r14, (long) r8, (double) r0)
            int r0 = r5 + 8
        L_0x022b:
            r6 = r6 | r23
            goto L_0x01f9
        L_0x022e:
            r2 = r5
            r29 = r7
            r7 = r20
            r19 = -1
            goto L_0x0330
        L_0x0237:
            r25 = r34
            r5 = r4
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            r30 = r18
            r18 = r7
            r7 = r30
            r0 = 27
            if (r10 != r0) goto L_0x0299
            r0 = 2
            if (r3 != r0) goto L_0x028c
            java.lang.Object r0 = r7.getObject(r14, r8)
            com.google.android.gms.internal.measurement.zzfx r0 = (com.google.android.gms.internal.measurement.zzfx) r0
            boolean r1 = r0.zza()
            if (r1 != 0) goto L_0x0269
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0260
            r1 = 10
            goto L_0x0262
        L_0x0260:
            int r1 = r1 << 1
        L_0x0262:
            com.google.android.gms.internal.measurement.zzfx r0 = r0.zza(r1)
            r7.putObject(r14, r8, r0)
        L_0x0269:
            r8 = r0
            com.google.android.gms.internal.measurement.zzhp r0 = r15.zza((int) r4)
            r1 = r17
            r2 = r33
            r3 = r5
            r20 = r4
            r4 = r35
            r5 = r8
            r8 = r6
            r6 = r36
            int r0 = com.google.android.gms.internal.measurement.zzec.zza(r0, r1, r2, r3, r4, r5, r6)
            r6 = r8
        L_0x0280:
            r9 = r7
            r7 = r18
            r2 = r20
            r1 = r25
            r8 = r26
            r10 = -1
            goto L_0x001d
        L_0x028c:
            r20 = r4
            r15 = r5
            r27 = r6
            r29 = r7
            r28 = r18
            r19 = -1
            goto L_0x030a
        L_0x0299:
            r20 = r4
            r0 = 49
            if (r10 > r0) goto L_0x02d8
            r1 = r21
            long r1 = (long) r1
            r0 = r31
            r21 = r1
            r1 = r32
            r2 = r33
            r4 = r3
            r3 = r5
            r34 = r4
            r4 = r35
            r15 = r5
            r5 = r17
            r27 = r6
            r6 = r25
            r28 = r18
            r18 = r7
            r7 = r34
            r23 = r8
            r9 = r26
            r8 = r20
            r29 = r18
            r19 = -1
            r18 = r10
            r9 = r21
            r11 = r18
            r12 = r23
            r14 = r36
            int r0 = r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (com.google.android.gms.internal.measurement.zzeb) r14)
            if (r0 != r15) goto L_0x0342
            goto L_0x0328
        L_0x02d8:
            r34 = r3
            r15 = r5
            r27 = r6
            r29 = r7
            r23 = r8
            r28 = r18
            r1 = r21
            r19 = -1
            r18 = r10
            r0 = 50
            r9 = r18
            if (r9 != r0) goto L_0x030c
            r7 = r34
            r0 = 2
            if (r7 != r0) goto L_0x030a
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r15
            r4 = r35
            r5 = r20
            r6 = r23
            r8 = r36
            int r0 = r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (long) r6, (com.google.android.gms.internal.measurement.zzeb) r8)
            if (r0 != r15) goto L_0x0342
            goto L_0x0328
        L_0x030a:
            r4 = r15
            goto L_0x0329
        L_0x030c:
            r7 = r34
            r0 = r31
            r8 = r1
            r1 = r32
            r2 = r33
            r3 = r15
            r4 = r35
            r5 = r17
            r6 = r25
            r10 = r23
            r12 = r20
            r13 = r36
            int r0 = r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (com.google.android.gms.internal.measurement.zzeb) r13)
            if (r0 != r15) goto L_0x0342
        L_0x0328:
            r4 = r0
        L_0x0329:
            r2 = r4
            r10 = r20
            r6 = r27
            r7 = r28
        L_0x0330:
            com.google.android.gms.internal.measurement.zzig r4 = zze((java.lang.Object) r32)
            r0 = r17
            r1 = r33
            r3 = r35
            r5 = r36
            int r0 = com.google.android.gms.internal.measurement.zzec.zza((int) r0, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.measurement.zzig) r4, (com.google.android.gms.internal.measurement.zzeb) r5)
            r2 = r10
            goto L_0x0348
        L_0x0342:
            r2 = r20
            r6 = r27
            r7 = r28
        L_0x0348:
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            r11 = r36
            r10 = r19
            r1 = r25
            r9 = r29
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x001d
        L_0x035d:
            r27 = r6
            r1 = r8
            r29 = r9
            if (r7 == r1) goto L_0x036e
            long r1 = (long) r7
            r3 = r32
            r6 = r27
            r4 = r29
            r4.putInt(r3, r1, r6)
        L_0x036e:
            r4 = r35
            if (r0 != r4) goto L_0x0373
            return
        L_0x0373:
            com.google.android.gms.internal.measurement.zzfw r0 = com.google.android.gms.internal.measurement.zzfw.zzg()
            throw r0
        L_0x0378:
            r4 = r13
            r3 = r14
            r5 = 0
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r34
            r4 = r35
            r6 = r36
            r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (com.google.android.gms.internal.measurement.zzeb) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzha.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzeb):void");
    }

    public final void zzc(T t) {
        int i;
        int i2 = this.zzm;
        while (true) {
            i = this.zzn;
            if (i2 >= i) {
                break;
            }
            long zzd2 = (long) (zzd(this.zzl[i2]) & 1048575);
            Object zzf2 = zzin.zzf(t, zzd2);
            if (zzf2 != null) {
                zzin.zza((Object) t, zzd2, this.zzs.zze(zzf2));
            }
            i2++;
        }
        int length = this.zzl.length;
        while (i < length) {
            this.zzp.zzb(t, (long) this.zzl[i]);
            i++;
        }
        this.zzq.zzd(t);
        if (this.zzh) {
            this.zzr.zzc(t);
        }
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzih<UT, UB> zzih) {
        zzfs zzc2;
        int i2 = this.zzc[i];
        Object zzf2 = zzin.zzf(obj, (long) (zzd(i) & 1048575));
        if (zzf2 == null || (zzc2 = zzc(i)) == null) {
            return ub;
        }
        return zza(i, i2, this.zzs.zza(zzf2), zzc2, ub, zzih);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzfs zzfs, UB ub, zzih<UT, UB> zzih) {
        zzgr<?, ?> zzb2 = this.zzs.zzb(zzb(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!zzfs.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzih.zza();
                }
                zzeo zzc2 = zzeg.zzc(zzgo.zza(zzb2, next.getKey(), next.getValue()));
                try {
                    zzgo.zza(zzc2.zzb(), zzb2, next.getKey(), next.getValue());
                    zzih.zza(ub, i2, zzc2.zza());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    public final boolean zzd(T t) {
        int i;
        int i2;
        T t2 = t;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z = true;
            if (i5 >= this.zzm) {
                return !this.zzh || this.zzr.zza((Object) t2).zzf();
            }
            int i6 = this.zzl[i5];
            int i7 = this.zzc[i6];
            int zzd2 = zzd(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(t2, (long) i9);
                }
                i = i4;
                i2 = i9;
            } else {
                i2 = i3;
                i = i4;
            }
            if (((268435456 & zzd2) != 0) && !zza(t, i6, i2, i, i10)) {
                return false;
            }
            int i11 = (267386880 & zzd2) >>> 20;
            if (i11 != 9 && i11 != 17) {
                if (i11 != 27) {
                    if (i11 == 60 || i11 == 68) {
                        if (zza(t2, i7, i6) && !zza((Object) t2, zzd2, zza(i6))) {
                            return false;
                        }
                    } else if (i11 != 49) {
                        if (i11 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzc2 = this.zzs.zzc(zzin.zzf(t2, (long) (zzd2 & 1048575)));
                            if (!zzc2.isEmpty()) {
                                if (this.zzs.zzb(zzb(i6)).zzc.zza() == zzjb.MESSAGE) {
                                    zzhp<?> zzhp = null;
                                    Iterator<?> it = zzc2.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (zzhp == null) {
                                            zzhp = zzhl.zza().zza(next.getClass());
                                        }
                                        if (!zzhp.zzd(next)) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) zzin.zzf(t2, (long) (zzd2 & 1048575));
                if (!list.isEmpty()) {
                    zzhp zza2 = zza(i6);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= list.size()) {
                            break;
                        } else if (!zza2.zzd(list.get(i12))) {
                            z = false;
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (zza(t, i6, i2, i, i10) && !zza((Object) t2, zzd2, zza(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
    }

    private static boolean zza(Object obj, int i, zzhp zzhp) {
        return zzhp.zzd(zzin.zzf(obj, (long) (i & 1048575)));
    }

    private static void zza(int i, Object obj, zzja zzja) throws IOException {
        if (obj instanceof String) {
            zzja.zza(i, (String) obj);
        } else {
            zzja.zza(i, (zzeg) obj);
        }
    }

    private final void zza(Object obj, int i, zzhm zzhm) throws IOException {
        if (zzf(i)) {
            zzin.zza(obj, (long) (i & 1048575), (Object) zzhm.zzm());
        } else if (this.zzi) {
            zzin.zza(obj, (long) (i & 1048575), (Object) zzhm.zzl());
        } else {
            zzin.zza(obj, (long) (i & 1048575), (Object) zzhm.zzn());
        }
    }

    private final int zzd(int i) {
        return this.zzc[i + 1];
    }

    private final int zze(int i) {
        return this.zzc[i + 2];
    }

    private static <T> double zzb(T t, long j) {
        return ((Double) zzin.zzf(t, j)).doubleValue();
    }

    private static <T> float zzc(T t, long j) {
        return ((Float) zzin.zzf(t, j)).floatValue();
    }

    private static <T> int zzd(T t, long j) {
        return ((Integer) zzin.zzf(t, j)).intValue();
    }

    private static <T> long zze(T t, long j) {
        return ((Long) zzin.zzf(t, j)).longValue();
    }

    private static <T> boolean zzf(T t, long j) {
        return ((Boolean) zzin.zzf(t, j)).booleanValue();
    }

    private final boolean zzc(T t, T t2, int i) {
        return zza(t, i) == zza(t2, i);
    }

    private final boolean zza(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zza(t, i);
        }
        return (i3 & i4) != 0;
    }

    private final boolean zza(T t, int i) {
        int zze2 = zze(i);
        long j = (long) (zze2 & 1048575);
        if (j != 1048575) {
            return (zzin.zza((Object) t, j) & (1 << (zze2 >>> 20))) != 0;
        }
        int zzd2 = zzd(i);
        long j2 = (long) (zzd2 & 1048575);
        switch ((zzd2 & 267386880) >>> 20) {
            case 0:
                return zzin.zze(t, j2) != 0.0d;
            case 1:
                return zzin.zzd(t, j2) != BitmapDescriptorFactory.HUE_RED;
            case 2:
                return zzin.zzb(t, j2) != 0;
            case 3:
                return zzin.zzb(t, j2) != 0;
            case 4:
                return zzin.zza((Object) t, j2) != 0;
            case 5:
                return zzin.zzb(t, j2) != 0;
            case 6:
                return zzin.zza((Object) t, j2) != 0;
            case 7:
                return zzin.zzc(t, j2);
            case 8:
                Object zzf2 = zzin.zzf(t, j2);
                if (zzf2 instanceof String) {
                    return !((String) zzf2).isEmpty();
                }
                if (zzf2 instanceof zzeg) {
                    return !zzeg.zza.equals(zzf2);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzin.zzf(t, j2) != null;
            case 10:
                return !zzeg.zza.equals(zzin.zzf(t, j2));
            case 11:
                return zzin.zza((Object) t, j2) != 0;
            case 12:
                return zzin.zza((Object) t, j2) != 0;
            case 13:
                return zzin.zza((Object) t, j2) != 0;
            case 14:
                return zzin.zzb(t, j2) != 0;
            case 15:
                return zzin.zza((Object) t, j2) != 0;
            case 16:
                return zzin.zzb(t, j2) != 0;
            case 17:
                return zzin.zzf(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzb(T t, int i) {
        int zze2 = zze(i);
        long j = (long) (1048575 & zze2);
        if (j != 1048575) {
            zzin.zza((Object) t, j, (1 << (zze2 >>> 20)) | zzin.zza((Object) t, j));
        }
    }

    private final boolean zza(T t, int i, int i2) {
        return zzin.zza((Object) t, (long) (zze(i2) & 1048575)) == i;
    }

    private final void zzb(T t, int i, int i2) {
        zzin.zza((Object) t, (long) (zze(i2) & 1048575), i);
    }

    private final int zzg(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzb(i, 0);
    }

    private final int zza(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzb(i, i2);
    }

    private final int zzb(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
