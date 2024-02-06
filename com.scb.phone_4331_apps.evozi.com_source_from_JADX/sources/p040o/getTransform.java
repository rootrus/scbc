package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getTransform */
public final class getTransform {
    @SerializedName("fundCode")
    public final String IconCompatParcelizer;
    @SerializedName("fundDayEndNav")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("fundNavChange")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("fundNavChangePercentage")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("fundPicturePath")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("fundNavDate")
    public final String MediaDescriptionCompat;
    @SerializedName("ipoFundName")
    public final String MediaMetadataCompat;
    @SerializedName("ipoStartDate")
    public final String MediaSessionCompat$Token;
    @SerializedName("ipoEndDate")
    public final String RatingCompat;
    @SerializedName("caption")
    public final String read;
    @SerializedName("assetType")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getTransform)) {
            return false;
        }
        getTransform gettransform = (getTransform) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) gettransform.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) gettransform.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) gettransform.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) gettransform.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) gettransform.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) gettransform.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) gettransform.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) gettransform.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) gettransform.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) gettransform.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) gettransform.RatingCompat);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$MediaItem;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaDescriptionCompat;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaMetadataCompat;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.MediaSessionCompat$Token;
        int hashCode10 = str10 != null ? str10.hashCode() : 0;
        String str11 = this.RatingCompat;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DiscoverRecommendEntity(assetType=");
        sb.append(this.write);
        sb.append(", fundPicturePath=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", caption=");
        sb.append(this.read);
        sb.append(", fundCode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", fundDayEndNav=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", fundNavChange=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", fundNavChangePercentage=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", fundNavDate=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", ipoFundName=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", ipoStartDate=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", ipoEndDate=");
        sb.append(this.RatingCompat);
        sb.append(")");
        return sb.toString();
    }
}
