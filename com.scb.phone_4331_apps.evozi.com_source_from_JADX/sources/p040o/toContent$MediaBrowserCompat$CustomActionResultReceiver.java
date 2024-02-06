package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.toContent$MediaBrowserCompat$CustomActionResultReceiver */
public final class toContent$MediaBrowserCompat$CustomActionResultReceiver {
    @SerializedName("engName")
    public final String IconCompatParcelizer;
    @SerializedName("email")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("dateOfBirth")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("mobileNo")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("maritalStatus")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("engTitle")
    public final String MediaDescriptionCompat;
    @SerializedName("mailingAddress")
    public final List<String> MediaMetadataCompat;
    @SerializedName("thaiName")
    public final String MediaSessionCompat$QueueItem;
    @SerializedName("thaiTitle")
    public final String MediaSessionCompat$Token;
    @SerializedName("residentType")
    public final String RatingCompat;
    @SerializedName("educationLevel")
    public final String read;
    @SerializedName("citizenId")
    public final GradientColorKeyframeAnimation write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toContent$MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        toContent$MediaBrowserCompat$CustomActionResultReceiver tocontent_mediabrowsercompat_customactionresultreceiver = (toContent$MediaBrowserCompat$CustomActionResultReceiver) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) tocontent_mediabrowsercompat_customactionresultreceiver.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) tocontent_mediabrowsercompat_customactionresultreceiver.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) tocontent_mediabrowsercompat_customactionresultreceiver.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) tocontent_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) tocontent_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) tocontent_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) tocontent_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) tocontent_mediabrowsercompat_customactionresultreceiver.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) tocontent_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) tocontent_mediabrowsercompat_customactionresultreceiver.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) tocontent_mediabrowsercompat_customactionresultreceiver.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) tocontent_mediabrowsercompat_customactionresultreceiver.write);
    }

    public final int hashCode() {
        String str = this.MediaSessionCompat$Token;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaDescriptionCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaSessionCompat$QueueItem;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$MediaItem;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        List<String> list = this.MediaMetadataCompat;
        int hashCode8 = list != null ? list.hashCode() : 0;
        String str8 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode9 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.RatingCompat;
        int hashCode10 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.read;
        int hashCode11 = str10 != null ? str10.hashCode() : 0;
        GradientColorKeyframeAnimation gradientColorKeyframeAnimation = this.write;
        if (gradientColorKeyframeAnimation != null) {
            i = gradientColorKeyframeAnimation.hashCode();
        }
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CustomerContact(thaiTitle=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", engTitle=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", thaiName=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", engName=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", mobileNo=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", dateOfBirth=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", email=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", mailingAddress=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", maritalStatus=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", residentType=");
        sb.append(this.RatingCompat);
        sb.append(", educationLevel=");
        sb.append(this.read);
        sb.append(", citizenId=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
