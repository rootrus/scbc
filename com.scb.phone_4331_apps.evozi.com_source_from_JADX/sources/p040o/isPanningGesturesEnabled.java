package p040o;

/* renamed from: o.isPanningGesturesEnabled */
public final class isPanningGesturesEnabled {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String f2877x50fd9e4a;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompat$QueueItem;
    private final String MediaSessionCompat$Token;
    public final String RatingCompat;
    public final Projection read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isPanningGesturesEnabled)) {
            return false;
        }
        isPanningGesturesEnabled ispanninggesturesenabled = (isPanningGesturesEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ispanninggesturesenabled.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ispanninggesturesenabled.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) ispanninggesturesenabled.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2877x50fd9e4a, (Object) ispanninggesturesenabled.f2877x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) ispanninggesturesenabled.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) ispanninggesturesenabled.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) ispanninggesturesenabled.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ispanninggesturesenabled.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) ispanninggesturesenabled.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) ispanninggesturesenabled.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) ispanninggesturesenabled.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) ispanninggesturesenabled.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ispanninggesturesenabled.IconCompatParcelizer);
    }

    public final int hashCode() {
        Projection projection = this.read;
        int i = 0;
        int hashCode = projection != null ? projection.hashCode() : 0;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.f2877x50fd9e4a;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaSessionCompat$QueueItem;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaDescriptionCompat;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.RatingCompat;
        int hashCode7 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.write;
        int hashCode8 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaMetadataCompat;
        int hashCode9 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaBrowserCompat$MediaItem;
        int hashCode10 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode11 = str10 != null ? str10.hashCode() : 0;
        String str11 = this.MediaSessionCompat$Token;
        int hashCode12 = str11 != null ? str11.hashCode() : 0;
        String str12 = this.IconCompatParcelizer;
        if (str12 != null) {
            i = str12.hashCode();
        }
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SecuritiesAccount(assetType=");
        sb.append(this.read);
        sb.append(", accountNumber=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", accountType=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", unrealizedAmt=");
        sb.append(this.f2877x50fd9e4a);
        sb.append(", unrealizedPercent=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", marketValue=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", quantity=");
        sb.append(this.RatingCompat);
        sb.append(", cash=");
        sb.append(this.write);
        sb.append(", label=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", unit=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", disclaimer=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", sortSequence=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", color=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public isPanningGesturesEnabled(Projection projection, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.read = projection;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.f2877x50fd9e4a = str3;
        this.MediaSessionCompat$QueueItem = str4;
        this.MediaDescriptionCompat = str5;
        this.RatingCompat = str6;
        this.write = str7;
        this.MediaMetadataCompat = str8;
        this.MediaBrowserCompat$MediaItem = str9;
        this.MediaBrowserCompat$SearchResultReceiver = str10;
        this.MediaSessionCompat$Token = str11;
        this.IconCompatParcelizer = str12;
    }
}
