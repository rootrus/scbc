package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.usedBytes */
public final class usedBytes implements Parcelable {
    public static final Parcelable.Creator CREATOR = new usedBytes$MediaBrowserCompat$ItemReceiver();
    public final String read;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usedBytes)) {
            return false;
        }
        usedBytes usedbytes = (usedBytes) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) usedbytes.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) usedbytes.read);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddressGoodToKnow(imageUrl=");
        sb.append(this.write);
        sb.append(", description=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.write);
        parcel.writeString(this.read);
    }

    public usedBytes(String str, String str2) {
        onGetStartedClick.write((Object) str, "imageUrl");
        onGetStartedClick.write((Object) str2, "description");
        this.write = str;
        this.read = str2;
    }
}
