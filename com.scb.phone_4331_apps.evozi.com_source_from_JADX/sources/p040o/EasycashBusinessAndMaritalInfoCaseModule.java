package p040o;

/* renamed from: o.EasycashBusinessAndMaritalInfoCaseModule */
public final class EasycashBusinessAndMaritalInfoCaseModule {
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> IconCompatParcelizer;
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, EasycashCardInfoCaseModule> MediaBrowserCompat$ItemReceiver;
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> write;

    static {
        FundFactSheetActivity<OnBoardingTutorialActivity, EasycashCardInfoCaseModule> fundFactSheetActivity = C6444x7209fdf8.IconCompatParcelizer;
        MediaBrowserCompat$ItemReceiver = fundFactSheetActivity;
        FundFactSheetActivity fundFactSheetActivity2 = write.IconCompatParcelizer;
        onGetStartedClick.write((Object) fundFactSheetActivity, "selector");
        onGetStartedClick.write((Object) fundFactSheetActivity2, "compute");
        IconCompatParcelizer = new C6351x57c5459e(fundFactSheetActivity, fundFactSheetActivity2);
        FundFactSheetActivity<OnBoardingTutorialActivity, EasycashCardInfoCaseModule> fundFactSheetActivity3 = MediaBrowserCompat$ItemReceiver;
        FundFactSheetActivity fundFactSheetActivity4 = C6443xe61b0369.read;
        onGetStartedClick.write((Object) fundFactSheetActivity3, "selector");
        onGetStartedClick.write((Object) fundFactSheetActivity4, "compute");
        write = new C6351x57c5459e(fundFactSheetActivity3, fundFactSheetActivity4);
    }

    public static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> read() {
        return IconCompatParcelizer;
    }

    public static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> MediaBrowserCompat$ItemReceiver() {
        return write;
    }

    public static final boolean MediaBrowserCompat$CustomActionResultReceiver(OnBoardingTutorialActivity onBoardingTutorialActivity) {
        onGetStartedClick.write((Object) onBoardingTutorialActivity, "state");
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) write.invoke(onBoardingTutorialActivity), (Object) Boolean.TRUE);
    }

    /* renamed from: o.EasycashBusinessAndMaritalInfoCaseModule$write */
    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<EasycashCardInfoCaseModule, Boolean> {
        public static final write IconCompatParcelizer = new write();

        write() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EasycashCardInfoCaseModule easycashCardInfoCaseModule = (EasycashCardInfoCaseModule) obj;
            boolean z = true;
            if (easycashCardInfoCaseModule == null || !easycashCardInfoCaseModule.read) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }
}
