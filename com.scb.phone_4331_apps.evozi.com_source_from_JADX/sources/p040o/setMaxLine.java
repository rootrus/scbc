package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.setMaxLine */
public final class setMaxLine {
    @SerializedName("list")
    public final List<String> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("detail")
    private final setFlexWrap write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setMaxLine)) {
            return false;
        }
        setMaxLine setmaxline = (setMaxLine) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setmaxline.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setmaxline.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        setFlexWrap setflexwrap = this.write;
        int i = 0;
        int hashCode = setflexwrap != null ? setflexwrap.hashCode() : 0;
        List<String> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SequentialCarSearchEntity(detail=");
        sb.append(this.write);
        sb.append(", list=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
