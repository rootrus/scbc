package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.util.Arrays;

public final class KDFDoublePipelineIterationParameters implements DerivationParameters {
    private static final int UNUSED_R = 32;
    private final byte[] fixedInputData;

    /* renamed from: ki */
    private final byte[] f6062ki;

    /* renamed from: r */
    private final int f6063r;
    private final boolean useCounter;

    private KDFDoublePipelineIterationParameters(byte[] bArr, byte[] bArr2, int i, boolean z) {
        if (bArr != null) {
            this.f6062ki = Arrays.clone(bArr);
            if (bArr2 == null) {
                this.fixedInputData = new byte[0];
            } else {
                this.fixedInputData = Arrays.clone(bArr2);
            }
            if (i == 8 || i == 16 || i == 24 || i == 32) {
                this.f6063r = i;
                this.useCounter = z;
                return;
            }
            throw new IllegalArgumentException("Length of counter should be 8, 16, 24 or 32");
        }
        throw new IllegalArgumentException("A KDF requires Ki (a seed) as input");
    }

    public static KDFDoublePipelineIterationParameters createWithCounter(byte[] bArr, byte[] bArr2, int i) {
        return new KDFDoublePipelineIterationParameters(bArr, bArr2, i, true);
    }

    public static KDFDoublePipelineIterationParameters createWithoutCounter(byte[] bArr, byte[] bArr2) {
        return new KDFDoublePipelineIterationParameters(bArr, bArr2, 32, false);
    }

    public final byte[] getFixedInputData() {
        return Arrays.clone(this.fixedInputData);
    }

    public final byte[] getKI() {
        return this.f6062ki;
    }

    public final int getR() {
        return this.f6063r;
    }

    public final boolean useCounter() {
        return this.useCounter;
    }
}
