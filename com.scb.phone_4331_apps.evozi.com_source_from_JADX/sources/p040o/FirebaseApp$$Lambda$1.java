package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.FirebaseApp$$Lambda$1 */
public final class FirebaseApp$$Lambda$1 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FirebaseApp$$Lambda$1$MediaBrowserCompat$ItemReceiver();
    public double IconCompatParcelizer;
    public double MediaBrowserCompat$CustomActionResultReceiver;
    public double MediaBrowserCompat$ItemReceiver;

    public FirebaseApp$$Lambda$1() {
        this((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirebaseApp$$Lambda$1)) {
            return false;
        }
        FirebaseApp$$Lambda$1 firebaseApp$$Lambda$1 = (FirebaseApp$$Lambda$1) obj;
        return Double.compare(this.MediaBrowserCompat$ItemReceiver, firebaseApp$$Lambda$1.MediaBrowserCompat$ItemReceiver) == 0 && Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, firebaseApp$$Lambda$1.MediaBrowserCompat$CustomActionResultReceiver) == 0 && Double.compare(this.IconCompatParcelizer, firebaseApp$$Lambda$1.IconCompatParcelizer) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$ItemReceiver);
        long doubleToLongBits2 = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
        int i = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = Double.doubleToLongBits(this.IconCompatParcelizer);
        return (((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + i) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InstPaymentInfoResponseDisplay(totalPayment=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", totalInterest=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", monthlyPayment=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeDouble(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeDouble(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeDouble(this.IconCompatParcelizer);
    }

    public FirebaseApp$$Lambda$1(double d, double d2, double d3) {
        this.MediaBrowserCompat$ItemReceiver = d;
        this.MediaBrowserCompat$CustomActionResultReceiver = d2;
        this.IconCompatParcelizer = d3;
    }

    public /* synthetic */ FirebaseApp$$Lambda$1(byte b) {
        this(0.0d, 0.0d, 0.0d);
    }
}
