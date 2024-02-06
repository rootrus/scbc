package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.processSetComponents */
public final class processSetComponents extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<processSetComponents> CREATOR = new Parcelable.Creator<processSetComponents>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new processSetComponents(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new processSetComponents[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public List<String> MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String ParcelableVolumeInfo;
    public String RatingCompat;
    public String read;

    public final int describeContents() {
        return 0;
    }

    public processSetComponents() {
    }

    public static processSetComponents write() {
        return new processSetComponents();
    }

    protected processSetComponents(Parcel parcel) {
        this.read = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.ParcelableVolumeInfo = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.createStringArrayList();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeStringList(this.MediaBrowserCompat$ItemReceiver);
    }
}
