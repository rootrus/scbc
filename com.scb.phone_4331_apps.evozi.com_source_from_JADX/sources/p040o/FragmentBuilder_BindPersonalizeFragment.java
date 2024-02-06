package p040o;

/* renamed from: o.FragmentBuilder_BindPersonalizeFragment */
public final class FragmentBuilder_BindPersonalizeFragment {
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> IconCompatParcelizer = CaptureDocumentActivity_ViewBinding.IconCompatParcelizer(FragmentBuilder_BindPurchaseCreditCardInputFragment.read(), FragmentBuilder_BindPurchaseCreditCardInputFragment.IconCompatParcelizer(), FragmentBuilder_BindMyFundsFragment.MediaMetadataCompat(), FragmentBuilder_BindOnboardingInputAddressFragment.MediaSessionCompat$Token(), C6640xf3ed72cf.IconCompatParcelizer);
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> MediaBrowserCompat$CustomActionResultReceiver;
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> MediaBrowserCompat$ItemReceiver;
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindPointTabFragment> read;
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> write;

    static {
        FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindPointTabFragment> fundFactSheetActivity = read.write;
        read = fundFactSheetActivity;
        FundFactSheetActivity fundFactSheetActivity2 = IconCompatParcelizer.write;
        onGetStartedClick.write((Object) fundFactSheetActivity, "selector");
        onGetStartedClick.write((Object) fundFactSheetActivity2, "compute");
        MediaBrowserCompat$CustomActionResultReceiver = new C6351x57c5459e(fundFactSheetActivity, fundFactSheetActivity2);
        FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindPointTabFragment> fundFactSheetActivity3 = read;
        FundFactSheetActivity fundFactSheetActivity4 = C6639xc229b400.read;
        onGetStartedClick.write((Object) fundFactSheetActivity3, "selector");
        onGetStartedClick.write((Object) fundFactSheetActivity4, "compute");
        MediaBrowserCompat$ItemReceiver = new C6351x57c5459e(fundFactSheetActivity3, fundFactSheetActivity4);
        FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindPointTabFragment> fundFactSheetActivity5 = read;
        FundFactSheetActivity fundFactSheetActivity6 = write.IconCompatParcelizer;
        onGetStartedClick.write((Object) fundFactSheetActivity5, "selector");
        onGetStartedClick.write((Object) fundFactSheetActivity6, "compute");
        write = new C6351x57c5459e(fundFactSheetActivity5, fundFactSheetActivity6);
    }

    public static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> MediaBrowserCompat$CustomActionResultReceiver() {
        return MediaBrowserCompat$CustomActionResultReceiver;
    }

    public static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> MediaBrowserCompat$ItemReceiver() {
        return MediaBrowserCompat$ItemReceiver;
    }

    public static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> IconCompatParcelizer() {
        return write;
    }

    public static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> write() {
        return IconCompatParcelizer;
    }

    public static final boolean MediaBrowserCompat$CustomActionResultReceiver(OnBoardingTutorialActivity onBoardingTutorialActivity) {
        onGetStartedClick.write((Object) onBoardingTutorialActivity, "state");
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) write.invoke(onBoardingTutorialActivity), (Object) Boolean.TRUE);
    }

    /* renamed from: o.FragmentBuilder_BindPersonalizeFragment$read */
    static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindPointTabFragment> {
        public static final read write = new read();

        read() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            OnBoardingTutorialActivity onBoardingTutorialActivity = (OnBoardingTutorialActivity) obj;
            if (onBoardingTutorialActivity != null) {
                return onBoardingTutorialActivity.write;
            }
            return null;
        }
    }

    /* renamed from: o.FragmentBuilder_BindPersonalizeFragment$IconCompatParcelizer */
    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<FragmentBuilder_BindPointTabFragment, Boolean> {
        public static final IconCompatParcelizer write = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FragmentBuilder_BindPointTabFragment fragmentBuilder_BindPointTabFragment = (FragmentBuilder_BindPointTabFragment) obj;
            boolean z = true;
            if (fragmentBuilder_BindPointTabFragment == null || !fragmentBuilder_BindPointTabFragment.MediaBrowserCompat$ItemReceiver) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: o.FragmentBuilder_BindPersonalizeFragment$write */
    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<FragmentBuilder_BindPointTabFragment, Boolean> {
        public static final write IconCompatParcelizer = new write();

        write() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FragmentBuilder_BindPointTabFragment fragmentBuilder_BindPointTabFragment = (FragmentBuilder_BindPointTabFragment) obj;
            boolean z = true;
            if (fragmentBuilder_BindPointTabFragment == null || !fragmentBuilder_BindPointTabFragment.MediaBrowserCompat$CustomActionResultReceiver) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }
}
