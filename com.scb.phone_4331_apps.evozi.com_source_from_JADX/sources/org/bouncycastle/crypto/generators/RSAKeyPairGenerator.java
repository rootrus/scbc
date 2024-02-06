package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.RSAKeyGenerationParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.math.p099ec.WNafUtil;

public class RSAKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private int iterations;
    private RSAKeyGenerationParameters param;

    private static int getNumberOfIterations(int i, int i2) {
        if (i >= 1536) {
            if (i2 <= 100) {
                return 3;
            }
            if (i2 <= 128) {
                return 4;
            }
            return 4 + (((i2 - 128) + 1) / 2);
        } else if (i >= 1024) {
            if (i2 <= 100) {
                return 4;
            }
            if (i2 <= 112) {
                return 5;
            }
            return (((i2 - 112) + 1) / 2) + 5;
        } else if (i >= 512) {
            if (i2 <= 80) {
                return 5;
            }
            if (i2 <= 100) {
                return 7;
            }
            return (((i2 - 100) + 1) / 2) + 7;
        } else if (i2 > 80) {
            return 40 + (((i2 - 80) + 1) / 2);
        } else {
            return 40;
        }
    }

    /* access modifiers changed from: protected */
    public BigInteger chooseRandomPrime(int i, BigInteger bigInteger, BigInteger bigInteger2) {
        for (int i2 = 0; i2 != i * 5; i2++) {
            BigInteger bigInteger3 = new BigInteger(i, 1, this.param.getRandom());
            if (!bigInteger3.mod(bigInteger).equals(ONE) && bigInteger3.multiply(bigInteger3).compareTo(bigInteger2) >= 0 && isProbablePrime(bigInteger3) && bigInteger.gcd(bigInteger3.subtract(ONE)).equals(ONE)) {
                return bigInteger3;
            }
        }
        throw new IllegalStateException("unable to generate prime number for RSA key");
    }

    public AsymmetricCipherKeyPair generateKeyPair() {
        BigInteger chooseRandomPrime;
        BigInteger chooseRandomPrime2;
        BigInteger multiply;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        int strength = this.param.getStrength();
        int i = (strength + 1) / 2;
        int i2 = strength / 2;
        int i3 = i2 - 100;
        int i4 = strength / 3;
        if (i3 < i4) {
            i3 = i4;
        }
        BigInteger pow = BigInteger.valueOf(2).pow(i2);
        BigInteger shiftLeft = ONE.shiftLeft(strength - 1);
        BigInteger shiftLeft2 = ONE.shiftLeft(i3);
        AsymmetricCipherKeyPair asymmetricCipherKeyPair = null;
        boolean z = false;
        while (!z) {
            BigInteger publicExponent = this.param.getPublicExponent();
            RSAKeyPairGenerator rSAKeyPairGenerator = this;
            do {
                chooseRandomPrime = rSAKeyPairGenerator.chooseRandomPrime(i, publicExponent, shiftLeft);
                while (true) {
                    chooseRandomPrime2 = rSAKeyPairGenerator.chooseRandomPrime(strength - i, publicExponent, shiftLeft);
                    BigInteger abs = chooseRandomPrime2.subtract(chooseRandomPrime).abs();
                    if (abs.bitLength() >= i3 && abs.compareTo(shiftLeft2) > 0) {
                        multiply = chooseRandomPrime.multiply(chooseRandomPrime2);
                        if (multiply.bitLength() == strength) {
                            break;
                        }
                        chooseRandomPrime = chooseRandomPrime.max(chooseRandomPrime2);
                    } else {
                        rSAKeyPairGenerator = this;
                    }
                }
            } while (WNafUtil.getNafWeight(multiply) < (strength >> 2));
            if (chooseRandomPrime.compareTo(chooseRandomPrime2) < 0) {
                bigInteger2 = chooseRandomPrime;
                bigInteger = chooseRandomPrime2;
            } else {
                bigInteger = chooseRandomPrime;
                bigInteger2 = chooseRandomPrime2;
            }
            BigInteger subtract = bigInteger.subtract(ONE);
            BigInteger subtract2 = bigInteger2.subtract(ONE);
            BigInteger modInverse = publicExponent.modInverse(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2));
            if (modInverse.compareTo(pow) > 0) {
                BigInteger remainder = modInverse.remainder(subtract);
                BigInteger remainder2 = modInverse.remainder(subtract2);
                BigInteger modInverse2 = bigInteger2.modInverse(bigInteger);
                RSAKeyParameters rSAKeyParameters = new RSAKeyParameters(false, multiply, publicExponent);
                RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters = r11;
                RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters2 = new RSAPrivateCrtKeyParameters(multiply, publicExponent, modInverse, bigInteger, bigInteger2, remainder, remainder2, modInverse2);
                asymmetricCipherKeyPair = new AsymmetricCipherKeyPair((AsymmetricKeyParameter) rSAKeyParameters, (AsymmetricKeyParameter) rSAPrivateCrtKeyParameters);
                z = true;
            }
        }
        return asymmetricCipherKeyPair;
    }

    public void init(KeyGenerationParameters keyGenerationParameters) {
        RSAKeyGenerationParameters rSAKeyGenerationParameters = (RSAKeyGenerationParameters) keyGenerationParameters;
        this.param = rSAKeyGenerationParameters;
        this.iterations = getNumberOfIterations(rSAKeyGenerationParameters.getStrength(), this.param.getCertainty());
    }

    /* access modifiers changed from: protected */
    public boolean isProbablePrime(BigInteger bigInteger) {
        return !Primes.hasAnySmallFactors(bigInteger) && Primes.isMRProbablePrime(bigInteger, this.param.getRandom(), this.iterations);
    }
}
