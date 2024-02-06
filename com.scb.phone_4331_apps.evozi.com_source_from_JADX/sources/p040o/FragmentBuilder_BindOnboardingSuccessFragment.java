package p040o;

/* renamed from: o.FragmentBuilder_BindOnboardingSuccessFragment */
public final class FragmentBuilder_BindOnboardingSuccessFragment {
    final boolean IconCompatParcelizer;
    final FragmentBuilder_BindHmlNoDepositAccountFragment MediaBrowserCompat$CustomActionResultReceiver;
    final boolean MediaBrowserCompat$ItemReceiver;
    private final Throwable MediaBrowserCompat$SearchResultReceiver;
    private final FragmentBuilder_BindMerchantWalletSelectorFragment RatingCompat;
    private final Throwable read;
    private final FragmentBuilder_BindMerchantWalletSelectorFragment write;

    public FragmentBuilder_BindOnboardingSuccessFragment() {
        this((FragmentBuilder_BindHmlNoDepositAccountFragment) null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindOnboardingSuccessFragment)) {
            return false;
        }
        FragmentBuilder_BindOnboardingSuccessFragment fragmentBuilder_BindOnboardingSuccessFragment = (FragmentBuilder_BindOnboardingSuccessFragment) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fragmentBuilder_BindOnboardingSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver) && this.IconCompatParcelizer == fragmentBuilder_BindOnboardingSuccessFragment.IconCompatParcelizer && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) fragmentBuilder_BindOnboardingSuccessFragment.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) fragmentBuilder_BindOnboardingSuccessFragment.RatingCompat) && this.MediaBrowserCompat$ItemReceiver == fragmentBuilder_BindOnboardingSuccessFragment.MediaBrowserCompat$ItemReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fragmentBuilder_BindOnboardingSuccessFragment.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) fragmentBuilder_BindOnboardingSuccessFragment.read);
    }

    public final int hashCode() {
        FragmentBuilder_BindHmlNoDepositAccountFragment fragmentBuilder_BindHmlNoDepositAccountFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = fragmentBuilder_BindHmlNoDepositAccountFragment != null ? fragmentBuilder_BindHmlNoDepositAccountFragment.hashCode() : 0;
        boolean z = this.IconCompatParcelizer;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        Throwable th = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode2 = th != null ? th.hashCode() : 0;
        FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment = this.RatingCompat;
        int hashCode3 = fragmentBuilder_BindMerchantWalletSelectorFragment != null ? fragmentBuilder_BindMerchantWalletSelectorFragment.hashCode() : 0;
        boolean z3 = this.MediaBrowserCompat$ItemReceiver;
        if (!z3) {
            z2 = z3;
        }
        FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment2 = this.write;
        int hashCode4 = fragmentBuilder_BindMerchantWalletSelectorFragment2 != null ? fragmentBuilder_BindMerchantWalletSelectorFragment2.hashCode() : 0;
        Throwable th2 = this.read;
        if (th2 != null) {
            i = th2.hashCode();
        }
        return (((((((((((hashCode * 31) + (z ? 1 : 0)) * 31) + hashCode2) * 31) + hashCode3) * 31) + (z2 ? 1 : 0)) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ConfigurationState(configuration=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", isFetchingWorkspace=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", fetchWorkspaceError=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", fetchWorkspaceSystemCode=");
        sb.append(this.RatingCompat);
        sb.append(", isCreatingTouchpoint=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", createTouchpointSystemCode=");
        sb.append(this.write);
        sb.append(", createTouchpointError=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    private FragmentBuilder_BindOnboardingSuccessFragment(FragmentBuilder_BindHmlNoDepositAccountFragment fragmentBuilder_BindHmlNoDepositAccountFragment, boolean z, Throwable th, FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, boolean z2, FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment2, Throwable th2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindHmlNoDepositAccountFragment;
        this.IconCompatParcelizer = z;
        this.MediaBrowserCompat$SearchResultReceiver = th;
        this.RatingCompat = fragmentBuilder_BindMerchantWalletSelectorFragment;
        this.MediaBrowserCompat$ItemReceiver = z2;
        this.write = fragmentBuilder_BindMerchantWalletSelectorFragment2;
        this.read = th2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FragmentBuilder_BindOnboardingSuccessFragment(FragmentBuilder_BindHmlNoDepositAccountFragment fragmentBuilder_BindHmlNoDepositAccountFragment, int i) {
        this((i & 1) != 0 ? null : fragmentBuilder_BindHmlNoDepositAccountFragment, false, (Throwable) null, (FragmentBuilder_BindMerchantWalletSelectorFragment) null, false, (FragmentBuilder_BindMerchantWalletSelectorFragment) null, (Throwable) null);
    }

    public static /* synthetic */ FragmentBuilder_BindOnboardingSuccessFragment MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindOnboardingSuccessFragment fragmentBuilder_BindOnboardingSuccessFragment, FragmentBuilder_BindHmlNoDepositAccountFragment fragmentBuilder_BindHmlNoDepositAccountFragment, boolean z, Throwable th, FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, boolean z2, FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment2, Throwable th2, int i) {
        FragmentBuilder_BindOnboardingSuccessFragment fragmentBuilder_BindOnboardingSuccessFragment2 = fragmentBuilder_BindOnboardingSuccessFragment;
        return new FragmentBuilder_BindOnboardingSuccessFragment((i & 1) != 0 ? fragmentBuilder_BindOnboardingSuccessFragment2.MediaBrowserCompat$CustomActionResultReceiver : fragmentBuilder_BindHmlNoDepositAccountFragment, (i & 2) != 0 ? fragmentBuilder_BindOnboardingSuccessFragment2.IconCompatParcelizer : z, (i & 4) != 0 ? fragmentBuilder_BindOnboardingSuccessFragment2.MediaBrowserCompat$SearchResultReceiver : th, (i & 8) != 0 ? fragmentBuilder_BindOnboardingSuccessFragment2.RatingCompat : fragmentBuilder_BindMerchantWalletSelectorFragment, (i & 16) != 0 ? fragmentBuilder_BindOnboardingSuccessFragment2.MediaBrowserCompat$ItemReceiver : z2, (i & 32) != 0 ? fragmentBuilder_BindOnboardingSuccessFragment2.write : fragmentBuilder_BindMerchantWalletSelectorFragment2, (i & 64) != 0 ? fragmentBuilder_BindOnboardingSuccessFragment2.read : th2);
    }
}
