package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getInstallerPackageName */
public final class getInstallerPackageName extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<getInstallerPackageName> CREATOR = new Parcelable.Creator<getInstallerPackageName>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getInstallerPackageName(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getInstallerPackageName[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String RatingCompat;
    public String read;

    public final int describeContents() {
        return 0;
    }

    public getInstallerPackageName() {
    }

    protected getInstallerPackageName(Parcel parcel) {
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.read = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.read);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
