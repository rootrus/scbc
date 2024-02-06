package p040o;

import java.util.List;

/* renamed from: o.getCenter */
public final class getCenter {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final List<String> MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;
    private final String MediaDescriptionCompat;
    public final boolean MediaMetadataCompat;
    private final String MediaSessionCompat$QueueItem;
    private final String MediaSessionCompat$ResultReceiverWrapper;
    public final String RatingCompat;
    public final String read;
    public final int write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCenter)) {
            return false;
        }
        getCenter getcenter = (getCenter) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getcenter.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getcenter.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) getcenter.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) getcenter.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getcenter.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) getcenter.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getcenter.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) getcenter.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) getcenter.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) getcenter.RatingCompat) && this.write == getcenter.write && this.MediaMetadataCompat == getcenter.MediaMetadataCompat;
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$MediaItem;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaSessionCompat$QueueItem;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        List<String> list = this.MediaBrowserCompat$ItemReceiver;
        int hashCode7 = list != null ? list.hashCode() : 0;
        String str7 = this.MediaDescriptionCompat;
        int hashCode8 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode9 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.RatingCompat;
        if (str9 != null) {
            i = str9.hashCode();
        }
        int i2 = this.write;
        boolean z = this.MediaMetadataCompat;
        if (z) {
            z = true;
        }
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i) * 31) + i2) * 31) + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DebitCardInfo(cardRefNo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", cardMaskedNo=");
        sb.append(this.read);
        sb.append(", cardStatus=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(", cardType=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", cardSubType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", productCode=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", allow=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", cardCategory=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", imageUrl=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", requestUUID=");
        sb.append(this.RatingCompat);
        sb.append(", cardRank=");
        sb.append(this.write);
        sb.append(", originalReplacementWaiveFee=");
        sb.append(this.MediaMetadataCompat);
        sb.append(")");
        return sb.toString();
    }

    public getCenter(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, String str7, String str8, String str9, int i, boolean z) {
        onGetStartedClick.write((Object) str, "cardRefNo");
        onGetStartedClick.write((Object) str2, "cardMaskedNo");
        onGetStartedClick.write((Object) str3, "cardStatus");
        onGetStartedClick.write((Object) str4, "cardType");
        onGetStartedClick.write((Object) str5, "cardSubType");
        onGetStartedClick.write((Object) str6, "productCode");
        onGetStartedClick.write((Object) list, "allow");
        onGetStartedClick.write((Object) str7, "cardCategory");
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.MediaSessionCompat$ResultReceiverWrapper = str3;
        this.MediaBrowserCompat$MediaItem = str4;
        this.MediaBrowserCompat$CustomActionResultReceiver = str5;
        this.MediaSessionCompat$QueueItem = str6;
        this.MediaBrowserCompat$ItemReceiver = list;
        this.MediaDescriptionCompat = str7;
        this.MediaBrowserCompat$SearchResultReceiver = str8;
        this.RatingCompat = str9;
        this.write = i;
        this.MediaMetadataCompat = z;
    }
}
