package p040o;

import com.thunderhead.android.infrastructure.server.responses.BaseResponse;
import com.thunderhead.connectivity.NetworkOperationError;
import p040o.FragmentBuilder_BindRemittanceInputFragment;

/* renamed from: o.FragmentBuilder_BindPurchaseDepositFragment$MediaBrowserCompat$ItemReceiver */
public final class C6685x5408f198 extends AmortizationActivity_ViewBinding {
    private /* synthetic */ String IconCompatParcelizer;
    private /* synthetic */ String RatingCompat;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6685x5408f198(String str, String str2, String str3, ECouponCommonActivity_ViewBinding eCouponCommonActivity_ViewBinding, ConfirmRedemptionActivity confirmRedemptionActivity) {
        super(str3, eCouponCommonActivity_ViewBinding, confirmRedemptionActivity);
        this.RatingCompat = str;
        this.IconCompatParcelizer = str2;
    }

    public final void MediaBrowserCompat$ItemReceiver(BaseResponse baseResponse) {
        onGetStartedClick.write((Object) baseResponse, "response");
        super.MediaBrowserCompat$ItemReceiver(baseResponse);
        FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver(new FragmentBuilder_BindRemittanceInputFragment.MediaMetadataCompat(this.RatingCompat, this.IconCompatParcelizer));
    }

    public final void write(NetworkOperationError networkOperationError) {
        super.write(networkOperationError);
        FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver(new C6728x11d23707((FragmentBuilder_BindMerchantWalletSelectorFragment) null, networkOperationError != null ? networkOperationError.getException() : null));
    }
}
