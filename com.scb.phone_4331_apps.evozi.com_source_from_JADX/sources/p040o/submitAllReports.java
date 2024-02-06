package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.submitAllReports */
public final class submitAllReports implements Parcelable {
    public static final Parcelable.Creator CREATOR = new write();
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final boolean read;
    public final String write;

    /* renamed from: o.submitAllReports$write */
    public static final class write implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return new submitAllReports(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new submitAllReports[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof submitAllReports)) {
            return false;
        }
        submitAllReports submitallreports = (submitAllReports) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) submitallreports.IconCompatParcelizer) && this.read == submitallreports.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) submitallreports.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) submitallreports.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) submitallreports.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        boolean z = this.read;
        if (z) {
            z = true;
        }
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((((hashCode * 31) + (z ? 1 : 0)) * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlOutcomeRejectDisplay(backgroundUrl=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", showHealthSection=");
        sb.append(this.read);
        sb.append(", image=");
        sb.append(this.write);
        sb.append(", deeplink=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", reapplyDateTime=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeInt(this.read ? 1 : 0);
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public submitAllReports(String str, boolean z, String str2, String str3, String str4) {
        this.IconCompatParcelizer = str;
        this.read = z;
        this.write = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
    }
}
