package p040o;

import com.thunderhead.android.infrastructure.server.responses.BaseResponse;
import com.thunderhead.connectivity.NetworkOperationCallback;
import com.thunderhead.connectivity.NetworkOperationError;

/* renamed from: o.BaseAmortizationActivity_ViewBinding */
public final class BaseAmortizationActivity_ViewBinding<T extends BaseResponse> implements NetworkOperationCallback<T> {
    private ECouponCommonActivity_ViewBinding IconCompatParcelizer;
    private long MediaBrowserCompat$ItemReceiver = -1;
    private ConfirmRedemptionActivity read;

    public BaseAmortizationActivity_ViewBinding(ECouponCommonActivity_ViewBinding eCouponCommonActivity_ViewBinding, ConfirmRedemptionActivity confirmRedemptionActivity, long j) {
        this.IconCompatParcelizer = eCouponCommonActivity_ViewBinding;
        this.read = confirmRedemptionActivity;
        this.MediaBrowserCompat$ItemReceiver = j;
    }

    public final void onFailure(NetworkOperationError networkOperationError) {
        if (networkOperationError != null) {
            this.read.read("OfflineTrackInteraction", networkOperationError);
        }
        FragmentBuilder_BindRtpEBillPaymentDetailFragment expandedFormat = FragmentBuilder_BindHmlIssuerLandingFragment.setExpandedFormat();
        boolean z = false;
        if (networkOperationError == null || (networkOperationError.getHttpStatusCode() < 500 && !networkOperationError.getMessage().contains("Network is unreachable") && !networkOperationError.getMessage().contains("Unexpected response code for CONNECT: 503") && !networkOperationError.getMessage().contains("Failed to connect"))) {
            if (expandedFormat != null) {
                expandedFormat.write(this.MediaBrowserCompat$ItemReceiver);
                z = true;
            }
        } else if (expandedFormat != null) {
            expandedFormat.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
        }
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(true);
        if (z) {
            FragmentBuilder_BindHmlIssuerLandingFragment.setExpandedFormat().MediaBrowserCompat$ItemReceiver();
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        FragmentBuilder_BindHmlIssuerLandingFragment.setExpandedFormat().write(this.MediaBrowserCompat$ItemReceiver);
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(true);
        FragmentBuilder_BindHmlIssuerLandingFragment.setExpandedFormat().MediaBrowserCompat$ItemReceiver();
    }
}
