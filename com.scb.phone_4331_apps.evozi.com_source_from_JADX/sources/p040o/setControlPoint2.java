package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.setControlPoint2 */
public final class setControlPoint2 {
    @SerializedName("applicationUuid")
    private final String IconCompatParcelizer;
    @SerializedName("device")
    private final PathKeyframeAnimation MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("declinedConsents")
    private final List<String> MediaBrowserCompat$ItemReceiver;
    @SerializedName("tilesVersion")
    private final String MediaBrowserCompat$MediaItem;
    @SerializedName("advertisingId")
    private final String read;
    @SerializedName("acceptedConsents")
    private final List<String> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setControlPoint2)) {
            return false;
        }
        setControlPoint2 setcontrolpoint2 = (setControlPoint2) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setcontrolpoint2.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setcontrolpoint2.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setcontrolpoint2.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setcontrolpoint2.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setcontrolpoint2.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setcontrolpoint2.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$MediaItem;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        PathKeyframeAnimation pathKeyframeAnimation = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = pathKeyframeAnimation != null ? pathKeyframeAnimation.hashCode() : 0;
        List<String> list = this.write;
        int hashCode5 = list != null ? list.hashCode() : 0;
        List<String> list2 = this.MediaBrowserCompat$ItemReceiver;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlOtpSubmissionRequest(applicationUuid=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", advertisingId=");
        sb.append(this.read);
        sb.append(", tilesVersion=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", device=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", acceptedConsents=");
        sb.append(this.write);
        sb.append(", declinedConsents=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public setControlPoint2(String str, String str2, String str3, PathKeyframeAnimation pathKeyframeAnimation, List<String> list, List<String> list2) {
        onGetStartedClick.write((Object) str, "applicationUuid");
        onGetStartedClick.write((Object) pathKeyframeAnimation, "device");
        onGetStartedClick.write((Object) list, "acceptedConsents");
        onGetStartedClick.write((Object) list2, "declinedConsents");
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.MediaBrowserCompat$MediaItem = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = pathKeyframeAnimation;
        this.write = list;
        this.MediaBrowserCompat$ItemReceiver = list2;
    }
}
