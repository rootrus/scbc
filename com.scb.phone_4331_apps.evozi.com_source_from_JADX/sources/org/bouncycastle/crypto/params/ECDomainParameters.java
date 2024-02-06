package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.math.p099ec.ECConstants;
import org.bouncycastle.math.p099ec.ECCurve;
import org.bouncycastle.math.p099ec.ECPoint;
import org.bouncycastle.util.Arrays;

public class ECDomainParameters implements ECConstants {

    /* renamed from: G */
    private ECPoint f6042G;
    private ECCurve curve;

    /* renamed from: h */
    private BigInteger f6043h;

    /* renamed from: n */
    private BigInteger f6044n;
    private byte[] seed;

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger) {
        this(eCCurve, eCPoint, bigInteger, ONE, (byte[]) null);
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        this(eCCurve, eCPoint, bigInteger, bigInteger2, (byte[]) null);
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.curve = eCCurve;
        this.f6042G = eCPoint.normalize();
        this.f6044n = bigInteger;
        this.f6043h = bigInteger2;
        this.seed = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECDomainParameters)) {
            return false;
        }
        ECDomainParameters eCDomainParameters = (ECDomainParameters) obj;
        return this.curve.equals(eCDomainParameters.curve) && this.f6042G.equals(eCDomainParameters.f6042G) && this.f6044n.equals(eCDomainParameters.f6044n) && this.f6043h.equals(eCDomainParameters.f6043h);
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    public ECPoint getG() {
        return this.f6042G;
    }

    public BigInteger getH() {
        return this.f6043h;
    }

    public BigInteger getN() {
        return this.f6044n;
    }

    public byte[] getSeed() {
        return Arrays.clone(this.seed);
    }

    public int hashCode() {
        return (((((this.curve.hashCode() * 37) ^ this.f6042G.hashCode()) * 37) ^ this.f6044n.hashCode()) * 37) ^ this.f6043h.hashCode();
    }
}
