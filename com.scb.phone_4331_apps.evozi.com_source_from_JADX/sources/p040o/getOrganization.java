package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getOrganization */
public final class getOrganization implements Parcelable {
    public static final Parcelable.Creator CREATOR = new getOrganization$MediaBrowserCompat$CustomActionResultReceiver();
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getOrganization)) {
            return false;
        }
        getOrganization getorganization = (getOrganization) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getorganization.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getorganization.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getorganization.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountToDisplay(logo=");
        sb.append(this.read);
        sb.append(", name=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", promptPayID=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public getOrganization(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "logo");
        onGetStartedClick.write((Object) str2, "name");
        onGetStartedClick.write((Object) str3, "promptPayID");
        this.read = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
    }
}
