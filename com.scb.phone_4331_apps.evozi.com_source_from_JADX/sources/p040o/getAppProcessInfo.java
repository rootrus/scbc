package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.getAppProcessInfo */
public final class getAppProcessInfo extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<getAppProcessInfo> CREATOR = new Parcelable.Creator<getAppProcessInfo>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getAppProcessInfo(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getAppProcessInfo[i];
        }
    };
    public String IconCompatParcelizer;
    public List<getCpuArchitectureInt> MediaBrowserCompat$CustomActionResultReceiver;
    public String read;

    /* renamed from: o.getAppProcessInfo$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public List<getCpuArchitectureInt> write;
    }

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ getAppProcessInfo(IconCompatParcelizer iconCompatParcelizer, byte b) {
        this(iconCompatParcelizer);
    }

    private getAppProcessInfo(IconCompatParcelizer iconCompatParcelizer) {
        this.read = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        this.IconCompatParcelizer = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer.write;
    }

    protected getAppProcessInfo(Parcel parcel) {
        this.read = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.createTypedArrayList(getCpuArchitectureInt.CREATOR);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.read);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeTypedList(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        getAppProcessInfo getappprocessinfo = (getAppProcessInfo) obj;
        String str = this.read;
        if (str == null ? getappprocessinfo.read != null : !str.equals(getappprocessinfo.read)) {
            return false;
        }
        String str2 = this.IconCompatParcelizer;
        if (str2 == null ? getappprocessinfo.IconCompatParcelizer != null : !str2.equals(getappprocessinfo.IconCompatParcelizer)) {
            return false;
        }
        List<getCpuArchitectureInt> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        List<getCpuArchitectureInt> list2 = getappprocessinfo.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        List<getCpuArchitectureInt> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashLandingEmptyDisplay{emptyText='");
        sb.append(this.read);
        sb.append('\'');
        sb.append(", emptyDescription='");
        sb.append(this.IconCompatParcelizer);
        sb.append('\'');
        sb.append(", easycashLandingFooterDisplayList=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('}');
        return sb.toString();
    }
}
