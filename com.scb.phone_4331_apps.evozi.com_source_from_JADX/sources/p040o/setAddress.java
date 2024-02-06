package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.setAddress */
public final class setAddress implements Parcelable {
    public static final Parcelable.Creator CREATOR = new write();
    public final boolean MediaBrowserCompat$CustomActionResultReceiver;
    public final List<String> MediaBrowserCompat$ItemReceiver;
    public final String read;

    /* renamed from: o.setAddress$write */
    public static final class write implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return new setAddress(parcel.readInt() != 0, parcel.createStringArrayList(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new setAddress[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setAddress)) {
            return false;
        }
        setAddress setaddress = (setAddress) obj;
        return this.MediaBrowserCompat$CustomActionResultReceiver == setaddress.MediaBrowserCompat$CustomActionResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setaddress.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setaddress.read);
    }

    public final int hashCode() {
        boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (z) {
            z = true;
        }
        List<String> list = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        String str = this.read;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((z ? 1 : 0) * true) + hashCode) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FieldListDisplay(fieldFlag=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", listOfValue=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", defaultValue=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeInt(this.MediaBrowserCompat$CustomActionResultReceiver ? 1 : 0);
        parcel.writeStringList(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.read);
    }

    public setAddress(boolean z, List<String> list, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
        this.MediaBrowserCompat$ItemReceiver = list;
        this.read = str;
    }

    public static /* synthetic */ setAddress read(setAddress setaddress, String str) {
        return new setAddress(setaddress.MediaBrowserCompat$CustomActionResultReceiver, setaddress.MediaBrowserCompat$ItemReceiver, str);
    }
}
