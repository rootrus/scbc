package p040o;

/* renamed from: o.FragmentBuilder_BindRemittanceInputFragment$MediaBrowserCompat$ItemReceiver */
public final class C6728x11d23707 extends FragmentBuilder_BindRemittanceInputFragment {
    private final FragmentBuilder_BindMerchantWalletSelectorFragment MediaBrowserCompat$CustomActionResultReceiver;
    private final Throwable MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6728x11d23707)) {
            return false;
        }
        C6728x11d23707 fragmentBuilder_BindRemittanceInputFragment$MediaBrowserCompat$ItemReceiver = (C6728x11d23707) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fragmentBuilder_BindRemittanceInputFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fragmentBuilder_BindRemittanceInputFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
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
        sb.append("SendAppInstallFailure(systemCode=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", error=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public C6728x11d23707(FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th) {
        super((byte) 0);
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindMerchantWalletSelectorFragment;
        this.MediaBrowserCompat$ItemReceiver = th;
    }
}
