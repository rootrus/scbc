package p040o;

import java.util.Objects;

/* renamed from: o.FragmentBuilder_BindReviewRedemptionFragment */
public final class FragmentBuilder_BindReviewRedemptionFragment {
    public final FragmentBuilder_BindRiskSelectionFragment IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final Long RatingCompat;
    public final String read;
    final long write;

    private FragmentBuilder_BindReviewRedemptionFragment(long j, String str, FragmentBuilder_BindRiskSelectionFragment fragmentBuilder_BindRiskSelectionFragment, String str2, String str3, String str4, Long l) {
        this.write = j;
        this.read = str;
        this.IconCompatParcelizer = fragmentBuilder_BindRiskSelectionFragment;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.MediaBrowserCompat$SearchResultReceiver = str4;
        this.RatingCompat = l;
    }

    public /* synthetic */ FragmentBuilder_BindReviewRedemptionFragment(long j, String str, FragmentBuilder_BindRiskSelectionFragment fragmentBuilder_BindRiskSelectionFragment, String str2, String str3, String str4, Long l, byte b) {
        this(j, str, fragmentBuilder_BindRiskSelectionFragment, str2, str3, str4, l);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FragmentBuilder_BindReviewRedemptionFragment) {
            FragmentBuilder_BindReviewRedemptionFragment fragmentBuilder_BindReviewRedemptionFragment = (FragmentBuilder_BindReviewRedemptionFragment) obj;
            return this.write == fragmentBuilder_BindReviewRedemptionFragment.write && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) fragmentBuilder_BindReviewRedemptionFragment.read) && this.IconCompatParcelizer == fragmentBuilder_BindReviewRedemptionFragment.IconCompatParcelizer && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fragmentBuilder_BindReviewRedemptionFragment.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fragmentBuilder_BindReviewRedemptionFragment.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) fragmentBuilder_BindReviewRedemptionFragment.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) fragmentBuilder_BindReviewRedemptionFragment.RatingCompat);
        }
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.read, this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$SearchResultReceiver, this.RatingCompat});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n            OfflineDBRequest(\n                id='");
        sb.append(this.write);
        sb.append("',\n                request='");
        sb.append(this.read);
        sb.append("',\n                requestType='");
        sb.append(this.IconCompatParcelizer);
        sb.append("',\n                siteKey='");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append("',\n                host='");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append("',\n                touchpoint='");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append("',\n                timestamp='");
        sb.append(this.RatingCompat);
        sb.append("'\n            )\n        ");
        return GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(sb.toString());
    }
}
