package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.pauseAnimation */
public final class pauseAnimation {
    @SerializedName("adsName")
    public final String IconCompatParcelizer;
    @SerializedName("deeplinkUrlEN")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("deeplinkUrlTH")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("imageUrlEN")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("imageUrlTH")
    public final String MediaDescriptionCompat;
    @SerializedName("sortSequence")
    public final int MediaMetadataCompat;
    @SerializedName("fontColor")
    public final String RatingCompat;
    @SerializedName("adsId")
    public final int read;
    @SerializedName("contextualMetadata")
    public final removeAllAnimatorListeners write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pauseAnimation)) {
            return false;
        }
        pauseAnimation pauseanimation = (pauseAnimation) obj;
        return this.read == pauseanimation.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) pauseanimation.IconCompatParcelizer) && this.MediaMetadataCompat == pauseanimation.MediaMetadataCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) pauseanimation.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) pauseanimation.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) pauseanimation.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) pauseanimation.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) pauseanimation.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) pauseanimation.write);
    }

    public final int hashCode() {
        int i = this.read;
        String str = this.IconCompatParcelizer;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        int i3 = this.MediaMetadataCompat;
        String str2 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaDescriptionCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.RatingCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        removeAllAnimatorListeners removeallanimatorlisteners = this.write;
        if (removeallanimatorlisteners != null) {
            i2 = removeallanimatorlisteners.hashCode();
        }
        return (((((((((((((((i * 31) + hashCode) * 31) + i3) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdEntity(adsId=");
        sb.append(this.read);
        sb.append(", adsName=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", sortSequence=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", imageUrlEN=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", imageUrlTH=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", fontColor=");
        sb.append(this.RatingCompat);
        sb.append(", deepLinkUrlEN=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", deepLinkUrlTH=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", contextualMetadata=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
