package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p067ml.common.FirebaseMLException;
import java.util.concurrent.TimeUnit;

public final class zzpp implements zznm<ResultType, zzpn>, zznw {
    private final zzpq zzawo;
    private final GoogleApiClient zzawp;
    private final /* synthetic */ zzpo zzawq;

    zzpp(zzpo zzpo, FirebaseApp firebaseApp, boolean z) {
        this.zzawq = zzpo;
        if (z) {
            GoogleApiClient build = new GoogleApiClient.Builder(firebaseApp.getApplicationContext()).addApi(AuthProxy.API).build();
            this.zzawp = build;
            build.connect();
        } else {
            this.zzawp = null;
        }
        this.zzawo = zzpq.zza(firebaseApp, z, this.zzawp);
    }

    public final zznw zzlm() {
        return this;
    }

    public final void zzlp() throws FirebaseMLException {
        GoogleApiClient googleApiClient = this.zzawp;
        if (googleApiClient != null && googleApiClient.blockingConnect(3, TimeUnit.SECONDS) != ConnectionResult.RESULT_SUCCESS) {
            throw new FirebaseMLException("Failed to contact Google Play services", 14);
        }
    }

    public final void release() {
        GoogleApiClient googleApiClient = this.zzawp;
        if (googleApiClient != null) {
            googleApiClient.disconnect();
        }
    }

    public final /* synthetic */ Object zza(zznp zznp) throws FirebaseMLException {
        zzpn zzpn = (zzpn) zznp;
        return this.zzawq.zza(this.zzawo.zza(zzpn), zzpn.zzawl);
    }
}
