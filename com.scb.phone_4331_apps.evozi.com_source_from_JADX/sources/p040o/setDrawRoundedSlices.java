package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setDrawRoundedSlices */
public final class setDrawRoundedSlices {
    @SerializedName("agentType")
    public final String IconCompatParcelizer;
    @SerializedName("channelType")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("countryName")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("sortSequence")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("name")
    public final String MediaMetadataCompat;
    @SerializedName("logoImageURL")
    public final String RatingCompat;
    @SerializedName("decimalAmountFlag")
    public final String read;
    @SerializedName("currencyCode")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setDrawRoundedSlices)) {
            return false;
        }
        setDrawRoundedSlices setdrawroundedslices = (setDrawRoundedSlices) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setdrawroundedslices.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setdrawroundedslices.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setdrawroundedslices.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setdrawroundedslices.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setdrawroundedslices.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setdrawroundedslices.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) setdrawroundedslices.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) setdrawroundedslices.MediaMetadataCompat);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$MediaItem;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.RatingCompat;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaMetadataCompat;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChannelEntity(countryName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", channelType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", agentType=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", currencyCode=");
        sb.append(this.write);
        sb.append(", decimalAmountFlag=");
        sb.append(this.read);
        sb.append(", sortSequence=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", logoImageURL=");
        sb.append(this.RatingCompat);
        sb.append(", name=");
        sb.append(this.MediaMetadataCompat);
        sb.append(")");
        return sb.toString();
    }
}
