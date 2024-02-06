package org.bouncycastle.jce.interfaces;

import java.security.PublicKey;
import org.bouncycastle.math.p099ec.ECPoint;

public interface ECPublicKey extends ECKey, PublicKey {
    ECPoint getQ();
}
