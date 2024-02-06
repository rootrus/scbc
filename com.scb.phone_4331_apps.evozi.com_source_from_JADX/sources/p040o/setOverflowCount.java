package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setOverflowCount */
public final class setOverflowCount implements Parcelable {
    public static final Parcelable.Creator CREATOR = new setOverflowCount$MediaBrowserCompat$ItemReceiver();
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setOverflowCount)) {
            return false;
        }
        setOverflowCount setoverflowcount = (setOverflowCount) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setoverflowcount.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setoverflowcount.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setoverflowcount.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setoverflowcount.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountFromDisplay(logo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", name=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", rawAccountNumber=");
        sb.append(this.read);
        sb.append(", maskedAccountNumber=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.write);
    }

    public setOverflowCount(String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) str2, "name");
        onGetStartedClick.write((Object) str3, "rawAccountNumber");
        onGetStartedClick.write((Object) str4, "maskedAccountNumber");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.read = str3;
        this.write = str4;
    }
}
