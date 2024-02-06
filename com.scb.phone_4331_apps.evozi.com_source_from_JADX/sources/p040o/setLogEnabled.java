package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setLogEnabled */
public final class setLogEnabled {
    @SerializedName("paymentAmount")
    public final Double MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("terminalId")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("orderReference")
    public final String read;
    @SerializedName("merchantId")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setLogEnabled)) {
            return false;
        }
        setLogEnabled setlogenabled = (setLogEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setlogenabled.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setlogenabled.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setlogenabled.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setlogenabled.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        Double d = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (d != null) {
            i = d.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CreditCardFullAmountEntity(merchantId=");
        sb.append(this.write);
        sb.append(", terminalId=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", orderReference=");
        sb.append(this.read);
        sb.append(", paymentAmount=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
