package p040o;

/* renamed from: o.FragmentBuilder_BindPreloadConfigFragment */
public final class FragmentBuilder_BindPreloadConfigFragment {
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> MediaBrowserCompat$CustomActionResultReceiver;
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> MediaBrowserCompat$ItemReceiver;
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment> read;

    static {
        FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment> fundFactSheetActivity = read.MediaBrowserCompat$CustomActionResultReceiver;
        read = fundFactSheetActivity;
        FundFactSheetActivity fundFactSheetActivity2 = C6642x419967a6.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) fundFactSheetActivity, "selector");
        onGetStartedClick.write((Object) fundFactSheetActivity2, "compute");
        MediaBrowserCompat$CustomActionResultReceiver = new C6351x57c5459e(fundFactSheetActivity, fundFactSheetActivity2);
        FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment> fundFactSheetActivity3 = read;
        FundFactSheetActivity fundFactSheetActivity4 = write.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) fundFactSheetActivity3, "selector");
        onGetStartedClick.write((Object) fundFactSheetActivity4, "compute");
        MediaBrowserCompat$ItemReceiver = new C6351x57c5459e(fundFactSheetActivity3, fundFactSheetActivity4);
    }

    public static final boolean write(OnBoardingTutorialActivity onBoardingTutorialActivity) {
        onGetStartedClick.write((Object) onBoardingTutorialActivity, "state");
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) MediaBrowserCompat$CustomActionResultReceiver.invoke(onBoardingTutorialActivity), (Object) Boolean.TRUE);
    }

    public static final boolean MediaBrowserCompat$ItemReceiver(OnBoardingTutorialActivity onBoardingTutorialActivity) {
        onGetStartedClick.write((Object) onBoardingTutorialActivity, "state");
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) MediaBrowserCompat$ItemReceiver.invoke(onBoardingTutorialActivity), (Object) Boolean.TRUE);
    }

    /* renamed from: o.FragmentBuilder_BindPreloadConfigFragment$read */
    static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment> {
        public static final read MediaBrowserCompat$CustomActionResultReceiver = new read();

        read() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            OnBoardingTutorialActivity onBoardingTutorialActivity = (OnBoardingTutorialActivity) obj;
            if (onBoardingTutorialActivity != null) {
                return onBoardingTutorialActivity.MediaBrowserCompat$SearchResultReceiver;
            }
            return null;
        }
    }

    /* renamed from: o.FragmentBuilder_BindPreloadConfigFragment$write */
    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<FragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment, Boolean> {
        public static final write MediaBrowserCompat$CustomActionResultReceiver = new write();

        write() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment fragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment = (FragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment) obj;
            boolean z = true;
            if (fragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment == null || !fragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment.MediaBrowserCompat$ItemReceiver) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }
}
