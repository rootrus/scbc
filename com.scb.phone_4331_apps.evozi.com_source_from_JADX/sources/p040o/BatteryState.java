package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p040o.CommonUtils;

/* renamed from: o.BatteryState */
public class BatteryState implements Parcelable {
    public static final Parcelable.Creator<BatteryState> CREATOR = new Parcelable.Creator<BatteryState>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new BatteryState(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new BatteryState[i];
        }
    };
    public Integer IconCompatParcelizer;
    public Integer MediaBrowserCompat$CustomActionResultReceiver;
    public Integer MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private String f2685x50fd9e4a;
    public Boolean MediaDescriptionCompat;
    public String MediaMetadataCompat;
    private String MediaSessionCompat$QueueItem;
    private String MediaSessionCompat$ResultReceiverWrapper;
    private String ParcelableVolumeInfo;
    public String RatingCompat;
    public double read;
    public List<CommonUtils.C31811> write;

    public int describeContents() {
        return 0;
    }

    public BatteryState() {
    }

    public BatteryState(Parcel parcel) {
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.read = parcel.readDouble();
        Boolean bool = null;
        if (parcel.readByte() == 0) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver = Integer.valueOf(parcel.readInt());
        }
        this.ParcelableVolumeInfo = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.f2685x50fd9e4a = parcel.readString();
        if (parcel.readByte() == 0) {
            this.MediaBrowserCompat$ItemReceiver = null;
        } else {
            this.MediaBrowserCompat$ItemReceiver = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readByte() == 0) {
            this.IconCompatParcelizer = null;
        } else {
            this.IconCompatParcelizer = Integer.valueOf(parcel.readInt());
        }
        byte readByte = parcel.readByte();
        if (readByte != 0) {
            bool = Boolean.valueOf(readByte != 1 ? false : true);
        }
        this.MediaDescriptionCompat = bool;
        this.write = parcel.createTypedArrayList(CommonUtils.C31811.CREATOR);
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeDouble(this.read);
        int i2 = 0;
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.MediaBrowserCompat$CustomActionResultReceiver.intValue());
        }
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.f2685x50fd9e4a);
        if (this.MediaBrowserCompat$ItemReceiver == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.MediaBrowserCompat$ItemReceiver.intValue());
        }
        if (this.IconCompatParcelizer == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.IconCompatParcelizer.intValue());
        }
        Boolean bool = this.MediaDescriptionCompat;
        if (bool != null && bool.booleanValue()) {
            i2 = 1;
        }
        parcel.writeByte((byte) i2);
        parcel.writeTypedList(this.write);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
    }
}
