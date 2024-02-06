package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.GradientColorKeyframeAnimation */
public final class GradientColorKeyframeAnimation {
    @SerializedName("number")
    public final String IconCompatParcelizer;
    @SerializedName("laserCode")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("issueDate")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("expiryDate")
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GradientColorKeyframeAnimation)) {
            return false;
        }
        GradientColorKeyframeAnimation gradientColorKeyframeAnimation = (GradientColorKeyframeAnimation) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) gradientColorKeyframeAnimation.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) gradientColorKeyframeAnimation.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) gradientColorKeyframeAnimation.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) gradientColorKeyframeAnimation.read);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlCitizenIdEntity(number=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", laserCode=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", issueDate=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", expiryDate=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
