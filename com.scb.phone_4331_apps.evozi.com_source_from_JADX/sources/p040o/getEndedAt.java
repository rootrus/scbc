package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getEndedAt */
public final class getEndedAt extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator CREATOR = new getEndedAt$MediaBrowserCompat$ItemReceiver();
    public String MediaBrowserCompat$ItemReceiver;
    public String read;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
    }

    public getEndedAt(String str, String str2) {
        onGetStartedClick.write((Object) str, "application");
        onGetStartedClick.write((Object) str2, "icon");
        this.read = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }
}
