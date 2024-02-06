package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.CampaignTrackingService */
public final class CampaignTrackingService {
    @SerializedName("billerLogo")
    public final String IconCompatParcelizer;
    @SerializedName("accountFrom")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("billerAccountNumber")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("billerName")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("ref2Label")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("ref1Label")
    public final String MediaDescriptionCompat;
    @SerializedName("serviceNumber")
    public final String MediaMetadataCompat;
    @SerializedName("billerType")
    public final String RatingCompat;
    @SerializedName("billerId")
    public final String read;
    @SerializedName("amount")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CampaignTrackingService)) {
            return false;
        }
        CampaignTrackingService campaignTrackingService = (CampaignTrackingService) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) campaignTrackingService.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) campaignTrackingService.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) campaignTrackingService.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) campaignTrackingService.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) campaignTrackingService.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) campaignTrackingService.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) campaignTrackingService.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) campaignTrackingService.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) campaignTrackingService.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) campaignTrackingService.MediaBrowserCompat$SearchResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaMetadataCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$MediaItem;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.read;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.RatingCompat;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaDescriptionCompat;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str10 != null) {
            i = str10.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TopUpRepeatEntity(accountFrom=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", serviceNumber=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", amount=");
        sb.append(this.write);
        sb.append(", billerLogo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", billerName=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", billerAccountNumber=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", billerId=");
        sb.append(this.read);
        sb.append(", billerType=");
        sb.append(this.RatingCompat);
        sb.append(", ref1Label=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", ref2Label=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
