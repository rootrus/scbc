package p040o;

/* renamed from: o.FragmentBuilder_BindDebitWithdrawalLimitFragment */
public final /* synthetic */ class FragmentBuilder_BindDebitWithdrawalLimitFragment implements BondDeepLinkActivity {
    private final /* synthetic */ String write;

    public /* synthetic */ FragmentBuilder_BindDebitWithdrawalLimitFragment(String str) {
        this.write = str;
    }

    public final void read(AddAccountConsentDeepLinkActivity addAccountConsentDeepLinkActivity) {
        FragmentBuilder_BindDepositSelectorFragment.IconCompatParcelizer(this.write, addAccountConsentDeepLinkActivity);
    }
}
