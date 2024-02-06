package org.bouncycastle.crypto.p093ec;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.math.p099ec.ECPoint;

/* renamed from: org.bouncycastle.crypto.ec.ECEncryptor */
public interface ECEncryptor {
    ECPair encrypt(ECPoint eCPoint);

    void init(CipherParameters cipherParameters);
}
