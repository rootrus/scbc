package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.CampaignTrackingReceiver */
public final class CampaignTrackingReceiver {
    @SerializedName("amount")
    public final String IconCompatParcelizer;
    @SerializedName("repeatFlag")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("biller")
    public final zzc MediaBrowserCompat$ItemReceiver;
    @SerializedName("tranDateTime")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("serviceNumber")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("sortSequence")
    public final int MediaDescriptionCompat;
    @SerializedName("transferType")
    public final String RatingCompat;
    @SerializedName("paymentId")
    public final String read;
    @SerializedName("regenerateFlag")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CampaignTrackingReceiver)) {
            return false;
        }
        CampaignTrackingReceiver campaignTrackingReceiver = (CampaignTrackingReceiver) obj;
        return this.MediaDescriptionCompat == campaignTrackingReceiver.MediaDescriptionCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) campaignTrackingReceiver.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) campaignTrackingReceiver.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) campaignTrackingReceiver.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) campaignTrackingReceiver.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) campaignTrackingReceiver.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) campaignTrackingReceiver.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) campaignTrackingReceiver.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) campaignTrackingReceiver.RatingCompat);
    }

    public final int hashCode() {
        int i = this.MediaDescriptionCompat;
        String str = this.read;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$MediaItem;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.write;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        zzc zzc = this.MediaBrowserCompat$ItemReceiver;
        int hashCode7 = zzc != null ? zzc.hashCode() : 0;
        String str7 = this.RatingCompat;
        if (str7 != null) {
            i2 = str7.hashCode();
        }
        return (((((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TopUpHistoryTransactionEntity(sortSequence=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", paymentId=");
        sb.append(this.read);
        sb.append(", tranDateTime=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", serviceNumber=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", amount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", repeatFlag=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", regenerateFlag=");
        sb.append(this.write);
        sb.append(", biller=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", transferType=");
        sb.append(this.RatingCompat);
        sb.append(")");
        return sb.toString();
    }
}
