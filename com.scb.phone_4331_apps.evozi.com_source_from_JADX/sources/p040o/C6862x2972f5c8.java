package p040o;

/* renamed from: o.FragmentBuilder_BindTransferToOthersStep1Fragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C6862x2972f5c8 extends CheckEligibilityActivity implements FundFactSheetActivity<FragmentBuilder_BindVerifyIdentityFragment, Boolean> {
    public static final C6862x2972f5c8 read = new C6862x2972f5c8();

    C6862x2972f5c8() {
        super(1);
    }

    public final /* synthetic */ Object invoke(Object obj) {
        boolean z;
        FragmentBuilder_BindVerifyIdentityFragment fragmentBuilder_BindVerifyIdentityFragment = (FragmentBuilder_BindVerifyIdentityFragment) obj;
        if (fragmentBuilder_BindVerifyIdentityFragment != null) {
            z = FragmentBuilder_BindUnbilledTabFragment.write().contains(fragmentBuilder_BindVerifyIdentityFragment);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
