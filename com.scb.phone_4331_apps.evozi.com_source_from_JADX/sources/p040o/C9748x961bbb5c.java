package p040o;

import p040o.HmlVerifyIdentifyActivity;

/* renamed from: o.FragmentBuilder_DocumentUploadFragment$MediaBrowserCompat$ItemReceiver */
final class C9748x961bbb5c extends InsurancePortfolioActivity_ViewBinding implements BaseDiscoverFundFilterActivity<MwCasaOtpActivity, HmlNTBPromptPayNotFoundActivity<? super HmlVerifyPhoneValidateOtpActivity>, Object> {
    private int read;
    private MwCasaOtpActivity write;

    C9748x961bbb5c(HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity) {
        super(2, hmlNTBPromptPayNotFoundActivity);
    }

    public final Object MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
        return ((C9748x961bbb5c) create(obj, (HmlNTBPromptPayNotFoundActivity) obj2)).invokeSuspend(HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver);
    }

    public final HmlNTBPromptPayNotFoundActivity<HmlVerifyPhoneValidateOtpActivity> create(Object obj, HmlNTBPromptPayNotFoundActivity<?> hmlNTBPromptPayNotFoundActivity) {
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "completion");
        C9748x961bbb5c fragmentBuilder_DocumentUploadFragment$MediaBrowserCompat$ItemReceiver = new C9748x961bbb5c(hmlNTBPromptPayNotFoundActivity);
        fragmentBuilder_DocumentUploadFragment$MediaBrowserCompat$ItemReceiver.write = (MwCasaOtpActivity) obj;
        return fragmentBuilder_DocumentUploadFragment$MediaBrowserCompat$ItemReceiver;
    }

    public final Object invokeSuspend(Object obj) {
        HmlPromptPayVerificationActivity_ViewBinding hmlPromptPayVerificationActivity_ViewBinding = HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED;
        int i = this.read;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else if (obj instanceof HmlVerifyIdentifyActivity.write) {
                throw ((HmlVerifyIdentifyActivity.write) obj).read;
            }
        } else if (!(obj instanceof HmlVerifyIdentifyActivity.write)) {
            FragmentBuilder_BindHmlIssuerLandingFragment.setHideOnContentScrollEnabled();
            FragmentBuilder_BindSetupQuickPromptPayFragment AppCompatActivity = FragmentBuilder_BindHmlIssuerLandingFragment.AppCompatActivity();
            if (AppCompatActivity != null) {
                this.read = 1;
                if (AppCompatActivity.write() == hmlPromptPayVerificationActivity_ViewBinding) {
                    return hmlPromptPayVerificationActivity_ViewBinding;
                }
            }
        } else {
            throw ((HmlVerifyIdentifyActivity.write) obj).read;
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
