package org.bouncycastle.jcajce.provider.asymmetric.p097ec;

import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.NullDigest;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.digests.SHA224Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.signers.ECDSASigner;
import org.bouncycastle.crypto.signers.ECNRSigner;
import org.bouncycastle.crypto.signers.HMacDSAKCalculator;
import org.bouncycastle.jcajce.provider.asymmetric.util.DSABase;
import org.bouncycastle.jcajce.provider.asymmetric.util.DSAEncoder;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.jmrtd.PassportService;

/* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi */
public class SignatureSpi extends DSABase {

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$PlainDSAEncoder */
    static class PlainDSAEncoder implements DSAEncoder {
        private PlainDSAEncoder() {
        }

        private byte[] makeUnsigned(BigInteger bigInteger) {
            byte[] byteArray = bigInteger.toByteArray();
            if (byteArray[0] != 0) {
                return byteArray;
            }
            int length = byteArray.length - 1;
            byte[] bArr = new byte[length];
            System.arraycopy(byteArray, 1, bArr, 0, length);
            return bArr;
        }

        public BigInteger[] decode(byte[] bArr) throws IOException {
            int length = bArr.length / 2;
            byte[] bArr2 = new byte[length];
            int length2 = bArr.length / 2;
            byte[] bArr3 = new byte[length2];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            System.arraycopy(bArr, length, bArr3, 0, length2);
            return new BigInteger[]{new BigInteger(1, bArr2), new BigInteger(1, bArr3)};
        }

        public byte[] encode(BigInteger bigInteger, BigInteger bigInteger2) throws IOException {
            byte[] makeUnsigned = makeUnsigned(bigInteger);
            byte[] makeUnsigned2 = makeUnsigned(bigInteger2);
            int length = (makeUnsigned.length > makeUnsigned2.length ? makeUnsigned.length : makeUnsigned2.length) << 1;
            byte[] bArr = new byte[length];
            System.arraycopy(makeUnsigned, 0, bArr, (length / 2) - makeUnsigned.length, makeUnsigned.length);
            System.arraycopy(makeUnsigned2, 0, bArr, length - makeUnsigned2.length, makeUnsigned2.length);
            return bArr;
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$StdDSAEncoder */
    static class StdDSAEncoder implements DSAEncoder {
        private StdDSAEncoder() {
        }

        public BigInteger[] decode(byte[] bArr) throws IOException {
            ASN1Sequence aSN1Sequence = (ASN1Sequence) ASN1Primitive.fromByteArray(bArr);
            return new BigInteger[]{ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).getValue(), ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1)).getValue()};
        }

        public byte[] encode(BigInteger bigInteger, BigInteger bigInteger2) throws IOException {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            aSN1EncodableVector.add(new ASN1Integer(bigInteger));
            aSN1EncodableVector.add(new ASN1Integer(bigInteger2));
            return new DERSequence(aSN1EncodableVector).getEncoded(ASN1Encoding.DER);
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA */
    public static class ecCVCDSA extends SignatureSpi {
        public ecCVCDSA() {
            super(new SHA1Digest(), new ECDSASigner(), new PlainDSAEncoder());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA224 */
    public static class ecCVCDSA224 extends SignatureSpi {
        public ecCVCDSA224() {
            super(new SHA224Digest(), new ECDSASigner(), new PlainDSAEncoder());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA256 */
    public static class ecCVCDSA256 extends SignatureSpi {
        public ecCVCDSA256() {
            super(new SHA256Digest(), new ECDSASigner(), new PlainDSAEncoder());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA384 */
    public static class ecCVCDSA384 extends SignatureSpi {
        public ecCVCDSA384() {
            super(new SHA384Digest(), new ECDSASigner(), new PlainDSAEncoder());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA512 */
    public static class ecCVCDSA512 extends SignatureSpi {
        public ecCVCDSA512() {
            super(new SHA512Digest(), new ECDSASigner(), new PlainDSAEncoder());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA */
    public static class ecDSA extends SignatureSpi {
        public ecDSA() {
            super(new SHA1Digest(), new ECDSASigner(), new StdDSAEncoder());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA224 */
    public static class ecDSA224 extends SignatureSpi {
        public ecDSA224() {
            super(new SHA224Digest(), new ECDSASigner(), new StdDSAEncoder());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA256 */
    public static class ecDSA256 extends SignatureSpi {
        public ecDSA256() {
            super(new SHA256Digest(), new ECDSASigner(), new StdDSAEncoder());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA384 */
    public static class ecDSA384 extends SignatureSpi {
        public ecDSA384() {
            super(new SHA384Digest(), new ECDSASigner(), new StdDSAEncoder());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA512 */
    public static class ecDSA512 extends SignatureSpi {
        public ecDSA512() {
            super(new SHA512Digest(), new ECDSASigner(), new StdDSAEncoder());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSARipeMD160 */
    public static class ecDSARipeMD160 extends SignatureSpi {
        public ecDSARipeMD160() {
            super(new RIPEMD160Digest(), new ECDSASigner(), new StdDSAEncoder());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSASha3_224 */
    public static class ecDSASha3_224 extends SignatureSpi {
        public ecDSASha3_224() {
            super(new SHA3Digest((int) PassportService.DEFAULT_MAX_BLOCKSIZE), new ECDSASigner(), new StdDSAEncoder());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSASha3_256 */
    public static class ecDSASha3_256 extends SignatureSpi {
        public ecDSASha3_256() {
            super(new SHA3Digest(256), new ECDSASigner(), new StdDSAEncoder());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSASha3_384 */
    public static class ecDSASha3_384 extends SignatureSpi {
        public ecDSASha3_384() {
            super(new SHA3Digest(384), new ECDSASigner(), new StdDSAEncoder());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSASha3_512 */
    public static class ecDSASha3_512 extends SignatureSpi {
        public ecDSASha3_512() {
            super(new SHA3Digest(512), new ECDSASigner(), new StdDSAEncoder());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSAnone */
    public static class ecDSAnone extends SignatureSpi {
        public ecDSAnone() {
            super(new NullDigest(), new ECDSASigner(), new StdDSAEncoder());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA */
    public static class ecDetDSA extends SignatureSpi {
        public ecDetDSA() {
            super(new SHA1Digest(), new ECDSASigner(new HMacDSAKCalculator(new SHA1Digest())), new StdDSAEncoder());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA224 */
    public static class ecDetDSA224 extends SignatureSpi {
        public ecDetDSA224() {
            super(new SHA224Digest(), new ECDSASigner(new HMacDSAKCalculator(new SHA224Digest())), new StdDSAEncoder());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA256 */
    public static class ecDetDSA256 extends SignatureSpi {
        public ecDetDSA256() {
            super(new SHA256Digest(), new ECDSASigner(new HMacDSAKCalculator(new SHA256Digest())), new StdDSAEncoder());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA384 */
    public static class ecDetDSA384 extends SignatureSpi {
        public ecDetDSA384() {
            super(new SHA384Digest(), new ECDSASigner(new HMacDSAKCalculator(new SHA384Digest())), new StdDSAEncoder());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA512 */
    public static class ecDetDSA512 extends SignatureSpi {
        public ecDetDSA512() {
            super(new SHA512Digest(), new ECDSASigner(new HMacDSAKCalculator(new SHA512Digest())), new StdDSAEncoder());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSASha3_224 */
    public static class ecDetDSASha3_224 extends SignatureSpi {
        public ecDetDSASha3_224() {
            super(new SHA3Digest((int) PassportService.DEFAULT_MAX_BLOCKSIZE), new ECDSASigner(new HMacDSAKCalculator(new SHA3Digest((int) PassportService.DEFAULT_MAX_BLOCKSIZE))), new StdDSAEncoder());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSASha3_256 */
    public static class ecDetDSASha3_256 extends SignatureSpi {
        public ecDetDSASha3_256() {
            super(new SHA3Digest(256), new ECDSASigner(new HMacDSAKCalculator(new SHA3Digest(256))), new StdDSAEncoder());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSASha3_384 */
    public static class ecDetDSASha3_384 extends SignatureSpi {
        public ecDetDSASha3_384() {
            super(new SHA3Digest(384), new ECDSASigner(new HMacDSAKCalculator(new SHA3Digest(384))), new StdDSAEncoder());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSASha3_512 */
    public static class ecDetDSASha3_512 extends SignatureSpi {
        public ecDetDSASha3_512() {
            super(new SHA3Digest(512), new ECDSASigner(new HMacDSAKCalculator(new SHA3Digest(512))), new StdDSAEncoder());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR */
    public static class ecNR extends SignatureSpi {
        public ecNR() {
            super(new SHA1Digest(), new ECNRSigner(), new StdDSAEncoder());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR224 */
    public static class ecNR224 extends SignatureSpi {
        public ecNR224() {
            super(new SHA224Digest(), new ECNRSigner(), new StdDSAEncoder());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR256 */
    public static class ecNR256 extends SignatureSpi {
        public ecNR256() {
            super(new SHA256Digest(), new ECNRSigner(), new StdDSAEncoder());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR384 */
    public static class ecNR384 extends SignatureSpi {
        public ecNR384() {
            super(new SHA384Digest(), new ECNRSigner(), new StdDSAEncoder());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR512 */
    public static class ecNR512 extends SignatureSpi {
        public ecNR512() {
            super(new SHA512Digest(), new ECNRSigner(), new StdDSAEncoder());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecPlainDSARP160 */
    public static class ecPlainDSARP160 extends SignatureSpi {
        public ecPlainDSARP160() {
            super(new RIPEMD160Digest(), new ECDSASigner(), new PlainDSAEncoder());
        }
    }

    SignatureSpi(Digest digest, DSA dsa, DSAEncoder dSAEncoder) {
        super(digest, dsa, dSAEncoder);
    }

    /* access modifiers changed from: protected */
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        AsymmetricKeyParameter generatePrivateKeyParameter = ECUtil.generatePrivateKeyParameter(privateKey);
        this.digest.reset();
        if (this.appRandom != null) {
            this.signer.init(true, new ParametersWithRandom(generatePrivateKeyParameter, this.appRandom));
        } else {
            this.signer.init(true, generatePrivateKeyParameter);
        }
    }

    /* access modifiers changed from: protected */
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        AsymmetricKeyParameter generatePublicKeyParameter = ECUtil.generatePublicKeyParameter(publicKey);
        this.digest.reset();
        this.signer.init(false, generatePublicKeyParameter);
    }
}
