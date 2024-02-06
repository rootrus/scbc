package p040o;

/* renamed from: o.readUserData */
public final class readUserData {
    public final double IconCompatParcelizer;
    public final double MediaBrowserCompat$CustomActionResultReceiver;
    public final double MediaBrowserCompat$ItemReceiver;
    public final boolean read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof readUserData)) {
            return false;
        }
        readUserData readuserdata = (readUserData) obj;
        return this.read == readuserdata.read && Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, readuserdata.MediaBrowserCompat$CustomActionResultReceiver) == 0 && Double.compare(this.IconCompatParcelizer, readuserdata.IconCompatParcelizer) == 0 && Double.compare(this.MediaBrowserCompat$ItemReceiver, readuserdata.MediaBrowserCompat$ItemReceiver) == 0;
    }

    public final int hashCode() {
        boolean z = this.read;
        if (z) {
            z = true;
        }
        long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
        long doubleToLongBits2 = Double.doubleToLongBits(this.IconCompatParcelizer);
        int i = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = Double.doubleToLongBits(this.MediaBrowserCompat$ItemReceiver);
        return ((((((z ? 1 : 0) * true) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + i) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CreditLimitDisplay(showCreditLimit=");
        sb.append(this.read);
        sb.append(", minCreditLimit=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", maxCreditLimit=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", delta=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    private readUserData(boolean z, double d, double d2, double d3) {
        this.read = z;
        this.MediaBrowserCompat$CustomActionResultReceiver = d;
        this.IconCompatParcelizer = d2;
        this.MediaBrowserCompat$ItemReceiver = 10000.0d;
    }

    public /* synthetic */ readUserData(boolean z, double d, double d2) {
        this(z, d, d2, 10000.0d);
    }
}
