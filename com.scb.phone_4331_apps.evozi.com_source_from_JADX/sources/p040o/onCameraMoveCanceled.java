package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.onCameraMoveCanceled */
public final class onCameraMoveCanceled {
    @SerializedName("description")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("rate")
    private final double write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onCameraMoveCanceled)) {
            return false;
        }
        onCameraMoveCanceled oncameramovecanceled = (onCameraMoveCanceled) obj;
        return Double.compare(this.write, oncameramovecanceled.write) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) oncameramovecanceled.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.write);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        return (i * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidTravelWalletDisplayRate(rate=");
        sb.append(this.write);
        sb.append(", description=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public onCameraMoveCanceled(double d, String str) {
        onGetStartedClick.write((Object) str, "description");
        this.write = d;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }
}
