package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getBinaries */
public final class getBinaries implements Parcelable {
    public static final Parcelable.Creator<getBinaries> CREATOR = new Parcelable.Creator<getBinaries>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getBinaries(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getBinaries[i];
        }
    };
    public int IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    private String MediaMetadataCompat;
    public int read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public getBinaries(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2) {
        this.MediaDescriptionCompat = str;
        this.MediaMetadataCompat = str2;
        this.MediaBrowserCompat$MediaItem = str3;
        this.MediaBrowserCompat$SearchResultReceiver = str4;
        this.MediaBrowserCompat$CustomActionResultReceiver = str5;
        this.write = str6;
        this.MediaBrowserCompat$ItemReceiver = str7;
        this.read = i;
        this.IconCompatParcelizer = i2;
    }

    protected getBinaries(Parcel parcel) {
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.write = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.read = parcel.readInt();
        this.IconCompatParcelizer = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeInt(this.read);
        parcel.writeInt(this.IconCompatParcelizer);
    }
}
