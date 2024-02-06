package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.isDotDot */
public final class isDotDot {
    @SerializedName("totalInterest")
    public final Double IconCompatParcelizer;
    @SerializedName("monthlyPayment")
    public final Double read;
    @SerializedName("totalPayment")
    public final Double write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isDotDot)) {
            return false;
        }
        isDotDot isdotdot = (isDotDot) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) isdotdot.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) isdotdot.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) isdotdot.read);
    }

    public final int hashCode() {
        Double d = this.write;
        int i = 0;
        int hashCode = d != null ? d.hashCode() : 0;
        Double d2 = this.IconCompatParcelizer;
        int hashCode2 = d2 != null ? d2.hashCode() : 0;
        Double d3 = this.read;
        if (d3 != null) {
            i = d3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InstPaymentInfoResponseEntity(totalPayment=");
        sb.append(this.write);
        sb.append(", totalInterest=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", monthlyPayment=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
