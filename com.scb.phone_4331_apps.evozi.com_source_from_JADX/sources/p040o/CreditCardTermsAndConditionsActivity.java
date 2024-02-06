package p040o;

import com.thunderhead.android.infrastructure.server.responses.BaseResponse;
import com.thunderhead.connectivity.NetworkOperationError;
import org.json.JSONObject;

/* renamed from: o.CreditCardTermsAndConditionsActivity */
public abstract class CreditCardTermsAndConditionsActivity extends AmortizationActivity_ViewBinding {
    private long IconCompatParcelizer;
    private boolean MediaBrowserCompat$SearchResultReceiver;
    private BulkTransferReviewActivity<BaseResponse> MediaDescriptionCompat;

    public CreditCardTermsAndConditionsActivity(String str, ECouponCommonActivity_ViewBinding eCouponCommonActivity_ViewBinding, ConfirmRedemptionActivity confirmRedemptionActivity, long j, boolean z) {
        super(str, eCouponCommonActivity_ViewBinding, confirmRedemptionActivity);
        this.IconCompatParcelizer = -1;
        this.MediaBrowserCompat$SearchResultReceiver = z;
        this.IconCompatParcelizer = j;
    }

    public CreditCardTermsAndConditionsActivity(String str, ECouponCommonActivity_ViewBinding eCouponCommonActivity_ViewBinding, ConfirmRedemptionActivity confirmRedemptionActivity, boolean z, BulkTransferReviewActivity<BaseResponse> bulkTransferReviewActivity) {
        super(str, eCouponCommonActivity_ViewBinding, confirmRedemptionActivity);
        this.IconCompatParcelizer = -1;
        this.MediaBrowserCompat$SearchResultReceiver = false;
        this.MediaDescriptionCompat = bulkTransferReviewActivity;
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver(BaseResponse baseResponse) {
        FragmentBuilder_BindRtpEBillPaymentDetailFragment expandedFormat;
        if (this.MediaBrowserCompat$SearchResultReceiver && this.IconCompatParcelizer > -1 && (expandedFormat = FragmentBuilder_BindHmlIssuerLandingFragment.setExpandedFormat()) != null) {
            expandedFormat.write(this.IconCompatParcelizer);
        }
        BulkTransferReviewActivity<BaseResponse> bulkTransferReviewActivity = this.MediaDescriptionCompat;
        if (bulkTransferReviewActivity != null) {
            bulkTransferReviewActivity.MediaBrowserCompat$ItemReceiver(baseResponse, (MileageAirlineMembershipDetailsActivity) null);
        }
    }

    /* access modifiers changed from: protected */
    public final void write(NetworkOperationError networkOperationError) {
        String str;
        FragmentBuilder_BindRtpEBillPaymentDetailFragment expandedFormat;
        super.write(networkOperationError);
        if (this.MediaBrowserCompat$SearchResultReceiver && this.IconCompatParcelizer > -1 && (expandedFormat = FragmentBuilder_BindHmlIssuerLandingFragment.setExpandedFormat()) != null) {
            expandedFormat.write(this.IconCompatParcelizer);
        }
        if (this.MediaDescriptionCompat != null) {
            if (networkOperationError != null) {
                str = networkOperationError.getMessage();
                if (str.isEmpty() && networkOperationError.getBody() != null) {
                    str = MediaBrowserCompat$ItemReceiver(networkOperationError.getBody().getRawBody());
                }
            } else {
                str = "Error sending properties to One SDK.";
            }
            this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(null, new MileageAirlineMembershipDetailsActivity(networkOperationError != null ? networkOperationError.getHttpStatusCode() : -1, str));
        }
    }

    private static String MediaBrowserCompat$ItemReceiver(String str) {
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
