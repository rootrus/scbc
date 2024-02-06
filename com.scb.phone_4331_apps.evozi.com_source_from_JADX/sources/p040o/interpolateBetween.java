package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.interpolateBetween */
public final class interpolateBetween {
    @SerializedName("otherChannelFlag")
    public final Boolean IconCompatParcelizer;
    @SerializedName("fundCode")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("shortBrokerName")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("yieldDate")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("yield")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("tags")
    public final List<ShapeFill> read;
    @SerializedName("assetType")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof interpolateBetween)) {
            return false;
        }
        interpolateBetween interpolatebetween = (interpolateBetween) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) interpolatebetween.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) interpolatebetween.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) interpolatebetween.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) interpolatebetween.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) interpolatebetween.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) interpolatebetween.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) interpolatebetween.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$MediaItem;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        Boolean bool = this.IconCompatParcelizer;
        int hashCode5 = bool != null ? bool.hashCode() : 0;
        String str5 = this.write;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        List<ShapeFill> list = this.read;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DiscoverTopItemEntity(fundCode=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", shortBrokerName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", yield=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", yieldDate=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", otherChannelFlag=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", assetType=");
        sb.append(this.write);
        sb.append(", tags=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
