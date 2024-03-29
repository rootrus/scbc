package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;
import net.p088sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.crypto.InvalidCipherTextException;

public class ISO7816d4Padding implements BlockCipherPadding {
    public int addPadding(byte[] bArr, int i) {
        int length = bArr.length;
        bArr[i] = ISOFileInfo.DATA_BYTES1;
        int i2 = i;
        while (true) {
            i2++;
            if (i2 >= bArr.length) {
                return length - i;
            }
            bArr[i2] = 0;
        }
    }

    public String getPaddingName() {
        return "ISO7816-4";
    }

    public void init(SecureRandom secureRandom) throws IllegalArgumentException {
    }

    public int padCount(byte[] bArr) throws InvalidCipherTextException {
        int length = bArr.length - 1;
        while (length > 0 && bArr[length] == 0) {
            length--;
        }
        if (bArr[length] == Byte.MIN_VALUE) {
            return bArr.length - length;
        }
        throw new InvalidCipherTextException("pad block corrupted");
    }
}
