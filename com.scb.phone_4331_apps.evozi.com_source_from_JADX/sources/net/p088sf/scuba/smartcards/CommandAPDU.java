package net.p088sf.scuba.smartcards;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: net.sf.scuba.smartcards.CommandAPDU */
public final class CommandAPDU implements Serializable {
    private static final int MAX_APDU_SIZE = 65544;
    private static final long serialVersionUID = 398698301286670877L;
    private byte[] apdu;
    private transient int dataOffset;

    /* renamed from: nc */
    private transient int f5465nc;

    /* renamed from: ne */
    private transient int f5466ne;

    public CommandAPDU(byte[] bArr) {
        this.apdu = (byte[]) bArr.clone();
        parse();
    }

    public CommandAPDU(byte[] bArr, int i, int i2) {
        checkArrayBounds(bArr, i, i2);
        byte[] bArr2 = new byte[i2];
        this.apdu = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        parse();
    }

    private void checkArrayBounds(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Offset and length must not be negative");
        } else if (bArr == null) {
            if (i != 0 && i2 != 0) {
                throw new IllegalArgumentException("offset and length must be 0 if array is null");
            }
        } else if (i > bArr.length - i2) {
            throw new IllegalArgumentException("Offset plus length exceed array size");
        }
    }

    public CommandAPDU(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        this.apdu = bArr;
        byteBuffer.get(bArr);
        parse();
    }

    public CommandAPDU(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, (byte[]) null, 0, 0, 0);
    }

    public CommandAPDU(int i, int i2, int i3, int i4, int i5) {
        this(i, i2, i3, i4, (byte[]) null, 0, 0, i5);
    }

    public CommandAPDU(int i, int i2, int i3, int i4, byte[] bArr) {
        this(i, i2, i3, i4, bArr, 0, arrayLength(bArr), 0);
    }

    public CommandAPDU(int i, int i2, int i3, int i4, byte[] bArr, int i5, int i6) {
        this(i, i2, i3, i4, bArr, i5, i6, 0);
    }

    public CommandAPDU(int i, int i2, int i3, int i4, byte[] bArr, int i5) {
        this(i, i2, i3, i4, bArr, 0, arrayLength(bArr), i5);
    }

    private static int arrayLength(byte[] bArr) {
        if (bArr != null) {
            return bArr.length;
        }
        return 0;
    }

    private void parse() {
        byte[] bArr = this.apdu;
        if (bArr.length < 4) {
            throw new IllegalArgumentException("apdu must be at least 4 bytes long");
        } else if (bArr.length != 4) {
            byte b = bArr[4] & 255;
            byte b2 = 256;
            if (bArr.length == 5) {
                if (b == 0) {
                    b = 256;
                }
                this.f5466ne = b;
            } else if (b != 0) {
                if (bArr.length == b + 5) {
                    this.f5465nc = b;
                    this.dataOffset = 5;
                } else if (bArr.length == b + 6) {
                    this.f5465nc = b;
                    this.dataOffset = 5;
                    byte b3 = bArr[bArr.length - 1] & 255;
                    if (b3 != 0) {
                        b2 = b3;
                    }
                    this.f5466ne = b2;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid APDU: length=");
                    sb.append(this.apdu.length);
                    sb.append(", b1=");
                    sb.append(b);
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (bArr.length >= 7) {
                byte b4 = ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                byte b5 = 65536;
                if (bArr.length == 7) {
                    if (b4 == 0) {
                        b4 = 65536;
                    }
                    this.f5466ne = b4;
                } else if (b4 == 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid APDU: length=");
                    sb2.append(this.apdu.length);
                    sb2.append(", b1=");
                    sb2.append(b);
                    sb2.append(", b2||b3=");
                    sb2.append(b4);
                    throw new IllegalArgumentException(sb2.toString());
                } else if (bArr.length == b4 + 7) {
                    this.f5465nc = b4;
                    this.dataOffset = 7;
                } else if (bArr.length == b4 + 9) {
                    this.f5465nc = b4;
                    this.dataOffset = 7;
                    int length = bArr.length - 2;
                    byte b6 = (bArr[length + 1] & 255) | ((bArr[length] & 255) << 8);
                    if (b6 != 0) {
                        b5 = b6;
                    }
                    this.f5466ne = b5;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Invalid APDU: length=");
                    sb3.append(this.apdu.length);
                    sb3.append(", b1=");
                    sb3.append(b);
                    sb3.append(", b2||b3=");
                    sb3.append(b4);
                    throw new IllegalArgumentException(sb3.toString());
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Invalid APDU: length=");
                sb4.append(this.apdu.length);
                sb4.append(", b1=");
                sb4.append(b);
                throw new IllegalArgumentException(sb4.toString());
            }
        }
    }

    public CommandAPDU(int i, int i2, int i3, int i4, byte[] bArr, int i5, int i6, int i7) {
        byte b;
        byte[] bArr2 = bArr;
        int i8 = i5;
        int i9 = i6;
        int i10 = i7;
        checkArrayBounds(bArr2, i8, i9);
        if (i9 > 65535) {
            throw new IllegalArgumentException("dataLength is too large");
        } else if (i10 < 0) {
            throw new IllegalArgumentException("ne must not be negative");
        } else if (i10 <= 65536) {
            this.f5466ne = i10;
            this.f5465nc = i9;
            byte b2 = 0;
            if (i9 == 0) {
                if (i10 == 0) {
                    this.apdu = new byte[4];
                    setHeader(i, i2, i3, i4);
                } else if (i10 <= 256) {
                    b2 = i10 != 256 ? (byte) i10 : b2;
                    this.apdu = new byte[5];
                    setHeader(i, i2, i3, i4);
                    this.apdu[4] = b2;
                } else {
                    if (i10 == 65536) {
                        b = 0;
                    } else {
                        b2 = (byte) (i10 >> 8);
                        b = (byte) i10;
                    }
                    this.apdu = new byte[7];
                    setHeader(i, i2, i3, i4);
                    byte[] bArr3 = this.apdu;
                    bArr3[5] = b2;
                    bArr3[6] = b;
                }
            } else if (i10 == 0) {
                if (i9 <= 255) {
                    this.apdu = new byte[(i9 + 5)];
                    setHeader(i, i2, i3, i4);
                    byte[] bArr4 = this.apdu;
                    bArr4[4] = (byte) i9;
                    this.dataOffset = 5;
                    System.arraycopy(bArr2, i8, bArr4, 5, i9);
                    return;
                }
                this.apdu = new byte[(i9 + 7)];
                setHeader(i, i2, i3, i4);
                byte[] bArr5 = this.apdu;
                bArr5[4] = 0;
                bArr5[5] = (byte) (i9 >> 8);
                bArr5[6] = (byte) i9;
                this.dataOffset = 7;
                System.arraycopy(bArr2, i8, bArr5, 7, i9);
            } else if (i9 > 255 || i10 > 256) {
                this.apdu = new byte[(i9 + 9)];
                setHeader(i, i2, i3, i4);
                byte[] bArr6 = this.apdu;
                bArr6[4] = 0;
                bArr6[5] = (byte) (i9 >> 8);
                bArr6[6] = (byte) i9;
                this.dataOffset = 7;
                System.arraycopy(bArr2, i8, bArr6, 7, i9);
                if (i10 != 65536) {
                    byte[] bArr7 = this.apdu;
                    int length = bArr7.length - 2;
                    bArr7[length] = (byte) (i10 >> 8);
                    bArr7[length + 1] = (byte) i10;
                }
            } else {
                this.apdu = new byte[(i9 + 6)];
                setHeader(i, i2, i3, i4);
                byte[] bArr8 = this.apdu;
                bArr8[4] = (byte) i9;
                this.dataOffset = 5;
                System.arraycopy(bArr2, i8, bArr8, 5, i9);
                byte[] bArr9 = this.apdu;
                bArr9[bArr9.length - 1] = i10 != 256 ? (byte) i10 : b2;
            }
        } else {
            throw new IllegalArgumentException("ne is too large");
        }
    }

    private void setHeader(int i, int i2, int i3, int i4) {
        byte[] bArr = this.apdu;
        bArr[0] = (byte) i;
        bArr[1] = (byte) i2;
        bArr[2] = (byte) i3;
        bArr[3] = (byte) i4;
    }

    public final int getCLA() {
        return this.apdu[0] & 255;
    }

    public final int getINS() {
        return this.apdu[1] & 255;
    }

    public final int getP1() {
        return this.apdu[2] & 255;
    }

    public final int getP2() {
        return this.apdu[3] & 255;
    }

    public final int getNc() {
        return this.f5465nc;
    }

    public final byte[] getData() {
        int i = this.f5465nc;
        byte[] bArr = new byte[i];
        System.arraycopy(this.apdu, this.dataOffset, bArr, 0, i);
        return bArr;
    }

    public final int getNe() {
        return this.f5466ne;
    }

    public final byte[] getBytes() {
        return (byte[]) this.apdu.clone();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CommmandAPDU: ");
        sb.append(this.apdu.length);
        sb.append(" bytes, nc=");
        sb.append(this.f5465nc);
        sb.append(", ne=");
        sb.append(this.f5466ne);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommandAPDU)) {
            return false;
        }
        return Arrays.equals(this.apdu, ((CommandAPDU) obj).apdu);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.apdu);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.apdu = (byte[]) objectInputStream.readUnshared();
        parse();
    }
}
