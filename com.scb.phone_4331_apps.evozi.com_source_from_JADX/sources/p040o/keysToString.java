package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.keysToString */
public final class keysToString {
    @SerializedName("remark")
    public final Font IconCompatParcelizer;
    @SerializedName("productType")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("applicationExpiryDate")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("verifyKycFlag")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("transactionId")
    public final String MediaMetadataCompat;
    @SerializedName("stage")
    public final String RatingCompat;
    @SerializedName("customerContactInfo")
    public final RectangleContent read;
    @SerializedName("nationality")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof keysToString)) {
            return false;
        }
        keysToString keystostring = (keysToString) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) keystostring.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) keystostring.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) keystostring.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) keystostring.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) keystostring.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) keystostring.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) keystostring.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) keystostring.read);
    }

    public final int hashCode() {
        String str = this.MediaMetadataCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$MediaItem;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.RatingCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        Font font = this.IconCompatParcelizer;
        int hashCode7 = font != null ? font.hashCode() : 0;
        RectangleContent rectangleContent = this.read;
        if (rectangleContent != null) {
            i = rectangleContent.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlVerifyKycStatusEntity(transactionId=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", verifyKycFlag=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", stage=");
        sb.append(this.RatingCompat);
        sb.append(", nationality=");
        sb.append(this.write);
        sb.append(", applicationExpiryDate=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", productType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", remark=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", customerContactInfo=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
