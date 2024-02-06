package p040o;

/* renamed from: o.getLAR$MediaBrowserCompat$ItemReceiver  reason: case insensitive filesystem */
public final class C10882getLAR$MediaBrowserCompat$ItemReceiver implements getIIdDeserializerOnDevice {
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x026e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.rsnScriptSetVarI write(java.lang.String r17, p040o.rsnIncAllocationCreateTyped r18, int r19, int r20, java.util.Map<p040o.rsnIncObjDestroy, ?> r21) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            boolean r5 = r17.isEmpty()
            if (r5 != 0) goto L_0x0430
            o.rsnIncAllocationCreateTyped r5 = p040o.rsnIncAllocationCreateTyped.DATA_MATRIX
            if (r1 != r5) goto L_0x041c
            if (r2 < 0) goto L_0x0400
            if (r3 < 0) goto L_0x0400
            o.RenderScript$ContextType r1 = p040o.RenderScript.ContextType.FORCE_NONE
            r5 = 0
            if (r4 == 0) goto L_0x0042
            o.rsnIncObjDestroy r6 = p040o.rsnIncObjDestroy.DATA_MATRIX_SHAPE
            java.lang.Object r6 = r4.get(r6)
            o.RenderScript$ContextType r6 = (p040o.RenderScript.ContextType) r6
            if (r6 == 0) goto L_0x0028
            r1 = r6
        L_0x0028:
            o.rsnIncObjDestroy r6 = p040o.rsnIncObjDestroy.MIN_SIZE
            java.lang.Object r6 = r4.get(r6)
            o.rsnIncContextFinish r6 = (p040o.rsnIncContextFinish) r6
            if (r6 != 0) goto L_0x0033
            r6 = r5
        L_0x0033:
            o.rsnIncObjDestroy r7 = p040o.rsnIncObjDestroy.MAX_SIZE
            java.lang.Object r4 = r4.get(r7)
            o.rsnIncContextFinish r4 = (p040o.rsnIncContextFinish) r4
            if (r4 != 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r5 = r4
        L_0x003f:
            r4 = r5
            r5 = r6
            goto L_0x0043
        L_0x0042:
            r4 = r5
        L_0x0043:
            r6 = 6
            o.getIIdExtractionServerKta[] r7 = new p040o.getIIdExtractionServerKta[r6]
            o.setProjectProvider$write r8 = new o.setProjectProvider$write
            r8.<init>()
            r9 = 0
            r7[r9] = r8
            o.IParameters$write r8 = new o.IParameters$write
            r8.<init>()
            r10 = 1
            r7[r10] = r8
            o.usingIO r8 = new o.usingIO
            r8.<init>()
            r11 = 2
            r7[r11] = r8
            o.validate r8 = new o.validate
            r8.<init>()
            r12 = 3
            r7[r12] = r8
            o.KtaPassportExtractor_Factory$MediaBrowserCompat$CustomActionResultReceiver r8 = new o.KtaPassportExtractor_Factory$MediaBrowserCompat$CustomActionResultReceiver
            r8.<init>()
            r13 = 4
            r7[r13] = r8
            o.setExtractionType$MediaBrowserCompat$ItemReceiver r8 = new o.setExtractionType$MediaBrowserCompat$ItemReceiver
            r8.<init>()
            r14 = 5
            r7[r14] = r8
            o.filterByAuthorizedAccounts$read r8 = new o.filterByAuthorizedAccounts$read
            r8.<init>(r0)
            r8.MediaDescriptionCompat = r1
            r8.MediaBrowserCompat$CustomActionResultReceiver = r5
            r8.MediaBrowserCompat$ItemReceiver = r4
            java.lang.String r15 = "[)>\u001e05\u001d"
            boolean r15 = r0.startsWith(r15)
            java.lang.String r6 = "\u001e\u0004"
            r12 = 7
            if (r15 == 0) goto L_0x00a1
            boolean r15 = r0.endsWith(r6)
            if (r15 == 0) goto L_0x00a1
            r0 = 236(0xec, float:3.31E-43)
            java.lang.StringBuilder r6 = r8.write
            r6.append(r0)
            r8.MediaBrowserCompat$MediaItem = r11
            int r0 = r8.MediaBrowserCompat$SearchResultReceiver
            int r0 = r0 + r12
            r8.MediaBrowserCompat$SearchResultReceiver = r0
            goto L_0x00bd
        L_0x00a1:
            java.lang.String r15 = "[)>\u001e06\u001d"
            boolean r15 = r0.startsWith(r15)
            if (r15 == 0) goto L_0x00bd
            boolean r0 = r0.endsWith(r6)
            if (r0 == 0) goto L_0x00bd
            r0 = 237(0xed, float:3.32E-43)
            java.lang.StringBuilder r6 = r8.write
            r6.append(r0)
            r8.MediaBrowserCompat$MediaItem = r11
            int r0 = r8.MediaBrowserCompat$SearchResultReceiver
            int r0 = r0 + r12
            r8.MediaBrowserCompat$SearchResultReceiver = r0
        L_0x00bd:
            r0 = r9
        L_0x00be:
            int r6 = r8.MediaBrowserCompat$SearchResultReceiver
            java.lang.String r15 = r8.IconCompatParcelizer
            int r15 = r15.length()
            int r12 = r8.MediaBrowserCompat$MediaItem
            int r15 = r15 - r12
            if (r6 >= r15) goto L_0x00cd
            r6 = r10
            goto L_0x00ce
        L_0x00cd:
            r6 = r9
        L_0x00ce:
            if (r6 == 0) goto L_0x00e0
            r6 = r7[r0]
            r6.IconCompatParcelizer(r8)
            int r6 = r8.read
            if (r6 < 0) goto L_0x00de
            int r0 = r8.read
            r6 = -1
            r8.read = r6
        L_0x00de:
            r12 = 7
            goto L_0x00be
        L_0x00e0:
            java.lang.StringBuilder r6 = r8.write
            int r6 = r6.length()
            java.lang.StringBuilder r7 = r8.write
            int r7 = r7.length()
            r8.read(r7)
            o.sendMessage r7 = r8.MediaMetadataCompat
            int r7 = r7.MediaBrowserCompat$CustomActionResultReceiver
            r12 = 254(0xfe, float:3.56E-43)
            if (r6 >= r7) goto L_0x0102
            if (r0 == 0) goto L_0x0102
            if (r0 == r14) goto L_0x0102
            if (r0 == r13) goto L_0x0102
            java.lang.StringBuilder r0 = r8.write
            r0.append(r12)
        L_0x0102:
            java.lang.StringBuilder r0 = r8.write
            int r6 = r0.length()
            r15 = 129(0x81, float:1.81E-43)
            if (r6 >= r7) goto L_0x010f
            r0.append(r15)
        L_0x010f:
            int r6 = r0.length()
            if (r6 >= r7) goto L_0x0129
            int r6 = r0.length()
            int r6 = r6 + r10
            int r6 = r6 * 149
            int r6 = r6 % 253
            int r6 = r6 + r10
            int r6 = r6 + r15
            if (r6 <= r12) goto L_0x0124
            int r6 = r6 + -254
        L_0x0124:
            char r6 = (char) r6
            r0.append(r6)
            goto L_0x010f
        L_0x0129:
            java.lang.StringBuilder r0 = r8.write
            java.lang.String r0 = r0.toString()
            int r6 = r0.length()
            o.sendMessage r1 = p040o.sendMessage.MediaBrowserCompat$CustomActionResultReceiver(r6, r1, r5, r4)
            java.lang.String r0 = p040o.setMessageHandler.read(r0, r1)
            o.setCredentialHintPickerConfig$write r4 = new o.setCredentialHintPickerConfig$write
            int r5 = r1.write()
            int r6 = r1.read
            int r5 = r5 * r6
            int r6 = r1.IconCompatParcelizer()
            int r7 = r1.write
            int r6 = r6 * r7
            r4.<init>(r0, r5, r6)
            r0 = r9
            r6 = r0
            r5 = r13
        L_0x0151:
            int r7 = r4.write
            r8 = 8
            if (r5 != r7) goto L_0x018f
            if (r6 != 0) goto L_0x018f
            int r7 = r4.write
            int r7 = r7 - r10
            r4.MediaBrowserCompat$CustomActionResultReceiver(r7, r9, r0, r10)
            int r7 = r4.write
            int r7 = r7 - r10
            r4.MediaBrowserCompat$CustomActionResultReceiver(r7, r10, r0, r11)
            int r7 = r4.write
            int r7 = r7 - r10
            r12 = 3
            r4.MediaBrowserCompat$CustomActionResultReceiver(r7, r11, r0, r12)
            int r7 = r4.read
            int r7 = r7 - r11
            r4.MediaBrowserCompat$CustomActionResultReceiver(r9, r7, r0, r13)
            int r7 = r4.read
            int r7 = r7 - r10
            r4.MediaBrowserCompat$CustomActionResultReceiver(r9, r7, r0, r14)
            int r7 = r4.read
            int r7 = r7 - r10
            r12 = 6
            r4.MediaBrowserCompat$CustomActionResultReceiver(r10, r7, r0, r12)
            int r7 = r4.read
            int r7 = r7 - r10
            r12 = 7
            r4.MediaBrowserCompat$CustomActionResultReceiver(r11, r7, r0, r12)
            int r7 = r4.read
            int r7 = r7 - r10
            r12 = 3
            r4.MediaBrowserCompat$CustomActionResultReceiver(r12, r7, r0, r8)
            int r0 = r0 + 1
        L_0x018f:
            int r7 = r4.write
            int r7 = r7 - r11
            if (r5 != r7) goto L_0x01d0
            if (r6 != 0) goto L_0x01d0
            int r7 = r4.read
            int r7 = r7 % r13
            if (r7 == 0) goto L_0x01d0
            int r7 = r4.write
            r12 = 3
            int r7 = r7 - r12
            r4.MediaBrowserCompat$CustomActionResultReceiver(r7, r9, r0, r10)
            int r7 = r4.write
            int r7 = r7 - r11
            r4.MediaBrowserCompat$CustomActionResultReceiver(r7, r9, r0, r11)
            int r7 = r4.write
            int r7 = r7 - r10
            r4.MediaBrowserCompat$CustomActionResultReceiver(r7, r9, r0, r12)
            int r7 = r4.read
            int r7 = r7 - r13
            r4.MediaBrowserCompat$CustomActionResultReceiver(r9, r7, r0, r13)
            int r7 = r4.read
            int r7 = r7 - r12
            r4.MediaBrowserCompat$CustomActionResultReceiver(r9, r7, r0, r14)
            int r7 = r4.read
            int r7 = r7 - r11
            r12 = 6
            r4.MediaBrowserCompat$CustomActionResultReceiver(r9, r7, r0, r12)
            int r7 = r4.read
            int r7 = r7 - r10
            r12 = 7
            r4.MediaBrowserCompat$CustomActionResultReceiver(r9, r7, r0, r12)
            int r7 = r4.read
            int r7 = r7 - r10
            r4.MediaBrowserCompat$CustomActionResultReceiver(r10, r7, r0, r8)
            int r0 = r0 + 1
        L_0x01d0:
            int r7 = r4.write
            int r7 = r7 - r11
            if (r5 != r7) goto L_0x0212
            if (r6 != 0) goto L_0x0212
            int r7 = r4.read
            int r7 = r7 % r8
            if (r7 != r13) goto L_0x0212
            int r7 = r4.write
            r12 = 3
            int r7 = r7 - r12
            r4.MediaBrowserCompat$CustomActionResultReceiver(r7, r9, r0, r10)
            int r7 = r4.write
            int r7 = r7 - r11
            r4.MediaBrowserCompat$CustomActionResultReceiver(r7, r9, r0, r11)
            int r7 = r4.write
            int r7 = r7 - r10
            r4.MediaBrowserCompat$CustomActionResultReceiver(r7, r9, r0, r12)
            int r7 = r4.read
            int r7 = r7 - r11
            r4.MediaBrowserCompat$CustomActionResultReceiver(r9, r7, r0, r13)
            int r7 = r4.read
            int r7 = r7 - r10
            r4.MediaBrowserCompat$CustomActionResultReceiver(r9, r7, r0, r14)
            int r7 = r4.read
            int r7 = r7 - r10
            r12 = 6
            r4.MediaBrowserCompat$CustomActionResultReceiver(r10, r7, r0, r12)
            int r7 = r4.read
            int r7 = r7 - r10
            r12 = 7
            r4.MediaBrowserCompat$CustomActionResultReceiver(r11, r7, r0, r12)
            int r7 = r4.read
            int r7 = r7 - r10
            r12 = 3
            r4.MediaBrowserCompat$CustomActionResultReceiver(r12, r7, r0, r8)
            int r0 = r0 + 1
        L_0x0212:
            int r7 = r4.write
            int r7 = r7 + r13
            if (r5 != r7) goto L_0x0257
            if (r6 != r11) goto L_0x0257
            int r7 = r4.read
            int r7 = r7 % r8
            if (r7 != 0) goto L_0x0257
            int r7 = r4.write
            int r7 = r7 - r10
            r4.MediaBrowserCompat$CustomActionResultReceiver(r7, r9, r0, r10)
            int r7 = r4.write
            int r7 = r7 - r10
            int r12 = r4.read
            int r12 = r12 - r10
            r4.MediaBrowserCompat$CustomActionResultReceiver(r7, r12, r0, r11)
            int r7 = r4.read
            r12 = 3
            int r7 = r7 - r12
            r4.MediaBrowserCompat$CustomActionResultReceiver(r9, r7, r0, r12)
            int r7 = r4.read
            int r7 = r7 - r11
            r4.MediaBrowserCompat$CustomActionResultReceiver(r9, r7, r0, r13)
            int r7 = r4.read
            int r7 = r7 - r10
            r4.MediaBrowserCompat$CustomActionResultReceiver(r9, r7, r0, r14)
            int r7 = r4.read
            int r7 = r7 - r12
            r15 = 6
            r4.MediaBrowserCompat$CustomActionResultReceiver(r10, r7, r0, r15)
            int r7 = r4.read
            int r7 = r7 - r11
            r12 = 7
            r4.MediaBrowserCompat$CustomActionResultReceiver(r10, r7, r0, r12)
            int r7 = r4.read
            int r7 = r7 - r10
            r4.MediaBrowserCompat$CustomActionResultReceiver(r10, r7, r0, r8)
            int r0 = r0 + 1
            goto L_0x0259
        L_0x0257:
            r12 = 7
            r15 = 6
        L_0x0259:
            int r7 = r4.write
            if (r5 >= r7) goto L_0x0273
            if (r6 < 0) goto L_0x0273
            byte[] r7 = r4.IconCompatParcelizer
            int r8 = r4.read
            int r8 = r8 * r5
            int r8 = r8 + r6
            byte r7 = r7[r8]
            if (r7 < 0) goto L_0x026b
            r7 = r10
            goto L_0x026c
        L_0x026b:
            r7 = r9
        L_0x026c:
            if (r7 != 0) goto L_0x0273
            r4.MediaBrowserCompat$CustomActionResultReceiver(r5, r6, r0)
            int r0 = r0 + 1
        L_0x0273:
            int r5 = r5 + -2
            int r6 = r6 + 2
            if (r5 < 0) goto L_0x027d
            int r7 = r4.read
            if (r6 < r7) goto L_0x0259
        L_0x027d:
            int r5 = r5 + 1
            int r6 = r6 + 3
        L_0x0281:
            if (r5 < 0) goto L_0x029b
            int r7 = r4.read
            if (r6 >= r7) goto L_0x029b
            byte[] r7 = r4.IconCompatParcelizer
            int r8 = r4.read
            int r8 = r8 * r5
            int r8 = r8 + r6
            byte r7 = r7[r8]
            if (r7 < 0) goto L_0x0293
            r7 = r10
            goto L_0x0294
        L_0x0293:
            r7 = r9
        L_0x0294:
            if (r7 != 0) goto L_0x029b
            r4.MediaBrowserCompat$CustomActionResultReceiver(r5, r6, r0)
            int r0 = r0 + 1
        L_0x029b:
            int r5 = r5 + 2
            int r6 = r6 + -2
            int r7 = r4.write
            if (r5 >= r7) goto L_0x02a5
            if (r6 >= 0) goto L_0x0281
        L_0x02a5:
            int r5 = r5 + 3
            int r6 = r6 + 1
            int r7 = r4.write
            if (r5 < r7) goto L_0x0151
            int r8 = r4.read
            if (r6 < r8) goto L_0x0151
            int r8 = r8 - r10
            int r7 = r7 - r10
            byte[] r0 = r4.IconCompatParcelizer
            int r5 = r4.read
            int r7 = r7 * r5
            int r7 = r7 + r8
            byte r0 = r0[r7]
            if (r0 < 0) goto L_0x02bf
            r0 = r10
            goto L_0x02c0
        L_0x02bf:
            r0 = r9
        L_0x02c0:
            if (r0 != 0) goto L_0x02de
            int r0 = r4.read
            int r0 = r0 - r10
            int r5 = r4.write
            int r5 = r5 - r10
            byte[] r6 = r4.IconCompatParcelizer
            int r7 = r4.read
            int r5 = r5 * r7
            int r5 = r5 + r0
            r6[r5] = r10
            int r0 = r4.read
            int r0 = r0 - r11
            int r5 = r4.write
            int r5 = r5 - r11
            byte[] r6 = r4.IconCompatParcelizer
            int r7 = r4.read
            int r5 = r5 * r7
            int r5 = r5 + r0
            r6[r5] = r10
        L_0x02de:
            int r0 = r1.write()
            int r5 = r1.read
            int r0 = r0 * r5
            int r5 = r1.IconCompatParcelizer()
            int r6 = r1.write
            int r5 = r5 * r6
            o.zzge$zzf$read r6 = new o.zzge$zzf$read
            int r7 = r1.write()
            int r8 = r1.read
            int r7 = r7 * r8
            int r8 = r1.write()
            int r8 = r8 << r10
            int r7 = r7 + r8
            int r8 = r1.IconCompatParcelizer()
            int r12 = r1.write
            int r8 = r8 * r12
            int r12 = r1.IconCompatParcelizer()
            int r12 = r12 << r10
            int r8 = r8 + r12
            r6.<init>(r7, r8)
            r7 = r9
            r8 = r7
        L_0x030d:
            if (r7 >= r5) goto L_0x03ab
            int r12 = r1.write
            int r12 = r7 % r12
            if (r12 != 0) goto L_0x033a
            r12 = r9
            r13 = r12
        L_0x0317:
            int r14 = r1.write()
            int r15 = r1.read
            int r14 = r14 * r15
            int r15 = r1.write()
            int r15 = r15 << r10
            int r14 = r14 + r15
            if (r12 >= r14) goto L_0x0338
            int r14 = r12 % 2
            if (r14 != 0) goto L_0x032c
            r14 = r10
            goto L_0x032d
        L_0x032c:
            r14 = r9
        L_0x032d:
            byte[][] r15 = r6.MediaBrowserCompat$CustomActionResultReceiver
            r15 = r15[r8]
            byte r14 = (byte) r14
            r15[r13] = r14
            int r13 = r13 + r10
            int r12 = r12 + 1
            goto L_0x0317
        L_0x0338:
            int r8 = r8 + 1
        L_0x033a:
            r12 = r9
            r13 = r12
        L_0x033c:
            if (r12 >= r0) goto L_0x037e
            int r14 = r1.read
            int r14 = r12 % r14
            if (r14 != 0) goto L_0x034d
            byte[][] r14 = r6.MediaBrowserCompat$CustomActionResultReceiver
            r14 = r14[r8]
            byte r15 = (byte) r10
            r14[r13] = r15
            int r13 = r13 + 1
        L_0x034d:
            byte[] r14 = r4.IconCompatParcelizer
            int r15 = r4.read
            int r15 = r15 * r7
            int r15 = r15 + r12
            byte r14 = r14[r15]
            if (r14 != r10) goto L_0x0359
            r14 = r10
            goto L_0x035a
        L_0x0359:
            r14 = r9
        L_0x035a:
            byte[][] r15 = r6.MediaBrowserCompat$CustomActionResultReceiver
            r15 = r15[r8]
            byte r14 = (byte) r14
            r15[r13] = r14
            int r13 = r13 + r10
            int r14 = r1.read
            int r14 = r12 % r14
            int r15 = r1.read
            int r15 = r15 - r10
            if (r14 != r15) goto L_0x037b
            int r14 = r7 % 2
            if (r14 != 0) goto L_0x0371
            r14 = r10
            goto L_0x0372
        L_0x0371:
            r14 = r9
        L_0x0372:
            byte[][] r15 = r6.MediaBrowserCompat$CustomActionResultReceiver
            r15 = r15[r8]
            byte r14 = (byte) r14
            r15[r13] = r14
            int r13 = r13 + 1
        L_0x037b:
            int r12 = r12 + 1
            goto L_0x033c
        L_0x037e:
            int r8 = r8 + 1
            int r12 = r1.write
            int r12 = r7 % r12
            int r13 = r1.write
            int r13 = r13 - r10
            if (r12 != r13) goto L_0x03a7
            r12 = r9
            r13 = r12
        L_0x038b:
            int r14 = r1.write()
            int r15 = r1.read
            int r14 = r14 * r15
            int r15 = r1.write()
            int r15 = r15 << r10
            int r14 = r14 + r15
            if (r12 >= r14) goto L_0x03a5
            byte[][] r14 = r6.MediaBrowserCompat$CustomActionResultReceiver
            r14 = r14[r8]
            byte r15 = (byte) r10
            r14[r13] = r15
            int r13 = r13 + r10
            int r12 = r12 + 1
            goto L_0x038b
        L_0x03a5:
            int r8 = r8 + 1
        L_0x03a7:
            int r7 = r7 + 1
            goto L_0x030d
        L_0x03ab:
            int r0 = r6.read
            int r1 = r6.MediaBrowserCompat$ItemReceiver
            int r4 = java.lang.Math.max(r2, r0)
            int r5 = java.lang.Math.max(r3, r1)
            int r7 = r4 / r0
            int r8 = r5 / r1
            int r7 = java.lang.Math.min(r7, r8)
            int r8 = r0 * r7
            int r4 = r4 - r8
            int r4 = r4 / r11
            int r8 = r1 * r7
            int r5 = r5 - r8
            int r5 = r5 / r11
            if (r3 < r1) goto L_0x03d1
            if (r2 < r0) goto L_0x03d1
            o.rsnScriptSetVarI r8 = new o.rsnScriptSetVarI
            r8.<init>(r2, r3)
            goto L_0x03d8
        L_0x03d1:
            o.rsnScriptSetVarI r8 = new o.rsnScriptSetVarI
            r8.<init>(r0, r1)
            r4 = r9
            r5 = r4
        L_0x03d8:
            int[] r2 = r8.MediaBrowserCompat$CustomActionResultReceiver
            int r2 = r2.length
            r3 = r9
        L_0x03dc:
            if (r3 >= r2) goto L_0x03e5
            int[] r11 = r8.MediaBrowserCompat$CustomActionResultReceiver
            r11[r3] = r9
            int r3 = r3 + 1
            goto L_0x03dc
        L_0x03e5:
            r2 = r9
        L_0x03e6:
            if (r2 >= r1) goto L_0x03ff
            r11 = r4
            r3 = r9
        L_0x03ea:
            if (r3 >= r0) goto L_0x03fb
            byte[][] r12 = r6.MediaBrowserCompat$CustomActionResultReceiver
            r12 = r12[r2]
            byte r12 = r12[r3]
            if (r12 != r10) goto L_0x03f7
            r8.IconCompatParcelizer(r11, r5, r7, r7)
        L_0x03f7:
            int r3 = r3 + 1
            int r11 = r11 + r7
            goto L_0x03ea
        L_0x03fb:
            int r2 = r2 + 1
            int r5 = r5 + r7
            goto L_0x03e6
        L_0x03ff:
            return r8
        L_0x0400:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Requested dimensions can't be negative: "
            r0.<init>(r1)
            r0.append(r2)
            r1 = 120(0x78, float:1.68E-43)
            r0.append(r1)
            r0.append(r3)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x041c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Can only encode DATA_MATRIX, but got "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0430:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Found empty contents"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C10882getLAR$MediaBrowserCompat$ItemReceiver.write(java.lang.String, o.rsnIncAllocationCreateTyped, int, int, java.util.Map):o.rsnScriptSetVarI");
    }
}
