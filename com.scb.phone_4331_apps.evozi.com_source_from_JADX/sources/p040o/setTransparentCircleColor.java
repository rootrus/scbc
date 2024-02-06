package p040o;

import com.google.gson.annotations.SerializedName;
import p039io.beid.beidk.definitions.BeIDParams;

/* renamed from: o.setTransparentCircleColor */
public final class setTransparentCircleColor extends setCurrentItemInternal {
    @SerializedName("transactionId")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("transactionDateTime")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("remainingBalance")
    public final double write;

    public setTransparentCircleColor() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setTransparentCircleColor)) {
            return false;
        }
        setTransparentCircleColor settransparentcirclecolor = (setTransparentCircleColor) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) settransparentcirclecolor.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) settransparentcirclecolor.MediaBrowserCompat$CustomActionResultReceiver) && Double.compare(this.write, settransparentcirclecolor.write) == 0;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        long doubleToLongBits = Double.doubleToLongBits(this.write);
        return (((hashCode * 31) + i) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RemittanceConfirmResponseEntity(transactionDateTime=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", transactionId=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", remainingBalance=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    private /* synthetic */ setTransparentCircleColor(byte b) {
        this("", "", 0.0d);
    }

    private setTransparentCircleColor(String str, String str2, double d) {
        onGetStartedClick.write((Object) str, "transactionDateTime");
        onGetStartedClick.write((Object) str2, BeIDParams.BEID_TRANSACTION_ID);
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.write = 0.0d;
    }
}
