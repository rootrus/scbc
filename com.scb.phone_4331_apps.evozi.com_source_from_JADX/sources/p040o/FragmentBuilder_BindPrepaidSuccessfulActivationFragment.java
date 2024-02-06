package p040o;

/* renamed from: o.FragmentBuilder_BindPrepaidSuccessfulActivationFragment */
public final class FragmentBuilder_BindPrepaidSuccessfulActivationFragment {
    private final FragmentBuilder_BindMerchantWalletSelectorFragment IconCompatParcelizer;
    final boolean MediaBrowserCompat$CustomActionResultReceiver;
    private final Throwable MediaBrowserCompat$ItemReceiver;
    private final boolean read;
    final String write;

    public FragmentBuilder_BindPrepaidSuccessfulActivationFragment() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindPrepaidSuccessfulActivationFragment)) {
            return false;
        }
        FragmentBuilder_BindPrepaidSuccessfulActivationFragment fragmentBuilder_BindPrepaidSuccessfulActivationFragment = (FragmentBuilder_BindPrepaidSuccessfulActivationFragment) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fragmentBuilder_BindPrepaidSuccessfulActivationFragment.write) && this.read == fragmentBuilder_BindPrepaidSuccessfulActivationFragment.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) fragmentBuilder_BindPrepaidSuccessfulActivationFragment.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fragmentBuilder_BindPrepaidSuccessfulActivationFragment.MediaBrowserCompat$ItemReceiver) && this.MediaBrowserCompat$CustomActionResultReceiver == fragmentBuilder_BindPrepaidSuccessfulActivationFragment.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        boolean z = this.read;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment = this.IconCompatParcelizer;
        int hashCode2 = fragmentBuilder_BindMerchantWalletSelectorFragment != null ? fragmentBuilder_BindMerchantWalletSelectorFragment.hashCode() : 0;
        Throwable th = this.MediaBrowserCompat$ItemReceiver;
        if (th != null) {
            i = th.hashCode();
        }
        boolean z3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (!z3) {
            z2 = z3;
        }
        return (((((((hashCode * 31) + (z ? 1 : 0)) * 31) + hashCode2) * 31) + i) * 31) + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IdentityState(tid=");
        sb.append(this.write);
        sb.append(", isPersistingTid=");
        sb.append(this.read);
        sb.append(", persistTidErrorCode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", persistTidError=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", isLoadingTid=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    private FragmentBuilder_BindPrepaidSuccessfulActivationFragment(String str, boolean z, FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th, boolean z2) {
        this.write = str;
        this.read = z;
        this.IconCompatParcelizer = fragmentBuilder_BindMerchantWalletSelectorFragment;
        this.MediaBrowserCompat$ItemReceiver = th;
        this.MediaBrowserCompat$CustomActionResultReceiver = z2;
    }

    public /* synthetic */ FragmentBuilder_BindPrepaidSuccessfulActivationFragment(byte b) {
        this((String) null, false, (FragmentBuilder_BindMerchantWalletSelectorFragment) null, (Throwable) null, true);
    }

    public static /* synthetic */ FragmentBuilder_BindPrepaidSuccessfulActivationFragment IconCompatParcelizer(FragmentBuilder_BindPrepaidSuccessfulActivationFragment fragmentBuilder_BindPrepaidSuccessfulActivationFragment, String str, boolean z, FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th, boolean z2, int i) {
        if ((i & 1) != 0) {
            str = fragmentBuilder_BindPrepaidSuccessfulActivationFragment.write;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            z = fragmentBuilder_BindPrepaidSuccessfulActivationFragment.read;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            fragmentBuilder_BindMerchantWalletSelectorFragment = fragmentBuilder_BindPrepaidSuccessfulActivationFragment.IconCompatParcelizer;
        }
        FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment2 = fragmentBuilder_BindMerchantWalletSelectorFragment;
        if ((i & 8) != 0) {
            th = fragmentBuilder_BindPrepaidSuccessfulActivationFragment.MediaBrowserCompat$ItemReceiver;
        }
        Throwable th2 = th;
        if ((i & 16) != 0) {
            z2 = fragmentBuilder_BindPrepaidSuccessfulActivationFragment.MediaBrowserCompat$CustomActionResultReceiver;
        }
        return new FragmentBuilder_BindPrepaidSuccessfulActivationFragment(str2, z3, fragmentBuilder_BindMerchantWalletSelectorFragment2, th2, z2);
    }
}
