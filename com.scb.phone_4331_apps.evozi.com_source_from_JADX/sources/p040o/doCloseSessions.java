package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.doCloseSessions */
public final class doCloseSessions implements Parcelable {
    public static final Parcelable.Creator CREATOR = new read();
    public int MediaBrowserCompat$CustomActionResultReceiver;
    public int MediaBrowserCompat$ItemReceiver;
    public String read;
    public String write;

    /* renamed from: o.doCloseSessions$read */
    public static final class read implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return new doCloseSessions(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new doCloseSessions[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeInt(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.write);
        parcel.writeInt(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public doCloseSessions(int i, String str, String str2, int i2) {
        onGetStartedClick.write((Object) str, "productName");
        onGetStartedClick.write((Object) str2, "productSalesSheet");
        this.MediaBrowserCompat$ItemReceiver = i;
        this.read = str;
        this.write = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = i2;
    }
}
