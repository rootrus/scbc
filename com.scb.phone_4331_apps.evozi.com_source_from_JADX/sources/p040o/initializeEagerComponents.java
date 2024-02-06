package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.initializeEagerComponents */
public final class initializeEagerComponents extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<initializeEagerComponents> CREATOR = new Parcelable.Creator<initializeEagerComponents>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new initializeEagerComponents(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new initializeEagerComponents[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$Token;
    public String RatingCompat;
    public List<String> read;

    public final int describeContents() {
        return 0;
    }

    public initializeEagerComponents() {
    }

    public static initializeEagerComponents IconCompatParcelizer() {
        return new initializeEagerComponents();
    }

    protected initializeEagerComponents(Parcel parcel) {
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.read = parcel.createStringArrayList();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeStringList(this.read);
    }
}
