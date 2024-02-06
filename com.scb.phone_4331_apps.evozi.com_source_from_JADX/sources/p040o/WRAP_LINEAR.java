package p040o;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;

/* renamed from: o.WRAP_LINEAR */
public final class WRAP_LINEAR extends getMinification {
    private static final int[] IconCompatParcelizer = {6, 8, 10, 12, 14};
    private static final int[] MediaBrowserCompat$CustomActionResultReceiver = {1, 1, 1, 1};
    private static final int[][] MediaBrowserCompat$ItemReceiver = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};
    private static final int[][] read = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};
    private int write = -1;

    private static void IconCompatParcelizer(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, int i, int i2, StringBuilder sb) throws NotFoundException {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i < i2) {
            MediaBrowserCompat$ItemReceiver(rsnscriptintrinsiccreate, i, iArr);
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 << 1;
                iArr2[i3] = iArr[i4];
                iArr3[i3] = iArr[i4 + 1];
            }
            sb.append((char) (MediaBrowserCompat$CustomActionResultReceiver(iArr2) + 48));
            sb.append((char) (MediaBrowserCompat$CustomActionResultReceiver(iArr3) + 48));
            for (int i5 = 0; i5 < 10; i5++) {
                i += iArr[i5];
            }
        }
    }

    private void write(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, int i) throws NotFoundException {
        int i2 = this.write * 10;
        if (i2 >= i) {
            i2 = i;
        }
        while (true) {
            i--;
            if (i2 <= 0 || i < 0) {
                break;
            }
            boolean z = true;
            if (((1 << (i & 31)) & rsnscriptintrinsiccreate.write[i / 32]) == 0) {
                z = false;
            }
            if (z) {
                break;
            }
            i2--;
        }
        if (i2 != 0) {
            throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:7|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r2 = IconCompatParcelizer(r7, r2, MediaBrowserCompat$ItemReceiver[1]);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int[] write(p040o.rsnScriptIntrinsicCreate r7) throws com.google.zxing.NotFoundException {
        /*
            r6 = this;
            r7.IconCompatParcelizer()
            int r0 = r7.read     // Catch:{ all -> 0x003a }
            r1 = 0
            int r2 = r7.read((int) r1)     // Catch:{ all -> 0x003a }
            if (r2 == r0) goto L_0x0035
            r0 = 1
            int[][] r3 = MediaBrowserCompat$ItemReceiver     // Catch:{ NotFoundException -> 0x0016 }
            r3 = r3[r1]     // Catch:{ NotFoundException -> 0x0016 }
            int[] r2 = IconCompatParcelizer((p040o.rsnScriptIntrinsicCreate) r7, (int) r2, (int[]) r3)     // Catch:{ NotFoundException -> 0x0016 }
            goto L_0x001e
        L_0x0016:
            int[][] r3 = MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x003a }
            r3 = r3[r0]     // Catch:{ all -> 0x003a }
            int[] r2 = IconCompatParcelizer((p040o.rsnScriptIntrinsicCreate) r7, (int) r2, (int[]) r3)     // Catch:{ all -> 0x003a }
        L_0x001e:
            r3 = r2[r1]     // Catch:{ all -> 0x003a }
            r6.write(r7, r3)     // Catch:{ all -> 0x003a }
            r3 = r2[r1]     // Catch:{ all -> 0x003a }
            int r4 = r7.read     // Catch:{ all -> 0x003a }
            r5 = r2[r0]     // Catch:{ all -> 0x003a }
            int r4 = r4 - r5
            r2[r1] = r4     // Catch:{ all -> 0x003a }
            int r1 = r7.read     // Catch:{ all -> 0x003a }
            int r1 = r1 - r3
            r2[r0] = r1     // Catch:{ all -> 0x003a }
            r7.IconCompatParcelizer()
            return r2
        L_0x0035:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()     // Catch:{ all -> 0x003a }
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            r7.IconCompatParcelizer()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.WRAP_LINEAR.write(o.rsnScriptIntrinsicCreate):int[]");
    }

    private static int[] IconCompatParcelizer(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i2 = rsnscriptintrinsiccreate.read;
        int i3 = i;
        boolean z = false;
        int i4 = 0;
        while (i < i2) {
            if ((((1 << (i & 31)) & rsnscriptintrinsiccreate.write[i / 32]) != 0) != z) {
                iArr2[i4] = iArr2[i4] + 1;
            } else {
                if (i4 != length - 1) {
                    i4++;
                } else if (IconCompatParcelizer(iArr2, iArr, 0.5f) < 0.38f) {
                    return new int[]{i3, i};
                } else {
                    i3 += iArr2[0] + iArr2[1];
                    int i5 = i4 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i4] = 0;
                    i4--;
                }
                iArr2[i4] = 1;
                z = !z;
            }
            i++;
        }
        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
    }

    private static int MediaBrowserCompat$CustomActionResultReceiver(int[] iArr) throws NotFoundException {
        int length = read.length;
        float f = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            float IconCompatParcelizer2 = IconCompatParcelizer(iArr, read[i2], 0.5f);
            if (IconCompatParcelizer2 < f) {
                i = i2;
                f = IconCompatParcelizer2;
            } else if (IconCompatParcelizer2 == f) {
                i = -1;
            }
        }
        if (i >= 0) {
            return i % 10;
        }
        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final getLayers$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer(int i, rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, Map<rsnIncContextCreate, ?> map) throws FormatException, NotFoundException {
        boolean z;
        int i2 = rsnscriptintrinsiccreate.read;
        int read2 = rsnscriptintrinsiccreate.read(0);
        if (read2 != i2) {
            int[] IconCompatParcelizer2 = IconCompatParcelizer(rsnscriptintrinsiccreate, read2, MediaBrowserCompat$CustomActionResultReceiver);
            this.write = (IconCompatParcelizer2[1] - IconCompatParcelizer2[0]) / 4;
            write(rsnscriptintrinsiccreate, IconCompatParcelizer2[0]);
            int[] write2 = write(rsnscriptintrinsiccreate);
            StringBuilder sb = new StringBuilder(20);
            IconCompatParcelizer(rsnscriptintrinsiccreate, IconCompatParcelizer2[1], write2[0], sb);
            String obj = sb.toString();
            int[] iArr = map != null ? (int[]) map.get(rsnIncContextCreate.ALLOWED_LENGTHS) : null;
            if (iArr == null) {
                iArr = IconCompatParcelizer;
            }
            int length = obj.length();
            int length2 = iArr.length;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i3 >= length2) {
                    z = false;
                    break;
                }
                int i5 = iArr[i3];
                if (length == i5) {
                    z = true;
                    break;
                }
                if (i5 > i4) {
                    i4 = i5;
                }
                i3++;
            }
            if (!z && length > i4) {
                z = true;
            }
            if (z) {
                float f = (float) i;
                return new getLayers$MediaBrowserCompat$CustomActionResultReceiver(obj, (byte[]) null, new rsnScriptForEach[]{new rsnScriptForEach((float) IconCompatParcelizer2[1], f), new rsnScriptForEach((float) write2[0], f)}, rsnIncAllocationCreateTyped.ITF);
            }
            throw FormatException.read();
        }
        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
