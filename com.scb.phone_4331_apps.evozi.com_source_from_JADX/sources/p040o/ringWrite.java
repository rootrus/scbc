package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.ringWrite */
public final class ringWrite implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ringWrite$MediaBrowserCompat$ItemReceiver();
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final List<String> MediaBrowserCompat$ItemReceiver;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ringWrite)) {
            return false;
        }
        ringWrite ringwrite = (ringWrite) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ringwrite.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ringwrite.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) ringwrite.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        List<String> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddressConfirmationDetailsDisplay(newAddressUsage=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", formattedAddresses=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", requestProduct=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeStringList(this.MediaBrowserCompat$ItemReceiver);
    }

    public ringWrite(String str, String str2, List<String> list) {
        onGetStartedClick.write((Object) str, "newAddressUsage");
        onGetStartedClick.write((Object) str2, "formattedAddresses");
        onGetStartedClick.write((Object) list, "requestProduct");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompat$ItemReceiver = list;
    }
}
