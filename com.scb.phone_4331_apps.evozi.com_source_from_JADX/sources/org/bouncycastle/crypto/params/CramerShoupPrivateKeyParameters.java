package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class CramerShoupPrivateKeyParameters extends CramerShoupKeyParameters {

    /* renamed from: pk */
    private CramerShoupPublicKeyParameters f6018pk;

    /* renamed from: x1 */
    private BigInteger f6019x1;

    /* renamed from: x2 */
    private BigInteger f6020x2;

    /* renamed from: y1 */
    private BigInteger f6021y1;

    /* renamed from: y2 */
    private BigInteger f6022y2;

    /* renamed from: z */
    private BigInteger f6023z;

    public CramerShoupPrivateKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        super(true, cramerShoupParameters);
        this.f6019x1 = bigInteger;
        this.f6020x2 = bigInteger2;
        this.f6021y1 = bigInteger3;
        this.f6022y2 = bigInteger4;
        this.f6023z = bigInteger5;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPrivateKeyParameters)) {
            return false;
        }
        CramerShoupPrivateKeyParameters cramerShoupPrivateKeyParameters = (CramerShoupPrivateKeyParameters) obj;
        return cramerShoupPrivateKeyParameters.getX1().equals(this.f6019x1) && cramerShoupPrivateKeyParameters.getX2().equals(this.f6020x2) && cramerShoupPrivateKeyParameters.getY1().equals(this.f6021y1) && cramerShoupPrivateKeyParameters.getY2().equals(this.f6022y2) && cramerShoupPrivateKeyParameters.getZ().equals(this.f6023z) && super.equals(obj);
    }

    public CramerShoupPublicKeyParameters getPk() {
        return this.f6018pk;
    }

    public BigInteger getX1() {
        return this.f6019x1;
    }

    public BigInteger getX2() {
        return this.f6020x2;
    }

    public BigInteger getY1() {
        return this.f6021y1;
    }

    public BigInteger getY2() {
        return this.f6022y2;
    }

    public BigInteger getZ() {
        return this.f6023z;
    }

    public int hashCode() {
        return ((((this.f6019x1.hashCode() ^ this.f6020x2.hashCode()) ^ this.f6021y1.hashCode()) ^ this.f6022y2.hashCode()) ^ this.f6023z.hashCode()) ^ super.hashCode();
    }

    public void setPk(CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters) {
        this.f6018pk = cramerShoupPublicKeyParameters;
    }
}
