package p040o;

/* renamed from: o.rotateGesturesEnabled */
public final class rotateGesturesEnabled {
    public final double IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    private final String MediaBrowserCompat$ItemReceiver;
    private final double write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rotateGesturesEnabled)) {
            return false;
        }
        rotateGesturesEnabled rotategesturesenabled = (rotateGesturesEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) rotategesturesenabled.MediaBrowserCompat$CustomActionResultReceiver) && Double.compare(this.IconCompatParcelizer, rotategesturesenabled.IconCompatParcelizer) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) rotategesturesenabled.MediaBrowserCompat$ItemReceiver) && Double.compare(this.write, rotategesturesenabled.write) == 0;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.IconCompatParcelizer);
        int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        long doubleToLongBits2 = Double.doubleToLongBits(this.write);
        return (((((hashCode * 31) + i2) * 31) + i) * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RemainingLimit(limitType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", remainingAmount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", function=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", limitAmount=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public rotateGesturesEnabled(String str, double d, String str2, double d2) {
        onGetStartedClick.write((Object) str, "limitType");
        onGetStartedClick.write((Object) str2, "function");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.IconCompatParcelizer = d;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.write = d2;
    }
}
