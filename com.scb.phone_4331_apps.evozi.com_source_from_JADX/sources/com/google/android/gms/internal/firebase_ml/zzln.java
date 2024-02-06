package com.google.android.gms.internal.firebase_ml;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzln<K, V> extends zzlj<K, V> {
    private static final zzlj<Object, Object> zzadi = new zzln((int[]) null, new Object[0], 0);
    private final transient int size;
    private final transient Object[] zzadd;
    private final transient int[] zzadj;

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0078, code lost:
        r0[r8] = r4;
        r1 = r1 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <K, V> com.google.android.gms.internal.firebase_ml.zzln<K, V> zza(int r11, java.lang.Object[] r12) {
        /*
            if (r11 != 0) goto L_0x0007
            com.google.android.gms.internal.firebase_ml.zzlj<java.lang.Object, java.lang.Object> r11 = zzadi
            com.google.android.gms.internal.firebase_ml.zzln r11 = (com.google.android.gms.internal.firebase_ml.zzln) r11
            return r11
        L_0x0007:
            r0 = 0
            r1 = 0
            r2 = 1
            if (r11 != r2) goto L_0x0019
            r11 = r12[r1]
            r1 = r12[r2]
            com.google.android.gms.internal.firebase_ml.zzld.zzc(r11, r1)
            com.google.android.gms.internal.firebase_ml.zzln r11 = new com.google.android.gms.internal.firebase_ml.zzln
            r11.<init>(r0, r12, r2)
            return r11
        L_0x0019:
            int r3 = r12.length
            int r3 = r3 >> r2
            com.google.android.gms.internal.firebase_ml.zzks.zzc(r11, r3)
            r3 = 2
            int r3 = java.lang.Math.max(r11, r3)
            r4 = 751619276(0x2ccccccc, float:5.8207657E-12)
            r5 = 1073741824(0x40000000, float:2.0)
            if (r3 >= r4) goto L_0x0041
            int r4 = r3 + -1
            int r4 = java.lang.Integer.highestOneBit(r4)
            int r4 = r4 << r2
            r5 = r4
        L_0x0032:
            double r6 = (double) r5
            r8 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r6 = r6 * r8
            double r8 = (double) r3
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x004b
            int r5 = r5 << 1
            goto L_0x0032
        L_0x0041:
            if (r3 >= r5) goto L_0x0045
            r3 = r2
            goto L_0x0046
        L_0x0045:
            r3 = r1
        L_0x0046:
            java.lang.String r4 = "collection too large"
            com.google.android.gms.internal.firebase_ml.zzks.checkArgument(r3, r4)
        L_0x004b:
            if (r11 != r2) goto L_0x0056
            r1 = r12[r1]
            r2 = r12[r2]
            com.google.android.gms.internal.firebase_ml.zzld.zzc(r1, r2)
            goto L_0x00ef
        L_0x0056:
            int[] r0 = new int[r5]
            r3 = -1
            java.util.Arrays.fill(r0, r3)
        L_0x005c:
            if (r1 >= r11) goto L_0x00ef
            int r4 = r1 * 2
            r6 = r12[r4]
            int r7 = r4 + 1
            r7 = r12[r7]
            com.google.android.gms.internal.firebase_ml.zzld.zzc(r6, r7)
            int r8 = r6.hashCode()
            int r8 = com.google.android.gms.internal.firebase_ml.zzle.zzal(r8)
        L_0x0071:
            int r9 = r5 + -1
            r8 = r8 & r9
            r9 = r0[r8]
            if (r9 != r3) goto L_0x007d
            r0[r8] = r4
            int r1 = r1 + 1
            goto L_0x005c
        L_0x007d:
            r10 = r12[r9]
            boolean r10 = r10.equals(r6)
            if (r10 != 0) goto L_0x0088
            int r8 = r8 + 1
            goto L_0x0071
        L_0x0088:
            java.lang.String r11 = java.lang.String.valueOf(r6)
            java.lang.String r0 = java.lang.String.valueOf(r7)
            r1 = r12[r9]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2 = r2 ^ r9
            r12 = r12[r2]
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = java.lang.String.valueOf(r11)
            int r3 = r3.length()
            int r3 = r3 + 39
            java.lang.String r4 = java.lang.String.valueOf(r0)
            int r4 = r4.length()
            int r3 = r3 + r4
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            int r3 = r3 + r4
            java.lang.String r4 = java.lang.String.valueOf(r12)
            int r4 = r4.length()
            int r3 = r3 + r4
            r2.<init>(r3)
            java.lang.String r3 = "Multiple entries with same key: "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r11 = "="
            r2.append(r11)
            r2.append(r0)
            java.lang.String r0 = " and "
            r2.append(r0)
            r2.append(r1)
            r2.append(r11)
            r2.append(r12)
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = r2.toString()
            r11.<init>(r12)
            throw r11
        L_0x00ef:
            com.google.android.gms.internal.firebase_ml.zzln r1 = new com.google.android.gms.internal.firebase_ml.zzln
            r1.<init>(r0, r12, r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzln.zza(int, java.lang.Object[]):com.google.android.gms.internal.firebase_ml.zzln");
    }

    private zzln(int[] iArr, Object[] objArr, int i) {
        this.zzadj = iArr;
        this.zzadd = objArr;
        this.size = i;
    }

    public final int size() {
        return this.size;
    }

    @NullableDecl
    public final V get(@NullableDecl Object obj) {
        int[] iArr = this.zzadj;
        V[] vArr = this.zzadd;
        int i = this.size;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (vArr[0].equals(obj)) {
                return vArr[1];
            }
            return null;
        } else if (iArr == null) {
            return null;
        } else {
            int length = iArr.length;
            int zzal = zzle.zzal(obj.hashCode());
            while (true) {
                int i2 = zzal & (length - 1);
                int i3 = iArr[i2];
                if (i3 == -1) {
                    return null;
                }
                if (vArr[i3].equals(obj)) {
                    return vArr[i3 ^ 1];
                }
                zzal = i2 + 1;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final zzll<Map.Entry<K, V>> zziq() {
        return new zzlo(this, this.zzadd, 0, this.size);
    }

    /* access modifiers changed from: package-private */
    public final zzll<K> zzir() {
        return new zzlq(this, new zzlr(this.zzadd, 0, this.size));
    }

    /* access modifiers changed from: package-private */
    public final zzlf<V> zzis() {
        return new zzlr(this.zzadd, 1, this.size);
    }
}
