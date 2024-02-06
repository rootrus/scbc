package p040o;

import java.util.List;

/* renamed from: o.version */
public final class C5449version {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public Double MediaBrowserCompat$ItemReceiver;
    public Double MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public Double f2975x50fd9e4a;
    public Double MediaDescriptionCompat;
    public Double MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$Token;
    public Double ParcelableVolumeInfo;
    public Double RatingCompat;
    public List<onStartJob> read;
    public String write;

    public C5449version() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5449version)) {
            return false;
        }
        C5449version version = (C5449version) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) version.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) version.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) version.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) version.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2975x50fd9e4a, (Object) version.f2975x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) version.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) version.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) version.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) version.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) version.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) version.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) version.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) version.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) version.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$SearchResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        Double d = this.f2975x50fd9e4a;
        int hashCode5 = d != null ? d.hashCode() : 0;
        Double d2 = this.MediaMetadataCompat;
        int hashCode6 = d2 != null ? d2.hashCode() : 0;
        Double d3 = this.ParcelableVolumeInfo;
        int hashCode7 = d3 != null ? d3.hashCode() : 0;
        Double d4 = this.MediaBrowserCompat$MediaItem;
        int hashCode8 = d4 != null ? d4.hashCode() : 0;
        Double d5 = this.MediaDescriptionCompat;
        int hashCode9 = d5 != null ? d5.hashCode() : 0;
        Double d6 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode10 = d6 != null ? d6.hashCode() : 0;
        Double d7 = this.RatingCompat;
        int hashCode11 = d7 != null ? d7.hashCode() : 0;
        String str5 = this.MediaSessionCompat$Token;
        int hashCode12 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaSessionCompat$QueueItem;
        int hashCode13 = str6 != null ? str6.hashCode() : 0;
        List<onStartJob> list = this.read;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeejungInstallmentsConfirmationResponse(term=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", rate=");
        sb.append(this.write);
        sb.append(", loanId=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", refId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", totalRequestedPurchase=");
        sb.append(this.f2975x50fd9e4a);
        sb.append(", totalApprovedPayment=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", totalPurchase=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", totalPrincipal=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", totalPayment=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", monthlyPayment=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", totalInterest=");
        sb.append(this.RatingCompat);
        sb.append(", transactionDate=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", verifiedEmail=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", installments=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    private C5449version(String str, String str2, String str3, String str4, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, String str5, String str6, List<onStartJob> list) {
        this.MediaBrowserCompat$SearchResultReceiver = null;
        this.write = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        this.IconCompatParcelizer = null;
        this.f2975x50fd9e4a = null;
        this.MediaMetadataCompat = null;
        this.ParcelableVolumeInfo = null;
        this.MediaBrowserCompat$MediaItem = null;
        this.MediaDescriptionCompat = null;
        this.MediaBrowserCompat$ItemReceiver = null;
        this.RatingCompat = null;
        this.MediaSessionCompat$Token = null;
        this.MediaSessionCompat$QueueItem = null;
        this.read = null;
    }

    public /* synthetic */ C5449version(byte b) {
        this((String) null, (String) null, (String) null, (String) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (String) null, (String) null, (List<onStartJob>) null);
    }
}
