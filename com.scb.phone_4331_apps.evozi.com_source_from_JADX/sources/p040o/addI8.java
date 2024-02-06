package p040o;

import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.addI8 */
public class addI8 extends addF32 implements Parcelable {
    public static final Parcelable.Creator<addI8> CREATOR = new Parcelable.Creator<addI8>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new addI8(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new addI8[i];
        }
    };
    private float MediaBrowserCompat$CustomActionResultReceiver;

    public int describeContents() {
        return 0;
    }

    public addI8() {
        this.MediaBrowserCompat$CustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
    }

    public addI8(float f, Object obj) {
        super(f, obj);
        this.MediaBrowserCompat$CustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
        this.MediaBrowserCompat$CustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
    }

    public float MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Entry, x: ");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(" y: ");
        sb.append(this.IconCompatParcelizer);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeFloat(this.IconCompatParcelizer);
        if (read() == null) {
            parcel.writeInt(0);
        } else if (read() instanceof Parcelable) {
            parcel.writeInt(1);
            parcel.writeParcelable((Parcelable) read(), i);
        } else {
            throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
        }
    }

    protected addI8(Parcel parcel) {
        this.MediaBrowserCompat$CustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readFloat();
        this.IconCompatParcelizer = parcel.readFloat();
        if (parcel.readInt() == 1) {
            read(parcel.readParcelable(Object.class.getClassLoader()));
        }
    }
}
