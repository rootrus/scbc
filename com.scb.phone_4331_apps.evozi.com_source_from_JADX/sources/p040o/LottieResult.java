package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.LottieResult */
public class LottieResult extends getBitmap {
    @SerializedName("offers")
    public List<LottieProperty> MediaBrowserCompat$MediaItem;
    @SerializedName("applicationId")
    public String MediaDescriptionCompat;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        LottieResult lottieResult = (LottieResult) obj;
        List<LottieProperty> list = this.MediaBrowserCompat$MediaItem;
        if (list == null ? lottieResult.MediaBrowserCompat$MediaItem != null : !list.equals(lottieResult.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        String str = this.MediaDescriptionCompat;
        String str2 = lottieResult.MediaDescriptionCompat;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = super.hashCode();
        List<LottieProperty> list = this.MediaBrowserCompat$MediaItem;
        int i = 0;
        int hashCode2 = list != null ? list.hashCode() : 0;
        String str = this.MediaDescriptionCompat;
        if (str != null) {
            i = str.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }
}
