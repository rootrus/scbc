package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.OnFocusChange */
public final class OnFocusChange {
    @SerializedName("maxDelay")
    public final Integer MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("resetDuration")
    public final Integer MediaBrowserCompat$ItemReceiver;
    @SerializedName("isUseDelay")
    public final Boolean write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnFocusChange)) {
            return false;
        }
        OnFocusChange onFocusChange = (OnFocusChange) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) onFocusChange.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) onFocusChange.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) onFocusChange.write);
    }

    public final int hashCode() {
        Integer num = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = num != null ? num.hashCode() : 0;
        Integer num2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = num2 != null ? num2.hashCode() : 0;
        Boolean bool = this.write;
        if (bool != null) {
            i = bool.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AppConfigImproveLoadingEntity(maxDelay=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", resetDuration=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", isUseDelay=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
