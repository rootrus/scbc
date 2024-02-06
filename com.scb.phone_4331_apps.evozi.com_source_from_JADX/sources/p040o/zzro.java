package p040o;

/* renamed from: o.zzro */
public final class zzro {
    public final double IconCompatParcelizer;
    public final double MediaBrowserCompat$CustomActionResultReceiver;
    public final double write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzro)) {
            return false;
        }
        zzro zzro = (zzro) obj;
        return Double.compare(this.IconCompatParcelizer, zzro.IconCompatParcelizer) == 0 && Double.compare(this.write, zzro.write) == 0 && Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, zzro.MediaBrowserCompat$CustomActionResultReceiver) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.IconCompatParcelizer);
        long doubleToLongBits2 = Double.doubleToLongBits(this.write);
        int i = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
        return (((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + i) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LatLng(latitude=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", longitude=");
        sb.append(this.write);
        sb.append(", accuracy=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public zzro(double d, double d2, double d3) {
        this.IconCompatParcelizer = d;
        this.write = d2;
        this.MediaBrowserCompat$CustomActionResultReceiver = d3;
    }
}
