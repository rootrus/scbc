package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

public abstract class SerpentEngineBase implements BlockCipher {
    protected static final int BLOCK_SIZE = 16;
    static final int PHI = -1640531527;
    static final int ROUNDS = 32;

    /* renamed from: X0 */
    protected int f5917X0;

    /* renamed from: X1 */
    protected int f5918X1;

    /* renamed from: X2 */
    protected int f5919X2;

    /* renamed from: X3 */
    protected int f5920X3;
    protected boolean encrypting;
    protected int[] wKey;

    SerpentEngineBase() {
    }

    protected static int rotateLeft(int i, int i2) {
        return (i << i2) | (i >>> (-i2));
    }

    protected static int rotateRight(int i, int i2) {
        return (i >>> i2) | (i << (-i2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: LT */
    public final void mo60921LT() {
        int rotateLeft = rotateLeft(this.f5917X0, 13);
        int rotateLeft2 = rotateLeft(this.f5919X2, 3);
        int i = this.f5918X1;
        int i2 = this.f5920X3;
        this.f5918X1 = rotateLeft((i ^ rotateLeft) ^ rotateLeft2, 1);
        int rotateLeft3 = rotateLeft((i2 ^ rotateLeft2) ^ (rotateLeft << 3), 7);
        this.f5920X3 = rotateLeft3;
        this.f5917X0 = rotateLeft((rotateLeft ^ this.f5918X1) ^ rotateLeft3, 5);
        this.f5919X2 = rotateLeft((this.f5920X3 ^ rotateLeft2) ^ (this.f5918X1 << 7), 22);
    }

    /* access modifiers changed from: protected */
    public abstract void decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2);

    /* access modifiers changed from: protected */
    public abstract void encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2);

    public String getAlgorithmName() {
        return "Serpent";
    }

    public int getBlockSize() {
        return 16;
    }

    /* access modifiers changed from: protected */
    public final void ib0(int i, int i2, int i3, int i4) {
        int i5 = ~i;
        int i6 = i2 ^ i;
        int i7 = (i5 | i6) ^ i4;
        int i8 = i3 ^ i7;
        int i9 = i6 ^ i8;
        this.f5919X2 = i9;
        int i10 = (i6 & i4) ^ i5;
        int i11 = (i9 & i10) ^ i7;
        this.f5918X1 = i11;
        int i12 = (i & i7) ^ (i11 | i8);
        this.f5920X3 = i12;
        this.f5917X0 = i12 ^ (i10 ^ i8);
    }

    /* access modifiers changed from: protected */
    public final void ib1(int i, int i2, int i3, int i4) {
        int i5 = i4 ^ i2;
        int i6 = i ^ (i2 & i5);
        int i7 = i5 ^ i6;
        int i8 = i3 ^ i7;
        this.f5920X3 = i8;
        int i9 = i2 ^ (i5 & i6);
        int i10 = i6 ^ (i8 | i9);
        this.f5918X1 = i10;
        int i11 = ~i10;
        int i12 = i9 ^ i8;
        this.f5917X0 = i11 ^ i12;
        this.f5919X2 = (i11 | i12) ^ i7;
    }

    /* access modifiers changed from: protected */
    public final void ib2(int i, int i2, int i3, int i4) {
        int i5 = i2 ^ i4;
        int i6 = i ^ i3;
        int i7 = i3 ^ i5;
        int i8 = (i2 & i7) ^ i6;
        this.f5917X0 = i8;
        int i9 = (((i | (~i5)) ^ i4) | i6) ^ i5;
        this.f5920X3 = i9;
        int i10 = ~i7;
        int i11 = i9 | i8;
        this.f5918X1 = i10 ^ i11;
        this.f5919X2 = (i11 ^ i6) ^ (i4 & i10);
    }

    /* access modifiers changed from: protected */
    public final void ib3(int i, int i2, int i3, int i4) {
        int i5 = i2 ^ i3;
        int i6 = (i2 & i5) ^ i;
        int i7 = i4 | i6;
        int i8 = i5 ^ i7;
        this.f5917X0 = i8;
        int i9 = i4 ^ (i5 | i7);
        this.f5919X2 = (i3 ^ i6) ^ i9;
        int i10 = (i | i2) ^ i9;
        int i11 = (i8 & i10) ^ i6;
        this.f5920X3 = i11;
        this.f5918X1 = (i10 ^ i8) ^ i11;
    }

    /* access modifiers changed from: protected */
    public final void ib4(int i, int i2, int i3, int i4) {
        int i5 = i2 ^ ((i3 | i4) & i);
        int i6 = i3 ^ (i & i5);
        int i7 = i4 ^ i6;
        this.f5918X1 = i7;
        int i8 = ~i;
        int i9 = (i6 & i7) ^ i5;
        this.f5920X3 = i9;
        int i10 = i4 ^ (i7 | i8);
        this.f5917X0 = i9 ^ i10;
        this.f5919X2 = (i8 ^ i7) ^ (i5 & i10);
    }

    /* access modifiers changed from: protected */
    public final void ib5(int i, int i2, int i3, int i4) {
        int i5 = ~i3;
        int i6 = (i2 & i5) ^ i4;
        int i7 = i & i6;
        int i8 = (i2 ^ i5) ^ i7;
        this.f5920X3 = i8;
        int i9 = i8 | i2;
        this.f5918X1 = i6 ^ (i & i9);
        int i10 = i4 | i;
        this.f5917X0 = (i5 ^ i9) ^ i10;
        this.f5919X2 = ((i ^ i3) | i7) ^ (i2 & i10);
    }

    /* access modifiers changed from: protected */
    public final void ib6(int i, int i2, int i3, int i4) {
        int i5 = ~i;
        int i6 = i ^ i2;
        int i7 = i3 ^ i6;
        int i8 = (i3 | i5) ^ i4;
        this.f5918X1 = i7 ^ i8;
        int i9 = i6 ^ (i7 & i8);
        int i10 = i8 ^ (i2 | i9);
        this.f5920X3 = i10;
        int i11 = i2 | i10;
        this.f5917X0 = i9 ^ i11;
        this.f5919X2 = (i4 & i5) ^ (i11 ^ i7);
    }

    /* access modifiers changed from: protected */
    public final void ib7(int i, int i2, int i3, int i4) {
        int i5 = (i & i2) | i3;
        int i6 = (i | i2) & i4;
        int i7 = i5 ^ i6;
        this.f5920X3 = i7;
        int i8 = i2 ^ i6;
        int i9 = (((~i4) ^ i7) | i8) ^ i;
        this.f5918X1 = i9;
        int i10 = (i8 ^ i3) ^ (i4 | i9);
        this.f5917X0 = i10;
        this.f5919X2 = ((i & i7) ^ i10) ^ (i5 ^ i9);
    }

    public void init(boolean z, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            this.encrypting = z;
            this.wKey = makeWorkingKey(((KeyParameter) cipherParameters).getKey());
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid parameter passed to ");
        sb.append(getAlgorithmName());
        sb.append(" init - ");
        sb.append(cipherParameters.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final void inverseLT() {
        int rotateRight = (rotateRight(this.f5919X2, 22) ^ this.f5920X3) ^ (this.f5918X1 << 7);
        int rotateRight2 = rotateRight(this.f5917X0, 5);
        int i = this.f5918X1;
        int i2 = this.f5920X3;
        int i3 = (rotateRight2 ^ i) ^ i2;
        int rotateRight3 = rotateRight(i2, 7);
        int rotateRight4 = rotateRight(this.f5918X1, 1);
        this.f5920X3 = (rotateRight3 ^ rotateRight) ^ (i3 << 3);
        this.f5918X1 = (rotateRight4 ^ i3) ^ rotateRight;
        this.f5919X2 = rotateRight(rotateRight, 3);
        this.f5917X0 = rotateRight(i3, 13);
    }

    /* access modifiers changed from: protected */
    public abstract int[] makeWorkingKey(byte[] bArr);

    public final int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.wKey == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getAlgorithmName());
            sb.append(" not initialised");
            throw new IllegalStateException(sb.toString());
        } else if (i + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i2 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        } else if (this.encrypting) {
            encryptBlock(bArr, i, bArr2, i2);
            return 16;
        } else {
            decryptBlock(bArr, i, bArr2, i2);
            return 16;
        }
    }

    public void reset() {
    }

    /* access modifiers changed from: protected */
    public final void sb0(int i, int i2, int i3, int i4) {
        int i5 = i ^ i4;
        int i6 = i3 ^ i5;
        int i7 = i2 ^ i6;
        int i8 = (i4 & i) ^ i7;
        this.f5920X3 = i8;
        int i9 = i ^ (i2 & i5);
        this.f5919X2 = (i3 | i9) ^ i7;
        int i10 = (i6 ^ i9) & i8;
        this.f5918X1 = (~i6) ^ i10;
        this.f5917X0 = (~i9) ^ i10;
    }

    /* access modifiers changed from: protected */
    public final void sb1(int i, int i2, int i3, int i4) {
        int i5 = (~i) ^ i2;
        int i6 = (i | i5) ^ i3;
        int i7 = i4 ^ i6;
        this.f5919X2 = i7;
        int i8 = i2 ^ (i4 | i5);
        int i9 = i7 ^ i5;
        int i10 = (i6 & i8) ^ i9;
        this.f5920X3 = i10;
        int i11 = i8 ^ i6;
        this.f5918X1 = i10 ^ i11;
        this.f5917X0 = i6 ^ (i11 & i9);
    }

    /* access modifiers changed from: protected */
    public final void sb2(int i, int i2, int i3, int i4) {
        int i5 = ~i;
        int i6 = i2 ^ i4;
        int i7 = (i3 & i5) ^ i6;
        this.f5917X0 = i7;
        int i8 = i3 ^ i5;
        int i9 = i2 & (i3 ^ i7);
        int i10 = i8 ^ i9;
        this.f5920X3 = i10;
        int i11 = i ^ ((i9 | i4) & (i7 | i8));
        this.f5919X2 = i11;
        this.f5918X1 = (i11 ^ (i4 | i5)) ^ (i6 ^ i10);
    }

    /* access modifiers changed from: protected */
    public final void sb3(int i, int i2, int i3, int i4) {
        int i5 = i ^ i2;
        int i6 = i | i4;
        int i7 = i3 ^ i4;
        int i8 = (i & i3) | (i5 & i6);
        int i9 = i7 ^ i8;
        this.f5919X2 = i9;
        int i10 = i8 ^ (i6 ^ i2);
        int i11 = i5 ^ (i7 & i10);
        this.f5917X0 = i11;
        int i12 = i9 & i11;
        this.f5918X1 = i10 ^ i12;
        this.f5920X3 = (i2 | i4) ^ (i7 ^ i12);
    }

    /* access modifiers changed from: protected */
    public final void sb4(int i, int i2, int i3, int i4) {
        int i5 = i ^ i4;
        int i6 = i3 ^ (i4 & i5);
        int i7 = i2 | i6;
        this.f5920X3 = i5 ^ i7;
        int i8 = ~i2;
        int i9 = (i5 | i8) ^ i6;
        this.f5917X0 = i9;
        int i10 = i8 ^ i5;
        int i11 = (i7 & i10) ^ (i9 & i);
        this.f5919X2 = i11;
        this.f5918X1 = (i ^ i6) ^ (i10 & i11);
    }

    /* access modifiers changed from: protected */
    public final void sb5(int i, int i2, int i3, int i4) {
        int i5 = ~i;
        int i6 = i ^ i2;
        int i7 = i ^ i4;
        int i8 = (i3 ^ i5) ^ (i6 | i7);
        this.f5917X0 = i8;
        int i9 = i4 & i8;
        int i10 = (i6 ^ i8) ^ i9;
        this.f5918X1 = i10;
        int i11 = i7 ^ (i8 | i5);
        this.f5919X2 = (i6 | i9) ^ i11;
        this.f5920X3 = (i11 & i10) ^ (i2 ^ i9);
    }

    /* access modifiers changed from: protected */
    public final void sb6(int i, int i2, int i3, int i4) {
        int i5 = i ^ i4;
        int i6 = i2 ^ i5;
        int i7 = ((~i) | i5) ^ i3;
        int i8 = i2 ^ i7;
        this.f5918X1 = i8;
        int i9 = (i8 | i5) ^ i4;
        int i10 = (i7 & i9) ^ i6;
        this.f5919X2 = i10;
        int i11 = i9 ^ i7;
        this.f5917X0 = i10 ^ i11;
        this.f5920X3 = (~i7) ^ (i11 & i6);
    }

    /* access modifiers changed from: protected */
    public final void sb7(int i, int i2, int i3, int i4) {
        int i5 = i2 ^ i3;
        int i6 = (i3 & i5) ^ i4;
        int i7 = i ^ i6;
        int i8 = i2 ^ ((i4 | i5) & i7);
        this.f5918X1 = i8;
        int i9 = (i & i7) ^ i5;
        this.f5920X3 = i9;
        int i10 = (i8 | i6) ^ i7;
        int i11 = i6 ^ (i9 & i10);
        this.f5919X2 = i11;
        this.f5917X0 = (i9 & i11) ^ (~i10);
    }
}
