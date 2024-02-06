package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.rotateLeft */
public final class rotateLeft {
    @SerializedName("firstNameEN")
    public final String IconCompatParcelizer;
    @SerializedName("email")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("lastNameTH")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("middleNameTH")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("phoneNumber")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("lineId")
    public final String MediaDescriptionCompat;
    @SerializedName("middleNameEN")
    public final String MediaMetadataCompat;
    @SerializedName("tncVersion")
    public final int MediaSessionCompat$ResultReceiverWrapper;
    @SerializedName("tncType")
    public final String MediaSessionCompat$Token;
    @SerializedName("referenceType")
    public final String ParcelableVolumeInfo;
    @SerializedName("referenceId")
    public final String RatingCompat;
    @SerializedName("firstNameTH")
    public final String read;
    @SerializedName("lastNameEN")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rotateLeft)) {
            return false;
        }
        rotateLeft rotateleft = (rotateLeft) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) rotateleft.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) rotateleft.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) rotateleft.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) rotateleft.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) rotateleft.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) rotateleft.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) rotateleft.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) rotateleft.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) rotateleft.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) rotateleft.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) rotateleft.ParcelableVolumeInfo) && this.MediaSessionCompat$ResultReceiverWrapper == rotateleft.MediaSessionCompat$ResultReceiverWrapper && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) rotateleft.MediaSessionCompat$Token);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$MediaItem;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaMetadataCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.write;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaDescriptionCompat;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.RatingCompat;
        int hashCode10 = str10 != null ? str10.hashCode() : 0;
        String str11 = this.ParcelableVolumeInfo;
        int hashCode11 = str11 != null ? str11.hashCode() : 0;
        int i2 = this.MediaSessionCompat$ResultReceiverWrapper;
        String str12 = this.MediaSessionCompat$Token;
        if (str12 != null) {
            i = str12.hashCode();
        }
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + i2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OwnerEntity(firstNameTH=");
        sb.append(this.read);
        sb.append(", middleNameTH=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", lastNameTH=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", firstNameEN=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", middleNameEN=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", lastNameEN=");
        sb.append(this.write);
        sb.append(", email=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", lineId=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", phoneNumber=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", referenceId=");
        sb.append(this.RatingCompat);
        sb.append(", referenceType=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", tncVersion=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(", tncType=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(")");
        return sb.toString();
    }
}
