package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.internal.base.zar;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zak extends LifecycleCallback implements DialogInterface.OnCancelListener {
    protected final GoogleApiAvailability zace;
    protected volatile boolean zadh;
    protected final AtomicReference<zam> zadi;
    private final Handler zadj;

    protected zak(LifecycleFragment lifecycleFragment) {
        this(lifecycleFragment, GoogleApiAvailability.getInstance());
    }

    /* access modifiers changed from: protected */
    public abstract void zaa(ConnectionResult connectionResult, int i);

    /* access modifiers changed from: protected */
    public abstract void zam();

    private zak(LifecycleFragment lifecycleFragment, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment);
        this.zadi = new AtomicReference<>((Object) null);
        this.zadj = new zar(Looper.getMainLooper());
        this.zace = googleApiAvailability;
    }

    public void onCancel(DialogInterface dialogInterface) {
        zaa(new ConnectionResult(13, (PendingIntent) null), zaa(this.zadi.get()));
        zao();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.zadi.set(bundle.getBoolean("resolving_error", false) ? new zam(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        zam zam = this.zadi.get();
        if (zam != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", zam.zap());
            bundle.putInt("failed_status", zam.getConnectionResult().getErrorCode());
            bundle.putParcelable("failed_resolution", zam.getConnectionResult().getResolution());
        }
    }

    public void onStart() {
        super.onStart();
        this.zadh = true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        zam zam = this.zadi.get();
        boolean z = false;
        if (i != 1) {
            if (i == 2) {
                int isGooglePlayServicesAvailable = this.zace.isGooglePlayServicesAvailable(getActivity());
                if (isGooglePlayServicesAvailable == 0) {
                    z = true;
                }
                if (zam != null) {
                    if (zam.getConnectionResult().getErrorCode() == 18 && isGooglePlayServicesAvailable == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (i2 == -1) {
            z = true;
        } else if (i2 == 0) {
            int i3 = 13;
            if (intent != null) {
                i3 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
            }
            zam zam2 = new zam(new ConnectionResult(i3, (PendingIntent) null, zam.getConnectionResult().toString()), zaa(zam));
            this.zadi.set(zam2);
            zam = zam2;
        }
        if (z) {
            zao();
        } else if (zam != null) {
            zaa(zam.getConnectionResult(), zam.zap());
        }
    }

    public void onStop() {
        super.onStop();
        this.zadh = false;
    }

    /* access modifiers changed from: protected */
    public final void zao() {
        this.zadi.set((Object) null);
        zam();
    }

    public final void zab(ConnectionResult connectionResult, int i) {
        zam zam = new zam(connectionResult, i);
        if (this.zadi.compareAndSet((Object) null, zam)) {
            this.zadj.post(new zal(this, zam));
        }
    }

    private static int zaa(zam zam) {
        if (zam == null) {
            return -1;
        }
        return zam.zap();
    }
}
