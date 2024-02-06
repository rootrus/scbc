package p040o;

/* renamed from: o.FragmentBuilder_BindTransferToOthersStep1Fragment$MediaBrowserCompat$ItemReceiver */
final class C6863xb415f297 extends CheckEligibilityActivity implements FundFactSheetActivity<FragmentBuilder_BindVerifyIdentityFragment, Boolean> {
    public static final C6863xb415f297 IconCompatParcelizer = new C6863xb415f297();

    C6863xb415f297() {
        super(1);
    }

    public final /* synthetic */ Object invoke(Object obj) {
        boolean z;
        FragmentBuilder_BindVerifyIdentityFragment fragmentBuilder_BindVerifyIdentityFragment = (FragmentBuilder_BindVerifyIdentityFragment) obj;
        if (fragmentBuilder_BindVerifyIdentityFragment != null) {
            z = FragmentBuilder_BindUnbilledTabFragment.read().contains(fragmentBuilder_BindVerifyIdentityFragment);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
