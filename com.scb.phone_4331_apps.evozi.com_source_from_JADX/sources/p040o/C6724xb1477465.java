package p040o;

/* renamed from: o.FragmentBuilder_BindRemittanceFaqFragment$MediaBrowserCompat$SearchResultReceiver */
final class C6724xb1477465 extends CheckEligibilityActivity implements BaseDiscoverDisclaimerActivity<Boolean, Boolean, Boolean, Boolean> {
    public static final C6724xb1477465 read = new C6724xb1477465();

    C6724xb1477465() {
        super(3);
    }

    public final /* synthetic */ Object write(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        Boolean bool3 = Boolean.TRUE;
        boolean z = true;
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) (Boolean) obj3, (Object) bool3) && !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool2, (Object) bool3) && !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool, (Object) bool3)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
