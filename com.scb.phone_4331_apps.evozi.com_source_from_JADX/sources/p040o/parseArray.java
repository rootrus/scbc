package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.parseArray */
public class parseArray implements Parcelable {
    public static final Parcelable.Creator<parseArray> CREATOR = new Parcelable.Creator<parseArray>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new parseArray(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new parseArray[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    private String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String MediaMetadataCompat;
    public String RatingCompat;
    public String read;
    public String write;

    public int describeContents() {
        return 0;
    }

    public /* synthetic */ parseArray(parseArray$MediaBrowserCompat$CustomActionResultReceiver parsearray_mediabrowsercompat_customactionresultreceiver, byte b) {
        this(parsearray_mediabrowsercompat_customactionresultreceiver);
    }

    private parseArray(parseArray$MediaBrowserCompat$CustomActionResultReceiver parsearray_mediabrowsercompat_customactionresultreceiver) {
        this.read = parsearray_mediabrowsercompat_customactionresultreceiver.write;
        this.write = parsearray_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
        this.RatingCompat = parsearray_mediabrowsercompat_customactionresultreceiver.RatingCompat;
        this.MediaMetadataCompat = parsearray_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$MediaItem;
        this.MediaBrowserCompat$ItemReceiver = parsearray_mediabrowsercompat_customactionresultreceiver.read;
        this.MediaBrowserCompat$SearchResultReceiver = parsearray_mediabrowsercompat_customactionresultreceiver.MediaMetadataCompat;
        this.MediaBrowserCompat$CustomActionResultReceiver = parsearray_mediabrowsercompat_customactionresultreceiver.MediaDescriptionCompat;
        this.IconCompatParcelizer = parsearray_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$MediaItem = parsearray_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
    }

    public static parseArray$MediaBrowserCompat$CustomActionResultReceiver write() {
        return new parseArray$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.read);
        parcel.writeString(this.write);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
    }

    protected parseArray(Parcel parcel) {
        this.read = parcel.readString();
        this.write = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
    }
}
