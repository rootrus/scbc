package p040o;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Map;
import p040o.ScriptGroup;
import p040o.getMaskAnimations;

/* renamed from: o.FragmentBuilder_BindECouponDetailFragment */
public final class FragmentBuilder_BindECouponDetailFragment {
    private final setLogLevel$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver = new setLogLevel$MediaBrowserCompat$ItemReceiver(rsnScriptSetVarObj.MediaDescriptionCompat);

    private void MediaBrowserCompat$ItemReceiver(byte[] bArr, int i) throws ChecksumException {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.write();
        }
    }

    private getMaskAnimations.read MediaBrowserCompat$CustomActionResultReceiver(TransferDeepLinkActivity transferDeepLinkActivity, Map<rsnIncContextCreate, ?> map) throws FormatException, ChecksumException {
        rsnScriptSetVarI rsnscriptsetvari;
        TransferDeepLinkActivity transferDeepLinkActivity2 = transferDeepLinkActivity;
        ScriptGroup.Binding write = transferDeepLinkActivity.write();
        execute execute = transferDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaBrowserCompat$CustomActionResultReceiver;
        ScriptGroup MediaBrowserCompat$CustomActionResultReceiver = transferDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver();
        ScriptGroup.Binding write2 = transferDeepLinkActivity.write();
        setX setx = setX.values()[MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver];
        int i = transferDeepLinkActivity2.IconCompatParcelizer.write;
        setx.IconCompatParcelizer(transferDeepLinkActivity2.IconCompatParcelizer, i);
        int i2 = 2;
        int i3 = (write2.read << 2) + 17;
        rsnScriptSetVarI rsnscriptsetvari2 = new rsnScriptSetVarI(i3);
        int i4 = 0;
        rsnscriptsetvari2.IconCompatParcelizer(0, 0, 9, 9);
        int i5 = i3 - 8;
        rsnscriptsetvari2.IconCompatParcelizer(i5, 0, 8, 9);
        rsnscriptsetvari2.IconCompatParcelizer(0, i5, 9, 8);
        int length = write2.MediaBrowserCompat$ItemReceiver.length;
        int i6 = 0;
        while (i6 < length) {
            int i7 = write2.MediaBrowserCompat$ItemReceiver[i6];
            int i8 = 0;
            while (i8 < length) {
                if (!((i6 == 0 && (i8 == 0 || i8 == length - 1)) || (i6 == length - 1 && i8 == 0))) {
                    rsnscriptsetvari2.IconCompatParcelizer(write2.MediaBrowserCompat$ItemReceiver[i8] - i2, i7 - 2, 5, 5);
                }
                i8++;
                i2 = 2;
            }
            i6++;
            i2 = 2;
        }
        int i9 = i3 - 17;
        int i10 = 6;
        rsnscriptsetvari2.IconCompatParcelizer(6, 9, 1, i9);
        rsnscriptsetvari2.IconCompatParcelizer(9, 6, i9, 1);
        if (write2.read > 6) {
            int i11 = i3 - 11;
            rsnscriptsetvari2.IconCompatParcelizer(i11, 0, 3, 6);
            rsnscriptsetvari2.IconCompatParcelizer(0, i11, 6, 3);
        }
        int i12 = write2.write;
        byte[] bArr = new byte[i12];
        int i13 = i - 1;
        int i14 = i13;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        boolean z = true;
        while (i14 > 0) {
            if (i14 == i10) {
                i14--;
            }
            int i18 = i4;
            while (i18 < i) {
                int i19 = z ? i13 - i18 : i18;
                int i20 = i;
                while (i4 < 2) {
                    int i21 = i14 - i4;
                    if (!rsnscriptsetvari2.MediaBrowserCompat$ItemReceiver(i21, i19)) {
                        i16++;
                        int i22 = i17 << 1;
                        rsnscriptsetvari = rsnscriptsetvari2;
                        int i23 = transferDeepLinkActivity2.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i21, i19) ? i22 | 1 : i22;
                        if (i16 == 8) {
                            bArr[i15] = (byte) i23;
                            i15++;
                            i16 = 0;
                            i17 = 0;
                        } else {
                            i17 = i23;
                        }
                    } else {
                        rsnscriptsetvari = rsnscriptsetvari2;
                    }
                    i4++;
                    rsnscriptsetvari2 = rsnscriptsetvari;
                }
                i18++;
                i = i20;
                rsnscriptsetvari2 = rsnscriptsetvari2;
                i4 = 0;
            }
            int i24 = i;
            z = !z;
            i14 -= 2;
            rsnscriptsetvari2 = rsnscriptsetvari2;
            i4 = 0;
            i10 = 6;
        }
        if (i15 != write2.write) {
            throw FormatException.read();
        } else if (i12 == write.write) {
            ScriptGroup.Binding.write write3 = write.IconCompatParcelizer[execute.ordinal()];
            C1273x3da1f9e2[] scriptGroup$Binding$MediaBrowserCompat$CustomActionResultReceiverArr = write3.MediaBrowserCompat$ItemReceiver;
            int i25 = 0;
            for (C1273x3da1f9e2 scriptGroup$Binding$MediaBrowserCompat$CustomActionResultReceiver : scriptGroup$Binding$MediaBrowserCompat$CustomActionResultReceiverArr) {
                i25 += scriptGroup$Binding$MediaBrowserCompat$CustomActionResultReceiver.write;
            }
            C3122x6b564be6[] basePendingResult$zaa$MediaBrowserCompat$CustomActionResultReceiverArr = new C3122x6b564be6[i25];
            int i26 = 0;
            for (C1273x3da1f9e2 scriptGroup$Binding$MediaBrowserCompat$CustomActionResultReceiver2 : scriptGroup$Binding$MediaBrowserCompat$CustomActionResultReceiverArr) {
                int i27 = 0;
                while (i27 < scriptGroup$Binding$MediaBrowserCompat$CustomActionResultReceiver2.write) {
                    int i28 = scriptGroup$Binding$MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver;
                    basePendingResult$zaa$MediaBrowserCompat$CustomActionResultReceiverArr[i26] = new C3122x6b564be6(i28, new byte[(write3.MediaBrowserCompat$CustomActionResultReceiver + i28)]);
                    i27++;
                    i26++;
                }
            }
            int length2 = basePendingResult$zaa$MediaBrowserCompat$CustomActionResultReceiverArr[0].write.length;
            int i29 = i25 - 1;
            while (i29 >= 0 && basePendingResult$zaa$MediaBrowserCompat$CustomActionResultReceiverArr[i29].write.length != length2) {
                i29--;
            }
            int i30 = i29 + 1;
            int i31 = length2 - write3.MediaBrowserCompat$CustomActionResultReceiver;
            int i32 = 0;
            for (int i33 = 0; i33 < i31; i33++) {
                int i34 = 0;
                while (i34 < i26) {
                    basePendingResult$zaa$MediaBrowserCompat$CustomActionResultReceiverArr[i34].write[i33] = bArr[i32];
                    i34++;
                    i32++;
                }
            }
            int i35 = i30;
            while (i35 < i26) {
                basePendingResult$zaa$MediaBrowserCompat$CustomActionResultReceiverArr[i35].write[i31] = bArr[i32];
                i35++;
                i32++;
            }
            int length3 = basePendingResult$zaa$MediaBrowserCompat$CustomActionResultReceiverArr[0].write.length;
            while (i31 < length3) {
                int i36 = 0;
                while (i36 < i26) {
                    basePendingResult$zaa$MediaBrowserCompat$CustomActionResultReceiverArr[i36].write[i36 < i30 ? i31 : i31 + 1] = bArr[i32];
                    i36++;
                    i32++;
                }
                i31++;
            }
            int i37 = 0;
            for (int i38 = 0; i38 < i25; i38++) {
                i37 += basePendingResult$zaa$MediaBrowserCompat$CustomActionResultReceiverArr[i38].MediaBrowserCompat$CustomActionResultReceiver;
            }
            byte[] bArr2 = new byte[i37];
            int i39 = 0;
            for (int i40 = 0; i40 < i25; i40++) {
                C3122x6b564be6 basePendingResult$zaa$MediaBrowserCompat$CustomActionResultReceiver = basePendingResult$zaa$MediaBrowserCompat$CustomActionResultReceiverArr[i40];
                byte[] bArr3 = basePendingResult$zaa$MediaBrowserCompat$CustomActionResultReceiver.write;
                int i41 = basePendingResult$zaa$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
                MediaBrowserCompat$ItemReceiver(bArr3, i41);
                int i42 = 0;
                while (i42 < i41) {
                    bArr2[i39] = bArr3[i42];
                    i42++;
                    i39++;
                }
            }
            return setInput.read(bArr2, write, execute, map);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0015 A[Catch:{ ChecksumException | FormatException -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c A[Catch:{ ChecksumException | FormatException -> 0x008a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.getMaskAnimations.read MediaBrowserCompat$CustomActionResultReceiver(p040o.rsnScriptSetVarI r11, java.util.Map<p040o.rsnIncContextCreate, ?> r12) throws com.google.zxing.FormatException, com.google.zxing.ChecksumException {
        /*
            r10 = this;
            o.TransferDeepLinkActivity r0 = new o.TransferDeepLinkActivity
            r0.<init>(r11)
            r11 = 0
            o.getMaskAnimations$read r11 = r10.MediaBrowserCompat$CustomActionResultReceiver((p040o.TransferDeepLinkActivity) r0, (java.util.Map<p040o.rsnIncContextCreate, ?>) r12)     // Catch:{ FormatException -> 0x000e, ChecksumException -> 0x000b }
            return r11
        L_0x000b:
            r1 = move-exception
            r2 = r11
            goto L_0x0011
        L_0x000e:
            r1 = move-exception
            r2 = r1
            r1 = r11
        L_0x0011:
            o.ScriptGroup r3 = r0.read     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            if (r3 == 0) goto L_0x0028
            o.setX[] r3 = p040o.setX.values()     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            o.ScriptGroup r4 = r0.read     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            byte r4 = r4.MediaBrowserCompat$ItemReceiver     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            r3 = r3[r4]     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            o.rsnScriptSetVarI r4 = r0.IconCompatParcelizer     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            int r4 = r4.write     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            o.rsnScriptSetVarI r5 = r0.IconCompatParcelizer     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            r3.IconCompatParcelizer(r5, r4)     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
        L_0x0028:
            r0.MediaBrowserCompat$CustomActionResultReceiver = r11     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            r0.read = r11     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            r11 = 1
            r0.MediaBrowserCompat$ItemReceiver = r11     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            r0.write()     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            r0.MediaBrowserCompat$CustomActionResultReceiver()     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            r3 = 0
        L_0x0036:
            o.rsnScriptSetVarI r4 = r0.IconCompatParcelizer     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            int r4 = r4.IconCompatParcelizer     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            if (r3 >= r4) goto L_0x007e
            int r4 = r3 + 1
            r5 = r4
        L_0x003f:
            o.rsnScriptSetVarI r6 = r0.IconCompatParcelizer     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            int r6 = r6.write     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            if (r5 >= r6) goto L_0x007c
            o.rsnScriptSetVarI r6 = r0.IconCompatParcelizer     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            boolean r6 = r6.MediaBrowserCompat$ItemReceiver(r3, r5)     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            o.rsnScriptSetVarI r7 = r0.IconCompatParcelizer     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            boolean r7 = r7.MediaBrowserCompat$ItemReceiver(r5, r3)     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            if (r6 == r7) goto L_0x0079
            o.rsnScriptSetVarI r6 = r0.IconCompatParcelizer     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            int r7 = r6.read     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            int r7 = r7 * r3
            int r8 = r5 / 32
            int r7 = r7 + r8
            int[] r6 = r6.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            r8 = r5 & 31
            int r8 = r11 << r8
            r9 = r6[r7]     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            r8 = r8 ^ r9
            r6[r7] = r8     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            o.rsnScriptSetVarI r6 = r0.IconCompatParcelizer     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            int r7 = r6.read     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            int r7 = r7 * r5
            int r8 = r3 / 32
            int r7 = r7 + r8
            int[] r6 = r6.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            r8 = r3 & 31
            int r8 = r11 << r8
            r9 = r6[r7]     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            r8 = r8 ^ r9
            r6[r7] = r8     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
        L_0x0079:
            int r5 = r5 + 1
            goto L_0x003f
        L_0x007c:
            r3 = r4
            goto L_0x0036
        L_0x007e:
            o.getMaskAnimations$read r11 = r10.MediaBrowserCompat$CustomActionResultReceiver((p040o.TransferDeepLinkActivity) r0, (java.util.Map<p040o.rsnIncContextCreate, ?>) r12)     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            o.access$102 r12 = new o.access$102     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            r12.<init>()     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            r11.write = r12     // Catch:{ FormatException -> 0x008c, ChecksumException -> 0x008a }
            return r11
        L_0x008a:
            r11 = move-exception
            goto L_0x008d
        L_0x008c:
            r11 = move-exception
        L_0x008d:
            if (r2 != 0) goto L_0x0093
            if (r1 == 0) goto L_0x0092
            throw r1
        L_0x0092:
            throw r11
        L_0x0093:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindECouponDetailFragment.MediaBrowserCompat$CustomActionResultReceiver(o.rsnScriptSetVarI, java.util.Map):o.getMaskAnimations$read");
    }
}
