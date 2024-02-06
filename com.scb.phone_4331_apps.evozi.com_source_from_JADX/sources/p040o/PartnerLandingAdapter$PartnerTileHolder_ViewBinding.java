package p040o;

/* renamed from: o.PartnerLandingAdapter$PartnerTileHolder_ViewBinding */
public final class PartnerLandingAdapter$PartnerTileHolder_ViewBinding {
    private static final byte[] MediaBrowserCompat$ItemReceiver = PinChangeSuccessActivity.read("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").IconCompatParcelizer;

    static {
        C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver = SCBUniversalWebViewActivity_ViewBinding.write;
        onGetStartedClick.write((Object) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", "$receiver");
        C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver2 = SCBUniversalWebViewActivity_ViewBinding.write;
        onGetStartedClick.write((Object) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", "$receiver");
        PinChangeSuccessActivity.read("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    }

    public static final byte[] write(String str) {
        int i;
        String str2 = str;
        onGetStartedClick.write((Object) str2, "$receiver");
        int length = str.length();
        while (length > 0 && ((r6 = str2.charAt(length - 1)) == '=' || r6 == 10 || r6 == 13 || r6 == ' ' || r6 == 9)) {
            length--;
        }
        int i2 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = str2.charAt(i6);
            if ('A' <= charAt && 'Z' >= charAt) {
                i = charAt - 'A';
            } else if ('a' <= charAt && 'z' >= charAt) {
                i = charAt - 'G';
            } else if ('0' <= charAt && '9' >= charAt) {
                i = charAt + 4;
            } else if (charAt == '+' || charAt == '-') {
                i = 62;
            } else if (charAt == '/' || charAt == '_') {
                i = 63;
            } else {
                if (!(charAt == 10 || charAt == 13 || charAt == ' ' || charAt == 9)) {
                    return null;
                }
            }
            i4 = (i4 << 6) | i;
            i3++;
            if (i3 % 4 == 0) {
                int i7 = i5 + 1;
                bArr[i5] = (byte) (i4 >> 16);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (i4 >> 8);
                bArr[i8] = (byte) i4;
                i5 = i8 + 1;
            }
        }
        int i9 = i3 % 4;
        if (i9 == 1) {
            return null;
        }
        if (i9 == 2) {
            bArr[i5] = (byte) ((i4 << 12) >> 16);
            i5++;
        } else if (i9 == 3) {
            int i10 = i4 << 6;
            int i11 = i5 + 1;
            bArr[i5] = (byte) (i10 >> 16);
            i5 = i11 + 1;
            bArr[i11] = (byte) (i10 >> 8);
        }
        if (i5 == i2) {
            return bArr;
        }
        byte[] bArr2 = new byte[i5];
        onGetStartedClick.write((Object) bArr, "src");
        onGetStartedClick.write((Object) bArr2, "dest");
        System.arraycopy(bArr, 0, bArr2, 0, i5);
        return bArr2;
    }

    public static /* synthetic */ String MediaBrowserCompat$ItemReceiver(byte[] bArr) {
        byte[] bArr2 = MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) bArr, "$receiver");
        onGetStartedClick.write((Object) bArr2, "map");
        byte[] bArr3 = new byte[(((bArr.length + 2) / 3) << 2)];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            byte b3 = bArr[i4];
            int i5 = i2 + 1;
            bArr3[i2] = bArr2[(b & 255) >> 2];
            int i6 = i5 + 1;
            bArr3[i5] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i7 = i6 + 1;
            bArr3[i6] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 = i7 + 1;
            bArr3[i7] = bArr2[b3 & 63];
            i = i4 + 1;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            int i8 = i2 + 1;
            bArr3[i2] = bArr2[(b4 & 255) >> 2];
            int i9 = i8 + 1;
            bArr3[i8] = bArr2[(b4 & 3) << 4];
            bArr3[i9] = 61;
            bArr3[i9 + 1] = 61;
        } else if (length2 == 2) {
            byte b5 = bArr[i];
            byte b6 = bArr[i + 1];
            int i10 = i2 + 1;
            bArr3[i2] = bArr2[(b5 & 255) >> 2];
            int i11 = i10 + 1;
            bArr3[i10] = bArr2[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i11] = bArr2[(b6 & 15) << 2];
            bArr3[i11 + 1] = 61;
        }
        onGetStartedClick.write((Object) bArr3, "$receiver");
        return new String(bArr3, GroupFavoriteActivity.IconCompatParcelizer);
    }
}
