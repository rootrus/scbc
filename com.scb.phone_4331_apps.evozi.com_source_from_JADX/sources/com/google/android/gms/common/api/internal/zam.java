package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

final class zam {
    private final int zadm;
    private final ConnectionResult zadn;

    zam(ConnectionResult connectionResult, int i) {
        Preconditions.checkNotNull(connectionResult);
        this.zadn = connectionResult;
        this.zadm = i;
    }

    /* access modifiers changed from: package-private */
    public final int zap() {
        return this.zadm;
    }

    /* access modifiers changed from: package-private */
    public final ConnectionResult getConnectionResult() {
        return this.zadn;
    }
}
