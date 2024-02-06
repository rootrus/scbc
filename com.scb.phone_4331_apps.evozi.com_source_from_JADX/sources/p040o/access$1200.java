package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.access$1200 */
public final class access$1200 implements Parcelable {
    public static final Parcelable.Creator<access$1200> CREATOR = new Parcelable.Creator<access$1200>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new access$1200(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new access$1200[i];
        }
    };
    public boolean IconCompatParcelizer;
    public List<submit> MediaBrowserCompat$ItemReceiver;
    public CrashlyticsController read;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ access$1200(access$1200$MediaBrowserCompat$CustomActionResultReceiver access_1200_mediabrowsercompat_customactionresultreceiver, byte b) {
        this(access_1200_mediabrowsercompat_customactionresultreceiver);
    }

    private access$1200(access$1200$MediaBrowserCompat$CustomActionResultReceiver access_1200_mediabrowsercompat_customactionresultreceiver) {
        this.IconCompatParcelizer = access_1200_mediabrowsercompat_customactionresultreceiver.write;
        this.read = access_1200_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$ItemReceiver = access_1200_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
    }

    protected access$1200(Parcel parcel) {
        this.IconCompatParcelizer = parcel.readByte() != 0;
        this.read = (CrashlyticsController) parcel.readParcelable(CrashlyticsController.class.getClassLoader());
        this.MediaBrowserCompat$ItemReceiver = parcel.createTypedArrayList(submit.CREATOR);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.IconCompatParcelizer ? (byte) 1 : 0);
        parcel.writeParcelable(this.read, i);
        parcel.writeTypedList(this.MediaBrowserCompat$ItemReceiver);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        access$1200 access_1200 = (access$1200) obj;
        if (this.IconCompatParcelizer != access_1200.IconCompatParcelizer) {
            return false;
        }
        CrashlyticsController crashlyticsController = this.read;
        if (crashlyticsController == null ? access_1200.read != null : !crashlyticsController.equals(access_1200.read)) {
            return false;
        }
        List<submit> list = this.MediaBrowserCompat$ItemReceiver;
        List<submit> list2 = access_1200.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.IconCompatParcelizer;
        CrashlyticsController crashlyticsController = this.read;
        int i = 0;
        int hashCode = crashlyticsController != null ? crashlyticsController.hashCode() : 0;
        List<submit> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return ((((z ? 1 : 0) * true) + hashCode) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashSalesheetListDisplay{isEmpty=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", easycashSalesheetEmptyDisplay=");
        sb.append(this.read);
        sb.append(", easycashSalesheetDisplays=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('}');
        return sb.toString();
    }
}
