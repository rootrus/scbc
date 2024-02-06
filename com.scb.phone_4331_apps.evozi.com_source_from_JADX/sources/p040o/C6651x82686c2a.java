package p040o;

/* renamed from: o.FragmentBuilder_BindPrepaidFragment$MediaBrowserCompat$ItemReceiver */
final class C6651x82686c2a extends CheckEligibilityActivity implements BaseDiscoverFundFilterActivity<Boolean, Boolean, Boolean> {
    public static final C6651x82686c2a IconCompatParcelizer = new C6651x82686c2a();

    C6651x82686c2a() {
        super(2);
    }

    public final /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
        return Boolean.valueOf(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) (Boolean) obj, (Object) Boolean.TRUE) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) (Boolean) obj2, (Object) Boolean.FALSE));
    }
}
