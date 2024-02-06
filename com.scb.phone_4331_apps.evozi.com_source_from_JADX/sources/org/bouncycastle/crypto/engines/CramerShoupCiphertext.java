package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

public class CramerShoupCiphertext {

    /* renamed from: e */
    BigInteger f5879e;

    /* renamed from: u1 */
    BigInteger f5880u1;

    /* renamed from: u2 */
    BigInteger f5881u2;

    /* renamed from: v */
    BigInteger f5882v;

    public CramerShoupCiphertext() {
    }

    public CramerShoupCiphertext(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f5880u1 = bigInteger;
        this.f5881u2 = bigInteger2;
        this.f5879e = bigInteger3;
        this.f5882v = bigInteger4;
    }

    public CramerShoupCiphertext(byte[] bArr) {
        int bigEndianToInt = Pack.bigEndianToInt(bArr, 0) + 4;
        this.f5880u1 = new BigInteger(Arrays.copyOfRange(bArr, 4, bigEndianToInt));
        int bigEndianToInt2 = Pack.bigEndianToInt(bArr, bigEndianToInt);
        int i = bigEndianToInt + 4;
        int i2 = bigEndianToInt2 + i;
        this.f5881u2 = new BigInteger(Arrays.copyOfRange(bArr, i, i2));
        int bigEndianToInt3 = Pack.bigEndianToInt(bArr, i2);
        int i3 = i2 + 4;
        int i4 = bigEndianToInt3 + i3;
        this.f5879e = new BigInteger(Arrays.copyOfRange(bArr, i3, i4));
        int bigEndianToInt4 = Pack.bigEndianToInt(bArr, i4);
        int i5 = i4 + 4;
        this.f5882v = new BigInteger(Arrays.copyOfRange(bArr, i5, bigEndianToInt4 + i5));
    }

    public BigInteger getE() {
        return this.f5879e;
    }

    public BigInteger getU1() {
        return this.f5880u1;
    }

    public BigInteger getU2() {
        return this.f5881u2;
    }

    public BigInteger getV() {
        return this.f5882v;
    }

    public void setE(BigInteger bigInteger) {
        this.f5879e = bigInteger;
    }

    public void setU1(BigInteger bigInteger) {
        this.f5880u1 = bigInteger;
    }

    public void setU2(BigInteger bigInteger) {
        this.f5881u2 = bigInteger;
    }

    public void setV(BigInteger bigInteger) {
        this.f5882v = bigInteger;
    }

    public byte[] toByteArray() {
        byte[] byteArray = this.f5880u1.toByteArray();
        int length = byteArray.length;
        byte[] byteArray2 = this.f5881u2.toByteArray();
        int length2 = byteArray2.length;
        byte[] byteArray3 = this.f5879e.toByteArray();
        int length3 = byteArray3.length;
        byte[] byteArray4 = this.f5882v.toByteArray();
        int length4 = byteArray4.length;
        byte[] bArr = new byte[(length + length2 + length3 + length4 + 16)];
        Pack.intToBigEndian(length, bArr, 0);
        System.arraycopy(byteArray, 0, bArr, 4, length);
        int i = length + 4;
        Pack.intToBigEndian(length2, bArr, i);
        int i2 = i + 4;
        System.arraycopy(byteArray2, 0, bArr, i2, length2);
        int i3 = i2 + length2;
        Pack.intToBigEndian(length3, bArr, i3);
        int i4 = i3 + 4;
        System.arraycopy(byteArray3, 0, bArr, i4, length3);
        int i5 = i4 + length3;
        Pack.intToBigEndian(length4, bArr, i5);
        System.arraycopy(byteArray4, 0, bArr, i5 + 4, length4);
        return bArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder sb = new StringBuilder();
        sb.append("u1: ");
        sb.append(this.f5880u1.toString());
        stringBuffer.append(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nu2: ");
        sb2.append(this.f5881u2.toString());
        stringBuffer.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("\ne: ");
        sb3.append(this.f5879e.toString());
        stringBuffer.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("\nv: ");
        sb4.append(this.f5882v.toString());
        stringBuffer.append(sb4.toString());
        return stringBuffer.toString();
    }
}
