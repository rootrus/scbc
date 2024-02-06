package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getExecutor */
public final class getExecutor implements Parcelable {
    public static final Parcelable.Creator<getExecutor> CREATOR = new Parcelable.Creator<getExecutor>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getExecutor(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getExecutor[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    private String MediaSessionCompat$ResultReceiverWrapper;
    public String RatingCompat;
    public String read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public getExecutor() {
    }

    protected getExecutor(Parcel parcel) {
        this.MediaMetadataCompat = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.read = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.write = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
    }
}
