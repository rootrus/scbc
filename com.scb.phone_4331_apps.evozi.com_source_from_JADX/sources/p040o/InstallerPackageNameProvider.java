package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.InstallerPackageNameProvider */
public final class InstallerPackageNameProvider extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<InstallerPackageNameProvider> CREATOR = new Parcelable.Creator<InstallerPackageNameProvider>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new InstallerPackageNameProvider(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new InstallerPackageNameProvider[i];
        }
    };
    public List<InstallIdProvider> IconCompatParcelizer;
    public List<InstallIdProvider> MediaBrowserCompat$CustomActionResultReceiver;
    public List<InstallIdProvider> MediaBrowserCompat$ItemReceiver;
    public List<InstallIdProvider> read;

    public final int describeContents() {
        return 0;
    }

    public InstallerPackageNameProvider() {
    }

    protected InstallerPackageNameProvider(Parcel parcel) {
        this.read = parcel.createTypedArrayList(InstallIdProvider.CREATOR);
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.createTypedArrayList(InstallIdProvider.CREATOR);
        this.IconCompatParcelizer = parcel.createTypedArrayList(InstallIdProvider.CREATOR);
        this.MediaBrowserCompat$ItemReceiver = parcel.createTypedArrayList(InstallIdProvider.CREATOR);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.read);
        parcel.writeTypedList(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeTypedList(this.IconCompatParcelizer);
        parcel.writeTypedList(this.MediaBrowserCompat$ItemReceiver);
    }

    public static InstallerPackageNameProvider MediaBrowserCompat$ItemReceiver() {
        return new InstallerPackageNameProvider();
    }
}
