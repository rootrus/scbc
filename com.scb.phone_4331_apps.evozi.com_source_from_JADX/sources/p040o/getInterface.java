package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.getInterface */
public final class getInterface extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<getInterface> CREATOR = new Parcelable.Creator<getInterface>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getInterface(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getInterface[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public List<isDirectInjection> RatingCompat;
    public String read;

    public final int describeContents() {
        return 0;
    }

    public getInterface() {
    }

    protected getInterface(Parcel parcel) {
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.read = parcel.readString();
        this.RatingCompat = parcel.createTypedArrayList(isDirectInjection.CREATOR);
    }

    public static getInterface MediaBrowserCompat$CustomActionResultReceiver() {
        return new getInterface();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.read);
        parcel.writeTypedList(this.RatingCompat);
    }
}
