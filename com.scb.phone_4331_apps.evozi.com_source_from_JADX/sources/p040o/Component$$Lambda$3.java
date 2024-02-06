package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.Component$$Lambda$3 */
public final class Component$$Lambda$3 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C3185xbf6aef20();
    public double IconCompatParcelizer;
    public double MediaBrowserCompat$CustomActionResultReceiver;
    public double read;
    public double write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Component$$Lambda$3)) {
            return false;
        }
        Component$$Lambda$3 component$$Lambda$3 = (Component$$Lambda$3) obj;
        return Double.compare(this.read, component$$Lambda$3.read) == 0 && Double.compare(this.IconCompatParcelizer, component$$Lambda$3.IconCompatParcelizer) == 0 && Double.compare(this.write, component$$Lambda$3.write) == 0 && Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, component$$Lambda$3.MediaBrowserCompat$CustomActionResultReceiver) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.read);
        long doubleToLongBits2 = Double.doubleToLongBits(this.IconCompatParcelizer);
        int i = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = Double.doubleToLongBits(this.write);
        long doubleToLongBits4 = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
        return (((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + i) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("QuantityDisplay(minAmount=");
        sb.append(this.read);
        sb.append(", maxAmount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", stepAmount=");
        sb.append(this.write);
        sb.append(", actualAmount=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeDouble(this.read);
        parcel.writeDouble(this.IconCompatParcelizer);
        parcel.writeDouble(this.write);
        parcel.writeDouble(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public Component$$Lambda$3(double d, double d2, double d3, double d4) {
        this.read = d;
        this.IconCompatParcelizer = d2;
        this.write = d3;
        this.MediaBrowserCompat$CustomActionResultReceiver = d4;
    }
}
