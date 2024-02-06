package p040o;

/* renamed from: o.FragmentBuilder_BindPurchasedTabFragment$MediaBrowserCompat$SearchResultReceiver */
public final class C6694x80964c21 extends FragmentBuilder_BindPurchasedTabFragment {
    final FragmentBuilder_BindMerchantWalletSelectorFragment IconCompatParcelizer;
    final Throwable MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6694x80964c21)) {
            return false;
        }
        C6694x80964c21 fragmentBuilder_BindPurchasedTabFragment$MediaBrowserCompat$SearchResultReceiver = (C6694x80964c21) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) fragmentBuilder_BindPurchasedTabFragment$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fragmentBuilder_BindPurchasedTabFragment$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = fragmentBuilder_BindMerchantWalletSelectorFragment != null ? fragmentBuilder_BindMerchantWalletSelectorFragment.hashCode() : 0;
        Throwable th = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (th != null) {
            i = th.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LoadFailure(systemCode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", throwable=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public C6694x80964c21(FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th) {
        super((byte) 0);
        this.IconCompatParcelizer = fragmentBuilder_BindMerchantWalletSelectorFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }
}
