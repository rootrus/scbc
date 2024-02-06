package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.LottieRelativePointValueCallback */
public final class LottieRelativePointValueCallback {
    @SerializedName("description")
    public final String read;
    @SerializedName("rate")
    public final double write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieRelativePointValueCallback)) {
            return false;
        }
        LottieRelativePointValueCallback lottieRelativePointValueCallback = (LottieRelativePointValueCallback) obj;
        return Double.compare(this.write, lottieRelativePointValueCallback.write) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) lottieRelativePointValueCallback.read);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.write);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        String str = this.read;
        return (i * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidTravelWalletDisplayRateEntity(rate=");
        sb.append(this.write);
        sb.append(", description=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
