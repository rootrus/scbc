package p040o;

import com.thunderhead.android.infrastructure.server.responses.BaseResponse;
import com.thunderhead.connectivity.NetworkOperationError;
import org.json.JSONObject;

/* renamed from: o.onAccountsClick */
public final class onAccountsClick extends AmortizationActivity_ViewBinding {
    private BulkTransferReviewActivity<BaseResponse> IconCompatParcelizer;

    public onAccountsClick(BulkTransferReviewActivity<BaseResponse> bulkTransferReviewActivity, String str, ECouponCommonActivity_ViewBinding eCouponCommonActivity_ViewBinding, ConfirmRedemptionActivity confirmRedemptionActivity) {
        super(str, eCouponCommonActivity_ViewBinding, confirmRedemptionActivity);
        this.IconCompatParcelizer = bulkTransferReviewActivity;
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver(BaseResponse baseResponse) {
        baseResponse.setInteractionPath(this.MediaBrowserCompat$ItemReceiver);
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(baseResponse, (MileageAirlineMembershipDetailsActivity) null);
    }

    /* access modifiers changed from: protected */
    public final void read() {
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(null, new MileageAirlineMembershipDetailsActivity(2, "Request TrackInteraction is empty."));
    }

    /* access modifiers changed from: protected */
    public final void write(NetworkOperationError networkOperationError) {
        String str;
        if (networkOperationError != null) {
            str = networkOperationError.getMessage();
            if (str.isEmpty() && networkOperationError.getBody() != null) {
                str = read(networkOperationError.getBody().getRawBody());
            }
        } else {
            str = "";
        }
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(null, new MileageAirlineMembershipDetailsActivity(networkOperationError != null ? networkOperationError.getHttpStatusCode() : -1, str));
    }

    private static String read(String str) {
        if (str == null) {
            return str;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("statusMessage")) {
                return jSONObject.getString("statusMessage");
            }
            return str;
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            return str;
        }
    }
}
