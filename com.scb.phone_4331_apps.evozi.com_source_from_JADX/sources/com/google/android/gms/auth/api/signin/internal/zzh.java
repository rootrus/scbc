package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.internal.p001authapi.zzal;

public final class zzh extends GmsClient<zzv> {
    private final GoogleSignInOptions zzcd;

    public zzh(Context context, Looper looper, ClientSettings clientSettings, GoogleSignInOptions googleSignInOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 91, clientSettings, connectionCallbacks, onConnectionFailedListener);
        GoogleSignInOptions.Builder builder;
        if (googleSignInOptions != null) {
            builder = new GoogleSignInOptions.Builder(googleSignInOptions);
        } else {
            builder = new GoogleSignInOptions.Builder();
        }
        builder.setLogSessionId(zzal.zzr());
        if (!clientSettings.getAllRequestedScopes().isEmpty()) {
            for (Scope requestScopes : clientSettings.getAllRequestedScopes()) {
                builder.requestScopes(requestScopes, new Scope[0]);
            }
        }
        this.zzcd = builder.build();
    }

    public final int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    public final boolean providesSignIn() {
        return true;
    }

    public final Intent getSignInIntent() {
        return zzg.zzc(getContext(), this.zzcd);
    }

    public final GoogleSignInOptions zzj() {
        return this.zzcd;
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof zzv) {
            return (zzv) queryLocalInterface;
        }
        return new zzu(iBinder);
    }
}
