package p040o;

/* renamed from: o.FragmentBuilder_BindReceiveFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C6700x2b50da0f extends CheckEligibilityActivity implements BaseDiscoverFundFilterActivity<Boolean, Boolean, Boolean> {
    public static final C6700x2b50da0f read = new C6700x2b50da0f();

    C6700x2b50da0f() {
        super(2);
    }

    public final /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj2;
        boolean z = false;
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) (Boolean) obj, (Object) Boolean.FALSE) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool, (Object) Boolean.TRUE)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
