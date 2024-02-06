package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.fromJsonInputStream */
public final class fromJsonInputStream {
    @SerializedName("en")
    public final createResultAndNotify IconCompatParcelizer;
    @SerializedName("companyCode")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("logo")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("suggestionOrder")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("defaultRefFlag")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("categoryCode")
    private final String MediaDescriptionCompat;
    @SerializedName("suggestionFlag")
    public final String MediaMetadataCompat;
    @SerializedName("refType")
    public final String RatingCompat;
    @SerializedName("th")
    public final createResultAndNotify read;
    @SerializedName("accountNo")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fromJsonInputStream)) {
            return false;
        }
        fromJsonInputStream fromjsoninputstream = (fromJsonInputStream) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fromjsoninputstream.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fromjsoninputstream.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fromjsoninputstream.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) fromjsoninputstream.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) fromjsoninputstream.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) fromjsoninputstream.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) fromjsoninputstream.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) fromjsoninputstream.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) fromjsoninputstream.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) fromjsoninputstream.MediaBrowserCompat$SearchResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaDescriptionCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.RatingCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaMetadataCompat;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$MediaItem;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        createResultAndNotify createresultandnotify = this.read;
        int hashCode8 = createresultandnotify != null ? createresultandnotify.hashCode() : 0;
        createResultAndNotify createresultandnotify2 = this.IconCompatParcelizer;
        int hashCode9 = createresultandnotify2 != null ? createresultandnotify2.hashCode() : 0;
        String str8 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DirectDebitBillerLocalizedEntity(accountNo=");
        sb.append(this.write);
        sb.append(", billerLogo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", companyCode=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", categoryCode=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", refType=");
        sb.append(this.RatingCompat);
        sb.append(", suggestionFlag=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", suggestionOrder=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", billerThaiInfo=");
        sb.append(this.read);
        sb.append(", billerEngInfo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", defaultRefFlag=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
