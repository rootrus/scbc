package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setReason */
public final class setReason implements Parcelable {
    public static final Parcelable.Creator CREATOR = new setReason$MediaBrowserCompat$CustomActionResultReceiver();
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setReason)) {
            return false;
        }
        setReason setreason = (setReason) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setreason.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setreason.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setreason.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setreason.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountToDisplay(logo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", name=");
        sb.append(this.read);
        sb.append(", accountNumber=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", accountAllDetails=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.write);
    }

    public setReason(String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) str2, "name");
        onGetStartedClick.write((Object) str3, "accountNumber");
        onGetStartedClick.write((Object) str4, "accountAllDetails");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = str2;
        this.IconCompatParcelizer = str3;
        this.write = str4;
    }
}
