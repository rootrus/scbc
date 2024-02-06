package p040o;

import net.p088sf.scuba.smartcards.ISOFileInfo;

/* renamed from: o.SetupQuickTopUpActivity */
public class SetupQuickTopUpActivity {
    private static byte[] MediaBrowserCompat$ItemReceiver = new byte[64];
    private static byte[] write = new byte[255];

    static {
        int i;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < 255; i4++) {
            write[i4] = -1;
        }
        for (int i5 = 90; i5 >= 65; i5--) {
            write[i5] = (byte) (i5 - 65);
        }
        int i6 = 122;
        while (true) {
            i = 26;
            if (i6 < 97) {
                break;
            }
            write[i6] = (byte) ((i6 - 97) + 26);
            i6--;
        }
        int i7 = 57;
        while (true) {
            i2 = 52;
            if (i7 < 48) {
                break;
            }
            write[i7] = (byte) ((i7 - 48) + 52);
            i7--;
        }
        byte[] bArr = write;
        bArr[43] = 62;
        bArr[47] = 63;
        for (int i8 = 0; i8 <= 25; i8++) {
            MediaBrowserCompat$ItemReceiver[i8] = (byte) (i8 + 65);
        }
        int i9 = 0;
        while (i <= 51) {
            MediaBrowserCompat$ItemReceiver[i] = (byte) (i9 + 97);
            i++;
            i9++;
        }
        while (i2 <= 61) {
            MediaBrowserCompat$ItemReceiver[i2] = (byte) (i3 + 48);
            i2++;
            i3++;
        }
        byte[] bArr2 = MediaBrowserCompat$ItemReceiver;
        bArr2[62] = 43;
        bArr2[63] = 47;
    }

    public static byte[] read(byte[] bArr) {
        return MediaBrowserCompat$CustomActionResultReceiver(bArr);
    }

    private static byte[] MediaBrowserCompat$CustomActionResultReceiver(byte[] bArr) {
        int length = bArr.length << 3;
        int i = length % 24;
        int i2 = length / 24;
        byte[] bArr2 = new byte[(i != 0 ? (i2 + 1) << 2 : i2 << 2)];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i3 * 3;
            byte b = bArr[i5];
            byte b2 = bArr[i5 + 1];
            byte b3 = bArr[i5 + 2];
            byte b4 = (byte) (b2 & 15);
            byte b5 = (byte) (b & 3);
            int i6 = b >> 2;
            if ((b & ISOFileInfo.DATA_BYTES1) != 0) {
                i6 ^= 192;
            }
            byte b6 = (byte) i6;
            int i7 = b2 >> 4;
            if ((b2 & ISOFileInfo.DATA_BYTES1) != 0) {
                i7 ^= 240;
            }
            byte b7 = (byte) i7;
            int i8 = b3 >> 6;
            if ((b3 & ISOFileInfo.DATA_BYTES1) != 0) {
                i8 ^= 252;
            }
            byte[] bArr3 = MediaBrowserCompat$ItemReceiver;
            bArr2[i4] = bArr3[b6];
            bArr2[i4 + 1] = bArr3[b7 | (b5 << 4)];
            bArr2[i4 + 2] = bArr3[(b4 << 2) | ((byte) i8)];
            bArr2[i4 + 3] = bArr3[b3 & 63];
            i4 += 4;
            i3++;
        }
        int i9 = i3 * 3;
        if (i == 8) {
            byte b8 = bArr[i9];
            byte b9 = (byte) (b8 & 3);
            int i10 = b8 >> 2;
            if ((b8 & ISOFileInfo.DATA_BYTES1) != 0) {
                i10 ^= 192;
            }
            byte b10 = (byte) i10;
            byte[] bArr4 = MediaBrowserCompat$ItemReceiver;
            bArr2[i4] = bArr4[b10];
            bArr2[i4 + 1] = bArr4[b9 << 4];
            bArr2[i4 + 2] = 61;
            bArr2[i4 + 3] = 61;
        } else if (i == 16) {
            byte b11 = bArr[i9];
            byte b12 = bArr[i9 + 1];
            byte b13 = (byte) (b12 & 15);
            byte b14 = (byte) (b11 & 3);
            int i11 = b11 >> 2;
            if ((b11 & ISOFileInfo.DATA_BYTES1) != 0) {
                i11 ^= 192;
            }
            byte b15 = (byte) i11;
            int i12 = b12 >> 4;
            if ((b12 & ISOFileInfo.DATA_BYTES1) != 0) {
                i12 ^= 240;
            }
            byte b16 = (byte) i12;
            byte[] bArr5 = MediaBrowserCompat$ItemReceiver;
            bArr2[i4] = bArr5[b15];
            bArr2[i4 + 1] = bArr5[b16 | (b14 << 4)];
            bArr2[i4 + 2] = bArr5[b13 << 2];
            bArr2[i4 + 3] = 61;
        }
        return bArr2;
    }

    public static byte[] IconCompatParcelizer(byte[] bArr) {
        return MediaBrowserCompat$CustomActionResultReceiver(bArr);
    }

    public static byte[] MediaBrowserCompat$ItemReceiver(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i >= bArr.length) {
                break;
            }
            byte b = bArr[i];
            if (b != 61 && write[b] == -1) {
                z = false;
            }
            if (z) {
                bArr2[i2] = bArr[i];
                i2++;
            }
            i++;
        }
        byte[] bArr3 = new byte[i2];
        System.arraycopy(bArr2, 0, bArr3, 0, i2);
        if (i2 == 0) {
            return new byte[0];
        }
        int i3 = i2 / 4;
        while (true) {
            int i4 = i2 - 1;
            if (bArr3[i4] != 61) {
                byte[] bArr4 = new byte[(i2 - i3)];
                int i5 = 0;
                for (int i6 = 0; i6 < i3; i6++) {
                    int i7 = i6 << 2;
                    byte b2 = bArr3[i7 + 2];
                    byte b3 = bArr3[i7 + 3];
                    byte[] bArr5 = write;
                    byte b4 = bArr5[bArr3[i7]];
                    byte b5 = bArr5[bArr3[i7 + 1]];
                    if (b2 != 61 && b3 != 61) {
                        byte b6 = bArr5[b2];
                        byte b7 = bArr5[b3];
                        bArr4[i5] = (byte) ((b4 << 2) | (b5 >> 4));
                        bArr4[i5 + 1] = (byte) (((b5 & 15) << 4) | ((b6 >> 2) & 15));
                        bArr4[i5 + 2] = (byte) ((b6 << 6) | b7);
                    } else if (b2 == 61) {
                        bArr4[i5] = (byte) ((b5 >> 4) | (b4 << 2));
                    } else if (b3 == 61) {
                        byte b8 = write[b2];
                        bArr4[i5] = (byte) ((b4 << 2) | (b5 >> 4));
                        bArr4[i5 + 1] = (byte) (((b5 & 15) << 4) | ((b8 >> 2) & 15));
                    }
                    i5 += 3;
                }
                return bArr4;
            } else if (i4 == 0) {
                return new byte[0];
            } else {
                i2 = i4;
            }
        }
    }
}
