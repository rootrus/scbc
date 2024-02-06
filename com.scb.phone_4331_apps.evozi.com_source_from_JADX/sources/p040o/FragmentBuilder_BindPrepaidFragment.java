package p040o;

import p040o.CaptureDocumentActivity_ViewBinding;

/* renamed from: o.FragmentBuilder_BindPrepaidFragment */
public final class FragmentBuilder_BindPrepaidFragment {
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> MediaBrowserCompat$CustomActionResultReceiver;
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> read;

    static {
        FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindVerifyIdentityFragment> write2 = FragmentBuilder_BindTransferToOthersStep1Fragment.write();
        FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> write3 = FragmentBuilder_BindPersonalizeFragment.write();
        BaseDiscoverFundFilterActivity baseDiscoverFundFilterActivity = write.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) write2, "selector1");
        onGetStartedClick.write((Object) write3, "selector2");
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "compute");
        read = new CaptureDocumentActivity_ViewBinding.IconCompatParcelizer(write2, write3, baseDiscoverFundFilterActivity);
        FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> MediaBrowserCompat$CustomActionResultReceiver2 = FragmentBuilder_BindTransferToOthersStep1Fragment.MediaBrowserCompat$CustomActionResultReceiver();
        FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> MediaMetadataCompat = FragmentBuilder_BindTouchPointWifiSettingsFragment.MediaMetadataCompat();
        BaseDiscoverFundFilterActivity baseDiscoverFundFilterActivity2 = C6651x82686c2a.IconCompatParcelizer;
        onGetStartedClick.write((Object) MediaBrowserCompat$CustomActionResultReceiver2, "selector1");
        onGetStartedClick.write((Object) MediaMetadataCompat, "selector2");
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity2, "compute");
        MediaBrowserCompat$CustomActionResultReceiver = new CaptureDocumentActivity_ViewBinding.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver2, MediaMetadataCompat, baseDiscoverFundFilterActivity2);
    }

    public static final boolean MediaBrowserCompat$ItemReceiver(OnBoardingTutorialActivity onBoardingTutorialActivity) {
        onGetStartedClick.write((Object) onBoardingTutorialActivity, "state");
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) read.invoke(onBoardingTutorialActivity), (Object) Boolean.TRUE);
    }

    public static final boolean IconCompatParcelizer(OnBoardingTutorialActivity onBoardingTutorialActivity) {
        onGetStartedClick.write((Object) onBoardingTutorialActivity, "state");
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) MediaBrowserCompat$CustomActionResultReceiver.invoke(onBoardingTutorialActivity), (Object) Boolean.TRUE);
    }

    /* renamed from: o.FragmentBuilder_BindPrepaidFragment$write */
    static final class write extends CheckEligibilityActivity implements BaseDiscoverFundFilterActivity<FragmentBuilder_BindVerifyIdentityFragment, Boolean, Boolean> {
        public static final write MediaBrowserCompat$CustomActionResultReceiver = new write();

        write() {
            super(2);
        }

        public final /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
            return Boolean.valueOf(((FragmentBuilder_BindVerifyIdentityFragment) obj) == FragmentBuilder_BindVerifyIdentityFragment.DESIGN_TIME_ON && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) (Boolean) obj2, (Object) Boolean.TRUE));
        }
    }
}
