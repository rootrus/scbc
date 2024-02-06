package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.createAnimation */
public final class createAnimation {
    @SerializedName("options")
    public final List<setVertex> read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof createAnimation) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((createAnimation) obj).read);
        }
        return true;
    }

    public final int hashCode() {
        List<setVertex> list = this.read;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MaritalOptionsEntity(options=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
