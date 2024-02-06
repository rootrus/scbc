package com.google.android.gms.common.api.internal;

import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

public class zaag extends GoogleApiClient {
    private final String zafx;

    public zaag(String str) {
        this.zafx = str;
    }

    public boolean hasConnectedApi(Api<?> api) {
        throw new UnsupportedOperationException(this.zafx);
    }

    public ConnectionResult getConnectionResult(Api<?> api) {
        throw new UnsupportedOperationException(this.zafx);
    }

    public void connect() {
        throw new UnsupportedOperationException(this.zafx);
    }

    public ConnectionResult blockingConnect() {
        throw new UnsupportedOperationException(this.zafx);
    }

    public ConnectionResult blockingConnect(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(this.zafx);
    }

    public void disconnect() {
        throw new UnsupportedOperationException(this.zafx);
    }

    public void reconnect() {
        throw new UnsupportedOperationException(this.zafx);
    }

    public PendingResult<Status> clearDefaultAccountAndReconnect() {
        throw new UnsupportedOperationException(this.zafx);
    }

    public void stopAutoManage(FragmentActivity fragmentActivity) {
        throw new UnsupportedOperationException(this.zafx);
    }

    public boolean isConnected() {
        throw new UnsupportedOperationException(this.zafx);
    }

    public boolean isConnecting() {
        throw new UnsupportedOperationException(this.zafx);
    }

    public void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        throw new UnsupportedOperationException(this.zafx);
    }

    public boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        throw new UnsupportedOperationException(this.zafx);
    }

    public void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        throw new UnsupportedOperationException(this.zafx);
    }

    public void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        throw new UnsupportedOperationException(this.zafx);
    }

    public boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        throw new UnsupportedOperationException(this.zafx);
    }

    public void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        throw new UnsupportedOperationException(this.zafx);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        throw new UnsupportedOperationException(this.zafx);
    }
}
