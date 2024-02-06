package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getCreateReportSpiCall */
public final class getCreateReportSpiCall implements Parcelable {
    public static final Parcelable.Creator CREATOR = new getCreateReportSpiCall$MediaBrowserCompat$ItemReceiver();
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCreateReportSpiCall)) {
            return false;
        }
        getCreateReportSpiCall getcreatereportspicall = (getCreateReportSpiCall) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getcreatereportspicall.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getcreatereportspicall.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlAboutDisplay(title=");
        sb.append(this.write);
        sb.append(", info=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public getCreateReportSpiCall(String str, String str2) {
        this.write = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }
}
