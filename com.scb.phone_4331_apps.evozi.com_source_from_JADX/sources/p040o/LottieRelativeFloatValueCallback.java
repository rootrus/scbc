package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.LottieRelativeFloatValueCallback */
public final class LottieRelativeFloatValueCallback extends setCurrentItemInternal {
    @SerializedName("buyRate")
    public final LottieRelativePointValueCallback IconCompatParcelizer;
    @SerializedName("sellRate")
    public final LottieRelativePointValueCallback write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieRelativeFloatValueCallback)) {
            return false;
        }
        LottieRelativeFloatValueCallback lottieRelativeFloatValueCallback = (LottieRelativeFloatValueCallback) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) lottieRelativeFloatValueCallback.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) lottieRelativeFloatValueCallback.write);
    }

    public final int hashCode() {
        LottieRelativePointValueCallback lottieRelativePointValueCallback = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = lottieRelativePointValueCallback != null ? lottieRelativePointValueCallback.hashCode() : 0;
        LottieRelativePointValueCallback lottieRelativePointValueCallback2 = this.write;
        if (lottieRelativePointValueCallback2 != null) {
            i = lottieRelativePointValueCallback2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidTravelWalletDisplayRateSummaryEntity(buyRate=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", sellRate=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
