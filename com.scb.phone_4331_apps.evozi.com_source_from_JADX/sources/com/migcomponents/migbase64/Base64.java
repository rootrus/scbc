package com.migcomponents.migbase64;

import com.google.common.base.Ascii;
import java.util.Arrays;

public class Base64 {

    /* renamed from: CA */
    private static final char[] f2427CA = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();

    /* renamed from: IA */
    private static final int[] f2428IA;

    static {
        int[] iArr = new int[256];
        f2428IA = iArr;
        Arrays.fill(iArr, -1);
        int length = f2427CA.length;
        for (int i = 0; i < length; i++) {
            f2428IA[f2427CA[i]] = i;
        }
        f2428IA[61] = 0;
    }

    public static final char[] encodeToChar(byte[] bArr, boolean z) {
        byte[] bArr2 = bArr;
        int i = 0;
        int length = bArr2 != null ? bArr2.length : 0;
        if (length == 0) {
            return new char[0];
        }
        int i2 = (length / 3) * 3;
        int i3 = length - 1;
        int i4 = ((i3 / 3) + 1) << 2;
        int i5 = i4 + (z ? ((i4 - 1) / 76) << 1 : 0);
        char[] cArr = new char[i5];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < i2) {
            int i9 = i6 + 1;
            int i10 = i9 + 1;
            byte b = ((bArr2[i6] & 255) << 16) | ((bArr2[i9] & 255) << 8) | (bArr2[i10] & 255);
            int i11 = i7 + 1;
            char[] cArr2 = f2427CA;
            cArr[i7] = cArr2[(b >>> Ascii.DC2) & 63];
            int i12 = i11 + 1;
            cArr[i11] = cArr2[(b >>> 12) & 63];
            int i13 = i12 + 1;
            cArr[i12] = cArr2[(b >>> 6) & 63];
            i7 = i13 + 1;
            cArr[i13] = cArr2[b & 63];
            if (z && (i8 = i8 + 1) == 19 && i7 < i5 - 2) {
                int i14 = i7 + 1;
                cArr[i7] = 13;
                i7 = i14 + 1;
                cArr[i14] = 10;
                i8 = 0;
            }
            i6 = i10 + 1;
        }
        int i15 = length - i2;
        if (i15 > 0) {
            byte b2 = bArr2[i2];
            if (i15 == 2) {
                i = (bArr2[i3] & 255) << 2;
            }
            int i16 = ((b2 & 255) << 10) | i;
            char[] cArr3 = f2427CA;
            cArr[i5 - 4] = cArr3[i16 >> 12];
            cArr[i5 - 3] = cArr3[(i16 >>> 6) & 63];
            cArr[i5 - 2] = i15 == 2 ? cArr3[i16 & 63] : '=';
            cArr[i5 - 1] = '=';
        }
        return cArr;
    }

    public static final byte[] decode(char[] cArr) {
        int length = cArr != null ? cArr.length : 0;
        if (length == 0) {
            return new byte[0];
        }
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (f2428IA[cArr[i2]] < 0) {
                i++;
            }
        }
        int i3 = length - i;
        if (i3 % 4 != 0) {
            return null;
        }
        int i4 = 0;
        while (length > 1) {
            length--;
            if (f2428IA[cArr[length]] > 0) {
                break;
            } else if (cArr[length] == '=') {
                i4++;
            }
        }
        int i5 = ((i3 * 6) >> 3) - i4;
        byte[] bArr = new byte[i5];
        int i6 = 0;
        int i7 = 0;
        while (i6 < i5) {
            int i8 = 0;
            int i9 = 0;
            while (i8 < 4) {
                int i10 = f2428IA[cArr[i7]];
                if (i10 >= 0) {
                    i9 |= i10 << (18 - (i8 * 6));
                } else {
                    i8--;
                }
                i8++;
                i7++;
            }
            int i11 = i6 + 1;
            bArr[i6] = (byte) (i9 >> 16);
            if (i11 < i5) {
                i6 = i11 + 1;
                bArr[i11] = (byte) (i9 >> 8);
                if (i6 < i5) {
                    i11 = i6 + 1;
                    bArr[i6] = (byte) i9;
                }
            }
            i6 = i11;
        }
        return bArr;
    }

    public static final byte[] decodeFast(char[] cArr) {
        int i;
        char[] cArr2 = cArr;
        int length = cArr2.length;
        int i2 = 0;
        if (length == 0) {
            return new byte[0];
        }
        int i3 = length - 1;
        int i4 = 0;
        while (i4 < i3 && f2428IA[cArr2[i4]] < 0) {
            i4++;
        }
        while (i3 > 0 && f2428IA[cArr2[i3]] < 0) {
            i3--;
        }
        int i5 = cArr2[i3] == '=' ? cArr2[i3 + -1] == '=' ? 2 : 1 : 0;
        int i6 = (i3 - i4) + 1;
        if (length > 76) {
            i = (cArr2[76] == 13 ? i6 / 78 : 0) << 1;
        } else {
            i = 0;
        }
        int i7 = (((i6 - i) * 6) >> 3) - i5;
        byte[] bArr = new byte[i7];
        int i8 = i7 / 3;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i8 * 3) {
            int[] iArr = f2428IA;
            int i11 = i4 + 1;
            int i12 = i11 + 1;
            int i13 = i12 + 1;
            int i14 = i13 + 1;
            int i15 = (iArr[cArr2[i4]] << 18) | (iArr[cArr2[i11]] << 12) | (iArr[cArr2[i12]] << 6) | iArr[cArr2[i13]];
            int i16 = i9 + 1;
            bArr[i9] = (byte) (i15 >> 16);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (i15 >> 8);
            bArr[i17] = (byte) i15;
            if (i > 0 && (i10 = i10 + 1) == 19) {
                i14 += 2;
                i10 = 0;
            }
            i4 = i14;
            i9 = i17 + 1;
        }
        if (i9 < i7) {
            int i18 = 0;
            while (i4 <= i3 - i5) {
                i2 |= f2428IA[cArr2[i4]] << (18 - (i18 * 6));
                i18++;
                i4++;
            }
            int i19 = 16;
            while (i9 < i7) {
                bArr[i9] = (byte) (i2 >> i19);
                i19 -= 8;
                i9++;
            }
        }
        return bArr;
    }

    public static final byte[] encodeToByte(byte[] bArr, boolean z) {
        return encodeToByte(bArr, 0, bArr != null ? bArr.length : 0, z);
    }

    public static final byte[] encodeToByte(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        int i4 = 0;
        if (bArr == null || i2 == 0) {
            return new byte[0];
        }
        int i5 = (i2 / 3) * 3;
        int i6 = (((i2 - 1) / 3) + 1) << 2;
        int i7 = i6 + (z ? ((i6 - 1) / 76) << 1 : 0);
        byte[] bArr2 = new byte[i7];
        int i8 = i;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i3 = i + i5;
            if (i8 >= i3) {
                break;
            }
            int i11 = i8 + 1;
            int i12 = i11 + 1;
            byte b = ((bArr[i8] & 255) << 16) | ((bArr[i11] & 255) << 8) | (bArr[i12] & 255);
            int i13 = i9 + 1;
            char[] cArr = f2427CA;
            bArr2[i9] = (byte) cArr[(b >>> Ascii.DC2) & 63];
            int i14 = i13 + 1;
            bArr2[i13] = (byte) cArr[(b >>> 12) & 63];
            int i15 = i14 + 1;
            bArr2[i14] = (byte) cArr[(b >>> 6) & 63];
            i9 = i15 + 1;
            bArr2[i15] = (byte) cArr[b & 63];
            if (z && (i10 = i10 + 1) == 19 && i9 < i7 - 2) {
                int i16 = i9 + 1;
                bArr2[i9] = 13;
                i9 = i16 + 1;
                bArr2[i16] = 10;
                i10 = 0;
            }
            i8 = i12 + 1;
        }
        int i17 = i2 - i5;
        if (i17 > 0) {
            byte b2 = bArr[i3];
            if (i17 == 2) {
                i4 = (bArr[(i + i2) - 1] & 255) << 2;
            }
            int i18 = i4 | ((b2 & 255) << 10);
            char[] cArr2 = f2427CA;
            bArr2[i7 - 4] = (byte) cArr2[i18 >> 12];
            bArr2[i7 - 3] = (byte) cArr2[(i18 >>> 6) & 63];
            bArr2[i7 - 2] = i17 == 2 ? (byte) cArr2[i18 & 63] : 61;
            bArr2[i7 - 1] = 61;
        }
        return bArr2;
    }

    public static final byte[] decode(byte[] bArr) {
        return decode(bArr, 0, bArr.length);
    }

    public static final byte[] decode(byte[] bArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (f2428IA[bArr[i + i4] & 255] < 0) {
                i3++;
            }
        }
        int i5 = i2 - i3;
        if (i5 % 4 != 0) {
            return null;
        }
        int i6 = 0;
        while (i2 > 1) {
            i2--;
            int i7 = i + i2;
            if (f2428IA[bArr[i7] & 255] > 0) {
                break;
            } else if (bArr[i7] == 61) {
                i6++;
            }
        }
        int i8 = ((i5 * 6) >> 3) - i6;
        byte[] bArr2 = new byte[i8];
        int i9 = 0;
        int i10 = 0;
        while (i9 < i8) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < 4) {
                int i13 = f2428IA[bArr[i10 + i] & 255];
                if (i13 >= 0) {
                    i12 |= i13 << (18 - (i11 * 6));
                } else {
                    i11--;
                }
                i11++;
                i10++;
            }
            int i14 = i9 + 1;
            bArr2[i9] = (byte) (i12 >> 16);
            if (i14 < i8) {
                i9 = i14 + 1;
                bArr2[i14] = (byte) (i12 >> 8);
                if (i9 < i8) {
                    i14 = i9 + 1;
                    bArr2[i9] = (byte) i12;
                }
            }
            i9 = i14;
        }
        return bArr2;
    }

    public static final byte[] decodeFast(byte[] bArr) {
        int i;
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        int i2 = 0;
        if (length == 0) {
            return new byte[0];
        }
        int i3 = length - 1;
        int i4 = 0;
        while (i4 < i3 && f2428IA[bArr2[i4] & 255] < 0) {
            i4++;
        }
        while (i3 > 0 && f2428IA[bArr2[i3] & 255] < 0) {
            i3--;
        }
        int i5 = bArr2[i3] == 61 ? bArr2[i3 + -1] == 61 ? 2 : 1 : 0;
        int i6 = (i3 - i4) + 1;
        if (length > 76) {
            i = (bArr2[76] == 13 ? i6 / 78 : 0) << 1;
        } else {
            i = 0;
        }
        int i7 = (((i6 - i) * 6) >> 3) - i5;
        byte[] bArr3 = new byte[i7];
        int i8 = i7 / 3;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i8 * 3) {
            int[] iArr = f2428IA;
            int i11 = i4 + 1;
            int i12 = i11 + 1;
            int i13 = i12 + 1;
            int i14 = i13 + 1;
            int i15 = (iArr[bArr2[i4]] << 18) | (iArr[bArr2[i11]] << 12) | (iArr[bArr2[i12]] << 6) | iArr[bArr2[i13]];
            int i16 = i9 + 1;
            bArr3[i9] = (byte) (i15 >> 16);
            int i17 = i16 + 1;
            bArr3[i16] = (byte) (i15 >> 8);
            bArr3[i17] = (byte) i15;
            if (i > 0 && (i10 = i10 + 1) == 19) {
                i14 += 2;
                i10 = 0;
            }
            i4 = i14;
            i9 = i17 + 1;
        }
        if (i9 < i7) {
            int i18 = 0;
            while (i4 <= i3 - i5) {
                i2 |= f2428IA[bArr2[i4]] << (18 - (i18 * 6));
                i18++;
                i4++;
            }
            int i19 = 16;
            while (i9 < i7) {
                bArr3[i9] = (byte) (i2 >> i19);
                i19 -= 8;
                i9++;
            }
        }
        return bArr3;
    }

    public static final String encodeToString(byte[] bArr, boolean z) {
        return new String(encodeToChar(bArr, z));
    }

    public static final byte[] decode(String str) {
        int length = str != null ? str.length() : 0;
        if (length == 0) {
            return new byte[0];
        }
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (f2428IA[str.charAt(i2)] < 0) {
                i++;
            }
        }
        int i3 = length - i;
        if (i3 % 4 != 0) {
            return null;
        }
        int i4 = 0;
        while (length > 1) {
            length--;
            if (f2428IA[str.charAt(length)] > 0) {
                break;
            } else if (str.charAt(length) == '=') {
                i4++;
            }
        }
        int i5 = ((i3 * 6) >> 3) - i4;
        byte[] bArr = new byte[i5];
        int i6 = 0;
        int i7 = 0;
        while (i6 < i5) {
            int i8 = 0;
            int i9 = 0;
            while (i8 < 4) {
                int i10 = f2428IA[str.charAt(i7)];
                if (i10 >= 0) {
                    i9 |= i10 << (18 - (i8 * 6));
                } else {
                    i8--;
                }
                i8++;
                i7++;
            }
            int i11 = i6 + 1;
            bArr[i6] = (byte) (i9 >> 16);
            if (i11 < i5) {
                i6 = i11 + 1;
                bArr[i11] = (byte) (i9 >> 8);
                if (i6 < i5) {
                    i11 = i6 + 1;
                    bArr[i6] = (byte) i9;
                }
            }
            i6 = i11;
        }
        return bArr;
    }

    public static final byte[] decodeFast(String str) {
        int i;
        String str2 = str;
        int length = str.length();
        int i2 = 0;
        if (length == 0) {
            return new byte[0];
        }
        int i3 = length - 1;
        int i4 = 0;
        while (i4 < i3 && f2428IA[str2.charAt(i4) & 255] < 0) {
            i4++;
        }
        while (i3 > 0 && f2428IA[str2.charAt(i3) & 255] < 0) {
            i3--;
        }
        int i5 = str2.charAt(i3) == '=' ? str2.charAt(i3 + -1) == '=' ? 2 : 1 : 0;
        int i6 = (i3 - i4) + 1;
        if (length > 76) {
            i = (str2.charAt(76) == 13 ? i6 / 78 : 0) << 1;
        } else {
            i = 0;
        }
        int i7 = (((i6 - i) * 6) >> 3) - i5;
        byte[] bArr = new byte[i7];
        int i8 = i7 / 3;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i8 * 3) {
            int i11 = i4 + 1;
            int i12 = i11 + 1;
            int i13 = i12 + 1;
            int i14 = i13 + 1;
            int i15 = (f2428IA[str2.charAt(i4)] << 18) | (f2428IA[str2.charAt(i11)] << 12) | (f2428IA[str2.charAt(i12)] << 6) | f2428IA[str2.charAt(i13)];
            int i16 = i9 + 1;
            bArr[i9] = (byte) (i15 >> 16);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (i15 >> 8);
            bArr[i17] = (byte) i15;
            if (i > 0 && (i10 = i10 + 1) == 19) {
                i14 += 2;
                i10 = 0;
            }
            i4 = i14;
            i9 = i17 + 1;
        }
        if (i9 < i7) {
            int i18 = 0;
            while (i4 <= i3 - i5) {
                i2 |= f2428IA[str2.charAt(i4)] << (18 - (i18 * 6));
                i18++;
                i4++;
            }
            int i19 = 16;
            while (i9 < i7) {
                bArr[i9] = (byte) (i2 >> i19);
                i19 -= 8;
                i9++;
            }
        }
        return bArr;
    }
}
