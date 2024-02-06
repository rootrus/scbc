package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p040o.CommonUtils;

/* renamed from: o.sha1 */
public final class sha1 implements Parcelable {
    public static final Parcelable.Creator<sha1> CREATOR = new Parcelable.Creator<sha1>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new sha1(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new sha1[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public List<CommonUtils.C31811> MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String RatingCompat;
    public String read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ sha1(IconCompatParcelizer iconCompatParcelizer, byte b) {
        this(iconCompatParcelizer);
    }

    private sha1(IconCompatParcelizer iconCompatParcelizer) {
        this.IconCompatParcelizer = iconCompatParcelizer.write;
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        this.write = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        this.read = iconCompatParcelizer.read;
        this.RatingCompat = iconCompatParcelizer.MediaMetadataCompat;
        this.MediaBrowserCompat$MediaItem = iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver;
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer.IconCompatParcelizer;
    }

    protected sha1(Parcel parcel) {
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.write = parcel.readString();
        this.read = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
    }

    public static IconCompatParcelizer read() {
        return new IconCompatParcelizer((byte) 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.write);
        parcel.writeString(this.read);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
    }

    /* renamed from: o.sha1$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public List<CommonUtils.C31811> IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String MediaBrowserCompat$SearchResultReceiver;
        public String MediaMetadataCompat;
        public String read;
        public String write;

        /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        private IconCompatParcelizer() {
        }
    }
}
