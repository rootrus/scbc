package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.PathKeyframe */
public final class PathKeyframe {
    @SerializedName("applicationUuid")
    private final String IconCompatParcelizer;
    @SerializedName("consentFlags")
    private final getOpacityAnimations MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PathKeyframe)) {
            return false;
        }
        PathKeyframe pathKeyframe = (PathKeyframe) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) pathKeyframe.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) pathKeyframe.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        getOpacityAnimations getopacityanimations = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getopacityanimations != null) {
            i = getopacityanimations.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlConsentsRequest(applicationUuid=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", consentFlags=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
