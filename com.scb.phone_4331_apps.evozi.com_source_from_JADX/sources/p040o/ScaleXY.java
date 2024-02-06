package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.ScaleXY */
public final class ScaleXY extends setCurrentItemInternal {
    @SerializedName("card")
    public final LottieValueCallback MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("wallet")
    public final List<LottieRelativeIntegerValueCallback> MediaBrowserCompat$ItemReceiver;
    @SerializedName("cardRefNo")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScaleXY)) {
            return false;
        }
        ScaleXY scaleXY = (ScaleXY) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) scaleXY.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) scaleXY.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) scaleXY.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        LottieValueCallback lottieValueCallback = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = lottieValueCallback != null ? lottieValueCallback.hashCode() : 0;
        List<LottieRelativeIntegerValueCallback> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TravelWalletSummaryEntity(cardRefNo=");
        sb.append(this.write);
        sb.append(", card=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", wallet=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
