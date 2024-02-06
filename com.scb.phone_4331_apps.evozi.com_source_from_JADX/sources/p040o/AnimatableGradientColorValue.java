package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.AnimatableGradientColorValue */
public final class AnimatableGradientColorValue {
    @SerializedName("deeplink")
    public final String IconCompatParcelizer;
    @SerializedName("backgroundImageUrl")
    public final AnimatableFloatValue MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("reapplyDatetime")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("flag")
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimatableGradientColorValue)) {
            return false;
        }
        AnimatableGradientColorValue animatableGradientColorValue = (AnimatableGradientColorValue) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) animatableGradientColorValue.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) animatableGradientColorValue.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) animatableGradientColorValue.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) animatableGradientColorValue.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        AnimatableFloatValue animatableFloatValue = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = animatableFloatValue != null ? animatableFloatValue.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RejectedEntity(flag=");
        sb.append(this.read);
        sb.append(", imageUrl=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", deeplink=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", reapplyDateTime=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
