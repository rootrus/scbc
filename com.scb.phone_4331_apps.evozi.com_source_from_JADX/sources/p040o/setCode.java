package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.setCode */
public final class setCode implements Parcelable {
    public static final Parcelable.Creator CREATOR = new setCode$MediaBrowserCompat$ItemReceiver();
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final List<String> read;
    public final boolean write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setCode)) {
            return false;
        }
        setCode setcode = (setCode) obj;
        return this.write == setcode.write && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setcode.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setcode.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setcode.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        boolean z = this.write;
        if (z) {
            z = true;
        }
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        List<String> list = this.read;
        int hashCode2 = list != null ? list.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((z ? 1 : 0) * true) + hashCode) * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FieldDisplay(fieldFlag=");
        sb.append(this.write);
        sb.append(", label=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", length=");
        sb.append(this.read);
        sb.append(", defaultValue=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeInt(this.write ? 1 : 0);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeStringList(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public setCode(boolean z, String str, List<String> list, String str2) {
        this.write = z;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.read = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }

    public static /* synthetic */ setCode IconCompatParcelizer(setCode setcode, String str) {
        return new setCode(setcode.write, setcode.MediaBrowserCompat$ItemReceiver, setcode.read, str);
    }
}
