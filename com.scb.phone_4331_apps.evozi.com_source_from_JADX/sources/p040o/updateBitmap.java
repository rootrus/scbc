package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.updateBitmap */
public final class updateBitmap {
    @SerializedName("cardMaskedNo")
    public final String IconCompatParcelizer;
    @SerializedName("accountFromName")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("allow")
    public final List<String> MediaBrowserCompat$ItemReceiver;
    @SerializedName("cardSubType")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("cardType")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("requestUUID")

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String f2655x50fd9e4a;
    @SerializedName("cardRank")
    public final Integer MediaDescriptionCompat;
    @SerializedName("cardStatus")
    public final String MediaMetadataCompat;
    @SerializedName("productCode")
    public final String MediaSessionCompat$QueueItem;
    @SerializedName("imageURL")
    public final String MediaSessionCompat$ResultReceiverWrapper;
    @SerializedName("originalReplacementWaiveFee")
    public final Integer MediaSessionCompat$Token;
    @SerializedName("cardRefNo")
    public final String RatingCompat;
    @SerializedName("cardCategory")
    public final String read;
    @SerializedName("accountNo")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof updateBitmap)) {
            return false;
        }
        updateBitmap updatebitmap = (updateBitmap) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) updatebitmap.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) updatebitmap.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) updatebitmap.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) updatebitmap.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) updatebitmap.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) updatebitmap.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) updatebitmap.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) updatebitmap.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) updatebitmap.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) updatebitmap.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2655x50fd9e4a, (Object) updatebitmap.f2655x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) updatebitmap.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) updatebitmap.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) updatebitmap.MediaSessionCompat$Token);
    }

    public final int hashCode() {
        String str = this.RatingCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaMetadataCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$MediaItem;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaSessionCompat$QueueItem;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        List<String> list = this.MediaBrowserCompat$ItemReceiver;
        int hashCode8 = list != null ? list.hashCode() : 0;
        String str8 = this.read;
        int hashCode9 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode10 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.f2655x50fd9e4a;
        int hashCode11 = str10 != null ? str10.hashCode() : 0;
        Integer num = this.MediaDescriptionCompat;
        int hashCode12 = num != null ? num.hashCode() : 0;
        String str11 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode13 = str11 != null ? str11.hashCode() : 0;
        Integer num2 = this.MediaSessionCompat$Token;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return (((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DebitCardInfoEntity(cardRefNo=");
        sb.append(this.RatingCompat);
        sb.append(", accountNo=");
        sb.append(this.write);
        sb.append(", cardMaskedNo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", cardStatus=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", cardType=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", cardSubType=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", productCode=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", allow=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", cardCategory=");
        sb.append(this.read);
        sb.append(", imageURL=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(", requestUUID=");
        sb.append(this.f2655x50fd9e4a);
        sb.append(", cardRank=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", accountFromName=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", originalReplacementWaiveFee=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(")");
        return sb.toString();
    }
}
