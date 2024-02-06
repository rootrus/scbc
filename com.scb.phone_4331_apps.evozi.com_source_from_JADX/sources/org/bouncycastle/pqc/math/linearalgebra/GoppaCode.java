package org.bouncycastle.pqc.math.linearalgebra;

import java.lang.reflect.Array;
import java.security.SecureRandom;

public final class GoppaCode {

    public static class MaMaPe {

        /* renamed from: h */
        private GF2Matrix f6373h;

        /* renamed from: p */
        private Permutation f6374p;

        /* renamed from: s */
        private GF2Matrix f6375s;

        public MaMaPe(GF2Matrix gF2Matrix, GF2Matrix gF2Matrix2, Permutation permutation) {
            this.f6375s = gF2Matrix;
            this.f6373h = gF2Matrix2;
            this.f6374p = permutation;
        }

        public GF2Matrix getFirstMatrix() {
            return this.f6375s;
        }

        public Permutation getPermutation() {
            return this.f6374p;
        }

        public GF2Matrix getSecondMatrix() {
            return this.f6373h;
        }
    }

    public static class MatrixSet {

        /* renamed from: g */
        private GF2Matrix f6376g;
        private int[] setJ;

        public MatrixSet(GF2Matrix gF2Matrix, int[] iArr) {
            this.f6376g = gF2Matrix;
            this.setJ = iArr;
        }

        public GF2Matrix getG() {
            return this.f6376g;
        }

        public int[] getSetJ() {
            return this.setJ;
        }
    }

    private GoppaCode() {
    }

    public static MaMaPe computeSystematicForm(GF2Matrix gF2Matrix, SecureRandom secureRandom) {
        Permutation permutation;
        GF2Matrix gF2Matrix2;
        GF2Matrix leftSubMatrix;
        boolean z;
        int numColumns = gF2Matrix.getNumColumns();
        GF2Matrix gF2Matrix3 = null;
        do {
            permutation = new Permutation(numColumns, secureRandom);
            gF2Matrix2 = (GF2Matrix) gF2Matrix.rightMultiply(permutation);
            leftSubMatrix = gF2Matrix2.getLeftSubMatrix();
            z = true;
            try {
                gF2Matrix3 = (GF2Matrix) leftSubMatrix.computeInverse();
                continue;
            } catch (ArithmeticException unused) {
                z = false;
                continue;
            }
        } while (!z);
        return new MaMaPe(leftSubMatrix, ((GF2Matrix) gF2Matrix3.rightMultiply((Matrix) gF2Matrix2)).getRightSubMatrix(), permutation);
    }

    public static GF2Matrix createCanonicalCheckMatrix(GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM) {
        GF2mField gF2mField2 = gF2mField;
        PolynomialGF2mSmallM polynomialGF2mSmallM2 = polynomialGF2mSmallM;
        int degree = gF2mField.getDegree();
        int i = 1 << degree;
        int degree2 = polynomialGF2mSmallM.getDegree();
        int[] iArr = new int[2];
        iArr[1] = i;
        int i2 = 0;
        iArr[0] = degree2;
        int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, iArr);
        int[] iArr3 = new int[2];
        iArr3[1] = i;
        iArr3[0] = degree2;
        int[][] iArr4 = (int[][]) Array.newInstance(Integer.TYPE, iArr3);
        for (int i3 = 0; i3 < i; i3++) {
            iArr4[0][i3] = gF2mField2.inverse(polynomialGF2mSmallM2.evaluateAt(i3));
        }
        for (int i4 = 1; i4 < degree2; i4++) {
            for (int i5 = 0; i5 < i; i5++) {
                iArr4[i4][i5] = gF2mField2.mult(iArr4[i4 - 1][i5], i5);
            }
        }
        int i6 = 0;
        while (i6 < degree2) {
            int i7 = i2;
            while (i7 < i) {
                for (int i8 = i2; i8 <= i6; i8++) {
                    iArr2[i6][i7] = gF2mField2.add(iArr2[i6][i7], gF2mField2.mult(iArr4[i8][i7], polynomialGF2mSmallM2.getCoefficient((degree2 + i8) - i6)));
                }
                i7++;
                i2 = 0;
            }
            i6++;
            i2 = 0;
        }
        int[] iArr5 = new int[2];
        iArr5[1] = (i + 31) >>> 5;
        iArr5[0] = degree2 * degree;
        int[][] iArr6 = (int[][]) Array.newInstance(Integer.TYPE, iArr5);
        for (int i9 = 0; i9 < i; i9++) {
            int i10 = i9 >>> 5;
            for (int i11 = 0; i11 < degree2; i11++) {
                int i12 = iArr2[i11][i9];
                for (int i13 = 0; i13 < degree; i13++) {
                    if (((i12 >>> i13) & 1) != 0) {
                        int[] iArr7 = iArr6[(((i11 + 1) * degree) - i13) - 1];
                        iArr7[i10] = iArr7[i10] ^ (1 << (i9 & 31));
                    }
                }
            }
        }
        return new GF2Matrix(i, iArr6);
    }

    public static GF2Vector syndromeDecode(GF2Vector gF2Vector, GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM, PolynomialGF2mSmallM[] polynomialGF2mSmallMArr) {
        int degree = 1 << gF2mField.getDegree();
        GF2Vector gF2Vector2 = new GF2Vector(degree);
        if (!gF2Vector.isZero()) {
            PolynomialGF2mSmallM[] modPolynomialToFracton = new PolynomialGF2mSmallM(gF2Vector.toExtensionFieldVector(gF2mField)).modInverse(polynomialGF2mSmallM).addMonomial(1).modSquareRootMatrix(polynomialGF2mSmallMArr).modPolynomialToFracton(polynomialGF2mSmallM);
            PolynomialGF2mSmallM add = modPolynomialToFracton[0].multiply(modPolynomialToFracton[0]).add(modPolynomialToFracton[1].multiply(modPolynomialToFracton[1]).multWithMonomial(1));
            PolynomialGF2mSmallM multWithElement = add.multWithElement(gF2mField.inverse(add.getHeadCoefficient()));
            for (int i = 0; i < degree; i++) {
                if (multWithElement.evaluateAt(i) == 0) {
                    gF2Vector2.setBit(i);
                }
            }
        }
        return gF2Vector2;
    }
}