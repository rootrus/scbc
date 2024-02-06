package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.writeSessionOs  reason: case insensitive filesystem */
public final class C10872writeSessionOs extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<C10872writeSessionOs> CREATOR = new Parcelable.Creator<C10872writeSessionOs>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C10872writeSessionOs(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C10872writeSessionOs[i];
        }
    };
    public boolean IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public String RatingCompat;
    public String read;

    public final int describeContents() {
        return 0;
    }

    public C10872writeSessionOs() {
    }

    protected C10872writeSessionOs(Parcel parcel) {
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.read = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        boolean z = true;
        this.MediaMetadataCompat = parcel.readByte() != 0;
        this.RatingCompat = parcel.readString();
        this.IconCompatParcelizer = parcel.readByte() == 0 ? false : z;
    }

    public static C10872writeSessionOs MediaBrowserCompat$ItemReceiver() {
        return new C10872writeSessionOs();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeByte(this.MediaMetadataCompat ? (byte) 1 : 0);
        parcel.writeString(this.RatingCompat);
        parcel.writeByte(this.IconCompatParcelizer ? (byte) 1 : 0);
    }
}
