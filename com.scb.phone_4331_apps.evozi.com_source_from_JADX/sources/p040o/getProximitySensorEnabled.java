package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.getProximitySensorEnabled */
public final class getProximitySensorEnabled extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<getProximitySensorEnabled> CREATOR = new Parcelable.Creator<getProximitySensorEnabled>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getProximitySensorEnabled(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getProximitySensorEnabled[i];
        }
    };
    public List<getLegacySharedPrefs> IconCompatParcelizer;
    public List<getCpuArchitectureInt> MediaBrowserCompat$CustomActionResultReceiver;
    public List<getLegacySharedPrefs> MediaBrowserCompat$ItemReceiver;
    public List<getLegacySharedPrefs> read;

    /* renamed from: o.getProximitySensorEnabled$write */
    public static final class write {
        public List<getCpuArchitectureInt> IconCompatParcelizer;
        public List<getLegacySharedPrefs> MediaBrowserCompat$CustomActionResultReceiver;
        public List<getLegacySharedPrefs> read;
        public List<getLegacySharedPrefs> write;
    }

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ getProximitySensorEnabled(write write2, byte b) {
        this(write2);
    }

    private getProximitySensorEnabled(write write2) {
        this.MediaBrowserCompat$ItemReceiver = write2.MediaBrowserCompat$CustomActionResultReceiver;
        this.IconCompatParcelizer = write2.write;
        this.read = write2.read;
        this.MediaBrowserCompat$CustomActionResultReceiver = write2.IconCompatParcelizer;
    }

    protected getProximitySensorEnabled(Parcel parcel) {
        this.MediaBrowserCompat$ItemReceiver = parcel.createTypedArrayList(getLegacySharedPrefs.CREATOR);
        this.IconCompatParcelizer = parcel.createTypedArrayList(getLegacySharedPrefs.CREATOR);
        this.read = parcel.createTypedArrayList(getLegacySharedPrefs.CREATOR);
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.createTypedArrayList(getCpuArchitectureInt.CREATOR);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeTypedList(this.IconCompatParcelizer);
        parcel.writeTypedList(this.read);
        parcel.writeTypedList(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        getProximitySensorEnabled getproximitysensorenabled = (getProximitySensorEnabled) obj;
        List<getLegacySharedPrefs> list = this.MediaBrowserCompat$ItemReceiver;
        if (list == null ? getproximitysensorenabled.MediaBrowserCompat$ItemReceiver != null : !list.equals(getproximitysensorenabled.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        List<getLegacySharedPrefs> list2 = this.IconCompatParcelizer;
        if (list2 == null ? getproximitysensorenabled.IconCompatParcelizer != null : !list2.equals(getproximitysensorenabled.IconCompatParcelizer)) {
            return false;
        }
        List<getLegacySharedPrefs> list3 = this.read;
        if (list3 == null ? getproximitysensorenabled.read != null : !list3.equals(getproximitysensorenabled.read)) {
            return false;
        }
        List<getCpuArchitectureInt> list4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        List<getCpuArchitectureInt> list5 = getproximitysensorenabled.MediaBrowserCompat$CustomActionResultReceiver;
        if (list4 != null) {
            return list4.equals(list5);
        }
        if (list5 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List<getLegacySharedPrefs> list = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        List<getLegacySharedPrefs> list2 = this.read;
        int hashCode2 = list2 != null ? list2.hashCode() : 0;
        List<getLegacySharedPrefs> list3 = this.IconCompatParcelizer;
        int hashCode3 = list3 != null ? list3.hashCode() : 0;
        List<getCpuArchitectureInt> list4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list4 != null) {
            i = list4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashLandingProductDisplay{loanTrackingDisplays=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append("easycashLandingHeaderDisplays=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", easycashLandingTileDisplays=");
        sb.append(this.read);
        sb.append(", easycashLandingFooterDisplays=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('}');
        return sb.toString();
    }
}
