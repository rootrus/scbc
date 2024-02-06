package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.isEmulator */
public final class isEmulator extends BatteryState implements Parcelable {
    public static final Parcelable.Creator<isEmulator> CREATOR = new Parcelable.Creator<isEmulator>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new isEmulator(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new isEmulator[i];
        }
    };
    public String AlertController$RecycleListView;
    private String AppCompatActivity;
    public String Keep;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2875x50fd9e4a;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public List<createInstanceIdFrom> MediaSessionCompat$Token;
    public String ParcelableVolumeInfo;
    public String PlaybackStateCompat;
    public String PlaybackStateCompat$CustomAction;
    public String setHasDecor;

    public final int describeContents() {
        return 0;
    }

    public isEmulator() {
    }

    protected isEmulator(Parcel parcel) {
        super(parcel);
        this.PlaybackStateCompat = parcel.readString();
        this.f2875x50fd9e4a = parcel.readString();
        this.AlertController$RecycleListView = parcel.readString();
        this.setHasDecor = parcel.readString();
        this.Keep = parcel.readString();
        this.AppCompatActivity = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.MediaSessionCompat$Token = parcel.createTypedArrayList(createInstanceIdFrom.CREATOR);
        this.PlaybackStateCompat$CustomAction = parcel.readString();
        this.ParcelableVolumeInfo = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.PlaybackStateCompat);
        parcel.writeString(this.f2875x50fd9e4a);
        parcel.writeString(this.AlertController$RecycleListView);
        parcel.writeString(this.setHasDecor);
        parcel.writeString(this.Keep);
        parcel.writeString(this.AppCompatActivity);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeTypedList(this.MediaSessionCompat$Token);
        parcel.writeString(this.PlaybackStateCompat$CustomAction);
        parcel.writeString(this.ParcelableVolumeInfo);
    }
}
