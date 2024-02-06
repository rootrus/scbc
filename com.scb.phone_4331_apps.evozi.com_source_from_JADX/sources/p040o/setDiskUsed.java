package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import com.prolificinteractive.materialcalendarview.CalendarDay;

/* renamed from: o.setDiskUsed */
public final class setDiskUsed extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<setDiskUsed> CREATOR = new Parcelable.Creator<setDiskUsed>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new setDiskUsed(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setDiskUsed[i];
        }
    };
    public CalendarDay IconCompatParcelizer;
    public CalendarDay MediaBrowserCompat$CustomActionResultReceiver;
    public boolean MediaBrowserCompat$ItemReceiver;
    public CalendarDay MediaBrowserCompat$MediaItem;
    public CalendarDay MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2938x50fd9e4a;
    public CalendarDay MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public int MediaSessionCompat$ResultReceiverWrapper;
    public boolean MediaSessionCompat$Token;
    public CalendarDay ParcelableVolumeInfo;
    public int RatingCompat;
    public CalendarDay read;

    public final int describeContents() {
        return 0;
    }

    public setDiskUsed() {
    }

    public static setDiskUsed IconCompatParcelizer() {
        return new setDiskUsed();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.RatingCompat);
        parcel.writeString(this.f2938x50fd9e4a);
        parcel.writeByte(this.MediaSessionCompat$Token ? (byte) 1 : 0);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeInt(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeParcelable(this.MediaBrowserCompat$SearchResultReceiver, i);
        parcel.writeParcelable(this.MediaBrowserCompat$MediaItem, i);
        parcel.writeParcelable(this.IconCompatParcelizer, i);
        parcel.writeParcelable(this.MediaBrowserCompat$CustomActionResultReceiver, i);
        parcel.writeParcelable(this.ParcelableVolumeInfo, i);
        parcel.writeParcelable(this.MediaDescriptionCompat, i);
        parcel.writeParcelable(this.read, i);
        parcel.writeByte(this.MediaBrowserCompat$ItemReceiver ? (byte) 1 : 0);
    }

    protected setDiskUsed(Parcel parcel) {
        this.RatingCompat = parcel.readInt();
        this.f2938x50fd9e4a = parcel.readString();
        boolean z = true;
        this.MediaSessionCompat$Token = parcel.readByte() != 0;
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readInt();
        this.MediaBrowserCompat$SearchResultReceiver = (CalendarDay) parcel.readParcelable(CalendarDay.class.getClassLoader());
        this.MediaBrowserCompat$MediaItem = (CalendarDay) parcel.readParcelable(CalendarDay.class.getClassLoader());
        this.IconCompatParcelizer = (CalendarDay) parcel.readParcelable(CalendarDay.class.getClassLoader());
        this.MediaBrowserCompat$CustomActionResultReceiver = (CalendarDay) parcel.readParcelable(CalendarDay.class.getClassLoader());
        this.ParcelableVolumeInfo = (CalendarDay) parcel.readParcelable(CalendarDay.class.getClassLoader());
        this.MediaDescriptionCompat = (CalendarDay) parcel.readParcelable(CalendarDay.class.getClassLoader());
        this.read = (CalendarDay) parcel.readParcelable(CalendarDay.class.getClassLoader());
        this.MediaBrowserCompat$ItemReceiver = parcel.readByte() == 0 ? false : z;
    }
}
