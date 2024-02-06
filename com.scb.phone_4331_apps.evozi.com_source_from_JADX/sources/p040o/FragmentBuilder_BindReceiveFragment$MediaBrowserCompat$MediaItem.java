package p040o;

/* renamed from: o.FragmentBuilder_BindReceiveFragment$MediaBrowserCompat$MediaItem */
final class FragmentBuilder_BindReceiveFragment$MediaBrowserCompat$MediaItem extends CheckEligibilityActivity implements BaseDiscoverDisclaimerActivity<Boolean, Boolean, Boolean, Boolean> {
    public static final FragmentBuilder_BindReceiveFragment$MediaBrowserCompat$MediaItem MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindReceiveFragment$MediaBrowserCompat$MediaItem();

    FragmentBuilder_BindReceiveFragment$MediaBrowserCompat$MediaItem() {
        super(3);
    }

    public final /* synthetic */ Object write(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        Boolean bool3 = Boolean.TRUE;
        boolean z = true;
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) (Boolean) obj3, (Object) bool3) || (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool, (Object) Boolean.FALSE) && !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool2, (Object) bool3))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
