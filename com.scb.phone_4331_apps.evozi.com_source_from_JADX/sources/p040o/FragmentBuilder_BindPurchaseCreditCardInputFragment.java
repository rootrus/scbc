package p040o;

/* renamed from: o.FragmentBuilder_BindPurchaseCreditCardInputFragment */
public final class FragmentBuilder_BindPurchaseCreditCardInputFragment {
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> IconCompatParcelizer;
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> read;
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindPromptPayTargetSelectFragment> write;

    static {
        FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindPromptPayTargetSelectFragment> fundFactSheetActivity = write.write;
        write = fundFactSheetActivity;
        FundFactSheetActivity fundFactSheetActivity2 = IconCompatParcelizer.read;
        onGetStartedClick.write((Object) fundFactSheetActivity, "selector");
        onGetStartedClick.write((Object) fundFactSheetActivity2, "compute");
        IconCompatParcelizer = new C6351x57c5459e(fundFactSheetActivity, fundFactSheetActivity2);
        FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindPromptPayTargetSelectFragment> fundFactSheetActivity3 = write;
        FundFactSheetActivity fundFactSheetActivity4 = C6684xca4c8dcc.IconCompatParcelizer;
        onGetStartedClick.write((Object) fundFactSheetActivity3, "selector");
        onGetStartedClick.write((Object) fundFactSheetActivity4, "compute");
        read = new C6351x57c5459e(fundFactSheetActivity3, fundFactSheetActivity4);
    }

    public static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> read() {
        return IconCompatParcelizer;
    }

    public static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> IconCompatParcelizer() {
        return read;
    }

    public static final boolean MediaBrowserCompat$ItemReceiver(OnBoardingTutorialActivity onBoardingTutorialActivity) {
        onGetStartedClick.write((Object) onBoardingTutorialActivity, "state");
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) IconCompatParcelizer.invoke(onBoardingTutorialActivity), (Object) Boolean.TRUE);
    }

    /* renamed from: o.FragmentBuilder_BindPurchaseCreditCardInputFragment$write */
    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindPromptPayTargetSelectFragment> {
        public static final write write = new write();

        write() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            OnBoardingTutorialActivity onBoardingTutorialActivity = (OnBoardingTutorialActivity) obj;
            if (onBoardingTutorialActivity != null) {
                return onBoardingTutorialActivity.MediaSessionCompat$QueueItem;
            }
            return null;
        }
    }

    /* renamed from: o.FragmentBuilder_BindPurchaseCreditCardInputFragment$IconCompatParcelizer */
    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<FragmentBuilder_BindPromptPayTargetSelectFragment, Boolean> {
        public static final IconCompatParcelizer read = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            FragmentBuilder_BindPromptPayTargetSelectFragment fragmentBuilder_BindPromptPayTargetSelectFragment = (FragmentBuilder_BindPromptPayTargetSelectFragment) obj;
            if (fragmentBuilder_BindPromptPayTargetSelectFragment != null) {
                z = fragmentBuilder_BindPromptPayTargetSelectFragment.MediaBrowserCompat$CustomActionResultReceiver;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }
}
