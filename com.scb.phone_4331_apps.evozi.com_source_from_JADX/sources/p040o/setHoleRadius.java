package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setHoleRadius */
public final class setHoleRadius {
    @SerializedName("tranDateTime")
    public final String IconCompatParcelizer;
    @SerializedName("rate")
    public final double MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("description")
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setHoleRadius)) {
            return false;
        }
        setHoleRadius setholeradius = (setHoleRadius) obj;
        return Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, setholeradius.MediaBrowserCompat$CustomActionResultReceiver) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setholeradius.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setholeradius.IconCompatParcelizer);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        String str = this.read;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return (((i * 31) + hashCode) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FxRateEntity(rate=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", description=");
        sb.append(this.read);
        sb.append(", tranDateTime=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
