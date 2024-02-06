package p040o;

/* renamed from: o.NativeSessionFile */
public final class NativeSessionFile {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String f2763x50fd9e4a;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final int MediaSessionCompat$QueueItem;
    public final String MediaSessionCompat$ResultReceiverWrapper;
    public final String MediaSessionCompat$Token;
    public final String ParcelableVolumeInfo;
    public final boolean RatingCompat;
    public final String read;
    public final int write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeSessionFile)) {
            return false;
        }
        NativeSessionFile nativeSessionFile = (NativeSessionFile) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) nativeSessionFile.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) nativeSessionFile.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) nativeSessionFile.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) nativeSessionFile.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) nativeSessionFile.MediaSessionCompat$Token) && this.MediaSessionCompat$QueueItem == nativeSessionFile.MediaSessionCompat$QueueItem && this.write == nativeSessionFile.write && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2763x50fd9e4a, (Object) nativeSessionFile.f2763x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) nativeSessionFile.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) nativeSessionFile.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) nativeSessionFile.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) nativeSessionFile.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) nativeSessionFile.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) nativeSessionFile.MediaMetadataCompat) && this.RatingCompat == nativeSessionFile.RatingCompat;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.ParcelableVolumeInfo;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaSessionCompat$Token;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        int i2 = this.MediaSessionCompat$QueueItem;
        int i3 = this.write;
        String str6 = this.f2763x50fd9e4a;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.read;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaDescriptionCompat;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaBrowserCompat$MediaItem;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode10 = str10 != null ? str10.hashCode() : 0;
        String str11 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode11 = str11 != null ? str11.hashCode() : 0;
        String str12 = this.MediaMetadataCompat;
        if (str12 != null) {
            i = str12.hashCode();
        }
        boolean z = this.RatingCompat;
        if (z) {
            z = true;
        }
        return (((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i2) * 31) + i3) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + i) * 31) + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ScbsAccountDisplay(assetType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", accountNumber=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", accountType=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", marketValue=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", percentString=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", percentColor=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", arrowImage=");
        sb.append(this.write);
        sb.append(", quantityString=");
        sb.append(this.f2763x50fd9e4a);
        sb.append(", cash=");
        sb.append(this.read);
        sb.append(", label=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", disclaimer=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", color=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", totalText=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(", cashText=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", isNextArrowVisible=");
        sb.append(this.RatingCompat);
        sb.append(")");
        return sb.toString();
    }

    public NativeSessionFile(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z) {
        onGetStartedClick.write((Object) str6, "quantityString");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.IconCompatParcelizer = str3;
        this.ParcelableVolumeInfo = str4;
        this.MediaSessionCompat$Token = str5;
        this.MediaSessionCompat$QueueItem = i;
        this.write = i2;
        this.f2763x50fd9e4a = str6;
        this.read = str7;
        this.MediaDescriptionCompat = str8;
        this.MediaBrowserCompat$MediaItem = str9;
        this.MediaBrowserCompat$SearchResultReceiver = str10;
        this.MediaSessionCompat$ResultReceiverWrapper = str11;
        this.MediaMetadataCompat = str12;
        this.RatingCompat = z;
    }
}
