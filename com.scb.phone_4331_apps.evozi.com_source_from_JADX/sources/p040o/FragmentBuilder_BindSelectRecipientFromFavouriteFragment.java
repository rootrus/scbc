package p040o;

import com.scb.phone.view.activity.prepaid.reset.PrepaidResetOtpActivity;
import com.thunderhead.android.infrastructure.server.responses.BaseResponse;
import com.thunderhead.connectivity.NetworkOperationError;
import java.util.List;
import java.util.TreeMap;
import p040o.GeoDataClient;
import p040o.HmlVerifyIdentifyActivity;

@HmlSetNTBPinActivity
/* renamed from: o.FragmentBuilder_BindSelectRecipientFromFavouriteFragment */
public final class FragmentBuilder_BindSelectRecipientFromFavouriteFragment {
    public getPriceLevel IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public TreeMap<Integer, getLocale> MediaBrowserCompat$ItemReceiver = new TreeMap<>();
    public List<PrepaidResetOtpActivity.write> read;
    public GeoDataClient.BoundsMode write;

    public static final String MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment, FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment) {
        if (fragmentBuilder_BindHmlNtbOutcomeRejectFragment == null || fragmentBuilder_BindHmlOperatingBankFragment == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("push_token_sent-");
        sb.append(fragmentBuilder_BindHmlNtbOutcomeRejectFragment.read);
        sb.append('-');
        sb.append(fragmentBuilder_BindHmlOperatingBankFragment.write.getHost());
        return sb.toString();
    }

    /* renamed from: o.FragmentBuilder_BindSelectRecipientFromFavouriteFragment$read */
    public static final class read extends CardActivationActivity {
        private /* synthetic */ MailingAddressReviewOTPActivity IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(MailingAddressReviewOTPActivity mailingAddressReviewOTPActivity, String str, ECouponCommonActivity_ViewBinding eCouponCommonActivity_ViewBinding, ConfirmRedemptionActivity confirmRedemptionActivity, FragmentBuilder_BindHmlNTBAdditionalDocumentInputFragment fragmentBuilder_BindHmlNTBAdditionalDocumentInputFragment, FragmentBuilder_BindHmlETBBusinessInformationFragment fragmentBuilder_BindHmlETBBusinessInformationFragment, String str2) {
            super(str, eCouponCommonActivity_ViewBinding, confirmRedemptionActivity, fragmentBuilder_BindHmlNTBAdditionalDocumentInputFragment, fragmentBuilder_BindHmlETBBusinessInformationFragment, str2);
            this.IconCompatParcelizer = mailingAddressReviewOTPActivity;
        }

        public final void MediaBrowserCompat$ItemReceiver(BaseResponse baseResponse) {
            onGetStartedClick.write((Object) baseResponse, "response");
            super.MediaBrowserCompat$ItemReceiver(baseResponse);
            if (this.IconCompatParcelizer.IconCompatParcelizer()) {
                HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                this.IconCompatParcelizer.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(baseResponse));
            }
        }

        public final void write(NetworkOperationError networkOperationError) {
            super.write(networkOperationError);
            if (this.IconCompatParcelizer.IconCompatParcelizer()) {
                HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity = this.IconCompatParcelizer;
                Throwable exc = new Exception(networkOperationError != null ? networkOperationError.getException() : null);
                HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                onGetStartedClick.write((Object) exc, "exception");
                hmlNTBPromptPayNotFoundActivity.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(exc)));
            }
        }
    }
}
