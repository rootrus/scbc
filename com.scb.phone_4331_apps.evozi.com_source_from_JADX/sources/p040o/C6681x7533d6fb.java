package p040o;

/* renamed from: o.FragmentBuilder_BindPromptPayQRSuccessFragment$MediaBrowserCompat$ItemReceiver */
public final class C6681x7533d6fb extends FragmentBuilder_BindPromptPayQRSuccessFragment {
    private final FragmentBuilder_BindMerchantWalletSelectorFragment IconCompatParcelizer;
    private final Throwable MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6681x7533d6fb)) {
            return false;
        }
        C6681x7533d6fb fragmentBuilder_BindPromptPayQRSuccessFragment$MediaBrowserCompat$ItemReceiver = (C6681x7533d6fb) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) fragmentBuilder_BindPromptPayQRSuccessFragment$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fragmentBuilder_BindPromptPayQRSuccessFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver);
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
        sb.append("LoadInteractionContextFailure(systemCode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", throwable=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6681x7533d6fb(FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th) {
        super((byte) 0);
        onGetStartedClick.write((Object) fragmentBuilder_BindMerchantWalletSelectorFragment, "systemCode");
        this.IconCompatParcelizer = fragmentBuilder_BindMerchantWalletSelectorFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }
}
