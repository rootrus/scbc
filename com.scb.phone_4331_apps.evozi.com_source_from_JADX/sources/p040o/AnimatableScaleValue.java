package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.AnimatableScaleValue */
public final class AnimatableScaleValue {
    @SerializedName("types")
    public final List<AnimatablePointValue> read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AnimatableScaleValue) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((AnimatableScaleValue) obj).read);
        }
        return true;
    }

    public final int hashCode() {
        List<AnimatablePointValue> list = this.read;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SupportingDocumentTypeEntity(types=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
