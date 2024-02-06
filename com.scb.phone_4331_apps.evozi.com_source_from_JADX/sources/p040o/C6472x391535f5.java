package p040o;

import java.io.File;

/* renamed from: o.ErrorPageActivity_ViewBinding$MediaBrowserCompat$SearchResultReceiver */
final class C6472x391535f5 extends CheckEligibilityActivity implements FundFactSheetActivity<HmlVerifyEmailSuccessfulActivity<? extends File, ? extends ECouponCommonActivity>, HmlVerifyEmailSuccessfulActivity<? extends File, ? extends FragmentBuilder_BindReviewRedemptionFragment>> {
    final /* synthetic */ String IconCompatParcelizer;
    final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    final /* synthetic */ ErrorPageActivity_ViewBinding read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6472x391535f5(ErrorPageActivity_ViewBinding errorPageActivity_ViewBinding, String str, String str2) {
        super(1);
        this.read = errorPageActivity_ViewBinding;
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }

    /* renamed from: o.ErrorPageActivity_ViewBinding$MediaBrowserCompat$SearchResultReceiver$read */
    static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<C6746xde52ab60, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ ECouponCommonActivity MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ C6472x391535f5 MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(C6472x391535f5 errorPageActivity_ViewBinding$MediaBrowserCompat$SearchResultReceiver, ECouponCommonActivity eCouponCommonActivity) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = errorPageActivity_ViewBinding$MediaBrowserCompat$SearchResultReceiver;
            this.MediaBrowserCompat$CustomActionResultReceiver = eCouponCommonActivity;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C6746xde52ab60 fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver = (C6746xde52ab60) obj;
            onGetStartedClick.write((Object) fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver, "$receiver");
            String json = this.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$ItemReceiver.toJson((Object) this.MediaBrowserCompat$CustomActionResultReceiver);
            onGetStartedClick.IconCompatParcelizer((Object) json, "gson.toJson(props)");
            onGetStartedClick.write((Object) json, "<set-?>");
            fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = json;
            String str = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            onGetStartedClick.write((Object) str, "<set-?>");
            fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver.write = str;
            String str3 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
            if (str3 != null) {
                str2 = str3;
            }
            onGetStartedClick.write((Object) str2, "<set-?>");
            fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = str2;
            FragmentBuilder_BindRiskSelectionFragment fragmentBuilder_BindRiskSelectionFragment = FragmentBuilder_BindRiskSelectionFragment.PROPERTY;
            onGetStartedClick.write((Object) fragmentBuilder_BindRiskSelectionFragment, "<set-?>");
            fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver.read = fragmentBuilder_BindRiskSelectionFragment;
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public final /* synthetic */ Object invoke(Object obj) {
        HmlVerifyEmailSuccessfulActivity hmlVerifyEmailSuccessfulActivity = (HmlVerifyEmailSuccessfulActivity) obj;
        onGetStartedClick.write((Object) hmlVerifyEmailSuccessfulActivity, "<name for destructuring parameter 0>");
        FundFactSheetActivity read2 = new read(this, (ECouponCommonActivity) hmlVerifyEmailSuccessfulActivity.write);
        onGetStartedClick.write((Object) read2, "initializer");
        C6746xde52ab60 fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver = new C6746xde52ab60();
        read2.invoke(fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver);
        return new HmlVerifyEmailSuccessfulActivity((File) hmlVerifyEmailSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver, fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver.write());
    }
}
