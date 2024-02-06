package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.List;
import p040o.addApi;

/* renamed from: o.getZStart */
public final class getZStart {
    private static final int[] MediaBrowserCompat$CustomActionResultReceiver = {8, 1, 1, 1, 1, 1, 1, 3};
    private static final int[] MediaBrowserCompat$ItemReceiver = {7, 1, 1, 3, 1, 1, 1, 2, 1};
    private static final int[] read = {6, 2, 7, 3};
    private static final int[] write = {0, 4, 1, 5};

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r4.hasNext() == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        r5 = (p040o.rsnScriptForEach[]) r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r5[1] == null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        r2 = (int) java.lang.Math.max((float) r2, r5[1].read);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r5[3] == null) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        r2 = java.lang.Math.max(r2, (int) r5[3].read);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r5 == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        r4 = r0.iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<p040o.rsnScriptForEach[]> write(boolean r8, p040o.rsnScriptSetVarI r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        L_0x0007:
            r3 = 1
            r4 = r1
            r5 = r4
        L_0x000a:
            int r6 = r9.write
            if (r2 >= r6) goto L_0x006e
            o.rsnScriptForEach[] r4 = write(r9, r2, r4)
            r6 = r4[r1]
            if (r6 != 0) goto L_0x004c
            r6 = 3
            r7 = r4[r6]
            if (r7 != 0) goto L_0x004c
            if (r5 == 0) goto L_0x006e
            java.util.Iterator r4 = r0.iterator()
        L_0x0021:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0049
            java.lang.Object r5 = r4.next()
            o.rsnScriptForEach[] r5 = (p040o.rsnScriptForEach[]) r5
            r7 = r5[r3]
            if (r7 == 0) goto L_0x003b
            float r2 = (float) r2
            r7 = r5[r3]
            float r7 = r7.read
            float r2 = java.lang.Math.max(r2, r7)
            int r2 = (int) r2
        L_0x003b:
            r7 = r5[r6]
            if (r7 == 0) goto L_0x0021
            r5 = r5[r6]
            float r5 = r5.read
            int r5 = (int) r5
            int r2 = java.lang.Math.max(r2, r5)
            goto L_0x0021
        L_0x0049:
            int r2 = r2 + 5
            goto L_0x0007
        L_0x004c:
            r0.add(r4)
            if (r8 == 0) goto L_0x006e
            r2 = 2
            r5 = r4[r2]
            if (r5 == 0) goto L_0x0060
            r5 = r4[r2]
            float r5 = r5.MediaBrowserCompat$CustomActionResultReceiver
            int r5 = (int) r5
            r2 = r4[r2]
            float r2 = r2.read
            goto L_0x006a
        L_0x0060:
            r2 = 4
            r5 = r4[r2]
            float r5 = r5.MediaBrowserCompat$CustomActionResultReceiver
            int r5 = (int) r5
            r2 = r4[r2]
            float r2 = r2.read
        L_0x006a:
            r4 = r5
            int r2 = (int) r2
            r5 = r3
            goto L_0x000a
        L_0x006e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getZStart.write(boolean, o.rsnScriptSetVarI):java.util.List");
    }

    private static rsnScriptForEach[] write(rsnScriptSetVarI rsnscriptsetvari, int i, int i2, int i3, int i4, int[] iArr) {
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        rsnScriptForEach[] rsnscriptforeachArr = new rsnScriptForEach[4];
        int[] iArr2 = new int[iArr.length];
        int i9 = i3;
        while (true) {
            if (i9 >= i8) {
                z = false;
                break;
            }
            int[] MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(rsnscriptsetvari, i4, i9, i2, false, iArr, iArr2);
            if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                int i10 = i9;
                int[] iArr3 = MediaBrowserCompat$CustomActionResultReceiver2;
                int i11 = i10;
                while (true) {
                    if (i11 <= 0) {
                        i7 = i11;
                        break;
                    }
                    int i12 = i11 - 1;
                    int[] MediaBrowserCompat$CustomActionResultReceiver3 = MediaBrowserCompat$CustomActionResultReceiver(rsnscriptsetvari, i4, i12, i2, false, iArr, iArr2);
                    if (MediaBrowserCompat$CustomActionResultReceiver3 == null) {
                        i7 = i12 + 1;
                        break;
                    }
                    iArr3 = MediaBrowserCompat$CustomActionResultReceiver3;
                    i11 = i12;
                }
                float f = (float) i7;
                rsnscriptforeachArr[0] = new rsnScriptForEach((float) iArr3[0], f);
                rsnscriptforeachArr[1] = new rsnScriptForEach((float) iArr3[1], f);
                z = true;
                i9 = i7;
            } else {
                i9 += 5;
            }
        }
        int i13 = i9 + 1;
        if (z) {
            int[] iArr4 = {(int) rsnscriptforeachArr[0].MediaBrowserCompat$CustomActionResultReceiver, (int) rsnscriptforeachArr[1].MediaBrowserCompat$CustomActionResultReceiver};
            int i14 = i13;
            int i15 = 0;
            while (true) {
                if (i14 >= i8) {
                    i5 = i15;
                    i6 = i14;
                    break;
                }
                i5 = i15;
                i6 = i14;
                int[] MediaBrowserCompat$CustomActionResultReceiver4 = MediaBrowserCompat$CustomActionResultReceiver(rsnscriptsetvari, iArr4[0], i14, i2, false, iArr, iArr2);
                if (MediaBrowserCompat$CustomActionResultReceiver4 == null || Math.abs(iArr4[0] - MediaBrowserCompat$CustomActionResultReceiver4[0]) >= 5 || Math.abs(iArr4[1] - MediaBrowserCompat$CustomActionResultReceiver4[1]) >= 5) {
                    if (i5 > 25) {
                        break;
                    }
                    i15 = i5 + 1;
                } else {
                    iArr4 = MediaBrowserCompat$CustomActionResultReceiver4;
                    i15 = 0;
                }
                i14 = i6 + 1;
            }
            i13 = i6 - (i5 + 1);
            float f2 = (float) i13;
            rsnscriptforeachArr[2] = new rsnScriptForEach((float) iArr4[0], f2);
            rsnscriptforeachArr[3] = new rsnScriptForEach((float) iArr4[1], f2);
        }
        if (i13 - i9 < 10) {
            Arrays.fill(rsnscriptforeachArr, (Object) null);
        }
        return rsnscriptforeachArr;
    }

    private static int[] MediaBrowserCompat$CustomActionResultReceiver(rsnScriptSetVarI rsnscriptsetvari, int i, int i2, int i3, boolean z, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i4 = 0;
        while (rsnscriptsetvari.MediaBrowserCompat$ItemReceiver(i, i2) && i > 0 && i4 < 3) {
            i--;
            i4++;
        }
        int length = iArr.length;
        boolean z2 = z;
        int i5 = 0;
        int i6 = i;
        while (i < i3) {
            if (rsnscriptsetvari.MediaBrowserCompat$ItemReceiver(i, i2) != z2) {
                iArr2[i5] = iArr2[i5] + 1;
            } else {
                if (i5 != length - 1) {
                    i5++;
                } else if (IconCompatParcelizer(iArr2, iArr) < 0.42f) {
                    return new int[]{i6, i};
                } else {
                    i6 += iArr2[0] + iArr2[1];
                    int i7 = i5 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i7);
                    iArr2[i7] = 0;
                    iArr2[i5] = 0;
                    i5--;
                }
                iArr2[i5] = 1;
                z2 = !z2;
            }
            i++;
        }
        if (i5 != length - 1 || IconCompatParcelizer(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i6, i - 1};
    }

    private static float IconCompatParcelizer(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f = (float) i;
        float f2 = f / ((float) i2);
        float f3 = BitmapDescriptorFactory.HUE_RED;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f4 = ((float) iArr2[i4]) * f2;
            float f5 = (float) i5;
            float f6 = f5 > f4 ? f5 - f4 : f4 - f5;
            if (f6 > 0.8f * f2) {
                return Float.POSITIVE_INFINITY;
            }
            f3 += f6;
        }
        return f3 / f;
    }

    public static addApi.read write(setFontAssetDelegate$MediaBrowserCompat$ItemReceiver setfontassetdelegate_mediabrowsercompat_itemreceiver, boolean z) throws NotFoundException {
        if (setfontassetdelegate_mediabrowsercompat_itemreceiver.read == null) {
            setfontassetdelegate_mediabrowsercompat_itemreceiver.read = setfontassetdelegate_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver.read();
        }
        rsnScriptSetVarI rsnscriptsetvari = setfontassetdelegate_mediabrowsercompat_itemreceiver.read;
        List<rsnScriptForEach[]> write2 = write(false, rsnscriptsetvari);
        if (write2.isEmpty()) {
            rsnscriptsetvari = rsnscriptsetvari.MediaBrowserCompat$ItemReceiver();
            int i = rsnscriptsetvari.IconCompatParcelizer;
            int i2 = rsnscriptsetvari.write;
            rsnScriptIntrinsicCreate rsnscriptintrinsiccreate = new rsnScriptIntrinsicCreate(i);
            rsnScriptIntrinsicCreate rsnscriptintrinsiccreate2 = new rsnScriptIntrinsicCreate(i);
            for (int i3 = 0; i3 < (i2 + 1) / 2; i3++) {
                rsnscriptintrinsiccreate = rsnscriptsetvari.write(i3, rsnscriptintrinsiccreate);
                int i4 = (i2 - 1) - i3;
                rsnscriptintrinsiccreate2 = rsnscriptsetvari.write(i4, rsnscriptintrinsiccreate2);
                rsnscriptintrinsiccreate.IconCompatParcelizer();
                rsnscriptintrinsiccreate2.IconCompatParcelizer();
                int[] iArr = rsnscriptintrinsiccreate2.write;
                int[] iArr2 = rsnscriptsetvari.MediaBrowserCompat$CustomActionResultReceiver;
                int i5 = rsnscriptsetvari.read;
                System.arraycopy(iArr, 0, iArr2, i3 * i5, i5);
                int[] iArr3 = rsnscriptintrinsiccreate.write;
                int[] iArr4 = rsnscriptsetvari.MediaBrowserCompat$CustomActionResultReceiver;
                int i6 = rsnscriptsetvari.read;
                System.arraycopy(iArr3, 0, iArr4, i4 * i6, i6);
            }
            write2 = write(false, rsnscriptsetvari);
        }
        return new addApi.read(rsnscriptsetvari, write2);
    }

    private static rsnScriptForEach[] write(rsnScriptSetVarI rsnscriptsetvari, int i, int i2) {
        int i3 = rsnscriptsetvari.write;
        int i4 = rsnscriptsetvari.IconCompatParcelizer;
        rsnScriptForEach[] rsnscriptforeachArr = new rsnScriptForEach[8];
        rsnScriptForEach[] write2 = write(rsnscriptsetvari, i3, i4, i, i2, MediaBrowserCompat$CustomActionResultReceiver);
        int[] iArr = write;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            rsnscriptforeachArr[iArr[i5]] = write2[i5];
        }
        if (rsnscriptforeachArr[4] != null) {
            i2 = (int) rsnscriptforeachArr[4].MediaBrowserCompat$CustomActionResultReceiver;
            i = (int) rsnscriptforeachArr[4].read;
        }
        rsnScriptForEach[] write3 = write(rsnscriptsetvari, i3, i4, i, i2, MediaBrowserCompat$ItemReceiver);
        int[] iArr2 = read;
        for (int i6 = 0; i6 < iArr2.length; i6++) {
            rsnscriptforeachArr[iArr2[i6]] = write3[i6];
        }
        return rsnscriptforeachArr;
    }
}
