package p040o;

import com.google.zxing.NotFoundException;

/* renamed from: o.rsnScriptSetVarF */
public final class rsnScriptSetVarF extends rsnScriptReduce {
    public final rsnScriptSetVarI IconCompatParcelizer(rsnScriptSetVarI rsnscriptsetvari, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) throws NotFoundException {
        rsnScriptSetVarI rsnscriptsetvari2 = rsnscriptsetvari;
        int i3 = i;
        int i4 = i2;
        return IconCompatParcelizer(rsnscriptsetvari, i, i2, replaceInParent$MediaBrowserCompat$ItemReceiver.write(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16));
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.rsnScriptSetVarI IconCompatParcelizer(p040o.rsnScriptSetVarI r23, int r24, int r25, p040o.replaceInParent$MediaBrowserCompat$ItemReceiver r26) throws com.google.zxing.NotFoundException {
        /*
            r22 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            if (r1 <= 0) goto L_0x011d
            if (r2 <= 0) goto L_0x011d
            o.rsnScriptSetVarI r4 = new o.rsnScriptSetVarI
            r4.<init>(r1, r2)
            r5 = 1
            int r1 = r1 << r5
            float[] r6 = new float[r1]
            r8 = 0
        L_0x0016:
            if (r8 >= r2) goto L_0x011c
            float r9 = (float) r8
            r10 = 0
        L_0x001a:
            if (r10 >= r1) goto L_0x002c
            int r11 = r10 / 2
            float r11 = (float) r11
            r12 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 + r12
            r6[r10] = r11
            int r11 = r10 + 1
            float r12 = r12 + r9
            r6[r11] = r12
            int r10 = r10 + 2
            goto L_0x001a
        L_0x002c:
            float r9 = r3.MediaBrowserCompat$CustomActionResultReceiver
            float r10 = r3.IconCompatParcelizer
            float r11 = r3.write
            float r12 = r3.read
            float r13 = r3.MediaBrowserCompat$ItemReceiver
            float r14 = r3.MediaDescriptionCompat
            float r15 = r3.MediaBrowserCompat$SearchResultReceiver
            float r7 = r3.MediaBrowserCompat$MediaItem
            float r5 = r3.MediaMetadataCompat
            r2 = 0
        L_0x003f:
            if (r2 >= r1) goto L_0x006a
            r16 = r6[r2]
            int r17 = r2 + 1
            r18 = r6[r17]
            float r19 = r11 * r16
            float r20 = r14 * r18
            float r19 = r19 + r20
            float r19 = r19 + r5
            float r20 = r9 * r16
            float r21 = r12 * r18
            float r20 = r20 + r21
            float r20 = r20 + r15
            float r20 = r20 / r19
            r6[r2] = r20
            float r16 = r16 * r10
            float r18 = r18 * r13
            float r16 = r16 + r18
            float r16 = r16 + r7
            float r16 = r16 / r19
            r6[r17] = r16
            int r2 = r2 + 2
            goto L_0x003f
        L_0x006a:
            int r2 = r0.IconCompatParcelizer
            int r5 = r0.write
            r7 = 0
            r9 = 1
        L_0x0070:
            r10 = 0
            r11 = -1
            if (r7 >= r1) goto L_0x00aa
            if (r9 == 0) goto L_0x00aa
            r9 = r6[r7]
            int r9 = (int) r9
            int r12 = r7 + 1
            r13 = r6[r12]
            int r13 = (int) r13
            if (r9 < r11) goto L_0x00a5
            if (r9 > r2) goto L_0x00a5
            if (r13 < r11) goto L_0x00a5
            if (r13 > r5) goto L_0x00a5
            if (r9 != r11) goto L_0x008b
            r6[r7] = r10
            goto L_0x0092
        L_0x008b:
            if (r9 != r2) goto L_0x0094
            int r9 = r2 + -1
            float r9 = (float) r9
            r6[r7] = r9
        L_0x0092:
            r9 = 1
            goto L_0x0095
        L_0x0094:
            r9 = 0
        L_0x0095:
            if (r13 != r11) goto L_0x009a
            r6[r12] = r10
            goto L_0x00a1
        L_0x009a:
            if (r13 != r5) goto L_0x00a2
            int r9 = r5 + -1
            float r9 = (float) r9
            r6[r12] = r9
        L_0x00a1:
            r9 = 1
        L_0x00a2:
            int r7 = r7 + 2
            goto L_0x0070
        L_0x00a5:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r0
        L_0x00aa:
            int r7 = r1 + -2
            r9 = 1
        L_0x00ad:
            if (r7 < 0) goto L_0x00e5
            if (r9 == 0) goto L_0x00e5
            r9 = r6[r7]
            int r9 = (int) r9
            int r12 = r7 + 1
            r13 = r6[r12]
            int r13 = (int) r13
            if (r9 < r11) goto L_0x00e0
            if (r9 > r2) goto L_0x00e0
            if (r13 < r11) goto L_0x00e0
            if (r13 > r5) goto L_0x00e0
            if (r9 != r11) goto L_0x00c6
            r6[r7] = r10
            goto L_0x00cd
        L_0x00c6:
            if (r9 != r2) goto L_0x00cf
            int r9 = r2 + -1
            float r9 = (float) r9
            r6[r7] = r9
        L_0x00cd:
            r9 = 1
            goto L_0x00d0
        L_0x00cf:
            r9 = 0
        L_0x00d0:
            if (r13 != r11) goto L_0x00d5
            r6[r12] = r10
            goto L_0x00dc
        L_0x00d5:
            if (r13 != r5) goto L_0x00dd
            int r9 = r5 + -1
            float r9 = (float) r9
            r6[r12] = r9
        L_0x00dc:
            r9 = 1
        L_0x00dd:
            int r7 = r7 + -2
            goto L_0x00ad
        L_0x00e0:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r0
        L_0x00e5:
            r2 = 0
        L_0x00e6:
            if (r2 >= r1) goto L_0x0114
            r5 = r6[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x010f }
            int r5 = (int) r5     // Catch:{ ArrayIndexOutOfBoundsException -> 0x010f }
            int r7 = r2 + 1
            r7 = r6[r7]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x010f }
            int r7 = (int) r7     // Catch:{ ArrayIndexOutOfBoundsException -> 0x010f }
            boolean r5 = r0.MediaBrowserCompat$ItemReceiver(r5, r7)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x010f }
            if (r5 == 0) goto L_0x010b
            int r5 = r2 / 2
            int r7 = r4.read     // Catch:{ ArrayIndexOutOfBoundsException -> 0x010f }
            int r7 = r7 * r8
            int r9 = r5 / 32
            int r7 = r7 + r9
            int[] r9 = r4.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ ArrayIndexOutOfBoundsException -> 0x010f }
            r5 = r5 & 31
            r10 = 1
            int r5 = r10 << r5
            r11 = r9[r7]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x010f }
            r5 = r5 | r11
            r9[r7] = r5     // Catch:{ ArrayIndexOutOfBoundsException -> 0x010f }
            goto L_0x010c
        L_0x010b:
            r10 = 1
        L_0x010c:
            int r2 = r2 + 2
            goto L_0x00e6
        L_0x010f:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r0
        L_0x0114:
            r10 = 1
            int r8 = r8 + 1
            r2 = r25
            r5 = r10
            goto L_0x0016
        L_0x011c:
            return r4
        L_0x011d:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.rsnScriptSetVarF.IconCompatParcelizer(o.rsnScriptSetVarI, int, int, o.replaceInParent$MediaBrowserCompat$ItemReceiver):o.rsnScriptSetVarI");
    }
}
