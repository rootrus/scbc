package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getCrashlyticsInstallId */
public final class getCrashlyticsInstallId extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<getCrashlyticsInstallId> CREATOR = new Parcelable.Creator<getCrashlyticsInstallId>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getCrashlyticsInstallId(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getCrashlyticsInstallId[i];
        }
    };
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String read;

    public final int describeContents() {
        return 0;
    }

    public getCrashlyticsInstallId() {
    }

    public static getCrashlyticsInstallId MediaBrowserCompat$CustomActionResultReceiver() {
        return new getCrashlyticsInstallId();
    }

    protected getCrashlyticsInstallId(Parcel parcel) {
        this.read = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
