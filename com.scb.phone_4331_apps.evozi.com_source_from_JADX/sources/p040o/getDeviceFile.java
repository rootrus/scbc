package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getDeviceFile */
public final class getDeviceFile extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<getDeviceFile> CREATOR = new Parcelable.Creator<getDeviceFile>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getDeviceFile(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getDeviceFile[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String read;

    public final int describeContents() {
        return 0;
    }

    private getDeviceFile() {
    }

    protected getDeviceFile(Parcel parcel) {
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.read = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
    }

    public static getDeviceFile read() {
        return new getDeviceFile();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.IconCompatParcelizer);
    }
}
