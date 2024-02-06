package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.SRP6GroupParameters;

public class SRP6Client {

    /* renamed from: A */
    protected BigInteger f5648A;

    /* renamed from: B */
    protected BigInteger f5649B;
    protected BigInteger Key;

    /* renamed from: M1 */
    protected BigInteger f5650M1;

    /* renamed from: M2 */
    protected BigInteger f5651M2;

    /* renamed from: N */
    protected BigInteger f5652N;

    /* renamed from: S */
    protected BigInteger f5653S;

    /* renamed from: a */
    protected BigInteger f5654a;
    protected Digest digest;

    /* renamed from: g */
    protected BigInteger f5655g;
    protected SecureRandom random;

    /* renamed from: u */
    protected BigInteger f5656u;

    /* renamed from: x */
    protected BigInteger f5657x;

    private BigInteger calculateS() {
        BigInteger calculateK = SRP6Util.calculateK(this.digest, this.f5652N, this.f5655g);
        return this.f5649B.subtract(this.f5655g.modPow(this.f5657x, this.f5652N).multiply(calculateK).mod(this.f5652N)).mod(this.f5652N).modPow(this.f5656u.multiply(this.f5657x).add(this.f5654a), this.f5652N);
    }

    public BigInteger calculateClientEvidenceMessage() throws CryptoException {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.f5648A;
        if (bigInteger3 == null || (bigInteger = this.f5649B) == null || (bigInteger2 = this.f5653S) == null) {
            throw new CryptoException("Impossible to compute M1: some data are missing from the previous operations (A,B,S)");
        }
        BigInteger calculateM1 = SRP6Util.calculateM1(this.digest, this.f5652N, bigInteger3, bigInteger, bigInteger2);
        this.f5650M1 = calculateM1;
        return calculateM1;
    }

    public BigInteger calculateSecret(BigInteger bigInteger) throws CryptoException {
        BigInteger validatePublicValue = SRP6Util.validatePublicValue(this.f5652N, bigInteger);
        this.f5649B = validatePublicValue;
        this.f5656u = SRP6Util.calculateU(this.digest, this.f5652N, this.f5648A, validatePublicValue);
        BigInteger calculateS = calculateS();
        this.f5653S = calculateS;
        return calculateS;
    }

    public BigInteger calculateSessionKey() throws CryptoException {
        BigInteger bigInteger = this.f5653S;
        if (bigInteger == null || this.f5650M1 == null || this.f5651M2 == null) {
            throw new CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        BigInteger calculateKey = SRP6Util.calculateKey(this.digest, this.f5652N, bigInteger);
        this.Key = calculateKey;
        return calculateKey;
    }

    public BigInteger generateClientCredentials(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f5657x = SRP6Util.calculateX(this.digest, this.f5652N, bArr, bArr2, bArr3);
        BigInteger selectPrivateValue = selectPrivateValue();
        this.f5654a = selectPrivateValue;
        BigInteger modPow = this.f5655g.modPow(selectPrivateValue, this.f5652N);
        this.f5648A = modPow;
        return modPow;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, Digest digest2, SecureRandom secureRandom) {
        this.f5652N = bigInteger;
        this.f5655g = bigInteger2;
        this.digest = digest2;
        this.random = secureRandom;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, Digest digest2, SecureRandom secureRandom) {
        init(sRP6GroupParameters.getN(), sRP6GroupParameters.getG(), digest2, secureRandom);
    }

    /* access modifiers changed from: protected */
    public BigInteger selectPrivateValue() {
        return SRP6Util.generatePrivateValue(this.digest, this.f5652N, this.f5655g, this.random);
    }

    public boolean verifyServerEvidenceMessage(BigInteger bigInteger) throws CryptoException {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.f5648A;
        if (bigInteger4 == null || (bigInteger2 = this.f5650M1) == null || (bigInteger3 = this.f5653S) == null) {
            throw new CryptoException("Impossible to compute and verify M2: some data are missing from the previous operations (A,M1,S)");
        } else if (!SRP6Util.calculateM2(this.digest, this.f5652N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        } else {
            this.f5651M2 = bigInteger;
            return true;
        }
    }
}
