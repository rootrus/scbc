package p040o;

import p040o.CaptureDocumentActivity_ViewBinding;

/* renamed from: o.FragmentBuilder_BindStopChequeInputFragment */
public final class FragmentBuilder_BindStopChequeInputFragment {
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindStopChequeHistoryFragment> IconCompatParcelizer;
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> MediaBrowserCompat$CustomActionResultReceiver;
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> MediaBrowserCompat$ItemReceiver;
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> read;
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> write;

    static {
        FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindStopChequeHistoryFragment> fundFactSheetActivity = read.MediaBrowserCompat$ItemReceiver;
        IconCompatParcelizer = fundFactSheetActivity;
        FundFactSheetActivity fundFactSheetActivity2 = IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) fundFactSheetActivity, "selector");
        onGetStartedClick.write((Object) fundFactSheetActivity2, "compute");
        MediaBrowserCompat$CustomActionResultReceiver = new C6351x57c5459e(fundFactSheetActivity, fundFactSheetActivity2);
        FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindStopChequeHistoryFragment> fundFactSheetActivity3 = IconCompatParcelizer;
        FundFactSheetActivity fundFactSheetActivity4 = write.read;
        onGetStartedClick.write((Object) fundFactSheetActivity3, "selector");
        onGetStartedClick.write((Object) fundFactSheetActivity4, "compute");
        read = new C6351x57c5459e(fundFactSheetActivity3, fundFactSheetActivity4);
        FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindStopChequeHistoryFragment> fundFactSheetActivity5 = IconCompatParcelizer;
        FundFactSheetActivity fundFactSheetActivity6 = C6814xfa0641f3.read;
        onGetStartedClick.write((Object) fundFactSheetActivity5, "selector");
        onGetStartedClick.write((Object) fundFactSheetActivity6, "compute");
        FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> captureDocumentActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = new C6351x57c5459e(fundFactSheetActivity5, fundFactSheetActivity6);
        MediaBrowserCompat$ItemReceiver = captureDocumentActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver;
        FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> fundFactSheetActivity7 = MediaBrowserCompat$CustomActionResultReceiver;
        BaseDiscoverFundFilterActivity baseDiscoverFundFilterActivity = C6815xcaad1602.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) fundFactSheetActivity7, "selector1");
        onGetStartedClick.write((Object) captureDocumentActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver, "selector2");
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "compute");
        write = new CaptureDocumentActivity_ViewBinding.IconCompatParcelizer(fundFactSheetActivity7, captureDocumentActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver, baseDiscoverFundFilterActivity);
    }

    public static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> IconCompatParcelizer() {
        return read;
    }

    public static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> write() {
        return MediaBrowserCompat$ItemReceiver;
    }

    public static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }

    public static final boolean write(OnBoardingTutorialActivity onBoardingTutorialActivity) {
        onGetStartedClick.write((Object) onBoardingTutorialActivity, "state");
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) write.invoke(onBoardingTutorialActivity), (Object) Boolean.TRUE);
    }

    /* renamed from: o.FragmentBuilder_BindStopChequeInputFragment$read */
    static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindStopChequeHistoryFragment> {
        public static final read MediaBrowserCompat$ItemReceiver = new read();

        read() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            OnBoardingTutorialActivity onBoardingTutorialActivity = (OnBoardingTutorialActivity) obj;
            if (onBoardingTutorialActivity != null) {
                return onBoardingTutorialActivity.PlaybackStateCompat$CustomAction;
            }
            return null;
        }
    }

    /* renamed from: o.FragmentBuilder_BindStopChequeInputFragment$IconCompatParcelizer */
    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<FragmentBuilder_BindStopChequeHistoryFragment, Boolean> {
        public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            FragmentBuilder_BindStopChequeHistoryFragment fragmentBuilder_BindStopChequeHistoryFragment = (FragmentBuilder_BindStopChequeHistoryFragment) obj;
            if (fragmentBuilder_BindStopChequeHistoryFragment != null) {
                z = fragmentBuilder_BindStopChequeHistoryFragment.read;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: o.FragmentBuilder_BindStopChequeInputFragment$write */
    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<FragmentBuilder_BindStopChequeHistoryFragment, Boolean> {
        public static final write read = new write();

        write() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            FragmentBuilder_BindStopChequeHistoryFragment fragmentBuilder_BindStopChequeHistoryFragment = (FragmentBuilder_BindStopChequeHistoryFragment) obj;
            if (fragmentBuilder_BindStopChequeHistoryFragment != null) {
                z = fragmentBuilder_BindStopChequeHistoryFragment.MediaBrowserCompat$ItemReceiver;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }
}
