package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.SRP6GroupParameters;

public class SRP6Server {

    /* renamed from: A */
    protected BigInteger f5658A;

    /* renamed from: B */
    protected BigInteger f5659B;
    protected BigInteger Key;

    /* renamed from: M1 */
    protected BigInteger f5660M1;

    /* renamed from: M2 */
    protected BigInteger f5661M2;

    /* renamed from: N */
    protected BigInteger f5662N;

    /* renamed from: S */
    protected BigInteger f5663S;

    /* renamed from: b */
    protected BigInteger f5664b;
    protected Digest digest;

    /* renamed from: g */
    protected BigInteger f5665g;
    protected SecureRandom random;

    /* renamed from: u */
    protected BigInteger f5666u;

    /* renamed from: v */
    protected BigInteger f5667v;

    private BigInteger calculateS() {
        return this.f5667v.modPow(this.f5666u, this.f5662N).multiply(this.f5658A).mod(this.f5662N).modPow(this.f5664b, this.f5662N);
    }

    public BigInteger calculateSecret(BigInteger bigInteger) throws CryptoException {
        BigInteger validatePublicValue = SRP6Util.validatePublicValue(this.f5662N, bigInteger);
        this.f5658A = validatePublicValue;
        this.f5666u = SRP6Util.calculateU(this.digest, this.f5662N, validatePublicValue, this.f5659B);
        BigInteger calculateS = calculateS();
        this.f5663S = calculateS;
        return calculateS;
    }

    public BigInteger calculateServerEvidenceMessage() throws CryptoException {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.f5658A;
        if (bigInteger3 == null || (bigInteger = this.f5660M1) == null || (bigInteger2 = this.f5663S) == null) {
            throw new CryptoException("Impossible to compute M2: some data are missing from the previous operations (A,M1,S)");
        }
        BigInteger calculateM2 = SRP6Util.calculateM2(this.digest, this.f5662N, bigInteger3, bigInteger, bigInteger2);
        this.f5661M2 = calculateM2;
        return calculateM2;
    }

    public BigInteger calculateSessionKey() throws CryptoException {
        BigInteger bigInteger = this.f5663S;
        if (bigInteger == null || this.f5660M1 == null || this.f5661M2 == null) {
            throw new CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        BigInteger calculateKey = SRP6Util.calculateKey(this.digest, this.f5662N, bigInteger);
        this.Key = calculateKey;
        return calculateKey;
    }

    public BigInteger generateServerCredentials() {
        BigInteger calculateK = SRP6Util.calculateK(this.digest, this.f5662N, this.f5665g);
        this.f5664b = selectPrivateValue();
        BigInteger mod = calculateK.multiply(this.f5667v).mod(this.f5662N).add(this.f5665g.modPow(this.f5664b, this.f5662N)).mod(this.f5662N);
        this.f5659B = mod;
        return mod;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest2, SecureRandom secureRandom) {
        this.f5662N = bigInteger;
        this.f5665g = bigInteger2;
        this.f5667v = bigInteger3;
        this.random = secureRandom;
        this.digest = digest2;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, BigInteger bigInteger, Digest digest2, SecureRandom secureRandom) {
        init(sRP6GroupParameters.getN(), sRP6GroupParameters.getG(), bigInteger, digest2, secureRandom);
    }

    /* access modifiers changed from: protected */
    public BigInteger selectPrivateValue() {
        return SRP6Util.generatePrivateValue(this.digest, this.f5662N, this.f5665g, this.random);
    }

    public boolean verifyClientEvidenceMessage(BigInteger bigInteger) throws CryptoException {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.f5658A;
        if (bigInteger4 == null || (bigInteger2 = this.f5659B) == null || (bigInteger3 = this.f5663S) == null) {
            throw new CryptoException("Impossible to compute and verify M1: some data are missing from the previous operations (A,B,S)");
        } else if (!SRP6Util.calculateM1(this.digest, this.f5662N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        } else {
            this.f5660M1 = bigInteger;
            return true;
        }
    }
}
