package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.FirebaseAnalytics */
public final class FirebaseAnalytics implements Parcelable {
    public static final Parcelable.Creator<FirebaseAnalytics> CREATOR = new Parcelable.Creator<FirebaseAnalytics>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FirebaseAnalytics(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FirebaseAnalytics[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public double MediaBrowserCompat$ItemReceiver;
    public double MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String RatingCompat;
    public String read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public FirebaseAnalytics() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeDouble(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.write);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.IconCompatParcelizer);
    }

    protected FirebaseAnalytics(Parcel parcel) {
        this.MediaBrowserCompat$ItemReceiver = parcel.readDouble();
        this.MediaBrowserCompat$MediaItem = parcel.readDouble();
        this.RatingCompat = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.write = parcel.readString();
        this.read = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
    }
}
