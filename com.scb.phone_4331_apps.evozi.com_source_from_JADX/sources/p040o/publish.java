package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.publish */
public class publish implements Parcelable {
    public static final Parcelable.Creator<publish> CREATOR = new Parcelable.Creator<publish>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new publish(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new publish[i];
        }
    };
    public double IconCompatParcelizer;
    public double MediaBrowserCompat$CustomActionResultReceiver;
    public double read;
    public double write;

    public int describeContents() {
        return 0;
    }

    public publish(double d, double d2, double d3, double d4) {
        this.IconCompatParcelizer = d;
        this.MediaBrowserCompat$CustomActionResultReceiver = d2;
        this.write = d3;
        this.read = d4;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.IconCompatParcelizer);
        parcel.writeDouble(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeDouble(this.write);
        parcel.writeDouble(this.read);
    }

    protected publish(Parcel parcel) {
        this.IconCompatParcelizer = parcel.readDouble();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readDouble();
        this.write = parcel.readDouble();
        this.read = parcel.readDouble();
    }

    public publish(AnalyticsConnectorReceiver analyticsConnectorReceiver) {
        this(analyticsConnectorReceiver.read.doubleValue(), analyticsConnectorReceiver.IconCompatParcelizer.doubleValue(), analyticsConnectorReceiver.MediaBrowserCompat$CustomActionResultReceiver.doubleValue(), analyticsConnectorReceiver.MediaBrowserCompat$ItemReceiver.doubleValue());
    }
}
