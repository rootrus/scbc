package p040o;

/* renamed from: o.FragmentBuilder_BindPurchasedTabFragment$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
public final class C6695x199ddfd9 extends FragmentBuilder_BindPurchasedTabFragment {
    final Throwable IconCompatParcelizer;
    final FragmentBuilder_BindMerchantWalletSelectorFragment MediaBrowserCompat$CustomActionResultReceiver;

    public C6695x199ddfd9() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6695x199ddfd9)) {
            return false;
        }
        C6695x199ddfd9 fragmentBuilder_BindPurchasedTabFragment$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = (C6695x199ddfd9) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fragmentBuilder_BindPurchasedTabFragment$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) fragmentBuilder_BindPurchasedTabFragment$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.IconCompatParcelizer);
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
        sb.append("PersistFailure(systemCode=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", throwable=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    private /* synthetic */ C6695x199ddfd9(byte b) {
        this((FragmentBuilder_BindMerchantWalletSelectorFragment) null, (Throwable) null);
    }

    public C6695x199ddfd9(FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th) {
        super((byte) 0);
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindMerchantWalletSelectorFragment;
        this.IconCompatParcelizer = th;
    }
}
