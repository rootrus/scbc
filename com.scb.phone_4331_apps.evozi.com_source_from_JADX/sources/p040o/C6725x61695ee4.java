package p040o;

/* renamed from: o.FragmentBuilder_BindRemittanceFaqFragment$MediaSessionCompat$ResultReceiverWrapper */
final class C6725x61695ee4 extends CheckEligibilityActivity implements FundFactSheetActivity<FragmentBuilder_BindRemittanceRecipientDetailFragment, Boolean> {
    public static final C6725x61695ee4 MediaBrowserCompat$ItemReceiver = new C6725x61695ee4();

    C6725x61695ee4() {
        super(1);
    }

    public final /* synthetic */ Object invoke(Object obj) {
        FragmentBuilder_BindRemittanceRecipientDetailFragment fragmentBuilder_BindRemittanceRecipientDetailFragment = (FragmentBuilder_BindRemittanceRecipientDetailFragment) obj;
        boolean z = true;
        if (fragmentBuilder_BindRemittanceRecipientDetailFragment == null || !fragmentBuilder_BindRemittanceRecipientDetailFragment.IconCompatParcelizer) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
