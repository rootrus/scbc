package org.bouncycastle.crypto.params;

import com.google.common.base.Ascii;
import net.p088sf.scuba.smartcards.ISO7816;

public class DESParameters extends KeyParameter {
    public static final int DES_KEY_LENGTH = 8;
    private static byte[] DES_weak_keys = {1, 1, 1, 1, 1, 1, 1, 1, Ascii.f3259US, Ascii.f3259US, Ascii.f3259US, Ascii.f3259US, 14, 14, 14, 14, ISO7816.INS_CREATE_FILE, ISO7816.INS_CREATE_FILE, ISO7816.INS_CREATE_FILE, ISO7816.INS_CREATE_FILE, -15, -15, -15, -15, -2, -2, -2, -2, -2, -2, -2, -2, 1, -2, 1, -2, 1, -2, 1, -2, Ascii.f3259US, ISO7816.INS_CREATE_FILE, Ascii.f3259US, ISO7816.INS_CREATE_FILE, 14, -15, 14, -15, 1, ISO7816.INS_CREATE_FILE, 1, ISO7816.INS_CREATE_FILE, 1, -15, 1, -15, Ascii.f3259US, -2, Ascii.f3259US, -2, 14, -2, 14, -2, 1, Ascii.f3259US, 1, Ascii.f3259US, 1, 14, 1, 14, ISO7816.INS_CREATE_FILE, -2, ISO7816.INS_CREATE_FILE, -2, -15, -2, -15, -2, -2, 1, -2, 1, -2, 1, -2, 1, ISO7816.INS_CREATE_FILE, Ascii.f3259US, ISO7816.INS_CREATE_FILE, Ascii.f3259US, -15, 14, -15, 14, ISO7816.INS_CREATE_FILE, 1, ISO7816.INS_CREATE_FILE, 1, -15, 1, -15, 1, -2, Ascii.f3259US, -2, Ascii.f3259US, -2, 14, -2, 14, Ascii.f3259US, 1, Ascii.f3259US, 1, 14, 1, 14, 1, -2, ISO7816.INS_CREATE_FILE, -2, ISO7816.INS_CREATE_FILE, -2, -15, -2, -15};
    private static final int N_DES_WEAK_KEYS = 16;

    public DESParameters(byte[] bArr) {
        super(bArr);
        if (isWeakKey(bArr, 0)) {
            throw new IllegalArgumentException("attempt to create weak DES key");
        }
    }

    public static boolean isWeakKey(byte[] bArr, int i) {
        if (bArr.length - i >= 8) {
            int i2 = 0;
            while (i2 < 16) {
                int i3 = 0;
                while (i3 < 8) {
                    if (bArr[i3 + i] != DES_weak_keys[(i2 << 3) + i3]) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("key material too short.");
    }

    public static void setOddParity(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            bArr[i] = (byte) ((b & 254) | ((((b >> 7) ^ ((((((b >> 1) ^ (b >> 2)) ^ (b >> 3)) ^ (b >> 4)) ^ (b >> 5)) ^ (b >> 6))) ^ 1) & 1));
        }
    }
}
