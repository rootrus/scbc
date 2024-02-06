package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setExecution */
public final class setExecution extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<setExecution> CREATOR = new Parcelable.Creator<setExecution>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new setExecution(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setExecution[i];
        }
    };
    public String IconCompatParcelizer;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution MediaBrowserCompat$ItemReceiver;
    private int MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public boolean RatingCompat;
    public int read;

    public final int describeContents() {
        return 0;
    }

    public setExecution(int i, String str, String str2, int i2, boolean z) {
        this.MediaDescriptionCompat = i;
        this.MediaMetadataCompat = str;
        this.IconCompatParcelizer = str2;
        this.read = i2;
        this.RatingCompat = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeInt(this.read);
        parcel.writeByte(this.RatingCompat ? (byte) 1 : 0);
        parcel.writeParcelable(this.MediaBrowserCompat$ItemReceiver, i);
        parcel.writeByte(this.MediaBrowserCompat$CustomActionResultReceiver ? (byte) 1 : 0);
    }

    protected setExecution(Parcel parcel) {
        this.MediaDescriptionCompat = parcel.readInt();
        this.MediaMetadataCompat = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.read = parcel.readInt();
        boolean z = true;
        this.RatingCompat = parcel.readByte() != 0;
        this.MediaBrowserCompat$ItemReceiver = (AutoValue_CrashlyticsReport_Session_Event_Application_Execution) parcel.readParcelable(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.class.getClassLoader());
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readByte() == 0 ? false : z;
    }
}
