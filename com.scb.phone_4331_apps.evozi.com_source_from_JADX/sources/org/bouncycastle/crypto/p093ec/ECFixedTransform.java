package org.bouncycastle.crypto.p093ec;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.math.p099ec.ECMultiplier;
import org.bouncycastle.math.p099ec.ECPoint;
import org.bouncycastle.math.p099ec.FixedPointCombMultiplier;

/* renamed from: org.bouncycastle.crypto.ec.ECFixedTransform */
public class ECFixedTransform implements ECPairFactorTransform {

    /* renamed from: k */
    private BigInteger f5802k;
    private ECPublicKeyParameters key;

    public ECFixedTransform(BigInteger bigInteger) {
        this.f5802k = bigInteger;
    }

    /* access modifiers changed from: protected */
    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    public BigInteger getTransformValue() {
        return this.f5802k;
    }

    public void init(CipherParameters cipherParameters) {
        if (cipherParameters instanceof ECPublicKeyParameters) {
            this.key = (ECPublicKeyParameters) cipherParameters;
            return;
        }
        throw new IllegalArgumentException("ECPublicKeyParameters are required for fixed transform.");
    }

    public ECPair transform(ECPair eCPair) {
        ECPublicKeyParameters eCPublicKeyParameters = this.key;
        if (eCPublicKeyParameters != null) {
            ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
            BigInteger n = parameters.getN();
            ECMultiplier createBasePointMultiplier = createBasePointMultiplier();
            BigInteger mod = this.f5802k.mod(n);
            ECPoint[] eCPointArr = {createBasePointMultiplier.multiply(parameters.getG(), mod).add(eCPair.getX()), this.key.getQ().multiply(mod).add(eCPair.getY())};
            parameters.getCurve().normalizeAll(eCPointArr);
            return new ECPair(eCPointArr[0], eCPointArr[1]);
        }
        throw new IllegalStateException("ECFixedTransform not initialised");
    }
}
