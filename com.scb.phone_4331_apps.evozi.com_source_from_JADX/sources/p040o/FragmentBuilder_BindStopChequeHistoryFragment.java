package p040o;

/* renamed from: o.FragmentBuilder_BindStopChequeHistoryFragment */
public final class FragmentBuilder_BindStopChequeHistoryFragment {
    final Boolean IconCompatParcelizer;
    private final FragmentBuilder_BindMerchantWalletSelectorFragment MediaBrowserCompat$CustomActionResultReceiver;
    final boolean MediaBrowserCompat$ItemReceiver;
    private final FragmentBuilder_BindMerchantWalletSelectorFragment MediaBrowserCompat$SearchResultReceiver;
    private final boolean MediaDescriptionCompat;
    private final Throwable MediaMetadataCompat;
    final boolean read;
    private final Throwable write;

    public FragmentBuilder_BindStopChequeHistoryFragment() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindStopChequeHistoryFragment)) {
            return false;
        }
        FragmentBuilder_BindStopChequeHistoryFragment fragmentBuilder_BindStopChequeHistoryFragment = (FragmentBuilder_BindStopChequeHistoryFragment) obj;
        return this.read == fragmentBuilder_BindStopChequeHistoryFragment.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) fragmentBuilder_BindStopChequeHistoryFragment.IconCompatParcelizer) && this.MediaBrowserCompat$ItemReceiver == fragmentBuilder_BindStopChequeHistoryFragment.MediaBrowserCompat$ItemReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) fragmentBuilder_BindStopChequeHistoryFragment.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) fragmentBuilder_BindStopChequeHistoryFragment.MediaMetadataCompat) && this.MediaDescriptionCompat == fragmentBuilder_BindStopChequeHistoryFragment.MediaDescriptionCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fragmentBuilder_BindStopChequeHistoryFragment.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fragmentBuilder_BindStopChequeHistoryFragment.write);
    }

    public final int hashCode() {
        boolean z = this.read;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        Boolean bool = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = bool != null ? bool.hashCode() : 0;
        boolean z3 = this.MediaBrowserCompat$ItemReceiver;
        if (z3) {
            z3 = true;
        }
        FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode2 = fragmentBuilder_BindMerchantWalletSelectorFragment != null ? fragmentBuilder_BindMerchantWalletSelectorFragment.hashCode() : 0;
        Throwable th = this.MediaMetadataCompat;
        int hashCode3 = th != null ? th.hashCode() : 0;
        boolean z4 = this.MediaDescriptionCompat;
        if (!z4) {
            z2 = z4;
        }
        FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = fragmentBuilder_BindMerchantWalletSelectorFragment2 != null ? fragmentBuilder_BindMerchantWalletSelectorFragment2.hashCode() : 0;
        Throwable th2 = this.write;
        if (th2 != null) {
            i = th2.hashCode();
        }
        return ((((((((((((((z ? 1 : 0) * true) + hashCode) * 31) + (z3 ? 1 : 0)) * 31) + hashCode2) * 31) + hashCode3) * 31) + (z2 ? 1 : 0)) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OptOutState(optOut=");
        sb.append(this.read);
        sb.append(", devOptOut=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", isPersistingOptOut=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", persistOptOutErrorCode=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", persistOptOutError=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", isFetchingOptOut=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", fetchOptOutErrorCode=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", fetchOptOutError=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    private FragmentBuilder_BindStopChequeHistoryFragment(boolean z, Boolean bool, boolean z2, FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th, boolean z3, FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment2, Throwable th2) {
        this.read = z;
        this.IconCompatParcelizer = bool;
        this.MediaBrowserCompat$ItemReceiver = z2;
        this.MediaBrowserCompat$SearchResultReceiver = fragmentBuilder_BindMerchantWalletSelectorFragment;
        this.MediaMetadataCompat = th;
        this.MediaDescriptionCompat = z3;
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindMerchantWalletSelectorFragment2;
        this.write = th2;
    }

    public /* synthetic */ FragmentBuilder_BindStopChequeHistoryFragment(byte b) {
        this(false, (Boolean) null, false, (FragmentBuilder_BindMerchantWalletSelectorFragment) null, (Throwable) null, false, (FragmentBuilder_BindMerchantWalletSelectorFragment) null, (Throwable) null);
    }

    public static /* synthetic */ FragmentBuilder_BindStopChequeHistoryFragment write(FragmentBuilder_BindStopChequeHistoryFragment fragmentBuilder_BindStopChequeHistoryFragment, boolean z, Boolean bool, boolean z2, FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th, boolean z3, FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment2, Throwable th2, int i) {
        FragmentBuilder_BindStopChequeHistoryFragment fragmentBuilder_BindStopChequeHistoryFragment2 = fragmentBuilder_BindStopChequeHistoryFragment;
        int i2 = i;
        return new FragmentBuilder_BindStopChequeHistoryFragment((i2 & 1) != 0 ? fragmentBuilder_BindStopChequeHistoryFragment2.read : z, (i2 & 2) != 0 ? fragmentBuilder_BindStopChequeHistoryFragment2.IconCompatParcelizer : bool, (i2 & 4) != 0 ? fragmentBuilder_BindStopChequeHistoryFragment2.MediaBrowserCompat$ItemReceiver : z2, (i2 & 8) != 0 ? fragmentBuilder_BindStopChequeHistoryFragment2.MediaBrowserCompat$SearchResultReceiver : fragmentBuilder_BindMerchantWalletSelectorFragment, (i2 & 16) != 0 ? fragmentBuilder_BindStopChequeHistoryFragment2.MediaMetadataCompat : th, (i2 & 32) != 0 ? fragmentBuilder_BindStopChequeHistoryFragment2.MediaDescriptionCompat : z3, (i2 & 64) != 0 ? fragmentBuilder_BindStopChequeHistoryFragment2.MediaBrowserCompat$CustomActionResultReceiver : fragmentBuilder_BindMerchantWalletSelectorFragment2, (i2 & 128) != 0 ? fragmentBuilder_BindStopChequeHistoryFragment2.write : th2);
    }
}
