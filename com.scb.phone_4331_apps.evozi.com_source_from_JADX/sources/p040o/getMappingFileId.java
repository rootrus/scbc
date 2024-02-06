package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getMappingFileId */
public class getMappingFileId extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<getMappingFileId> CREATOR = new Parcelable.Creator<getMappingFileId>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getMappingFileId(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getMappingFileId[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$MediaItem;
    public String MediaDescriptionCompat;
    public int read;

    /* renamed from: o.getMappingFileId$write */
    public static class write<T extends write<T>> {
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaDescriptionCompat;
        public int read;
        public String write;
    }

    public int describeContents() {
        return 0;
    }

    protected getMappingFileId(write<?> write2) {
        this.MediaDescriptionCompat = write2.MediaDescriptionCompat;
        this.MediaBrowserCompat$MediaItem = write2.MediaBrowserCompat$CustomActionResultReceiver;
        this.IconCompatParcelizer = write2.write;
        this.read = write2.read;
    }

    protected getMappingFileId(Parcel parcel) {
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.read = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeInt(this.read);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        getMappingFileId getmappingfileid = (getMappingFileId) obj;
        if (this.read == getmappingfileid.read && this.MediaDescriptionCompat.equals(getmappingfileid.MediaDescriptionCompat) && this.MediaBrowserCompat$MediaItem.equals(getmappingfileid.MediaBrowserCompat$MediaItem)) {
            return this.IconCompatParcelizer.equals(getmappingfileid.IconCompatParcelizer);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.MediaDescriptionCompat.hashCode();
        return (((((hashCode * 31) + this.MediaBrowserCompat$MediaItem.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.read;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashLandingItemDisplay{productType='");
        sb.append(this.MediaDescriptionCompat);
        sb.append('\'');
        sb.append(", name='");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append('\'');
        sb.append(", minimumAmount='");
        sb.append(this.IconCompatParcelizer);
        sb.append('\'');
        sb.append(", landingType=");
        sb.append(this.read);
        sb.append('}');
        return sb.toString();
    }
}
