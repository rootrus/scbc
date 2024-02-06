package p040o;

import p040o.setAccount;

/* renamed from: o.rsnScriptGroup2Execute */
public final class rsnScriptGroup2Execute {
    private static final int[] MediaBrowserCompat$ItemReceiver = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r4 != 32) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040o.getICheckDeserializerRtti write(byte[] r21, int r22, int r23) {
        /*
            o.rsnScriptGroupCreate r0 = new o.rsnScriptGroupCreate
            r1 = r21
            r0.<init>(r1)
            o.rsnScriptGroupSetOutput r1 = p040o.rsnScriptGroupSetOutput.MediaBrowserCompat$CustomActionResultReceiver
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r2 = 0
            r3 = r2
        L_0x000f:
            byte[] r4 = r0.write
            int r5 = r4.length
            r6 = 5
            r7 = 3
            r8 = 4
            r9 = 2
            r10 = 32
            r11 = 1
            if (r3 >= r5) goto L_0x0072
            int r5 = r3 + 1
            int r12 = r4.length
            if (r5 >= r12) goto L_0x0023
            byte r4 = r4[r5]
            goto L_0x0024
        L_0x0023:
            r4 = r2
        L_0x0024:
            byte[] r12 = r0.write
            byte r12 = r12[r3]
            r13 = 13
            if (r12 == r13) goto L_0x0044
            r9 = 44
            if (r12 == r9) goto L_0x0040
            r8 = 46
            if (r12 == r8) goto L_0x003c
            r7 = 58
            if (r12 == r7) goto L_0x0039
            goto L_0x004a
        L_0x0039:
            if (r4 != r10) goto L_0x004a
            goto L_0x004b
        L_0x003c:
            if (r4 != r10) goto L_0x004a
            r6 = r7
            goto L_0x004b
        L_0x0040:
            if (r4 != r10) goto L_0x004a
            r6 = r8
            goto L_0x004b
        L_0x0044:
            r6 = 10
            if (r4 != r6) goto L_0x004a
            r6 = r9
            goto L_0x004b
        L_0x004a:
            r6 = r2
        L_0x004b:
            if (r6 <= 0) goto L_0x0053
            java.util.Collection r1 = p040o.rsnScriptGroupCreate.MediaBrowserCompat$ItemReceiver((java.lang.Iterable<p040o.rsnScriptGroupSetOutput>) r1, (int) r3, (int) r6)
            r3 = r5
            goto L_0x0070
        L_0x0053:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x005c:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x006c
            java.lang.Object r5 = r1.next()
            o.rsnScriptGroupSetOutput r5 = (p040o.rsnScriptGroupSetOutput) r5
            r0.MediaBrowserCompat$ItemReceiver((p040o.rsnScriptGroupSetOutput) r5, (int) r3, (java.util.Collection<p040o.rsnScriptGroupSetOutput>) r4)
            goto L_0x005c
        L_0x006c:
            java.util.Collection r1 = p040o.rsnScriptGroupCreate.MediaBrowserCompat$ItemReceiver(r4)
        L_0x0070:
            int r3 = r3 + r11
            goto L_0x000f
        L_0x0072:
            o.rsnScriptGroupCreate$1 r3 = new o.rsnScriptGroupCreate$1
            r3.<init>()
            java.lang.Object r1 = java.util.Collections.min(r1, r3)
            o.rsnScriptGroupSetOutput r1 = (p040o.rsnScriptGroupSetOutput) r1
            byte[] r0 = r0.write
            o.rsnScriptIntrinsicCreate r0 = r1.MediaBrowserCompat$ItemReceiver(r0)
            int r1 = r0.read
            int r1 = r1 * r22
            int r1 = r1 / 100
            r3 = 11
            int r1 = r1 + r3
            int r4 = r0.read
            r12 = 112(0x70, float:1.57E-43)
            if (r23 == 0) goto L_0x00ea
            if (r23 >= 0) goto L_0x0096
            r4 = r11
            goto L_0x0097
        L_0x0096:
            r4 = r2
        L_0x0097:
            int r7 = java.lang.Math.abs(r23)
            if (r4 == 0) goto L_0x009f
            r13 = r8
            goto L_0x00a0
        L_0x009f:
            r13 = r10
        L_0x00a0:
            if (r7 > r13) goto L_0x00d6
            if (r4 == 0) goto L_0x00a7
            r5 = 88
            goto L_0x00a8
        L_0x00a7:
            r5 = r12
        L_0x00a8:
            int r12 = r7 << 4
            int r5 = r5 + r12
            int r5 = r5 * r7
            int[] r12 = MediaBrowserCompat$ItemReceiver
            r12 = r12[r7]
            o.rsnScriptIntrinsicCreate r0 = IconCompatParcelizer(r0, r12)
            int r13 = r0.read
            int r13 = r13 + r1
            int r1 = r5 % r12
            int r1 = r5 - r1
            java.lang.String r14 = "Data to large for user specified layer"
            if (r13 > r1) goto L_0x00d0
            if (r4 == 0) goto L_0x0136
            int r1 = r0.read
            int r4 = r12 << 6
            if (r1 > r4) goto L_0x00ca
            r4 = r11
            goto L_0x0136
        L_0x00ca:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r14)
            throw r0
        L_0x00d0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r14)
            throw r0
        L_0x00d6:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            r0[r2] = r1
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Illegal value %s for layers"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            r1.<init>(r0)
            throw r1
        L_0x00ea:
            r13 = 0
            r14 = r2
            r15 = r14
        L_0x00ed:
            if (r14 > r10) goto L_0x033f
            if (r14 > r7) goto L_0x00f4
            r16 = r11
            goto L_0x00f6
        L_0x00f4:
            r16 = r2
        L_0x00f6:
            if (r16 == 0) goto L_0x00fb
            int r17 = r14 + 1
            goto L_0x00fd
        L_0x00fb:
            r17 = r14
        L_0x00fd:
            if (r16 == 0) goto L_0x0102
            r18 = 88
            goto L_0x0104
        L_0x0102:
            r18 = r12
        L_0x0104:
            int r19 = r17 << 4
            int r18 = r18 + r19
            int r2 = r18 * r17
            int r5 = r4 + r1
            if (r5 > r2) goto L_0x032f
            int[] r5 = MediaBrowserCompat$ItemReceiver
            r7 = r5[r17]
            if (r15 == r7) goto L_0x011c
            r5 = r5[r17]
            o.rsnScriptIntrinsicCreate r7 = IconCompatParcelizer(r0, r5)
            r15 = r5
            r13 = r7
        L_0x011c:
            if (r16 == 0) goto L_0x0124
            int r5 = r13.read
            int r7 = r15 << 6
            if (r5 > r7) goto L_0x032f
        L_0x0124:
            int r5 = r13.read
            int r5 = r5 + r1
            int r7 = r2 % r15
            int r7 = r2 - r7
            if (r5 <= r7) goto L_0x012f
            goto L_0x032f
        L_0x012f:
            r5 = r2
            r0 = r13
            r12 = r15
            r4 = r16
            r7 = r17
        L_0x0136:
            o.rsnScriptIntrinsicCreate r1 = read(r0, r5, r12)
            int r0 = r0.read
            int r0 = r0 / r12
            o.rsnScriptIntrinsicCreate r2 = new o.rsnScriptIntrinsicCreate
            r2.<init>()
            if (r4 == 0) goto L_0x0155
            int r5 = r7 + -1
            r2.write(r5, r9)
            int r0 = r0 - r11
            r5 = 6
            r2.write(r0, r5)
            r0 = 28
            o.rsnScriptIntrinsicCreate r0 = read(r2, r0, r8)
            goto L_0x0164
        L_0x0155:
            int r5 = r7 + -1
            r2.write(r5, r6)
            int r0 = r0 - r11
            r2.write(r0, r3)
            r0 = 40
            o.rsnScriptIntrinsicCreate r0 = read(r2, r0, r8)
        L_0x0164:
            if (r4 == 0) goto L_0x0167
            goto L_0x0169
        L_0x0167:
            r3 = 14
        L_0x0169:
            int r2 = r7 << 2
            int r3 = r3 + r2
            int[] r2 = new int[r3]
            if (r4 == 0) goto L_0x017a
            r5 = 0
        L_0x0171:
            if (r5 >= r3) goto L_0x0178
            r2[r5] = r5
            int r5 = r5 + 1
            goto L_0x0171
        L_0x0178:
            r8 = r3
            goto L_0x019e
        L_0x017a:
            int r5 = r3 / 2
            int r8 = r3 + 1
            int r12 = r5 + -1
            int r12 = r12 / 15
            int r12 = r12 << r11
            int r8 = r8 + r12
            int r12 = r8 / 2
            r13 = 0
        L_0x0187:
            if (r13 >= r5) goto L_0x019e
            int r14 = r13 / 15
            int r14 = r14 + r13
            int r15 = r5 - r13
            int r15 = r15 - r11
            int r16 = r12 - r14
            int r16 = r16 + -1
            r2[r15] = r16
            int r15 = r5 + r13
            int r14 = r14 + r12
            int r14 = r14 + r11
            r2[r15] = r14
            int r13 = r13 + 1
            goto L_0x0187
        L_0x019e:
            o.rsnScriptSetVarI r5 = new o.rsnScriptSetVarI
            r5.<init>(r8)
            r12 = 0
            r13 = 0
        L_0x01a5:
            if (r12 >= r7) goto L_0x02b8
            if (r4 == 0) goto L_0x01ac
            r14 = 9
            goto L_0x01ae
        L_0x01ac:
            r14 = 12
        L_0x01ae:
            int r15 = r7 - r12
            int r15 = r15 << r9
            int r15 = r15 + r14
            r14 = 0
        L_0x01b3:
            if (r14 >= r15) goto L_0x02ac
            int r16 = r14 << 1
            r6 = 0
        L_0x01b8:
            if (r6 >= r9) goto L_0x02a3
            int r18 = r13 + r16
            int r18 = r18 + r6
            r19 = r18 & 31
            int r19 = r11 << r19
            int[] r9 = r1.write
            int r18 = r18 / 32
            r9 = r9[r18]
            r9 = r19 & r9
            if (r9 == 0) goto L_0x01ce
            r9 = r11
            goto L_0x01cf
        L_0x01ce:
            r9 = 0
        L_0x01cf:
            if (r9 == 0) goto L_0x01ec
            int r9 = r12 << 1
            int r18 = r9 + r6
            r18 = r2[r18]
            int r9 = r9 + r14
            r9 = r2[r9]
            int r10 = r5.read
            int r9 = r9 * r10
            int r10 = r18 / 32
            int r9 = r9 + r10
            int[] r10 = r5.MediaBrowserCompat$CustomActionResultReceiver
            r18 = r18 & 31
            int r18 = r11 << r18
            r20 = r10[r9]
            r18 = r18 | r20
            r10[r9] = r18
        L_0x01ec:
            int r9 = r15 << 1
            int r9 = r9 + r13
            int r9 = r9 + r16
            int r9 = r9 + r6
            r10 = r9 & 31
            int r10 = r11 << r10
            int[] r11 = r1.write
            r18 = 32
            int r9 = r9 / 32
            r9 = r11[r9]
            r9 = r9 & r10
            if (r9 == 0) goto L_0x0203
            r9 = 1
            goto L_0x0204
        L_0x0203:
            r9 = 0
        L_0x0204:
            if (r9 == 0) goto L_0x0226
            int r9 = r12 << 1
            int r10 = r9 + r14
            r10 = r2[r10]
            int r11 = r3 + -1
            int r11 = r11 - r9
            int r11 = r11 - r6
            r9 = r2[r11]
            int r11 = r5.read
            int r9 = r9 * r11
            int r11 = r10 / 32
            int r9 = r9 + r11
            int[] r11 = r5.MediaBrowserCompat$CustomActionResultReceiver
            r10 = r10 & 31
            r18 = 1
            int r10 = r18 << r10
            r18 = r11[r9]
            r10 = r10 | r18
            r11[r9] = r10
        L_0x0226:
            int r9 = r15 << 2
            int r9 = r9 + r13
            int r9 = r9 + r16
            int r9 = r9 + r6
            r10 = r9 & 31
            r11 = 1
            int r10 = r11 << r10
            int[] r11 = r1.write
            r18 = 32
            int r9 = r9 / 32
            r9 = r11[r9]
            r9 = r9 & r10
            if (r9 == 0) goto L_0x023e
            r9 = 1
            goto L_0x023f
        L_0x023e:
            r9 = 0
        L_0x023f:
            if (r9 == 0) goto L_0x0261
            int r9 = r3 + -1
            int r10 = r12 << 1
            int r9 = r9 - r10
            int r10 = r9 - r6
            r10 = r2[r10]
            int r9 = r9 - r14
            r9 = r2[r9]
            int r11 = r5.read
            int r9 = r9 * r11
            int r11 = r10 / 32
            int r9 = r9 + r11
            int[] r11 = r5.MediaBrowserCompat$CustomActionResultReceiver
            r10 = r10 & 31
            r18 = 1
            int r10 = r18 << r10
            r18 = r11[r9]
            r10 = r10 | r18
            r11[r9] = r10
        L_0x0261:
            int r9 = r15 * 6
            int r9 = r9 + r13
            int r9 = r9 + r16
            int r9 = r9 + r6
            r10 = r9 & 31
            r11 = 1
            int r10 = r11 << r10
            int[] r11 = r1.write
            r19 = 32
            int r9 = r9 / 32
            r9 = r11[r9]
            r9 = r9 & r10
            if (r9 == 0) goto L_0x0279
            r9 = 1
            goto L_0x027a
        L_0x0279:
            r9 = 0
        L_0x027a:
            if (r9 == 0) goto L_0x029b
            int r9 = r12 << 1
            int r10 = r3 + -1
            int r10 = r10 - r9
            int r10 = r10 - r14
            r10 = r2[r10]
            int r9 = r9 + r6
            r9 = r2[r9]
            int r11 = r5.read
            int r9 = r9 * r11
            int r11 = r10 / 32
            int r9 = r9 + r11
            int[] r11 = r5.MediaBrowserCompat$CustomActionResultReceiver
            r10 = r10 & 31
            r18 = 1
            int r10 = r18 << r10
            r18 = r11[r9]
            r10 = r10 | r18
            r11[r9] = r10
        L_0x029b:
            int r6 = r6 + 1
            r10 = r19
            r9 = 2
            r11 = 1
            goto L_0x01b8
        L_0x02a3:
            r19 = r10
            int r14 = r14 + 1
            r6 = 5
            r9 = 2
            r11 = 1
            goto L_0x01b3
        L_0x02ac:
            r19 = r10
            int r6 = r15 << 3
            int r13 = r13 + r6
            int r12 = r12 + 1
            r6 = 5
            r9 = 2
            r11 = 1
            goto L_0x01a5
        L_0x02b8:
            MediaBrowserCompat$ItemReceiver(r5, r4, r8, r0)
            if (r4 == 0) goto L_0x02c4
            r2 = 2
            int r8 = r8 / r2
            r6 = 5
            MediaBrowserCompat$ItemReceiver(r5, r8, r6)
            goto L_0x0327
        L_0x02c4:
            r2 = 2
            int r0 = r8 / 2
            r1 = 7
            MediaBrowserCompat$ItemReceiver(r5, r0, r1)
            r1 = 0
            r4 = 0
        L_0x02cd:
            int r6 = r3 / 2
            r7 = 1
            int r6 = r6 - r7
            if (r1 >= r6) goto L_0x0327
            r6 = r0 & 1
        L_0x02d5:
            if (r6 >= r8) goto L_0x0320
            int r7 = r0 - r4
            int r9 = r5.read
            int r9 = r9 * r6
            int r10 = r7 / 32
            int r9 = r9 + r10
            int[] r10 = r5.MediaBrowserCompat$CustomActionResultReceiver
            r11 = r7 & 31
            r12 = 1
            int r11 = r12 << r11
            r12 = r10[r9]
            r11 = r11 | r12
            r10[r9] = r11
            int r9 = r0 + r4
            int r10 = r5.read
            int r10 = r10 * r6
            int r11 = r9 / 32
            int r10 = r10 + r11
            int[] r11 = r5.MediaBrowserCompat$CustomActionResultReceiver
            r12 = r9 & 31
            r13 = 1
            int r12 = r13 << r12
            r13 = r11[r10]
            r12 = r12 | r13
            r11[r10] = r12
            int r10 = r5.read
            int r7 = r7 * r10
            int r10 = r6 / 32
            int r7 = r7 + r10
            int[] r11 = r5.MediaBrowserCompat$CustomActionResultReceiver
            r12 = r6 & 31
            r16 = 1
            int r12 = r16 << r12
            r13 = r11[r7]
            r13 = r13 | r12
            r11[r7] = r13
            int r7 = r5.read
            int r9 = r9 * r7
            int r9 = r9 + r10
            int[] r7 = r5.MediaBrowserCompat$CustomActionResultReceiver
            r10 = r7[r9]
            r10 = r10 | r12
            r7[r9] = r10
            int r6 = r6 + 2
            goto L_0x02d5
        L_0x0320:
            r16 = 1
            int r1 = r1 + 15
            int r4 = r4 + 16
            goto L_0x02cd
        L_0x0327:
            o.getICheckDeserializerRtti r0 = new o.getICheckDeserializerRtti
            r0.<init>()
            r0.write = r5
            return r0
        L_0x032f:
            r2 = r9
            r19 = r10
            r16 = r11
            int r14 = r14 + 1
            r9 = r2
            r11 = r16
            r10 = r19
            r2 = 0
            r7 = 3
            goto L_0x00ed
        L_0x033f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Data too large for an Aztec code"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.rsnScriptGroup2Execute.write(byte[], int, int):o.getICheckDeserializerRtti");
    }

    private static void MediaBrowserCompat$ItemReceiver(rsnScriptSetVarI rsnscriptsetvari, boolean z, int i, rsnScriptIntrinsicCreate rsnscriptintrinsiccreate) {
        int i2 = i / 2;
        if (z) {
            for (int i3 = 0; i3 < 7; i3++) {
                int i4 = (i2 - 3) + i3;
                if (((1 << (i3 & 31)) & rsnscriptintrinsiccreate.write[i3 / 32]) != 0) {
                    int i5 = ((i2 - 5) * rsnscriptsetvari.read) + (i4 / 32);
                    int[] iArr = rsnscriptsetvari.MediaBrowserCompat$CustomActionResultReceiver;
                    iArr[i5] = (1 << (i4 & 31)) | iArr[i5];
                }
                int i6 = i3 + 7;
                if ((rsnscriptintrinsiccreate.write[i6 / 32] & (1 << (i6 & 31))) != 0) {
                    int i7 = i2 + 5;
                    int i8 = (rsnscriptsetvari.read * i4) + (i7 / 32);
                    int[] iArr2 = rsnscriptsetvari.MediaBrowserCompat$CustomActionResultReceiver;
                    iArr2[i8] = (1 << (i7 & 31)) | iArr2[i8];
                }
                int i9 = 20 - i3;
                if ((rsnscriptintrinsiccreate.write[i9 / 32] & (1 << (i9 & 31))) != 0) {
                    int i10 = ((i2 + 5) * rsnscriptsetvari.read) + (i4 / 32);
                    int[] iArr3 = rsnscriptsetvari.MediaBrowserCompat$CustomActionResultReceiver;
                    iArr3[i10] = (1 << (i4 & 31)) | iArr3[i10];
                }
                int i11 = 27 - i3;
                if ((rsnscriptintrinsiccreate.write[i11 / 32] & (1 << (i11 & 31))) != 0) {
                    int i12 = i2 - 5;
                    int i13 = (i4 * rsnscriptsetvari.read) + (i12 / 32);
                    int[] iArr4 = rsnscriptsetvari.MediaBrowserCompat$CustomActionResultReceiver;
                    iArr4[i13] = (1 << (i12 & 31)) | iArr4[i13];
                }
            }
            return;
        }
        for (int i14 = 0; i14 < 10; i14++) {
            int i15 = (i2 - 5) + i14 + (i14 / 5);
            if (((1 << (i14 & 31)) & rsnscriptintrinsiccreate.write[i14 / 32]) != 0) {
                int i16 = ((i2 - 7) * rsnscriptsetvari.read) + (i15 / 32);
                int[] iArr5 = rsnscriptsetvari.MediaBrowserCompat$CustomActionResultReceiver;
                iArr5[i16] = (1 << (i15 & 31)) | iArr5[i16];
            }
            int i17 = i14 + 10;
            if ((rsnscriptintrinsiccreate.write[i17 / 32] & (1 << (i17 & 31))) != 0) {
                int i18 = i2 + 7;
                int i19 = (rsnscriptsetvari.read * i15) + (i18 / 32);
                int[] iArr6 = rsnscriptsetvari.MediaBrowserCompat$CustomActionResultReceiver;
                iArr6[i19] = (1 << (i18 & 31)) | iArr6[i19];
            }
            int i20 = 29 - i14;
            if ((rsnscriptintrinsiccreate.write[i20 / 32] & (1 << (i20 & 31))) != 0) {
                int i21 = ((i2 + 7) * rsnscriptsetvari.read) + (i15 / 32);
                int[] iArr7 = rsnscriptsetvari.MediaBrowserCompat$CustomActionResultReceiver;
                iArr7[i21] = (1 << (i15 & 31)) | iArr7[i21];
            }
            int i22 = 39 - i14;
            if ((rsnscriptintrinsiccreate.write[i22 / 32] & (1 << (i22 & 31))) != 0) {
                int i23 = i2 - 7;
                int i24 = (i15 * rsnscriptsetvari.read) + (i23 / 32);
                int[] iArr8 = rsnscriptsetvari.MediaBrowserCompat$CustomActionResultReceiver;
                iArr8[i24] = (1 << (i23 & 31)) | iArr8[i24];
            }
        }
    }

    private static int[] IconCompatParcelizer(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, int i, int i2) {
        int[] iArr = new int[i2];
        int i3 = rsnscriptintrinsiccreate.read / i;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = (i4 * i) + i6;
                i5 |= (rsnscriptintrinsiccreate.write[i7 / 32] & (1 << (i7 & 31))) != 0 ? 1 << ((i - i6) - 1) : 0;
            }
            iArr[i4] = i5;
        }
        return iArr;
    }

    private static rsnScriptIntrinsicCreate IconCompatParcelizer(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, int i) {
        rsnScriptIntrinsicCreate rsnscriptintrinsiccreate2 = new rsnScriptIntrinsicCreate();
        int i2 = rsnscriptintrinsiccreate.read;
        int i3 = (1 << i) - 2;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = i4 + i6;
                if (i7 < i2) {
                    if (!((rsnscriptintrinsiccreate.write[i7 / 32] & (1 << (i7 & 31))) != 0)) {
                    }
                }
                i5 |= 1 << ((i - 1) - i6);
            }
            int i8 = i5 & i3;
            if (i8 == i3) {
                rsnscriptintrinsiccreate2.write(i8, i);
            } else if (i8 == 0) {
                rsnscriptintrinsiccreate2.write(i5 | 1, i);
            } else {
                rsnscriptintrinsiccreate2.write(i5, i);
                i4 += i;
            }
            i4--;
            i4 += i;
        }
        return rsnscriptintrinsiccreate2;
    }

    private static void MediaBrowserCompat$ItemReceiver(rsnScriptSetVarI rsnscriptsetvari, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 > i6) {
                    break;
                }
                int i7 = i5 / 32;
                int i8 = (rsnscriptsetvari.read * i4) + i7;
                int[] iArr = rsnscriptsetvari.MediaBrowserCompat$CustomActionResultReceiver;
                int i9 = 1 << (i5 & 31);
                iArr[i8] = iArr[i8] | i9;
                int i10 = (rsnscriptsetvari.read * i6) + i7;
                int[] iArr2 = rsnscriptsetvari.MediaBrowserCompat$CustomActionResultReceiver;
                iArr2[i10] = iArr2[i10] | i9;
                int i11 = (rsnscriptsetvari.read * i5) + (i4 / 32);
                int[] iArr3 = rsnscriptsetvari.MediaBrowserCompat$CustomActionResultReceiver;
                iArr3[i11] = (1 << (i4 & 31)) | iArr3[i11];
                int i12 = (rsnscriptsetvari.read * i5) + (i6 / 32);
                int[] iArr4 = rsnscriptsetvari.MediaBrowserCompat$CustomActionResultReceiver;
                iArr4[i12] = (1 << (i6 & 31)) | iArr4[i12];
                i5++;
            }
        }
        int i13 = i - i2;
        int i14 = i13 / 32;
        int i15 = (rsnscriptsetvari.read * i13) + i14;
        int[] iArr5 = rsnscriptsetvari.MediaBrowserCompat$CustomActionResultReceiver;
        int i16 = 1 << (i13 & 31);
        iArr5[i15] = iArr5[i15] | i16;
        int i17 = i13 + 1;
        int i18 = (rsnscriptsetvari.read * i13) + (i17 / 32);
        int[] iArr6 = rsnscriptsetvari.MediaBrowserCompat$CustomActionResultReceiver;
        iArr6[i18] = (1 << (i17 & 31)) | iArr6[i18];
        int i19 = (rsnscriptsetvari.read * i17) + i14;
        int[] iArr7 = rsnscriptsetvari.MediaBrowserCompat$CustomActionResultReceiver;
        iArr7[i19] = i16 | iArr7[i19];
        int i20 = i + i2;
        int i21 = i20 / 32;
        int i22 = (i13 * rsnscriptsetvari.read) + i21;
        int[] iArr8 = rsnscriptsetvari.MediaBrowserCompat$CustomActionResultReceiver;
        int i23 = 1 << (i20 & 31);
        iArr8[i22] = iArr8[i22] | i23;
        int i24 = (i17 * rsnscriptsetvari.read) + i21;
        int[] iArr9 = rsnscriptsetvari.MediaBrowserCompat$CustomActionResultReceiver;
        iArr9[i24] = iArr9[i24] | i23;
        int i25 = ((i20 - 1) * rsnscriptsetvari.read) + i21;
        int[] iArr10 = rsnscriptsetvari.MediaBrowserCompat$CustomActionResultReceiver;
        iArr10[i25] = iArr10[i25] | i23;
    }

    private static rsnScriptIntrinsicCreate read(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, int i, int i2) {
        rsnScriptSetVarObj rsnscriptsetvarobj;
        int i3 = rsnscriptintrinsiccreate.read / i2;
        if (i2 == 4) {
            rsnscriptsetvarobj = rsnScriptSetVarObj.read;
        } else if (i2 == 6) {
            rsnscriptsetvarobj = rsnScriptSetVarObj.MediaBrowserCompat$CustomActionResultReceiver;
        } else if (i2 == 8) {
            rsnscriptsetvarobj = rsnScriptSetVarObj.write;
        } else if (i2 == 10) {
            rsnscriptsetvarobj = rsnScriptSetVarObj.MediaBrowserCompat$ItemReceiver;
        } else if (i2 == 12) {
            rsnscriptsetvarobj = rsnScriptSetVarObj.IconCompatParcelizer;
        } else {
            StringBuilder sb = new StringBuilder("Unsupported word size ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        setAccount.write write = new setAccount.write(rsnscriptsetvarobj);
        int i4 = i / i2;
        int[] IconCompatParcelizer = IconCompatParcelizer(rsnscriptintrinsiccreate, i2, i4);
        write.read(IconCompatParcelizer, i4 - i3);
        rsnScriptIntrinsicCreate rsnscriptintrinsiccreate2 = new rsnScriptIntrinsicCreate();
        rsnscriptintrinsiccreate2.write(0, i % i2);
        for (int write2 : IconCompatParcelizer) {
            rsnscriptintrinsiccreate2.write(write2, i2);
        }
        return rsnscriptintrinsiccreate2;
    }
}
