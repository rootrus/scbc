package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.access$1700 */
public final class access$1700 extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<access$1700> CREATOR = new Parcelable.Creator<access$1700>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new access$1700(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new access$1700[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;

    public final int describeContents() {
        return 0;
    }

    public access$1700() {
    }

    protected access$1700(Parcel parcel) {
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
    }

    public static access$1700 write() {
        return new access$1700();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.IconCompatParcelizer);
    }
}
