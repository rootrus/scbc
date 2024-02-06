package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.MetaDataStore */
public final class MetaDataStore extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<MetaDataStore> CREATOR = new Parcelable.Creator<MetaDataStore>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new MetaDataStore(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new MetaDataStore[i];
        }
    };
    public isBuildIdValid IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    private String MediaBrowserCompat$MediaItem;
    public String read;

    /* renamed from: o.MetaDataStore$read */
    public static final class read {
        public String IconCompatParcelizer;
        public isBuildIdValid MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String read;
        public String write;
    }

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ MetaDataStore(read read2, byte b) {
        this(read2);
    }

    private MetaDataStore(read read2) {
        this.MediaBrowserCompat$ItemReceiver = read2.IconCompatParcelizer;
        this.MediaBrowserCompat$MediaItem = read2.read;
        this.read = read2.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = read2.write;
        this.IconCompatParcelizer = read2.MediaBrowserCompat$CustomActionResultReceiver;
    }

    protected MetaDataStore(Parcel parcel) {
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.read = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.IconCompatParcelizer = (isBuildIdValid) parcel.readParcelable(isBuildIdValid.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeParcelable(this.IconCompatParcelizer, i);
    }
}
