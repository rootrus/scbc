package p040o;

import com.thunderhead.android.infrastructure.server.responses.BaseResponse;
import p040o.Keep;

/* renamed from: o.DeejungInstallmentsReviewActivity */
public final class DeejungInstallmentsReviewActivity extends CardActivationActivity {
    private Keep.read IconCompatParcelizer;

    public DeejungInstallmentsReviewActivity(String str, ECouponCommonActivity_ViewBinding eCouponCommonActivity_ViewBinding, ConfirmRedemptionActivity confirmRedemptionActivity, FragmentBuilder_BindHmlNTBAdditionalDocumentInputFragment fragmentBuilder_BindHmlNTBAdditionalDocumentInputFragment, FragmentBuilder_BindHmlETBBusinessInformationFragment fragmentBuilder_BindHmlETBBusinessInformationFragment, String str2, Keep.read read) {
        super(str, eCouponCommonActivity_ViewBinding, confirmRedemptionActivity, fragmentBuilder_BindHmlNTBAdditionalDocumentInputFragment, fragmentBuilder_BindHmlETBBusinessInformationFragment, str2);
        this.IconCompatParcelizer = read;
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver(BaseResponse baseResponse) {
        if (this.IconCompatParcelizer != null) {
            baseResponse.setInteractionPath(this.MediaBrowserCompat$ItemReceiver);
        } else {
            super.MediaBrowserCompat$ItemReceiver(baseResponse);
        }
    }
}
