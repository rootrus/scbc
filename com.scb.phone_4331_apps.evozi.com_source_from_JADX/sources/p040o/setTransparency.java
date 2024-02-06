package p040o;

/* renamed from: o.setTransparency */
public final class setTransparency {
    public final double IconCompatParcelizer;
    public final double MediaBrowserCompat$ItemReceiver;
    public final double read;

    public setTransparency() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setTransparency)) {
            return false;
        }
        setTransparency settransparency = (setTransparency) obj;
        return Double.compare(this.read, settransparency.read) == 0 && Double.compare(this.MediaBrowserCompat$ItemReceiver, settransparency.MediaBrowserCompat$ItemReceiver) == 0 && Double.compare(this.IconCompatParcelizer, settransparency.IconCompatParcelizer) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.read);
        long doubleToLongBits2 = Double.doubleToLongBits(this.MediaBrowserCompat$ItemReceiver);
        int i = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = Double.doubleToLongBits(this.IconCompatParcelizer);
        return (((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + i) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DebitCardFee(annualFee=");
        sb.append(this.read);
        sb.append(", issuingFee=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", deliveryFee=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public setTransparency(double d, double d2, double d3) {
        this.read = d;
        this.MediaBrowserCompat$ItemReceiver = d2;
        this.IconCompatParcelizer = d3;
    }

    public /* synthetic */ setTransparency(byte b) {
        this(0.0d, 0.0d, 0.0d);
    }
}
