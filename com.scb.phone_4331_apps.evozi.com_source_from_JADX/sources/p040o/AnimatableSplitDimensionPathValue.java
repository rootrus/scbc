package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.AnimatableSplitDimensionPathValue */
public final class AnimatableSplitDimensionPathValue {
    @SerializedName("options")
    public final List<setVertex> write;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AnimatableSplitDimensionPathValue) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((AnimatableSplitDimensionPathValue) obj).write);
        }
        return true;
    }

    public final int hashCode() {
        List<setVertex> list = this.write;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResidentTypeOptionsEntity(options=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
