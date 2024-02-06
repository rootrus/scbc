package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.ShapeContent */
public final class ShapeContent {
    @SerializedName("applicationUuid")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("customerOccupationInfo")
    private final AnimatablePathValue write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShapeContent)) {
            return false;
        }
        ShapeContent shapeContent = (ShapeContent) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) shapeContent.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) shapeContent.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        AnimatablePathValue animatablePathValue = this.write;
        if (animatablePathValue != null) {
            i = animatablePathValue.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CustomerOccupationInfoRequest(applicationUuid=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", customerOccupationInfo=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public ShapeContent(String str, AnimatablePathValue animatablePathValue) {
        onGetStartedClick.write((Object) str, "applicationUuid");
        onGetStartedClick.write((Object) animatablePathValue, "customerOccupationInfo");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = animatablePathValue;
    }
}
