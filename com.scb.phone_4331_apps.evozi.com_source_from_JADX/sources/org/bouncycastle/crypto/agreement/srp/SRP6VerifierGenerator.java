package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.SRP6GroupParameters;

public class SRP6VerifierGenerator {

    /* renamed from: N */
    protected BigInteger f5668N;
    protected Digest digest;

    /* renamed from: g */
    protected BigInteger f5669g;

    public BigInteger generateVerifier(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.f5669g.modPow(SRP6Util.calculateX(this.digest, this.f5668N, bArr, bArr2, bArr3), this.f5668N);
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, Digest digest2) {
        this.f5668N = bigInteger;
        this.f5669g = bigInteger2;
        this.digest = digest2;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, Digest digest2) {
        this.f5668N = sRP6GroupParameters.getN();
        this.f5669g = sRP6GroupParameters.getG();
        this.digest = digest2;
    }
}
