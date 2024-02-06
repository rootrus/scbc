package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.migrateLegacyId */
public final class migrateLegacyId extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<migrateLegacyId> CREATOR = new Parcelable.Creator<migrateLegacyId>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new migrateLegacyId(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new migrateLegacyId[i];
        }
    };
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String read;

    public final int describeContents() {
        return 0;
    }

    public migrateLegacyId() {
    }

    protected migrateLegacyId(Parcel parcel) {
        this.read = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public static migrateLegacyId IconCompatParcelizer() {
        return new migrateLegacyId();
    }
}
