package com.google.android.gms.internal.clearcut;

final class zzfj extends zzfg {
    zzfj() {
    }

    private static int zza(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            return zzff.zzam(i);
        }
        if (i2 == 1) {
            return zzff.zzp(i, zzfd.zza(bArr, j));
        }
        if (i2 == 2) {
            return zzff.zzd(i, zzfd.zza(bArr, j), zzfd.zza(bArr, j + 1));
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b6, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(int r18, byte[] r19, int r20, int r21) {
        /*
            r17 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r1 | r2
            int r4 = r0.length
            int r4 = r4 - r2
            r3 = r3 | r4
            r4 = 2
            r5 = 3
            r6 = 0
            if (r3 < 0) goto L_0x00b7
            long r7 = (long) r1
            long r1 = (long) r2
            long r1 = r1 - r7
            int r1 = (int) r1
            r2 = 16
            r9 = 1
            if (r1 >= r2) goto L_0x001c
            r2 = r6
            goto L_0x002c
        L_0x001c:
            r2 = r6
            r11 = r7
        L_0x001e:
            if (r2 >= r1) goto L_0x002b
            byte r3 = com.google.android.gms.internal.clearcut.zzfd.zza((byte[]) r0, (long) r11)
            if (r3 >= 0) goto L_0x0027
            goto L_0x002c
        L_0x0027:
            int r2 = r2 + 1
            long r11 = r11 + r9
            goto L_0x001e
        L_0x002b:
            r2 = r1
        L_0x002c:
            int r1 = r1 - r2
            long r2 = (long) r2
            long r7 = r7 + r2
        L_0x002f:
            r2 = r6
        L_0x0030:
            if (r1 <= 0) goto L_0x0043
            long r2 = r7 + r9
            byte r7 = com.google.android.gms.internal.clearcut.zzfd.zza((byte[]) r0, (long) r7)
            if (r7 < 0) goto L_0x0040
            int r1 = r1 + -1
            r15 = r2
            r2 = r7
            r7 = r15
            goto L_0x0030
        L_0x0040:
            r15 = r2
            r2 = r7
            r7 = r15
        L_0x0043:
            if (r1 != 0) goto L_0x0046
            return r6
        L_0x0046:
            int r1 = r1 + -1
            r3 = -32
            r11 = -65
            r12 = -1
            if (r2 >= r3) goto L_0x0062
            if (r1 != 0) goto L_0x0052
            return r2
        L_0x0052:
            int r1 = r1 + -1
            r3 = -62
            if (r2 < r3) goto L_0x0061
            byte r2 = com.google.android.gms.internal.clearcut.zzfd.zza((byte[]) r0, (long) r7)
            if (r2 <= r11) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            long r7 = r7 + r9
            goto L_0x002f
        L_0x0061:
            return r12
        L_0x0062:
            r13 = -16
            if (r2 >= r13) goto L_0x008c
            if (r1 >= r4) goto L_0x006d
            int r0 = zza(r0, r2, r7, r1)
            return r0
        L_0x006d:
            int r1 = r1 + -2
            long r13 = r7 + r9
            byte r7 = com.google.android.gms.internal.clearcut.zzfd.zza((byte[]) r0, (long) r7)
            if (r7 > r11) goto L_0x008b
            r8 = -96
            if (r2 != r3) goto L_0x007d
            if (r7 < r8) goto L_0x008b
        L_0x007d:
            r3 = -19
            if (r2 != r3) goto L_0x0083
            if (r7 >= r8) goto L_0x008b
        L_0x0083:
            long r7 = r13 + r9
            byte r2 = com.google.android.gms.internal.clearcut.zzfd.zza((byte[]) r0, (long) r13)
            if (r2 <= r11) goto L_0x002f
        L_0x008b:
            return r12
        L_0x008c:
            if (r1 >= r5) goto L_0x0093
            int r0 = zza(r0, r2, r7, r1)
            return r0
        L_0x0093:
            int r1 = r1 + -3
            long r13 = r7 + r9
            byte r3 = com.google.android.gms.internal.clearcut.zzfd.zza((byte[]) r0, (long) r7)
            if (r3 > r11) goto L_0x00b6
            int r2 = r2 << 28
            int r3 = r3 + 112
            int r2 = r2 + r3
            int r2 = r2 >> 30
            if (r2 != 0) goto L_0x00b6
            long r2 = r13 + r9
            byte r7 = com.google.android.gms.internal.clearcut.zzfd.zza((byte[]) r0, (long) r13)
            if (r7 > r11) goto L_0x00b6
            long r7 = r2 + r9
            byte r2 = com.google.android.gms.internal.clearcut.zzfd.zza((byte[]) r0, (long) r2)
            if (r2 <= r11) goto L_0x002f
        L_0x00b6:
            return r12
        L_0x00b7:
            java.lang.Object[] r3 = new java.lang.Object[r5]
            int r0 = r0.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r6] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            r1 = 1
            r3[r1] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            r3[r4] = r0
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.String r1 = "Array length=%d, index=%d, limit=%d"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzfj.zzb(int, byte[], int, int):int");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032 A[LOOP:1: B:13:0x0032->B:38:0x00f7, LOOP_START, PHI: r2 r3 r4 r11 
      PHI: (r2v3 int) = (r2v2 int), (r2v5 int) binds: [B:10:0x002e, B:38:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r3v2 char) = (r3v1 char), (r3v3 char) binds: [B:10:0x002e, B:38:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v3 long) = (r4v2 long), (r4v5 long) binds: [B:10:0x002e, B:38:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r11v3 long) = (r11v2 long), (r11v5 long) binds: [B:10:0x002e, B:38:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(java.lang.CharSequence r20, byte[] r21, int r22, int r23) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            long r4 = (long) r2
            long r6 = (long) r3
            long r6 = r6 + r4
            int r8 = r20.length()
            java.lang.String r9 = " at index "
            java.lang.String r10 = "Failed writing "
            if (r8 > r3) goto L_0x0141
            int r11 = r1.length
            int r11 = r11 - r3
            if (r11 < r2) goto L_0x0141
            r2 = 0
        L_0x001a:
            r11 = 1
            r3 = 128(0x80, float:1.794E-43)
            if (r2 >= r8) goto L_0x002e
            char r13 = r0.charAt(r2)
            if (r13 >= r3) goto L_0x002e
            byte r3 = (byte) r13
            com.google.android.gms.internal.clearcut.zzfd.zza((byte[]) r1, (long) r4, (byte) r3)
            int r2 = r2 + 1
            long r4 = r4 + r11
            goto L_0x001a
        L_0x002e:
            if (r2 != r8) goto L_0x0032
            int r0 = (int) r4
            return r0
        L_0x0032:
            if (r2 >= r8) goto L_0x013f
            char r13 = r0.charAt(r2)
            if (r13 >= r3) goto L_0x004b
            int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r14 >= 0) goto L_0x004b
            byte r13 = (byte) r13
            com.google.android.gms.internal.clearcut.zzfd.zza((byte[]) r1, (long) r4, (byte) r13)
            long r4 = r4 + r11
            r17 = r11
            r11 = r3
            r12 = r4
        L_0x0047:
            r4 = r17
            goto L_0x00f7
        L_0x004b:
            r14 = 2048(0x800, float:2.87E-42)
            if (r13 >= r14) goto L_0x006f
            r14 = 2
            long r14 = r6 - r14
            int r14 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r14 > 0) goto L_0x006f
            long r14 = r4 + r11
            int r11 = r13 >>> 6
            r11 = r11 | 960(0x3c0, float:1.345E-42)
            byte r11 = (byte) r11
            com.google.android.gms.internal.clearcut.zzfd.zza((byte[]) r1, (long) r4, (byte) r11)
            r4 = r13 & 63
            r4 = r4 | r3
            byte r4 = (byte) r4
            com.google.android.gms.internal.clearcut.zzfd.zza((byte[]) r1, (long) r14, (byte) r4)
            r4 = 1
            long r14 = r14 + r4
            r11 = r3
            r12 = r14
            goto L_0x00f7
        L_0x006f:
            r11 = 57343(0xdfff, float:8.0355E-41)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r13 < r12) goto L_0x0079
            if (r11 >= r13) goto L_0x00aa
        L_0x0079:
            r14 = 3
            long r14 = r6 - r14
            int r14 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r14 > 0) goto L_0x00aa
            r14 = 1
            long r11 = r4 + r14
            int r3 = r13 >>> 12
            r3 = r3 | 480(0x1e0, float:6.73E-43)
            byte r3 = (byte) r3
            com.google.android.gms.internal.clearcut.zzfd.zza((byte[]) r1, (long) r4, (byte) r3)
            long r3 = r11 + r14
            int r5 = r13 >>> 6
            r5 = r5 & 63
            r14 = 128(0x80, float:1.794E-43)
            r5 = r5 | r14
            byte r5 = (byte) r5
            com.google.android.gms.internal.clearcut.zzfd.zza((byte[]) r1, (long) r11, (byte) r5)
            r5 = r13 & 63
            r5 = r5 | r14
            byte r5 = (byte) r5
            com.google.android.gms.internal.clearcut.zzfd.zza((byte[]) r1, (long) r3, (byte) r5)
            r11 = 1
            long r3 = r3 + r11
            r17 = r11
            r11 = 128(0x80, float:1.794E-43)
            r12 = r3
            goto L_0x0047
        L_0x00aa:
            r14 = 4
            long r14 = r6 - r14
            int r3 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r3 > 0) goto L_0x010a
            int r3 = r2 + 1
            if (r3 == r8) goto L_0x0102
            char r2 = r0.charAt(r3)
            boolean r11 = java.lang.Character.isSurrogatePair(r13, r2)
            if (r11 == 0) goto L_0x0101
            int r2 = java.lang.Character.toCodePoint(r13, r2)
            r11 = 1
            long r13 = r4 + r11
            int r15 = r2 >>> 18
            r15 = r15 | 240(0xf0, float:3.36E-43)
            byte r15 = (byte) r15
            com.google.android.gms.internal.clearcut.zzfd.zza((byte[]) r1, (long) r4, (byte) r15)
            long r4 = r13 + r11
            int r15 = r2 >>> 12
            r15 = r15 & 63
            r11 = 128(0x80, float:1.794E-43)
            r12 = r15 | 128(0x80, float:1.794E-43)
            byte r12 = (byte) r12
            com.google.android.gms.internal.clearcut.zzfd.zza((byte[]) r1, (long) r13, (byte) r12)
            r12 = 1
            long r14 = r4 + r12
            int r16 = r2 >>> 6
            r12 = r16 & 63
            r12 = r12 | r11
            byte r12 = (byte) r12
            com.google.android.gms.internal.clearcut.zzfd.zza((byte[]) r1, (long) r4, (byte) r12)
            r4 = 1
            long r12 = r14 + r4
            r2 = r2 & 63
            r2 = r2 | r11
            byte r2 = (byte) r2
            com.google.android.gms.internal.clearcut.zzfd.zza((byte[]) r1, (long) r14, (byte) r2)
            r2 = r3
        L_0x00f7:
            int r2 = r2 + 1
            r3 = r11
            r17 = r4
            r4 = r12
            r11 = r17
            goto L_0x0032
        L_0x0101:
            r2 = r3
        L_0x0102:
            com.google.android.gms.internal.clearcut.zzfi r0 = new com.google.android.gms.internal.clearcut.zzfi
            int r2 = r2 + -1
            r0.<init>(r2, r8)
            throw r0
        L_0x010a:
            if (r12 > r13) goto L_0x0122
            if (r13 > r11) goto L_0x0122
            int r1 = r2 + 1
            if (r1 == r8) goto L_0x011c
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
            if (r0 != 0) goto L_0x0122
        L_0x011c:
            com.google.android.gms.internal.clearcut.zzfi r0 = new com.google.android.gms.internal.clearcut.zzfi
            r0.<init>(r2, r8)
            throw r0
        L_0x0122:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 46
            r0.<init>(r1)
            r0.append(r10)
            r0.append(r13)
            r0.append(r9)
            r0.append(r4)
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x013f:
            int r0 = (int) r4
            return r0
        L_0x0141:
            int r8 = r8 + -1
            char r0 = r0.charAt(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r4 = 37
            r1.<init>(r4)
            r1.append(r10)
            r1.append(r0)
            r1.append(r9)
            int r0 = r2 + r3
            r1.append(r0)
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzfj.zzb(java.lang.CharSequence, byte[], int, int):int");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e A[LOOP:1: B:11:0x003e->B:36:0x0101, LOOP_START, PHI: r1 r3 r5 r8 r11 r12 
      PHI: (r1v4 long) = (r1v0 long), (r1v5 long) binds: [B:8:0x0036, B:36:0x0101] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r3v5 long) = (r3v4 long), (r3v7 long) binds: [B:8:0x0036, B:36:0x0101] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r5v3 long) = (r5v2 long), (r5v4 long) binds: [B:8:0x0036, B:36:0x0101] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r8v4 int) = (r8v3 int), (r8v6 int) binds: [B:8:0x0036, B:36:0x0101] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r11v1 char) = (r11v0 char), (r11v2 char) binds: [B:8:0x0036, B:36:0x0101] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r12v1 long) = (r12v0 long), (r12v2 long) binds: [B:8:0x0036, B:36:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzb(java.lang.CharSequence r20, java.nio.ByteBuffer r21) {
        /*
            r19 = this;
            r0 = r20
            long r1 = com.google.android.gms.internal.clearcut.zzfd.zzb((java.nio.ByteBuffer) r21)
            int r3 = r21.position()
            long r3 = (long) r3
            long r3 = r3 + r1
            int r5 = r21.limit()
            long r5 = (long) r5
            long r5 = r5 + r1
            int r7 = r20.length()
            long r8 = (long) r7
            long r10 = r5 - r3
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            java.lang.String r9 = " at index "
            java.lang.String r10 = "Failed writing "
            if (r8 > 0) goto L_0x014e
            r8 = 0
        L_0x0022:
            r11 = 128(0x80, float:1.794E-43)
            r12 = 1
            if (r8 >= r7) goto L_0x0036
            char r14 = r0.charAt(r8)
            if (r14 >= r11) goto L_0x0036
            byte r11 = (byte) r14
            com.google.android.gms.internal.clearcut.zzfd.zza((long) r3, (byte) r11)
            int r8 = r8 + 1
            long r3 = r3 + r12
            goto L_0x0022
        L_0x0036:
            if (r8 != r7) goto L_0x003e
            long r3 = r3 - r1
        L_0x0039:
            int r0 = (int) r3
            r1 = r21
            goto L_0x014a
        L_0x003e:
            if (r8 >= r7) goto L_0x0146
            char r14 = r0.charAt(r8)
            if (r14 >= r11) goto L_0x0054
            int r15 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r15 >= 0) goto L_0x0054
            byte r14 = (byte) r14
            com.google.android.gms.internal.clearcut.zzfd.zza((long) r3, (byte) r14)
            long r3 = r3 + r12
            r15 = r1
            r17 = r5
            goto L_0x0101
        L_0x0054:
            r15 = 2048(0x800, float:2.87E-42)
            if (r14 >= r15) goto L_0x0076
            r15 = 2
            long r15 = r5 - r15
            int r15 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r15 > 0) goto L_0x0076
            r15 = r1
            long r1 = r3 + r12
            int r12 = r14 >>> 6
            r12 = r12 | 960(0x3c0, float:1.345E-42)
            byte r12 = (byte) r12
            com.google.android.gms.internal.clearcut.zzfd.zza((long) r3, (byte) r12)
            r3 = r14 & 63
            r3 = r3 | r11
            byte r3 = (byte) r3
            com.google.android.gms.internal.clearcut.zzfd.zza((long) r1, (byte) r3)
            r3 = 1
            long r1 = r1 + r3
            goto L_0x00ad
        L_0x0076:
            r15 = r1
            r1 = 57343(0xdfff, float:8.0355E-41)
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r2) goto L_0x0081
            if (r1 >= r14) goto L_0x00b5
        L_0x0081:
            r12 = 3
            long r12 = r5 - r12
            int r12 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r12 > 0) goto L_0x00b5
            r12 = 1
            long r1 = r3 + r12
            int r11 = r14 >>> 12
            r11 = r11 | 480(0x1e0, float:6.73E-43)
            byte r11 = (byte) r11
            com.google.android.gms.internal.clearcut.zzfd.zza((long) r3, (byte) r11)
            long r3 = r1 + r12
            int r11 = r14 >>> 6
            r11 = r11 & 63
            r12 = 128(0x80, float:1.794E-43)
            r11 = r11 | r12
            byte r11 = (byte) r11
            com.google.android.gms.internal.clearcut.zzfd.zza((long) r1, (byte) r11)
            r1 = r14 & 63
            r1 = r1 | r12
            byte r1 = (byte) r1
            com.google.android.gms.internal.clearcut.zzfd.zza((long) r3, (byte) r1)
            r1 = 1
            long r3 = r3 + r1
            r1 = r3
        L_0x00ad:
            r3 = r1
            r17 = r5
            r11 = 128(0x80, float:1.794E-43)
            r12 = 1
            goto L_0x0101
        L_0x00b5:
            r11 = 4
            long r11 = r5 - r11
            int r11 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r11 > 0) goto L_0x0111
            int r1 = r8 + 1
            if (r1 == r7) goto L_0x0109
            char r2 = r0.charAt(r1)
            boolean r8 = java.lang.Character.isSurrogatePair(r14, r2)
            if (r8 == 0) goto L_0x0108
            int r2 = java.lang.Character.toCodePoint(r14, r2)
            r11 = 1
            long r13 = r3 + r11
            int r8 = r2 >>> 18
            r8 = r8 | 240(0xf0, float:3.36E-43)
            byte r8 = (byte) r8
            com.google.android.gms.internal.clearcut.zzfd.zza((long) r3, (byte) r8)
            long r3 = r13 + r11
            int r8 = r2 >>> 12
            r8 = r8 & 63
            r11 = 128(0x80, float:1.794E-43)
            r8 = r8 | r11
            byte r8 = (byte) r8
            com.google.android.gms.internal.clearcut.zzfd.zza((long) r13, (byte) r8)
            r17 = r5
            r12 = 1
            long r5 = r3 + r12
            int r8 = r2 >>> 6
            r8 = r8 & 63
            r8 = r8 | r11
            byte r8 = (byte) r8
            com.google.android.gms.internal.clearcut.zzfd.zza((long) r3, (byte) r8)
            r2 = r2 & 63
            r2 = r2 | r11
            byte r2 = (byte) r2
            com.google.android.gms.internal.clearcut.zzfd.zza((long) r5, (byte) r2)
            long r5 = r5 + r12
            r8 = r1
            r3 = r5
        L_0x0101:
            int r8 = r8 + 1
            r1 = r15
            r5 = r17
            goto L_0x003e
        L_0x0108:
            r8 = r1
        L_0x0109:
            com.google.android.gms.internal.clearcut.zzfi r0 = new com.google.android.gms.internal.clearcut.zzfi
            int r8 = r8 + -1
            r0.<init>(r8, r7)
            throw r0
        L_0x0111:
            if (r2 > r14) goto L_0x0129
            if (r14 > r1) goto L_0x0129
            int r1 = r8 + 1
            if (r1 == r7) goto L_0x0123
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isSurrogatePair(r14, r0)
            if (r0 != 0) goto L_0x0129
        L_0x0123:
            com.google.android.gms.internal.clearcut.zzfi r0 = new com.google.android.gms.internal.clearcut.zzfi
            r0.<init>(r8, r7)
            throw r0
        L_0x0129:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 46
            r0.<init>(r1)
            r0.append(r10)
            r0.append(r14)
            r0.append(r9)
            r0.append(r3)
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0146:
            r15 = r1
            long r3 = r3 - r15
            goto L_0x0039
        L_0x014a:
            r1.position(r0)
            return
        L_0x014e:
            r1 = r21
            int r7 = r7 + -1
            char r0 = r0.charAt(r7)
            int r1 = r21.limit()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 37
            r2.<init>(r3)
            r2.append(r10)
            r2.append(r0)
            r2.append(r9)
            r2.append(r1)
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzfj.zzb(java.lang.CharSequence, java.nio.ByteBuffer):void");
    }
}
