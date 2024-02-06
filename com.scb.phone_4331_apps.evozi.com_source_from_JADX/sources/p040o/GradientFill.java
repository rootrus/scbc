package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.GradientFill */
public final class GradientFill {
    @SerializedName("ref2")
    public final String IconCompatParcelizer;
    @SerializedName("ref3")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("paymentAmount")
    public final Double MediaBrowserCompat$ItemReceiver;
    @SerializedName("ref1")
    public final String read;
    @SerializedName("accountTo")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GradientFill)) {
            return false;
        }
        GradientFill gradientFill = (GradientFill) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) gradientFill.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) gradientFill.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) gradientFill.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) gradientFill.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) gradientFill.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        Double d = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = d != null ? d.hashCode() : 0;
        String str = this.write;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BillPaymentEntity(paymentAmount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", accountTo=");
        sb.append(this.write);
        sb.append(", ref1=");
        sb.append(this.read);
        sb.append(", ref2=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", ref3=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
