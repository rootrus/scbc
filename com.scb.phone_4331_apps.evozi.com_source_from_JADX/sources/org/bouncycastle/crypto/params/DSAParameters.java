package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

public class DSAParameters implements CipherParameters {

    /* renamed from: g */
    private BigInteger f6037g;

    /* renamed from: p */
    private BigInteger f6038p;

    /* renamed from: q */
    private BigInteger f6039q;
    private DSAValidationParameters validation;

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f6037g = bigInteger3;
        this.f6038p = bigInteger;
        this.f6039q = bigInteger2;
    }

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, DSAValidationParameters dSAValidationParameters) {
        this.f6037g = bigInteger3;
        this.f6038p = bigInteger;
        this.f6039q = bigInteger2;
        this.validation = dSAValidationParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAParameters)) {
            return false;
        }
        DSAParameters dSAParameters = (DSAParameters) obj;
        return dSAParameters.getP().equals(this.f6038p) && dSAParameters.getQ().equals(this.f6039q) && dSAParameters.getG().equals(this.f6037g);
    }

    public BigInteger getG() {
        return this.f6037g;
    }

    public BigInteger getP() {
        return this.f6038p;
    }

    public BigInteger getQ() {
        return this.f6039q;
    }

    public DSAValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getQ().hashCode()) ^ getG().hashCode();
    }
}
