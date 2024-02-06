package p040o;

/* renamed from: o.FragmentBuilder_BindMwShopAddressOnlineFragment$MediaBrowserCompat$ItemReceiver */
public final class C6567xcb022142 extends FragmentBuilder_BindMwShopAddressOnlineFragment {
    private final FragmentBuilder_BindMerchantWalletSelectorFragment IconCompatParcelizer;
    private final Throwable MediaBrowserCompat$CustomActionResultReceiver;
    private final Integer write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6567xcb022142)) {
            return false;
        }
        C6567xcb022142 fragmentBuilder_BindMwShopAddressOnlineFragment$MediaBrowserCompat$ItemReceiver = (C6567xcb022142) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) fragmentBuilder_BindMwShopAddressOnlineFragment$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fragmentBuilder_BindMwShopAddressOnlineFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fragmentBuilder_BindMwShopAddressOnlineFragment$MediaBrowserCompat$ItemReceiver.write);
    }

    public final int hashCode() {
        FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = fragmentBuilder_BindMerchantWalletSelectorFragment != null ? fragmentBuilder_BindMerchantWalletSelectorFragment.hashCode() : 0;
        Throwable th = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = th != null ? th.hashCode() : 0;
        Integer num = this.write;
        if (num != null) {
            i = num.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AutoLoginFailure(systemCode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", throwable=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", resultCode=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6567xcb022142(FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th, int i) {
        this(fragmentBuilder_BindMerchantWalletSelectorFragment, (i & 2) != 0 ? null : th, (Integer) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6567xcb022142(FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th, Integer num) {
        super((byte) 0);
        onGetStartedClick.write((Object) fragmentBuilder_BindMerchantWalletSelectorFragment, "systemCode");
        this.IconCompatParcelizer = fragmentBuilder_BindMerchantWalletSelectorFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
        this.write = num;
    }
}
