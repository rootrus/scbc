package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2;

public class McElieceCCA2KeyGenParameterSpec implements AlgorithmParameterSpec {
    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;
    public static final String SHA1 = "SHA-1";
    public static final String SHA224 = "SHA-224";
    public static final String SHA256 = "SHA-256";
    public static final String SHA384 = "SHA-384";
    public static final String SHA512 = "SHA-512";
    private final String digest;
    private int fieldPoly;

    /* renamed from: m */
    private final int f6360m;

    /* renamed from: n */
    private final int f6361n;

    /* renamed from: t */
    private final int f6362t;

    public McElieceCCA2KeyGenParameterSpec() {
        this(11, 50, SHA256);
    }

    public McElieceCCA2KeyGenParameterSpec(int i) {
        this(i, SHA256);
    }

    public McElieceCCA2KeyGenParameterSpec(int i, int i2) {
        this(i, i2, SHA256);
    }

    public McElieceCCA2KeyGenParameterSpec(int i, int i2, int i3) {
        this(i, i2, i3, SHA256);
    }

    public McElieceCCA2KeyGenParameterSpec(int i, int i2, int i3, String str) {
        this.f6360m = i;
        if (i <= 0) {
            throw new IllegalArgumentException("m must be positive");
        } else if (i <= 32) {
            int i4 = 1 << i;
            this.f6361n = i4;
            this.f6362t = i2;
            if (i2 < 0) {
                throw new IllegalArgumentException("t must be positive");
            } else if (i2 > i4) {
                throw new IllegalArgumentException("t must be less than n = 2^m");
            } else if (PolynomialRingGF2.degree(i3) != i || !PolynomialRingGF2.isIrreducible(i3)) {
                throw new IllegalArgumentException("polynomial is not a field polynomial for GF(2^m)");
            } else {
                this.fieldPoly = i3;
                this.digest = str;
            }
        } else {
            throw new IllegalArgumentException(" m is too large");
        }
    }

    public McElieceCCA2KeyGenParameterSpec(int i, int i2, String str) {
        if (i <= 0) {
            throw new IllegalArgumentException("m must be positive");
        } else if (i <= 32) {
            this.f6360m = i;
            int i3 = 1 << i;
            this.f6361n = i3;
            if (i2 < 0) {
                throw new IllegalArgumentException("t must be positive");
            } else if (i2 <= i3) {
                this.f6362t = i2;
                this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i);
                this.digest = str;
            } else {
                throw new IllegalArgumentException("t must be less than n = 2^m");
            }
        } else {
            throw new IllegalArgumentException("m is too large");
        }
    }

    public McElieceCCA2KeyGenParameterSpec(int i, String str) {
        if (i > 0) {
            int i2 = 0;
            int i3 = 1;
            while (i3 < i) {
                i3 <<= 1;
                i2++;
            }
            this.f6362t = (i3 >>> 1) / i2;
            this.f6360m = i2;
            this.f6361n = i3;
            this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i2);
            this.digest = str;
            return;
        }
        throw new IllegalArgumentException("key size must be positive");
    }

    public String getDigest() {
        return this.digest;
    }

    public int getFieldPoly() {
        return this.fieldPoly;
    }

    public int getM() {
        return this.f6360m;
    }

    public int getN() {
        return this.f6361n;
    }

    public int getT() {
        return this.f6362t;
    }
}
