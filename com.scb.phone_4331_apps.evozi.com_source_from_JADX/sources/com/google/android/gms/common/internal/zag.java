package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient;

final class zag implements BaseGmsClient.BaseOnConnectionFailedListener {
    private final /* synthetic */ OnConnectionFailedListener zapc;

    zag(OnConnectionFailedListener onConnectionFailedListener) {
        this.zapc = onConnectionFailedListener;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zapc.onConnectionFailed(connectionResult);
    }
}
