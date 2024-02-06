package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;

public final class zap implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    public final Api<?> mApi;
    private final boolean zaee;
    private zar zaef;

    public zap(Api<?> api, boolean z) {
        this.mApi = api;
        this.zaee = z;
    }

    public final void onConnected(Bundle bundle) {
        zat();
        this.zaef.onConnected(bundle);
    }

    public final void onConnectionSuspended(int i) {
        zat();
        this.zaef.onConnectionSuspended(i);
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zat();
        this.zaef.zaa(connectionResult, this.mApi, this.zaee);
    }

    public final void zaa(zar zar) {
        this.zaef = zar;
    }

    private final void zat() {
        Preconditions.checkNotNull(this.zaef, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }
}
