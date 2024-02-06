package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

public class ElGamalParameters implements CipherParameters {

    /* renamed from: g */
    private BigInteger f6047g;

    /* renamed from: l */
    private int f6048l;

    /* renamed from: p */
    private BigInteger f6049p;

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.f6047g = bigInteger2;
        this.f6049p = bigInteger;
        this.f6048l = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ElGamalParameters)) {
            return false;
        }
        ElGamalParameters elGamalParameters = (ElGamalParameters) obj;
        return elGamalParameters.getP().equals(this.f6049p) && elGamalParameters.getG().equals(this.f6047g) && elGamalParameters.getL() == this.f6048l;
    }

    public BigInteger getG() {
        return this.f6047g;
    }

    public int getL() {
        return this.f6048l;
    }

    public BigInteger getP() {
        return this.f6049p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) + this.f6048l;
    }
}
