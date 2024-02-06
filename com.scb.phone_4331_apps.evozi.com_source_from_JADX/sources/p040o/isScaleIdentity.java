package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.isScaleIdentity */
public final class isScaleIdentity {
    private static final int MediaBrowserCompat$MediaItem = 1;
    private static isScaleIdentity$MediaBrowserCompat$ItemReceiver MediaDescriptionCompat;
    @SerializedName("firebaseEventName")
    public String IconCompatParcelizer;
    @SerializedName("loginRequiredFlag")
    public int MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("imageURL")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("tileNameTH")
    public String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("sortSequence")
    public int MediaMetadataCompat;
    @SerializedName("tileNameEN")
    public String RatingCompat;
    @SerializedName("displayType")
    public String read;
    @SerializedName("deeplinkUrl")
    public String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isScaleIdentity)) {
            return false;
        }
        isScaleIdentity isscaleidentity = (isScaleIdentity) obj;
        return this.MediaMetadataCompat == isscaleidentity.MediaMetadataCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) isscaleidentity.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) isscaleidentity.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) isscaleidentity.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) isscaleidentity.MediaBrowserCompat$ItemReceiver) && this.MediaBrowserCompat$CustomActionResultReceiver == isscaleidentity.MediaBrowserCompat$CustomActionResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) isscaleidentity.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) isscaleidentity.write);
    }

    public final int hashCode() {
        int i = this.MediaMetadataCompat;
        String str = this.read;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.RatingCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        int i3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str5 = this.IconCompatParcelizer;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.write;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return (((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i3) * 31) + hashCode5) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BankingServiceTilesEntity(sortSequence=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", displayType=");
        sb.append(this.read);
        sb.append(", tileNameEN=");
        sb.append(this.RatingCompat);
        sb.append(", tileNameTH=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", imageURL=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", loginRequiredFlag=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", firebaseEventName=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", deeplinkUrl=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
