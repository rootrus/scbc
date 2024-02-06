package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.RectangleContent */
public final class RectangleContent {
    @SerializedName("citizenId")
    public final BaseKeyframeAnimation IconCompatParcelizer;
    @SerializedName("engFirstName")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("engLastName")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("thaiTitle")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("thaiLastName")
    public final String MediaDescriptionCompat;
    @SerializedName("mobileNo")
    public final String MediaMetadataCompat;
    @SerializedName("thaiFirstName")
    public final String RatingCompat;
    @SerializedName("dateOfBirth")
    public final String read;
    @SerializedName("engTitle")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RectangleContent)) {
            return false;
        }
        RectangleContent rectangleContent = (RectangleContent) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) rectangleContent.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) rectangleContent.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) rectangleContent.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) rectangleContent.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) rectangleContent.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) rectangleContent.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) rectangleContent.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) rectangleContent.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) rectangleContent.MediaMetadataCompat);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$MediaItem;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.RatingCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaDescriptionCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.read;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        BaseKeyframeAnimation baseKeyframeAnimation = this.IconCompatParcelizer;
        int hashCode8 = baseKeyframeAnimation != null ? baseKeyframeAnimation.hashCode() : 0;
        String str8 = this.MediaMetadataCompat;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CustomerInfoEntity(thaiTitle=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", engTitle=");
        sb.append(this.write);
        sb.append(", thaiFirstName=");
        sb.append(this.RatingCompat);
        sb.append(", thaiLastName=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", engFirstName=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", engLastName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", dateOfBirth=");
        sb.append(this.read);
        sb.append(", citizenId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", mobileNo=");
        sb.append(this.MediaMetadataCompat);
        sb.append(")");
        return sb.toString();
    }
}
