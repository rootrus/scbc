package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.access$2600 */
public final class access$2600 extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<access$2600> CREATOR = new Parcelable.Creator<access$2600>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new access$2600(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new access$2600[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String RatingCompat;
    public String read;

    public final int describeContents() {
        return 0;
    }

    public access$2600() {
    }

    protected access$2600(Parcel parcel) {
        this.RatingCompat = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.read = parcel.readString();
    }

    public static access$2600 IconCompatParcelizer() {
        return new access$2600();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.read);
    }
}
