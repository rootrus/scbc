package p040o;

/* renamed from: o.FragmentBuilder_BindTempLimitConfirmationFragment$MediaBrowserCompat$ItemReceiver */
final class C6826x936a1b17 extends CheckEligibilityActivity implements DiscoverActivity<Boolean, Boolean, Boolean, Boolean, Boolean, Boolean> {
    public static final C6826x936a1b17 write = new C6826x936a1b17();

    C6826x936a1b17() {
        super(5);
    }

    public final /* synthetic */ Object read(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Boolean bool = (Boolean) obj2;
        Boolean bool2 = (Boolean) obj3;
        Boolean bool3 = (Boolean) obj4;
        Boolean bool4 = (Boolean) obj5;
        Boolean bool5 = Boolean.TRUE;
        boolean z = true;
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) (Boolean) obj, (Object) bool5) && !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool, (Object) bool5) && !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool2, (Object) bool5) && !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool3, (Object) bool5) && !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool4, (Object) bool5)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
