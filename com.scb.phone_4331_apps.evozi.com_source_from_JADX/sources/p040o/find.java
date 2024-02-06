package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.find */
public final class find {
    @SerializedName("remarksEN")
    public final String IconCompatParcelizer;
    @SerializedName("descriptionTH")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("code")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("remarksTH")
    public final String MediaMetadataCompat;
    @SerializedName("sortSequence")
    public final Integer RatingCompat;
    @SerializedName("descriptionEN")
    public final String read;
    @SerializedName("id")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof find)) {
            return false;
        }
        find find = (find) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) find.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) find.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) find.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) find.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) find.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) find.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) find.IconCompatParcelizer);
    }

    public final int hashCode() {
        Integer num = this.RatingCompat;
        int i = 0;
        int hashCode = num != null ? num.hashCode() : 0;
        String str = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaMetadataCompat;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.IconCompatParcelizer;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShopTypeInfoEntity(sortSequence=");
        sb.append(this.RatingCompat);
        sb.append(", code=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", descriptionTH=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", descriptionEN=");
        sb.append(this.read);
        sb.append(", id=");
        sb.append(this.write);
        sb.append(", remarksTH=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", remarksEN=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
