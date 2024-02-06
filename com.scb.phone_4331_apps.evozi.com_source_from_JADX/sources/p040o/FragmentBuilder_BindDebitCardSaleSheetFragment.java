package p040o;

/* renamed from: o.FragmentBuilder_BindDebitCardSaleSheetFragment */
public final /* synthetic */ class FragmentBuilder_BindDebitCardSaleSheetFragment implements BondDeepLinkActivity {
    private final /* synthetic */ int IconCompatParcelizer;
    private final /* synthetic */ String read;

    public /* synthetic */ FragmentBuilder_BindDebitCardSaleSheetFragment(String str, int i) {
        this.read = str;
        this.IconCompatParcelizer = i;
    }

    public final void read(AddAccountConsentDeepLinkActivity addAccountConsentDeepLinkActivity) {
        FragmentBuilder_BindDepositSelectorFragment.write(this.read, this.IconCompatParcelizer, addAccountConsentDeepLinkActivity);
    }
}
