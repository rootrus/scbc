package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

final class zaax implements GoogleApiClient.OnConnectionFailedListener {
    private final /* synthetic */ StatusPendingResult zahl;

    zaax(zaaw zaaw, StatusPendingResult statusPendingResult) {
        this.zahl = statusPendingResult;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zahl.setResult(new Status(8));
    }
}
