package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.ScaleKeyframeAnimation */
public final class ScaleKeyframeAnimation {
    @SerializedName("upload")
    private final List<SplitDimensionPathKeyframeAnimation> MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ScaleKeyframeAnimation) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((ScaleKeyframeAnimation) obj).MediaBrowserCompat$CustomActionResultReceiver);
        }
        return true;
    }

    public final int hashCode() {
        List<SplitDimensionPathKeyframeAnimation> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlDocumentsUploadedEntity(upload=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
