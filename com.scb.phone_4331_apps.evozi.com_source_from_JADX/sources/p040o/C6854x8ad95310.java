package p040o;

/* renamed from: o.FragmentBuilder_BindTouchPointWifiSettingsFragment$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
final class C6854x8ad95310 extends CheckEligibilityActivity implements BaseDiscoverSearchActivity_ViewBinding<Boolean, Boolean, Boolean, Boolean, FragmentBuilder_BindTransferHistoryFragment> {
    public static final C6854x8ad95310 MediaBrowserCompat$CustomActionResultReceiver = new C6854x8ad95310();

    C6854x8ad95310() {
        super(4);
    }

    public final /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj, Object obj2, Object obj3, Object obj4) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        Boolean bool3 = (Boolean) obj3;
        boolean z = false;
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) (Boolean) obj4, (Object) Boolean.TRUE)) {
            return new FragmentBuilder_BindTransferHistoryFragment((byte) 0);
        }
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        if (bool3 != null) {
            z = bool3.booleanValue();
        }
        return new FragmentBuilder_BindTransferHistoryFragment(booleanValue, booleanValue2, z);
    }
}
