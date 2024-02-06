package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.KDFParameters;

public class BrokenKDF2BytesGenerator implements DerivationFunction {
    private Digest digest;

    /* renamed from: iv */
    private byte[] f6131iv;
    private byte[] shared;

    public BrokenKDF2BytesGenerator(Digest digest2) {
        this.digest = digest2;
    }

    public int generateBytes(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        if (bArr.length - i2 >= i) {
            long j = (long) (i2 << 3);
            if (j > ((long) (this.digest.getDigestSize() << 3)) * 29) {
                new IllegalArgumentException("Output length to large");
            }
            int digestSize = (int) (j / ((long) this.digest.getDigestSize()));
            int digestSize2 = this.digest.getDigestSize();
            byte[] bArr2 = new byte[digestSize2];
            for (int i3 = 1; i3 <= digestSize; i3++) {
                Digest digest2 = this.digest;
                byte[] bArr3 = this.shared;
                digest2.update(bArr3, 0, bArr3.length);
                this.digest.update((byte) i3);
                this.digest.update((byte) (i3 >> 8));
                this.digest.update((byte) (i3 >> 16));
                this.digest.update((byte) (i3 >>> 24));
                Digest digest3 = this.digest;
                byte[] bArr4 = this.f6131iv;
                digest3.update(bArr4, 0, bArr4.length);
                this.digest.doFinal(bArr2, 0);
                int i4 = i2 - i;
                if (i4 > digestSize2) {
                    System.arraycopy(bArr2, 0, bArr, i, digestSize2);
                    i += digestSize2;
                } else {
                    System.arraycopy(bArr2, 0, bArr, i, i4);
                }
            }
            this.digest.reset();
            return i2;
        }
        throw new DataLengthException("output buffer too small");
    }

    public Digest getDigest() {
        return this.digest;
    }

    public void init(DerivationParameters derivationParameters) {
        if (derivationParameters instanceof KDFParameters) {
            KDFParameters kDFParameters = (KDFParameters) derivationParameters;
            this.shared = kDFParameters.getSharedSecret();
            this.f6131iv = kDFParameters.getIV();
            return;
        }
        throw new IllegalArgumentException("KDF parameters required for generator");
    }
}
