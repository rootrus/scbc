package p040o;

import java.util.List;

/* renamed from: o.FragmentBuilder_BindTransferTargetTabFragment */
public final class FragmentBuilder_BindTransferTargetTabFragment {
    final boolean IconCompatParcelizer;
    final List<FragmentBuilder_BindTransferToMeStep1Fragment> MediaBrowserCompat$CustomActionResultReceiver;
    private final Throwable MediaBrowserCompat$ItemReceiver;
    private final FragmentBuilder_BindMerchantWalletSelectorFragment read;
    final boolean write;

    public FragmentBuilder_BindTransferTargetTabFragment() {
        this(false, (FragmentBuilder_BindMerchantWalletSelectorFragment) null, (Throwable) null, (List) null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindTransferTargetTabFragment)) {
            return false;
        }
        FragmentBuilder_BindTransferTargetTabFragment fragmentBuilder_BindTransferTargetTabFragment = (FragmentBuilder_BindTransferTargetTabFragment) obj;
        return this.write == fragmentBuilder_BindTransferTargetTabFragment.write && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) fragmentBuilder_BindTransferTargetTabFragment.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fragmentBuilder_BindTransferTargetTabFragment.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fragmentBuilder_BindTransferTargetTabFragment.MediaBrowserCompat$CustomActionResultReceiver) && this.IconCompatParcelizer == fragmentBuilder_BindTransferTargetTabFragment.IconCompatParcelizer;
    }

    public final int hashCode() {
        boolean z = this.write;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment = this.read;
        int i = 0;
        int hashCode = fragmentBuilder_BindMerchantWalletSelectorFragment != null ? fragmentBuilder_BindMerchantWalletSelectorFragment.hashCode() : 0;
        Throwable th = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = th != null ? th.hashCode() : 0;
        List<FragmentBuilder_BindTransferToMeStep1Fragment> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        boolean z3 = this.IconCompatParcelizer;
        if (!z3) {
            z2 = z3;
        }
        return ((((((((z ? 1 : 0) * true) + hashCode) * 31) + hashCode2) * 31) + i) * 31) + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PreviewState(isLoadingReleases=");
        sb.append(this.write);
        sb.append(", loadingReleasesErrorCode=");
        sb.append(this.read);
        sb.append(", loadingReleasesError=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", loadedReleases=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", isOpen=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    private FragmentBuilder_BindTransferTargetTabFragment(boolean z, FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th, List<? extends FragmentBuilder_BindTransferToMeStep1Fragment> list, boolean z2) {
        this.write = z;
        this.read = fragmentBuilder_BindMerchantWalletSelectorFragment;
        this.MediaBrowserCompat$ItemReceiver = th;
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
        this.IconCompatParcelizer = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FragmentBuilder_BindTransferTargetTabFragment(boolean z, FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th, List list, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : fragmentBuilder_BindMerchantWalletSelectorFragment, (i & 4) != 0 ? null : th, (List<? extends FragmentBuilder_BindTransferToMeStep1Fragment>) (i & 8) != 0 ? null : list, false);
    }

    public static /* synthetic */ FragmentBuilder_BindTransferTargetTabFragment MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindTransferTargetTabFragment fragmentBuilder_BindTransferTargetTabFragment, boolean z, FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th, List<FragmentBuilder_BindTransferToMeStep1Fragment> list, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = fragmentBuilder_BindTransferTargetTabFragment.write;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            fragmentBuilder_BindMerchantWalletSelectorFragment = fragmentBuilder_BindTransferTargetTabFragment.read;
        }
        FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment2 = fragmentBuilder_BindMerchantWalletSelectorFragment;
        if ((i & 4) != 0) {
            th = fragmentBuilder_BindTransferTargetTabFragment.MediaBrowserCompat$ItemReceiver;
        }
        Throwable th2 = th;
        if ((i & 8) != 0) {
            list = fragmentBuilder_BindTransferTargetTabFragment.MediaBrowserCompat$CustomActionResultReceiver;
        }
        List<FragmentBuilder_BindTransferToMeStep1Fragment> list2 = list;
        if ((i & 16) != 0) {
            z2 = fragmentBuilder_BindTransferTargetTabFragment.IconCompatParcelizer;
        }
        return new FragmentBuilder_BindTransferTargetTabFragment(z3, fragmentBuilder_BindMerchantWalletSelectorFragment2, th2, (List<? extends FragmentBuilder_BindTransferToMeStep1Fragment>) list2, z2);
    }
}
