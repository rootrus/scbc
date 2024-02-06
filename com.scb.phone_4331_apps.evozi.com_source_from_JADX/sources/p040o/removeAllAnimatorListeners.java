package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.removeAllAnimatorListeners */
public final class removeAllAnimatorListeners {
    @SerializedName("formatType")
    public final String IconCompatParcelizer;
    @SerializedName("descriptionEn")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("descriptionTh")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("headerEn")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("headerTh")
    public final String RatingCompat;
    @SerializedName("buttonTextTh")
    public final String read;
    @SerializedName("buttonTextEn")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof removeAllAnimatorListeners)) {
            return false;
        }
        removeAllAnimatorListeners removeallanimatorlisteners = (removeAllAnimatorListeners) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) removeallanimatorlisteners.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) removeallanimatorlisteners.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) removeallanimatorlisteners.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) removeallanimatorlisteners.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) removeallanimatorlisteners.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) removeallanimatorlisteners.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) removeallanimatorlisteners.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.RatingCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$MediaItem;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.write;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.IconCompatParcelizer;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContextualMetadataEntity(headerTh=");
        sb.append(this.RatingCompat);
        sb.append(", headerEn=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", descriptionTh=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", descriptionEn=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", buttonTextTh=");
        sb.append(this.read);
        sb.append(", buttonTextEn=");
        sb.append(this.write);
        sb.append(", formatType=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
