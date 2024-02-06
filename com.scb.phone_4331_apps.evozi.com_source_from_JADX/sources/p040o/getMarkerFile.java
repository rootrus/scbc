package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.getMarkerFile */
public final class getMarkerFile implements Parcelable {
    public static final Parcelable.Creator<getMarkerFile> CREATOR = new Parcelable.Creator<getMarkerFile>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getMarkerFile(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getMarkerFile[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public List<getKeysFileForSession> MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public int f2841x50fd9e4a;
    public int MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String RatingCompat;
    public String read;
    public int write;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ getMarkerFile(IconCompatParcelizer iconCompatParcelizer, byte b) {
        this(iconCompatParcelizer);
    }

    private getMarkerFile(IconCompatParcelizer iconCompatParcelizer) {
        this.read = iconCompatParcelizer.IconCompatParcelizer;
        this.MediaBrowserCompat$MediaItem = iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver;
        this.f2841x50fd9e4a = iconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper;
        this.MediaDescriptionCompat = iconCompatParcelizer.MediaBrowserCompat$MediaItem;
        this.write = iconCompatParcelizer.read;
        this.MediaBrowserCompat$SearchResultReceiver = iconCompatParcelizer.RatingCompat;
        this.MediaMetadataCompat = iconCompatParcelizer.MediaDescriptionCompat;
        this.RatingCompat = iconCompatParcelizer.MediaMetadataCompat;
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        this.IconCompatParcelizer = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer.write;
    }

    protected getMarkerFile(Parcel parcel) {
        this.read = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.f2841x50fd9e4a = parcel.readInt();
        this.MediaDescriptionCompat = parcel.readInt();
        this.write = parcel.readInt();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.createTypedArrayList(getKeysFileForSession.CREATOR);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeInt(this.f2841x50fd9e4a);
        parcel.writeInt(this.MediaDescriptionCompat);
        parcel.writeInt(this.write);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeTypedList(this.MediaBrowserCompat$ItemReceiver);
    }

    public static IconCompatParcelizer write() {
        return new IconCompatParcelizer((byte) 0);
    }

    /* renamed from: o.getMarkerFile$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public int MediaBrowserCompat$MediaItem;
        public String MediaBrowserCompat$SearchResultReceiver;
        public String MediaDescriptionCompat;
        public String MediaMetadataCompat;
        public int MediaSessionCompat$ResultReceiverWrapper;
        public String RatingCompat;
        public int read;
        public List<getKeysFileForSession> write;

        /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        private IconCompatParcelizer() {
        }
    }
}
