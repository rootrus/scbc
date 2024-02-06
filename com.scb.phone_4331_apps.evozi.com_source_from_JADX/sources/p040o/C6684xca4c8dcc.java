package p040o;

/* renamed from: o.FragmentBuilder_BindPurchaseCreditCardInputFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C6684xca4c8dcc extends CheckEligibilityActivity implements FundFactSheetActivity<FragmentBuilder_BindPromptPayTargetSelectFragment, Boolean> {
    public static final C6684xca4c8dcc IconCompatParcelizer = new C6684xca4c8dcc();

    C6684xca4c8dcc() {
        super(1);
    }

    public final /* synthetic */ Object invoke(Object obj) {
        boolean z;
        FragmentBuilder_BindPromptPayTargetSelectFragment fragmentBuilder_BindPromptPayTargetSelectFragment = (FragmentBuilder_BindPromptPayTargetSelectFragment) obj;
        if (fragmentBuilder_BindPromptPayTargetSelectFragment != null) {
            z = fragmentBuilder_BindPromptPayTargetSelectFragment.write;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
