package p040o;

/* renamed from: o.setOnPoiClickListener */
public final class setOnPoiClickListener {
    public final double IconCompatParcelizer;
    public final double MediaBrowserCompat$CustomActionResultReceiver;
    public final double read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setOnPoiClickListener)) {
            return false;
        }
        setOnPoiClickListener setonpoiclicklistener = (setOnPoiClickListener) obj;
        return Double.compare(this.IconCompatParcelizer, setonpoiclicklistener.IconCompatParcelizer) == 0 && Double.compare(this.read, setonpoiclicklistener.read) == 0 && Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, setonpoiclicklistener.MediaBrowserCompat$CustomActionResultReceiver) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.IconCompatParcelizer);
        long doubleToLongBits2 = Double.doubleToLongBits(this.read);
        int i = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
        return (((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + i) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidCardFee(annualFee=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", issuingFee=");
        sb.append(this.read);
        sb.append(", deliveryFee=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public setOnPoiClickListener(double d, double d2, double d3) {
        this.IconCompatParcelizer = d;
        this.read = d2;
        this.MediaBrowserCompat$CustomActionResultReceiver = d3;
    }
}
