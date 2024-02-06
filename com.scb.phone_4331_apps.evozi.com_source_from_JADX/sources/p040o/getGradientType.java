package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getGradientType */
public final class getGradientType {
    @SerializedName("merchantId")
    public final String IconCompatParcelizer;
    @SerializedName("orderReference")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("terminalId")
    public final String read;
    @SerializedName("paymentAmount")
    public final Double write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getGradientType)) {
            return false;
        }
        getGradientType getgradienttype = (getGradientType) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getgradienttype.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getgradienttype.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getgradienttype.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getgradienttype.write);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        Double d = this.write;
        if (d != null) {
            i = d.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CreditCardFullAmountEntity(merchantId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", terminalId=");
        sb.append(this.read);
        sb.append(", orderReference=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", paymentAmount=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
