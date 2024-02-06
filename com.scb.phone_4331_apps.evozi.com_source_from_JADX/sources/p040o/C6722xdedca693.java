package p040o;

/* renamed from: o.FragmentBuilder_BindRemittanceFaqFragment$MediaBrowserCompat$ItemReceiver */
final class C6722xdedca693 extends CheckEligibilityActivity implements BaseDiscoverDisclaimerActivity<Boolean, Long, Boolean, Boolean> {
    public static final C6722xdedca693 MediaBrowserCompat$CustomActionResultReceiver = new C6722xdedca693();

    C6722xdedca693() {
        super(3);
    }

    public final /* synthetic */ Object write(Object obj, Object obj2, Object obj3) {
        Long l = (Long) obj2;
        Boolean bool = (Boolean) obj3;
        Boolean bool2 = Boolean.TRUE;
        return Boolean.valueOf(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) (Boolean) obj, (Object) bool2) && l != null && l.longValue() != 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool, (Object) bool2));
    }
}
