package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.isTerminated */
public class isTerminated implements Parcelable {
    public static final Parcelable.Creator<isTerminated> CREATOR = new Parcelable.Creator<isTerminated>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new isTerminated(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new isTerminated[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public int MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public boolean RatingCompat;
    public String read;
    public String write;

    public int describeContents() {
        return 0;
    }

    public /* synthetic */ isTerminated(write write2, byte b) {
        this(write2);
    }

    protected isTerminated(Parcel parcel) {
        boolean z = false;
        this.RatingCompat = false;
        this.read = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaMetadataCompat = parcel.readInt();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.write = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readInt();
        this.RatingCompat = parcel.readByte() != 0 ? true : z;
    }

    private isTerminated(write write2) {
        this.RatingCompat = false;
        this.MediaBrowserCompat$ItemReceiver = write2.MediaBrowserCompat$CustomActionResultReceiver;
        this.IconCompatParcelizer = write2.MediaBrowserCompat$ItemReceiver;
        this.read = write2.write;
        this.MediaMetadataCompat = write2.MediaBrowserCompat$MediaItem;
        this.MediaBrowserCompat$SearchResultReceiver = write2.read;
        this.MediaBrowserCompat$CustomActionResultReceiver = write2.MediaDescriptionCompat;
        this.MediaSessionCompat$ResultReceiverWrapper = write2.RatingCompat;
        this.MediaDescriptionCompat = write2.MediaMetadataCompat;
        this.write = write2.IconCompatParcelizer;
        this.MediaBrowserCompat$MediaItem = write2.MediaBrowserCompat$SearchResultReceiver;
        this.RatingCompat = false;
    }

    public static write write() {
        return new write((byte) 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeInt(this.MediaMetadataCompat);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.write);
        parcel.writeInt(this.MediaBrowserCompat$MediaItem);
        parcel.writeByte(this.RatingCompat ? (byte) 1 : 0);
    }

    /* renamed from: o.isTerminated$write */
    public static final class write {
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public int MediaBrowserCompat$MediaItem;
        public int MediaBrowserCompat$SearchResultReceiver;
        public String MediaDescriptionCompat;
        public String MediaMetadataCompat;
        public String RatingCompat;
        public String read;
        public String write;

        /* synthetic */ write(byte b) {
            this();
        }

        private write() {
            this.MediaBrowserCompat$SearchResultReceiver = 1;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.MediaBrowserCompat$SearchResultReceiver;
        String str2 = ((isTerminated) obj).MediaBrowserCompat$SearchResultReceiver;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.MediaBrowserCompat$SearchResultReceiver.hashCode() + 527;
    }
}
