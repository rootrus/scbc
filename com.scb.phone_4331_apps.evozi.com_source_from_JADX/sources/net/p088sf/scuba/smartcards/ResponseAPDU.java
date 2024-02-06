package net.p088sf.scuba.smartcards;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: net.sf.scuba.smartcards.ResponseAPDU */
public final class ResponseAPDU implements Serializable {
    private static final long serialVersionUID = 6962744978375594225L;
    private byte[] apdu;

    public ResponseAPDU(byte[] bArr) {
        byte[] bArr2 = (byte[]) bArr.clone();
        check(bArr2);
        this.apdu = bArr2;
    }

    private static void check(byte[] bArr) {
        if (bArr.length < 2) {
            throw new IllegalArgumentException("apdu must be at least 2 bytes long");
        }
    }

    public final int getNr() {
        return this.apdu.length - 2;
    }

    public final byte[] getData() {
        byte[] bArr = this.apdu;
        int length = bArr.length - 2;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final int getSW1() {
        byte[] bArr = this.apdu;
        return bArr[bArr.length - 2] & 255;
    }

    public final int getSW2() {
        byte[] bArr = this.apdu;
        return bArr[bArr.length - 1] & 255;
    }

    public final int getSW() {
        return (getSW1() << 8) | getSW2();
    }

    public final byte[] getBytes() {
        return (byte[]) this.apdu.clone();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResponseAPDU: ");
        sb.append(this.apdu.length);
        sb.append(" bytes, SW=");
        sb.append(Integer.toHexString(getSW()));
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseAPDU)) {
            return false;
        }
        return Arrays.equals(this.apdu, ((ResponseAPDU) obj).apdu);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.apdu);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        byte[] bArr = (byte[]) objectInputStream.readUnshared();
        this.apdu = bArr;
        check(bArr);
    }
}
