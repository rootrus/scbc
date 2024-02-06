package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.validateInterface */
public final class validateInterface implements Parcelable {
    public static final Parcelable.Creator<validateInterface> CREATOR = new Parcelable.Creator<validateInterface>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new validateInterface(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new validateInterface[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    private int MediaBrowserCompat$MediaItem;
    public String read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public validateInterface(String str, String str2, String str3, String str4, String str5, int i) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.read = str3;
        this.write = str4;
        this.IconCompatParcelizer = str5;
        this.MediaBrowserCompat$MediaItem = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeInt(this.MediaBrowserCompat$MediaItem);
    }

    protected validateInterface(Parcel parcel) {
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.read = parcel.readString();
        this.write = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readInt();
    }
}
