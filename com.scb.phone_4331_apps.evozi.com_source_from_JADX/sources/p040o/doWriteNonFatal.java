package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.doWriteNonFatal */
public final class doWriteNonFatal implements Parcelable {
    public static final Parcelable.Creator<doWriteNonFatal> CREATOR = new Parcelable.Creator<doWriteNonFatal>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new doWriteNonFatal(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new doWriteNonFatal[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String read;

    public final int describeContents() {
        return 0;
    }

    public doWriteNonFatal(String str, String str2, String str3, String str4) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.read = str3;
        this.IconCompatParcelizer = str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    protected doWriteNonFatal(Parcel parcel) {
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.read = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
    }
}
