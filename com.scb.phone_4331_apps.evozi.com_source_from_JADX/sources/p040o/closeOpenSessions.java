package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.closeOpenSessions */
public final class closeOpenSessions implements Parcelable {
    public static final Parcelable.Creator CREATOR = new closeOpenSessions$MediaBrowserCompat$ItemReceiver();
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final List<closeWithoutRenamingOrLog> MediaBrowserCompat$ItemReceiver;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof closeOpenSessions)) {
            return false;
        }
        closeOpenSessions closeopensessions = (closeOpenSessions) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) closeopensessions.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) closeopensessions.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        List<closeWithoutRenamingOrLog> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LongDescListDisplay(header=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", items=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        List<closeWithoutRenamingOrLog> list = this.MediaBrowserCompat$ItemReceiver;
        parcel.writeInt(list.size());
        for (closeWithoutRenamingOrLog writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
    }

    public closeOpenSessions(String str, List<closeWithoutRenamingOrLog> list) {
        onGetStartedClick.write((Object) str, "header");
        onGetStartedClick.write((Object) list, "items");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = list;
    }
}
