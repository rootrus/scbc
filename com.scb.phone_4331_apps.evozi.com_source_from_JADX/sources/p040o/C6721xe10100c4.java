package p040o;

/* renamed from: o.FragmentBuilder_BindRemittanceFaqFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C6721xe10100c4 extends CheckEligibilityActivity implements BaseDiscoverDisclaimerActivity<FundFactSheetActivity<? super FragmentBuilder_BindHomeAddressFragment, ? extends Boolean>, FragmentBuilder_BindHomeAddressFragment, Boolean, Boolean> {
    public static final C6721xe10100c4 IconCompatParcelizer = new C6721xe10100c4();

    C6721xe10100c4() {
        super(3);
    }

    public final /* synthetic */ Object write(Object obj, Object obj2, Object obj3) {
        boolean z;
        FundFactSheetActivity fundFactSheetActivity = (FundFactSheetActivity) obj;
        FragmentBuilder_BindHomeAddressFragment fragmentBuilder_BindHomeAddressFragment = (FragmentBuilder_BindHomeAddressFragment) obj2;
        Boolean bool = (Boolean) obj3;
        if (fragmentBuilder_BindHomeAddressFragment != null) {
            if (fundFactSheetActivity == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            if (((Boolean) fundFactSheetActivity.invoke(fragmentBuilder_BindHomeAddressFragment)).booleanValue() && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool, (Object) Boolean.TRUE)) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
