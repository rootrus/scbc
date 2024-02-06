package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setInflatedId */
final class setInflatedId implements Parcelable {
    public static final Parcelable.Creator<setInflatedId> CREATOR = new Parcelable.Creator<setInflatedId>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new setInflatedId(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setInflatedId[i];
        }
    };
    setOnInflateListener[] IconCompatParcelizer;
    int MediaBrowserCompat$CustomActionResultReceiver;
    int[] MediaBrowserCompat$ItemReceiver;
    setTitleTextColor[] read;
    int write = -1;

    public final int describeContents() {
        return 0;
    }

    public setInflatedId() {
    }

    public setInflatedId(Parcel parcel) {
        this.IconCompatParcelizer = (setOnInflateListener[]) parcel.createTypedArray(setOnInflateListener.CREATOR);
        this.MediaBrowserCompat$ItemReceiver = parcel.createIntArray();
        this.read = (setTitleTextColor[]) parcel.createTypedArray(setTitleTextColor.CREATOR);
        this.write = parcel.readInt();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.IconCompatParcelizer, i);
        parcel.writeIntArray(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeTypedArray(this.read, i);
        parcel.writeInt(this.write);
        parcel.writeInt(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
