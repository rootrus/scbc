package p040o;

import com.google.zxing.ChecksumException;

/* renamed from: o.MIRRORED_REPEAT_LINEAR */
public final class MIRRORED_REPEAT_LINEAR extends getMinification {
    private static final int IconCompatParcelizer;
    static final int[] read;
    private static final char[] write = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();
    private final StringBuilder MediaBrowserCompat$CustomActionResultReceiver = new StringBuilder(20);
    private final int[] MediaBrowserCompat$ItemReceiver = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        read = iArr;
        IconCompatParcelizer = iArr[47];
    }

    private static int write(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int round = Math.round((((float) iArr[i4]) * 9.0f) / ((float) i));
            if (round <= 0 || round > 4) {
                return -1;
            }
            if ((i4 & 1) == 0) {
                for (int i5 = 0; i5 < round; i5++) {
                    i3 = (i3 << 1) | 1;
                }
            } else {
                i3 <<= round;
            }
        }
        return i3;
    }

    private static void IconCompatParcelizer(CharSequence charSequence, int i, int i2) throws ChecksumException {
        int i3 = 0;
        int i4 = 1;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            i3 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i5)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        if (charSequence.charAt(i) != write[i3 % 47]) {
            throw ChecksumException.write();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        r8 = write[r9];
        r7.append(r8);
        r9 = r6.length;
        r10 = 0;
        r12 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        if (r10 >= r9) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        r12 = r12 + r6[r10];
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        r9 = r1.read(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0084, code lost:
        if (r8 != '*') goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0086, code lost:
        r7.deleteCharAt(r7.length() - 1);
        r8 = r6.length;
        r10 = 0;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0091, code lost:
        if (r10 >= r8) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0093, code lost:
        r12 = r12 + r6[r10];
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0099, code lost:
        if (r9 == r5) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a6, code lost:
        if ((r1.write[r9 / 32] & (1 << (r9 & 31))) == 0) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a8, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00aa, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ab, code lost:
        if (r1 == false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b1, code lost:
        if (r7.length() < 2) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b3, code lost:
        r1 = r7.length();
        IconCompatParcelizer((java.lang.CharSequence) r7, r1 - 2, 20);
        IconCompatParcelizer((java.lang.CharSequence) r7, r1 - 1, 15);
        r7.setLength(r7.length() - 2);
        r1 = r7.length();
        r5 = new java.lang.StringBuilder(r1);
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d6, code lost:
        if (r6 >= r1) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d8, code lost:
        r8 = r7.charAt(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00de, code lost:
        if (r8 < 'a') goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        if (r8 > 'd') goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e6, code lost:
        if (r6 >= (r1 - 1)) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e8, code lost:
        r6 = r6 + 1;
        r9 = r7.charAt(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f4, code lost:
        switch(r8) {
            case 97: goto L_0x014d;
            case 98: goto L_0x0117;
            case 99: goto L_0x0106;
            case 100: goto L_0x00fa;
            default: goto L_0x00f7;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f7, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fa, code lost:
        if (r9 < 'A') goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fc, code lost:
        if (r9 > 'Z') goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fe, code lost:
        r9 = r9 + ' ';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0105, code lost:
        throw com.google.zxing.FormatException.read();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0106, code lost:
        if (r9 < 'A') goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0108, code lost:
        if (r9 > 'O') goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010a, code lost:
        r9 = r9 - ' ';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x010d, code lost:
        if (r9 != 'Z') goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010f, code lost:
        r8 = ':';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0116, code lost:
        throw com.google.zxing.FormatException.read();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0117, code lost:
        if (r9 < 'A') goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011b, code lost:
        if (r9 > 'E') goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011d, code lost:
        r9 = r9 - '&';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0122, code lost:
        if (r9 < 'F') goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0126, code lost:
        if (r9 > 'J') goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0128, code lost:
        r9 = r9 - 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012d, code lost:
        if (r9 < 'K') goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x012f, code lost:
        if (r9 > 'O') goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0131, code lost:
        r9 = r9 + 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0136, code lost:
        if (r9 < 'P') goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x013a, code lost:
        if (r9 > 'S') goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x013c, code lost:
        r9 = r9 + '+';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0141, code lost:
        if (r9 < 'T') goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0143, code lost:
        if (r9 > 'Z') goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0145, code lost:
        r8 = 127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x014c, code lost:
        throw com.google.zxing.FormatException.read();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x014d, code lost:
        if (r9 < 'A') goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x014f, code lost:
        if (r9 > 'Z') goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0151, code lost:
        r9 = r9 - '@';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0153, code lost:
        r8 = (char) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0159, code lost:
        throw com.google.zxing.FormatException.read();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x015a, code lost:
        r5.append(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0162, code lost:
        throw com.google.zxing.FormatException.read();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0163, code lost:
        r5.append(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0166, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0169, code lost:
        r7 = (float) r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0195, code lost:
        return new p040o.getLayers$MediaBrowserCompat$CustomActionResultReceiver(r5.toString(), (byte[]) null, new p040o.rsnScriptForEach[]{new p040o.rsnScriptForEach(((float) (r2[1] + r2[0])) / 2.0f, r7), new p040o.rsnScriptForEach(((float) r4) + (((float) r12) / 2.0f), r7)}, p040o.rsnIncAllocationCreateTyped.CODE_93);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x019a, code lost:
        throw com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x019f, code lost:
        throw com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.getLayers$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer(int r17, p040o.rsnScriptIntrinsicCreate r18, java.util.Map<p040o.rsnIncContextCreate, ?> r19) throws com.google.zxing.NotFoundException, com.google.zxing.ChecksumException, com.google.zxing.FormatException {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            int r2 = r1.read
            r3 = 0
            int r4 = r1.read((int) r3)
            int[] r5 = r0.MediaBrowserCompat$ItemReceiver
            java.util.Arrays.fill(r5, r3)
            int[] r5 = r0.MediaBrowserCompat$ItemReceiver
            int r6 = r5.length
            r8 = r3
            r9 = r8
            r7 = r4
        L_0x0016:
            if (r4 >= r2) goto L_0x01d5
            r10 = r4 & 31
            r11 = 1
            int r10 = r11 << r10
            int[] r12 = r1.write
            int r13 = r4 / 32
            r12 = r12[r13]
            r10 = r10 & r12
            if (r10 == 0) goto L_0x0028
            r10 = r11
            goto L_0x0029
        L_0x0028:
            r10 = r3
        L_0x0029:
            if (r10 == r8) goto L_0x0034
            r10 = r5[r9]
            int r10 = r10 + r11
            r5[r9] = r10
            r10 = r17
            goto L_0x01d1
        L_0x0034:
            int r10 = r6 + -1
            if (r9 != r10) goto L_0x01c9
            int r10 = write(r5)
            int r12 = IconCompatParcelizer
            r13 = 2
            if (r10 != r12) goto L_0x01b5
            int[] r2 = new int[r13]
            r2[r3] = r7
            r2[r11] = r4
            r4 = r2[r11]
            int r4 = r1.read((int) r4)
            int r5 = r1.read
            int[] r6 = r0.MediaBrowserCompat$ItemReceiver
            java.util.Arrays.fill(r6, r3)
            java.lang.StringBuilder r7 = r0.MediaBrowserCompat$CustomActionResultReceiver
            r7.setLength(r3)
        L_0x0059:
            MediaBrowserCompat$ItemReceiver(r1, r4, r6)
            int r8 = write(r6)
            if (r8 < 0) goto L_0x01b0
            r9 = r3
        L_0x0063:
            int[] r10 = read
            int r12 = r10.length
            if (r9 >= r12) goto L_0x01ab
            r10 = r10[r9]
            if (r10 != r8) goto L_0x01a5
            char[] r8 = write
            char r8 = r8[r9]
            r7.append(r8)
            int r9 = r6.length
            r10 = r3
            r12 = r4
        L_0x0076:
            if (r10 >= r9) goto L_0x007e
            r14 = r6[r10]
            int r12 = r12 + r14
            int r10 = r10 + 1
            goto L_0x0076
        L_0x007e:
            int r9 = r1.read((int) r12)
            r10 = 42
            if (r8 != r10) goto L_0x01a0
            int r8 = r7.length()
            int r8 = r8 - r11
            r7.deleteCharAt(r8)
            int r8 = r6.length
            r10 = r3
            r12 = r10
        L_0x0091:
            if (r10 >= r8) goto L_0x0099
            r14 = r6[r10]
            int r12 = r12 + r14
            int r10 = r10 + 1
            goto L_0x0091
        L_0x0099:
            if (r9 == r5) goto L_0x019b
            r5 = r9 & 31
            int r5 = r11 << r5
            int[] r1 = r1.write
            int r9 = r9 / 32
            r1 = r1[r9]
            r1 = r1 & r5
            if (r1 == 0) goto L_0x00aa
            r1 = r11
            goto L_0x00ab
        L_0x00aa:
            r1 = r3
        L_0x00ab:
            if (r1 == 0) goto L_0x019b
            int r1 = r7.length()
            if (r1 < r13) goto L_0x0196
            int r1 = r7.length()
            int r5 = r1 + -2
            r6 = 20
            IconCompatParcelizer((java.lang.CharSequence) r7, (int) r5, (int) r6)
            int r1 = r1 - r11
            r5 = 15
            IconCompatParcelizer((java.lang.CharSequence) r7, (int) r1, (int) r5)
            int r1 = r7.length()
            int r1 = r1 - r13
            r7.setLength(r1)
            int r1 = r7.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r6 = r3
        L_0x00d6:
            if (r6 >= r1) goto L_0x0169
            char r8 = r7.charAt(r6)
            r9 = 97
            if (r8 < r9) goto L_0x0163
            r9 = 100
            if (r8 > r9) goto L_0x0163
            int r9 = r1 + -1
            if (r6 >= r9) goto L_0x015e
            int r6 = r6 + 1
            char r9 = r7.charAt(r6)
            r10 = 79
            r14 = 90
            r15 = 65
            switch(r8) {
                case 97: goto L_0x014d;
                case 98: goto L_0x0117;
                case 99: goto L_0x0106;
                case 100: goto L_0x00fa;
                default: goto L_0x00f7;
            }
        L_0x00f7:
            r8 = r3
            goto L_0x015a
        L_0x00fa:
            if (r9 < r15) goto L_0x0101
            if (r9 > r14) goto L_0x0101
            int r9 = r9 + 32
            goto L_0x0153
        L_0x0101:
            com.google.zxing.FormatException r1 = com.google.zxing.FormatException.read()
            throw r1
        L_0x0106:
            if (r9 < r15) goto L_0x010d
            if (r9 > r10) goto L_0x010d
            int r9 = r9 + -32
            goto L_0x0153
        L_0x010d:
            if (r9 != r14) goto L_0x0112
            r8 = 58
            goto L_0x015a
        L_0x0112:
            com.google.zxing.FormatException r1 = com.google.zxing.FormatException.read()
            throw r1
        L_0x0117:
            if (r9 < r15) goto L_0x0120
            r8 = 69
            if (r9 > r8) goto L_0x0120
            int r9 = r9 + -38
            goto L_0x0153
        L_0x0120:
            r8 = 70
            if (r9 < r8) goto L_0x012b
            r8 = 74
            if (r9 > r8) goto L_0x012b
            int r9 = r9 + -11
            goto L_0x0153
        L_0x012b:
            r8 = 75
            if (r9 < r8) goto L_0x0134
            if (r9 > r10) goto L_0x0134
            int r9 = r9 + 16
            goto L_0x0153
        L_0x0134:
            r8 = 80
            if (r9 < r8) goto L_0x013f
            r8 = 83
            if (r9 > r8) goto L_0x013f
            int r9 = r9 + 43
            goto L_0x0153
        L_0x013f:
            r8 = 84
            if (r9 < r8) goto L_0x0148
            if (r9 > r14) goto L_0x0148
            r8 = 127(0x7f, float:1.78E-43)
            goto L_0x015a
        L_0x0148:
            com.google.zxing.FormatException r1 = com.google.zxing.FormatException.read()
            throw r1
        L_0x014d:
            if (r9 < r15) goto L_0x0155
            if (r9 > r14) goto L_0x0155
            int r9 = r9 + -64
        L_0x0153:
            char r8 = (char) r9
            goto L_0x015a
        L_0x0155:
            com.google.zxing.FormatException r1 = com.google.zxing.FormatException.read()
            throw r1
        L_0x015a:
            r5.append(r8)
            goto L_0x0166
        L_0x015e:
            com.google.zxing.FormatException r1 = com.google.zxing.FormatException.read()
            throw r1
        L_0x0163:
            r5.append(r8)
        L_0x0166:
            int r6 = r6 + r11
            goto L_0x00d6
        L_0x0169:
            java.lang.String r1 = r5.toString()
            r5 = r2[r11]
            r2 = r2[r3]
            int r5 = r5 + r2
            float r2 = (float) r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r5
            float r4 = (float) r4
            float r6 = (float) r12
            float r6 = r6 / r5
            o.rsnScriptForEach[] r5 = new p040o.rsnScriptForEach[r13]
            r10 = r17
            float r7 = (float) r10
            o.rsnScriptForEach r8 = new o.rsnScriptForEach
            r8.<init>(r2, r7)
            r5[r3] = r8
            o.rsnScriptForEach r2 = new o.rsnScriptForEach
            float r4 = r4 + r6
            r2.<init>(r4, r7)
            r5[r11] = r2
            o.getLayers$MediaBrowserCompat$CustomActionResultReceiver r2 = new o.getLayers$MediaBrowserCompat$CustomActionResultReceiver
            r3 = 0
            o.rsnIncAllocationCreateTyped r4 = p040o.rsnIncAllocationCreateTyped.CODE_93
            r2.<init>(r1, r3, r5, r4)
            return r2
        L_0x0196:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r1
        L_0x019b:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r1
        L_0x01a0:
            r10 = r17
            r4 = r9
            goto L_0x0059
        L_0x01a5:
            r10 = r17
            int r9 = r9 + 1
            goto L_0x0063
        L_0x01ab:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r1
        L_0x01b0:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r1
        L_0x01b5:
            r10 = r17
            r12 = r5[r3]
            r14 = r5[r11]
            int r12 = r12 + r14
            int r7 = r7 + r12
            int r12 = r9 + -1
            java.lang.System.arraycopy(r5, r13, r5, r3, r12)
            r5[r12] = r3
            r5[r9] = r3
            int r9 = r9 + -1
            goto L_0x01cd
        L_0x01c9:
            r10 = r17
            int r9 = r9 + 1
        L_0x01cd:
            r5[r9] = r11
            r8 = r8 ^ 1
        L_0x01d1:
            int r4 = r4 + 1
            goto L_0x0016
        L_0x01d5:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.MIRRORED_REPEAT_LINEAR.IconCompatParcelizer(int, o.rsnScriptIntrinsicCreate, java.util.Map):o.getLayers$MediaBrowserCompat$CustomActionResultReceiver");
    }
}
