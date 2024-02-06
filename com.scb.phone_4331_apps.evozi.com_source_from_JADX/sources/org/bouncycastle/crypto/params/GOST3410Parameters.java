package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

public class GOST3410Parameters implements CipherParameters {

    /* renamed from: a */
    private BigInteger f6052a;

    /* renamed from: p */
    private BigInteger f6053p;

    /* renamed from: q */
    private BigInteger f6054q;
    private GOST3410ValidationParameters validation;

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f6053p = bigInteger;
        this.f6054q = bigInteger2;
        this.f6052a = bigInteger3;
    }

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, GOST3410ValidationParameters gOST3410ValidationParameters) {
        this.f6052a = bigInteger3;
        this.f6053p = bigInteger;
        this.f6054q = bigInteger2;
        this.validation = gOST3410ValidationParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410Parameters)) {
            return false;
        }
        GOST3410Parameters gOST3410Parameters = (GOST3410Parameters) obj;
        return gOST3410Parameters.getP().equals(this.f6053p) && gOST3410Parameters.getQ().equals(this.f6054q) && gOST3410Parameters.getA().equals(this.f6052a);
    }

    public BigInteger getA() {
        return this.f6052a;
    }

    public BigInteger getP() {
        return this.f6053p;
    }

    public BigInteger getQ() {
        return this.f6054q;
    }

    public GOST3410ValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (this.f6053p.hashCode() ^ this.f6054q.hashCode()) ^ this.f6052a.hashCode();
    }
}
