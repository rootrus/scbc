package org.bouncycastle.math.p099ec.endo;

import java.math.BigInteger;

/* renamed from: org.bouncycastle.math.ec.endo.GLVEndomorphism */
public interface GLVEndomorphism extends ECEndomorphism {
    BigInteger[] decomposeScalar(BigInteger bigInteger);
}
