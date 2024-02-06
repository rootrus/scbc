package p040o;

import p040o.C6705x38e7508;
import p040o.HmlVerifyIdentifyActivity;

/* renamed from: o.FragmentBuilder_BindRegistrationEmailSetupFragment$MediaBrowserCompat$CustomActionResultReceiver$5$4$MediaBrowserCompat$ItemReceiver */
final class C6711xf1f4b005 extends InsurancePortfolioActivity_ViewBinding implements BaseDiscoverFundFilterActivity<MwCasaOtpActivity, HmlNTBPromptPayNotFoundActivity<? super FragmentBuilder_BindPurchaseProfileManagementFragment>, Object> {
    private MwCasaOtpActivity IconCompatParcelizer;
    private /* synthetic */ C6705x38e7508.C67085.C67094 MediaBrowserCompat$CustomActionResultReceiver;
    private int write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6711xf1f4b005(C6705x38e7508.C67085.C67094 r1, HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity) {
        super(2, hmlNTBPromptPayNotFoundActivity);
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
    }

    public final Object MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
        return ((C6711xf1f4b005) create(obj, (HmlNTBPromptPayNotFoundActivity) obj2)).invokeSuspend(HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver);
    }

    public final HmlNTBPromptPayNotFoundActivity<HmlVerifyPhoneValidateOtpActivity> create(Object obj, HmlNTBPromptPayNotFoundActivity<?> hmlNTBPromptPayNotFoundActivity) {
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "completion");
        C6711xf1f4b005 fragmentBuilder_BindRegistrationEmailSetupFragment$MediaBrowserCompat$CustomActionResultReceiver$5$4$MediaBrowserCompat$ItemReceiver = new C6711xf1f4b005(this.MediaBrowserCompat$CustomActionResultReceiver, hmlNTBPromptPayNotFoundActivity);
        fragmentBuilder_BindRegistrationEmailSetupFragment$MediaBrowserCompat$CustomActionResultReceiver$5$4$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = (MwCasaOtpActivity) obj;
        return fragmentBuilder_BindRegistrationEmailSetupFragment$MediaBrowserCompat$CustomActionResultReceiver$5$4$MediaBrowserCompat$ItemReceiver;
    }

    public final Object invokeSuspend(Object obj) {
        HmlPromptPayVerificationActivity_ViewBinding hmlPromptPayVerificationActivity_ViewBinding = HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED;
        int i = this.write;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else if (obj instanceof HmlVerifyIdentifyActivity.write) {
                throw ((HmlVerifyIdentifyActivity.write) obj).read;
            }
        } else if (!(obj instanceof HmlVerifyIdentifyActivity.write)) {
            this.write = 1;
            obj = FragmentBuilder_BindHmlIssuerLandingFragment.write().MediaBrowserCompat$CustomActionResultReceiver(r1, this);
            if (obj == hmlPromptPayVerificationActivity_ViewBinding) {
                return hmlPromptPayVerificationActivity_ViewBinding;
            }
        } else {
            throw ((HmlVerifyIdentifyActivity.write) obj).read;
        }
        return obj;
    }
}
