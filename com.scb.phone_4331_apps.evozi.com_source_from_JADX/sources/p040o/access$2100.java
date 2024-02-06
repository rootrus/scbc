package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.access$2100 */
public final class access$2100 extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<access$2100> CREATOR = new Parcelable.Creator<access$2100>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new access$2100(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new access$2100[i];
        }
    };
    public String MediaBrowserCompat$ItemReceiver;

    public final int describeContents() {
        return 0;
    }

    public access$2100(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    protected access$2100(Parcel parcel) {
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.MediaBrowserCompat$ItemReceiver;
        String str2 = ((access$2100) obj).MediaBrowserCompat$ItemReceiver;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
