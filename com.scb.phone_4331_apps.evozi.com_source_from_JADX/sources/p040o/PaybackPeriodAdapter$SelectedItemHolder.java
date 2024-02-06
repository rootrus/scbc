package p040o;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.Arrays;
import java.util.List;
import p064pl.charmas.android.reactivelocation2.observables.GoogleAPIConnectionException;
import p064pl.charmas.android.reactivelocation2.observables.GoogleAPIConnectionSuspendedException;

/* renamed from: o.PaybackPeriodAdapter$SelectedItemHolder */
public abstract class PaybackPeriodAdapter$SelectedItemHolder<T> implements AccountSummaryDeepLinkActivity<T> {
    private final List<Api<? extends Api.ApiOptions.NotRequiredOptions>> IconCompatParcelizer;
    private final Context read;
    private final Handler write;

    /* access modifiers changed from: protected */
    public abstract void read(GoogleApiClient googleApiClient, onOkClick<? super T> onokclick);

    @SafeVarargs
    protected PaybackPeriodAdapter$SelectedItemHolder(TransferToMeStep1Adapter$LocalViewHolder_ViewBinding transferToMeStep1Adapter$LocalViewHolder_ViewBinding, Api<? extends Api.ApiOptions.NotRequiredOptions>... apiArr) {
        this.read = transferToMeStep1Adapter$LocalViewHolder_ViewBinding.write;
        this.write = transferToMeStep1Adapter$LocalViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
        this.IconCompatParcelizer = Arrays.asList(apiArr);
    }

    /* renamed from: o.PaybackPeriodAdapter$SelectedItemHolder$read */
    class read implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
        private final onOkClick<? super T> MediaBrowserCompat$ItemReceiver;
        GoogleApiClient write;

        /* synthetic */ read(PaybackPeriodAdapter$SelectedItemHolder paybackPeriodAdapter$SelectedItemHolder, onOkClick onokclick, byte b) {
            this(onokclick);
        }

        private read(onOkClick<? super T> onokclick) {
            this.MediaBrowserCompat$ItemReceiver = onokclick;
        }

        public final void onConnected(Bundle bundle) {
            try {
                PaybackPeriodAdapter$SelectedItemHolder.this.read(this.write, this.MediaBrowserCompat$ItemReceiver);
            } catch (Throwable th) {
                if (!this.MediaBrowserCompat$ItemReceiver.isDisposed()) {
                    this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(th);
                }
            }
        }

        public final void onConnectionSuspended(int i) {
            if (!this.MediaBrowserCompat$ItemReceiver.isDisposed()) {
                this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver((Throwable) new GoogleAPIConnectionSuspendedException());
            }
        }

        public final void onConnectionFailed(ConnectionResult connectionResult) {
            if (!this.MediaBrowserCompat$ItemReceiver.isDisposed()) {
                this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver((Throwable) new GoogleAPIConnectionException("Error connecting to GoogleApiClient."));
            }
        }
    }

    public final void read(onOkClick<T> onokclick) throws Exception {
        read read2 = new read(this, onokclick, (byte) 0);
        GoogleApiClient.Builder builder = new GoogleApiClient.Builder(this.read);
        for (Api<? extends Api.ApiOptions.NotRequiredOptions> addApi : this.IconCompatParcelizer) {
            builder = builder.addApi(addApi);
        }
        GoogleApiClient.Builder addOnConnectionFailedListener = builder.addConnectionCallbacks(read2).addOnConnectionFailedListener(read2);
        Handler handler = this.write;
        if (handler != null) {
            addOnConnectionFailedListener = addOnConnectionFailedListener.setHandler(handler);
        }
        final GoogleApiClient build = addOnConnectionFailedListener.build();
        read2.write = build;
        try {
            build.connect();
        } catch (Throwable th) {
            if (!onokclick.isDisposed()) {
                onokclick.MediaBrowserCompat$CustomActionResultReceiver(th);
            }
        }
        C69871 r0 = new DataPrivacyManagementDeepLinkActivity(this) {
            public final void read() throws Exception {
                build.disconnect();
            }
        };
        HmlLatestPersonalInformationDeepLinkActivity.write(r0, "run is null");
        onokclick.MediaBrowserCompat$ItemReceiver((BulkTransferDeepLinkActivity) new CardActivationDeepLinkActivity(r0));
    }
}
