package p040o;

import kotlin.NoWhenBranchMatchedException;
import p040o.FragmentBuilder_BindIssuerInputFragment;
import p040o.HmlVerifyIdentifyActivity;

/* renamed from: o.FragmentBuilder_BindRiskSummaryFragment$MediaBrowserCompat$ItemReceiver */
final class C6750x458b4692 extends InsurancePortfolioActivity_ViewBinding implements BaseDiscoverFundFilterActivity<MwCasaOtpActivity, HmlNTBPromptPayNotFoundActivity<? super HmlVerifyPhoneValidateOtpActivity>, Object> {
    private /* synthetic */ long IconCompatParcelizer;
    private /* synthetic */ FragmentBuilder_BindSCBSLandingFragment MediaBrowserCompat$CustomActionResultReceiver;
    private MwCasaOtpActivity MediaBrowserCompat$ItemReceiver;
    private int read;
    private /* synthetic */ BaseDiscoverFundFilterActivity write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6750x458b4692(FragmentBuilder_BindSCBSLandingFragment fragmentBuilder_BindSCBSLandingFragment, long j, BaseDiscoverFundFilterActivity baseDiscoverFundFilterActivity, HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity) {
        super(2, hmlNTBPromptPayNotFoundActivity);
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindSCBSLandingFragment;
        this.IconCompatParcelizer = j;
        this.write = baseDiscoverFundFilterActivity;
    }

    public final Object MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
        return ((C6750x458b4692) create(obj, (HmlNTBPromptPayNotFoundActivity) obj2)).invokeSuspend(HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver);
    }

    public final HmlNTBPromptPayNotFoundActivity<HmlVerifyPhoneValidateOtpActivity> create(Object obj, HmlNTBPromptPayNotFoundActivity<?> hmlNTBPromptPayNotFoundActivity) {
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "completion");
        C6750x458b4692 fragmentBuilder_BindRiskSummaryFragment$MediaBrowserCompat$ItemReceiver = new C6750x458b4692(this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer, this.write, hmlNTBPromptPayNotFoundActivity);
        fragmentBuilder_BindRiskSummaryFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = (MwCasaOtpActivity) obj;
        return fragmentBuilder_BindRiskSummaryFragment$MediaBrowserCompat$ItemReceiver;
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
            FragmentBuilder_BindSCBSLandingFragment fragmentBuilder_BindSCBSLandingFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
            long j = this.IconCompatParcelizer;
            this.read = 1;
            obj = fragmentBuilder_BindSCBSLandingFragment.read(j);
            if (obj == hmlPromptPayVerificationActivity_ViewBinding) {
                return hmlPromptPayVerificationActivity_ViewBinding;
            }
        } else {
            throw ((HmlVerifyIdentifyActivity.write) obj).read;
        }
        FragmentBuilder_BindIssuerInputFragment fragmentBuilder_BindIssuerInputFragment = (FragmentBuilder_BindIssuerInputFragment) obj;
        if (fragmentBuilder_BindIssuerInputFragment instanceof FragmentBuilder_BindIssuerInputFragment.write) {
            this.write.MediaBrowserCompat$CustomActionResultReceiver((Exception) ((FragmentBuilder_BindIssuerInputFragment.write) fragmentBuilder_BindIssuerInputFragment).write, null);
        } else if (fragmentBuilder_BindIssuerInputFragment instanceof FragmentBuilder_BindIssuerInputFragment.IconCompatParcelizer) {
            this.write.MediaBrowserCompat$CustomActionResultReceiver(null, Boolean.valueOf(((Boolean) ((FragmentBuilder_BindIssuerInputFragment.IconCompatParcelizer) fragmentBuilder_BindIssuerInputFragment).MediaBrowserCompat$ItemReceiver).booleanValue()));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
