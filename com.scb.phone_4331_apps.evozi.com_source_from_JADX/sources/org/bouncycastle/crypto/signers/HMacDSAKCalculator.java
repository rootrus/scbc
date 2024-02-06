package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

public class HMacDSAKCalculator implements DSAKCalculator {
    private static final BigInteger ZERO = BigInteger.valueOf(0);

    /* renamed from: K */
    private final byte[] f6095K = new byte[this.hMac.getMacSize()];

    /* renamed from: V */
    private final byte[] f6096V;
    private final HMac hMac;

    /* renamed from: n */
    private BigInteger f6097n;

    public HMacDSAKCalculator(Digest digest) {
        HMac hMac2 = new HMac(digest);
        this.hMac = hMac2;
        this.f6096V = new byte[hMac2.getMacSize()];
    }

    private BigInteger bitsToInt(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        return (bArr.length << 3) > this.f6097n.bitLength() ? bigInteger.shiftRight((bArr.length << 3) - this.f6097n.bitLength()) : bigInteger;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f6097n = bigInteger;
        Arrays.fill(this.f6096V, (byte) 1);
        Arrays.fill(this.f6095K, (byte) 0);
        int bitLength = (bigInteger.bitLength() + 7) / 8;
        byte[] bArr2 = new byte[bitLength];
        byte[] asUnsignedByteArray = BigIntegers.asUnsignedByteArray(bigInteger2);
        System.arraycopy(asUnsignedByteArray, 0, bArr2, bitLength - asUnsignedByteArray.length, asUnsignedByteArray.length);
        int bitLength2 = (bigInteger.bitLength() + 7) / 8;
        byte[] bArr3 = new byte[bitLength2];
        BigInteger bitsToInt = bitsToInt(bArr);
        if (bitsToInt.compareTo(bigInteger) >= 0) {
            bitsToInt = bitsToInt.subtract(bigInteger);
        }
        byte[] asUnsignedByteArray2 = BigIntegers.asUnsignedByteArray(bitsToInt);
        System.arraycopy(asUnsignedByteArray2, 0, bArr3, bitLength2 - asUnsignedByteArray2.length, asUnsignedByteArray2.length);
        this.hMac.init(new KeyParameter(this.f6095K));
        HMac hMac2 = this.hMac;
        byte[] bArr4 = this.f6096V;
        hMac2.update(bArr4, 0, bArr4.length);
        this.hMac.update((byte) 0);
        this.hMac.update(bArr2, 0, bitLength);
        this.hMac.update(bArr3, 0, bitLength2);
        this.hMac.doFinal(this.f6095K, 0);
        this.hMac.init(new KeyParameter(this.f6095K));
        HMac hMac3 = this.hMac;
        byte[] bArr5 = this.f6096V;
        hMac3.update(bArr5, 0, bArr5.length);
        this.hMac.doFinal(this.f6096V, 0);
        HMac hMac4 = this.hMac;
        byte[] bArr6 = this.f6096V;
        hMac4.update(bArr6, 0, bArr6.length);
        this.hMac.update((byte) 1);
        this.hMac.update(bArr2, 0, bitLength);
        this.hMac.update(bArr3, 0, bitLength2);
        this.hMac.doFinal(this.f6095K, 0);
        this.hMac.init(new KeyParameter(this.f6095K));
        HMac hMac5 = this.hMac;
        byte[] bArr7 = this.f6096V;
        hMac5.update(bArr7, 0, bArr7.length);
        this.hMac.doFinal(this.f6096V, 0);
    }

    public void init(BigInteger bigInteger, SecureRandom secureRandom) {
        throw new IllegalStateException("Operation not supported");
    }

    public boolean isDeterministic() {
        return true;
    }

    public BigInteger nextK() {
        int bitLength = (this.f6097n.bitLength() + 7) / 8;
        byte[] bArr = new byte[bitLength];
        while (true) {
            int i = 0;
            while (i < bitLength) {
                HMac hMac2 = this.hMac;
                byte[] bArr2 = this.f6096V;
                hMac2.update(bArr2, 0, bArr2.length);
                this.hMac.doFinal(this.f6096V, 0);
                int min = Math.min(bitLength - i, this.f6096V.length);
                System.arraycopy(this.f6096V, 0, bArr, i, min);
                i += min;
            }
            BigInteger bitsToInt = bitsToInt(bArr);
            if (bitsToInt.compareTo(ZERO) > 0 && bitsToInt.compareTo(this.f6097n) < 0) {
                return bitsToInt;
            }
            HMac hMac3 = this.hMac;
            byte[] bArr3 = this.f6096V;
            hMac3.update(bArr3, 0, bArr3.length);
            this.hMac.update((byte) 0);
            this.hMac.doFinal(this.f6095K, 0);
            this.hMac.init(new KeyParameter(this.f6095K));
            HMac hMac4 = this.hMac;
            byte[] bArr4 = this.f6096V;
            hMac4.update(bArr4, 0, bArr4.length);
            this.hMac.doFinal(this.f6096V, 0);
        }
    }
}
