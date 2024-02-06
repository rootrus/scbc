package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getEndOpacity */
public final class getEndOpacity {
    @SerializedName("emailOtp")
    public final TransformKeyframeAnimation IconCompatParcelizer;
    @SerializedName("email")
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getEndOpacity)) {
            return false;
        }
        getEndOpacity getendopacity = (getEndOpacity) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getendopacity.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getendopacity.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        TransformKeyframeAnimation transformKeyframeAnimation = this.IconCompatParcelizer;
        if (transformKeyframeAnimation != null) {
            i = transformKeyframeAnimation.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlEmailSetupEntity(email=");
        sb.append(this.read);
        sb.append(", emailOtp=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
