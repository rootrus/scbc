package p040o;

/* renamed from: o.FragmentBuilder_BindOutgoingFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6630x641e8eda extends FragmentBuilder_BindOutgoingFragment {
    final Throwable MediaBrowserCompat$ItemReceiver;
    final FragmentBuilder_BindMerchantWalletSelectorFragment write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6630x641e8eda)) {
            return false;
        }
        C6630x641e8eda fragmentBuilder_BindOutgoingFragment$MediaBrowserCompat$CustomActionResultReceiver = (C6630x641e8eda) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fragmentBuilder_BindOutgoingFragment$MediaBrowserCompat$CustomActionResultReceiver.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fragmentBuilder_BindOutgoingFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment = this.write;
        int i = 0;
        int hashCode = fragmentBuilder_BindMerchantWalletSelectorFragment != null ? fragmentBuilder_BindMerchantWalletSelectorFragment.hashCode() : 0;
        Throwable th = this.MediaBrowserCompat$ItemReceiver;
        if (th != null) {
            i = th.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UpdatingAdminViewFailure(systemCode=");
        sb.append(this.write);
        sb.append(", throwable=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C6630x641e8eda(FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment) {
        this(fragmentBuilder_BindMerchantWalletSelectorFragment, (Throwable) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6630x641e8eda(FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th) {
        super((byte) 0);
        onGetStartedClick.write((Object) fragmentBuilder_BindMerchantWalletSelectorFragment, "systemCode");
        this.write = fragmentBuilder_BindMerchantWalletSelectorFragment;
        this.MediaBrowserCompat$ItemReceiver = th;
    }
}
