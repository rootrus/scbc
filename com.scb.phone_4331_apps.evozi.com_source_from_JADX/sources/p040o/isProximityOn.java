package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.isProximityOn */
public final class isProximityOn implements Parcelable {
    public static final Parcelable.Creator<isProximityOn> CREATOR = new Parcelable.Creator<isProximityOn>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new isProximityOn(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new isProximityOn[i];
        }
    };
    public List<String> IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public boolean MediaMetadataCompat;
    public String read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ isProximityOn(read read2, byte b) {
        this(read2);
    }

    private isProximityOn(read read2) {
        this.MediaMetadataCompat = read2.MediaBrowserCompat$SearchResultReceiver;
        this.write = read2.write;
        this.read = read2.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = read2.read;
        this.MediaBrowserCompat$ItemReceiver = read2.IconCompatParcelizer;
        this.IconCompatParcelizer = read2.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public static read read() {
        return new read((byte) 0);
    }

    /* renamed from: o.isProximityOn$read */
    public static final class read {
        public String IconCompatParcelizer;
        public List<String> MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public boolean MediaBrowserCompat$SearchResultReceiver;
        public String read;
        public String write;

        /* synthetic */ read(byte b) {
            this();
        }

        private read() {
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.MediaMetadataCompat ? (byte) 1 : 0);
        parcel.writeString(this.write);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeStringList(this.IconCompatParcelizer);
    }

    protected isProximityOn(Parcel parcel) {
        this.MediaMetadataCompat = parcel.readByte() != 0;
        this.write = parcel.readString();
        this.read = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.createStringArrayList();
    }
}
