package p040o;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setFilename */
public final class setFilename implements Parcelable {
    public static final setFilename$MediaBrowserCompat$CustomActionResultReceiver CREATOR = new setFilename$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public boolean MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$SearchResultReceiver;
    public int MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public int RatingCompat;
    public boolean read;
    public IconCompatParcelizer write;

    /* renamed from: o.setFilename$IconCompatParcelizer */
    public interface IconCompatParcelizer extends Parcelable {
        void write(Context context);
    }

    public final int describeContents() {
        return 0;
    }

    public setFilename() {
        this.MediaBrowserCompat$ItemReceiver = true;
        this.RatingCompat = -1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public setFilename(Parcel parcel) {
        this();
        onGetStartedClick.write((Object) parcel, "parcel");
        this.MediaDescriptionCompat = parcel.readInt();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.write = (IconCompatParcelizer) parcel.readParcelable(IconCompatParcelizer.class.getClassLoader());
        boolean z = true;
        this.read = parcel.readByte() != 0;
        this.MediaBrowserCompat$ItemReceiver = parcel.readByte() == 0 ? false : z;
        this.RatingCompat = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeInt(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeParcelable(this.write, i);
        parcel.writeByte(this.read ? (byte) 1 : 0);
        parcel.writeByte(this.MediaBrowserCompat$ItemReceiver ? (byte) 1 : 0);
        parcel.writeInt(this.RatingCompat);
    }
}
