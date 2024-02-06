package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.RepeaterContent */
public final class RepeaterContent {
    @SerializedName("customerOccupationInfo")
    public final AnimatablePathValue MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof RepeaterContent) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((RepeaterContent) obj).MediaBrowserCompat$CustomActionResultReceiver);
        }
        return true;
    }

    public final int hashCode() {
        AnimatablePathValue animatablePathValue = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (animatablePathValue != null) {
            return animatablePathValue.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CustomerOccupationInfoEntity(occupationInfoEntity=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
