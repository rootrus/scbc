package org.bouncycastle.pqc.crypto.mceliece;

import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;

public class McElieceCCA2PublicKeyParameters extends McElieceCCA2KeyParameters {
    private GF2Matrix matrixG;

    /* renamed from: n */
    private int f6306n;

    /* renamed from: t */
    private int f6307t;

    public McElieceCCA2PublicKeyParameters(int i, int i2, GF2Matrix gF2Matrix, String str) {
        super(false, str);
        this.f6306n = i;
        this.f6307t = i2;
        this.matrixG = new GF2Matrix(gF2Matrix);
    }

    public GF2Matrix getG() {
        return this.matrixG;
    }

    public int getK() {
        return this.matrixG.getNumRows();
    }

    public int getN() {
        return this.f6306n;
    }

    public int getT() {
        return this.f6307t;
    }
}
