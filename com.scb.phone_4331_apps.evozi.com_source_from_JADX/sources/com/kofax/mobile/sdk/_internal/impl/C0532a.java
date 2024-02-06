package com.kofax.mobile.sdk._internal.impl;

import com.kofax.mobile.sdk._internal.C0494a;

/* renamed from: com.kofax.mobile.sdk._internal.impl.a */
public class C0532a implements C0494a {
    /* renamed from: a */
    public byte[] mo11135a(int[] iArr, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        int i5 = i3 * i4;
        byte[] bArr = new byte[((i5 * 3) / 2)];
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            while (i9 < i3) {
                int i10 = 255;
                int i11 = (iArr[i7] >> 16) & 255;
                int i12 = (iArr[i7] >> 8) & 255;
                int i13 = iArr[i7] & 255;
                int i14 = (((((i11 * 66) + (i12 * 129)) + (i13 * 25)) + 128) >> 8) + 16;
                int i15 = (((((i11 * -38) - (i12 * 74)) + (i13 * 112)) + 128) >> 8) + 128;
                int i16 = (((((i11 * 112) - (i12 * 94)) - (i13 * 18)) + 128) >> 8) + 128;
                if (i14 < 0) {
                    i14 = 0;
                } else if (i14 > 255) {
                    i14 = 255;
                }
                bArr[i6] = (byte) i14;
                if (i8 % 2 == 0 && i7 % 2 == 0) {
                    int i17 = i5 + 1;
                    if (i16 < 0) {
                        i16 = 0;
                    } else if (i16 > 255) {
                        i16 = 255;
                    }
                    bArr[i5] = (byte) i16;
                    i5 = i17 + 1;
                    if (i15 < 0) {
                        i10 = 0;
                    } else if (i15 <= 255) {
                        i10 = i15;
                    }
                    bArr[i17] = (byte) i10;
                }
                i7++;
                i9++;
                i6++;
            }
        }
        return bArr;
    }
}
