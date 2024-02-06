package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getArch */
public final class getArch extends makeUninterruptible implements Parcelable {
    public static final Parcelable.Creator<getArch> CREATOR = new Parcelable.Creator<getArch>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getArch(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getArch[i];
        }
    };
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public setOnMyLocationChangeListener MediaDescriptionCompat;

    public final int describeContents() {
        return 0;
    }

    public getArch() {
    }

    protected getArch(Parcel parcel) {
        this.MediaDescriptionCompat = setOnMyLocationChangeListener.read(parcel.readString());
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.read = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.createTypedArrayList(immediateCheckedFuture.CREATOR);
    }

    public static getArch MediaBrowserCompat$CustomActionResultReceiver() {
        return new getArch();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaDescriptionCompat.type);
        parcel.writeString(this.read);
        parcel.writeTypedList(this.MediaBrowserCompat$ItemReceiver);
    }
}
