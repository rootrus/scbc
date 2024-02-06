package p040o;

import p040o.Api;

/* renamed from: o.getXStart */
public final class getXStart {
    private static final FragmentBuilder_BindDeejungPlansFragment MediaBrowserCompat$CustomActionResultReceiver = new FragmentBuilder_BindDeejungPlansFragment();

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        if (r5.IconCompatParcelizer != r7.IconCompatParcelizer) goto L_0x0064;
     */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0435 A[LOOP:16: B:257:0x040f->B:272:0x0435, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x00bc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x0439 A[EDGE_INSN: B:370:0x0439->B:273:0x0439 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040o.getMaskAnimations.read read(p040o.rsnScriptSetVarI r23, p040o.rsnScriptForEach r24, p040o.rsnScriptForEach r25, p040o.rsnScriptForEach r26, p040o.rsnScriptForEach r27, int r28, int r29) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException, com.google.zxing.ChecksumException {
        /*
            o.createFailedResult$MediaBrowserCompat$ItemReceiver r6 = new o.createFailedResult$MediaBrowserCompat$ItemReceiver
            r0 = r6
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = 0
            r4 = r1
            r2 = 0
            r3 = 0
            r5 = 0
        L_0x0015:
            r13 = 2
            if (r4 >= r13) goto L_0x00c1
            if (r24 == 0) goto L_0x0028
            r10 = 1
            r7 = r23
            r8 = r6
            r9 = r24
            r11 = r28
            r12 = r29
            o.access$200 r2 = write((p040o.rsnScriptSetVarI) r7, (p040o.createFailedResult$MediaBrowserCompat$ItemReceiver) r8, (p040o.rsnScriptForEach) r9, (boolean) r10, (int) r11, (int) r12)
        L_0x0028:
            if (r26 == 0) goto L_0x0038
            r10 = 0
            r7 = r23
            r8 = r6
            r9 = r26
            r11 = r28
            r12 = r29
            o.access$200 r3 = write((p040o.rsnScriptSetVarI) r7, (p040o.createFailedResult$MediaBrowserCompat$ItemReceiver) r8, (p040o.rsnScriptForEach) r9, (boolean) r10, (int) r11, (int) r12)
        L_0x0038:
            if (r2 != 0) goto L_0x003f
            if (r3 != 0) goto L_0x003f
        L_0x003c:
            r5 = 0
            goto L_0x009b
        L_0x003f:
            if (r2 == 0) goto L_0x0062
            o.onLoadFinished$write r5 = r2.write()
            if (r5 == 0) goto L_0x0062
            if (r3 == 0) goto L_0x006a
            o.onLoadFinished$write r7 = r3.write()
            if (r7 == 0) goto L_0x006a
            int r8 = r5.MediaBrowserCompat$ItemReceiver
            int r9 = r7.MediaBrowserCompat$ItemReceiver
            if (r8 == r9) goto L_0x006a
            int r8 = r5.write
            int r9 = r7.write
            if (r8 == r9) goto L_0x006a
            int r8 = r5.IconCompatParcelizer
            int r7 = r7.IconCompatParcelizer
            if (r8 == r7) goto L_0x006a
            goto L_0x0064
        L_0x0062:
            if (r3 != 0) goto L_0x0066
        L_0x0064:
            r5 = 0
            goto L_0x006a
        L_0x0066:
            o.onLoadFinished$write r5 = r3.write()
        L_0x006a:
            if (r5 != 0) goto L_0x006d
            goto L_0x003c
        L_0x006d:
            o.createFailedResult$MediaBrowserCompat$ItemReceiver r7 = MediaBrowserCompat$ItemReceiver(r2)
            o.createFailedResult$MediaBrowserCompat$ItemReceiver r8 = MediaBrowserCompat$ItemReceiver(r3)
            if (r7 != 0) goto L_0x0079
            r7 = r8
            goto L_0x0095
        L_0x0079:
            if (r8 != 0) goto L_0x007c
            goto L_0x0095
        L_0x007c:
            o.createFailedResult$MediaBrowserCompat$ItemReceiver r9 = new o.createFailedResult$MediaBrowserCompat$ItemReceiver
            o.rsnScriptSetVarI r15 = r7.IconCompatParcelizer
            o.rsnScriptForEach r10 = r7.MediaMetadataCompat
            o.rsnScriptForEach r7 = r7.read
            o.rsnScriptForEach r11 = r8.MediaBrowserCompat$SearchResultReceiver
            o.rsnScriptForEach r8 = r8.MediaBrowserCompat$CustomActionResultReceiver
            r14 = r9
            r16 = r10
            r17 = r7
            r18 = r11
            r19 = r8
            r14.<init>(r15, r16, r17, r18, r19)
            r7 = r9
        L_0x0095:
            o.registerConnectionCallbacks$read r8 = new o.registerConnectionCallbacks$read
            r8.<init>(r5, r7)
            r5 = r8
        L_0x009b:
            if (r5 == 0) goto L_0x00bc
            if (r4 != 0) goto L_0x00b9
            o.createFailedResult$MediaBrowserCompat$ItemReceiver r7 = r5.read
            if (r7 == 0) goto L_0x00b9
            o.createFailedResult$MediaBrowserCompat$ItemReceiver r7 = r5.read
            int r7 = r7.MediaDescriptionCompat
            int r8 = r6.MediaDescriptionCompat
            if (r7 < r8) goto L_0x00b3
            o.createFailedResult$MediaBrowserCompat$ItemReceiver r7 = r5.read
            int r7 = r7.MediaBrowserCompat$ItemReceiver
            int r8 = r6.MediaBrowserCompat$ItemReceiver
            if (r7 <= r8) goto L_0x00b9
        L_0x00b3:
            o.createFailedResult$MediaBrowserCompat$ItemReceiver r6 = r5.read
            int r4 = r4 + 1
            goto L_0x0015
        L_0x00b9:
            r5.read = r6
            goto L_0x00c1
        L_0x00bc:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r0
        L_0x00c1:
            int r4 = r5.write
            r7 = 1
            int r4 = r4 + r7
            o.stopAutoManage$IconCompatParcelizer[] r8 = r5.IconCompatParcelizer
            r8[r1] = r2
            o.stopAutoManage$IconCompatParcelizer[] r8 = r5.IconCompatParcelizer
            r8[r4] = r3
            if (r2 == 0) goto L_0x00d1
            r2 = r7
            goto L_0x00d2
        L_0x00d1:
            r2 = r1
        L_0x00d2:
            r3 = r28
            r8 = r29
            r9 = r7
        L_0x00d7:
            if (r9 > r4) goto L_0x0208
            if (r2 == 0) goto L_0x00dd
            r11 = r9
            goto L_0x00df
        L_0x00dd:
            int r11 = r4 - r9
        L_0x00df:
            o.stopAutoManage$IconCompatParcelizer[] r12 = r5.IconCompatParcelizer
            r12 = r12[r11]
            if (r12 != 0) goto L_0x01fd
            if (r11 == 0) goto L_0x00ef
            if (r11 == r4) goto L_0x00ef
            o.stopAutoManage$IconCompatParcelizer r12 = new o.stopAutoManage$IconCompatParcelizer
            r12.<init>(r6)
            goto L_0x00fa
        L_0x00ef:
            if (r11 != 0) goto L_0x00f3
            r12 = r7
            goto L_0x00f4
        L_0x00f3:
            r12 = r1
        L_0x00f4:
            o.access$200 r14 = new o.access$200
            r14.<init>(r6, r12)
            r12 = r14
        L_0x00fa:
            o.stopAutoManage$IconCompatParcelizer[] r14 = r5.IconCompatParcelizer
            r14[r11] = r12
            int r14 = r6.MediaDescriptionCompat
            r15 = r14
            r14 = -1
        L_0x0102:
            int r0 = r6.MediaBrowserCompat$ItemReceiver
            if (r15 > r0) goto L_0x01fd
            if (r2 == 0) goto L_0x010a
            r0 = r7
            goto L_0x010b
        L_0x010a:
            r0 = -1
        L_0x010b:
            int r1 = r11 - r0
            if (r1 < 0) goto L_0x0116
            int r13 = r5.write
            int r13 = r13 + r7
            if (r1 > r13) goto L_0x0116
            r13 = r7
            goto L_0x0117
        L_0x0116:
            r13 = 0
        L_0x0117:
            if (r13 == 0) goto L_0x0128
            o.stopAutoManage$IconCompatParcelizer[] r13 = r5.IconCompatParcelizer
            r13 = r13[r1]
            o.Api$ApiOptions$Optional$IconCompatParcelizer[] r10 = r13.write
            o.createFailedResult$MediaBrowserCompat$ItemReceiver r13 = r13.read
            int r13 = r13.MediaDescriptionCompat
            int r13 = r15 - r13
            r10 = r10[r13]
            goto L_0x0129
        L_0x0128:
            r10 = 0
        L_0x0129:
            if (r10 == 0) goto L_0x0136
            if (r2 == 0) goto L_0x0130
            int r0 = r10.IconCompatParcelizer
            goto L_0x0132
        L_0x0130:
            int r0 = r10.MediaBrowserCompat$CustomActionResultReceiver
        L_0x0132:
            r22 = r4
            goto L_0x01ad
        L_0x0136:
            o.stopAutoManage$IconCompatParcelizer[] r10 = r5.IconCompatParcelizer
            r10 = r10[r11]
            o.Api$ApiOptions$Optional$IconCompatParcelizer r10 = r10.IconCompatParcelizer(r15)
            if (r10 == 0) goto L_0x0148
            if (r2 == 0) goto L_0x0145
            int r0 = r10.MediaBrowserCompat$CustomActionResultReceiver
            goto L_0x0132
        L_0x0145:
            int r0 = r10.IconCompatParcelizer
            goto L_0x0132
        L_0x0148:
            if (r1 < 0) goto L_0x0151
            int r13 = r5.write
            int r13 = r13 + r7
            if (r1 > r13) goto L_0x0151
            r13 = r7
            goto L_0x0152
        L_0x0151:
            r13 = 0
        L_0x0152:
            if (r13 == 0) goto L_0x015c
            o.stopAutoManage$IconCompatParcelizer[] r10 = r5.IconCompatParcelizer
            r1 = r10[r1]
            o.Api$ApiOptions$Optional$IconCompatParcelizer r10 = r1.IconCompatParcelizer(r15)
        L_0x015c:
            if (r10 == 0) goto L_0x0166
            if (r2 == 0) goto L_0x0163
            int r0 = r10.IconCompatParcelizer
            goto L_0x0132
        L_0x0163:
            int r0 = r10.MediaBrowserCompat$CustomActionResultReceiver
            goto L_0x0132
        L_0x0166:
            r10 = r11
            r1 = 0
        L_0x0168:
            int r10 = r10 - r0
            if (r10 < 0) goto L_0x0172
            int r13 = r5.write
            int r13 = r13 + r7
            if (r10 > r13) goto L_0x0172
            r13 = r7
            goto L_0x0173
        L_0x0172:
            r13 = 0
        L_0x0173:
            if (r13 == 0) goto L_0x01a2
            o.stopAutoManage$IconCompatParcelizer[] r13 = r5.IconCompatParcelizer
            r13 = r13[r10]
            o.Api$ApiOptions$Optional$IconCompatParcelizer[] r13 = r13.write
            int r7 = r13.length
            r22 = r4
            r4 = 0
        L_0x017f:
            if (r4 >= r7) goto L_0x019c
            r16 = r7
            r7 = r13[r4]
            if (r7 == 0) goto L_0x0197
            if (r2 == 0) goto L_0x018c
            int r4 = r7.IconCompatParcelizer
            goto L_0x018e
        L_0x018c:
            int r4 = r7.MediaBrowserCompat$CustomActionResultReceiver
        L_0x018e:
            int r0 = r0 * r1
            int r1 = r7.IconCompatParcelizer
            int r7 = r7.MediaBrowserCompat$CustomActionResultReceiver
            int r1 = r1 - r7
            int r0 = r0 * r1
            int r0 = r0 + r4
            goto L_0x01ad
        L_0x0197:
            int r4 = r4 + 1
            r7 = r16
            goto L_0x017f
        L_0x019c:
            int r1 = r1 + 1
            r4 = r22
            r7 = 1
            goto L_0x0168
        L_0x01a2:
            r22 = r4
            o.createFailedResult$MediaBrowserCompat$ItemReceiver r0 = r5.read
            if (r2 == 0) goto L_0x01ab
            int r0 = r0.MediaBrowserCompat$MediaItem
            goto L_0x01ad
        L_0x01ab:
            int r0 = r0.write
        L_0x01ad:
            if (r0 < 0) goto L_0x01b3
            int r1 = r6.write
            if (r0 <= r1) goto L_0x01b7
        L_0x01b3:
            r0 = -1
            if (r14 == r0) goto L_0x01f1
            r0 = r14
        L_0x01b7:
            int r1 = r6.MediaBrowserCompat$MediaItem
            int r4 = r6.write
            r10 = r14
            r14 = r23
            r7 = r15
            r15 = r1
            r16 = r4
            r17 = r2
            r18 = r0
            r19 = r7
            r20 = r3
            r21 = r8
            o.Api$ApiOptions$Optional$IconCompatParcelizer r1 = MediaBrowserCompat$CustomActionResultReceiver(r14, r15, r16, r17, r18, r19, r20, r21)
            if (r1 == 0) goto L_0x01f3
            o.Api$ApiOptions$Optional$IconCompatParcelizer[] r4 = r12.write
            o.createFailedResult$MediaBrowserCompat$ItemReceiver r10 = r12.read
            int r10 = r10.MediaDescriptionCompat
            int r15 = r7 - r10
            r4[r15] = r1
            int r4 = r1.IconCompatParcelizer
            int r10 = r1.MediaBrowserCompat$CustomActionResultReceiver
            int r4 = r4 - r10
            int r3 = java.lang.Math.min(r3, r4)
            int r4 = r1.IconCompatParcelizer
            int r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            int r4 = r4 - r1
            int r1 = java.lang.Math.max(r8, r4)
            r14 = r0
            r8 = r1
            goto L_0x01f4
        L_0x01f1:
            r10 = r14
            r7 = r15
        L_0x01f3:
            r14 = r10
        L_0x01f4:
            int r15 = r7 + 1
            r4 = r22
            r1 = 0
            r7 = 1
            r13 = 2
            goto L_0x0102
        L_0x01fd:
            r22 = r4
            int r9 = r9 + 1
            r4 = r22
            r1 = 0
            r7 = 1
            r13 = 2
            goto L_0x00d7
        L_0x0208:
            o.onLoadFinished$write r0 = r5.MediaBrowserCompat$ItemReceiver
            int r0 = r0.IconCompatParcelizer
            int r1 = r5.write
            r2 = 2
            int[] r3 = new int[r2]
            int r1 = r1 + r2
            r2 = 1
            r3[r2] = r1
            r1 = 0
            r3[r1] = r0
            java.lang.Class<o.getXEnd> r0 = p040o.getXEnd.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r3)
            o.getXEnd[][] r0 = (p040o.getXEnd[][]) r0
            r1 = 0
        L_0x0221:
            int r2 = r0.length
            if (r1 >= r2) goto L_0x0239
            r2 = 0
        L_0x0225:
            r3 = r0[r1]
            int r3 = r3.length
            if (r2 >= r3) goto L_0x0236
            r3 = r0[r1]
            o.getXEnd r4 = new o.getXEnd
            r4.<init>()
            r3[r2] = r4
            int r2 = r2 + 1
            goto L_0x0225
        L_0x0236:
            int r1 = r1 + 1
            goto L_0x0221
        L_0x0239:
            o.stopAutoManage$IconCompatParcelizer[] r1 = r5.IconCompatParcelizer
            r2 = 0
            r1 = r1[r2]
            r5.MediaBrowserCompat$CustomActionResultReceiver(r1)
            o.stopAutoManage$IconCompatParcelizer[] r1 = r5.IconCompatParcelizer
            int r3 = r5.write
            r4 = 1
            int r3 = r3 + r4
            r1 = r1[r3]
            r5.MediaBrowserCompat$CustomActionResultReceiver(r1)
            r1 = 928(0x3a0, float:1.3E-42)
            r3 = r1
        L_0x024f:
            o.stopAutoManage$IconCompatParcelizer[] r6 = r5.IconCompatParcelizer
            r7 = r6[r2]
            r8 = 3
            if (r7 == 0) goto L_0x02b8
            int r7 = r5.write
            int r7 = r7 + r4
            r7 = r6[r7]
            if (r7 == 0) goto L_0x02b8
            r6 = r6[r2]
            o.Api$ApiOptions$Optional$IconCompatParcelizer[] r2 = r6.write
            o.stopAutoManage$IconCompatParcelizer[] r6 = r5.IconCompatParcelizer
            int r7 = r5.write
            int r7 = r7 + r4
            r4 = r6[r7]
            o.Api$ApiOptions$Optional$IconCompatParcelizer[] r4 = r4.write
            r6 = 0
        L_0x026b:
            int r7 = r2.length
            if (r6 >= r7) goto L_0x02b8
            r7 = r2[r6]
            if (r7 == 0) goto L_0x02b4
            r7 = r4[r6]
            if (r7 == 0) goto L_0x02b4
            r7 = r2[r6]
            int r7 = r7.read
            r9 = r4[r6]
            int r9 = r9.read
            if (r7 != r9) goto L_0x02b4
            r7 = 1
        L_0x0281:
            int r9 = r5.write
            if (r7 > r9) goto L_0x02b4
            o.stopAutoManage$IconCompatParcelizer[] r9 = r5.IconCompatParcelizer
            r9 = r9[r7]
            o.Api$ApiOptions$Optional$IconCompatParcelizer[] r9 = r9.write
            r9 = r9[r6]
            if (r9 == 0) goto L_0x02b0
            r10 = r2[r6]
            int r10 = r10.read
            r9.read = r10
            int r10 = r9.read
            r11 = -1
            if (r10 == r11) goto L_0x02a3
            int r9 = r9.write
            int r10 = r10 % 3
            int r10 = r10 * r8
            if (r9 != r10) goto L_0x02a3
            r9 = 1
            goto L_0x02a4
        L_0x02a3:
            r9 = 0
        L_0x02a4:
            if (r9 != 0) goto L_0x02b0
            o.stopAutoManage$IconCompatParcelizer[] r9 = r5.IconCompatParcelizer
            r9 = r9[r7]
            o.Api$ApiOptions$Optional$IconCompatParcelizer[] r9 = r9.write
            r10 = 0
            r9[r6] = r10
            goto L_0x02b1
        L_0x02b0:
            r10 = 0
        L_0x02b1:
            int r7 = r7 + 1
            goto L_0x0281
        L_0x02b4:
            r10 = 0
            int r6 = r6 + 1
            goto L_0x026b
        L_0x02b8:
            r10 = 0
            o.stopAutoManage$IconCompatParcelizer[] r2 = r5.IconCompatParcelizer
            r4 = 0
            r6 = r2[r4]
            if (r6 != 0) goto L_0x02c1
            goto L_0x0307
        L_0x02c1:
            r2 = r2[r4]
            o.Api$ApiOptions$Optional$IconCompatParcelizer[] r2 = r2.write
            r4 = 0
            r6 = 0
        L_0x02c7:
            int r7 = r2.length
            if (r4 >= r7) goto L_0x0306
            r7 = r2[r4]
            if (r7 == 0) goto L_0x0303
            r7 = r2[r4]
            int r7 = r7.read
            r11 = r6
            r6 = 1
            r9 = 0
        L_0x02d5:
            int r12 = r5.write
            r13 = 1
            int r12 = r12 + r13
            if (r6 >= r12) goto L_0x0302
            r12 = 2
            if (r9 >= r12) goto L_0x0302
            o.stopAutoManage$IconCompatParcelizer[] r12 = r5.IconCompatParcelizer
            r12 = r12[r6]
            o.Api$ApiOptions$Optional$IconCompatParcelizer[] r12 = r12.write
            r12 = r12[r4]
            if (r12 == 0) goto L_0x02ff
            int r9 = p040o.registerConnectionCallbacks.read.write(r7, r9, r12)
            int r13 = r12.read
            r14 = -1
            if (r13 == r14) goto L_0x02fa
            int r12 = r12.write
            int r13 = r13 % 3
            int r13 = r13 * r8
            if (r12 != r13) goto L_0x02fa
            r12 = 1
            goto L_0x02fb
        L_0x02fa:
            r12 = 0
        L_0x02fb:
            if (r12 != 0) goto L_0x02ff
            int r11 = r11 + 1
        L_0x02ff:
            int r6 = r6 + 1
            goto L_0x02d5
        L_0x0302:
            r6 = r11
        L_0x0303:
            int r4 = r4 + 1
            goto L_0x02c7
        L_0x0306:
            r4 = r6
        L_0x0307:
            o.stopAutoManage$IconCompatParcelizer[] r2 = r5.IconCompatParcelizer
            int r6 = r5.write
            r7 = 1
            int r6 = r6 + r7
            r7 = r2[r6]
            if (r7 != 0) goto L_0x0313
            r7 = 0
            goto L_0x0358
        L_0x0313:
            r2 = r2[r6]
            o.Api$ApiOptions$Optional$IconCompatParcelizer[] r2 = r2.write
            r6 = 0
            r7 = 0
        L_0x0319:
            int r9 = r2.length
            if (r6 >= r9) goto L_0x0358
            r9 = r2[r6]
            if (r9 == 0) goto L_0x0355
            r9 = r2[r6]
            int r9 = r9.read
            int r11 = r5.write
            r12 = 1
            int r11 = r11 + r12
            r12 = r11
            r11 = r7
            r7 = 0
        L_0x032b:
            if (r12 <= 0) goto L_0x0354
            r13 = 2
            if (r7 >= r13) goto L_0x0354
            o.stopAutoManage$IconCompatParcelizer[] r13 = r5.IconCompatParcelizer
            r13 = r13[r12]
            o.Api$ApiOptions$Optional$IconCompatParcelizer[] r13 = r13.write
            r13 = r13[r6]
            if (r13 == 0) goto L_0x0351
            int r7 = p040o.registerConnectionCallbacks.read.write(r9, r7, r13)
            int r14 = r13.read
            r15 = -1
            if (r14 == r15) goto L_0x034c
            int r13 = r13.write
            int r14 = r14 % 3
            int r14 = r14 * r8
            if (r13 != r14) goto L_0x034c
            r13 = 1
            goto L_0x034d
        L_0x034c:
            r13 = 0
        L_0x034d:
            if (r13 != 0) goto L_0x0351
            int r11 = r11 + 1
        L_0x0351:
            int r12 = r12 + -1
            goto L_0x032b
        L_0x0354:
            r7 = r11
        L_0x0355:
            int r6 = r6 + 1
            goto L_0x0319
        L_0x0358:
            int r2 = r4 + r7
            if (r2 != 0) goto L_0x035f
            r2 = 0
            goto L_0x0443
        L_0x035f:
            r4 = 1
        L_0x0360:
            int r6 = r5.write
            r7 = 1
            int r6 = r6 + r7
            if (r4 >= r6) goto L_0x0443
            o.stopAutoManage$IconCompatParcelizer[] r6 = r5.IconCompatParcelizer
            r6 = r6[r4]
            o.Api$ApiOptions$Optional$IconCompatParcelizer[] r6 = r6.write
            r7 = 0
        L_0x036d:
            int r9 = r6.length
            if (r7 >= r9) goto L_0x043e
            r9 = r6[r7]
            if (r9 == 0) goto L_0x0439
            r9 = r6[r7]
            int r11 = r9.read
            r12 = -1
            if (r11 == r12) goto L_0x0384
            int r9 = r9.write
            int r11 = r11 % 3
            int r11 = r11 * r8
            if (r9 != r11) goto L_0x0384
            r9 = 1
            goto L_0x0385
        L_0x0384:
            r9 = 0
        L_0x0385:
            if (r9 != 0) goto L_0x0439
            r9 = r6[r7]
            o.stopAutoManage$IconCompatParcelizer[] r11 = r5.IconCompatParcelizer
            int r12 = r4 + -1
            r11 = r11[r12]
            o.Api$ApiOptions$Optional$IconCompatParcelizer[] r11 = r11.write
            o.stopAutoManage$IconCompatParcelizer[] r12 = r5.IconCompatParcelizer
            int r13 = r4 + 1
            r14 = r12[r13]
            if (r14 == 0) goto L_0x039e
            r12 = r12[r13]
            o.Api$ApiOptions$Optional$IconCompatParcelizer[] r12 = r12.write
            goto L_0x039f
        L_0x039e:
            r12 = r11
        L_0x039f:
            r13 = 14
            o.Api$ApiOptions$Optional$IconCompatParcelizer[] r14 = new p040o.Api.ApiOptions.Optional.IconCompatParcelizer[r13]
            r15 = r11[r7]
            r16 = 2
            r14[r16] = r15
            r15 = r12[r7]
            r14[r8] = r15
            if (r7 <= 0) goto L_0x03c3
            int r15 = r7 + -1
            r16 = r6[r15]
            r17 = 0
            r14[r17] = r16
            r16 = 4
            r17 = r11[r15]
            r14[r16] = r17
            r16 = 5
            r15 = r12[r15]
            r14[r16] = r15
        L_0x03c3:
            r15 = 1
            if (r7 <= r15) goto L_0x03da
            int r15 = r7 + -2
            r16 = 8
            r17 = r6[r15]
            r14[r16] = r17
            r16 = 10
            r17 = r11[r15]
            r14[r16] = r17
            r16 = 11
            r15 = r12[r15]
            r14[r16] = r15
        L_0x03da:
            int r15 = r6.length
            r16 = 1
            int r15 = r15 + -1
            if (r7 >= r15) goto L_0x03f3
            int r15 = r7 + 1
            r17 = r6[r15]
            r14[r16] = r17
            r16 = 6
            r17 = r11[r15]
            r14[r16] = r17
            r16 = 7
            r15 = r12[r15]
            r14[r16] = r15
        L_0x03f3:
            int r15 = r6.length
            r16 = 2
            int r15 = r15 + -2
            if (r7 >= r15) goto L_0x040e
            int r15 = r7 + 2
            r16 = 9
            r17 = r6[r15]
            r14[r16] = r17
            r16 = 12
            r11 = r11[r15]
            r14[r16] = r11
            r11 = 13
            r12 = r12[r15]
            r14[r11] = r12
        L_0x040e:
            r11 = 0
        L_0x040f:
            if (r11 >= r13) goto L_0x0439
            r12 = r14[r11]
            if (r12 == 0) goto L_0x0432
            int r15 = r12.read
            r10 = -1
            if (r15 == r10) goto L_0x0423
            int r10 = r12.write
            int r15 = r15 % 3
            int r15 = r15 * r8
            if (r10 != r15) goto L_0x0423
            r10 = 1
            goto L_0x0424
        L_0x0423:
            r10 = 0
        L_0x0424:
            if (r10 == 0) goto L_0x0432
            int r10 = r12.write
            int r15 = r9.write
            if (r10 != r15) goto L_0x0432
            int r10 = r12.read
            r9.read = r10
            r10 = 1
            goto L_0x0433
        L_0x0432:
            r10 = 0
        L_0x0433:
            if (r10 != 0) goto L_0x0439
            int r11 = r11 + 1
            r10 = 0
            goto L_0x040f
        L_0x0439:
            int r7 = r7 + 1
            r10 = 0
            goto L_0x036d
        L_0x043e:
            int r4 = r4 + 1
            r10 = 0
            goto L_0x0360
        L_0x0443:
            if (r2 <= 0) goto L_0x044c
            if (r2 >= r3) goto L_0x044c
            r3 = r2
            r2 = 0
            r4 = 1
            goto L_0x024f
        L_0x044c:
            o.stopAutoManage$IconCompatParcelizer[] r2 = r5.IconCompatParcelizer
            int r3 = r2.length
            r4 = 0
            r6 = 0
        L_0x0451:
            if (r4 >= r3) goto L_0x0479
            r7 = r2[r4]
            if (r7 == 0) goto L_0x0474
            o.Api$ApiOptions$Optional$IconCompatParcelizer[] r7 = r7.write
            int r8 = r7.length
            r9 = 0
        L_0x045b:
            if (r9 >= r8) goto L_0x0474
            r10 = r7[r9]
            if (r10 == 0) goto L_0x0471
            int r11 = r10.read
            if (r11 < 0) goto L_0x0471
            int r12 = r0.length
            if (r11 >= r12) goto L_0x0471
            r11 = r0[r11]
            r11 = r11[r6]
            int r10 = r10.MediaBrowserCompat$ItemReceiver
            r11.MediaBrowserCompat$ItemReceiver(r10)
        L_0x0471:
            int r9 = r9 + 1
            goto L_0x045b
        L_0x0474:
            int r6 = r6 + 1
            int r4 = r4 + 1
            goto L_0x0451
        L_0x0479:
            r4 = 0
            r2 = r0[r4]
            r3 = 1
            r2 = r2[r3]
            int[] r3 = r2.MediaBrowserCompat$ItemReceiver()
            int r4 = r5.write
            o.onLoadFinished$write r6 = r5.MediaBrowserCompat$ItemReceiver
            int r6 = r6.IconCompatParcelizer
            int r4 = r4 * r6
            o.onLoadFinished$write r6 = r5.MediaBrowserCompat$ItemReceiver
            int r6 = r6.write
            r7 = 2
            int r6 = r7 << r6
            int r4 = r4 - r6
            int r6 = r3.length
            if (r6 != 0) goto L_0x04a2
            if (r4 <= 0) goto L_0x049d
            if (r4 > r1) goto L_0x049d
            r2.MediaBrowserCompat$ItemReceiver(r4)
            goto L_0x04aa
        L_0x049d:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r0
        L_0x04a2:
            r1 = 0
            r3 = r3[r1]
            if (r3 == r4) goto L_0x04aa
            r2.MediaBrowserCompat$ItemReceiver(r4)
        L_0x04aa:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            o.onLoadFinished$write r2 = r5.MediaBrowserCompat$ItemReceiver
            int r2 = r2.IconCompatParcelizer
            int r3 = r5.write
            int r2 = r2 * r3
            int[] r2 = new int[r2]
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6 = 0
        L_0x04c3:
            o.onLoadFinished$write r7 = r5.MediaBrowserCompat$ItemReceiver
            int r7 = r7.IconCompatParcelizer
            if (r6 >= r7) goto L_0x0505
            r7 = 0
        L_0x04ca:
            int r8 = r5.write
            if (r7 >= r8) goto L_0x0500
            r8 = r0[r6]
            int r9 = r7 + 1
            r8 = r8[r9]
            int[] r8 = r8.MediaBrowserCompat$ItemReceiver()
            int r10 = r5.write
            int r10 = r10 * r6
            int r10 = r10 + r7
            int r7 = r8.length
            if (r7 != 0) goto L_0x04e9
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r1.add(r7)
            r7 = 0
            r11 = 1
            goto L_0x04fe
        L_0x04e9:
            int r7 = r8.length
            r11 = 1
            if (r7 != r11) goto L_0x04f3
            r7 = 0
            r8 = r8[r7]
            r2[r10] = r8
            goto L_0x04fe
        L_0x04f3:
            r7 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r4.add(r10)
            r3.add(r8)
        L_0x04fe:
            r7 = r9
            goto L_0x04ca
        L_0x0500:
            r7 = 0
            r11 = 1
            int r6 = r6 + 1
            goto L_0x04c3
        L_0x0505:
            r7 = 0
            int r0 = r3.size()
            int[][] r6 = new int[r0][]
        L_0x050c:
            if (r7 >= r0) goto L_0x0519
            java.lang.Object r8 = r3.get(r7)
            int[] r8 = (int[]) r8
            r6[r7] = r8
            int r7 = r7 + 1
            goto L_0x050c
        L_0x0519:
            o.onLoadFinished$write r0 = r5.MediaBrowserCompat$ItemReceiver
            int r0 = r0.write
            int[] r1 = p040o.access$400.MediaBrowserCompat$ItemReceiver(r1)
            int[] r3 = p040o.access$400.MediaBrowserCompat$ItemReceiver(r4)
            o.getMaskAnimations$read r0 = IconCompatParcelizer(r0, r2, r1, r3, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getXStart.read(o.rsnScriptSetVarI, o.rsnScriptForEach, o.rsnScriptForEach, o.rsnScriptForEach, o.rsnScriptForEach, int, int):o.getMaskAnimations$read");
    }

    private static access$200 write(rsnScriptSetVarI rsnscriptsetvari, createFailedResult$MediaBrowserCompat$ItemReceiver createfailedresult_mediabrowsercompat_itemreceiver, rsnScriptForEach rsnscriptforeach, boolean z, int i, int i2) {
        int i3;
        createFailedResult$MediaBrowserCompat$ItemReceiver createfailedresult_mediabrowsercompat_itemreceiver2 = createfailedresult_mediabrowsercompat_itemreceiver;
        rsnScriptForEach rsnscriptforeach2 = rsnscriptforeach;
        boolean z2 = z;
        access$200 access_200 = new access$200(createfailedresult_mediabrowsercompat_itemreceiver2, z2);
        int i4 = 0;
        while (i4 < 2) {
            int i5 = i4 == 0 ? 1 : -1;
            int i6 = (int) rsnscriptforeach2.MediaBrowserCompat$CustomActionResultReceiver;
            int i7 = (int) rsnscriptforeach2.read;
            while (i7 <= createfailedresult_mediabrowsercompat_itemreceiver2.MediaBrowserCompat$ItemReceiver && i7 >= createfailedresult_mediabrowsercompat_itemreceiver2.MediaDescriptionCompat) {
                Api.ApiOptions.Optional.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(rsnscriptsetvari, 0, rsnscriptsetvari.IconCompatParcelizer, z, i6, i7, i, i2);
                if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                    access_200.write[i7 - access_200.read.MediaDescriptionCompat] = MediaBrowserCompat$CustomActionResultReceiver2;
                    if (z2) {
                        i3 = MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver;
                    } else {
                        i3 = MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer;
                    }
                    i6 = i3;
                }
                i7 += i5;
            }
            i4++;
        }
        return access_200;
    }

    /* JADX WARNING: Removed duplicated region for block: B:131:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02eb A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p040o.getMaskAnimations.read IconCompatParcelizer(int r19, int[] r20, int[] r21, int[] r22, int[][] r23) throws com.google.zxing.FormatException, com.google.zxing.ChecksumException {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            int r3 = r2.length
            int[] r4 = new int[r3]
            r5 = 100
        L_0x000b:
            if (r5 <= 0) goto L_0x02f0
            r7 = 0
        L_0x000e:
            if (r7 >= r3) goto L_0x001d
            r8 = r2[r7]
            r9 = r23[r7]
            r10 = r4[r7]
            r9 = r9[r10]
            r0[r8] = r9
            int r7 = r7 + 1
            goto L_0x000e
        L_0x001d:
            r7 = 1
            int r8 = r0.length     // Catch:{ ChecksumException -> 0x02be }
            if (r8 == 0) goto L_0x02b7
            int r8 = r19 + 1
            int r8 = r7 << r8
            if (r1 == 0) goto L_0x002e
            int r9 = r1.length     // Catch:{ ChecksumException -> 0x02be }
            int r10 = r8 / 2
            int r10 = r10 + 3
            if (r9 > r10) goto L_0x02b0
        L_0x002e:
            if (r8 < 0) goto L_0x02b0
            r9 = 512(0x200, float:7.175E-43)
            if (r8 > r9) goto L_0x02b0
            o.FragmentBuilder_BindDeejungPlansFragment r9 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ ChecksumException -> 0x02be }
            o.GoogleApiClient$Builder$IconCompatParcelizer r10 = new o.GoogleApiClient$Builder$IconCompatParcelizer     // Catch:{ ChecksumException -> 0x02be }
            o.getZEnd r11 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ ChecksumException -> 0x02be }
            r10.<init>(r11, r0)     // Catch:{ ChecksumException -> 0x02be }
            int[] r11 = new int[r8]     // Catch:{ ChecksumException -> 0x02be }
            r12 = r8
            r13 = 0
        L_0x0041:
            if (r12 <= 0) goto L_0x0057
            o.getZEnd r14 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ ChecksumException -> 0x02be }
            int[] r14 = r14.MediaBrowserCompat$ItemReceiver     // Catch:{ ChecksumException -> 0x02be }
            r14 = r14[r12]     // Catch:{ ChecksumException -> 0x02be }
            int r14 = r10.MediaBrowserCompat$CustomActionResultReceiver(r14)     // Catch:{ ChecksumException -> 0x02be }
            int r15 = r8 - r12
            r11[r15] = r14     // Catch:{ ChecksumException -> 0x02be }
            if (r14 == 0) goto L_0x0054
            r13 = r7
        L_0x0054:
            int r12 = r12 + -1
            goto L_0x0041
        L_0x0057:
            if (r13 != 0) goto L_0x005d
            r17 = r5
            goto L_0x0273
        L_0x005d:
            o.getZEnd r10 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ ChecksumException -> 0x02be }
            o.GoogleApiClient$Builder$IconCompatParcelizer r10 = r10.read     // Catch:{ ChecksumException -> 0x02be }
            r12 = 2
            if (r1 == 0) goto L_0x0091
            int r14 = r1.length     // Catch:{ ChecksumException -> 0x02be }
            r15 = 0
        L_0x0066:
            if (r15 >= r14) goto L_0x0091
            r16 = r1[r15]     // Catch:{ ChecksumException -> 0x02be }
            o.getZEnd r6 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ ChecksumException -> 0x02be }
            int r13 = r0.length     // Catch:{ ChecksumException -> 0x02be }
            int r13 = r13 - r7
            int r13 = r13 - r16
            int[] r6 = r6.MediaBrowserCompat$ItemReceiver     // Catch:{ ChecksumException -> 0x02be }
            r6 = r6[r13]     // Catch:{ ChecksumException -> 0x02be }
            o.getZEnd r13 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ ChecksumException -> 0x02be }
            int[] r7 = new int[r12]     // Catch:{ ChecksumException -> 0x02be }
            r12 = 929(0x3a1, float:1.302E-42)
            int r6 = 929 - r6
            int r6 = r6 % r12
            r12 = 0
            r7[r12] = r6     // Catch:{ ChecksumException -> 0x02be }
            r6 = 1
            r7[r6] = r6     // Catch:{ ChecksumException -> 0x02be }
            o.GoogleApiClient$Builder$IconCompatParcelizer r6 = new o.GoogleApiClient$Builder$IconCompatParcelizer     // Catch:{ ChecksumException -> 0x02be }
            r6.<init>(r13, r7)     // Catch:{ ChecksumException -> 0x02be }
            o.GoogleApiClient$Builder$IconCompatParcelizer r10 = r10.read(r6)     // Catch:{ ChecksumException -> 0x02be }
            int r15 = r15 + 1
            r7 = 1
            r12 = 2
            goto L_0x0066
        L_0x0091:
            o.GoogleApiClient$Builder$IconCompatParcelizer r6 = new o.GoogleApiClient$Builder$IconCompatParcelizer     // Catch:{ ChecksumException -> 0x02be }
            o.getZEnd r7 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ ChecksumException -> 0x02be }
            r6.<init>(r7, r11)     // Catch:{ ChecksumException -> 0x02be }
            o.getZEnd r7 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ ChecksumException -> 0x02be }
            r10 = 1
            o.GoogleApiClient$Builder$IconCompatParcelizer r7 = r7.write(r8, r10)     // Catch:{ ChecksumException -> 0x02be }
            int[] r11 = r7.read     // Catch:{ ChecksumException -> 0x02be }
            int r11 = r11.length     // Catch:{ ChecksumException -> 0x02be }
            int r11 = r11 - r10
            int[] r12 = r6.read     // Catch:{ ChecksumException -> 0x02be }
            int r12 = r12.length     // Catch:{ ChecksumException -> 0x02be }
            int r12 = r12 - r10
            if (r11 >= r12) goto L_0x00ae
            r18 = r7
            r7 = r6
            r6 = r18
        L_0x00ae:
            o.getZEnd r10 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ ChecksumException -> 0x02be }
            o.GoogleApiClient$Builder$IconCompatParcelizer r10 = r10.MediaBrowserCompat$MediaItem     // Catch:{ ChecksumException -> 0x02be }
            o.getZEnd r11 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ ChecksumException -> 0x02be }
            o.GoogleApiClient$Builder$IconCompatParcelizer r11 = r11.read     // Catch:{ ChecksumException -> 0x02be }
        L_0x00b6:
            int[] r12 = r6.read     // Catch:{ ChecksumException -> 0x02be }
            int r12 = r12.length     // Catch:{ ChecksumException -> 0x02be }
            r13 = 1
            int r12 = r12 - r13
            int r13 = r8 / 2
            if (r12 < r13) goto L_0x0168
            int[] r12 = r6.read     // Catch:{ ChecksumException -> 0x02be }
            r13 = 0
            r12 = r12[r13]     // Catch:{ ChecksumException -> 0x02be }
            if (r12 != 0) goto L_0x00c8
            r12 = 1
            goto L_0x00c9
        L_0x00c8:
            r12 = 0
        L_0x00c9:
            if (r12 != 0) goto L_0x0161
            o.getZEnd r12 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ ChecksumException -> 0x02be }
            o.GoogleApiClient$Builder$IconCompatParcelizer r12 = r12.MediaBrowserCompat$MediaItem     // Catch:{ ChecksumException -> 0x02be }
            int[] r13 = r6.read     // Catch:{ ChecksumException -> 0x02be }
            int r13 = r13.length     // Catch:{ ChecksumException -> 0x02be }
            r14 = 1
            int r13 = r13 - r14
            int[] r15 = r6.read     // Catch:{ ChecksumException -> 0x02be }
            int r1 = r15.length     // Catch:{ ChecksumException -> 0x02be }
            int r1 = r1 - r14
            int r1 = r1 - r13
            r1 = r15[r1]     // Catch:{ ChecksumException -> 0x02be }
            o.getZEnd r13 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ ChecksumException -> 0x02be }
            if (r1 == 0) goto L_0x0159
            int[] r14 = r13.MediaBrowserCompat$ItemReceiver     // Catch:{ ChecksumException -> 0x02be }
            int[] r13 = r13.write     // Catch:{ ChecksumException -> 0x02be }
            r1 = r13[r1]     // Catch:{ ChecksumException -> 0x02be }
            r13 = 929(0x3a1, float:1.302E-42)
            int r1 = 929 - r1
            r13 = 1
            int r1 = r1 - r13
            r1 = r14[r1]     // Catch:{ ChecksumException -> 0x02be }
        L_0x00ed:
            int[] r14 = r7.read     // Catch:{ ChecksumException -> 0x02be }
            int r14 = r14.length     // Catch:{ ChecksumException -> 0x02be }
            int r14 = r14 - r13
            int[] r15 = r6.read     // Catch:{ ChecksumException -> 0x02be }
            int r15 = r15.length     // Catch:{ ChecksumException -> 0x02be }
            int r15 = r15 - r13
            if (r14 < r15) goto L_0x013c
            int[] r13 = r7.read     // Catch:{ ChecksumException -> 0x02be }
            r14 = 0
            r13 = r13[r14]     // Catch:{ ChecksumException -> 0x02be }
            if (r13 != 0) goto L_0x0100
            r13 = 1
            goto L_0x0101
        L_0x0100:
            r13 = 0
        L_0x0101:
            if (r13 != 0) goto L_0x013c
            int[] r13 = r7.read     // Catch:{ ChecksumException -> 0x02be }
            int r13 = r13.length     // Catch:{ ChecksumException -> 0x02be }
            r14 = 1
            int r13 = r13 - r14
            int[] r15 = r6.read     // Catch:{ ChecksumException -> 0x02be }
            int r15 = r15.length     // Catch:{ ChecksumException -> 0x02be }
            int r15 = r15 - r14
            int r13 = r13 - r15
            o.getZEnd r15 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ ChecksumException -> 0x02be }
            int[] r14 = r7.read     // Catch:{ ChecksumException -> 0x02be }
            int r14 = r14.length     // Catch:{ ChecksumException -> 0x02be }
            r16 = 1
            int r14 = r14 + -1
            int[] r2 = r7.read     // Catch:{ ChecksumException -> 0x02be }
            r17 = r5
            int r5 = r2.length     // Catch:{ ChecksumException -> 0x02c0 }
            int r5 = r5 + -1
            int r5 = r5 - r14
            r2 = r2[r5]     // Catch:{ ChecksumException -> 0x02c0 }
            int r2 = r15.MediaBrowserCompat$ItemReceiver(r2, r1)     // Catch:{ ChecksumException -> 0x02c0 }
            o.getZEnd r5 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ ChecksumException -> 0x02c0 }
            o.GoogleApiClient$Builder$IconCompatParcelizer r5 = r5.write(r13, r2)     // Catch:{ ChecksumException -> 0x02c0 }
            o.GoogleApiClient$Builder$IconCompatParcelizer r12 = r12.IconCompatParcelizer(r5)     // Catch:{ ChecksumException -> 0x02c0 }
            o.GoogleApiClient$Builder$IconCompatParcelizer r2 = r6.IconCompatParcelizer(r13, r2)     // Catch:{ ChecksumException -> 0x02c0 }
            o.GoogleApiClient$Builder$IconCompatParcelizer r7 = r7.write(r2)     // Catch:{ ChecksumException -> 0x02c0 }
            r2 = r22
            r5 = r17
            r13 = 1
            goto L_0x00ed
        L_0x013c:
            r17 = r5
            o.GoogleApiClient$Builder$IconCompatParcelizer r1 = r12.read(r11)     // Catch:{ ChecksumException -> 0x02c0 }
            o.GoogleApiClient$Builder$IconCompatParcelizer r1 = r1.write(r10)     // Catch:{ ChecksumException -> 0x02c0 }
            o.GoogleApiClient$Builder$IconCompatParcelizer r1 = r1.write()     // Catch:{ ChecksumException -> 0x02c0 }
            r2 = r22
            r10 = r11
            r5 = r17
            r11 = r1
            r1 = r21
            r18 = r7
            r7 = r6
            r6 = r18
            goto L_0x00b6
        L_0x0159:
            r17 = r5
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException     // Catch:{ ChecksumException -> 0x02c0 }
            r1.<init>()     // Catch:{ ChecksumException -> 0x02c0 }
            throw r1     // Catch:{ ChecksumException -> 0x02c0 }
        L_0x0161:
            r17 = r5
            com.google.zxing.ChecksumException r1 = com.google.zxing.ChecksumException.write()     // Catch:{ ChecksumException -> 0x02c0 }
            throw r1     // Catch:{ ChecksumException -> 0x02c0 }
        L_0x0168:
            r17 = r5
            int[] r1 = r11.read     // Catch:{ ChecksumException -> 0x02c0 }
            int r2 = r1.length     // Catch:{ ChecksumException -> 0x02c0 }
            r5 = 1
            int r2 = r2 - r5
            r5 = 0
            int r2 = r2 - r5
            r1 = r1[r2]     // Catch:{ ChecksumException -> 0x02c0 }
            if (r1 == 0) goto L_0x02ab
            o.getZEnd r2 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ ChecksumException -> 0x02c0 }
            if (r1 == 0) goto L_0x02a5
            int[] r5 = r2.MediaBrowserCompat$ItemReceiver     // Catch:{ ChecksumException -> 0x02c0 }
            int[] r2 = r2.write     // Catch:{ ChecksumException -> 0x02c0 }
            r1 = r2[r1]     // Catch:{ ChecksumException -> 0x02c0 }
            r2 = 929(0x3a1, float:1.302E-42)
            int r13 = 929 - r1
            r1 = 1
            int r13 = r13 - r1
            r1 = r5[r13]     // Catch:{ ChecksumException -> 0x02c0 }
            o.GoogleApiClient$Builder$IconCompatParcelizer r2 = r11.MediaBrowserCompat$ItemReceiver(r1)     // Catch:{ ChecksumException -> 0x02c0 }
            o.GoogleApiClient$Builder$IconCompatParcelizer r1 = r6.MediaBrowserCompat$ItemReceiver(r1)     // Catch:{ ChecksumException -> 0x02c0 }
            r5 = 2
            o.GoogleApiClient$Builder$IconCompatParcelizer[] r5 = new p040o.GoogleApiClient.Builder.IconCompatParcelizer[r5]     // Catch:{ ChecksumException -> 0x02c0 }
            r6 = 0
            r5[r6] = r2     // Catch:{ ChecksumException -> 0x02c0 }
            r2 = 1
            r5[r2] = r1     // Catch:{ ChecksumException -> 0x02c0 }
            r1 = r5[r6]     // Catch:{ ChecksumException -> 0x02c0 }
            r5 = r5[r2]     // Catch:{ ChecksumException -> 0x02c0 }
            int[] r6 = r1.read     // Catch:{ ChecksumException -> 0x02c0 }
            int r6 = r6.length     // Catch:{ ChecksumException -> 0x02c0 }
            int r6 = r6 - r2
            int[] r2 = new int[r6]     // Catch:{ ChecksumException -> 0x02c0 }
            r7 = 1
            r10 = 0
        L_0x01a4:
            r11 = 929(0x3a1, float:1.302E-42)
            if (r7 >= r11) goto L_0x01d0
            if (r10 >= r6) goto L_0x01d0
            int r11 = r1.MediaBrowserCompat$CustomActionResultReceiver(r7)     // Catch:{ ChecksumException -> 0x02c0 }
            if (r11 != 0) goto L_0x01cd
            o.getZEnd r11 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ ChecksumException -> 0x02c0 }
            if (r7 == 0) goto L_0x01c7
            int[] r12 = r11.MediaBrowserCompat$ItemReceiver     // Catch:{ ChecksumException -> 0x02c0 }
            int[] r11 = r11.write     // Catch:{ ChecksumException -> 0x02c0 }
            r11 = r11[r7]     // Catch:{ ChecksumException -> 0x02c0 }
            r13 = 929(0x3a1, float:1.302E-42)
            int r11 = 929 - r11
            r13 = 1
            int r11 = r11 - r13
            r11 = r12[r11]     // Catch:{ ChecksumException -> 0x02c0 }
            r2[r10] = r11     // Catch:{ ChecksumException -> 0x02c0 }
            int r10 = r10 + 1
            goto L_0x01cd
        L_0x01c7:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException     // Catch:{ ChecksumException -> 0x02c0 }
            r1.<init>()     // Catch:{ ChecksumException -> 0x02c0 }
            throw r1     // Catch:{ ChecksumException -> 0x02c0 }
        L_0x01cd:
            int r7 = r7 + 1
            goto L_0x01a4
        L_0x01d0:
            if (r10 != r6) goto L_0x02a0
            int[] r7 = r1.read     // Catch:{ ChecksumException -> 0x02c0 }
            int r7 = r7.length     // Catch:{ ChecksumException -> 0x02c0 }
            r10 = 1
            int r7 = r7 - r10
            int[] r10 = new int[r7]     // Catch:{ ChecksumException -> 0x02c0 }
            r11 = 1
        L_0x01da:
            if (r11 > r7) goto L_0x01f3
            o.getZEnd r12 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ ChecksumException -> 0x02c0 }
            int r13 = r7 - r11
            int[] r14 = r1.read     // Catch:{ ChecksumException -> 0x02c0 }
            int r15 = r14.length     // Catch:{ ChecksumException -> 0x02c0 }
            r16 = 1
            int r15 = r15 + -1
            int r15 = r15 - r11
            r14 = r14[r15]     // Catch:{ ChecksumException -> 0x02c0 }
            int r12 = r12.MediaBrowserCompat$ItemReceiver(r11, r14)     // Catch:{ ChecksumException -> 0x02c0 }
            r10[r13] = r12     // Catch:{ ChecksumException -> 0x02c0 }
            int r11 = r11 + 1
            goto L_0x01da
        L_0x01f3:
            o.GoogleApiClient$Builder$IconCompatParcelizer r1 = new o.GoogleApiClient$Builder$IconCompatParcelizer     // Catch:{ ChecksumException -> 0x02c0 }
            o.getZEnd r7 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ ChecksumException -> 0x02c0 }
            r1.<init>(r7, r10)     // Catch:{ ChecksumException -> 0x02c0 }
            int[] r7 = new int[r6]     // Catch:{ ChecksumException -> 0x02c0 }
            r10 = 0
        L_0x01fd:
            if (r10 >= r6) goto L_0x0247
            o.getZEnd r11 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ ChecksumException -> 0x02c0 }
            r12 = r2[r10]     // Catch:{ ChecksumException -> 0x02c0 }
            if (r12 == 0) goto L_0x0241
            int[] r13 = r11.MediaBrowserCompat$ItemReceiver     // Catch:{ ChecksumException -> 0x02c0 }
            int[] r11 = r11.write     // Catch:{ ChecksumException -> 0x02c0 }
            r11 = r11[r12]     // Catch:{ ChecksumException -> 0x02c0 }
            r12 = 929(0x3a1, float:1.302E-42)
            int r11 = 929 - r11
            r14 = 1
            int r11 = r11 - r14
            r11 = r13[r11]     // Catch:{ ChecksumException -> 0x02c0 }
            int r13 = r5.MediaBrowserCompat$CustomActionResultReceiver(r11)     // Catch:{ ChecksumException -> 0x02c0 }
            int r13 = 929 - r13
            int r13 = r13 % r12
            o.getZEnd r12 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ ChecksumException -> 0x02c0 }
            int r11 = r1.MediaBrowserCompat$CustomActionResultReceiver(r11)     // Catch:{ ChecksumException -> 0x02c0 }
            if (r11 == 0) goto L_0x023b
            int[] r14 = r12.MediaBrowserCompat$ItemReceiver     // Catch:{ ChecksumException -> 0x02c0 }
            int[] r12 = r12.write     // Catch:{ ChecksumException -> 0x02c0 }
            r11 = r12[r11]     // Catch:{ ChecksumException -> 0x02c0 }
            r12 = 929(0x3a1, float:1.302E-42)
            int r11 = 929 - r11
            r12 = 1
            int r11 = r11 - r12
            r11 = r14[r11]     // Catch:{ ChecksumException -> 0x02c0 }
            o.getZEnd r12 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ ChecksumException -> 0x02c0 }
            int r11 = r12.MediaBrowserCompat$ItemReceiver(r13, r11)     // Catch:{ ChecksumException -> 0x02c0 }
            r7[r10] = r11     // Catch:{ ChecksumException -> 0x02c0 }
            int r10 = r10 + 1
            goto L_0x01fd
        L_0x023b:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException     // Catch:{ ChecksumException -> 0x02c0 }
            r1.<init>()     // Catch:{ ChecksumException -> 0x02c0 }
            throw r1     // Catch:{ ChecksumException -> 0x02c0 }
        L_0x0241:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException     // Catch:{ ChecksumException -> 0x02c0 }
            r1.<init>()     // Catch:{ ChecksumException -> 0x02c0 }
            throw r1     // Catch:{ ChecksumException -> 0x02c0 }
        L_0x0247:
            r1 = 0
        L_0x0248:
            if (r1 >= r6) goto L_0x0273
            int r5 = r0.length     // Catch:{ ChecksumException -> 0x02c0 }
            r10 = 1
            int r5 = r5 - r10
            o.getZEnd r10 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ ChecksumException -> 0x02c0 }
            r11 = r2[r1]     // Catch:{ ChecksumException -> 0x02c0 }
            if (r11 == 0) goto L_0x026d
            int[] r10 = r10.write     // Catch:{ ChecksumException -> 0x02c0 }
            r10 = r10[r11]     // Catch:{ ChecksumException -> 0x02c0 }
            int r5 = r5 - r10
            if (r5 < 0) goto L_0x0268
            r10 = r0[r5]     // Catch:{ ChecksumException -> 0x02c0 }
            r11 = r7[r1]     // Catch:{ ChecksumException -> 0x02c0 }
            r12 = 929(0x3a1, float:1.302E-42)
            int r10 = r10 + r12
            int r10 = r10 - r11
            int r10 = r10 % r12
            r0[r5] = r10     // Catch:{ ChecksumException -> 0x02c0 }
            int r1 = r1 + 1
            goto L_0x0248
        L_0x0268:
            com.google.zxing.ChecksumException r1 = com.google.zxing.ChecksumException.write()     // Catch:{ ChecksumException -> 0x02c0 }
            throw r1     // Catch:{ ChecksumException -> 0x02c0 }
        L_0x026d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ ChecksumException -> 0x02c0 }
            r1.<init>()     // Catch:{ ChecksumException -> 0x02c0 }
            throw r1     // Catch:{ ChecksumException -> 0x02c0 }
        L_0x0273:
            int r1 = r0.length     // Catch:{ ChecksumException -> 0x02c0 }
            r2 = 4
            if (r1 < r2) goto L_0x029b
            r1 = 0
            r2 = r0[r1]     // Catch:{ ChecksumException -> 0x02c0 }
            int r1 = r0.length     // Catch:{ ChecksumException -> 0x02c0 }
            if (r2 > r1) goto L_0x0296
            if (r2 != 0) goto L_0x028d
            int r1 = r0.length     // Catch:{ ChecksumException -> 0x02c0 }
            if (r8 >= r1) goto L_0x0288
            int r1 = r0.length     // Catch:{ ChecksumException -> 0x02c0 }
            int r1 = r1 - r8
            r2 = 0
            r0[r2] = r1     // Catch:{ ChecksumException -> 0x02c0 }
            goto L_0x028d
        L_0x0288:
            com.google.zxing.FormatException r1 = com.google.zxing.FormatException.read()     // Catch:{ ChecksumException -> 0x02c0 }
            throw r1     // Catch:{ ChecksumException -> 0x02c0 }
        L_0x028d:
            java.lang.String r1 = java.lang.String.valueOf(r19)     // Catch:{ ChecksumException -> 0x02c0 }
            o.getMaskAnimations$read r0 = p040o.access$500.read(r0, r1)     // Catch:{ ChecksumException -> 0x02c0 }
            return r0
        L_0x0296:
            com.google.zxing.FormatException r1 = com.google.zxing.FormatException.read()     // Catch:{ ChecksumException -> 0x02c0 }
            throw r1     // Catch:{ ChecksumException -> 0x02c0 }
        L_0x029b:
            com.google.zxing.FormatException r1 = com.google.zxing.FormatException.read()     // Catch:{ ChecksumException -> 0x02c0 }
            throw r1     // Catch:{ ChecksumException -> 0x02c0 }
        L_0x02a0:
            com.google.zxing.ChecksumException r1 = com.google.zxing.ChecksumException.write()     // Catch:{ ChecksumException -> 0x02c0 }
            throw r1     // Catch:{ ChecksumException -> 0x02c0 }
        L_0x02a5:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException     // Catch:{ ChecksumException -> 0x02c0 }
            r1.<init>()     // Catch:{ ChecksumException -> 0x02c0 }
            throw r1     // Catch:{ ChecksumException -> 0x02c0 }
        L_0x02ab:
            com.google.zxing.ChecksumException r1 = com.google.zxing.ChecksumException.write()     // Catch:{ ChecksumException -> 0x02c0 }
            throw r1     // Catch:{ ChecksumException -> 0x02c0 }
        L_0x02b0:
            r17 = r5
            com.google.zxing.ChecksumException r1 = com.google.zxing.ChecksumException.write()     // Catch:{ ChecksumException -> 0x02c0 }
            throw r1     // Catch:{ ChecksumException -> 0x02c0 }
        L_0x02b7:
            r17 = r5
            com.google.zxing.FormatException r1 = com.google.zxing.FormatException.read()     // Catch:{ ChecksumException -> 0x02c0 }
            throw r1     // Catch:{ ChecksumException -> 0x02c0 }
        L_0x02be:
            r17 = r5
        L_0x02c0:
            if (r3 == 0) goto L_0x02eb
            r12 = 0
        L_0x02c3:
            if (r12 >= r3) goto L_0x02e3
            r1 = r4[r12]
            r2 = r23[r12]
            int r2 = r2.length
            r5 = 1
            int r2 = r2 - r5
            if (r1 >= r2) goto L_0x02d4
            r1 = r4[r12]
            int r1 = r1 + r5
            r4[r12] = r1
            goto L_0x02e3
        L_0x02d4:
            r1 = 0
            r4[r12] = r1
            int r2 = r3 + -1
            if (r12 == r2) goto L_0x02de
            int r12 = r12 + 1
            goto L_0x02c3
        L_0x02de:
            com.google.zxing.ChecksumException r0 = com.google.zxing.ChecksumException.write()
            throw r0
        L_0x02e3:
            int r5 = r17 + -1
            r1 = r21
            r2 = r22
            goto L_0x000b
        L_0x02eb:
            com.google.zxing.ChecksumException r0 = com.google.zxing.ChecksumException.write()
            throw r0
        L_0x02f0:
            com.google.zxing.ChecksumException r0 = com.google.zxing.ChecksumException.write()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getXStart.IconCompatParcelizer(int, int[], int[], int[], int[][]):o.getMaskAnimations$read");
    }

    private static Api.ApiOptions.Optional.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver(rsnScriptSetVarI rsnscriptsetvari, int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        int i7;
        int write;
        int MediaBrowserCompat$CustomActionResultReceiver2;
        int MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(rsnscriptsetvari, i, i2, z, i3, i4);
        int[] write2 = write(rsnscriptsetvari, i, i2, z, MediaBrowserCompat$ItemReceiver, i4);
        if (write2 == null) {
            return null;
        }
        boolean z2 = false;
        int i8 = 0;
        for (int i9 : write2) {
            i8 += i9;
        }
        if (z) {
            i7 = MediaBrowserCompat$ItemReceiver + i8;
        } else {
            for (int i10 = 0; i10 < write2.length / 2; i10++) {
                int i11 = write2[i10];
                write2[i10] = write2[(write2.length - 1) - i10];
                write2[(write2.length - 1) - i10] = i11;
            }
            int i12 = MediaBrowserCompat$ItemReceiver;
            MediaBrowserCompat$ItemReceiver -= i8;
            i7 = i12;
        }
        if (i5 - 2 <= i8 && i8 <= i6 + 2) {
            z2 = true;
        }
        if (z2 && (MediaBrowserCompat$CustomActionResultReceiver2 = access$400.MediaBrowserCompat$CustomActionResultReceiver(write)) != -1) {
            return new Api.ApiOptions.Optional.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver, i7, read((write = getYEnd.write(write2))), MediaBrowserCompat$CustomActionResultReceiver2);
        }
        return null;
    }

    private static int[] write(rsnScriptSetVarI rsnscriptsetvari, int i, int i2, boolean z, int i3, int i4) {
        int[] iArr = new int[8];
        int i5 = z ? 1 : -1;
        int i6 = 0;
        boolean z2 = z;
        while (true) {
            if (!z) {
                if (i3 < i) {
                    break;
                }
            } else if (i3 >= i2) {
                break;
            }
            if (i6 >= 8) {
                break;
            } else if (rsnscriptsetvari.MediaBrowserCompat$ItemReceiver(i3, i4) == z2) {
                iArr[i6] = iArr[i6] + 1;
                i3 += i5;
            } else {
                i6++;
                z2 = !z2;
            }
        }
        if (i6 != 8) {
            if (z) {
                i = i2;
            }
            if (!(i3 == i && i6 == 7)) {
                return null;
            }
        }
        return iArr;
    }

    private static int MediaBrowserCompat$ItemReceiver(rsnScriptSetVarI rsnscriptsetvari, int i, int i2, boolean z, int i3, int i4) {
        int i5 = z ? -1 : 1;
        int i6 = i3;
        for (int i7 = 0; i7 < 2; i7++) {
            while (true) {
                if (!z) {
                    if (i6 >= i2) {
                        continue;
                        break;
                    }
                } else if (i6 < i) {
                    continue;
                    break;
                }
                if (z != rsnscriptsetvari.MediaBrowserCompat$ItemReceiver(i6, i4)) {
                    continue;
                    break;
                } else if (Math.abs(i3 - i6) > 2) {
                    return i3;
                } else {
                    i6 += i5;
                }
            }
            i5 = -i5;
            z = !z;
        }
        return i6;
    }

    private static int[] write(int i) {
        int[] iArr = new int[8];
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i & 1;
            if (i4 != i2) {
                i3--;
                if (i3 < 0) {
                    return iArr;
                }
                i2 = i4;
            }
            iArr[i3] = iArr[i3] + 1;
            i >>= 1;
        }
    }

    private static int read(int i) {
        int[] write = write(i);
        return ((((write[0] - write[2]) + write[4]) - write[6]) + 9) % 9;
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p040o.createFailedResult$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver(p040o.access$200 r15) throws com.google.zxing.NotFoundException {
        /*
            r0 = 0
            if (r15 != 0) goto L_0x0004
            return r0
        L_0x0004:
            o.onLoadFinished$write r1 = r15.write()
            r2 = -1
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L_0x0010
            r5 = r0
            goto L_0x007f
        L_0x0010:
            o.createFailedResult$MediaBrowserCompat$ItemReceiver r5 = r15.read
            boolean r6 = r15.MediaBrowserCompat$ItemReceiver
            if (r6 == 0) goto L_0x0019
            o.rsnScriptForEach r6 = r5.MediaMetadataCompat
            goto L_0x001b
        L_0x0019:
            o.rsnScriptForEach r6 = r5.MediaBrowserCompat$SearchResultReceiver
        L_0x001b:
            boolean r7 = r15.MediaBrowserCompat$ItemReceiver
            if (r7 == 0) goto L_0x0022
            o.rsnScriptForEach r5 = r5.read
            goto L_0x0024
        L_0x0022:
            o.rsnScriptForEach r5 = r5.MediaBrowserCompat$CustomActionResultReceiver
        L_0x0024:
            float r6 = r6.read
            int r6 = (int) r6
            o.createFailedResult$MediaBrowserCompat$ItemReceiver r7 = r15.read
            int r7 = r7.MediaDescriptionCompat
            int r6 = r6 - r7
            float r5 = r5.read
            int r5 = (int) r5
            o.createFailedResult$MediaBrowserCompat$ItemReceiver r7 = r15.read
            int r7 = r7.MediaDescriptionCompat
            int r5 = r5 - r7
            o.Api$ApiOptions$Optional$IconCompatParcelizer[] r7 = r15.write
            r8 = r2
        L_0x0037:
            if (r6 >= r5) goto L_0x0065
            r9 = r7[r6]
            if (r9 == 0) goto L_0x0062
            r9 = r7[r6]
            int r10 = r9.MediaBrowserCompat$ItemReceiver
            int r10 = r10 / 30
            int r10 = r10 * 3
            int r11 = r9.write
            int r11 = r11 / 3
            int r10 = r10 + r11
            r9.read = r10
            int r10 = r9.read
            int r10 = r10 - r8
            if (r10 != 0) goto L_0x0052
            goto L_0x0062
        L_0x0052:
            if (r10 != r4) goto L_0x0057
            int r8 = r9.read
            goto L_0x0062
        L_0x0057:
            int r10 = r9.read
            int r11 = r1.IconCompatParcelizer
            if (r10 < r11) goto L_0x0060
            r7[r6] = r0
            goto L_0x0062
        L_0x0060:
            int r8 = r9.read
        L_0x0062:
            int r6 = r6 + 1
            goto L_0x0037
        L_0x0065:
            int r1 = r1.IconCompatParcelizer
            int[] r5 = new int[r1]
            o.Api$ApiOptions$Optional$IconCompatParcelizer[] r6 = r15.write
            int r7 = r6.length
            r8 = r3
        L_0x006d:
            if (r8 >= r7) goto L_0x007f
            r9 = r6[r8]
            if (r9 == 0) goto L_0x007c
            int r9 = r9.read
            if (r9 >= r1) goto L_0x007c
            r10 = r5[r9]
            int r10 = r10 + r4
            r5[r9] = r10
        L_0x007c:
            int r8 = r8 + 1
            goto L_0x006d
        L_0x007f:
            if (r5 != 0) goto L_0x0082
            return r0
        L_0x0082:
            int r0 = r5.length
            r1 = r3
        L_0x0084:
            if (r1 >= r0) goto L_0x008f
            r6 = r5[r1]
            int r2 = java.lang.Math.max(r2, r6)
            int r1 = r1 + 1
            goto L_0x0084
        L_0x008f:
            int r0 = r5.length
            r1 = r3
            r6 = r1
        L_0x0092:
            if (r6 >= r0) goto L_0x009e
            r7 = r5[r6]
            int r8 = r2 - r7
            int r1 = r1 + r8
            if (r7 > 0) goto L_0x009e
            int r6 = r6 + 1
            goto L_0x0092
        L_0x009e:
            o.Api$ApiOptions$Optional$IconCompatParcelizer[] r0 = r15.write
            r6 = r3
        L_0x00a1:
            if (r1 <= 0) goto L_0x00ac
            r7 = r0[r6]
            if (r7 != 0) goto L_0x00ac
            int r1 = r1 + -1
            int r6 = r6 + 1
            goto L_0x00a1
        L_0x00ac:
            int r6 = r5.length
            int r6 = r6 - r4
            r7 = r3
        L_0x00af:
            if (r6 < 0) goto L_0x00bd
            r8 = r5[r6]
            int r8 = r2 - r8
            int r7 = r7 + r8
            r8 = r5[r6]
            if (r8 > 0) goto L_0x00bd
            int r6 = r6 + -1
            goto L_0x00af
        L_0x00bd:
            int r2 = r0.length
            int r2 = r2 - r4
        L_0x00bf:
            if (r7 <= 0) goto L_0x00ca
            r5 = r0[r2]
            if (r5 != 0) goto L_0x00ca
            int r7 = r7 + -1
            int r2 = r2 + -1
            goto L_0x00bf
        L_0x00ca:
            o.createFailedResult$MediaBrowserCompat$ItemReceiver r0 = r15.read
            boolean r15 = r15.MediaBrowserCompat$ItemReceiver
            o.rsnScriptForEach r2 = r0.MediaMetadataCompat
            o.rsnScriptForEach r5 = r0.read
            o.rsnScriptForEach r6 = r0.MediaBrowserCompat$SearchResultReceiver
            o.rsnScriptForEach r8 = r0.MediaBrowserCompat$CustomActionResultReceiver
            if (r1 <= 0) goto L_0x00f4
            if (r15 == 0) goto L_0x00dc
            r9 = r2
            goto L_0x00dd
        L_0x00dc:
            r9 = r6
        L_0x00dd:
            float r10 = r9.read
            int r10 = (int) r10
            int r10 = r10 - r1
            if (r10 >= 0) goto L_0x00e4
            goto L_0x00e5
        L_0x00e4:
            r3 = r10
        L_0x00e5:
            o.rsnScriptForEach r1 = new o.rsnScriptForEach
            float r9 = r9.MediaBrowserCompat$CustomActionResultReceiver
            float r3 = (float) r3
            r1.<init>(r9, r3)
            if (r15 == 0) goto L_0x00f1
            r2 = r1
            goto L_0x00f4
        L_0x00f1:
            r13 = r1
            r11 = r2
            goto L_0x00f6
        L_0x00f4:
            r11 = r2
            r13 = r6
        L_0x00f6:
            if (r7 <= 0) goto L_0x011c
            if (r15 == 0) goto L_0x00fd
            o.rsnScriptForEach r1 = r0.read
            goto L_0x00ff
        L_0x00fd:
            o.rsnScriptForEach r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
        L_0x00ff:
            float r2 = r1.read
            int r2 = (int) r2
            int r2 = r2 + r7
            o.rsnScriptSetVarI r3 = r0.IconCompatParcelizer
            int r3 = r3.write
            if (r2 < r3) goto L_0x010e
            o.rsnScriptSetVarI r2 = r0.IconCompatParcelizer
            int r2 = r2.write
            int r2 = r2 - r4
        L_0x010e:
            o.rsnScriptForEach r3 = new o.rsnScriptForEach
            float r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            float r2 = (float) r2
            r3.<init>(r1, r2)
            if (r15 != 0) goto L_0x011b
            r14 = r3
            r12 = r5
            goto L_0x011e
        L_0x011b:
            r5 = r3
        L_0x011c:
            r12 = r5
            r14 = r8
        L_0x011e:
            r0.write()
            o.createFailedResult$MediaBrowserCompat$ItemReceiver r15 = new o.createFailedResult$MediaBrowserCompat$ItemReceiver
            o.rsnScriptSetVarI r10 = r0.IconCompatParcelizer
            r9 = r15
            r9.<init>(r10, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getXStart.MediaBrowserCompat$ItemReceiver(o.access$200):o.createFailedResult$MediaBrowserCompat$ItemReceiver");
    }
}
