package p040o;

/* renamed from: o.FragmentBuilder_BindTempLimitConfirmationFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C6825xdc163e48 extends CheckEligibilityActivity implements DiscoverActivity<Boolean, Boolean, Boolean, Boolean, FragmentBuilder_BindVerifyIdentityFragment, Boolean> {
    public static final C6825xdc163e48 IconCompatParcelizer = new C6825xdc163e48();

    C6825xdc163e48() {
        super(5);
    }

    public final /* synthetic */ Object read(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Boolean bool = (Boolean) obj2;
        Boolean bool2 = (Boolean) obj3;
        Boolean bool3 = (Boolean) obj4;
        FragmentBuilder_BindVerifyIdentityFragment fragmentBuilder_BindVerifyIdentityFragment = (FragmentBuilder_BindVerifyIdentityFragment) obj5;
        Boolean bool4 = Boolean.TRUE;
        return Boolean.valueOf((onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) (Boolean) obj, (Object) bool4) || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool, (Object) bool4) || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool2, (Object) bool4) || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool3, (Object) bool4)) && fragmentBuilder_BindVerifyIdentityFragment == FragmentBuilder_BindVerifyIdentityFragment.DESIGN_TIME_ON);
    }
}
