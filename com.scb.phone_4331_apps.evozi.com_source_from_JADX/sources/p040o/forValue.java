package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.forValue */
public final class forValue {
    @SerializedName("banners")
    public final List<getCopies> IconCompatParcelizer;
    @SerializedName("recommends")
    public final List<getTransform> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("recommendDate")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("topListDate")
    public final String RatingCompat;
    @SerializedName("fundfactsheetApplicationId")
    public final String read;
    @SerializedName("topLists")
    public final List<getInitialPoint> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof forValue)) {
            return false;
        }
        forValue forvalue = (forValue) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) forvalue.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) forvalue.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) forvalue.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) forvalue.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) forvalue.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) forvalue.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        List<getCopies> list = this.IconCompatParcelizer;
        int hashCode2 = list != null ? list.hashCode() : 0;
        List<getTransform> list2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = list2 != null ? list2.hashCode() : 0;
        String str2 = this.RatingCompat;
        int hashCode4 = str2 != null ? str2.hashCode() : 0;
        List<getInitialPoint> list3 = this.write;
        int hashCode5 = list3 != null ? list3.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DiscoverDataLandingEntity(fundfactsheetApplicationId=");
        sb.append(this.read);
        sb.append(", highLightBanners=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", recommendBanners=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", topListDate=");
        sb.append(this.RatingCompat);
        sb.append(", topBanners=");
        sb.append(this.write);
        sb.append(", recommendDate=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
