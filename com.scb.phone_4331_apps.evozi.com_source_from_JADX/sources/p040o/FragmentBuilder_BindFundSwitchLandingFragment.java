package p040o;

/* renamed from: o.FragmentBuilder_BindFundSwitchLandingFragment */
public final /* synthetic */ class FragmentBuilder_BindFundSwitchLandingFragment implements C6560xb325287a {
    private final /* synthetic */ FragmentBuilder_BindHmlETBSuccessFragment IconCompatParcelizer;

    public /* synthetic */ FragmentBuilder_BindFundSwitchLandingFragment(FragmentBuilder_BindHmlETBSuccessFragment fragmentBuilder_BindHmlETBSuccessFragment) {
        this.IconCompatParcelizer = fragmentBuilder_BindHmlETBSuccessFragment;
    }

    public final void onStateChange(Object obj) {
        FragmentBuilder_BindHmlETBSuccessFragment fragmentBuilder_BindHmlETBSuccessFragment = this.IconCompatParcelizer;
        OnBoardingTutorialActivity onBoardingTutorialActivity = (OnBoardingTutorialActivity) obj;
        FragmentBuilder_BindVerifyIdentityFragment write = FragmentBuilder_BindTransferToOthersStep1Fragment.write(onBoardingTutorialActivity);
        if (fragmentBuilder_BindHmlETBSuccessFragment.MediaBrowserCompat$ItemReceiver != write) {
            fragmentBuilder_BindHmlETBSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver();
            fragmentBuilder_BindHmlETBSuccessFragment.MediaBrowserCompat$ItemReceiver = write;
        }
        fragmentBuilder_BindHmlETBSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver = FragmentBuilder_BindTouchPointWifiSettingsFragment.IconCompatParcelizer(onBoardingTutorialActivity);
    }
}
