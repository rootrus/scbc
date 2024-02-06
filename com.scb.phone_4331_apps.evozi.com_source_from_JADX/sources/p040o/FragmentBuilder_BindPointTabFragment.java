package p040o;

/* renamed from: o.FragmentBuilder_BindPointTabFragment */
public final class FragmentBuilder_BindPointTabFragment {
    private final Throwable IconCompatParcelizer;
    final boolean MediaBrowserCompat$CustomActionResultReceiver;
    final boolean MediaBrowserCompat$ItemReceiver;
    final boolean read;
    private final FragmentBuilder_BindMerchantWalletSelectorFragment write;

    public FragmentBuilder_BindPointTabFragment() {
        this(false, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindPointTabFragment)) {
            return false;
        }
        FragmentBuilder_BindPointTabFragment fragmentBuilder_BindPointTabFragment = (FragmentBuilder_BindPointTabFragment) obj;
        return this.MediaBrowserCompat$ItemReceiver == fragmentBuilder_BindPointTabFragment.MediaBrowserCompat$ItemReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fragmentBuilder_BindPointTabFragment.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) fragmentBuilder_BindPointTabFragment.IconCompatParcelizer) && this.read == fragmentBuilder_BindPointTabFragment.read && this.MediaBrowserCompat$CustomActionResultReceiver == fragmentBuilder_BindPointTabFragment.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final int hashCode() {
        boolean z = this.MediaBrowserCompat$ItemReceiver;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment = this.write;
        int i = 0;
        int hashCode = fragmentBuilder_BindMerchantWalletSelectorFragment != null ? fragmentBuilder_BindMerchantWalletSelectorFragment.hashCode() : 0;
        Throwable th = this.IconCompatParcelizer;
        if (th != null) {
            i = th.hashCode();
        }
        boolean z3 = this.read;
        if (z3) {
            z3 = true;
        }
        boolean z4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (!z4) {
            z2 = z4;
        }
        return ((((((((z ? 1 : 0) * true) + hashCode) * 31) + i) * 31) + (z3 ? 1 : 0)) * 31) + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdminModeState(adminViewsCreated=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", adminViewsCreatedSystemCode=");
        sb.append(this.write);
        sb.append(", adminViewsCreatedThrowable=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", isUpdatingAdminViews=");
        sb.append(this.read);
        sb.append(", isAdminErrorDialogOpen=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    private FragmentBuilder_BindPointTabFragment(boolean z, FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th, boolean z2, boolean z3) {
        this.MediaBrowserCompat$ItemReceiver = z;
        this.write = fragmentBuilder_BindMerchantWalletSelectorFragment;
        this.IconCompatParcelizer = th;
        this.read = z2;
        this.MediaBrowserCompat$CustomActionResultReceiver = z3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FragmentBuilder_BindPointTabFragment(boolean z, int i) {
        this(false, (FragmentBuilder_BindMerchantWalletSelectorFragment) null, (Throwable) null, (i & 8) != 0 ? false : z, false);
    }

    public static /* synthetic */ FragmentBuilder_BindPointTabFragment MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindPointTabFragment fragmentBuilder_BindPointTabFragment, boolean z, FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = fragmentBuilder_BindPointTabFragment.MediaBrowserCompat$ItemReceiver;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            fragmentBuilder_BindMerchantWalletSelectorFragment = fragmentBuilder_BindPointTabFragment.write;
        }
        FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment2 = fragmentBuilder_BindMerchantWalletSelectorFragment;
        if ((i & 4) != 0) {
            th = fragmentBuilder_BindPointTabFragment.IconCompatParcelizer;
        }
        Throwable th2 = th;
        if ((i & 8) != 0) {
            z2 = fragmentBuilder_BindPointTabFragment.read;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = fragmentBuilder_BindPointTabFragment.MediaBrowserCompat$CustomActionResultReceiver;
        }
        return new FragmentBuilder_BindPointTabFragment(z4, fragmentBuilder_BindMerchantWalletSelectorFragment2, th2, z5, z3);
    }
}
