package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.writeSessionApp */
public abstract class writeSessionApp extends remainingCapacity implements Parcelable {
    public String IconCompatParcelizer;
    public read MediaBrowserCompat$CustomActionResultReceiver = read.NO_ANNOTATION;
    public boolean MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public long MediaMetadataCompat;
    public int RatingCompat;
    public String read;

    /* renamed from: o.writeSessionApp$read */
    public enum read {
        NO_ANNOTATION(0),
        HAVE_ANNOTATION(1);
        
        /* access modifiers changed from: private */
        public int type;

        private read(int i) {
            this.type = i;
        }

        public static read MediaBrowserCompat$ItemReceiver(int i) {
            for (read read : values()) {
                if (read.type == i) {
                    return read;
                }
            }
            return NO_ANNOTATION;
        }
    }

    protected writeSessionApp() {
    }

    protected writeSessionApp(Parcel parcel) {
        this.MediaMetadataCompat = parcel.readLong();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.read = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readByte() != 0;
        this.RatingCompat = parcel.readInt();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = read.MediaBrowserCompat$ItemReceiver(parcel.readInt());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.MediaMetadataCompat);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeByte(this.MediaBrowserCompat$MediaItem ? (byte) 1 : 0);
        parcel.writeInt(this.RatingCompat);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeInt(this.MediaBrowserCompat$CustomActionResultReceiver.type);
    }
}
