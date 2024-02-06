package p040o;

/* renamed from: o.FragmentBuilder_BindPurchaseCcSofInputFragment */
public final class FragmentBuilder_BindPurchaseCcSofInputFragment {
    private final FragmentBuilder_BindMerchantWalletSelectorFragment IconCompatParcelizer;
    private final Throwable MediaBrowserCompat$ItemReceiver;
    final FragmentBuilder_BindHmlOutcomeResubmissionFragment read;

    public FragmentBuilder_BindPurchaseCcSofInputFragment() {
        this((FragmentBuilder_BindHmlOutcomeResubmissionFragment) null, (Throwable) null, (FragmentBuilder_BindMerchantWalletSelectorFragment) null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindPurchaseCcSofInputFragment)) {
            return false;
        }
        FragmentBuilder_BindPurchaseCcSofInputFragment fragmentBuilder_BindPurchaseCcSofInputFragment = (FragmentBuilder_BindPurchaseCcSofInputFragment) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) fragmentBuilder_BindPurchaseCcSofInputFragment.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fragmentBuilder_BindPurchaseCcSofInputFragment.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) fragmentBuilder_BindPurchaseCcSofInputFragment.IconCompatParcelizer);
    }

    public final int hashCode() {
        FragmentBuilder_BindHmlOutcomeResubmissionFragment fragmentBuilder_BindHmlOutcomeResubmissionFragment = this.read;
        int i = 0;
        int hashCode = fragmentBuilder_BindHmlOutcomeResubmissionFragment != null ? fragmentBuilder_BindHmlOutcomeResubmissionFragment.hashCode() : 0;
        Throwable th = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = th != null ? th.hashCode() : 0;
        FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment = this.IconCompatParcelizer;
        if (fragmentBuilder_BindMerchantWalletSelectorFragment != null) {
            i = fragmentBuilder_BindMerchantWalletSelectorFragment.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceInformationState(deviceInformation=");
        sb.append(this.read);
        sb.append(", error=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", errorCode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    private FragmentBuilder_BindPurchaseCcSofInputFragment(FragmentBuilder_BindHmlOutcomeResubmissionFragment fragmentBuilder_BindHmlOutcomeResubmissionFragment, Throwable th, FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment) {
        this.read = fragmentBuilder_BindHmlOutcomeResubmissionFragment;
        this.MediaBrowserCompat$ItemReceiver = th;
        this.IconCompatParcelizer = fragmentBuilder_BindMerchantWalletSelectorFragment;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FragmentBuilder_BindPurchaseCcSofInputFragment(FragmentBuilder_BindHmlOutcomeResubmissionFragment fragmentBuilder_BindHmlOutcomeResubmissionFragment, Throwable th, FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, int i) {
        this((i & 1) != 0 ? null : fragmentBuilder_BindHmlOutcomeResubmissionFragment, (i & 2) != 0 ? null : th, (i & 4) != 0 ? null : fragmentBuilder_BindMerchantWalletSelectorFragment);
    }

    public static /* synthetic */ FragmentBuilder_BindPurchaseCcSofInputFragment MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindPurchaseCcSofInputFragment fragmentBuilder_BindPurchaseCcSofInputFragment, FragmentBuilder_BindHmlOutcomeResubmissionFragment fragmentBuilder_BindHmlOutcomeResubmissionFragment, Throwable th, FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, int i) {
        if ((i & 1) != 0) {
            fragmentBuilder_BindHmlOutcomeResubmissionFragment = fragmentBuilder_BindPurchaseCcSofInputFragment.read;
        }
        if ((i & 2) != 0) {
            th = fragmentBuilder_BindPurchaseCcSofInputFragment.MediaBrowserCompat$ItemReceiver;
        }
        if ((i & 4) != 0) {
            fragmentBuilder_BindMerchantWalletSelectorFragment = fragmentBuilder_BindPurchaseCcSofInputFragment.IconCompatParcelizer;
        }
        return new FragmentBuilder_BindPurchaseCcSofInputFragment(fragmentBuilder_BindHmlOutcomeResubmissionFragment, th, fragmentBuilder_BindMerchantWalletSelectorFragment);
    }
}
