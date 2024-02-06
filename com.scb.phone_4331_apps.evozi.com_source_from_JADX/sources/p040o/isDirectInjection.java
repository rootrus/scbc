package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.isDirectInjection */
public final class isDirectInjection extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<isDirectInjection> CREATOR = new Parcelable.Creator<isDirectInjection>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new isDirectInjection(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new isDirectInjection[i];
        }
    };
    public boolean IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String RatingCompat;
    public String read;

    public final int describeContents() {
        return 0;
    }

    protected isDirectInjection(Parcel parcel) {
        this.MediaMetadataCompat = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.read = parcel.readString();
        this.IconCompatParcelizer = parcel.readInt() != 1 ? false : true;
    }

    public static isDirectInjection MediaBrowserCompat$ItemReceiver() {
        return new isDirectInjection();
    }

    public isDirectInjection() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.read);
        parcel.writeInt(this.IconCompatParcelizer ? 1 : 0);
    }
}
