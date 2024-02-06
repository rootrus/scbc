package com.migcomponents.migbase64;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Base64IO {

    /* renamed from: CA */
    private static final byte[] f5365CA = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".getBytes();
    private static final byte EQUAL = 61;
    private static final int _6_BIT = 63;
    private static final int _8_BIT = 255;

    public static final void encode(InputStream inputStream, OutputStream outputStream, boolean z) throws IOException {
        OutputStream outputStream2 = outputStream;
        int i = 98304;
        byte[] bArr = new byte[98304];
        byte[] bArr2 = new byte[78];
        int i2 = 98304;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        while (true) {
            int read = inputStream.read(bArr, i3, i - i3);
            if (read == -1) {
                int i6 = i3 % 3;
                i4 = i6;
                i2 = i3 - i6;
            } else {
                i3 += read;
                if (i3 != i) {
                    continue;
                }
            }
            int i7 = 0;
            int i8 = 0;
            while (i7 < i2) {
                if (z2) {
                    int i9 = i8 + 1;
                    bArr2[i8] = 13;
                    i8 = i9 + 1;
                    bArr2[i9] = 10;
                    z2 = false;
                }
                int i10 = i7 + 1;
                int i11 = i10 + 1;
                int i12 = i11 + 1;
                byte b = ((bArr[i7] & 255) << 16) | ((bArr[i10] & 255) << 8) | (bArr[i11] & 255);
                i8 += 4;
                int i13 = i8 - 1;
                byte[] bArr3 = f5365CA;
                bArr2[i13] = bArr3[b & 63];
                int i14 = i13 - 1;
                int i15 = b >>> 6;
                bArr2[i14] = bArr3[i15 & 63];
                int i16 = i14 - 1;
                int i17 = i15 >>> 6;
                bArr2[i16] = bArr3[i17 & 63];
                bArr2[i16 - 1] = bArr3[(i17 >>> 6) & 63];
                i5++;
                if (i5 == 19) {
                    outputStream2.write(bArr2, 0, i8);
                    i5 = 0;
                    i8 = 0;
                    if (z) {
                        z2 = true;
                    }
                }
                i7 = i12;
            }
            outputStream2.write(bArr2, 0, i8);
            if (i4 > 0) {
                int i18 = (i4 == 2 ? (bArr[i3 - 1] & 255) << 2 : 0) | ((bArr[i2] & 255) << 10);
                byte b2 = EQUAL;
                bArr2[3] = EQUAL;
                if (i4 == 2) {
                    b2 = f5365CA[i18 & 63];
                }
                bArr2[2] = b2;
                byte[] bArr4 = f5365CA;
                int i19 = i18 >>> 6;
                bArr2[1] = bArr4[i19 & 63];
                bArr2[0] = bArr4[i19 >> 6];
                outputStream2.write(bArr2, 0, 4);
            }
            if (read != -1) {
                i3 = 0;
                i = 98304;
            } else {
                return;
            }
        }
    }
}
