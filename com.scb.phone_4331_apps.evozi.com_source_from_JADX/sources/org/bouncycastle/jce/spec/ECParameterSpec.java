package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.math.p099ec.ECCurve;
import org.bouncycastle.math.p099ec.ECPoint;

public class ECParameterSpec implements AlgorithmParameterSpec {

    /* renamed from: G */
    private ECPoint f6143G;
    private ECCurve curve;

    /* renamed from: h */
    private BigInteger f6144h;

    /* renamed from: n */
    private BigInteger f6145n;
    private byte[] seed;

    public ECParameterSpec(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger) {
        this.curve = eCCurve;
        this.f6143G = eCPoint.normalize();
        this.f6145n = bigInteger;
        this.f6144h = BigInteger.valueOf(1);
        this.seed = null;
    }

    public ECParameterSpec(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        this.curve = eCCurve;
        this.f6143G = eCPoint.normalize();
        this.f6145n = bigInteger;
        this.f6144h = bigInteger2;
        this.seed = null;
    }

    public ECParameterSpec(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.curve = eCCurve;
        this.f6143G = eCPoint.normalize();
        this.f6145n = bigInteger;
        this.f6144h = bigInteger2;
        this.seed = bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ECParameterSpec)) {
            return false;
        }
        ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
        return getCurve().equals(eCParameterSpec.getCurve()) && getG().equals(eCParameterSpec.getG());
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    public ECPoint getG() {
        return this.f6143G;
    }

    public BigInteger getH() {
        return this.f6144h;
    }

    public BigInteger getN() {
        return this.f6145n;
    }

    public byte[] getSeed() {
        return this.seed;
    }

    public int hashCode() {
        return getCurve().hashCode() ^ getG().hashCode();
    }
}
