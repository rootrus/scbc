package p040o;

/* renamed from: o.FragmentBuilder_BindHelpFragment */
public final /* synthetic */ class FragmentBuilder_BindHelpFragment implements C6560xb325287a {
    private final /* synthetic */ FragmentBuilder_BindHmlNTBApplyLoanEntryFragment read;

    public /* synthetic */ FragmentBuilder_BindHelpFragment(FragmentBuilder_BindHmlNTBApplyLoanEntryFragment fragmentBuilder_BindHmlNTBApplyLoanEntryFragment) {
        this.read = fragmentBuilder_BindHmlNTBApplyLoanEntryFragment;
    }

    public final void onStateChange(Object obj) {
        FragmentBuilder_BindHmlNTBApplyLoanEntryFragment fragmentBuilder_BindHmlNTBApplyLoanEntryFragment = this.read;
        OnBoardingTutorialActivity onBoardingTutorialActivity = (OnBoardingTutorialActivity) obj;
        fragmentBuilder_BindHmlNTBApplyLoanEntryFragment.MediaBrowserCompat$SearchResultReceiver = FragmentBuilder_BindOnboardingInputAddressFragment.IconCompatParcelizer(onBoardingTutorialActivity);
        fragmentBuilder_BindHmlNTBApplyLoanEntryFragment.MediaSessionCompat$Token = FragmentBuilder_BindOnboardingInputAddressFragment.RatingCompat(onBoardingTutorialActivity);
        fragmentBuilder_BindHmlNTBApplyLoanEntryFragment.MediaBrowserCompat$CustomActionResultReceiver = FragmentBuilder_BindOnboardingInputAddressFragment.MediaBrowserCompat$CustomActionResultReceiver(onBoardingTutorialActivity);
        fragmentBuilder_BindHmlNTBApplyLoanEntryFragment.IconCompatParcelizer = Boolean.valueOf(FragmentBuilder_BindOnboardingInputAddressFragment.MediaBrowserCompat$ItemReceiver(onBoardingTutorialActivity));
        fragmentBuilder_BindHmlNTBApplyLoanEntryFragment.MediaBrowserCompat$ItemReceiver = FragmentBuilder_BindStopChequeInputFragment.write(onBoardingTutorialActivity);
        fragmentBuilder_BindHmlNTBApplyLoanEntryFragment.write = FragmentBuilder_BindPurchaseCreditCardFragment.read(onBoardingTutorialActivity);
    }
}
