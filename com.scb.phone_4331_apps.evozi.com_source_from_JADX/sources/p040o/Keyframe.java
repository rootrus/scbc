package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.Keyframe */
public final class Keyframe {
    @SerializedName("annualFee")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("issuingFee")
    public final String read;
    @SerializedName("deliveryFee")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Keyframe)) {
            return false;
        }
        Keyframe keyframe = (Keyframe) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) keyframe.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) keyframe.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) keyframe.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidCardFeeEntity(annualFee=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", issuingFee=");
        sb.append(this.read);
        sb.append(", deliveryFee=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
