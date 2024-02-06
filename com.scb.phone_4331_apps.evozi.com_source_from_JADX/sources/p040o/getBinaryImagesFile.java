package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.getBinaryImagesFile */
public final class getBinaryImagesFile implements Parcelable {
    public static final Parcelable.Creator<getBinaryImagesFile> CREATOR = new Parcelable.Creator<getBinaryImagesFile>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getBinaryImagesFile(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getBinaryImagesFile[i];
        }
    };
    public String IconCompatParcelizer;
    public getMinidumpFile MediaBrowserCompat$CustomActionResultReceiver;
    public Onboarding MediaBrowserCompat$ItemReceiver;
    public getMinidumpFile MediaBrowserCompat$MediaItem;
    public int MediaBrowserCompat$SearchResultReceiver;
    public buildAppRequest MediaDescriptionCompat;
    public getMinidumpFile MediaMetadataCompat;
    public int RatingCompat;
    public List<String> read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public getBinaryImagesFile() {
    }

    protected getBinaryImagesFile(Parcel parcel) {
        this.MediaDescriptionCompat = buildAppRequest.MediaBrowserCompat$CustomActionResultReceiver(parcel.readString());
        this.RatingCompat = parcel.readInt();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readInt();
        this.IconCompatParcelizer = parcel.readString();
        this.write = parcel.readString();
        this.MediaMetadataCompat = (getMinidumpFile) parcel.readParcelable(getMinidumpFile.class.getClassLoader());
        this.MediaBrowserCompat$CustomActionResultReceiver = (getMinidumpFile) parcel.readParcelable(getMinidumpFile.class.getClassLoader());
        this.MediaBrowserCompat$MediaItem = (getMinidumpFile) parcel.readParcelable(getMinidumpFile.class.getClassLoader());
        this.read = parcel.createStringArrayList();
        this.MediaBrowserCompat$ItemReceiver = (Onboarding) parcel.readParcelable(Onboarding.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaDescriptionCompat.status);
        parcel.writeInt(this.RatingCompat);
        parcel.writeInt(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.write);
        parcel.writeParcelable(this.MediaMetadataCompat, i);
        parcel.writeParcelable(this.MediaBrowserCompat$CustomActionResultReceiver, i);
        parcel.writeParcelable(this.MediaBrowserCompat$MediaItem, i);
        parcel.writeStringList(this.read);
        parcel.writeParcelable(this.MediaBrowserCompat$ItemReceiver, i);
    }

    public static getBinaryImagesFile write() {
        return new getBinaryImagesFile();
    }
}
