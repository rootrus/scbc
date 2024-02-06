package p040o;

/* renamed from: o.setMagnification */
final class setMagnification {
    private static final int[] write = {1, 1, 2};
    private final setWrapT MediaBrowserCompat$ItemReceiver = new setWrapT();
    private final C7382xd1f69a0a read = new C7382xd1f69a0a();

    setMagnification() {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e1, code lost:
        r9 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e2, code lost:
        if (r9 == 0) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e4, code lost:
        if (r9 == 1) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e7, code lost:
        if (r9 != 2) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e9, code lost:
        r5 = "Used";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ec, code lost:
        r5 = "0.00";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ef, code lost:
        r5 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0172 A[Catch:{ ReaderException -> 0x018f }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0175 A[Catch:{ ReaderException -> 0x018f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.getLayers$MediaBrowserCompat$CustomActionResultReceiver write(int r19, p040o.rsnScriptIntrinsicCreate r20, int r21) throws com.google.zxing.NotFoundException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            int[] r3 = write
            r4 = 0
            r5 = r21
            int[] r3 = p040o.setMinification.write(r2, r5, r4, r3)
            o.setWrapT r5 = r0.MediaBrowserCompat$ItemReceiver     // Catch:{ ReaderException -> 0x018f }
            java.lang.StringBuilder r6 = r5.IconCompatParcelizer     // Catch:{ ReaderException -> 0x018f }
            r6.setLength(r4)     // Catch:{ ReaderException -> 0x018f }
            int[] r5 = r5.read     // Catch:{ ReaderException -> 0x018f }
            r5[r4] = r4     // Catch:{ ReaderException -> 0x018f }
            r7 = 1
            r5[r7] = r4     // Catch:{ ReaderException -> 0x018f }
            r8 = 2
            r5[r8] = r4     // Catch:{ ReaderException -> 0x018f }
            r9 = 3
            r5[r9] = r4     // Catch:{ ReaderException -> 0x018f }
            int r10 = r2.read     // Catch:{ ReaderException -> 0x018f }
            r11 = r3[r7]     // Catch:{ ReaderException -> 0x018f }
            r12 = r4
            r13 = r12
        L_0x0029:
            r14 = 5
            r15 = 48
            r8 = 10
            if (r12 >= r14) goto L_0x0062
            if (r11 >= r10) goto L_0x0062
            int[][] r14 = p040o.setMinification.read     // Catch:{ ReaderException -> 0x018f }
            int r14 = p040o.setMinification.IconCompatParcelizer(r2, r5, r11, r14)     // Catch:{ ReaderException -> 0x018f }
            int r16 = r14 % 10
            int r15 = r16 + 48
            char r15 = (char) r15     // Catch:{ ReaderException -> 0x018f }
            r6.append(r15)     // Catch:{ ReaderException -> 0x018f }
            int r15 = r5.length     // Catch:{ ReaderException -> 0x018f }
        L_0x0041:
            if (r4 >= r15) goto L_0x004a
            r17 = r5[r4]     // Catch:{ ReaderException -> 0x018f }
            int r11 = r11 + r17
            int r4 = r4 + 1
            goto L_0x0041
        L_0x004a:
            r4 = 4
            if (r14 < r8) goto L_0x0052
            int r8 = 4 - r12
            int r8 = r7 << r8
            r13 = r13 | r8
        L_0x0052:
            if (r12 == r4) goto L_0x005d
            int r4 = r2.read((int) r11)     // Catch:{ ReaderException -> 0x018f }
            int r4 = r2.write(r4)     // Catch:{ ReaderException -> 0x018f }
            r11 = r4
        L_0x005d:
            int r12 = r12 + 1
            r4 = 0
            r8 = 2
            goto L_0x0029
        L_0x0062:
            int r4 = r6.length()     // Catch:{ ReaderException -> 0x018f }
            if (r4 != r14) goto L_0x018a
            r4 = 0
        L_0x0069:
            if (r4 >= r8) goto L_0x0185
            int[] r5 = p040o.setWrapT.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ ReaderException -> 0x018f }
            r5 = r5[r4]     // Catch:{ ReaderException -> 0x018f }
            if (r13 != r5) goto L_0x017e
            java.lang.String r5 = r6.toString()     // Catch:{ ReaderException -> 0x018f }
            int r10 = r5.length()     // Catch:{ ReaderException -> 0x018f }
            int r12 = r10 + -2
            r13 = 0
        L_0x007c:
            if (r12 < 0) goto L_0x0089
            char r17 = r5.charAt(r12)     // Catch:{ ReaderException -> 0x018f }
            int r17 = r17 + -48
            int r13 = r13 + r17
            int r12 = r12 + -2
            goto L_0x007c
        L_0x0089:
            int r13 = r13 * r9
            int r10 = r10 - r7
        L_0x008b:
            if (r10 < 0) goto L_0x0096
            char r12 = r5.charAt(r10)     // Catch:{ ReaderException -> 0x018f }
            int r12 = r12 - r15
            int r13 = r13 + r12
            int r10 = r10 + -2
            goto L_0x008b
        L_0x0096:
            int r13 = r13 * r9
            int r13 = r13 % r8
            if (r13 != r4) goto L_0x0179
            java.lang.String r4 = r6.toString()     // Catch:{ ReaderException -> 0x018f }
            int r5 = r4.length()     // Catch:{ ReaderException -> 0x018f }
            r6 = 0
            if (r5 == r14) goto L_0x00a9
        L_0x00a5:
            r8 = r6
        L_0x00a6:
            r5 = 2
            goto L_0x0145
        L_0x00a9:
            r5 = 0
            char r9 = r4.charAt(r5)     // Catch:{ ReaderException -> 0x018f }
            java.lang.String r5 = ""
            if (r9 == r15) goto L_0x00f4
            r10 = 53
            if (r9 == r10) goto L_0x00f1
            r10 = 57
            if (r9 != r10) goto L_0x00f7
            int r9 = r4.hashCode()     // Catch:{ ReaderException -> 0x018f }
            switch(r9) {
                case 54118329: goto L_0x00d6;
                case 54395376: goto L_0x00cc;
                case 54395377: goto L_0x00c2;
                default: goto L_0x00c1;
            }     // Catch:{ ReaderException -> 0x018f }
        L_0x00c1:
            goto L_0x00e1
        L_0x00c2:
            java.lang.String r9 = "99991"
            boolean r9 = r4.equals(r9)     // Catch:{ ReaderException -> 0x018f }
            if (r9 == 0) goto L_0x00e1
            r9 = r7
            goto L_0x00e2
        L_0x00cc:
            java.lang.String r9 = "99990"
            boolean r9 = r4.equals(r9)     // Catch:{ ReaderException -> 0x018f }
            if (r9 == 0) goto L_0x00e1
            r9 = 2
            goto L_0x00e2
        L_0x00d6:
            java.lang.String r9 = "90000"
            boolean r9 = r4.equals(r9)     // Catch:{ ReaderException -> 0x018f }
            if (r9 != 0) goto L_0x00df
            goto L_0x00e1
        L_0x00df:
            r9 = 0
            goto L_0x00e2
        L_0x00e1:
            r9 = -1
        L_0x00e2:
            if (r9 == 0) goto L_0x00ef
            if (r9 == r7) goto L_0x00ec
            r10 = 2
            if (r9 != r10) goto L_0x00f7
            java.lang.String r5 = "Used"
            goto L_0x0133
        L_0x00ec:
            java.lang.String r5 = "0.00"
            goto L_0x0133
        L_0x00ef:
            r5 = r6
            goto L_0x0133
        L_0x00f1:
            java.lang.String r5 = "$"
            goto L_0x00f7
        L_0x00f4:
            java.lang.String r5 = "£"
        L_0x00f7:
            java.lang.String r9 = r4.substring(r7)     // Catch:{ ReaderException -> 0x018f }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ ReaderException -> 0x018f }
            int r10 = r9 / 100
            int r9 = r9 % 100
            if (r9 >= r8) goto L_0x0114
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ ReaderException -> 0x018f }
            java.lang.String r12 = "0"
            r8.<init>(r12)     // Catch:{ ReaderException -> 0x018f }
            r8.append(r9)     // Catch:{ ReaderException -> 0x018f }
            java.lang.String r8 = r8.toString()     // Catch:{ ReaderException -> 0x018f }
            goto L_0x0118
        L_0x0114:
            java.lang.String r8 = java.lang.String.valueOf(r9)     // Catch:{ ReaderException -> 0x018f }
        L_0x0118:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ ReaderException -> 0x018f }
            r9.<init>()     // Catch:{ ReaderException -> 0x018f }
            r9.append(r5)     // Catch:{ ReaderException -> 0x018f }
            java.lang.String r5 = java.lang.String.valueOf(r10)     // Catch:{ ReaderException -> 0x018f }
            r9.append(r5)     // Catch:{ ReaderException -> 0x018f }
            r5 = 46
            r9.append(r5)     // Catch:{ ReaderException -> 0x018f }
            r9.append(r8)     // Catch:{ ReaderException -> 0x018f }
            java.lang.String r5 = r9.toString()     // Catch:{ ReaderException -> 0x018f }
        L_0x0133:
            if (r5 != 0) goto L_0x0137
            goto L_0x00a5
        L_0x0137:
            java.util.EnumMap r8 = new java.util.EnumMap     // Catch:{ ReaderException -> 0x018f }
            java.lang.Class<o.rsnInvokeClosureCreate> r9 = p040o.rsnInvokeClosureCreate.class
            r8.<init>(r9)     // Catch:{ ReaderException -> 0x018f }
            o.rsnInvokeClosureCreate r9 = p040o.rsnInvokeClosureCreate.SUGGESTED_PRICE     // Catch:{ ReaderException -> 0x018f }
            r8.put(r9, r5)     // Catch:{ ReaderException -> 0x018f }
            goto L_0x00a6
        L_0x0145:
            o.rsnScriptForEach[] r5 = new p040o.rsnScriptForEach[r5]     // Catch:{ ReaderException -> 0x018f }
            r9 = 0
            r10 = r3[r9]     // Catch:{ ReaderException -> 0x018f }
            r9 = r3[r7]     // Catch:{ ReaderException -> 0x018f }
            int r10 = r10 + r9
            float r9 = (float) r10     // Catch:{ ReaderException -> 0x018f }
            r10 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r10
            float r10 = (float) r1     // Catch:{ ReaderException -> 0x018f }
            o.rsnScriptForEach r12 = new o.rsnScriptForEach     // Catch:{ ReaderException -> 0x018f }
            r12.<init>(r9, r10)     // Catch:{ ReaderException -> 0x018f }
            r16 = 0
            r5[r16] = r12     // Catch:{ ReaderException -> 0x018f }
            o.rsnScriptForEach r9 = new o.rsnScriptForEach     // Catch:{ ReaderException -> 0x018f }
            float r11 = (float) r11     // Catch:{ ReaderException -> 0x018f }
            r9.<init>(r11, r10)     // Catch:{ ReaderException -> 0x018f }
            r5[r7] = r9     // Catch:{ ReaderException -> 0x018f }
            o.getLayers$MediaBrowserCompat$CustomActionResultReceiver r7 = new o.getLayers$MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ ReaderException -> 0x018f }
            o.rsnIncAllocationCreateTyped r9 = p040o.rsnIncAllocationCreateTyped.UPC_EAN_EXTENSION     // Catch:{ ReaderException -> 0x018f }
            r7.<init>(r4, r6, r5, r9)     // Catch:{ ReaderException -> 0x018f }
            if (r8 == 0) goto L_0x0178
            if (r8 == 0) goto L_0x0178
            java.util.Map<o.rsnInvokeClosureCreate, java.lang.Object> r4 = r7.read     // Catch:{ ReaderException -> 0x018f }
            if (r4 != 0) goto L_0x0175
            r7.read = r8     // Catch:{ ReaderException -> 0x018f }
            goto L_0x0178
        L_0x0175:
            r4.putAll(r8)     // Catch:{ ReaderException -> 0x018f }
        L_0x0178:
            return r7
        L_0x0179:
            com.google.zxing.NotFoundException r4 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()     // Catch:{ ReaderException -> 0x018f }
            throw r4     // Catch:{ ReaderException -> 0x018f }
        L_0x017e:
            r5 = 2
            r16 = 0
            int r4 = r4 + 1
            goto L_0x0069
        L_0x0185:
            com.google.zxing.NotFoundException r4 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()     // Catch:{ ReaderException -> 0x018f }
            throw r4     // Catch:{ ReaderException -> 0x018f }
        L_0x018a:
            com.google.zxing.NotFoundException r4 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()     // Catch:{ ReaderException -> 0x018f }
            throw r4     // Catch:{ ReaderException -> 0x018f }
        L_0x018f:
            o.proxyGetIPassportDeserializerRtti$MediaBrowserCompat$CustomActionResultReceiver r4 = r0.read
            o.getLayers$MediaBrowserCompat$CustomActionResultReceiver r1 = r4.MediaBrowserCompat$CustomActionResultReceiver(r1, r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setMagnification.write(int, o.rsnScriptIntrinsicCreate, int):o.getLayers$MediaBrowserCompat$CustomActionResultReceiver");
    }
}
