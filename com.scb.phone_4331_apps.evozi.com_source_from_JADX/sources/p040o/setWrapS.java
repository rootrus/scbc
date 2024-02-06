package p040o;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import p039io.beid.beidk.definitions.LivenessStatus;

/* renamed from: o.setWrapS */
public final class setWrapS extends setMinification {
    static final int[][] MediaBrowserCompat$ItemReceiver = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};
    private static final int[] MediaBrowserCompat$SearchResultReceiver = {1, 1, 1, 1, 1, 1};
    private final int[] RatingCompat = new int[4];

    /* access modifiers changed from: protected */
    public final int read(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.RatingCompat;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int i = rsnscriptintrinsiccreate.read;
        int i2 = iArr[1];
        int i3 = 0;
        for (int i4 = 0; i4 < 6 && i2 < i; i4++) {
            int IconCompatParcelizer = IconCompatParcelizer(rsnscriptintrinsiccreate, iArr2, i2, read);
            sb.append((char) ((IconCompatParcelizer % 10) + 48));
            for (int i5 : iArr2) {
                i2 += i5;
            }
            if (IconCompatParcelizer >= 10) {
                i3 |= 1 << (5 - i4);
            }
        }
        for (int i6 = 0; i6 <= 1; i6++) {
            for (int i7 = 0; i7 < 10; i7++) {
                if (i3 == MediaBrowserCompat$ItemReceiver[i6][i7]) {
                    sb.insert(0, (char) (i6 + 48));
                    sb.append((char) (i7 + 48));
                    return i2;
                }
            }
        }
        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
    }

    /* access modifiers changed from: protected */
    public final int[] write(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, int i) throws NotFoundException {
        return write(rsnscriptintrinsiccreate, i, true, MediaBrowserCompat$SearchResultReceiver);
    }

    /* access modifiers changed from: protected */
    public final boolean MediaBrowserCompat$ItemReceiver(String str) throws FormatException {
        return super.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer(str));
    }

    /* access modifiers changed from: package-private */
    public final rsnIncAllocationCreateTyped IconCompatParcelizer() {
        return rsnIncAllocationCreateTyped.UPC_E;
    }

    public static String IconCompatParcelizer(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case '0':
            case '1':
            case '2':
                sb.append(cArr, 0, 2);
                sb.append(c);
                sb.append(LivenessStatus.f5461OK);
                sb.append(cArr, 2, 3);
                break;
            case '3':
                sb.append(cArr, 0, 3);
                sb.append("00000");
                sb.append(cArr, 3, 2);
                break;
            case '4':
                sb.append(cArr, 0, 4);
                sb.append("00000");
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append(LivenessStatus.f5461OK);
                sb.append(c);
                break;
        }
        if (str.length() >= 8) {
            sb.append(str.charAt(7));
        }
        return sb.toString();
    }
}
