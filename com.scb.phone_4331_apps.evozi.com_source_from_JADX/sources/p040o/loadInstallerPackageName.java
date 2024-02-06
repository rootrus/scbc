package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.loadInstallerPackageName */
public final class loadInstallerPackageName extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<loadInstallerPackageName> CREATOR = new Parcelable.Creator<loadInstallerPackageName>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new loadInstallerPackageName(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new loadInstallerPackageName[i];
        }
    };
    public List<getOsDisplayVersionString> MediaBrowserCompat$ItemReceiver;

    public final int describeContents() {
        return 0;
    }

    public loadInstallerPackageName() {
    }

    protected loadInstallerPackageName(Parcel parcel) {
        this.MediaBrowserCompat$ItemReceiver = parcel.createTypedArrayList(getOsDisplayVersionString.CREATOR);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.MediaBrowserCompat$ItemReceiver);
    }

    public static loadInstallerPackageName IconCompatParcelizer() {
        return new loadInstallerPackageName();
    }
}
