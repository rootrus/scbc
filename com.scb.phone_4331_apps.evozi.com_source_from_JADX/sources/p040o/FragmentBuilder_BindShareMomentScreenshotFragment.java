package p040o;

/* renamed from: o.FragmentBuilder_BindShareMomentScreenshotFragment */
public final class FragmentBuilder_BindShareMomentScreenshotFragment {
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> MediaBrowserCompat$CustomActionResultReceiver;

    static {
        FundFactSheetActivity fundFactSheetActivity = write.write;
        FundFactSheetActivity fundFactSheetActivity2 = IconCompatParcelizer.write;
        onGetStartedClick.write((Object) fundFactSheetActivity, "selector");
        onGetStartedClick.write((Object) fundFactSheetActivity2, "compute");
        MediaBrowserCompat$CustomActionResultReceiver = new C6351x57c5459e(fundFactSheetActivity, fundFactSheetActivity2);
    }

    public static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> write() {
        return MediaBrowserCompat$CustomActionResultReceiver;
    }

    /* renamed from: o.FragmentBuilder_BindShareMomentScreenshotFragment$write */
    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindSmeLoanFragment> {
        public static final write write = new write();

        write() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            OnBoardingTutorialActivity onBoardingTutorialActivity = (OnBoardingTutorialActivity) obj;
            if (onBoardingTutorialActivity != null) {
                return onBoardingTutorialActivity.MediaMetadataCompat;
            }
            return null;
        }
    }

    /* renamed from: o.FragmentBuilder_BindShareMomentScreenshotFragment$IconCompatParcelizer */
    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<FragmentBuilder_BindSmeLoanFragment, Boolean> {
        public static final IconCompatParcelizer write = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            FragmentBuilder_BindSmeLoanFragment fragmentBuilder_BindSmeLoanFragment = (FragmentBuilder_BindSmeLoanFragment) obj;
            if (fragmentBuilder_BindSmeLoanFragment != null) {
                z = fragmentBuilder_BindSmeLoanFragment.MediaBrowserCompat$ItemReceiver;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }
}
