package p040o;

/* renamed from: o.FragmentBuilder_BindMwShopAddressOnlineFragment$MediaBrowserCompat$MediaItem */
public final class C6568x313985f7 extends FragmentBuilder_BindMwShopAddressOnlineFragment {
    final Throwable IconCompatParcelizer;
    final FragmentBuilder_BindMerchantWalletSelectorFragment MediaBrowserCompat$CustomActionResultReceiver;
    final Integer read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6568x313985f7)) {
            return false;
        }
        C6568x313985f7 fragmentBuilder_BindMwShopAddressOnlineFragment$MediaBrowserCompat$MediaItem = (C6568x313985f7) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fragmentBuilder_BindMwShopAddressOnlineFragment$MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) fragmentBuilder_BindMwShopAddressOnlineFragment$MediaBrowserCompat$MediaItem.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) fragmentBuilder_BindMwShopAddressOnlineFragment$MediaBrowserCompat$MediaItem.read);
    }

    public final int hashCode() {
        FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = fragmentBuilder_BindMerchantWalletSelectorFragment != null ? fragmentBuilder_BindMerchantWalletSelectorFragment.hashCode() : 0;
        Throwable th = this.IconCompatParcelizer;
        int hashCode2 = th != null ? th.hashCode() : 0;
        Integer num = this.read;
        if (num != null) {
            i = num.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PerformLoginFailure(systemCode=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", throwable=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", resultCode=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6568x313985f7(FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th, int i) {
        this(fragmentBuilder_BindMerchantWalletSelectorFragment, (i & 2) != 0 ? null : th, (Integer) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6568x313985f7(FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th, Integer num) {
        super((byte) 0);
        onGetStartedClick.write((Object) fragmentBuilder_BindMerchantWalletSelectorFragment, "systemCode");
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindMerchantWalletSelectorFragment;
        this.IconCompatParcelizer = th;
        this.read = num;
    }
}
