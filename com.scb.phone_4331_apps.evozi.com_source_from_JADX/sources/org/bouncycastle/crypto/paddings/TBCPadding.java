package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

public class TBCPadding implements BlockCipherPadding {
    public int addPadding(byte[] bArr, int i) {
        int length = bArr.length;
        byte b = (byte) ((i <= 0 ? (bArr[bArr.length + -1] & 1) == 0 : (bArr[i + -1] & 1) == 0) ? 255 : 0);
        for (int i2 = i; i2 < bArr.length; i2++) {
            bArr[i2] = b;
        }
        return length - i;
    }

    public String getPaddingName() {
        return "TBC";
    }

    public void init(SecureRandom secureRandom) throws IllegalArgumentException {
    }

    public int padCount(byte[] bArr) throws InvalidCipherTextException {
        byte b = bArr[bArr.length - 1];
        int length = bArr.length - 1;
        while (length > 0 && bArr[length - 1] == b) {
            length--;
        }
        return bArr.length - length;
    }
}
