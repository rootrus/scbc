package p040o;

/* renamed from: o.FragmentBuilder_BindPrepaidWalletTabFragment */
public final class FragmentBuilder_BindPrepaidWalletTabFragment {
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> read;

    static {
        FundFactSheetActivity fundFactSheetActivity = C6668xe8d3f6a.IconCompatParcelizer;
        FundFactSheetActivity fundFactSheetActivity2 = IconCompatParcelizer.IconCompatParcelizer;
        onGetStartedClick.write((Object) fundFactSheetActivity, "selector");
        onGetStartedClick.write((Object) fundFactSheetActivity2, "compute");
        read = new C6351x57c5459e(fundFactSheetActivity, fundFactSheetActivity2);
    }

    public static final Boolean write(OnBoardingTutorialActivity onBoardingTutorialActivity) {
        onGetStartedClick.write((Object) onBoardingTutorialActivity, "state");
        return read.invoke(onBoardingTutorialActivity);
    }

    /* renamed from: o.FragmentBuilder_BindPrepaidWalletTabFragment$IconCompatParcelizer */
    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<FragmentBuilder_BindHmlOutcomeCounterOfferFragment, Boolean> {
        public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FragmentBuilder_BindHmlOutcomeCounterOfferFragment fragmentBuilder_BindHmlOutcomeCounterOfferFragment = (FragmentBuilder_BindHmlOutcomeCounterOfferFragment) obj;
            if (fragmentBuilder_BindHmlOutcomeCounterOfferFragment != null) {
                return Boolean.valueOf(fragmentBuilder_BindHmlOutcomeCounterOfferFragment.MediaBrowserCompat$CustomActionResultReceiver);
            }
            return null;
        }
    }
}
