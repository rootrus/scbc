package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.submitTask */
public final class submitTask extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<submitTask> CREATOR = new Parcelable.Creator<submitTask>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new submitTask(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new submitTask[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public getMappingFileId MediaBrowserCompat$ItemReceiver;
    public String MediaDescriptionCompat = "";
    public String read = "";

    public final int describeContents() {
        return 0;
    }

    public submitTask(String str, String str2, getMappingFileId getmappingfileid) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompat$ItemReceiver = getmappingfileid;
    }

    protected submitTask(Parcel parcel) {
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.read = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = (getMappingFileId) parcel.readParcelable(getMappingFileId.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeParcelable(this.MediaBrowserCompat$ItemReceiver, i);
    }
}
