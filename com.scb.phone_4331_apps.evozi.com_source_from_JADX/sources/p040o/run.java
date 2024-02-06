package p040o;

import com.google.android.gms.common.api.Api;

/* renamed from: o.run */
public final class run extends getMinification {
    static final int[] IconCompatParcelizer = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};
    static final char[] MediaBrowserCompat$CustomActionResultReceiver = "0123456789-$:/.+ABCD".toCharArray();
    private static final char[] MediaBrowserCompat$ItemReceiver = {'A', 'B', 'C', 'D'};
    private final StringBuilder MediaDescriptionCompat = new StringBuilder(20);
    private int[] read = new int[80];
    private int write = 0;

    /* JADX WARNING: Removed duplicated region for block: B:105:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x024e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x00b2 A[EDGE_INSN: B:146:0x00b2->B:51:0x00b2 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.getLayers$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer(int r20, p040o.rsnScriptIntrinsicCreate r21, java.util.Map<p040o.rsnIncContextCreate, ?> r22) throws com.google.zxing.NotFoundException {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r2 = r22
            int[] r3 = r0.read
            r4 = 0
            java.util.Arrays.fill(r3, r4)
            r0.write = r4
            int r3 = r1.write(r4)
            int r5 = r1.read
            if (r3 >= r5) goto L_0x0259
            r6 = 1
            r7 = r4
            r8 = r6
        L_0x0019:
            if (r3 >= r5) goto L_0x0039
            r9 = r3 & 31
            int r9 = r6 << r9
            int[] r10 = r1.write
            int r11 = r3 / 32
            r10 = r10[r11]
            r9 = r9 & r10
            if (r9 == 0) goto L_0x002a
            r9 = r6
            goto L_0x002b
        L_0x002a:
            r9 = r4
        L_0x002b:
            if (r9 == r8) goto L_0x0030
            int r7 = r7 + 1
            goto L_0x0036
        L_0x0030:
            r0.write(r7)
            r8 = r8 ^ 1
            r7 = r6
        L_0x0036:
            int r3 = r3 + 1
            goto L_0x0019
        L_0x0039:
            r0.write(r7)
            r1 = r6
        L_0x003d:
            int r3 = r0.write
            if (r1 >= r3) goto L_0x0254
            int r3 = r0.MediaBrowserCompat$CustomActionResultReceiver(r1)
            r5 = -1
            if (r3 == r5) goto L_0x024e
            char[] r7 = MediaBrowserCompat$ItemReceiver
            char[] r8 = MediaBrowserCompat$CustomActionResultReceiver
            char r3 = r8[r3]
            if (r7 == 0) goto L_0x005d
            int r8 = r7.length
            r9 = r4
        L_0x0052:
            if (r9 >= r8) goto L_0x005d
            char r10 = r7[r9]
            if (r10 != r3) goto L_0x005a
            r3 = r6
            goto L_0x005e
        L_0x005a:
            int r9 = r9 + 1
            goto L_0x0052
        L_0x005d:
            r3 = r4
        L_0x005e:
            if (r3 == 0) goto L_0x024e
            r3 = r1
            r7 = r4
        L_0x0062:
            int r8 = r1 + 7
            if (r3 >= r8) goto L_0x006e
            int[] r8 = r0.read
            r8 = r8[r3]
            int r7 = r7 + r8
            int r3 = r3 + 1
            goto L_0x0062
        L_0x006e:
            if (r1 == r6) goto L_0x007a
            int[] r3 = r0.read
            int r8 = r1 + -1
            r3 = r3[r8]
            int r7 = r7 / 2
            if (r3 < r7) goto L_0x024e
        L_0x007a:
            java.lang.StringBuilder r3 = r0.MediaDescriptionCompat
            r3.setLength(r4)
            r3 = r1
        L_0x0080:
            int r7 = r0.MediaBrowserCompat$CustomActionResultReceiver(r3)
            if (r7 == r5) goto L_0x0249
            java.lang.StringBuilder r8 = r0.MediaDescriptionCompat
            char r9 = (char) r7
            r8.append(r9)
            int r3 = r3 + 8
            java.lang.StringBuilder r8 = r0.MediaDescriptionCompat
            int r8 = r8.length()
            if (r8 <= r6) goto L_0x00ae
            char[] r8 = MediaBrowserCompat$ItemReceiver
            char[] r9 = MediaBrowserCompat$CustomActionResultReceiver
            char r7 = r9[r7]
            if (r8 == 0) goto L_0x00ab
            int r9 = r8.length
            r10 = r4
        L_0x00a0:
            if (r10 >= r9) goto L_0x00ab
            char r11 = r8[r10]
            if (r11 != r7) goto L_0x00a8
            r7 = r6
            goto L_0x00ac
        L_0x00a8:
            int r10 = r10 + 1
            goto L_0x00a0
        L_0x00ab:
            r7 = r4
        L_0x00ac:
            if (r7 != 0) goto L_0x00b2
        L_0x00ae:
            int r7 = r0.write
            if (r3 < r7) goto L_0x0245
        L_0x00b2:
            int[] r7 = r0.read
            int r8 = r3 + -1
            r7 = r7[r8]
            r9 = -8
            r10 = r4
        L_0x00ba:
            if (r9 >= r5) goto L_0x00c6
            int[] r11 = r0.read
            int r12 = r3 + r9
            r11 = r11[r12]
            int r10 = r10 + r11
            int r9 = r9 + 1
            goto L_0x00ba
        L_0x00c6:
            int r5 = r0.write
            r9 = 2
            if (r3 >= r5) goto L_0x00d4
            int r10 = r10 / r9
            if (r7 < r10) goto L_0x00cf
            goto L_0x00d4
        L_0x00cf:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r1
        L_0x00d4:
            r3 = 4
            int[] r5 = new int[r3]
            r5 = {0, 0, 0, 0} // fill-array
            int[] r7 = new int[r3]
            r7 = {0, 0, 0, 0} // fill-array
            java.lang.StringBuilder r10 = r0.MediaDescriptionCompat
            int r10 = r10.length()
            int r10 = r10 - r6
            r12 = r1
            r11 = r4
        L_0x00e8:
            int[] r13 = IconCompatParcelizer
            java.lang.StringBuilder r14 = r0.MediaDescriptionCompat
            char r14 = r14.charAt(r11)
            r13 = r13[r14]
            r15 = 6
        L_0x00f3:
            if (r15 < 0) goto L_0x0112
            r16 = r15 & 1
            r17 = r13 & 1
            int r17 = r17 << 1
            int r16 = r16 + r17
            r17 = r5[r16]
            int[] r14 = r0.read
            int r18 = r12 + r15
            r14 = r14[r18]
            int r17 = r17 + r14
            r5[r16] = r17
            r14 = r7[r16]
            int r14 = r14 + r6
            r7[r16] = r14
            int r13 = r13 >> r6
            int r15 = r15 + -1
            goto L_0x00f3
        L_0x0112:
            if (r11 >= r10) goto L_0x0119
            int r12 = r12 + 8
            int r11 = r11 + 1
            goto L_0x00e8
        L_0x0119:
            float[] r11 = new float[r3]
            float[] r3 = new float[r3]
            r12 = r4
        L_0x011e:
            if (r12 >= r9) goto L_0x014e
            r13 = 0
            r3[r12] = r13
            int r13 = r12 + 2
            r14 = r5[r12]
            float r14 = (float) r14
            r15 = r7[r12]
            float r15 = (float) r15
            float r14 = r14 / r15
            r15 = r5[r13]
            float r15 = (float) r15
            r9 = r7[r13]
            float r9 = (float) r9
            float r15 = r15 / r9
            float r14 = r14 + r15
            r9 = 1073741824(0x40000000, float:2.0)
            float r14 = r14 / r9
            r3[r13] = r14
            r14 = r3[r13]
            r11[r12] = r14
            r14 = r5[r13]
            float r14 = (float) r14
            float r14 = r14 * r9
            r9 = 1069547520(0x3fc00000, float:1.5)
            float r14 = r14 + r9
            r9 = r7[r13]
            float r9 = (float) r9
            float r14 = r14 / r9
            r11[r13] = r14
            int r12 = r12 + 1
            r9 = 2
            goto L_0x011e
        L_0x014e:
            r7 = r1
            r5 = r4
        L_0x0150:
            int[] r9 = IconCompatParcelizer
            java.lang.StringBuilder r12 = r0.MediaDescriptionCompat
            char r12 = r12.charAt(r5)
            r9 = r9[r12]
            r12 = 6
        L_0x015b:
            if (r12 < 0) goto L_0x0180
            r13 = r12 & 1
            r14 = r9 & 1
            int r14 = r14 << r6
            int r13 = r13 + r14
            int[] r14 = r0.read
            int r15 = r7 + r12
            r14 = r14[r15]
            float r14 = (float) r14
            r15 = r3[r13]
            int r15 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r15 < 0) goto L_0x017b
            r13 = r11[r13]
            int r13 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r13 > 0) goto L_0x017b
            int r9 = r9 >> 1
            int r12 = r12 + -1
            goto L_0x015b
        L_0x017b:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r1
        L_0x0180:
            if (r5 >= r10) goto L_0x0187
            int r7 = r7 + 8
            int r5 = r5 + 1
            goto L_0x0150
        L_0x0187:
            r3 = r4
        L_0x0188:
            java.lang.StringBuilder r5 = r0.MediaDescriptionCompat
            int r5 = r5.length()
            if (r3 >= r5) goto L_0x01a0
            java.lang.StringBuilder r5 = r0.MediaDescriptionCompat
            char[] r7 = MediaBrowserCompat$CustomActionResultReceiver
            char r9 = r5.charAt(r3)
            char r7 = r7[r9]
            r5.setCharAt(r3, r7)
            int r3 = r3 + 1
            goto L_0x0188
        L_0x01a0:
            java.lang.StringBuilder r3 = r0.MediaDescriptionCompat
            char r3 = r3.charAt(r4)
            char[] r5 = MediaBrowserCompat$ItemReceiver
            if (r5 == 0) goto L_0x01b7
            int r7 = r5.length
            r9 = r4
        L_0x01ac:
            if (r9 >= r7) goto L_0x01b7
            char r10 = r5[r9]
            if (r10 != r3) goto L_0x01b4
            r3 = r6
            goto L_0x01b8
        L_0x01b4:
            int r9 = r9 + 1
            goto L_0x01ac
        L_0x01b7:
            r3 = r4
        L_0x01b8:
            if (r3 == 0) goto L_0x0240
            java.lang.StringBuilder r3 = r0.MediaDescriptionCompat
            int r5 = r3.length()
            int r5 = r5 - r6
            char r3 = r3.charAt(r5)
            char[] r5 = MediaBrowserCompat$ItemReceiver
            if (r5 == 0) goto L_0x01d6
            int r7 = r5.length
            r9 = r4
        L_0x01cb:
            if (r9 >= r7) goto L_0x01d6
            char r10 = r5[r9]
            if (r10 != r3) goto L_0x01d3
            r3 = r6
            goto L_0x01d7
        L_0x01d3:
            int r9 = r9 + 1
            goto L_0x01cb
        L_0x01d6:
            r3 = r4
        L_0x01d7:
            if (r3 == 0) goto L_0x023b
            java.lang.StringBuilder r3 = r0.MediaDescriptionCompat
            int r3 = r3.length()
            r5 = 3
            if (r3 <= r5) goto L_0x0236
            if (r2 == 0) goto L_0x01ec
            o.rsnIncContextCreate r3 = p040o.rsnIncContextCreate.RETURN_CODABAR_START_END
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L_0x01fb
        L_0x01ec:
            java.lang.StringBuilder r2 = r0.MediaDescriptionCompat
            int r3 = r2.length()
            int r3 = r3 - r6
            r2.deleteCharAt(r3)
            java.lang.StringBuilder r2 = r0.MediaDescriptionCompat
            r2.deleteCharAt(r4)
        L_0x01fb:
            r2 = r4
            r3 = r2
        L_0x01fd:
            if (r2 >= r1) goto L_0x0207
            int[] r5 = r0.read
            r5 = r5[r2]
            int r3 = r3 + r5
            int r2 = r2 + 1
            goto L_0x01fd
        L_0x0207:
            float r2 = (float) r3
        L_0x0208:
            if (r1 >= r8) goto L_0x0212
            int[] r5 = r0.read
            r5 = r5[r1]
            int r3 = r3 + r5
            int r1 = r1 + 1
            goto L_0x0208
        L_0x0212:
            float r1 = (float) r3
            java.lang.StringBuilder r3 = r0.MediaDescriptionCompat
            java.lang.String r3 = r3.toString()
            r5 = 2
            o.rsnScriptForEach[] r5 = new p040o.rsnScriptForEach[r5]
            r7 = r20
            float r7 = (float) r7
            o.rsnScriptForEach r8 = new o.rsnScriptForEach
            r8.<init>(r2, r7)
            r5[r4] = r8
            o.rsnScriptForEach r2 = new o.rsnScriptForEach
            r2.<init>(r1, r7)
            r5[r6] = r2
            o.getLayers$MediaBrowserCompat$CustomActionResultReceiver r1 = new o.getLayers$MediaBrowserCompat$CustomActionResultReceiver
            r2 = 0
            o.rsnIncAllocationCreateTyped r4 = p040o.rsnIncAllocationCreateTyped.CODABAR
            r1.<init>(r3, r2, r5, r4)
            return r1
        L_0x0236:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r1
        L_0x023b:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r1
        L_0x0240:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r1
        L_0x0245:
            r7 = r20
            goto L_0x0080
        L_0x0249:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r1
        L_0x024e:
            r7 = r20
            int r1 = r1 + 2
            goto L_0x003d
        L_0x0254:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r1
        L_0x0259:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.run.IconCompatParcelizer(int, o.rsnScriptIntrinsicCreate, java.util.Map):o.getLayers$MediaBrowserCompat$CustomActionResultReceiver");
    }

    private void write(int i) {
        int[] iArr = this.read;
        int i2 = this.write;
        iArr[i2] = i;
        int i3 = i2 + 1;
        this.write = i3;
        if (i3 >= iArr.length) {
            int[] iArr2 = new int[(i3 << 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.read = iArr2;
        }
    }

    static boolean MediaBrowserCompat$ItemReceiver(char[] cArr, char c) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    private int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        int i2 = i + 7;
        if (i2 >= this.write) {
            return -1;
        }
        int[] iArr = this.read;
        int i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i4 = 0;
        int i5 = Integer.MAX_VALUE;
        int i6 = 0;
        for (int i7 = i; i7 < i2; i7 += 2) {
            int i8 = iArr[i7];
            if (i8 < i5) {
                i5 = i8;
            }
            if (i8 > i6) {
                i6 = i8;
            }
        }
        int i9 = (i5 + i6) / 2;
        int i10 = 0;
        for (int i11 = i + 1; i11 < i2; i11 += 2) {
            int i12 = iArr[i11];
            if (i12 < i3) {
                i3 = i12;
            }
            if (i12 > i10) {
                i10 = i12;
            }
        }
        int i13 = (i3 + i10) / 2;
        int i14 = 128;
        int i15 = 0;
        for (int i16 = 0; i16 < 7; i16++) {
            i14 >>= 1;
            if (iArr[i + i16] > ((i16 & 1) == 0 ? i9 : i13)) {
                i15 |= i14;
            }
        }
        while (true) {
            int[] iArr2 = IconCompatParcelizer;
            if (i4 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i4] == i15) {
                return i4;
            }
            i4++;
        }
    }
}
