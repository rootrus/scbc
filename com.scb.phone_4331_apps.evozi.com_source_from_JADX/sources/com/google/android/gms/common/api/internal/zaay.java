package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.concurrent.atomic.AtomicReference;

final class zaay implements GoogleApiClient.ConnectionCallbacks {
    private final /* synthetic */ zaaw zagv;
    private final /* synthetic */ StatusPendingResult zahl;
    private final /* synthetic */ AtomicReference zahm;

    zaay(zaaw zaaw, AtomicReference atomicReference, StatusPendingResult statusPendingResult) {
        this.zagv = zaaw;
        this.zahm = atomicReference;
        this.zahl = statusPendingResult;
    }

    public final void onConnectionSuspended(int i) {
    }

    public final void onConnected(Bundle bundle) {
        this.zagv.zaa((GoogleApiClient) this.zahm.get(), this.zahl, true);
    }
}
