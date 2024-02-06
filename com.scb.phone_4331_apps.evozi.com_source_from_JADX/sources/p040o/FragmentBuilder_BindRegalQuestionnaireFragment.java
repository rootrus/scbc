package p040o;

import java.util.List;

/* renamed from: o.FragmentBuilder_BindRegalQuestionnaireFragment */
public final class FragmentBuilder_BindRegalQuestionnaireFragment {
    final boolean IconCompatParcelizer;
    final FragmentBuilder_BindRegistrationLandingFragment MediaBrowserCompat$CustomActionResultReceiver;
    final List<FragmentBuilder_BindHmlOutcomeRejectFragment> MediaBrowserCompat$ItemReceiver;
    private final Throwable MediaBrowserCompat$MediaItem;
    private final Throwable MediaBrowserCompat$SearchResultReceiver;
    private final FragmentBuilder_BindMerchantWalletSelectorFragment MediaDescriptionCompat;
    private final FragmentBuilder_BindMerchantWalletSelectorFragment MediaMetadataCompat;
    private final FragmentBuilder_BindMerchantWalletSelectorFragment MediaSessionCompat$QueueItem;
    private final Throwable MediaSessionCompat$ResultReceiverWrapper;
    private final boolean RatingCompat;
    final boolean read;
    final boolean write;

    public FragmentBuilder_BindRegalQuestionnaireFragment() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindRegalQuestionnaireFragment)) {
            return false;
        }
        FragmentBuilder_BindRegalQuestionnaireFragment fragmentBuilder_BindRegalQuestionnaireFragment = (FragmentBuilder_BindRegalQuestionnaireFragment) obj;
        return this.write == fragmentBuilder_BindRegalQuestionnaireFragment.write && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) fragmentBuilder_BindRegalQuestionnaireFragment.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) fragmentBuilder_BindRegalQuestionnaireFragment.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fragmentBuilder_BindRegalQuestionnaireFragment.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fragmentBuilder_BindRegalQuestionnaireFragment.MediaBrowserCompat$CustomActionResultReceiver) && this.read == fragmentBuilder_BindRegalQuestionnaireFragment.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) fragmentBuilder_BindRegalQuestionnaireFragment.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) fragmentBuilder_BindRegalQuestionnaireFragment.MediaMetadataCompat) && this.RatingCompat == fragmentBuilder_BindRegalQuestionnaireFragment.RatingCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) fragmentBuilder_BindRegalQuestionnaireFragment.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) fragmentBuilder_BindRegalQuestionnaireFragment.MediaSessionCompat$QueueItem) && this.IconCompatParcelizer == fragmentBuilder_BindRegalQuestionnaireFragment.IconCompatParcelizer;
    }

    public final int hashCode() {
        boolean z = this.write;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        Throwable th = this.MediaBrowserCompat$SearchResultReceiver;
        int i = 0;
        int hashCode = th != null ? th.hashCode() : 0;
        FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment = this.MediaDescriptionCompat;
        int hashCode2 = fragmentBuilder_BindMerchantWalletSelectorFragment != null ? fragmentBuilder_BindMerchantWalletSelectorFragment.hashCode() : 0;
        List<FragmentBuilder_BindHmlOutcomeRejectFragment> list = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = list != null ? list.hashCode() : 0;
        FragmentBuilder_BindRegistrationLandingFragment fragmentBuilder_BindRegistrationLandingFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = fragmentBuilder_BindRegistrationLandingFragment != null ? fragmentBuilder_BindRegistrationLandingFragment.hashCode() : 0;
        boolean z3 = this.read;
        if (z3) {
            z3 = true;
        }
        Throwable th2 = this.MediaBrowserCompat$MediaItem;
        int hashCode5 = th2 != null ? th2.hashCode() : 0;
        FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment2 = this.MediaMetadataCompat;
        int hashCode6 = fragmentBuilder_BindMerchantWalletSelectorFragment2 != null ? fragmentBuilder_BindMerchantWalletSelectorFragment2.hashCode() : 0;
        boolean z4 = this.RatingCompat;
        if (z4) {
            z4 = true;
        }
        Throwable th3 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode7 = th3 != null ? th3.hashCode() : 0;
        FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment3 = this.MediaSessionCompat$QueueItem;
        if (fragmentBuilder_BindMerchantWalletSelectorFragment3 != null) {
            i = fragmentBuilder_BindMerchantWalletSelectorFragment3.hashCode();
        }
        boolean z5 = this.IconCompatParcelizer;
        if (!z5) {
            z2 = z5;
        }
        return ((((((((((((((((((((((z ? 1 : 0) * true) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (z3 ? 1 : 0)) * 31) + hashCode5) * 31) + hashCode6) * 31) + (z4 ? 1 : 0)) * 31) + hashCode7) * 31) + i) * 31) + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AllowedInteractionsState(isFetching=");
        sb.append(this.write);
        sb.append(", fetchFailure=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", fetchFailureCode=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", allowedInteractions=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", eTag=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", isLoading=");
        sb.append(this.read);
        sb.append(", loadFailure=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", loadFailureCode=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", isPersisting=");
        sb.append(this.RatingCompat);
        sb.append(", persistingFailure=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(", persistingFailureCode=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", hasLoadedOnce=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    private FragmentBuilder_BindRegalQuestionnaireFragment(boolean z, Throwable th, FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, List<FragmentBuilder_BindHmlOutcomeRejectFragment> list, FragmentBuilder_BindRegistrationLandingFragment fragmentBuilder_BindRegistrationLandingFragment, boolean z2, Throwable th2, FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment2, boolean z3, Throwable th3, FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment3, boolean z4) {
        this.write = z;
        this.MediaBrowserCompat$SearchResultReceiver = th;
        this.MediaDescriptionCompat = fragmentBuilder_BindMerchantWalletSelectorFragment;
        this.MediaBrowserCompat$ItemReceiver = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindRegistrationLandingFragment;
        this.read = z2;
        this.MediaBrowserCompat$MediaItem = th2;
        this.MediaMetadataCompat = fragmentBuilder_BindMerchantWalletSelectorFragment2;
        this.RatingCompat = z3;
        this.MediaSessionCompat$ResultReceiverWrapper = th3;
        this.MediaSessionCompat$QueueItem = fragmentBuilder_BindMerchantWalletSelectorFragment3;
        this.IconCompatParcelizer = z4;
    }

    public /* synthetic */ FragmentBuilder_BindRegalQuestionnaireFragment(byte b) {
        this(false, (Throwable) null, (FragmentBuilder_BindMerchantWalletSelectorFragment) null, (List<FragmentBuilder_BindHmlOutcomeRejectFragment>) null, (FragmentBuilder_BindRegistrationLandingFragment) null, false, (Throwable) null, (FragmentBuilder_BindMerchantWalletSelectorFragment) null, false, (Throwable) null, (FragmentBuilder_BindMerchantWalletSelectorFragment) null, false);
    }

    public static /* synthetic */ FragmentBuilder_BindRegalQuestionnaireFragment MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindRegalQuestionnaireFragment fragmentBuilder_BindRegalQuestionnaireFragment, boolean z, Throwable th, FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, List list, FragmentBuilder_BindRegistrationLandingFragment fragmentBuilder_BindRegistrationLandingFragment, boolean z2, Throwable th2, FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment2, boolean z3, Throwable th3, FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment3, boolean z4, int i) {
        FragmentBuilder_BindRegalQuestionnaireFragment fragmentBuilder_BindRegalQuestionnaireFragment2 = fragmentBuilder_BindRegalQuestionnaireFragment;
        int i2 = i;
        return new FragmentBuilder_BindRegalQuestionnaireFragment((i2 & 1) != 0 ? fragmentBuilder_BindRegalQuestionnaireFragment2.write : z, (i2 & 2) != 0 ? fragmentBuilder_BindRegalQuestionnaireFragment2.MediaBrowserCompat$SearchResultReceiver : th, (i2 & 4) != 0 ? fragmentBuilder_BindRegalQuestionnaireFragment2.MediaDescriptionCompat : fragmentBuilder_BindMerchantWalletSelectorFragment, (i2 & 8) != 0 ? fragmentBuilder_BindRegalQuestionnaireFragment2.MediaBrowserCompat$ItemReceiver : list, (i2 & 16) != 0 ? fragmentBuilder_BindRegalQuestionnaireFragment2.MediaBrowserCompat$CustomActionResultReceiver : fragmentBuilder_BindRegistrationLandingFragment, (i2 & 32) != 0 ? fragmentBuilder_BindRegalQuestionnaireFragment2.read : z2, (i2 & 64) != 0 ? fragmentBuilder_BindRegalQuestionnaireFragment2.MediaBrowserCompat$MediaItem : th2, (i2 & 128) != 0 ? fragmentBuilder_BindRegalQuestionnaireFragment2.MediaMetadataCompat : fragmentBuilder_BindMerchantWalletSelectorFragment2, (i2 & 256) != 0 ? fragmentBuilder_BindRegalQuestionnaireFragment2.RatingCompat : z3, (i2 & 512) != 0 ? fragmentBuilder_BindRegalQuestionnaireFragment2.MediaSessionCompat$ResultReceiverWrapper : th3, (i2 & 1024) != 0 ? fragmentBuilder_BindRegalQuestionnaireFragment2.MediaSessionCompat$QueueItem : fragmentBuilder_BindMerchantWalletSelectorFragment3, (i2 & 2048) != 0 ? fragmentBuilder_BindRegalQuestionnaireFragment2.IconCompatParcelizer : z4);
    }
}
