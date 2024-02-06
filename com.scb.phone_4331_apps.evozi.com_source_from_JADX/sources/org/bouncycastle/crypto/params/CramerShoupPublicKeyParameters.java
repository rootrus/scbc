package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class CramerShoupPublicKeyParameters extends CramerShoupKeyParameters {

    /* renamed from: c */
    private BigInteger f6024c;

    /* renamed from: d */
    private BigInteger f6025d;

    /* renamed from: h */
    private BigInteger f6026h;

    public CramerShoupPublicKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        super(false, cramerShoupParameters);
        this.f6024c = bigInteger;
        this.f6025d = bigInteger2;
        this.f6026h = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPublicKeyParameters)) {
            return false;
        }
        CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = (CramerShoupPublicKeyParameters) obj;
        return cramerShoupPublicKeyParameters.getC().equals(this.f6024c) && cramerShoupPublicKeyParameters.getD().equals(this.f6025d) && cramerShoupPublicKeyParameters.getH().equals(this.f6026h) && super.equals(obj);
    }

    public BigInteger getC() {
        return this.f6024c;
    }

    public BigInteger getD() {
        return this.f6025d;
    }

    public BigInteger getH() {
        return this.f6026h;
    }

    public int hashCode() {
        return ((this.f6024c.hashCode() ^ this.f6025d.hashCode()) ^ this.f6026h.hashCode()) ^ super.hashCode();
    }
}
