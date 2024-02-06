package p040o;

import com.thunderhead.android.infrastructure.server.responses.BaseResponse;

/* renamed from: o.CCAboutActivity */
public final class CCAboutActivity extends CreditCardTermsAndConditionsActivity {
    public CCAboutActivity(String str, ECouponCommonActivity_ViewBinding eCouponCommonActivity_ViewBinding, ConfirmRedemptionActivity confirmRedemptionActivity) {
        super(str, eCouponCommonActivity_ViewBinding, confirmRedemptionActivity, false, (BulkTransferReviewActivity<BaseResponse>) null);
    }

    public CCAboutActivity(String str, ECouponCommonActivity_ViewBinding eCouponCommonActivity_ViewBinding, ConfirmRedemptionActivity confirmRedemptionActivity, long j, boolean z) {
        super(str, eCouponCommonActivity_ViewBinding, confirmRedemptionActivity, j, true);
    }
}
