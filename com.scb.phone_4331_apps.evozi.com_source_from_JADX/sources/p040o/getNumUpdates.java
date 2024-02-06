package p040o;

import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.getNumUpdates */
public final class getNumUpdates {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final OffsetDateTime MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final String MediaDescriptionCompat;
    public final OffsetDateTime MediaMetadataCompat;
    public final OffsetDateTime MediaSessionCompat$QueueItem;
    public final String RatingCompat;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getNumUpdates)) {
            return false;
        }
        getNumUpdates getnumupdates = (getNumUpdates) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getnumupdates.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) getnumupdates.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getnumupdates.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getnumupdates.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getnumupdates.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getnumupdates.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) getnumupdates.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) getnumupdates.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) getnumupdates.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) getnumupdates.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) getnumupdates.MediaMetadataCompat);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaDescriptionCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.read;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        OffsetDateTime offsetDateTime = this.MediaBrowserCompat$MediaItem;
        int hashCode8 = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
        String str8 = this.RatingCompat;
        int hashCode9 = str8 != null ? str8.hashCode() : 0;
        OffsetDateTime offsetDateTime2 = this.MediaSessionCompat$QueueItem;
        int hashCode10 = offsetDateTime2 != null ? offsetDateTime2.hashCode() : 0;
        OffsetDateTime offsetDateTime3 = this.MediaMetadataCompat;
        if (offsetDateTime3 != null) {
            i = offsetDateTime3.hashCode();
        }
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DiscoverRecommend(assetType=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", fundPicturePath=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", caption=");
        sb.append(this.write);
        sb.append(", fundCode=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", fundDayEndNav=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", fundNavChange=");
        sb.append(this.read);
        sb.append(", fundNavChangePercentage=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", fundNavDate=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", ipoFundName=");
        sb.append(this.RatingCompat);
        sb.append(", ipoStartDate=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", ipoEndDate=");
        sb.append(this.MediaMetadataCompat);
        sb.append(")");
        return sb.toString();
    }

    public getNumUpdates(String str, String str2, String str3, String str4, String str5, String str6, String str7, OffsetDateTime offsetDateTime, String str8, OffsetDateTime offsetDateTime2, OffsetDateTime offsetDateTime3) {
        this.IconCompatParcelizer = str;
        this.MediaDescriptionCompat = str2;
        this.write = str3;
        this.MediaBrowserCompat$ItemReceiver = str4;
        this.MediaBrowserCompat$CustomActionResultReceiver = str5;
        this.read = str6;
        this.MediaBrowserCompat$SearchResultReceiver = str7;
        this.MediaBrowserCompat$MediaItem = offsetDateTime;
        this.RatingCompat = str8;
        this.MediaSessionCompat$QueueItem = offsetDateTime2;
        this.MediaMetadataCompat = offsetDateTime3;
    }
}
