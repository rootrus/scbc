package p040o;

/* renamed from: o.FragmentBuilder_BindSmeLoanSelectorFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6802xcc96eec6 extends FragmentBuilder_BindSmeLoanSelectorFragment {
    final Throwable IconCompatParcelizer;
    final FragmentBuilder_BindMerchantWalletSelectorFragment MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6802xcc96eec6)) {
            return false;
        }
        C6802xcc96eec6 fragmentBuilder_BindSmeLoanSelectorFragment$MediaBrowserCompat$CustomActionResultReceiver = (C6802xcc96eec6) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fragmentBuilder_BindSmeLoanSelectorFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) fragmentBuilder_BindSmeLoanSelectorFragment$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer);
    }

    public final int hashCode() {
        FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = fragmentBuilder_BindMerchantWalletSelectorFragment != null ? fragmentBuilder_BindMerchantWalletSelectorFragment.hashCode() : 0;
        Throwable th = this.IconCompatParcelizer;
        if (th != null) {
            i = th.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FetchOptOutFailure(systemCode=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", throwable=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6802xcc96eec6(FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th) {
        super((byte) 0);
        onGetStartedClick.write((Object) fragmentBuilder_BindMerchantWalletSelectorFragment, "systemCode");
        onGetStartedClick.write((Object) th, "throwable");
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindMerchantWalletSelectorFragment;
        this.IconCompatParcelizer = th;
    }
}
