package p040o;

/* renamed from: o.FragmentBuilder_BindTouchPointWifiSettingsFragment$MediaBrowserCompat$SearchResultReceiver */
final class C6853xb2568258 extends CheckEligibilityActivity implements BaseDiscoverSearchActivity_ViewBinding<Boolean, Boolean, Boolean, Boolean, Boolean> {
    public static final C6853xb2568258 MediaBrowserCompat$CustomActionResultReceiver = new C6853xb2568258();

    C6853xb2568258() {
        super(4);
    }

    public final /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj, Object obj2, Object obj3, Object obj4) {
        Boolean bool = (Boolean) obj2;
        Boolean bool2 = (Boolean) obj3;
        Boolean bool3 = (Boolean) obj4;
        Boolean bool4 = Boolean.TRUE;
        boolean z = true;
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) (Boolean) obj, (Object) bool4) && !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool, (Object) bool4) && !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool2, (Object) bool4) && !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool3, (Object) bool4)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
