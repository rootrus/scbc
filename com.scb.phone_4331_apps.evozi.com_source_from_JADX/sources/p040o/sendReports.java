package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.sendReports */
public final class sendReports extends remainingCapacity implements Parcelable {
    public static final sendReports$MediaBrowserCompat$ItemReceiver CREATOR = new sendReports$MediaBrowserCompat$ItemReceiver((byte) 0);
    public final int IconCompatParcelizer;
    public final boolean MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final int MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final int MediaSessionCompat$ResultReceiverWrapper;
    public final String RatingCompat;
    public final String read;

    public final int describeContents() {
        return 0;
    }

    public sendReports(String str, String str2, int i, String str3, String str4, int i2, String str5, int i3, boolean z, String str6) {
        this.MediaBrowserCompat$SearchResultReceiver = str;
        this.MediaDescriptionCompat = str2;
        this.IconCompatParcelizer = i;
        this.MediaMetadataCompat = str3;
        this.RatingCompat = str4;
        this.MediaBrowserCompat$MediaItem = i2;
        this.MediaBrowserCompat$ItemReceiver = str5;
        this.MediaSessionCompat$ResultReceiverWrapper = i3;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
        this.read = str6;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public sendReports(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readByte() != 0, parcel.readString());
        onGetStartedClick.write((Object) parcel, "parcel");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeInt(this.IconCompatParcelizer);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.RatingCompat);
        parcel.writeInt(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeInt(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeByte(this.MediaBrowserCompat$CustomActionResultReceiver ? (byte) 1 : 0);
        parcel.writeString(this.read);
    }
}
