package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.setTransparentCircleAlpha */
public final class setTransparentCircleAlpha {
    @SerializedName("maxLimitTransaction")
    public final int MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("remainingLimits")
    public final List<setUsePercentValues> MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setTransparentCircleAlpha)) {
            return false;
        }
        setTransparentCircleAlpha settransparentcirclealpha = (setTransparentCircleAlpha) obj;
        return this.MediaBrowserCompat$CustomActionResultReceiver == settransparentcirclealpha.MediaBrowserCompat$CustomActionResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) settransparentcirclealpha.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        List<setUsePercentValues> list = this.MediaBrowserCompat$ItemReceiver;
        return (i * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LimitEntity(maxLimitTransaction=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", remainingLimits=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
