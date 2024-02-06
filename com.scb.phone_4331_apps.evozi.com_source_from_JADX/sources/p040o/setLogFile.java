package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setLogFile */
public final class setLogFile extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<setLogFile> CREATOR = new setLogFile$MediaBrowserCompat$ItemReceiver();
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$ItemReceiver;

    public final int describeContents() {
        return 0;
    }

    public setLogFile(String str, String str2) {
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public setLogFile(Parcel parcel) {
        this(parcel.readString(), parcel.readString());
        onGetStartedClick.write((Object) parcel, "source");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "dest");
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
    }
}
