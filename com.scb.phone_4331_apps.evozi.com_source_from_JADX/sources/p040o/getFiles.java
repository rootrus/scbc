package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getFiles */
public final class getFiles extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<getFiles> CREATOR = new Parcelable.Creator<getFiles>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getFiles(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getFiles[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public String read;

    public final int describeContents() {
        return 0;
    }

    public getFiles() {
    }

    public static getFiles MediaBrowserCompat$CustomActionResultReceiver() {
        return new getFiles();
    }

    protected getFiles(Parcel parcel) {
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.read = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
    }
}
