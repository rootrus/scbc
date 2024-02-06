package p040o;

/* renamed from: o.FragmentBuilder_BindTempLimitConfirmationFragment$MediaBrowserCompat$MediaItem */
final class C6827x778ee442 extends CheckEligibilityActivity implements FundFactSheetActivity<FragmentBuilder_BindTabDebitCardServiceFragment, Boolean> {
    public static final C6827x778ee442 MediaBrowserCompat$ItemReceiver = new C6827x778ee442();

    C6827x778ee442() {
        super(1);
    }

    public final /* synthetic */ Object invoke(Object obj) {
        boolean z;
        FragmentBuilder_BindTabDebitCardServiceFragment fragmentBuilder_BindTabDebitCardServiceFragment = (FragmentBuilder_BindTabDebitCardServiceFragment) obj;
        if (fragmentBuilder_BindTabDebitCardServiceFragment != null) {
            z = fragmentBuilder_BindTabDebitCardServiceFragment.read;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
