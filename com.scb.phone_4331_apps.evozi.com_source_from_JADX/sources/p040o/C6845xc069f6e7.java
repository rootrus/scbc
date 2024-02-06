package p040o;

/* renamed from: o.FragmentBuilder_BindTopUpFavouriteTargetFragment$MediaBrowserCompat$ItemReceiver */
public final class C6845xc069f6e7 extends FragmentBuilder_BindTopUpFavouriteTargetFragment {
    final Throwable MediaBrowserCompat$CustomActionResultReceiver;
    final FragmentBuilder_BindMerchantWalletSelectorFragment write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6845xc069f6e7)) {
            return false;
        }
        C6845xc069f6e7 fragmentBuilder_BindTopUpFavouriteTargetFragment$MediaBrowserCompat$ItemReceiver = (C6845xc069f6e7) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fragmentBuilder_BindTopUpFavouriteTargetFragment$MediaBrowserCompat$ItemReceiver.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fragmentBuilder_BindTopUpFavouriteTargetFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment = this.write;
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
        sb.append("LoadReleasesFailure(systemCode=");
        sb.append(this.write);
        sb.append(", throwable=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6845xc069f6e7(FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th) {
        super((byte) 0);
        onGetStartedClick.write((Object) fragmentBuilder_BindMerchantWalletSelectorFragment, "systemCode");
        onGetStartedClick.write((Object) th, "throwable");
        this.write = fragmentBuilder_BindMerchantWalletSelectorFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }
}
