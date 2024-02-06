package p040o;

/* renamed from: o.FragmentBuilder_BindPrepaidTravelConversionSuccessFragment */
public final class FragmentBuilder_BindPrepaidTravelConversionSuccessFragment {
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindPrepaidSuccessfulActivationFragment> IconCompatParcelizer;
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, String> MediaBrowserCompat$CustomActionResultReceiver;
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> read;

    static {
        FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindPrepaidSuccessfulActivationFragment> fundFactSheetActivity = read.write;
        IconCompatParcelizer = fundFactSheetActivity;
        FundFactSheetActivity fundFactSheetActivity2 = write.read;
        onGetStartedClick.write((Object) fundFactSheetActivity, "selector");
        onGetStartedClick.write((Object) fundFactSheetActivity2, "compute");
        MediaBrowserCompat$CustomActionResultReceiver = new C6351x57c5459e(fundFactSheetActivity, fundFactSheetActivity2);
        FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindPrepaidSuccessfulActivationFragment> fundFactSheetActivity3 = IconCompatParcelizer;
        FundFactSheetActivity fundFactSheetActivity4 = C6661x38a5f221.write;
        onGetStartedClick.write((Object) fundFactSheetActivity3, "selector");
        onGetStartedClick.write((Object) fundFactSheetActivity4, "compute");
        read = new C6351x57c5459e(fundFactSheetActivity3, fundFactSheetActivity4);
    }

    public static final FundFactSheetActivity<OnBoardingTutorialActivity, String> read() {
        return MediaBrowserCompat$CustomActionResultReceiver;
    }

    public static final String IconCompatParcelizer(OnBoardingTutorialActivity onBoardingTutorialActivity) {
        onGetStartedClick.write((Object) onBoardingTutorialActivity, "state");
        String invoke = MediaBrowserCompat$CustomActionResultReceiver.invoke(onBoardingTutorialActivity);
        return invoke == null ? "" : invoke;
    }

    public static final boolean MediaBrowserCompat$ItemReceiver(OnBoardingTutorialActivity onBoardingTutorialActivity) {
        onGetStartedClick.write((Object) onBoardingTutorialActivity, "state");
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) read.invoke(onBoardingTutorialActivity), (Object) Boolean.TRUE);
    }

    /* renamed from: o.FragmentBuilder_BindPrepaidTravelConversionSuccessFragment$read */
    static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindPrepaidSuccessfulActivationFragment> {
        public static final read write = new read();

        read() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            OnBoardingTutorialActivity onBoardingTutorialActivity = (OnBoardingTutorialActivity) obj;
            if (onBoardingTutorialActivity != null) {
                return onBoardingTutorialActivity.MediaBrowserCompat$MediaItem;
            }
            return null;
        }
    }

    /* renamed from: o.FragmentBuilder_BindPrepaidTravelConversionSuccessFragment$write */
    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<FragmentBuilder_BindPrepaidSuccessfulActivationFragment, String> {
        public static final write read = new write();

        write() {
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r1 = r1.write;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
            /*
                r0 = this;
                o.FragmentBuilder_BindPrepaidSuccessfulActivationFragment r1 = (p040o.FragmentBuilder_BindPrepaidSuccessfulActivationFragment) r1
                if (r1 == 0) goto L_0x0008
                java.lang.String r1 = r1.write
                if (r1 != 0) goto L_0x000a
            L_0x0008:
                java.lang.String r1 = ""
            L_0x000a:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindPrepaidTravelConversionSuccessFragment.write.invoke(java.lang.Object):java.lang.Object");
        }
    }
}
