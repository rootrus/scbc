package p040o;

import com.google.zxing.FormatException;

/* renamed from: o.getConnectionStatusCode */
public final class getConnectionStatusCode extends FragmentBuilder_BindSummaryFragment {

    /* renamed from: o.getConnectionStatusCode$read */
    public static final class read {
        private final rsnScriptSetVarI IconCompatParcelizer;
        public final safeID read;
        private final rsnScriptSetVarI write;

        private read() {
        }

        public read(rsnScriptSetVarI rsnscriptsetvari) throws FormatException {
            int i = rsnscriptsetvari.write;
            if (i < 8 || i > 144 || (i & 1) != 0) {
                throw FormatException.read();
            }
            this.read = safeID.IconCompatParcelizer(rsnscriptsetvari.write, rsnscriptsetvari.IconCompatParcelizer);
            rsnScriptSetVarI read2 = read(rsnscriptsetvari);
            this.IconCompatParcelizer = read2;
            this.write = new rsnScriptSetVarI(read2.IconCompatParcelizer, this.IconCompatParcelizer.write);
        }

        private rsnScriptSetVarI read(rsnScriptSetVarI rsnscriptsetvari) {
            int i = this.read.write;
            int i2 = this.read.MediaBrowserCompat$CustomActionResultReceiver;
            if (rsnscriptsetvari.write == i) {
                int i3 = this.read.read;
                int i4 = this.read.MediaBrowserCompat$ItemReceiver;
                int i5 = i / i3;
                int i6 = i2 / i4;
                rsnScriptSetVarI rsnscriptsetvari2 = new rsnScriptSetVarI(i6 * i4, i5 * i3);
                for (int i7 = 0; i7 < i5; i7++) {
                    for (int i8 = 0; i8 < i6; i8++) {
                        for (int i9 = 0; i9 < i3; i9++) {
                            for (int i10 = 0; i10 < i4; i10++) {
                                if (rsnscriptsetvari.MediaBrowserCompat$ItemReceiver(((i4 + 2) * i8) + 1 + i10, ((i3 + 2) * i7) + 1 + i9)) {
                                    int i11 = (i8 * i4) + i10;
                                    int i12 = (((i7 * i3) + i9) * rsnscriptsetvari2.read) + (i11 / 32);
                                    int[] iArr = rsnscriptsetvari2.MediaBrowserCompat$CustomActionResultReceiver;
                                    iArr[i12] = (1 << (i11 & 31)) | iArr[i12];
                                }
                            }
                        }
                    }
                }
                return rsnscriptsetvari2;
            }
            throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
        }

        private boolean MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, int i3, int i4) {
            if (i < 0) {
                i += i3;
                i2 += 4 - ((i3 + 4) & 7);
            }
            if (i2 < 0) {
                i2 += i4;
                i += 4 - ((i4 + 4) & 7);
            }
            rsnScriptSetVarI rsnscriptsetvari = this.write;
            int i5 = (rsnscriptsetvari.read * i) + (i2 / 32);
            int[] iArr = rsnscriptsetvari.MediaBrowserCompat$CustomActionResultReceiver;
            iArr[i5] = (1 << (i2 & 31)) | iArr[i5];
            return this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i2, i);
        }

        private int IconCompatParcelizer(int i, int i2, int i3, int i4) {
            int i5 = i - 2;
            int i6 = i2 - 2;
            int i7 = (MediaBrowserCompat$CustomActionResultReceiver(i5, i6, i3, i4) ? 1 : 0) << true;
            int i8 = i2 - 1;
            if (MediaBrowserCompat$CustomActionResultReceiver(i5, i8, i3, i4)) {
                i7 |= 1;
            }
            int i9 = i7 << 1;
            int i10 = i - 1;
            if (MediaBrowserCompat$CustomActionResultReceiver(i10, i6, i3, i4)) {
                i9 |= 1;
            }
            int i11 = i9 << 1;
            if (MediaBrowserCompat$CustomActionResultReceiver(i10, i8, i3, i4)) {
                i11 |= 1;
            }
            int i12 = i11 << 1;
            if (MediaBrowserCompat$CustomActionResultReceiver(i10, i2, i3, i4)) {
                i12 |= 1;
            }
            int i13 = i12 << 1;
            if (MediaBrowserCompat$CustomActionResultReceiver(i, i6, i3, i4)) {
                i13 |= 1;
            }
            int i14 = i13 << 1;
            if (MediaBrowserCompat$CustomActionResultReceiver(i, i8, i3, i4)) {
                i14 |= 1;
            }
            int i15 = i14 << 1;
            return MediaBrowserCompat$CustomActionResultReceiver(i, i2, i3, i4) ? i15 | 1 : i15;
        }

        /* JADX WARNING: Removed duplicated region for block: B:131:0x01ef A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x0018 A[ADDED_TO_REGION, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final byte[] IconCompatParcelizer() throws com.google.zxing.FormatException {
            /*
                r18 = this;
                r0 = r18
                o.safeID r1 = r0.read
                int r1 = r1.RatingCompat
                byte[] r1 = new byte[r1]
                o.rsnScriptSetVarI r2 = r0.IconCompatParcelizer
                int r2 = r2.write
                o.rsnScriptSetVarI r3 = r0.IconCompatParcelizer
                int r3 = r3.IconCompatParcelizer
                r5 = 0
                r7 = r5
                r8 = r7
                r9 = r8
                r10 = r9
                r11 = r10
                r12 = r11
                r6 = 4
            L_0x0018:
                r13 = 3
                r14 = 2
                r15 = 1
                if (r6 != r2) goto L_0x007b
                if (r7 != 0) goto L_0x007b
                if (r8 != 0) goto L_0x007b
                int r8 = r2 + -1
                boolean r16 = r0.MediaBrowserCompat$CustomActionResultReceiver(r8, r5, r2, r3)
                int r16 = r16 << 1
                boolean r17 = r0.MediaBrowserCompat$CustomActionResultReceiver(r8, r15, r2, r3)
                if (r17 == 0) goto L_0x0031
                r16 = r16 | 1
            L_0x0031:
                int r16 = r16 << 1
                boolean r8 = r0.MediaBrowserCompat$CustomActionResultReceiver(r8, r14, r2, r3)
                if (r8 == 0) goto L_0x003b
                r16 = r16 | 1
            L_0x003b:
                int r8 = r16 << 1
                int r4 = r3 + -2
                boolean r4 = r0.MediaBrowserCompat$CustomActionResultReceiver(r5, r4, r2, r3)
                if (r4 == 0) goto L_0x0047
                r8 = r8 | 1
            L_0x0047:
                int r4 = r8 << 1
                int r8 = r3 + -1
                boolean r17 = r0.MediaBrowserCompat$CustomActionResultReceiver(r5, r8, r2, r3)
                if (r17 == 0) goto L_0x0053
                r4 = r4 | 1
            L_0x0053:
                int r4 = r4 << r15
                boolean r17 = r0.MediaBrowserCompat$CustomActionResultReceiver(r15, r8, r2, r3)
                if (r17 == 0) goto L_0x005c
                r4 = r4 | 1
            L_0x005c:
                int r4 = r4 << r15
                boolean r14 = r0.MediaBrowserCompat$CustomActionResultReceiver(r14, r8, r2, r3)
                if (r14 == 0) goto L_0x0065
                r4 = r4 | 1
            L_0x0065:
                int r4 = r4 << r15
                boolean r8 = r0.MediaBrowserCompat$CustomActionResultReceiver(r13, r8, r2, r3)
                if (r8 == 0) goto L_0x006e
                r4 = r4 | 1
            L_0x006e:
                byte r4 = (byte) r4
                r1[r9] = r4
                int r6 = r6 + -2
                int r7 = r7 + 2
                int r9 = r9 + 1
                r8 = r15
            L_0x0078:
                r14 = 4
                goto L_0x01ed
            L_0x007b:
                int r4 = r2 + -2
                if (r6 != r4) goto L_0x00e2
                if (r7 != 0) goto L_0x00e2
                r17 = r3 & 3
                if (r17 == 0) goto L_0x00e2
                if (r10 != 0) goto L_0x00e2
                int r10 = r2 + -3
                boolean r10 = r0.MediaBrowserCompat$CustomActionResultReceiver(r10, r5, r2, r3)
                int r10 = r10 << r15
                boolean r4 = r0.MediaBrowserCompat$CustomActionResultReceiver(r4, r5, r2, r3)
                if (r4 == 0) goto L_0x0096
                r10 = r10 | 1
            L_0x0096:
                int r4 = r10 << 1
                int r10 = r2 + -1
                boolean r10 = r0.MediaBrowserCompat$CustomActionResultReceiver(r10, r5, r2, r3)
                if (r10 == 0) goto L_0x00a2
                r4 = r4 | 1
            L_0x00a2:
                int r4 = r4 << r15
                int r10 = r3 + -4
                boolean r10 = r0.MediaBrowserCompat$CustomActionResultReceiver(r5, r10, r2, r3)
                if (r10 == 0) goto L_0x00ad
                r4 = r4 | 1
            L_0x00ad:
                int r4 = r4 << r15
                int r10 = r3 + -3
                boolean r10 = r0.MediaBrowserCompat$CustomActionResultReceiver(r5, r10, r2, r3)
                if (r10 == 0) goto L_0x00b8
                r4 = r4 | 1
            L_0x00b8:
                int r4 = r4 << r15
                int r10 = r3 + -2
                boolean r10 = r0.MediaBrowserCompat$CustomActionResultReceiver(r5, r10, r2, r3)
                if (r10 == 0) goto L_0x00c3
                r4 = r4 | 1
            L_0x00c3:
                int r4 = r4 << r15
                int r10 = r3 + -1
                boolean r13 = r0.MediaBrowserCompat$CustomActionResultReceiver(r5, r10, r2, r3)
                if (r13 == 0) goto L_0x00ce
                r4 = r4 | 1
            L_0x00ce:
                int r4 = r4 << r15
                boolean r10 = r0.MediaBrowserCompat$CustomActionResultReceiver(r15, r10, r2, r3)
                if (r10 == 0) goto L_0x00d7
                r4 = r4 | 1
            L_0x00d7:
                byte r4 = (byte) r4
                r1[r9] = r4
                int r6 = r6 + -2
                int r7 = r7 + 2
                int r9 = r9 + 1
                r10 = r15
                goto L_0x0078
            L_0x00e2:
                int r13 = r2 + 4
                if (r6 != r13) goto L_0x0146
                if (r7 != r14) goto L_0x0146
                r13 = r3 & 7
                if (r13 != 0) goto L_0x0146
                if (r11 != 0) goto L_0x0146
                int r4 = r2 + -1
                boolean r11 = r0.MediaBrowserCompat$CustomActionResultReceiver(r4, r5, r2, r3)
                int r11 = r11 << r15
                int r13 = r3 + -1
                boolean r4 = r0.MediaBrowserCompat$CustomActionResultReceiver(r4, r13, r2, r3)
                if (r4 == 0) goto L_0x00ff
                r11 = r11 | 1
            L_0x00ff:
                int r4 = r11 << 1
                int r11 = r3 + -3
                boolean r14 = r0.MediaBrowserCompat$CustomActionResultReceiver(r5, r11, r2, r3)
                if (r14 == 0) goto L_0x010b
                r4 = r4 | 1
            L_0x010b:
                int r4 = r4 << r15
                int r14 = r3 + -2
                boolean r17 = r0.MediaBrowserCompat$CustomActionResultReceiver(r5, r14, r2, r3)
                if (r17 == 0) goto L_0x0116
                r4 = r4 | 1
            L_0x0116:
                int r4 = r4 << r15
                boolean r17 = r0.MediaBrowserCompat$CustomActionResultReceiver(r5, r13, r2, r3)
                if (r17 == 0) goto L_0x011f
                r4 = r4 | 1
            L_0x011f:
                int r4 = r4 << r15
                boolean r11 = r0.MediaBrowserCompat$CustomActionResultReceiver(r15, r11, r2, r3)
                if (r11 == 0) goto L_0x0128
                r4 = r4 | 1
            L_0x0128:
                int r4 = r4 << r15
                boolean r11 = r0.MediaBrowserCompat$CustomActionResultReceiver(r15, r14, r2, r3)
                if (r11 == 0) goto L_0x0131
                r4 = r4 | 1
            L_0x0131:
                int r4 = r4 << r15
                boolean r11 = r0.MediaBrowserCompat$CustomActionResultReceiver(r15, r13, r2, r3)
                if (r11 == 0) goto L_0x013a
                r4 = r4 | 1
            L_0x013a:
                byte r4 = (byte) r4
                r1[r9] = r4
                int r6 = r6 + -2
                int r7 = r7 + 2
                int r9 = r9 + 1
                r11 = r15
                goto L_0x0078
            L_0x0146:
                if (r6 != r4) goto L_0x01aa
                if (r7 != 0) goto L_0x01aa
                r13 = r3 & 7
                r14 = 4
                if (r13 != r14) goto L_0x01ab
                if (r12 != 0) goto L_0x01ab
                int r12 = r2 + -3
                boolean r12 = r0.MediaBrowserCompat$CustomActionResultReceiver(r12, r5, r2, r3)
                int r12 = r12 << r15
                boolean r4 = r0.MediaBrowserCompat$CustomActionResultReceiver(r4, r5, r2, r3)
                if (r4 == 0) goto L_0x0160
                r12 = r12 | 1
            L_0x0160:
                int r4 = r12 << 1
                int r12 = r2 + -1
                boolean r12 = r0.MediaBrowserCompat$CustomActionResultReceiver(r12, r5, r2, r3)
                if (r12 == 0) goto L_0x016c
                r4 = r4 | 1
            L_0x016c:
                int r4 = r4 << r15
                int r12 = r3 + -2
                boolean r12 = r0.MediaBrowserCompat$CustomActionResultReceiver(r5, r12, r2, r3)
                if (r12 == 0) goto L_0x0177
                r4 = r4 | 1
            L_0x0177:
                int r4 = r4 << r15
                int r12 = r3 + -1
                boolean r13 = r0.MediaBrowserCompat$CustomActionResultReceiver(r5, r12, r2, r3)
                if (r13 == 0) goto L_0x0182
                r4 = r4 | 1
            L_0x0182:
                int r4 = r4 << r15
                boolean r13 = r0.MediaBrowserCompat$CustomActionResultReceiver(r15, r12, r2, r3)
                if (r13 == 0) goto L_0x018b
                r4 = r4 | 1
            L_0x018b:
                int r4 = r4 << r15
                r13 = 2
                boolean r13 = r0.MediaBrowserCompat$CustomActionResultReceiver(r13, r12, r2, r3)
                if (r13 == 0) goto L_0x0195
                r4 = r4 | 1
            L_0x0195:
                int r4 = r4 << r15
                r13 = 3
                boolean r12 = r0.MediaBrowserCompat$CustomActionResultReceiver(r13, r12, r2, r3)
                if (r12 == 0) goto L_0x019f
                r4 = r4 | 1
            L_0x019f:
                byte r4 = (byte) r4
                r1[r9] = r4
                int r6 = r6 + -2
                int r7 = r7 + 2
                int r9 = r9 + 1
                r12 = r15
                goto L_0x01ed
            L_0x01aa:
                r14 = 4
            L_0x01ab:
                if (r6 >= r2) goto L_0x01c0
                if (r7 < 0) goto L_0x01c0
                o.rsnScriptSetVarI r4 = r0.write
                boolean r4 = r4.MediaBrowserCompat$ItemReceiver(r7, r6)
                if (r4 != 0) goto L_0x01c0
                int r4 = r0.IconCompatParcelizer(r6, r7, r2, r3)
                byte r4 = (byte) r4
                r1[r9] = r4
                int r9 = r9 + 1
            L_0x01c0:
                int r6 = r6 + -2
                int r7 = r7 + 2
                if (r6 < 0) goto L_0x01c8
                if (r7 < r3) goto L_0x01ab
            L_0x01c8:
                int r6 = r6 + 1
                int r7 = r7 + 3
            L_0x01cc:
                if (r6 < 0) goto L_0x01e1
                if (r7 >= r3) goto L_0x01e1
                o.rsnScriptSetVarI r4 = r0.write
                boolean r4 = r4.MediaBrowserCompat$ItemReceiver(r7, r6)
                if (r4 != 0) goto L_0x01e1
                int r4 = r0.IconCompatParcelizer(r6, r7, r2, r3)
                byte r4 = (byte) r4
                r1[r9] = r4
                int r9 = r9 + 1
            L_0x01e1:
                int r6 = r6 + 2
                int r7 = r7 + -2
                if (r6 >= r2) goto L_0x01e9
                if (r7 >= 0) goto L_0x01cc
            L_0x01e9:
                int r6 = r6 + 3
                int r7 = r7 + 1
            L_0x01ed:
                if (r6 < r2) goto L_0x0018
                if (r7 < r3) goto L_0x0018
                o.safeID r2 = r0.read
                int r2 = r2.RatingCompat
                if (r9 != r2) goto L_0x01f8
                return r1
            L_0x01f8:
                com.google.zxing.FormatException r1 = com.google.zxing.FormatException.read()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.getConnectionStatusCode.read.IconCompatParcelizer():byte[]");
        }
    }
}
