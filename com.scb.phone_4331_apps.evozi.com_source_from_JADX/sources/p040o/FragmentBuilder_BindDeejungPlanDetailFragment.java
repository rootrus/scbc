package p040o;

/* renamed from: o.FragmentBuilder_BindDeejungPlanDetailFragment */
public final /* synthetic */ class FragmentBuilder_BindDeejungPlanDetailFragment implements BondDeepLinkActivity {
    private final /* synthetic */ int IconCompatParcelizer;
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ long read;
    private final /* synthetic */ String write;

    public /* synthetic */ FragmentBuilder_BindDeejungPlanDetailFragment(int i, String str, long j, int i2) {
        this.IconCompatParcelizer = i;
        this.write = str;
        this.read = j;
        this.MediaBrowserCompat$ItemReceiver = i2;
    }

    public final void read(AddAccountConsentDeepLinkActivity addAccountConsentDeepLinkActivity) {
        FragmentBuilder_BindDepositSelectorFragment.IconCompatParcelizer(this.IconCompatParcelizer, this.write, this.read, this.MediaBrowserCompat$ItemReceiver, addAccountConsentDeepLinkActivity);
    }
}
