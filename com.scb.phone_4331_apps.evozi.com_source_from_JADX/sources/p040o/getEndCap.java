package p040o;

/* renamed from: o.getEndCap */
public final class getEndCap {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final int MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final String MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public final String RatingCompat;
    public final setMockLocation read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getEndCap)) {
            return false;
        }
        getEndCap getendcap = (getEndCap) obj;
        return this.MediaBrowserCompat$ItemReceiver == getendcap.MediaBrowserCompat$ItemReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getendcap.IconCompatParcelizer) && this.MediaMetadataCompat == getendcap.MediaMetadataCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) getendcap.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) getendcap.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) getendcap.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getendcap.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getendcap.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getendcap.read);
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompat$ItemReceiver;
        String str = this.IconCompatParcelizer;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        int i3 = this.MediaMetadataCompat;
        String str2 = this.RatingCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$MediaItem;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaDescriptionCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.write;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        setMockLocation setmocklocation = this.read;
        if (setmocklocation != null) {
            i2 = setmocklocation.hashCode();
        }
        return (((((((((((((((i * 31) + hashCode) * 31) + i3) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ad(adsId=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", adsName=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", sortSequence=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", imageUrlEN=");
        sb.append(this.RatingCompat);
        sb.append(", imageUrlTH=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", fontColor=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", deepLinkUrlEN=");
        sb.append(this.write);
        sb.append(", deepLinkUrlTH=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", contextualMetadata=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public getEndCap(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, setMockLocation setmocklocation) {
        onGetStartedClick.write((Object) str, "adsName");
        onGetStartedClick.write((Object) str2, "imageUrlEN");
        onGetStartedClick.write((Object) str3, "imageUrlTH");
        onGetStartedClick.write((Object) str4, "fontColor");
        onGetStartedClick.write((Object) str5, "deepLinkUrlEN");
        onGetStartedClick.write((Object) str6, "deepLinkUrlTH");
        onGetStartedClick.write((Object) setmocklocation, "contextualMetadata");
        this.MediaBrowserCompat$ItemReceiver = i;
        this.IconCompatParcelizer = str;
        this.MediaMetadataCompat = i2;
        this.RatingCompat = str2;
        this.MediaBrowserCompat$MediaItem = str3;
        this.MediaDescriptionCompat = str4;
        this.write = str5;
        this.MediaBrowserCompat$CustomActionResultReceiver = str6;
        this.read = setmocklocation;
    }
}
