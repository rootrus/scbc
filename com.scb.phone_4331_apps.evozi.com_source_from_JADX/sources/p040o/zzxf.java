package p040o;

/* renamed from: o.zzxf */
public final class zzxf {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final Boolean MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final String MediaMetadataCompat;
    public final int RatingCompat;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzxf)) {
            return false;
        }
        zzxf zzxf = (zzxf) obj;
        return this.RatingCompat == zzxf.RatingCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzxf.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) zzxf.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) zzxf.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzxf.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzxf.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzxf.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzxf.read);
    }

    public final int hashCode() {
        int i = this.RatingCompat;
        String str = this.write;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaMetadataCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        Boolean bool = this.MediaBrowserCompat$ItemReceiver;
        int hashCode5 = bool != null ? bool.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.read;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return (((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BankingServiceTiles(sortSequence=");
        sb.append(this.RatingCompat);
        sb.append(", displayType=");
        sb.append(this.write);
        sb.append(", tileNameEN=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", tileNameTH=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", imageURL=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", loginRequiredFlag=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", firebaseEventName=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", deeplinkUrl=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public zzxf(int i, String str, String str2, String str3, String str4, Boolean bool, String str5, String str6) {
        this.RatingCompat = i;
        this.write = str;
        this.MediaBrowserCompat$SearchResultReceiver = str2;
        this.MediaMetadataCompat = str3;
        this.IconCompatParcelizer = str4;
        this.MediaBrowserCompat$ItemReceiver = bool;
        this.MediaBrowserCompat$CustomActionResultReceiver = str5;
        this.read = str6;
    }
}
