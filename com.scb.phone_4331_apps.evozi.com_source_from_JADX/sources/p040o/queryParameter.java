package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.queryParameter */
public final class queryParameter {
    @SerializedName("amount")
    public final double IconCompatParcelizer;
    @SerializedName("label")
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof queryParameter)) {
            return false;
        }
        queryParameter queryparameter = (queryParameter) obj;
        return Double.compare(this.IconCompatParcelizer, queryparameter.IconCompatParcelizer) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) queryparameter.read);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.IconCompatParcelizer);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        String str = this.read;
        return (i * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CardlessATMVerificationProductEntity(amount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", label=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
