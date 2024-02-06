package p040o;

/* renamed from: o.FragmentBuilder_BindRemittanceFaqFragment$MediaBrowserCompat$MediaItem */
final class C6723x4e686a46 extends CheckEligibilityActivity implements FundFactSheetActivity<FragmentBuilder_BindRemittanceRecipientDetailFragment, Boolean> {
    public static final C6723x4e686a46 read = new C6723x4e686a46();

    C6723x4e686a46() {
        super(1);
    }

    public final /* synthetic */ Object invoke(Object obj) {
        FragmentBuilder_BindRemittanceRecipientDetailFragment fragmentBuilder_BindRemittanceRecipientDetailFragment = (FragmentBuilder_BindRemittanceRecipientDetailFragment) obj;
        boolean z = true;
        if (fragmentBuilder_BindRemittanceRecipientDetailFragment == null || !fragmentBuilder_BindRemittanceRecipientDetailFragment.MediaBrowserCompat$ItemReceiver) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
