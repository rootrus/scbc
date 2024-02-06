package p040o;

import p040o.FragmentBuilder_BindTransferToPromptPayStep1Fragment;

/* renamed from: o.FragmentBuilder_ContributeMututalFundOnboardingReviewFragment$MediaBrowserCompat$ItemReceiver */
public final class C6866x2d3b32b9<S> implements onSeeInstructionsClicked<OnBoardingTutorialActivity> {
    private /* synthetic */ FragmentBuilder_BindVerifyIdentityFragment write;

    public C6866x2d3b32b9(FragmentBuilder_BindVerifyIdentityFragment fragmentBuilder_BindVerifyIdentityFragment) {
        this.write = fragmentBuilder_BindVerifyIdentityFragment;
    }

    public final /* synthetic */ Object write(FragmentBuilder_BindJuristicRequestFormFragment fragmentBuilder_BindJuristicRequestFormFragment, FundActionsSuccessActivity fundActionsSuccessActivity) {
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicRequestFormFragment, "dispatcher");
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "getState");
        try {
            OnBoardingTutorialActivity onBoardingTutorialActivity = (OnBoardingTutorialActivity) fundActionsSuccessActivity.invoke();
            if (onBoardingTutorialActivity == null) {
                onBoardingTutorialActivity = new OnBoardingTutorialActivity((byte) 0);
            }
            FragmentBuilder_BindHmlNTBAccountConsentFragment invoke = FragmentBuilder_BindOnboardingInputAddressFragment.MediaMetadataCompat().invoke(onBoardingTutorialActivity);
            FragmentBuilder_BindVerifyIdentityFragment invoke2 = FragmentBuilder_BindTransferToOthersStep1Fragment.write().invoke(onBoardingTutorialActivity);
            if (invoke2 == null) {
                invoke2 = FragmentBuilder_BindVerifyIdentityFragment.RUNTIME;
            }
            if (invoke != FragmentBuilder_BindHmlNTBAccountConsentFragment.USER_MODE) {
                FragmentBuilder_BindVerifyIdentityFragment fragmentBuilder_BindVerifyIdentityFragment = this.write;
                if (fragmentBuilder_BindVerifyIdentityFragment == null) {
                    fragmentBuilder_BindVerifyIdentityFragment = FragmentBuilder_BindVerifyIdentityFragment.DESIGN_TIME_OFF;
                }
                fragmentBuilder_BindJuristicRequestFormFragment.MediaBrowserCompat$ItemReceiver(new C6865x419be8c4(fragmentBuilder_BindVerifyIdentityFragment));
                if (FragmentBuilder_BindUnbilledTabFragment.write().contains(invoke2)) {
                    if (FragmentBuilder_BindUnbilledTabFragment.read().contains(fragmentBuilder_BindVerifyIdentityFragment)) {
                        fragmentBuilder_BindJuristicRequestFormFragment.MediaBrowserCompat$ItemReceiver(new FragmentBuilder_BindTransferToPromptPayStep1Fragment.read(invoke2));
                    }
                }
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
