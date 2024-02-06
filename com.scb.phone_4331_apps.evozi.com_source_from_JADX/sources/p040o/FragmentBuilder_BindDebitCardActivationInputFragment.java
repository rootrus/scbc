package p040o;

/* renamed from: o.FragmentBuilder_BindDebitCardActivationInputFragment */
public final /* synthetic */ class FragmentBuilder_BindDebitCardActivationInputFragment implements BondDeepLinkActivity {
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String write;

    public /* synthetic */ FragmentBuilder_BindDebitCardActivationInputFragment(String str, int i) {
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void read(AddAccountConsentDeepLinkActivity addAccountConsentDeepLinkActivity) {
        FragmentBuilder_BindDepositSelectorFragment.IconCompatParcelizer(this.write, this.MediaBrowserCompat$ItemReceiver, addAccountConsentDeepLinkActivity);
    }
}
