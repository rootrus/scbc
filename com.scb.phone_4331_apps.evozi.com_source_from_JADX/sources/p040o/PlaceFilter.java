package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.PlaceFilter */
public final class PlaceFilter {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final boolean MediaBrowserCompat$ItemReceiver;
    public final boolean read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceFilter)) {
            return false;
        }
        PlaceFilter placeFilter = (PlaceFilter) obj;
        return this.read == placeFilter.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) placeFilter.MediaBrowserCompat$CustomActionResultReceiver) && this.MediaBrowserCompat$ItemReceiver == placeFilter.MediaBrowserCompat$ItemReceiver;
    }

    public final int hashCode() {
        boolean z = this.read;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode = str != null ? str.hashCode() : 0;
        boolean z3 = this.MediaBrowserCompat$ItemReceiver;
        if (!z3) {
            z2 = z3;
        }
        return ((((z ? 1 : 0) * true) + hashCode) * 31) + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JustForYouInsightHeaderResponse(newInsightFlag=");
        sb.append(this.read);
        sb.append(", insightHeader=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", isCaching=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public PlaceFilter(boolean z, String str, boolean z2) {
        this.read = z;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = z2;
    }

    /* renamed from: o.PlaceFilter$zzb */
    public class zzb extends zzuk {
        @SerializedName("paynowInboundToggle")
        public boolean AlertController$RecycleListView;
        @SerializedName("yourLoanOnboarding")
        public boolean AppCompatActivity;
        @SerializedName("scbConnectBankingServices")
        boolean AppCompatDelegateImpl$ListMenuDecorView;
        @SerializedName("scbConnectSettings")
        public boolean AppCompatDialogFragment;
        @SerializedName("purchaseBondScbFunction")
        public boolean Keep;
        @SerializedName("gifting")
        public boolean MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("applyAnotherLoan")
        public boolean MediaBrowserCompat$ItemReceiver;
        @SerializedName("justForYouInsight")
        public boolean MediaBrowserCompat$MediaItem;
        @SerializedName("justForYouEntryPoint")
        public boolean MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("justForYouYourAccount")

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public boolean f2770x50fd9e4a;
        @SerializedName("insurancePortfolio")
        public boolean MediaDescriptionCompat;
        @SerializedName("justForYouInsightHeader")
        public boolean MediaMetadataCompat;
        @SerializedName("justForYouMonthlySpending")
        public boolean MediaSessionCompat$QueueItem;
        @SerializedName("justForYouYourRewards")
        public boolean MediaSessionCompat$ResultReceiverWrapper;
        @SerializedName("maemaneeKymFunction")
        public boolean MediaSessionCompat$Token;
        @SerializedName("maemaneeGmbFunction")
        public boolean ParcelableVolumeInfo;
        @SerializedName("mailingAddress")
        public boolean PlaybackStateCompat;
        @SerializedName("rtpBillPaymentSubscription")
        public boolean PlaybackStateCompat$CustomAction;
        @SerializedName("giftingMoneyTransfer")
        public boolean RatingCompat;
        @SerializedName("friendsGetFriends")
        public boolean read;
        @SerializedName("sensitiveConsent")
        public boolean setBackgroundResource;
        @SerializedName("purchaseBondDltFunction")
        public boolean setHasDecor;
        @SerializedName("debentureInvestmentFunction")
        public boolean write;

        public /* synthetic */ zzb() {
        }

        public zzb(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23) {
            this.MediaBrowserCompat$CustomActionResultReceiver = z;
            this.PlaybackStateCompat$CustomAction = z2;
            this.AppCompatActivity = z3;
            this.MediaBrowserCompat$ItemReceiver = z4;
            this.AppCompatDelegateImpl$ListMenuDecorView = z5;
            this.AppCompatDialogFragment = z6;
            this.read = z7;
            this.MediaBrowserCompat$SearchResultReceiver = z8;
            this.MediaSessionCompat$QueueItem = z9;
            this.MediaBrowserCompat$MediaItem = z10;
            this.f2770x50fd9e4a = z11;
            this.MediaSessionCompat$ResultReceiverWrapper = z12;
            this.MediaMetadataCompat = z13;
            this.write = z14;
            this.ParcelableVolumeInfo = z15;
            this.PlaybackStateCompat = z17;
            this.setBackgroundResource = z18;
            this.MediaSessionCompat$Token = z16;
            this.Keep = z19;
            this.setHasDecor = z20;
            this.MediaDescriptionCompat = z21;
            this.RatingCompat = z22;
            this.AlertController$RecycleListView = z23;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            zzb zzb = (zzb) obj;
            if (this.MediaBrowserCompat$CustomActionResultReceiver != zzb.MediaBrowserCompat$CustomActionResultReceiver || this.PlaybackStateCompat$CustomAction != zzb.PlaybackStateCompat$CustomAction || this.AppCompatActivity != zzb.AppCompatActivity || this.AppCompatDelegateImpl$ListMenuDecorView != zzb.AppCompatDelegateImpl$ListMenuDecorView || this.AppCompatDialogFragment != zzb.AppCompatDialogFragment || this.read != zzb.read || this.MediaBrowserCompat$SearchResultReceiver != zzb.MediaBrowserCompat$SearchResultReceiver || this.MediaSessionCompat$QueueItem != zzb.MediaSessionCompat$QueueItem || this.MediaBrowserCompat$MediaItem != zzb.MediaBrowserCompat$MediaItem || this.f2770x50fd9e4a != zzb.f2770x50fd9e4a || this.MediaSessionCompat$ResultReceiverWrapper != zzb.MediaSessionCompat$ResultReceiverWrapper || this.MediaMetadataCompat != zzb.MediaMetadataCompat || this.write != zzb.write || this.ParcelableVolumeInfo != zzb.ParcelableVolumeInfo || this.PlaybackStateCompat != zzb.PlaybackStateCompat || this.setBackgroundResource != zzb.setBackgroundResource || this.Keep != zzb.Keep || this.setHasDecor != zzb.setHasDecor || this.MediaDescriptionCompat != zzb.MediaDescriptionCompat || this.RatingCompat != zzb.RatingCompat || this.AlertController$RecycleListView != zzb.AlertController$RecycleListView) {
                return false;
            }
            if (this.MediaBrowserCompat$ItemReceiver != zzb.MediaBrowserCompat$ItemReceiver) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((((((((((((((((((((((((((((((((((((((((((this.MediaBrowserCompat$CustomActionResultReceiver ? 1 : 0) * true) + (this.PlaybackStateCompat$CustomAction ? 1 : 0)) * 31) + (this.AppCompatActivity ? 1 : 0)) * 31) + (this.MediaBrowserCompat$ItemReceiver ? 1 : 0)) * 31) + (this.AppCompatDelegateImpl$ListMenuDecorView ? 1 : 0)) * 31) + (this.AppCompatDialogFragment ? 1 : 0)) * 31) + (this.read ? 1 : 0)) * 31) + (this.MediaBrowserCompat$SearchResultReceiver ? 1 : 0)) * 31) + (this.MediaSessionCompat$QueueItem ? 1 : 0)) * 31) + (this.MediaBrowserCompat$MediaItem ? 1 : 0)) * 31) + (this.f2770x50fd9e4a ? 1 : 0)) * 31) + (this.MediaSessionCompat$ResultReceiverWrapper ? 1 : 0)) * 31) + (this.MediaMetadataCompat ? 1 : 0)) * 31) + (this.write ? 1 : 0)) * 31) + (this.ParcelableVolumeInfo ? 1 : 0)) * 31) + (this.PlaybackStateCompat ? 1 : 0)) * 31) + (this.setBackgroundResource ? 1 : 0)) * 31) + (this.Keep ? 1 : 0)) * 31) + (this.setHasDecor ? 1 : 0)) * 31) + (this.MediaDescriptionCompat ? 1 : 0)) * 31) + (this.RatingCompat ? 1 : 0)) * 31) + (this.AlertController$RecycleListView ? 1 : 0);
        }
    }
}
