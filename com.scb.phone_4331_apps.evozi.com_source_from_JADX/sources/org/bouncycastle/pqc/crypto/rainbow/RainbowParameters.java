package org.bouncycastle.pqc.crypto.rainbow;

import org.bouncycastle.crypto.CipherParameters;

public class RainbowParameters implements CipherParameters {
    private final int[] DEFAULT_VI;

    /* renamed from: vi */
    private int[] f6349vi;

    public RainbowParameters() {
        int[] iArr = {6, 12, 17, 22, 33};
        this.DEFAULT_VI = iArr;
        this.f6349vi = iArr;
    }

    public RainbowParameters(int[] iArr) {
        this.DEFAULT_VI = new int[]{6, 12, 17, 22, 33};
        this.f6349vi = iArr;
        try {
            checkParams();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void checkParams() throws Exception {
        int[] iArr;
        int i;
        int[] iArr2 = this.f6349vi;
        if (iArr2 == null) {
            throw new Exception("no layers defined.");
        } else if (iArr2.length > 1) {
            int i2 = 0;
            do {
                iArr = this.f6349vi;
                if (i2 < iArr.length - 1) {
                    i = iArr[i2];
                    i2++;
                } else {
                    return;
                }
            } while (i < iArr[i2]);
            throw new Exception("v[i] has to be smaller than v[i+1]");
        } else {
            throw new Exception("Rainbow needs at least 1 layer, such that v1 < v2.");
        }
    }

    public int getDocLength() {
        int[] iArr = this.f6349vi;
        return iArr[iArr.length - 1] - iArr[0];
    }

    public int getNumOfLayers() {
        return this.f6349vi.length - 1;
    }

    public int[] getVi() {
        return this.f6349vi;
    }
}
