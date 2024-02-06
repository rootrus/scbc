package p040o;

/* renamed from: o.FragmentBuilder_BindTouchPointWifiSettingsFragment$MediaBrowserCompat$ItemReceiver */
final class C6851xefa65786 extends CheckEligibilityActivity implements BaseDiscoverDisclaimerActivity<Boolean, FragmentBuilder_BindTransferToMeStep1Fragment, Boolean, Boolean> {
    public static final C6851xefa65786 read = new C6851xefa65786();

    C6851xefa65786() {
        super(3);
    }

    public final /* synthetic */ Object write(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj;
        FragmentBuilder_BindTransferToMeStep1Fragment fragmentBuilder_BindTransferToMeStep1Fragment = (FragmentBuilder_BindTransferToMeStep1Fragment) obj2;
        Boolean bool2 = (Boolean) obj3;
        Boolean bool3 = Boolean.TRUE;
        boolean z = true;
        if ((!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool, (Object) bool3) || fragmentBuilder_BindTransferToMeStep1Fragment == null) && (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool, (Object) bool3) || !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool2, (Object) Boolean.FALSE))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
