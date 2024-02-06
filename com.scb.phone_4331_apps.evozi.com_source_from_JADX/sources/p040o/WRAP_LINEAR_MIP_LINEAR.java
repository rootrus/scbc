package p040o;

import com.google.zxing.NotFoundException;

/* renamed from: o.WRAP_LINEAR_MIP_LINEAR */
public final class WRAP_LINEAR_MIP_LINEAR extends setMinification {
    private final int[] MediaBrowserCompat$ItemReceiver = new int[4];

    /* access modifiers changed from: protected */
    public final int read(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.MediaBrowserCompat$ItemReceiver;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int i = rsnscriptintrinsiccreate.read;
        int i2 = iArr[1];
        for (int i3 = 0; i3 < 4 && i2 < i; i3++) {
            sb.append((char) (IconCompatParcelizer(rsnscriptintrinsiccreate, iArr2, i2, IconCompatParcelizer) + 48));
            for (int i4 : iArr2) {
                i2 += i4;
            }
        }
        int i5 = write(rsnscriptintrinsiccreate, i2, true, MediaBrowserCompat$CustomActionResultReceiver)[1];
        for (int i6 = 0; i6 < 4 && i5 < i; i6++) {
            sb.append((char) (IconCompatParcelizer(rsnscriptintrinsiccreate, iArr2, i5, IconCompatParcelizer) + 48));
            for (int i7 : iArr2) {
                i5 += i7;
            }
        }
        return i5;
    }

    /* access modifiers changed from: package-private */
    public final rsnIncAllocationCreateTyped IconCompatParcelizer() {
        return rsnIncAllocationCreateTyped.EAN_8;
    }
}
