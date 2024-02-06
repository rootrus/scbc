package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.onStartCommand */
public final class onStartCommand {
    @SerializedName("totalInterest")
    public Double MediaBrowserCompat$ItemReceiver;
    @SerializedName("totalPayment")
    public Double read;
    @SerializedName("monthlyPayment")
    public Double write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onStartCommand)) {
            return false;
        }
        onStartCommand onstartcommand = (onStartCommand) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) onstartcommand.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) onstartcommand.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) onstartcommand.write);
    }

    public final int hashCode() {
        Double d = this.read;
        int i = 0;
        int hashCode = d != null ? d.hashCode() : 0;
        Double d2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = d2 != null ? d2.hashCode() : 0;
        Double d3 = this.write;
        if (d3 != null) {
            i = d3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InstPaymentInfoResponse(totalPayment=");
        sb.append(this.read);
        sb.append(", totalInterest=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", monthlyPayment=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public onStartCommand(Double d, Double d2, Double d3) {
        this.read = d;
        this.MediaBrowserCompat$ItemReceiver = d2;
        this.write = d3;
    }
}
