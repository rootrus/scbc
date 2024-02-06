package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.GradientColor */
public final class GradientColor {
    @SerializedName("mobileNo")
    public final String read;
    @SerializedName("verificationStage")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GradientColor)) {
            return false;
        }
        GradientColor gradientColor = (GradientColor) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) gradientColor.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) gradientColor.read);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlPromptPayVerificationStageEntity(verificationStage=");
        sb.append(this.write);
        sb.append(", mobileNo=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
