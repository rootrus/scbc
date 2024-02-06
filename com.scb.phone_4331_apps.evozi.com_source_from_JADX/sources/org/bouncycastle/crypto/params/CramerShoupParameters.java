package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;

public class CramerShoupParameters implements CipherParameters {

    /* renamed from: H */
    private Digest f6014H;

    /* renamed from: g1 */
    private BigInteger f6015g1;

    /* renamed from: g2 */
    private BigInteger f6016g2;

    /* renamed from: p */
    private BigInteger f6017p;

    public CramerShoupParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest) {
        this.f6017p = bigInteger;
        this.f6015g1 = bigInteger2;
        this.f6016g2 = bigInteger3;
        this.f6014H = digest;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAParameters)) {
            return false;
        }
        CramerShoupParameters cramerShoupParameters = (CramerShoupParameters) obj;
        return cramerShoupParameters.getP().equals(this.f6017p) && cramerShoupParameters.getG1().equals(this.f6015g1) && cramerShoupParameters.getG2().equals(this.f6016g2);
    }

    public BigInteger getG1() {
        return this.f6015g1;
    }

    public BigInteger getG2() {
        return this.f6016g2;
    }

    public Digest getH() {
        this.f6014H.reset();
        return this.f6014H;
    }

    public BigInteger getP() {
        return this.f6017p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG1().hashCode()) ^ getG2().hashCode();
    }
}
