package org.bouncycastle.pqc.crypto.mceliece;

import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;

public class McEliecePublicKeyParameters extends McElieceKeyParameters {

    /* renamed from: g */
    private GF2Matrix f6335g;

    /* renamed from: n */
    private int f6336n;

    /* renamed from: t */
    private int f6337t;

    public McEliecePublicKeyParameters(int i, int i2, GF2Matrix gF2Matrix) {
        super(false, (McElieceParameters) null);
        this.f6336n = i;
        this.f6337t = i2;
        this.f6335g = new GF2Matrix(gF2Matrix);
    }

    public GF2Matrix getG() {
        return this.f6335g;
    }

    public int getK() {
        return this.f6335g.getNumRows();
    }

    public int getN() {
        return this.f6336n;
    }

    public int getT() {
        return this.f6337t;
    }
}
