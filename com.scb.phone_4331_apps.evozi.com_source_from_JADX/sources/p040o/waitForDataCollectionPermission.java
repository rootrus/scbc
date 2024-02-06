package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.waitForDataCollectionPermission */
public class waitForDataCollectionPermission extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<waitForDataCollectionPermission> CREATOR = new Parcelable.Creator<waitForDataCollectionPermission>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new waitForDataCollectionPermission(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new waitForDataCollectionPermission[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    private int MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String RatingCompat;
    public String read;

    public int describeContents() {
        return 0;
    }

    public waitForDataCollectionPermission() {
    }

    public waitForDataCollectionPermission(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.MediaBrowserCompat$SearchResultReceiver = i;
        this.MediaDescriptionCompat = str;
        this.MediaBrowserCompat$MediaItem = str2;
        this.MediaMetadataCompat = str3;
        this.read = str4;
        this.MediaBrowserCompat$ItemReceiver = str5;
        this.RatingCompat = str6;
        this.IconCompatParcelizer = str7;
        this.MediaBrowserCompat$CustomActionResultReceiver = str8;
    }

    public waitForDataCollectionPermission(Parcel parcel) {
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readInt();
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.read = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
