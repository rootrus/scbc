package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setUsePercentValues */
public final class setUsePercentValues {
    @SerializedName("limitAmount")
    public final double IconCompatParcelizer;
    @SerializedName("function")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("limitType")
    public final String read;
    @SerializedName("remainingAmount")
    public final double write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setUsePercentValues)) {
            return false;
        }
        setUsePercentValues setusepercentvalues = (setUsePercentValues) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setusepercentvalues.read) && Double.compare(this.write, setusepercentvalues.write) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setusepercentvalues.MediaBrowserCompat$ItemReceiver) && Double.compare(this.IconCompatParcelizer, setusepercentvalues.IconCompatParcelizer) == 0;
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.write);
        int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        long doubleToLongBits2 = Double.doubleToLongBits(this.IconCompatParcelizer);
        return (((((hashCode * 31) + i2) * 31) + i) * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RemainingLimitEntity(limitType=");
        sb.append(this.read);
        sb.append(", remainingAmount=");
        sb.append(this.write);
        sb.append(", function=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", limitAmount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
