package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.writeSessionDevice */
public final class writeSessionDevice extends writeSessionApp implements Parcelable {
    public static final Parcelable.Creator<writeSessionDevice> CREATOR = new Parcelable.Creator<writeSessionDevice>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new writeSessionDevice(parcel, (byte) 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new writeSessionDevice[i];
        }
    };
    public String MediaBrowserCompat$ItemReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2977x50fd9e4a;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$Token;
    public int ParcelableVolumeInfo;

    public final int describeContents() {
        return 0;
    }

    /* synthetic */ writeSessionDevice(Parcel parcel, byte b) {
        this(parcel);
    }

    public writeSessionDevice() {
    }

    public static writeSessionDevice write() {
        return new writeSessionDevice();
    }

    private writeSessionDevice(Parcel parcel) {
        super(parcel);
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.f2977x50fd9e4a = parcel.readString();
        this.ParcelableVolumeInfo = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.f2977x50fd9e4a);
        parcel.writeInt(this.ParcelableVolumeInfo);
    }
}
