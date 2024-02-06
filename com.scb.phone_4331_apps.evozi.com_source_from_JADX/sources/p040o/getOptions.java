package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.getOptions */
public final class getOptions implements Parcelable {
    public static final Parcelable.Creator<getOptions> CREATOR = new Parcelable.Creator<getOptions>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getOptions(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getOptions[i];
        }
    };
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public List<getPersistenceKey> MediaBrowserCompat$ItemReceiver;
    public int read;
    public lambda$new$0 write;

    public final int describeContents() {
        return 0;
    }

    public getOptions() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeTypedList(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeParcelable(this.write, i);
    }

    protected getOptions(Parcel parcel) {
        this.read = parcel.readInt();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.createTypedArrayList(getPersistenceKey.CREATOR);
        this.write = (lambda$new$0) parcel.readParcelable(lambda$new$0.class.getClassLoader());
    }
}
