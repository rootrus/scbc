package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getCausedBy */
public final class getCausedBy implements Parcelable {
    public static final Parcelable.Creator CREATOR = new read();
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;

    /* renamed from: o.getCausedBy$read */
    public static final class read implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return new getCausedBy(parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new getCausedBy[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCausedBy)) {
            return false;
        }
        getCausedBy getcausedby = (getCausedBy) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getcausedby.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getcausedby.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
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
        sb.append("HistoryBillerDisplay(logo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", name=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.read);
    }

    public getCausedBy(String str, String str2) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.read = str2;
    }
}
