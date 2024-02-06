package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.parseFile */
public final class parseFile implements Parcelable {
    public static final Parcelable.Creator<parseFile> CREATOR = new Parcelable.Creator<parseFile>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new parseFile(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new parseFile[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public setIdentifierFromUtf8Bytes read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    protected parseFile(Parcel parcel) {
        this.read = (setIdentifierFromUtf8Bytes) parcel.readParcelable(setIdentifierFromUtf8Bytes.class.getClassLoader());
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.write = parcel.readString();
    }

    public parseFile() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.read, i);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.write);
    }
}
