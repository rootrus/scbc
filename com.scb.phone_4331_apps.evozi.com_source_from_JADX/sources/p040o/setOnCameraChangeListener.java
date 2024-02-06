package p040o;

/* renamed from: o.setOnCameraChangeListener */
public final class setOnCameraChangeListener {
    public final String IconCompatParcelizer;
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    private final String MediaBrowserCompat$MediaItem;
    private final String MediaBrowserCompat$SearchResultReceiver;
    private final String MediaMetadataCompat;
    private final String RatingCompat;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setOnCameraChangeListener)) {
            return false;
        }
        setOnCameraChangeListener setoncamerachangelistener = (setOnCameraChangeListener) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setoncamerachangelistener.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setoncamerachangelistener.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setoncamerachangelistener.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setoncamerachangelistener.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) setoncamerachangelistener.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setoncamerachangelistener.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) setoncamerachangelistener.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) setoncamerachangelistener.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setoncamerachangelistener.write);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$MediaItem;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaMetadataCompat;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.RatingCompat;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.write;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Information(application=");
        sb.append(this.read);
        sb.append(", applicationDisplayNameTh=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", applicationDisplayNameEn=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", applicationId=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", organization=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", organizationDisplayNameTh=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", organizationDisplayNameEn=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", organizationId=");
        sb.append(this.RatingCompat);
        sb.append(", icon=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public setOnCameraChangeListener(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.MediaBrowserCompat$SearchResultReceiver = str5;
        this.MediaBrowserCompat$MediaItem = str6;
        this.MediaMetadataCompat = str7;
        this.RatingCompat = str8;
        this.write = str9;
    }
}
