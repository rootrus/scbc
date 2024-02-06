package p040o;

import com.thunderhead.android.infrastructure.server.responses.BaseResponse;
import com.thunderhead.connectivity.NetworkOperationCallback;
import com.thunderhead.connectivity.NetworkOperationError;
import p040o.C6643x9654e915;

/* renamed from: o.CCTermsAndConditionsActivity */
public abstract class CCTermsAndConditionsActivity<T extends BaseResponse> implements NetworkOperationCallback<T> {
    private boolean IconCompatParcelizer = true;
    ECouponCommonActivity_ViewBinding MediaBrowserCompat$CustomActionResultReceiver;
    String MediaBrowserCompat$ItemReceiver;
    protected C6437x1b3a90a2 read = null;
    ConfirmRedemptionActivity write;

    /* access modifiers changed from: protected */
    public abstract void MediaBrowserCompat$ItemReceiver(T t);

    /* access modifiers changed from: protected */
    public abstract void read();

    /* access modifiers changed from: protected */
    public abstract void write(NetworkOperationError networkOperationError);

    public /* synthetic */ void onSuccess(Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse == null) {
            MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.IconCompatParcelizer, "Response body is empty.");
            if (this.IconCompatParcelizer) {
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(false);
            }
            read();
            return;
        }
        FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver(new C6643x9654e915.MediaMetadataCompat(baseResponse.getTid()));
        if (this.IconCompatParcelizer) {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(false);
        }
        MediaBrowserCompat$ItemReceiver(baseResponse);
        FragmentBuilder_BindHmlIssuerLandingFragment.setExpandedFormat().MediaBrowserCompat$ItemReceiver();
    }

    CCTermsAndConditionsActivity(String str, ECouponCommonActivity_ViewBinding eCouponCommonActivity_ViewBinding, ConfirmRedemptionActivity confirmRedemptionActivity) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = eCouponCommonActivity_ViewBinding;
        this.write = confirmRedemptionActivity;
    }

    public final void onFailure(NetworkOperationError networkOperationError) {
        ConfirmRedemptionActivity confirmRedemptionActivity;
        if (!(networkOperationError == null || (confirmRedemptionActivity = this.write) == null)) {
            confirmRedemptionActivity.read("TrackInteraction", networkOperationError);
        }
        if (networkOperationError != null && ((networkOperationError.getHttpStatusCode() >= 500 || networkOperationError.getMessage().contains("Network is unreachable") || networkOperationError.getMessage().contains("Unexpected response code for CONNECT: 503")) && this.read.write == 8)) {
            FragmentBuilder_BindHmlIssuerLandingFragment.setExpandedFormat().MediaBrowserCompat$ItemReceiver(false, this.read.MediaBrowserCompat$CustomActionResultReceiver);
        }
        if (this.IconCompatParcelizer) {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(false);
        }
        write(networkOperationError);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(C6437x1b3a90a2 eCouponCommonActivity_ViewBinding$MediaBrowserCompat$ItemReceiver) {
        this.read = eCouponCommonActivity_ViewBinding$MediaBrowserCompat$ItemReceiver;
    }
}
