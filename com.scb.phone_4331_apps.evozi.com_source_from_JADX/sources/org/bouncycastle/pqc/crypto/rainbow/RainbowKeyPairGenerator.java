package org.bouncycastle.pqc.crypto.rainbow;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.rainbow.util.ComputeInField;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;

public class RainbowKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {

    /* renamed from: A1 */
    private short[][] f6343A1;
    private short[][] A1inv;

    /* renamed from: A2 */
    private short[][] f6344A2;
    private short[][] A2inv;

    /* renamed from: b1 */
    private short[] f6345b1;

    /* renamed from: b2 */
    private short[] f6346b2;
    private boolean initialized = false;
    private Layer[] layers;
    private int numOfLayers;
    private short[][] pub_quadratic;
    private short[] pub_scalar;
    private short[][] pub_singular;
    private RainbowKeyGenerationParameters rainbowParams;

    /* renamed from: sr */
    private SecureRandom f6347sr;

    /* renamed from: vi */
    private int[] f6348vi;

    private void compactPublicKey(short[][][] sArr) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        int[] iArr = new int[2];
        iArr[1] = ((length2 + 1) * length2) / 2;
        iArr[0] = length;
        this.pub_quadratic = (short[][]) Array.newInstance(Short.TYPE, iArr);
        for (int i = 0; i < length; i++) {
            int i2 = 0;
            for (int i3 = 0; i3 < length2; i3++) {
                for (int i4 = i3; i4 < length2; i4++) {
                    short[][] sArr2 = this.pub_quadratic;
                    if (i4 == i3) {
                        sArr2[i][i2] = sArr[i][i3][i4];
                    } else {
                        sArr2[i][i2] = GF2Field.addElem(sArr[i][i3][i4], sArr[i][i4][i3]);
                    }
                    i2++;
                }
            }
        }
    }

    private void computePublicKey() {
        Class cls;
        Class cls2 = Short.TYPE;
        ComputeInField computeInField = new ComputeInField();
        int[] iArr = this.f6348vi;
        int i = 0;
        int i2 = iArr[iArr.length - 1] - iArr[0];
        int i3 = iArr[iArr.length - 1];
        int i4 = 3;
        int[] iArr2 = new int[3];
        iArr2[2] = i3;
        iArr2[1] = i3;
        iArr2[0] = i2;
        short[][][] sArr = (short[][][]) Array.newInstance(Short.TYPE, iArr2);
        int[] iArr3 = new int[2];
        iArr3[1] = i3;
        iArr3[0] = i2;
        this.pub_singular = (short[][]) Array.newInstance(Short.TYPE, iArr3);
        this.pub_scalar = new short[i2];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            Layer[] layerArr = this.layers;
            if (i5 >= layerArr.length) {
                break;
            }
            short[][][] coeffAlpha = layerArr[i5].getCoeffAlpha();
            short[][][] coeffBeta = this.layers[i5].getCoeffBeta();
            short[][] coeffGamma = this.layers[i5].getCoeffGamma();
            short[] coeffEta = this.layers[i5].getCoeffEta();
            int length = coeffAlpha[i].length;
            int length2 = coeffBeta[i].length;
            while (i < length) {
                int i7 = 0;
                while (true) {
                    cls = cls2;
                    if (i7 >= length) {
                        break;
                    }
                    int i8 = 0;
                    while (i8 < length2) {
                        int i9 = i2;
                        int i10 = i3;
                        int i11 = i7 + length2;
                        short[] multVect = computeInField.multVect(coeffAlpha[i][i7][i8], this.f6344A2[i11]);
                        int i12 = i6 + i;
                        int i13 = i5;
                        sArr[i12] = computeInField.addSquareMatrix(sArr[i12], computeInField.multVects(multVect, this.f6344A2[i8]));
                        short[] multVect2 = computeInField.multVect(this.f6346b2[i8], multVect);
                        short[][] sArr2 = this.pub_singular;
                        sArr2[i12] = computeInField.addVect(multVect2, sArr2[i12]);
                        short[] multVect3 = computeInField.multVect(this.f6346b2[i11], computeInField.multVect(coeffAlpha[i][i7][i8], this.f6344A2[i8]));
                        short[][] sArr3 = this.pub_singular;
                        sArr3[i12] = computeInField.addVect(multVect3, sArr3[i12]);
                        short multElem = GF2Field.multElem(coeffAlpha[i][i7][i8], this.f6346b2[i11]);
                        short[] sArr4 = this.pub_scalar;
                        sArr4[i12] = GF2Field.addElem(sArr4[i12], GF2Field.multElem(multElem, this.f6346b2[i8]));
                        i8++;
                        i3 = i10;
                        i2 = i9;
                        coeffAlpha = coeffAlpha;
                        i5 = i13;
                        coeffEta = coeffEta;
                    }
                    int i14 = i3;
                    int i15 = i2;
                    int i16 = i5;
                    short[][][] sArr5 = coeffAlpha;
                    short[] sArr6 = coeffEta;
                    i7++;
                    cls2 = cls;
                }
                int i17 = i3;
                int i18 = i2;
                int i19 = i5;
                short[][][] sArr7 = coeffAlpha;
                short[] sArr8 = coeffEta;
                for (int i20 = 0; i20 < length2; i20++) {
                    for (int i21 = 0; i21 < length2; i21++) {
                        short[] multVect4 = computeInField.multVect(coeffBeta[i][i20][i21], this.f6344A2[i20]);
                        int i22 = i6 + i;
                        sArr[i22] = computeInField.addSquareMatrix(sArr[i22], computeInField.multVects(multVect4, this.f6344A2[i21]));
                        short[] multVect5 = computeInField.multVect(this.f6346b2[i21], multVect4);
                        short[][] sArr9 = this.pub_singular;
                        sArr9[i22] = computeInField.addVect(multVect5, sArr9[i22]);
                        short[] multVect6 = computeInField.multVect(this.f6346b2[i20], computeInField.multVect(coeffBeta[i][i20][i21], this.f6344A2[i21]));
                        short[][] sArr10 = this.pub_singular;
                        sArr10[i22] = computeInField.addVect(multVect6, sArr10[i22]);
                        short multElem2 = GF2Field.multElem(coeffBeta[i][i20][i21], this.f6346b2[i20]);
                        short[] sArr11 = this.pub_scalar;
                        sArr11[i22] = GF2Field.addElem(sArr11[i22], GF2Field.multElem(multElem2, this.f6346b2[i21]));
                    }
                }
                for (int i23 = 0; i23 < length2 + length; i23++) {
                    short[] multVect7 = computeInField.multVect(coeffGamma[i][i23], this.f6344A2[i23]);
                    short[][] sArr12 = this.pub_singular;
                    int i24 = i6 + i;
                    sArr12[i24] = computeInField.addVect(multVect7, sArr12[i24]);
                    short[] sArr13 = this.pub_scalar;
                    sArr13[i24] = GF2Field.addElem(sArr13[i24], GF2Field.multElem(coeffGamma[i][i23], this.f6346b2[i23]));
                }
                short[] sArr14 = this.pub_scalar;
                int i25 = i6 + i;
                sArr14[i25] = GF2Field.addElem(sArr14[i25], sArr8[i]);
                i++;
                cls2 = cls;
                i3 = i17;
                i2 = i18;
                coeffAlpha = sArr7;
                i5 = i19;
                coeffEta = sArr8;
            }
            Class cls3 = cls2;
            int i26 = i3;
            int i27 = i2;
            i6 += length;
            i5++;
            i = 0;
            i4 = 3;
        }
        Class cls4 = cls2;
        int i28 = i3;
        int i29 = i2;
        int[] iArr4 = new int[i4];
        iArr4[2] = i28;
        iArr4[1] = i28;
        iArr4[0] = i29;
        Class cls5 = cls4;
        short[][][] sArr15 = (short[][][]) Array.newInstance(cls5, iArr4);
        int[] iArr5 = new int[2];
        iArr5[1] = i28;
        iArr5[0] = i29;
        short[][] sArr16 = (short[][]) Array.newInstance(cls5, iArr5);
        int i30 = i29;
        short[] sArr17 = new short[i30];
        for (int i31 = 0; i31 < i30; i31++) {
            int i32 = 0;
            while (true) {
                short[][] sArr18 = this.f6343A1;
                if (i32 >= sArr18.length) {
                    break;
                }
                sArr15[i31] = computeInField.addSquareMatrix(sArr15[i31], computeInField.multMatrix(sArr18[i31][i32], sArr[i32]));
                sArr16[i31] = computeInField.addVect(sArr16[i31], computeInField.multVect(this.f6343A1[i31][i32], this.pub_singular[i32]));
                sArr17[i31] = GF2Field.addElem(sArr17[i31], GF2Field.multElem(this.f6343A1[i31][i32], this.pub_scalar[i32]));
                i32++;
            }
            sArr17[i31] = GF2Field.addElem(sArr17[i31], this.f6345b1[i31]);
        }
        this.pub_singular = sArr16;
        this.pub_scalar = sArr17;
        compactPublicKey(sArr15);
    }

    private void generateF() {
        this.layers = new Layer[this.numOfLayers];
        int i = 0;
        while (i < this.numOfLayers) {
            Layer[] layerArr = this.layers;
            int[] iArr = this.f6348vi;
            int i2 = i + 1;
            layerArr[i] = new Layer(iArr[i], iArr[i2], this.f6347sr);
            i = i2;
        }
    }

    private void generateL1() {
        int[] iArr = this.f6348vi;
        int i = iArr[iArr.length - 1] - iArr[0];
        int[] iArr2 = new int[2];
        iArr2[1] = i;
        iArr2[0] = i;
        this.f6343A1 = (short[][]) Array.newInstance(Short.TYPE, iArr2);
        this.A1inv = null;
        ComputeInField computeInField = new ComputeInField();
        while (this.A1inv == null) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < i; i3++) {
                    this.f6343A1[i2][i3] = (short) (this.f6347sr.nextInt() & 255);
                }
            }
            this.A1inv = computeInField.inverse(this.f6343A1);
        }
        this.f6345b1 = new short[i];
        for (int i4 = 0; i4 < i; i4++) {
            this.f6345b1[i4] = (short) (this.f6347sr.nextInt() & 255);
        }
    }

    private void generateL2() {
        int[] iArr = this.f6348vi;
        int i = iArr[iArr.length - 1];
        int[] iArr2 = new int[2];
        iArr2[1] = i;
        iArr2[0] = i;
        this.f6344A2 = (short[][]) Array.newInstance(Short.TYPE, iArr2);
        this.A2inv = null;
        ComputeInField computeInField = new ComputeInField();
        while (this.A2inv == null) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < i; i3++) {
                    this.f6344A2[i2][i3] = (short) (this.f6347sr.nextInt() & 255);
                }
            }
            this.A2inv = computeInField.inverse(this.f6344A2);
        }
        this.f6346b2 = new short[i];
        for (int i4 = 0; i4 < i; i4++) {
            this.f6346b2[i4] = (short) (this.f6347sr.nextInt() & 255);
        }
    }

    private void initializeDefault() {
        initialize(new RainbowKeyGenerationParameters(new SecureRandom(), new RainbowParameters()));
    }

    private void keygen() {
        generateL1();
        generateL2();
        generateF();
        computePublicKey();
    }

    public AsymmetricCipherKeyPair genKeyPair() {
        if (!this.initialized) {
            initializeDefault();
        }
        keygen();
        RainbowPrivateKeyParameters rainbowPrivateKeyParameters = new RainbowPrivateKeyParameters(this.A1inv, this.f6345b1, this.A2inv, this.f6346b2, this.f6348vi, this.layers);
        int[] iArr = this.f6348vi;
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new RainbowPublicKeyParameters(iArr[iArr.length - 1] - iArr[0], this.pub_quadratic, this.pub_singular, this.pub_scalar), (AsymmetricKeyParameter) rainbowPrivateKeyParameters);
    }

    public AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }

    public void init(KeyGenerationParameters keyGenerationParameters) {
        initialize(keyGenerationParameters);
    }

    public void initialize(KeyGenerationParameters keyGenerationParameters) {
        this.rainbowParams = (RainbowKeyGenerationParameters) keyGenerationParameters;
        this.f6347sr = new SecureRandom();
        this.f6348vi = this.rainbowParams.getParameters().getVi();
        this.numOfLayers = this.rainbowParams.getParameters().getNumOfLayers();
        this.initialized = true;
    }
}
