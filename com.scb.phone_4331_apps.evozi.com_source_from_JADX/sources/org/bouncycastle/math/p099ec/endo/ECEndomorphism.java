package org.bouncycastle.math.p099ec.endo;

import org.bouncycastle.math.p099ec.ECPointMap;

/* renamed from: org.bouncycastle.math.ec.endo.ECEndomorphism */
public interface ECEndomorphism {
    ECPointMap getPointMap();

    boolean hasEfficientPointMap();
}
