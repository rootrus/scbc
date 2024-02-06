package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.LottieValueCallback */
public final class LottieValueCallback {
    @SerializedName("availableTopupLimitAmount")
    public final Double IconCompatParcelizer;
    @SerializedName("allowTag")
    public final List<String> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("thbEquivalentAmount")
    public final double read;
    @SerializedName("availableConversionLimit")
    public final int write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieValueCallback)) {
            return false;
        }
        LottieValueCallback lottieValueCallback = (LottieValueCallback) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) lottieValueCallback.MediaBrowserCompat$CustomActionResultReceiver) && this.write == lottieValueCallback.write && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) lottieValueCallback.IconCompatParcelizer) && Double.compare(this.read, lottieValueCallback.read) == 0;
    }

    public final int hashCode() {
        List<String> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        int i2 = this.write;
        Double d = this.IconCompatParcelizer;
        if (d != null) {
            i = d.hashCode();
        }
        long doubleToLongBits = Double.doubleToLongBits(this.read);
        return (((((hashCode * 31) + i2) * 31) + i) * 31) + ((int) ((doubleToLongBits >>> 32) ^ doubleToLongBits));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TravelCardEntity(allowTag=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", availableConversionLimit=");
        sb.append(this.write);
        sb.append(", availableTopUpLimitAmount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", thbEquivalentAmount=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
