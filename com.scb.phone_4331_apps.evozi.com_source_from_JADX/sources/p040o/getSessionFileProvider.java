package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getSessionFileProvider */
public abstract class getSessionFileProvider extends remainingCapacity implements Parcelable {
    public boolean AlertController$RecycleListView;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2852x50fd9e4a;
    public String ParcelableVolumeInfo;
    public String PlaybackStateCompat$CustomAction;
    public String setHasDecor;

    public int describeContents() {
        return 0;
    }

    public getSessionFileProvider() {
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.PlaybackStateCompat$CustomAction);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.f2852x50fd9e4a);
        parcel.writeString(this.setHasDecor);
        parcel.writeByte(this.AlertController$RecycleListView ? (byte) 1 : 0);
    }

    protected getSessionFileProvider(Parcel parcel) {
        this.PlaybackStateCompat$CustomAction = parcel.readString();
        this.ParcelableVolumeInfo = parcel.readString();
        this.f2852x50fd9e4a = parcel.readString();
        this.setHasDecor = parcel.readString();
        this.AlertController$RecycleListView = parcel.readByte() != 0;
    }
}
