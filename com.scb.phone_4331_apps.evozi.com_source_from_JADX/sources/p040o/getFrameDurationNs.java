package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getFrameDurationNs */
public final class getFrameDurationNs {
    @SerializedName("touchpoint")
    public final getAnimatedFraction MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("facialRequiredFlag")
    public final String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getFrameDurationNs)) {
            return false;
        }
        getFrameDurationNs getframedurationns = (getFrameDurationNs) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getframedurationns.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getframedurationns.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        getAnimatedFraction getanimatedfraction = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = getanimatedfraction != null ? getanimatedfraction.hashCode() : 0;
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str != null) {
            i = str.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TouchPointUserEntity(touchPointUserInfo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", facialRequiredFlag=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
