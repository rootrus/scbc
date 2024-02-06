package org.bouncycastle.crypto.generators;

import com.google.android.gms.location.places.Place;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.crypto.params.GOST3410ValidationParameters;

public class GOST3410ParametersGenerator {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private SecureRandom init_random;
    private int size;
    private int typeproc;

    private int procedure_A(int i, int i2, BigInteger[] bigIntegerArr, int i3) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        int i4 = i;
        while (true) {
            if (i4 >= 0 && i4 <= 65536) {
                break;
            }
            i4 = this.init_random.nextInt() / 32768;
        }
        int i5 = i2;
        while (true) {
            if (i5 >= 0 && i5 <= 65536 && i5 / 2 != 0) {
                break;
            }
            i5 = (this.init_random.nextInt() / 32768) + 1;
        }
        BigInteger bigInteger4 = new BigInteger(Integer.toString(i5));
        BigInteger bigInteger5 = new BigInteger("19381");
        BigInteger bigInteger6 = new BigInteger(Integer.toString(i4));
        int i6 = 0;
        BigInteger[] bigIntegerArr2 = {bigInteger6};
        int[] iArr = {i3};
        int i7 = 0;
        int i8 = 0;
        while (iArr[i7] >= 17) {
            int length = iArr.length + 1;
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            iArr = new int[length];
            System.arraycopy(iArr2, 0, iArr, 0, length);
            i8 = i7 + 1;
            iArr[i8] = iArr[i7] / 2;
            i7 = i8;
        }
        BigInteger[] bigIntegerArr3 = new BigInteger[(i8 + 1)];
        int i9 = 16;
        bigIntegerArr3[i8] = new BigInteger("8003", 16);
        int i10 = i8 - 1;
        int i11 = 0;
        while (true) {
            if (i11 >= i8) {
                bigInteger = bigIntegerArr2[i6];
                break;
            }
            int i12 = iArr[i10] / i9;
            while (true) {
                int length2 = bigIntegerArr2.length;
                BigInteger[] bigIntegerArr4 = new BigInteger[length2];
                System.arraycopy(bigIntegerArr2, i6, bigIntegerArr4, i6, bigIntegerArr2.length);
                bigIntegerArr2 = new BigInteger[(i12 + 1)];
                System.arraycopy(bigIntegerArr4, i6, bigIntegerArr2, i6, length2);
                int i13 = i6;
                while (i13 < i12) {
                    int i14 = i13 + 1;
                    bigIntegerArr2[i14] = bigIntegerArr2[i13].multiply(bigInteger5).add(bigInteger4).mod(TWO.pow(i9));
                    i13 = i14;
                }
                BigInteger bigInteger7 = new BigInteger("0");
                for (int i15 = i6; i15 < i12; i15++) {
                    bigInteger7 = bigInteger7.add(bigIntegerArr2[i15].multiply(TWO.pow(i15 << 4)));
                }
                bigIntegerArr2[i6] = bigIntegerArr2[i12];
                int i16 = i10 + 1;
                BigInteger add = TWO.pow(iArr[i10] - 1).divide(bigIntegerArr3[i16]).add(TWO.pow(iArr[i10] - 1).multiply(bigInteger7).divide(bigIntegerArr3[i16].multiply(TWO.pow(i12 << 4))));
                if (add.mod(TWO).compareTo(ONE) == 0) {
                    add = add.add(ONE);
                }
                int i17 = 0;
                while (true) {
                    long j = (long) i17;
                    bigInteger2 = bigInteger4;
                    bigIntegerArr3[i10] = bigIntegerArr3[i16].multiply(add.add(BigInteger.valueOf(j))).add(ONE);
                    bigInteger3 = bigInteger5;
                    if (bigIntegerArr3[i10].compareTo(TWO.pow(iArr[i10])) != 1) {
                        if (TWO.modPow(bigIntegerArr3[i16].multiply(add.add(BigInteger.valueOf(j))), bigIntegerArr3[i10]).compareTo(ONE) == 0 && TWO.modPow(add.add(BigInteger.valueOf(j)), bigIntegerArr3[i10]).compareTo(ONE) != 0) {
                            break;
                        }
                        i17 += 2;
                        bigInteger4 = bigInteger2;
                        bigInteger5 = bigInteger3;
                    } else {
                        break;
                    }
                }
                bigInteger4 = bigInteger2;
                bigInteger5 = bigInteger3;
                i6 = 0;
                i9 = 16;
            }
            i10--;
            if (i10 < 0) {
                bigIntegerArr[0] = bigIntegerArr3[0];
                bigIntegerArr[1] = bigIntegerArr3[1];
                bigInteger = bigIntegerArr2[0];
                break;
            }
            i11++;
            bigInteger4 = bigInteger2;
            bigInteger5 = bigInteger3;
            i6 = 0;
            i9 = 16;
        }
        return bigInteger.intValue();
    }

    private long procedure_Aa(long j, long j2, BigInteger[] bigIntegerArr, int i) {
        int i2;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        long j3 = j;
        while (true) {
            i2 = 1;
            if (j3 >= 0 && j3 <= 4294967296L) {
                break;
            }
            j3 = (long) (this.init_random.nextInt() << 1);
        }
        long j4 = j2;
        while (true) {
            if (j4 >= 0 && j4 <= 4294967296L && j4 / 2 != 0) {
                break;
            }
            i2 = 1;
            j4 = (long) ((this.init_random.nextInt() << 1) + 1);
        }
        BigInteger bigInteger4 = new BigInteger(Long.toString(j4));
        BigInteger bigInteger5 = new BigInteger("97781173");
        BigInteger[] bigIntegerArr2 = new BigInteger[i2];
        BigInteger bigInteger6 = new BigInteger(Long.toString(j3));
        int i3 = 0;
        bigIntegerArr2[0] = bigInteger6;
        int[] iArr = new int[i2];
        iArr[0] = i;
        int i4 = 0;
        int i5 = 0;
        while (iArr[i4] >= 33) {
            int length = iArr.length + i2;
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            iArr = new int[length];
            System.arraycopy(iArr2, 0, iArr, 0, length);
            i5 = i4 + 1;
            iArr[i5] = iArr[i4] / 2;
            i4 = i5;
        }
        BigInteger[] bigIntegerArr3 = new BigInteger[(i5 + 1)];
        bigIntegerArr3[i5] = new BigInteger("8000000B", 16);
        int i6 = i5 - 1;
        int i7 = 0;
        while (true) {
            if (i7 >= i5) {
                bigInteger = bigIntegerArr2[i3];
                break;
            }
            int i8 = 32;
            int i9 = iArr[i6] / 32;
            while (true) {
                int length2 = bigIntegerArr2.length;
                BigInteger[] bigIntegerArr4 = new BigInteger[length2];
                System.arraycopy(bigIntegerArr2, i3, bigIntegerArr4, i3, bigIntegerArr2.length);
                bigIntegerArr2 = new BigInteger[(i9 + 1)];
                System.arraycopy(bigIntegerArr4, i3, bigIntegerArr2, i3, length2);
                int i10 = i3;
                while (i10 < i9) {
                    int i11 = i10 + 1;
                    bigIntegerArr2[i11] = bigIntegerArr2[i10].multiply(bigInteger5).add(bigInteger4).mod(TWO.pow(i8));
                    i10 = i11;
                }
                BigInteger bigInteger7 = new BigInteger("0");
                for (int i12 = i3; i12 < i9; i12++) {
                    bigInteger7 = bigInteger7.add(bigIntegerArr2[i12].multiply(TWO.pow(i12 << 5)));
                }
                bigIntegerArr2[i3] = bigIntegerArr2[i9];
                int i13 = i6 + 1;
                BigInteger add = TWO.pow(iArr[i6] - 1).divide(bigIntegerArr3[i13]).add(TWO.pow(iArr[i6] - 1).multiply(bigInteger7).divide(bigIntegerArr3[i13].multiply(TWO.pow(i9 << 5))));
                if (add.mod(TWO).compareTo(ONE) == 0) {
                    add = add.add(ONE);
                }
                int i14 = 0;
                while (true) {
                    long j5 = (long) i14;
                    bigInteger2 = bigInteger4;
                    bigIntegerArr3[i6] = bigIntegerArr3[i13].multiply(add.add(BigInteger.valueOf(j5))).add(ONE);
                    bigInteger3 = bigInteger5;
                    if (bigIntegerArr3[i6].compareTo(TWO.pow(iArr[i6])) != 1) {
                        if (TWO.modPow(bigIntegerArr3[i13].multiply(add.add(BigInteger.valueOf(j5))), bigIntegerArr3[i6]).compareTo(ONE) == 0 && TWO.modPow(add.add(BigInteger.valueOf(j5)), bigIntegerArr3[i6]).compareTo(ONE) != 0) {
                            break;
                        }
                        i14 += 2;
                        bigInteger4 = bigInteger2;
                        bigInteger5 = bigInteger3;
                    } else {
                        break;
                    }
                }
                bigInteger4 = bigInteger2;
                bigInteger5 = bigInteger3;
                i3 = 0;
                i8 = 32;
            }
            i6--;
            if (i6 < 0) {
                bigIntegerArr[0] = bigIntegerArr3[0];
                bigIntegerArr[1] = bigIntegerArr3[1];
                bigInteger = bigIntegerArr2[0];
                break;
            }
            i7++;
            bigInteger4 = bigInteger2;
            bigInteger5 = bigInteger3;
            i3 = 0;
        }
        return bigInteger.longValue();
    }

    private void procedure_B(int i, int i2, BigInteger[] bigIntegerArr) {
        int i3 = i;
        while (true) {
            if (i3 >= 0 && i3 <= 65536) {
                break;
            }
            i3 = this.init_random.nextInt() / 32768;
        }
        int i4 = i2;
        while (true) {
            if (i4 >= 0 && i4 <= 65536 && i4 / 2 != 0) {
                break;
            }
            i4 = (this.init_random.nextInt() / 32768) + 1;
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[2];
        BigInteger bigInteger = new BigInteger(Integer.toString(i4));
        BigInteger bigInteger2 = new BigInteger("19381");
        int procedure_A = procedure_A(i3, i4, bigIntegerArr2, 256);
        BigInteger bigInteger3 = bigIntegerArr2[0];
        int procedure_A2 = procedure_A(procedure_A, i4, bigIntegerArr2, 512);
        BigInteger bigInteger4 = bigIntegerArr2[0];
        BigInteger[] bigIntegerArr3 = new BigInteger[65];
        bigIntegerArr3[0] = new BigInteger(Integer.toString(procedure_A2));
        while (true) {
            int i5 = 0;
            while (i5 < 64) {
                int i6 = i5 + 1;
                bigIntegerArr3[i6] = bigIntegerArr3[i5].multiply(bigInteger2).add(bigInteger).mod(TWO.pow(16));
                i5 = i6;
            }
            BigInteger bigInteger5 = new BigInteger("0");
            for (int i7 = 0; i7 < 64; i7++) {
                bigInteger5 = bigInteger5.add(bigIntegerArr3[i7].multiply(TWO.pow(i7 << 4)));
            }
            bigIntegerArr3[0] = bigIntegerArr3[64];
            int i8 = 1024;
            BigInteger add = TWO.pow(Place.TYPE_SUBLOCALITY_LEVEL_1).divide(bigInteger3.multiply(bigInteger4)).add(TWO.pow(Place.TYPE_SUBLOCALITY_LEVEL_1).multiply(bigInteger5).divide(bigInteger3.multiply(bigInteger4).multiply(TWO.pow(1024))));
            if (add.mod(TWO).compareTo(ONE) == 0) {
                add = add.add(ONE);
            }
            int i9 = 0;
            while (true) {
                long j = (long) i9;
                BigInteger add2 = bigInteger3.multiply(bigInteger4).multiply(add.add(BigInteger.valueOf(j))).add(ONE);
                if (add2.compareTo(TWO.pow(i8)) != 1) {
                    if (TWO.modPow(bigInteger3.multiply(bigInteger4).multiply(add.add(BigInteger.valueOf(j))), add2).compareTo(ONE) != 0 || TWO.modPow(bigInteger3.multiply(add.add(BigInteger.valueOf(j))), add2).compareTo(ONE) == 0) {
                        i9 += 2;
                        i8 = 1024;
                    } else {
                        bigIntegerArr[0] = add2;
                        bigIntegerArr[1] = bigInteger3;
                        return;
                    }
                }
            }
        }
    }

    private void procedure_Bb(long j, long j2, BigInteger[] bigIntegerArr) {
        long j3 = j;
        while (true) {
            if (j3 >= 0 && j3 <= 4294967296L) {
                break;
            }
            j3 = (long) (this.init_random.nextInt() << 1);
        }
        long j4 = j2;
        while (true) {
            if (j4 >= 0 && j4 <= 4294967296L && j4 / 2 != 0) {
                break;
            }
            j4 = (long) ((this.init_random.nextInt() << 1) + 1);
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[2];
        BigInteger bigInteger = new BigInteger(Long.toString(j4));
        BigInteger bigInteger2 = new BigInteger("97781173");
        long j5 = j4;
        BigInteger[] bigIntegerArr3 = bigIntegerArr2;
        long procedure_Aa = procedure_Aa(j3, j5, bigIntegerArr3, 256);
        BigInteger bigInteger3 = bigIntegerArr2[0];
        long procedure_Aa2 = procedure_Aa(procedure_Aa, j5, bigIntegerArr3, 512);
        BigInteger bigInteger4 = bigIntegerArr2[0];
        BigInteger[] bigIntegerArr4 = new BigInteger[33];
        bigIntegerArr4[0] = new BigInteger(Long.toString(procedure_Aa2));
        while (true) {
            int i = 0;
            while (i < 32) {
                int i2 = i + 1;
                bigIntegerArr4[i2] = bigIntegerArr4[i].multiply(bigInteger2).add(bigInteger).mod(TWO.pow(32));
                i = i2;
            }
            BigInteger bigInteger5 = new BigInteger("0");
            for (int i3 = 0; i3 < 32; i3++) {
                bigInteger5 = bigInteger5.add(bigIntegerArr4[i3].multiply(TWO.pow(i3 << 5)));
            }
            bigIntegerArr4[0] = bigIntegerArr4[32];
            int i4 = 1024;
            BigInteger add = TWO.pow(Place.TYPE_SUBLOCALITY_LEVEL_1).divide(bigInteger3.multiply(bigInteger4)).add(TWO.pow(Place.TYPE_SUBLOCALITY_LEVEL_1).multiply(bigInteger5).divide(bigInteger3.multiply(bigInteger4).multiply(TWO.pow(1024))));
            if (add.mod(TWO).compareTo(ONE) == 0) {
                add = add.add(ONE);
            }
            int i5 = 0;
            while (true) {
                long j6 = (long) i5;
                BigInteger add2 = bigInteger3.multiply(bigInteger4).multiply(add.add(BigInteger.valueOf(j6))).add(ONE);
                if (add2.compareTo(TWO.pow(i4)) != 1) {
                    if (TWO.modPow(bigInteger3.multiply(bigInteger4).multiply(add.add(BigInteger.valueOf(j6))), add2).compareTo(ONE) != 0 || TWO.modPow(bigInteger3.multiply(add.add(BigInteger.valueOf(j6))), add2).compareTo(ONE) == 0) {
                        i5 += 2;
                        i4 = 1024;
                    } else {
                        bigIntegerArr[0] = add2;
                        bigIntegerArr[1] = bigInteger3;
                        return;
                    }
                }
            }
        }
    }

    private BigInteger procedure_C(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger subtract = bigInteger.subtract(ONE);
        BigInteger divide = subtract.divide(bigInteger2);
        int bitLength = bigInteger.bitLength();
        while (true) {
            BigInteger bigInteger3 = new BigInteger(bitLength, this.init_random);
            if (bigInteger3.compareTo(ONE) > 0 && bigInteger3.compareTo(subtract) < 0) {
                BigInteger modPow = bigInteger3.modPow(divide, bigInteger);
                if (modPow.compareTo(ONE) != 0) {
                    return modPow;
                }
            }
        }
    }

    public GOST3410Parameters generateParameters() {
        BigInteger[] bigIntegerArr = new BigInteger[2];
        if (this.typeproc == 1) {
            int nextInt = this.init_random.nextInt();
            int nextInt2 = this.init_random.nextInt();
            int i = this.size;
            if (i == 512) {
                procedure_A(nextInt, nextInt2, bigIntegerArr, 512);
            } else if (i == 1024) {
                procedure_B(nextInt, nextInt2, bigIntegerArr);
            } else {
                throw new IllegalArgumentException("Ooops! key size 512 or 1024 bit.");
            }
            BigInteger bigInteger = bigIntegerArr[0];
            BigInteger bigInteger2 = bigIntegerArr[1];
            return new GOST3410Parameters(bigInteger, bigInteger2, procedure_C(bigInteger, bigInteger2), new GOST3410ValidationParameters(nextInt, nextInt2));
        }
        long nextLong = this.init_random.nextLong();
        long nextLong2 = this.init_random.nextLong();
        int i2 = this.size;
        if (i2 == 512) {
            procedure_Aa(nextLong, nextLong2, bigIntegerArr, 512);
        } else if (i2 == 1024) {
            procedure_Bb(nextLong, nextLong2, bigIntegerArr);
        } else {
            throw new IllegalStateException("Ooops! key size 512 or 1024 bit.");
        }
        BigInteger bigInteger3 = bigIntegerArr[0];
        BigInteger bigInteger4 = bigIntegerArr[1];
        return new GOST3410Parameters(bigInteger3, bigInteger4, procedure_C(bigInteger3, bigInteger4), new GOST3410ValidationParameters(nextLong, nextLong2));
    }

    public void init(int i, int i2, SecureRandom secureRandom) {
        this.size = i;
        this.typeproc = i2;
        this.init_random = secureRandom;
    }
}
