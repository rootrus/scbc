package p040o;

/* renamed from: o.FragmentBuilder_BindTransferToOthersStep1Fragment */
public final class FragmentBuilder_BindTransferToOthersStep1Fragment {
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> IconCompatParcelizer;
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindWifiSettingsFragment> MediaBrowserCompat$CustomActionResultReceiver;
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> MediaBrowserCompat$ItemReceiver;
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindVerifyIdentityFragment> MediaMetadataCompat;
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindVerifyIdentityFragment> read;
    private static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> write;

    static {
        FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindWifiSettingsFragment> fundFactSheetActivity = write.MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$CustomActionResultReceiver = fundFactSheetActivity;
        FundFactSheetActivity fundFactSheetActivity2 = C6864xdf867c69.write;
        onGetStartedClick.write((Object) fundFactSheetActivity, "selector");
        onGetStartedClick.write((Object) fundFactSheetActivity2, "compute");
        MediaMetadataCompat = new C6351x57c5459e(fundFactSheetActivity, fundFactSheetActivity2);
        FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindWifiSettingsFragment> fundFactSheetActivity3 = MediaBrowserCompat$CustomActionResultReceiver;
        FundFactSheetActivity fundFactSheetActivity4 = IconCompatParcelizer.IconCompatParcelizer;
        onGetStartedClick.write((Object) fundFactSheetActivity3, "selector");
        onGetStartedClick.write((Object) fundFactSheetActivity4, "compute");
        read = new C6351x57c5459e(fundFactSheetActivity3, fundFactSheetActivity4);
        FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindVerifyIdentityFragment> fundFactSheetActivity5 = MediaMetadataCompat;
        FundFactSheetActivity fundFactSheetActivity6 = C6862x2972f5c8.read;
        onGetStartedClick.write((Object) fundFactSheetActivity5, "selector");
        onGetStartedClick.write((Object) fundFactSheetActivity6, "compute");
        IconCompatParcelizer = new C6351x57c5459e(fundFactSheetActivity5, fundFactSheetActivity6);
        FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindVerifyIdentityFragment> fundFactSheetActivity7 = MediaMetadataCompat;
        FundFactSheetActivity fundFactSheetActivity8 = C6863xb415f297.IconCompatParcelizer;
        onGetStartedClick.write((Object) fundFactSheetActivity7, "selector");
        onGetStartedClick.write((Object) fundFactSheetActivity8, "compute");
        write = new C6351x57c5459e(fundFactSheetActivity7, fundFactSheetActivity8);
        FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindVerifyIdentityFragment> fundFactSheetActivity9 = MediaMetadataCompat;
        FundFactSheetActivity fundFactSheetActivity10 = read.read;
        onGetStartedClick.write((Object) fundFactSheetActivity9, "selector");
        onGetStartedClick.write((Object) fundFactSheetActivity10, "compute");
        MediaBrowserCompat$ItemReceiver = new C6351x57c5459e(fundFactSheetActivity9, fundFactSheetActivity10);
    }

    public static final FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindVerifyIdentityFragment> write() {
        return MediaMetadataCompat;
    }

    public static final FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindVerifyIdentityFragment> IconCompatParcelizer() {
        return read;
    }

    public static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> MediaBrowserCompat$ItemReceiver() {
        return IconCompatParcelizer;
    }

    public static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }

    public static final FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> read() {
        return MediaBrowserCompat$ItemReceiver;
    }

    public static final FragmentBuilder_BindVerifyIdentityFragment write(OnBoardingTutorialActivity onBoardingTutorialActivity) {
        onGetStartedClick.write((Object) onBoardingTutorialActivity, "state");
        return MediaMetadataCompat.invoke(onBoardingTutorialActivity);
    }

    public static final boolean read(OnBoardingTutorialActivity onBoardingTutorialActivity) {
        onGetStartedClick.write((Object) onBoardingTutorialActivity, "state");
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) write.invoke(onBoardingTutorialActivity), (Object) Boolean.TRUE);
    }

    public static final boolean MediaBrowserCompat$ItemReceiver(OnBoardingTutorialActivity onBoardingTutorialActivity) {
        onGetStartedClick.write((Object) onBoardingTutorialActivity, "state");
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) MediaBrowserCompat$ItemReceiver.invoke(onBoardingTutorialActivity), (Object) Boolean.TRUE);
    }

    public static final boolean IconCompatParcelizer(OnBoardingTutorialActivity onBoardingTutorialActivity) {
        onGetStartedClick.write((Object) onBoardingTutorialActivity, "state");
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) IconCompatParcelizer.invoke(onBoardingTutorialActivity), (Object) Boolean.TRUE);
    }

    /* renamed from: o.FragmentBuilder_BindTransferToOthersStep1Fragment$read */
    static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<FragmentBuilder_BindVerifyIdentityFragment, Boolean> {
        public static final read read = new read();

        read() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FragmentBuilder_BindVerifyIdentityFragment fragmentBuilder_BindVerifyIdentityFragment = (FragmentBuilder_BindVerifyIdentityFragment) obj;
            boolean z = true;
            if (!(fragmentBuilder_BindVerifyIdentityFragment == null || fragmentBuilder_BindVerifyIdentityFragment == FragmentBuilder_BindVerifyIdentityFragment.RUNTIME)) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: o.FragmentBuilder_BindTransferToOthersStep1Fragment$write */
    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindWifiSettingsFragment> {
        public static final write MediaBrowserCompat$ItemReceiver = new write();

        write() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            OnBoardingTutorialActivity onBoardingTutorialActivity = (OnBoardingTutorialActivity) obj;
            if (onBoardingTutorialActivity != null) {
                return onBoardingTutorialActivity.setBackgroundResource;
            }
            return null;
        }
    }

    /* renamed from: o.FragmentBuilder_BindTransferToOthersStep1Fragment$IconCompatParcelizer */
    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<FragmentBuilder_BindWifiSettingsFragment, FragmentBuilder_BindVerifyIdentityFragment> {
        public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r1 = r1.MediaBrowserCompat$ItemReceiver;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
            /*
                r0 = this;
                o.FragmentBuilder_BindWifiSettingsFragment r1 = (p040o.FragmentBuilder_BindWifiSettingsFragment) r1
                if (r1 == 0) goto L_0x0008
                o.FragmentBuilder_BindVerifyIdentityFragment r1 = r1.MediaBrowserCompat$ItemReceiver
                if (r1 != 0) goto L_0x000a
            L_0x0008:
                o.FragmentBuilder_BindVerifyIdentityFragment r1 = p040o.FragmentBuilder_BindVerifyIdentityFragment.DESIGN_TIME_OFF
            L_0x000a:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindTransferToOthersStep1Fragment.IconCompatParcelizer.invoke(java.lang.Object):java.lang.Object");
        }
    }
}
