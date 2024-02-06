package p040o;

import kotlin.NoWhenBranchMatchedException;
import p040o.FragmentBuilder_BindIssuerInputFragment;
import p040o.HmlVerifyIdentifyActivity;

/* renamed from: o.FragmentBuilder_BindRiskSummaryFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C6749xc7bc3683 extends InsurancePortfolioActivity_ViewBinding implements BaseDiscoverFundFilterActivity<MwCasaOtpActivity, HmlNTBPromptPayNotFoundActivity<? super HmlVerifyPhoneValidateOtpActivity>, Object> {
    private /* synthetic */ FragmentBuilder_BindHmlOperatingBankFragment IconCompatParcelizer;
    private /* synthetic */ FundFactSheetActivity MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ BaseDiscoverFundFilterActivity MediaBrowserCompat$ItemReceiver;
    private int MediaBrowserCompat$MediaItem;
    private MwCasaOtpActivity MediaBrowserCompat$SearchResultReceiver;
    private /* synthetic */ FragmentBuilder_BindSCBSLandingFragment read;
    private /* synthetic */ FragmentBuilder_BindHmlNtbOutcomeRejectFragment write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6749xc7bc3683(FragmentBuilder_BindSCBSLandingFragment fragmentBuilder_BindSCBSLandingFragment, FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment, FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, FundFactSheetActivity fundFactSheetActivity, BaseDiscoverFundFilterActivity baseDiscoverFundFilterActivity, HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity) {
        super(2, hmlNTBPromptPayNotFoundActivity);
        this.read = fragmentBuilder_BindSCBSLandingFragment;
        this.write = fragmentBuilder_BindHmlNtbOutcomeRejectFragment;
        this.IconCompatParcelizer = fragmentBuilder_BindHmlOperatingBankFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = fundFactSheetActivity;
        this.MediaBrowserCompat$ItemReceiver = baseDiscoverFundFilterActivity;
    }

    public final Object MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
        return ((C6749xc7bc3683) create(obj, (HmlNTBPromptPayNotFoundActivity) obj2)).invokeSuspend(HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver);
    }

    public final HmlNTBPromptPayNotFoundActivity<HmlVerifyPhoneValidateOtpActivity> create(Object obj, HmlNTBPromptPayNotFoundActivity<?> hmlNTBPromptPayNotFoundActivity) {
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "completion");
        C6749xc7bc3683 fragmentBuilder_BindRiskSummaryFragment$MediaBrowserCompat$CustomActionResultReceiver = new C6749xc7bc3683(this.read, this.write, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, hmlNTBPromptPayNotFoundActivity);
        fragmentBuilder_BindRiskSummaryFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver = (MwCasaOtpActivity) obj;
        return fragmentBuilder_BindRiskSummaryFragment$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final Object invokeSuspend(Object obj) {
        HmlPromptPayVerificationActivity_ViewBinding hmlPromptPayVerificationActivity_ViewBinding = HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED;
        int i = this.MediaBrowserCompat$MediaItem;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else if (obj instanceof HmlVerifyIdentifyActivity.write) {
                throw ((HmlVerifyIdentifyActivity.write) obj).read;
            }
        } else if (!(obj instanceof HmlVerifyIdentifyActivity.write)) {
            FragmentBuilder_BindSCBSLandingFragment fragmentBuilder_BindSCBSLandingFragment = this.read;
            FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment = this.write;
            FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment = this.IconCompatParcelizer;
            FundFactSheetActivity fundFactSheetActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaBrowserCompat$MediaItem = 1;
            obj = fragmentBuilder_BindSCBSLandingFragment.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindHmlNtbOutcomeRejectFragment, fragmentBuilder_BindHmlOperatingBankFragment, fundFactSheetActivity);
            if (obj == hmlPromptPayVerificationActivity_ViewBinding) {
                return hmlPromptPayVerificationActivity_ViewBinding;
            }
        } else {
            throw ((HmlVerifyIdentifyActivity.write) obj).read;
        }
        FragmentBuilder_BindIssuerInputFragment fragmentBuilder_BindIssuerInputFragment = (FragmentBuilder_BindIssuerInputFragment) obj;
        if (fragmentBuilder_BindIssuerInputFragment instanceof FragmentBuilder_BindIssuerInputFragment.write) {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver((Exception) ((FragmentBuilder_BindIssuerInputFragment.write) fragmentBuilder_BindIssuerInputFragment).write, null);
        } else if (fragmentBuilder_BindIssuerInputFragment instanceof FragmentBuilder_BindIssuerInputFragment.IconCompatParcelizer) {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(null, Integer.valueOf(((Number) ((FragmentBuilder_BindIssuerInputFragment.IconCompatParcelizer) fragmentBuilder_BindIssuerInputFragment).MediaBrowserCompat$ItemReceiver).intValue()));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
